// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;

final class kpi extends kpl
{

    final Intent g;
    final Activity h;
    private Bitmap i;

    kpi(kph kph1, jyn jyn, Intent intent, Bitmap bitmap, Activity activity)
    {
        g = intent;
        i = bitmap;
        h = activity;
        super(jyn);
    }

    protected final void a(kpq kpq1)
    {
        try
        {
            kpq1.a((GoogleHelp)g.getParcelableExtra("EXTRA_GOOGLE_HELP"), i, new kpj(this));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (kpq kpq1)
        {
            Log.e("gH_GoogleHelpApiImpl", "Starting help failed!", kpq1);
        }
        c(kph.a());
    }
}
