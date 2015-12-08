// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.ui.activity.ShareToSpotifyActivity;

public final class ng.Object
    implements fxo
{

    private String a;
    private String b;
    private fuk c;

    public final void a(fxp fxp)
    {
        c.a(com.spotify.mobile.android.util.vent.Event.o);
        c.b.startActivity(ShareToSpotifyActivity.a(c.b, com.spotify.mobile.android.ui.activity.SpotifyActivity.ShareType.a, a, fuk.c(b)));
        c.g.b(b);
    }

    public ng.String(fuk fuk1, String s, String s1)
    {
        c = fuk1;
        a = s;
        b = s1;
        super();
    }
}
