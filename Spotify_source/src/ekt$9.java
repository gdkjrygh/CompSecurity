// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.spotify.mobile.android.util.viewuri.ViewUri;

final class ang.Object
    implements android.view.nClickListener
{

    private Activity a;
    private String b;
    private ekt c;

    public final void onClick(View view)
    {
        view = ekt.e(c);
        Activity activity = a;
        String s = b;
        Intent intent = gms.a(activity, "spotify:internal:discover").a(s).a;
        intent.putExtra("referer", ViewUri.n);
        activity.startActivity(intent);
        ((elo) (view)).a.a(activity, -1, s, "spotify:internal:discover", null);
    }

    (ekt ekt1, Activity activity, String s)
    {
        c = ekt1;
        a = activity;
        b = s;
        super();
    }
}
