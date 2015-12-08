// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.RelativeLayout;

final class kxw
    implements Runnable
{

    private kxv a;

    kxw(kxv kxv1)
    {
        a = kxv1;
        super();
    }

    public final void run()
    {
        a.a.r();
        jov jov1 = a.a.g();
        if (jov1 != null)
        {
            jov1.j.removeView(jov1.f);
            jov1.a(true);
        }
        if (kxv.d(a) != null)
        {
            kxv.d(a);
            kxv.a(a, null);
        }
    }
}
