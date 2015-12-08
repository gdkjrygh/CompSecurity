// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;


// Referenced classes of package com.yume.android.sdk:
//            M, E, g, YuMeSDKInterfaceImpl, 
//            ah, N, Z, aF, 
//            az, YuMeAdBlockType

final class aj
{

    private M a;
    private g b;

    public aj()
    {
        a = M.a();
    }

    private void c()
    {
        if (b == null)
        {
            E.e();
            return;
        }
        if (b.k)
        {
            b.g = YuMeSDKInterfaceImpl.j.a(b);
            boolean flag;
            if (b.g != null)
            {
                flag = true;
                a.b((new StringBuilder("Selected Image Url: ")).append(b.g).toString());
            } else
            {
                flag = false;
            }
        } else
        {
            flag = YuMeSDKInterfaceImpl.j.a(b, false);
        }
        if (!flag)
        {
            E.e();
            return;
        }
        if (!b.k && !b.i)
        {
            b.g = YuMeSDKInterfaceImpl.j.a(b.c);
            a.b((new StringBuilder("Selected Media Url: ")).append(b.g).toString());
        }
        b.h = false;
        N.a = b.l;
        E.c();
        YuMeSDKInterfaceImpl.l.a(b);
    }

    public final void a()
    {
        b = null;
        E.e();
    }

    public final void a(g g1)
    {
        b = g1;
        c();
    }

    public final void a(String s, YuMeAdBlockType yumeadblocktype)
    {
        if (YuMeSDKInterfaceImpl.m != null)
        {
            b = YuMeSDKInterfaceImpl.m.a(s);
            c();
        } else
        if (YuMeSDKInterfaceImpl.n != null)
        {
            YuMeSDKInterfaceImpl.n.d = false;
            YuMeSDKInterfaceImpl.n.a(s, true, yumeadblocktype);
            return;
        }
    }

    public final void b()
    {
        b = null;
    }
}
