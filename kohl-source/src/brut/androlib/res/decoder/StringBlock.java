// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package brut.androlib.res.decoder;

import brut.util.ExtDataInput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StringBlock
{

    private static final Logger LOGGER = Logger.getLogger(brut/androlib/res/decoder/StringBlock.getName());
    private static final CharsetDecoder UTF16LE_DECODER = Charset.forName("UTF-16LE").newDecoder();
    private static final CharsetDecoder UTF8_DECODER = Charset.forName("UTF-8").newDecoder();
    private boolean m_isUTF8;
    private int m_stringOffsets[];
    private byte m_strings[];
    private int m_styleOffsets[];
    private int m_styles[];

    private StringBlock()
    {
    }

    private String decodeString(int i, int j)
    {
        try
        {
            CharsetDecoder charsetdecoder;
            if (m_isUTF8)
            {
                charsetdecoder = UTF8_DECODER;
            } else
            {
                charsetdecoder = UTF16LE_DECODER;
            }
            return charsetdecoder.decode(ByteBuffer.wrap(m_strings, i, j)).toString();
        }
        catch (CharacterCodingException charactercodingexception)
        {
            LOGGER.log(Level.WARNING, null, charactercodingexception);
        }
        return null;
    }

    private static final int getShort(byte abyte0[], int i)
    {
        return (abyte0[i + 1] & 0xff) << 8 | abyte0[i] & 0xff;
    }

    private static final int[] getVarint(byte abyte0[], int i)
    {
        int j = abyte0[i];
        boolean flag;
        if ((j & 0x80) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j &= 0x7f;
        if (!flag)
        {
            return (new int[] {
                j, 1
            });
        } else
        {
            return (new int[] {
                j << 8 | abyte0[i + 1] & 0xff, 2
            });
        }
    }

    public static StringBlock read(ExtDataInput extdatainput)
        throws IOException
    {
        extdatainput.skipCheckInt(0x1c0001);
        int k = extdatainput.readInt();
        int i = extdatainput.readInt();
        int j1 = extdatainput.readInt();
        int k1 = extdatainput.readInt();
        int i1 = extdatainput.readInt();
        int l = extdatainput.readInt();
        StringBlock stringblock = new StringBlock();
        boolean flag;
        if ((k1 & 0x100) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        stringblock.m_isUTF8 = flag;
        stringblock.m_stringOffsets = extdatainput.readIntArray(i);
        if (j1 != 0)
        {
            stringblock.m_styleOffsets = extdatainput.readIntArray(j1);
        }
        if (l == 0)
        {
            i = k;
        } else
        {
            i = l;
        }
        i -= i1;
        if (i % 4 != 0)
        {
            throw new IOException((new StringBuilder()).append("String data size is not multiple of 4 (").append(i).append(").").toString());
        }
        stringblock.m_strings = new byte[i];
        extdatainput.readFully(stringblock.m_strings);
        if (l != 0)
        {
            int j = k - l;
            if (j % 4 != 0)
            {
                throw new IOException((new StringBuilder()).append("Style data size is not multiple of 4 (").append(j).append(").").toString());
            }
            stringblock.m_styles = extdatainput.readIntArray(j / 4);
        }
        return stringblock;
    }

    public int find(String s)
    {
        int i;
        if (s == null)
        {
            return -1;
        }
        i = 0;
_L2:
        int k;
        int l;
        if (i == m_stringOffsets.length)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        k = m_stringOffsets[i];
        l = getShort(m_strings, k);
        if (l == s.length())
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        int j = 0;
_L5:
        if (j == l)
        {
            continue; /* Loop/switch isn't completed */
        }
        k += 2;
        if (s.charAt(j) == getShort(m_strings, k))
        {
            break MISSING_BLOCK_LABEL_91;
        }
        if (j != l) goto _L4; else goto _L3
_L3:
        return i;
        j++;
          goto _L5
        return -1;
    }

    public String getString(int i)
    {
        if (i < 0 || m_stringOffsets == null || i >= m_stringOffsets.length)
        {
            return null;
        }
        int j = m_stringOffsets[i];
        if (!m_isUTF8)
        {
            i = getShort(m_strings, j) * 2;
            j += 2;
        } else
        {
            i = getVarint(m_strings, j)[1] + j;
            int ai[] = getVarint(m_strings, i);
            j = ai[1] + i;
            i = ai[0];
        }
        return decodeString(j, i);
    }

}
