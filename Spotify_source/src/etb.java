// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;

public final class etb
    implements etk
{

    private Context a;

    public etb(Context context, fop fop1)
    {
        a = (Context)ctz.a(context);
        ctz.a(fop1);
    }

    private static dnh a(String s, String s1, String s2)
    {
        return new dnh(s, s1, s2);
    }

    public final void a()
    {
        fop.a(a, ViewUri.L, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.R, com.spotify.mobile.android.util.ClientEvent.SubEvent.dN));
    }

    public final void b()
    {
        fop.a(a, a("now-playing-bar", "play-button-touched-up-inside", "1.0"));
    }

    public final void c()
    {
        fop.a(a, a("now-playing-bar", "next-track-swiped", "1.0"));
    }

    public final void d()
    {
        fop.a(a, a("now-playing-bar", "previous-track-swiped", "1.0"));
    }
}
