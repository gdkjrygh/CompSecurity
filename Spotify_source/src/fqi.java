// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import com.spotify.mobile.android.ui.fragments.logic.Flags;

public final class fqi
    implements dkm, dwx
{

    public final fqj a;
    public boolean b;
    public final dkb c;
    public final dkl d;
    public final dxc e;

    public fqi(Activity activity, fqj fqj1)
    {
        c = dkb.a(activity);
        d = dkl.a(activity);
        e = new dxc(activity);
        e.a(this);
        a = fqj1;
    }

    public final void a()
    {
        if (b)
        {
            return;
        } else
        {
            a.a();
            return;
        }
    }

    public final void a(Flags flags)
    {
        if (b)
        {
            return;
        }
        if (!c.a(flags))
        {
            a.a();
            return;
        } else
        {
            d.a(this);
            return;
        }
    }

    public final void a(String s, String s1)
    {
        if (b)
        {
            return;
        } else
        {
            a.a(s);
            return;
        }
    }
}
