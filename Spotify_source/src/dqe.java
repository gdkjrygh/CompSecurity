// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.porcelain.delegates.PorcelainDefaultImageDelegate;
import com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate;

public final class dqe
{

    private static final dqg c = new dqg() {

        public final void a(drt drt)
        {
        }

        public final boolean a(drz drz)
        {
            return false;
        }

    };
    public com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate a;
    public dqi b;
    private dqg d;

    private dqe(Context context)
    {
        a = PorcelainDefaultImageDelegate.a(context).a(com.spotify.mobile.android.porcelain.delegates.PorcelainDefaultImageDelegate.LoadPolicy.c);
        b = new dqd(context);
        d = c;
    }

    public static dqe a(Context context)
    {
        return new dqe(context);
    }

    public final PorcelainRenderDelegate a()
    {
        return new dqf(d, a, b, (byte)0);
    }

    public final dqe a(drs drs)
    {
        d = (dqg)ctz.a(new dqa(drs));
        return this;
    }

}
