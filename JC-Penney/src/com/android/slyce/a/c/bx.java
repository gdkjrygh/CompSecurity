// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c;

import com.android.slyce.a.a.a;
import com.android.slyce.a.ag;
import com.android.slyce.a.ah;
import com.android.slyce.a.aj;
import com.android.slyce.a.am;

// Referenced classes of package com.android.slyce.a.c:
//            bc, bw, bu, bt

class bx extends bc
{

    final bw f;

    bx(bw bw1, am am)
    {
        f = bw1;
        super(am);
    }

    protected void a(int i, String s)
    {
        bw.b(f).d();
    }

    protected void a(Exception exception)
    {
        if (f.c != null)
        {
            f.c.a(exception);
        }
    }

    protected void b(String s)
    {
        if (com.android.slyce.a.c.bw.a(f) != null)
        {
            com.android.slyce.a.c.bw.a(f).a(s);
        }
    }

    protected void b(byte abyte0[])
    {
        com.android.slyce.a.c.bw.a(f, new aj(abyte0));
    }

    protected void c(String s)
    {
        if (bw.c(f) != null)
        {
            bw.c(f).a(s);
        }
    }

    protected void c(byte abyte0[])
    {
        f.a.a(new aj(abyte0));
    }
}
