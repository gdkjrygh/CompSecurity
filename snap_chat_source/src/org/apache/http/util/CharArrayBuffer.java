// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.util;

import java.io.Serializable;
import org.apache.http.protocol.HTTP;

// Referenced classes of package org.apache.http.util:
//            Args

public final class CharArrayBuffer
    implements Serializable
{

    private char buffer[];
    private int len;

    public CharArrayBuffer(int i)
    {
        Args.notNegative(i, "Buffer capacity");
        buffer = new char[i];
    }

    private void expand(int i)
    {
        char ac[] = new char[Math.max(buffer.length << 1, i)];
        System.arraycopy(buffer, 0, ac, 0, len);
        buffer = ac;
    }

    public final void append(char c)
    {
        int i = len + 1;
        if (i > buffer.length)
        {
            expand(i);
        }
        buffer[len] = c;
        len = i;
    }

    public final void append(String s)
    {
        int i;
        int j;
        if (s == null)
        {
            s = "null";
        }
        i = s.length();
        j = len + i;
        if (j > buffer.length)
        {
            expand(j);
        }
        s.getChars(0, i, buffer, len);
        len = j;
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
                int k = len + j;
                if (k > buffer.length)
                {
                    expand(k);
                }
                System.arraycopy(ac, i, buffer, len, j);
                len = k;
                return;
            }
        }
    }

    public final char charAt(int i)
    {
        return buffer[i];
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

    public final int indexOf(int i)
    {
        return indexOf(i, 0, len);
    }

    public final int indexOf(int i, int j, int k)
    {
        int l = j;
        if (j < 0)
        {
            l = 0;
        }
        j = k;
        if (k > len)
        {
            j = len;
        }
        if (l <= j)
        {
            while (l < j) 
            {
                if (buffer[l] == i)
                {
                    return l;
                }
                l++;
            }
        }
        return -1;
    }

    public final int length()
    {
        return len;
    }

    public final String substring(int i, int j)
    {
        return new String(buffer, i, j - i);
    }

    public final String substringTrimmed(int i, int j)
    {
        if (i < 0)
        {
            throw new IndexOutOfBoundsException((new StringBuilder("Negative beginIndex: ")).append(i).toString());
        }
        if (j > len)
        {
            throw new IndexOutOfBoundsException((new StringBuilder("endIndex: ")).append(j).append(" > length: ").append(len).toString());
        }
        int k = i;
        if (i > j)
        {
            throw new IndexOutOfBoundsException((new StringBuilder("beginIndex: ")).append(i).append(" > endIndex: ").append(j).toString());
        }
        do
        {
            i = j;
            if (k >= j)
            {
                break;
            }
            i = j;
            if (!HTTP.isWhitespace(buffer[k]))
            {
                break;
            }
            k++;
        } while (true);
        for (; i > k && HTTP.isWhitespace(buffer[i - 1]); i--) { }
        return new String(buffer, k, i - k);
    }

    public final String toString()
    {
        return new String(buffer, 0, len);
    }
}
