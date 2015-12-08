// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.text;

import java.io.Writer;

// Referenced classes of package org.apache.commons.lang3.text:
//            StrBuilder

class this._cls0 extends Writer
{

    final StrBuilder this$0;

    public void close()
    {
    }

    public void flush()
    {
    }

    public void write(int i)
    {
        append((char)i);
    }

    public void write(String s)
    {
        append(s);
    }

    public void write(String s, int i, int j)
    {
        append(s, i, j);
    }

    public void write(char ac[])
    {
        append(ac);
    }

    public void write(char ac[], int i, int j)
    {
        append(ac, i, j);
    }

    ()
    {
        this$0 = StrBuilder.this;
        super();
    }
}
