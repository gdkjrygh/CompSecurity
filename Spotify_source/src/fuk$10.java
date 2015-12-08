// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ClipData;
import android.content.ClipboardManager;
import com.spotify.mobile.android.util.SpotifyLink;

public final class ng.Object
    implements fxo
{

    private u a;
    private String b;
    private fuk c;

    public final void a(fxp fxp)
    {
        c.a(com.spotify.mobile.android.util.vent.Event.o);
        ((ClipboardManager)a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(a.getString(0x7f0804cc), (new SpotifyLink(b)).e()));
        dmz.a(ggc);
        ggc.a(a, 0x7f08054c, 1, new Object[0]);
        fxp = c.g;
        String s = b;
        fxp.a(com.spotify.mobile.android.util.viewuri..SubView.Q, com.spotify.mobile.android.util.vent.SubEvent.cL, s);
    }

    public ng.String(fuk fuk1, u u1, String s)
    {
        c = fuk1;
        a = u1;
        b = s;
        super();
    }
}
