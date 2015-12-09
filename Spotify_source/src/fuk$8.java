// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;

public final class ang.Object
    implements fxo
{

    private String a;
    private String b;
    private String c;
    private String d;
    private fuk e;

    public final void a(fxp fxp)
    {
        e.a(com.spotify.mobile.android.util.Event.Event.o);
        fxp = e.g;
        Object obj = a;
        fxp.a(com.spotify.mobile.android.util.viewuri.i.SubView.Q, com.spotify.mobile.android.util.Event.SubEvent.cN, ((String) (obj)));
        fxp = e.b;
        obj = new fhm(e.b);
        String s = b;
        ((fhm) (obj)).b.putExtra("spotify:share:posttitle", s);
        s = c;
        ((fhm) (obj)).b.putExtra("spotify:share:postsubtitle", s);
        s = d;
        ((fhm) (obj)).b.putExtra("spotify:share:postimage_uri", s);
        s = a;
        ((fhm) (obj)).b.putExtra("spotify:share:posturi", s);
        ((fhm) (obj)).a.putExtra("android.intent.extra.INTENT", ((fhm) (obj)).b);
        fxp.startActivity(((fhm) (obj)).a);
    }

    public (fuk fuk1, String s, String s1, String s2, String s3)
    {
        e = fuk1;
        a = s;
        b = s1;
        c = s2;
        d = s3;
        super();
    }
}
