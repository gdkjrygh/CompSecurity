// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.binary;

import java.util.Arrays;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

// Referenced classes of package org.apache.commons.codec.binary:
//            StringUtils

public abstract class BaseNCodec
    implements BinaryEncoder, BinaryDecoder
{
    static class Context
    {

        byte buffer[];
        int currentLinePos;
        boolean eof;
        int ibitWorkArea;
        long lbitWorkArea;
        int modulus;
        int pos;
        int readPos;

        public String toString()
        {
            return String.format("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", new Object[] {
                getClass().getSimpleName(), Arrays.toString(buffer), Integer.valueOf(currentLinePos), Boolean.valueOf(eof), Integer.valueOf(ibitWorkArea), Long.valueOf(lbitWorkArea), Integer.valueOf(modulus), Integer.valueOf(pos), Integer.valueOf(readPos)
            });
        }

        Context()
        {
        }
    }


    private static final int DEFAULT_BUFFER_RESIZE_FACTOR = 2;
    private static final int DEFAULT_BUFFER_SIZE = 8192;
    static final int EOF = -1;
    protected static final int MASK_8BITS = 255;
    public static final int MIME_CHUNK_SIZE = 76;
    protected static final byte PAD_DEFAULT = 61;
    public static final int PEM_CHUNK_SIZE = 64;
    protected final byte PAD = 61;
    private final int chunkSeparatorLength;
    private final int encodedBlockSize;
    protected final int lineLength;
    private final int unencodedBlockSize;

    protected BaseNCodec(int i, int j, int k, int l)
    {
        int i1 = 0;
        super();
        unencodedBlockSize = i;
        encodedBlockSize = j;
        if (k > 0 && l > 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            i1 = (k / j) * j;
        }
        lineLength = i1;
        chunkSeparatorLength = l;
    }

    protected static boolean isWhiteSpace(byte byte0)
    {
        switch (byte0)
        {
        default:
            return false;

        case 9: // '\t'
        case 10: // '\n'
        case 13: // '\r'
        case 32: // ' '
            return true;
        }
    }

    private byte[] resizeBuffer(Context context)
    {
        if (context.buffer == null)
        {
            context.buffer = new byte[getDefaultBufferSize()];
            context.pos = 0;
            context.readPos = 0;
        } else
        {
            byte abyte0[] = new byte[context.buffer.length * 2];
            System.arraycopy(context.buffer, 0, abyte0, 0, context.buffer.length);
            context.buffer = abyte0;
        }
        return context.buffer;
    }

    int available(Context context)
    {
        if (context.buffer != null)
        {
            return context.pos - context.readPos;
        } else
        {
            return 0;
        }
    }

    protected boolean containsAlphabetOrPad(byte abyte0[])
    {
        if (abyte0 != null)
        {
            int j = abyte0.length;
            int i = 0;
            while (i < j) 
            {
                byte byte0 = abyte0[i];
                if (61 == byte0 || isInAlphabet(byte0))
                {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public Object decode(Object obj)
        throws DecoderException
    {
        if (obj instanceof byte[])
        {
            return decode((byte[])(byte[])obj);
        }
        if (obj instanceof String)
        {
            return decode((String)obj);
        } else
        {
            throw new DecoderException("Parameter supplied to Base-N decode is not a byte[] or a String");
        }
    }

    abstract void decode(byte abyte0[], int i, int j, Context context);

    public byte[] decode(String s)
    {
        return decode(StringUtils.getBytesUtf8(s));
    }

    public byte[] decode(byte abyte0[])
    {
        if (abyte0 == null || abyte0.length == 0)
        {
            return abyte0;
        } else
        {
            Context context = new Context();
            decode(abyte0, 0, abyte0.length, context);
            decode(abyte0, 0, -1, context);
            abyte0 = new byte[context.pos];
            readResults(abyte0, 0, abyte0.length, context);
            return abyte0;
        }
    }

    public Object encode(Object obj)
        throws EncoderException
    {
        if (!(obj instanceof byte[]))
        {
            throw new EncoderException("Parameter supplied to Base-N encode is not a byte[]");
        } else
        {
            return encode((byte[])(byte[])obj);
        }
    }

    abstract void encode(byte abyte0[], int i, int j, Context context);

    public byte[] encode(byte abyte0[])
    {
        if (abyte0 == null || abyte0.length == 0)
        {
            return abyte0;
        } else
        {
            Context context = new Context();
            encode(abyte0, 0, abyte0.length, context);
            encode(abyte0, 0, -1, context);
            abyte0 = new byte[context.pos - context.readPos];
            readResults(abyte0, 0, abyte0.length, context);
            return abyte0;
        }
    }

    public String encodeAsString(byte abyte0[])
    {
        return StringUtils.newStringUtf8(encode(abyte0));
    }

    public String encodeToString(byte abyte0[])
    {
        return StringUtils.newStringUtf8(encode(abyte0));
    }

    protected byte[] ensureBufferSize(int i, Context context)
    {
        if (context.buffer == null || context.buffer.length < context.pos + i)
        {
            return resizeBuffer(context);
        } else
        {
            return context.buffer;
        }
    }

    protected int getDefaultBufferSize()
    {
        return 8192;
    }

    public long getEncodedLength(byte abyte0[])
    {
        long l1 = (long)(((abyte0.length + unencodedBlockSize) - 1) / unencodedBlockSize) * (long)encodedBlockSize;
        long l = l1;
        if (lineLength > 0)
        {
            l = l1 + ((((long)lineLength + l1) - 1L) / (long)lineLength) * (long)chunkSeparatorLength;
        }
        return l;
    }

    boolean hasData(Context context)
    {
        return context.buffer != null;
    }

    protected abstract boolean isInAlphabet(byte byte0);

    public boolean isInAlphabet(String s)
    {
        return isInAlphabet(StringUtils.getBytesUtf8(s), true);
    }

    public boolean isInAlphabet(byte abyte0[], boolean flag)
    {
        for (int i = 0; i < abyte0.length; i++)
        {
            if (!isInAlphabet(abyte0[i]) && (!flag || abyte0[i] != 61 && !isWhiteSpace(abyte0[i])))
            {
                return false;
            }
        }

        return true;
    }

    int readResults(byte abyte0[], int i, int j, Context context)
    {
        if (context.buffer != null)
        {
            j = Math.min(available(context), j);
            System.arraycopy(context.buffer, context.readPos, abyte0, i, j);
            context.readPos = context.readPos + j;
            if (context.readPos >= context.pos)
            {
                context.buffer = null;
            }
            return j;
        }
        if (context.eof)
        {
            i = -1;
        } else
        {
            i = 0;
        }
        return i;
    }
}
