// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobile.android.util.viewuri.ViewUri;

public final class elr
{

    private eln a;

    public elr(elq elq)
    {
        a = new eln(elq);
    }

    public final void a(Context context, int i, String s, String s1, String s2)
    {
        fdm fdm1 = (new fdm()).a(s2);
        Object obj = ViewUri.r;
        fdm1.a.putParcelable("referer", ((android.os.Parcelable) (obj)));
        fdm1 = fdm1.c(s1);
        obj = fdm1.a.getString("playlist_uri");
        geh.a(((CharSequence) (obj)), "playlistUri must be set");
        obj = gms.a(context, ((String) (obj))).a;
        ((Intent) (obj)).putExtras(fdm1.a);
        context.startActivity(((Intent) (obj)));
        a.a(context, i, s1, s2, s);
    }
}
