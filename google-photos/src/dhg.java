// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;

public final class dhg
    implements omb, opt, opu, opv
{

    final int a;
    final msp b;
    dhf c;
    dhk d;
    boolean e;
    boolean f;
    private final Activity g;
    private final am h;
    private dha i;

    public dhg(am am1, opd opd1, dhf dhf, int j, msp msp)
    {
        this(null, am1, opd1, dhf, j, msp);
    }

    private dhg(Activity activity, am am1, opd opd1, dhf dhf, int j, msp msp)
    {
        g = activity;
        h = am1;
        c = dhf;
        a = j;
        b = msp;
        opd1.a(this);
        if (dhf instanceof opv)
        {
            opd1.a((opv)dhf);
        }
    }

    public dhg(Activity activity, opd opd1, dhf dhf, int j, msp msp)
    {
        this(activity, null, opd1, dhf, j, msp);
    }

    public final void V_()
    {
        e = false;
    }

    public final void X_()
    {
        e = true;
        if (f)
        {
            i.a();
            f = false;
        }
    }

    public final dhg a(olm olm1)
    {
        olm1.b(dhg, this);
        return this;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        d = (dhk)olm1.a(dhk);
        i = (dha)olm1.a(dha);
    }

    public final String toString()
    {
        String s;
        String s1;
        String s2;
        if (g != null)
        {
            s = g.getResources().getResourceName(a);
        } else
        if (h.O_() != null)
        {
            s = h.g().getResourceName(a);
        } else
        {
            int j = a;
            s = (new StringBuilder(21)).append(j).append("(detached)").toString();
        }
        s1 = String.valueOf(super.toString());
        s2 = String.valueOf(c);
        return (new StringBuilder(String.valueOf(s1).length() + 17 + String.valueOf(s2).length() + String.valueOf(s).length())).append(s1).append("{handler=").append(s2).append(" resId=").append(s).append("}").toString();
    }
}
