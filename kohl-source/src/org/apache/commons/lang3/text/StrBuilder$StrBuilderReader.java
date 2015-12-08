// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.text;

import java.io.Reader;

// Referenced classes of package org.apache.commons.lang3.text:
//            StrBuilder

class this._cls0 extends Reader
{

    private int mark;
    private int pos;
    final StrBuilder this$0;

    public void close()
    {
    }

    public void mark(int i)
    {
        mark = pos;
    }

    public boolean markSupported()
    {
        return true;
    }

    public int read()
    {
        if (!ready())
        {
            return -1;
        } else
        {
            StrBuilder strbuilder = StrBuilder.this;
            int i = pos;
            pos = i + 1;
            return strbuilder.charAt(i);
        }
    }

    public int read(char ac[], int i, int j)
    {
        if (i < 0 || j < 0 || i > ac.length || i + j > ac.length || i + j < 0)
        {
            throw new IndexOutOfBoundsException();
        }
        if (j == 0)
        {
            return 0;
        }
        if (pos >= size())
        {
            return -1;
        }
        int k = j;
        if (pos + j > size())
        {
            k = size() - pos;
        }
        getChars(pos, pos + k, ac, i);
        pos = pos + k;
        return k;
    }

    public boolean ready()
    {
        return pos < size();
    }

    public void reset()
    {
        pos = mark;
    }

    public long skip(long l)
    {
        long l1 = l;
        if ((long)pos + l > (long)size())
        {
            l1 = size() - pos;
        }
        if (l1 < 0L)
        {
            return 0L;
        } else
        {
            pos = (int)((long)pos + l1);
            return l1;
        }
    }

    ()
    {
        this$0 = StrBuilder.this;
        super();
    }
}
