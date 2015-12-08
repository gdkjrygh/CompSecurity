// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.spotlets.tinkerbell.BannerView;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.Verified;

public final class eye
{

    public static final gip a = gip.b("opt_in_dismissed_timestamp");
    public final BannerView b;
    public final gin c;
    public final Verified d;
    public final Flags e;
    private eyf f;

    public eye(BannerView bannerview, gin gin, Verified verified, Flags flags, String s)
    {
        b = bannerview;
        c = gin;
        d = verified;
        e = flags;
        f = new eyf(b.getContext(), c, d, "moments", b);
        b.a = f;
        bannerview = new eyd(bannerview.getContext(), s);
        f.d = bannerview;
    }

    public static void a(Context context, Verified verified, ClientEvent clientevent)
    {
        clientevent.a("feature", "moments");
        dmz.a(fop);
        fop.a(context, verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.V, clientevent);
    }

    static void b(Context context, Verified verified, ClientEvent clientevent)
    {
        a(context, verified, clientevent);
    }

}
