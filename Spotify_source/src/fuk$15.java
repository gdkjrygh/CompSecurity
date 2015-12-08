// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.mobile.android.util.Assertion;

public final class ng.Object
    implements fxo
{

    private String a;
    private String b;
    private fuk c;

    public final void a(fxp fxp)
    {
        c.a(com.spotify.mobile.android.util.vent.Event.o);
        fxp = a;
        Assertion.a("");
        Assertion.a(fxp);
        Object obj = new Intent("android.intent.action.VIEW");
        ((Intent) (obj)).setData(Uri.parse((new StringBuilder("sms:")).append("").toString()));
        ((Intent) (obj)).putExtra("sms_body", fxp);
        c.b.startActivity(Intent.createChooser(((Intent) (obj)), c.b.getString(0x7f0804c4)));
        fxp = c.g;
        obj = b;
        fxp.a(com.spotify.mobile.android.util.viewuri..SubView.S, com.spotify.mobile.android.util.vent.SubEvent.cQ, ((String) (obj)));
    }

    public ng.String(fuk fuk1, String s, String s1)
    {
        c = fuk1;
        a = s;
        b = s1;
        super();
    }
}
