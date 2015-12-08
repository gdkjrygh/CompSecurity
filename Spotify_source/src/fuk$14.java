// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class ng.Object
    implements fxo
{

    private String a;
    private String b;
    private String c;
    private fuk d;

    public final void a(fxp fxp)
    {
        d.a(com.spotify.mobile.android.util.vent.Event.o);
        fxp = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:").buildUpon().appendQueryParameter("subject", a).appendQueryParameter("body", b).build());
        d.b.startActivity(Intent.createChooser(fxp, d.b.getString(0x7f0804c3)));
        fxp = d.g;
        String s = c;
        fxp.a(com.spotify.mobile.android.util.viewuri..SubView.S, com.spotify.mobile.android.util.vent.SubEvent.cM, s);
    }

    public ng.String(fuk fuk1, String s, String s1, String s2)
    {
        d = fuk1;
        a = s;
        b = s1;
        c = s2;
        super();
    }
}
