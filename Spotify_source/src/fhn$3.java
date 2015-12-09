// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.view.View;
import com.spotify.mobile.android.util.SpotifyLink;

final class ang.Object
    implements android.view.nClickListener
{

    private fhn a;

    public final void onClick(View view)
    {
        view = new Intent();
        view.setAction("android.intent.action.SEND");
        view.putExtra("android.intent.extra.TEXT", (new SpotifyLink(fhn.d(a))).e());
        view.setType("text/plain");
        a.a(Intent.createChooser(view, a.b(0x7f0804c5)));
        view = fhn.i(a);
        String s = fhn.d(a);
        view.a(com.spotify.mobile.android.util.viewuri.i.SubView.R, com.spotify.mobile.android.util.Event.SubEvent.cF, s);
    }

    (fhn fhn1)
    {
        a = fhn1;
        super();
    }
}
