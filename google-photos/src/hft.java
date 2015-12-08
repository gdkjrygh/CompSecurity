// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public class hft
    implements opl, opp, opr, ops, opv
{

    public ar a;
    public am b;
    public boolean c;
    private ay d;
    private boolean e;

    public hft(am am1, opd opd1)
    {
        b = am1;
        opd1.a(this);
    }

    public hft(ar ar1, opd opd1)
    {
        a = ar1;
        opd1.a(this);
    }

    public final void a(Bundle bundle)
    {
        if (a != null)
        {
            d = a.c();
        } else
        {
            d = b.B;
        }
        if (bundle != null)
        {
            e = bundle.getBoolean("com.google.android.apps.photos.ProgressDialogMixin.DismissOnResume", false);
        }
    }

    public final void a(String s)
    {
        if (!c)
        {
            return;
        } else
        {
            c();
            hfu.a(null, s, false).a(d, "com.google.android.apps.photos.ProgressDialogMixin.Pending");
            return;
        }
    }

    public final void al_()
    {
        c = true;
        if (e)
        {
            c();
        }
    }

    public final void am_()
    {
        c = false;
    }

    public final void c()
    {
        if (!c)
        {
            e = true;
            return;
        }
        al al1 = (al)d.a("com.google.android.apps.photos.ProgressDialogMixin.Pending");
        if (al1 != null)
        {
            al1.a(false);
        }
        e = false;
    }

    public final void e(Bundle bundle)
    {
        bundle.putBoolean("com.google.android.apps.photos.ProgressDialogMixin.DismissOnResume", e);
    }
}
