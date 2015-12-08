// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.pattern.parser;

import fs.ch.qos.logback.core.pattern.util.IEscapeUtil;
import fs.ch.qos.logback.core.pattern.util.RestrictedEscapeUtil;
import fs.ch.qos.logback.core.spi.ScanException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package fs.ch.qos.logback.core.pattern.parser:
//            Token, OptionTokenizer

class TokenStream
{
    static final class TokenizerState extends Enum
    {

        private static final TokenizerState $VALUES[];
        public static final TokenizerState FORMAT_MODIFIER_STATE;
        public static final TokenizerState KEYWORD_STATE;
        public static final TokenizerState LITERAL_STATE;
        public static final TokenizerState OPTION_STATE;
        public static final TokenizerState RIGHT_PARENTHESIS_STATE;

        public static TokenizerState valueOf(String s)
        {
            return (TokenizerState)Enum.valueOf(fs/ch/qos/logback/core/pattern/parser/TokenStream$TokenizerState, s);
        }

        public static TokenizerState[] values()
        {
            return (TokenizerState[])$VALUES.clone();
        }

        static 
        {
            LITERAL_STATE = new TokenizerState("LITERAL_STATE", 0);
            FORMAT_MODIFIER_STATE = new TokenizerState("FORMAT_MODIFIER_STATE", 1);
            KEYWORD_STATE = new TokenizerState("KEYWORD_STATE", 2);
            OPTION_STATE = new TokenizerState("OPTION_STATE", 3);
            RIGHT_PARENTHESIS_STATE = new TokenizerState("RIGHT_PARENTHESIS_STATE", 4);
            $VALUES = (new TokenizerState[] {
                LITERAL_STATE, FORMAT_MODIFIER_STATE, KEYWORD_STATE, OPTION_STATE, RIGHT_PARENTHESIS_STATE
            });
        }

        private TokenizerState(String s, int i)
        {
            super(s, i);
        }
    }


    final IEscapeUtil escapeUtil;
    final IEscapeUtil optionEscapeUtil = new RestrictedEscapeUtil();
    final String pattern;
    final int patternLength;
    int pointer;
    TokenizerState state;

    TokenStream(String s, IEscapeUtil iescapeutil)
    {
        state = TokenizerState.LITERAL_STATE;
        pointer = 0;
        if (s == null || s.length() == 0)
        {
            throw new IllegalArgumentException("null or empty pattern string not allowed");
        } else
        {
            pattern = s;
            patternLength = s.length();
            escapeUtil = iescapeutil;
            return;
        }
    }

    private void addValuedToken(int i, StringBuffer stringbuffer, List list)
    {
        if (stringbuffer.length() > 0)
        {
            list.add(new Token(i, stringbuffer.toString()));
            stringbuffer.setLength(0);
        }
    }

    private void handleFormatModifierState(char c, List list, StringBuffer stringbuffer)
    {
        if (c == '(')
        {
            addValuedToken(1002, stringbuffer, list);
            list.add(Token.BARE_COMPOSITE_KEYWORD_TOKEN);
            state = TokenizerState.LITERAL_STATE;
            return;
        }
        if (Character.isJavaIdentifierStart(c))
        {
            addValuedToken(1002, stringbuffer, list);
            state = TokenizerState.KEYWORD_STATE;
            stringbuffer.append(c);
            return;
        } else
        {
            stringbuffer.append(c);
            return;
        }
    }

    private void handleKeywordState(char c, List list, StringBuffer stringbuffer)
    {
        if (Character.isJavaIdentifierPart(c))
        {
            stringbuffer.append(c);
            return;
        }
        if (c == '{')
        {
            addValuedToken(1004, stringbuffer, list);
            state = TokenizerState.OPTION_STATE;
            return;
        }
        if (c == '(')
        {
            addValuedToken(1005, stringbuffer, list);
            state = TokenizerState.LITERAL_STATE;
            return;
        }
        if (c == '%')
        {
            addValuedToken(1004, stringbuffer, list);
            list.add(Token.PERCENT_TOKEN);
            state = TokenizerState.FORMAT_MODIFIER_STATE;
            return;
        }
        if (c == ')')
        {
            addValuedToken(1004, stringbuffer, list);
            state = TokenizerState.RIGHT_PARENTHESIS_STATE;
            return;
        }
        addValuedToken(1004, stringbuffer, list);
        if (c == '\\')
        {
            if (pointer < patternLength)
            {
                list = pattern;
                int i = pointer;
                pointer = i + 1;
                c = list.charAt(i);
                escapeUtil.escape("%()", stringbuffer, c, pointer);
            }
        } else
        {
            stringbuffer.append(c);
        }
        state = TokenizerState.LITERAL_STATE;
    }

    private void handleLiteralState(char c, List list, StringBuffer stringbuffer)
    {
        switch (c)
        {
        default:
            stringbuffer.append(c);
            return;

        case 92: // '\\'
            escape("%()", stringbuffer);
            return;

        case 37: // '%'
            addValuedToken(1000, stringbuffer, list);
            list.add(Token.PERCENT_TOKEN);
            state = TokenizerState.FORMAT_MODIFIER_STATE;
            return;

        case 41: // ')'
            addValuedToken(1000, stringbuffer, list);
            state = TokenizerState.RIGHT_PARENTHESIS_STATE;
            return;
        }
    }

    private void handleRightParenthesisState(char c, List list, StringBuffer stringbuffer)
    {
        list.add(Token.RIGHT_PARENTHESIS_TOKEN);
        switch (c)
        {
        default:
            stringbuffer.append(c);
            state = TokenizerState.LITERAL_STATE;
            // fall through

        case 41: // ')'
            return;

        case 123: // '{'
            state = TokenizerState.OPTION_STATE;
            return;

        case 92: // '\\'
            escape("%{}", stringbuffer);
            state = TokenizerState.LITERAL_STATE;
            return;
        }
    }

    private void processOption(char c, List list, StringBuffer stringbuffer)
        throws ScanException
    {
        (new OptionTokenizer(this)).tokenize(c, list);
    }

    void escape(String s, StringBuffer stringbuffer)
    {
        if (pointer < patternLength)
        {
            String s1 = pattern;
            int i = pointer;
            pointer = i + 1;
            char c = s1.charAt(i);
            escapeUtil.escape(s, stringbuffer, c, pointer);
        }
    }

    List tokenize()
        throws ScanException
    {
        ArrayList arraylist = new ArrayList();
        StringBuffer stringbuffer = new StringBuffer();
        static class _cls1
        {

            static final int $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[];

            static 
            {
                $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState = new int[TokenizerState.values().length];
                try
                {
                    $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[TokenizerState.LITERAL_STATE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[TokenizerState.FORMAT_MODIFIER_STATE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[TokenizerState.OPTION_STATE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[TokenizerState.KEYWORD_STATE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[TokenizerState.RIGHT_PARENTHESIS_STATE.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        do
        {
            if (pointer < patternLength)
            {
                char c = pattern.charAt(pointer);
                pointer = pointer + 1;
                switch (_cls1..SwitchMap.ch.qos.logback.core.pattern.parser.TokenStream.TokenizerState[state.ordinal()])
                {
                case 1: // '\001'
                    handleLiteralState(c, arraylist, stringbuffer);
                    break;

                case 2: // '\002'
                    handleFormatModifierState(c, arraylist, stringbuffer);
                    break;

                case 3: // '\003'
                    processOption(c, arraylist, stringbuffer);
                    break;

                case 4: // '\004'
                    handleKeywordState(c, arraylist, stringbuffer);
                    break;

                case 5: // '\005'
                    handleRightParenthesisState(c, arraylist, stringbuffer);
                    break;
                }
            } else
            {
                switch (_cls1..SwitchMap.ch.qos.logback.core.pattern.parser.TokenStream.TokenizerState[state.ordinal()])
                {
                default:
                    return arraylist;

                case 1: // '\001'
                    addValuedToken(1000, stringbuffer, arraylist);
                    return arraylist;

                case 4: // '\004'
                    arraylist.add(new Token(1004, stringbuffer.toString()));
                    return arraylist;

                case 5: // '\005'
                    arraylist.add(Token.RIGHT_PARENTHESIS_TOKEN);
                    return arraylist;

                case 2: // '\002'
                case 3: // '\003'
                    throw new ScanException("Unexpected end of pattern string");
                }
            }
        } while (true);
    }
}
