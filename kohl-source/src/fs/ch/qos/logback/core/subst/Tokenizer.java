// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.subst;

import fs.ch.qos.logback.core.spi.ScanException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package fs.ch.qos.logback.core.subst:
//            Token

public class Tokenizer
{
    static final class TokenizerState extends Enum
    {

        private static final TokenizerState $VALUES[];
        public static final TokenizerState DEFAULT_VAL_STATE;
        public static final TokenizerState LITERAL_STATE;
        public static final TokenizerState START_STATE;

        public static TokenizerState valueOf(String s)
        {
            return (TokenizerState)Enum.valueOf(fs/ch/qos/logback/core/subst/Tokenizer$TokenizerState, s);
        }

        public static TokenizerState[] values()
        {
            return (TokenizerState[])$VALUES.clone();
        }

        static 
        {
            LITERAL_STATE = new TokenizerState("LITERAL_STATE", 0);
            START_STATE = new TokenizerState("START_STATE", 1);
            DEFAULT_VAL_STATE = new TokenizerState("DEFAULT_VAL_STATE", 2);
            $VALUES = (new TokenizerState[] {
                LITERAL_STATE, START_STATE, DEFAULT_VAL_STATE
            });
        }

        private TokenizerState(String s, int i)
        {
            super(s, i);
        }
    }


    final String pattern;
    final int patternLength;
    int pointer;
    TokenizerState state;

    public Tokenizer(String s)
    {
        state = TokenizerState.LITERAL_STATE;
        pointer = 0;
        pattern = s;
        patternLength = s.length();
    }

    private void addLiteralToken(List list, StringBuilder stringbuilder)
    {
        if (stringbuilder.length() == 0)
        {
            return;
        } else
        {
            list.add(new Token(Token.Type.LITERAL, stringbuilder.toString()));
            return;
        }
    }

    private void handleDefaultValueState(char c, List list, StringBuilder stringbuilder)
    {
        switch (c)
        {
        default:
            stringbuilder.append(':').append(c);
            state = TokenizerState.LITERAL_STATE;
            return;

        case 45: // '-'
            list.add(Token.DEFAULT_SEP_TOKEN);
            state = TokenizerState.LITERAL_STATE;
            return;

        case 36: // '$'
            stringbuilder.append(':');
            addLiteralToken(list, stringbuilder);
            stringbuilder.setLength(0);
            state = TokenizerState.START_STATE;
            return;
        }
    }

    private void handleLiteralState(char c, List list, StringBuilder stringbuilder)
    {
        if (c == '$')
        {
            addLiteralToken(list, stringbuilder);
            stringbuilder.setLength(0);
            state = TokenizerState.START_STATE;
            return;
        }
        if (c == ':')
        {
            addLiteralToken(list, stringbuilder);
            stringbuilder.setLength(0);
            state = TokenizerState.DEFAULT_VAL_STATE;
            return;
        }
        if (c == '{')
        {
            addLiteralToken(list, stringbuilder);
            list.add(Token.CURLY_LEFT_TOKEN);
            stringbuilder.setLength(0);
            return;
        }
        if (c == '}')
        {
            addLiteralToken(list, stringbuilder);
            list.add(Token.CURLY_RIGHT_TOKEN);
            stringbuilder.setLength(0);
            return;
        } else
        {
            stringbuilder.append(c);
            return;
        }
    }

    private void handleStartState(char c, List list, StringBuilder stringbuilder)
    {
        if (c == '{')
        {
            list.add(Token.START_TOKEN);
        } else
        {
            stringbuilder.append('$').append(c);
        }
        state = TokenizerState.LITERAL_STATE;
    }

    List tokenize()
        throws ScanException
    {
        ArrayList arraylist = new ArrayList();
        StringBuilder stringbuilder = new StringBuilder();
        static class _cls1
        {

            static final int $SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState[];

            static 
            {
                $SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState = new int[TokenizerState.values().length];
                try
                {
                    $SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState[TokenizerState.LITERAL_STATE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState[TokenizerState.START_STATE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState[TokenizerState.DEFAULT_VAL_STATE.ordinal()] = 3;
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
                switch (_cls1..SwitchMap.ch.qos.logback.core.subst.Tokenizer.TokenizerState[state.ordinal()])
                {
                case 1: // '\001'
                    handleLiteralState(c, arraylist, stringbuilder);
                    break;

                case 2: // '\002'
                    handleStartState(c, arraylist, stringbuilder);
                    break;

                case 3: // '\003'
                    handleDefaultValueState(c, arraylist, stringbuilder);
                    break;
                }
            } else
            {
                switch (_cls1..SwitchMap.ch.qos.logback.core.subst.Tokenizer.TokenizerState[state.ordinal()])
                {
                default:
                    return arraylist;

                case 1: // '\001'
                    addLiteralToken(arraylist, stringbuilder);
                    return arraylist;

                case 2: // '\002'
                    throw new ScanException("Unexpected end of pattern string");
                }
            }
        } while (true);
    }
}
