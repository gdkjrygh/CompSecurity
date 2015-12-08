// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.pattern.parser;

import fs.ch.qos.logback.core.pattern.util.AsIsEscapeUtil;
import fs.ch.qos.logback.core.pattern.util.IEscapeUtil;
import fs.ch.qos.logback.core.spi.ScanException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package fs.ch.qos.logback.core.pattern.parser:
//            TokenStream, Token

public class OptionTokenizer
{

    final IEscapeUtil escapeUtil;
    final String pattern;
    final int patternLength;
    char quoteChar;
    int state;
    final TokenStream tokenStream;

    OptionTokenizer(TokenStream tokenstream)
    {
        this(tokenstream, ((IEscapeUtil) (new AsIsEscapeUtil())));
    }

    OptionTokenizer(TokenStream tokenstream, IEscapeUtil iescapeutil)
    {
        state = 0;
        tokenStream = tokenstream;
        pattern = tokenstream.pattern;
        patternLength = tokenstream.patternLength;
        escapeUtil = iescapeutil;
    }

    void emitOptionToken(List list, List list1)
    {
        list.add(new Token(1006, list1));
        tokenStream.state = TokenStream.TokenizerState.LITERAL_STATE;
    }

    void escape(String s, StringBuffer stringbuffer)
    {
        if (tokenStream.pointer < patternLength)
        {
            String s1 = pattern;
            TokenStream tokenstream = tokenStream;
            int i = tokenstream.pointer;
            tokenstream.pointer = i + 1;
            char c = s1.charAt(i);
            escapeUtil.escape(s, stringbuffer, c, tokenStream.pointer);
        }
    }

    void tokenize(char c, List list)
        throws ScanException
    {
        StringBuffer stringbuffer;
        ArrayList arraylist;
        stringbuffer = new StringBuffer();
        arraylist = new ArrayList();
_L6:
        if (tokenStream.pointer >= patternLength)
        {
            break MISSING_BLOCK_LABEL_359;
        }
        state;
        JVM INSTR tableswitch 0 2: default 60
    //                   0 96
    //                   1 207
    //                   2 296;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_296;
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L7:
        c = pattern.charAt(tokenStream.pointer);
        TokenStream tokenstream = tokenStream;
        tokenstream.pointer = tokenstream.pointer + 1;
        if (true) goto _L6; else goto _L5
_L5:
        switch (c)
        {
        default:
            stringbuffer.append(c);
            state = 1;
            break;

        case 34: // '"'
        case 39: // '\''
            state = 2;
            quoteChar = c;
            break;

        case 125: // '}'
            emitOptionToken(list, arraylist);
            return;

        case 9: // '\t'
        case 10: // '\n'
        case 13: // '\r'
        case 32: // ' '
        case 44: // ','
            break;
        }
          goto _L7
_L3:
        switch (c)
        {
        default:
            stringbuffer.append(c);
            break;

        case 44: // ','
            arraylist.add(stringbuffer.toString().trim());
            stringbuffer.setLength(0);
            state = 0;
            break;

        case 125: // '}'
            arraylist.add(stringbuffer.toString().trim());
            emitOptionToken(list, arraylist);
            return;
        }
          goto _L7
        if (c == quoteChar)
        {
            arraylist.add(stringbuffer.toString());
            stringbuffer.setLength(0);
            state = 0;
        } else
        if (c == '\\')
        {
            escape(String.valueOf(quoteChar), stringbuffer);
        } else
        {
            stringbuffer.append(c);
        }
          goto _L7
        if (c == '}')
        {
            if (state == 0)
            {
                emitOptionToken(list, arraylist);
                return;
            }
            if (state == 1)
            {
                arraylist.add(stringbuffer.toString().trim());
                emitOptionToken(list, arraylist);
                return;
            } else
            {
                throw new ScanException("Unexpected end of pattern string in OptionTokenizer");
            }
        } else
        {
            throw new ScanException("Unexpected end of pattern string in OptionTokenizer");
        }
    }
}
