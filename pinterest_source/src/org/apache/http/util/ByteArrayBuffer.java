// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.util;

import java.io.Serializable;

// Referenced classes of package org.apache.http.util:
//            CharArrayBuffer

public final class ByteArrayBuffer
    implements Serializable
{

    private static final long serialVersionUID = 0x3c7eae24203b8ca4L;
    private byte buffer[];
    private int len;

    public ByteArrayBuffer(int i)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException("Buffer capacity may not be negative");
        } else
        {
            buffer = new byte[i];
            return;
        }
    }

    private void expand(int i)
    {
        byte abyte0[] = new byte[Math.max(buffer.length << 1, i)];
        System.arraycopy(buffer, 0, abyte0, 0, len);
        buffer = abyte0;
    }

    public final void append(int i)
    {
        int j = len + 1;
        if (j > buffer.length)
        {
            expand(j);
        }
        buffer[len] = (byte)i;
        len = j;
    }

    public final void append(CharArrayBuffer chararraybuffer, int i, int j)
    {
        if (chararraybuffer == null)
        {
            return;
        } else
        {
            append(chararraybuffer.buffer(), i, j);
            return;
        }
    }

    public final void append(byte abyte0[], int i, int j)
    {
        if (abyte0 != null)
        {
            if (i < 0 || i > abyte0.length || j < 0 || i + j < 0 || i + j > abyte0.length)
            {
                throw new IndexOutOfBoundsException((new StringBuilder("off: ")).append(i).append(" len: ").append(j).append(" b.length: ").append(abyte0.length).toString());
            }
            if (j != 0)
            {
                int k = len + j;
                if (k > buffer.length)
                {
                    expand(k);
                }
                System.arraycopy(abyte0, i, buffer, len, j);
                len = k;
                return;
            }
        }
    }

    public final void append(char ac[], int i, int j)
    {
        if (ac != null)
        {
            if (i < 0 || i > ac.length || j < 0 || i + j < 0 || i + j > ac.length)
            {
                throw new IndexOutOfBoundsException((new StringBuilder("off: ")).append(i).append(" len: ").append(j).append(" b.length: ").append(ac.length).toString());
            }
            if (j != 0)
            {
                int l = len;
                int i1 = l + j;
                j = l;
                int k = i;
                if (i1 > buffer.length)
                {
                    expand(i1);
                    k = i;
                    j = l;
                }
                for (; j < i1; j++)
                {
                    buffer[j] = (byte)ac[k];
                    k++;
                }

                len = i1;
                return;
            }
        }
    }

    public final byte[] buffer()
    {
        return buffer;
    }

    public final int byteAt(int i)
    {
        return buffer[i];
    }

    public final int capacity()
    {
        return buffer.length;
    }

    public final void clear()
    {
        len = 0;
    }

    public final void ensureCapacity(int i)
    {
        while (i <= 0 || i <= buffer.length - len) 
        {
            return;
        }
        expand(len + i);
    }

    public final int indexOf(byte byte0)
    {
        return indexOf(byte0, 0, len);
    }

    public final int indexOf(byte byte0, int i, int j)
    {
        int k;
        k = i;
        if (i < 0)
        {
            k = 0;
        }
        i = j;
        if (j > len)
        {
            i = len;
        }
        if (k <= i)
        {
            break MISSING_BLOCK_LABEL_54;
        }
_L2:
        return -1;
_L4:
        j++;
_L5:
        if (j >= i) goto _L2; else goto _L1
_L1:
        if (buffer[j] != byte0) goto _L4; else goto _L3
_L3:
        return j;
        j = k;
          goto _L5
    }

    public final boolean isEmpty()
    {
        return len == 0;
    }

    public final boolean isFull()
    {
        return len == buffer.length;
    }

    public final int length()
    {
        return len;
    }

    public final void setLength(int i)
    {
        if (i < 0 || i > buffer.length)
        {
            throw new IndexOutOfBoundsException((new StringBuilder("len: ")).append(i).append(" < 0 or > buffer len: ").append(buffer.length).toString());
        } else
        {
            len = i;
            return;
        }
    }

    public final byte[] toByteArray()
    {
        byte abyte0[] = new byte[len];
        if (len > 0)
        {
            System.arraycopy(buffer, 0, abyte0, 0, len);
        }
        return abyte0;
    }
}
