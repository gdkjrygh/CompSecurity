// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.util.List;

public final class kpe
{

    public final Activity a;
    final jyn b;

    public kpe(Activity activity)
    {
        this(activity, (new jyo(activity)).a(kpx.b).a());
    }

    private kpe(Activity activity, jyn jyn)
    {
        a = activity;
        b = jyn;
    }

    public final void a(Intent intent)
    {
        if (!intent.getAction().equals("com.google.android.gms.googlehelp.HELP") || !intent.hasExtra("EXTRA_GOOGLE_HELP"))
        {
            throw new IllegalArgumentException("The intent you are trying to launch is not GoogleHelp intent! This class only supports GoogleHelp intents.");
        }
        int i = jyc.a(a);
        if (i == 0)
        {
            kpx.a(b, new kpf(this, intent));
            return;
        }
        intent = (GoogleHelp)intent.getParcelableExtra("EXTRA_GOOGLE_HELP");
        intent = (new Intent("android.intent.action.VIEW")).setData(((GoogleHelp) (intent)).q);
        if (i != 7)
        {
            boolean flag;
            if (a.getPackageManager().queryIntentActivities(intent, 0).size() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                a.startActivity(intent);
                return;
            }
        }
        jyc.a(i, a, 0);
    }
}
