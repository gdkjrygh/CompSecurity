// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.a.a.a;

import java.io.OutputStream;

// Referenced classes of package com.facebook.http.a.a.a:
//            d

class e extends OutputStream
{

    int a;

    private e()
    {
        a = 0;
    }

    e(d d)
    {
        this();
    }

    public void write(int i)
    {
        a = a + 1;
    }

    public void write(byte abyte0[])
    {
        a = a + abyte0.length;
    }

    public void write(byte abyte0[], int i, int j)
    {
        a = a + j;
    }
}
