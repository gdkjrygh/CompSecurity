// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import com.spotify.mobile.android.util.Assertion;

public final class ng.Object
    implements fxo
{

    private fia a;
    private String b;
    private com.spotify.mobile.android.spotlets.share.util.Helper.App c;
    private String d;
    private fuk e;

    public final void a(fxp fxp)
    {
        e.a(com.spotify.mobile.android.util.vent.Event.o);
        fxp = a;
        Object obj = new Intent();
        ((Intent) (obj)).setPackage(((fia) (fxp)).b.packageName);
        Intent intent = new Intent(((Intent) (obj)));
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", b);
        intent.setType("text/plain");
        fxp = e;
        obj = c;
        try
        {
            ((fuk) (fxp)).b.startActivity(intent);
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            obj = ((fuk) (fxp)).b.getString(((com.spotify.mobile.android.spotlets.share.util.Helper.App) (obj)).mNameStringResId);
            dmz.a(ggc);
            ggc.c(((fuk) (fxp)).b, ((String) (obj)));
            Assertion.b((new StringBuilder("Could not start share Activity for ")).append(((String) (obj))).toString());
        }
        e.g.a(a.b.packageName, d, false);
    }

    public ng.String(fuk fuk1, fia fia1, String s, com.spotify.mobile.android.spotlets.share.util.Helper.App app, String s1)
    {
        e = fuk1;
        a = fia1;
        b = s;
        c = app;
        d = s1;
        super();
    }
}
