// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.googlehelp;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.List;

// Referenced classes of package com.google.android.gms.googlehelp:
//            GoogleHelp

public final class GoogleHelpLauncher
{

    protected final Activity mActivity;

    public GoogleHelpLauncher(Activity activity)
    {
        mActivity = activity;
    }

    private void c(int i, Intent intent)
    {
        intent = (GoogleHelp)intent.getParcelableExtra("EXTRA_GOOGLE_HELP");
        intent = (new Intent("android.intent.action.VIEW")).setData(intent.getFallbackSupportUri());
        if (i != 7 && p(intent))
        {
            mActivity.startActivity(intent);
            return;
        } else
        {
            GooglePlayServicesUtil.showErrorDialogFragment(i, mActivity, 0);
            return;
        }
    }

    private int isGooglePlayServicesAvailable()
    {
        return GooglePlayServicesUtil.isGooglePlayServicesAvailable(mActivity);
    }

    private static void o(Intent intent)
    {
        if (!intent.getAction().equals("com.google.android.gms.googlehelp.HELP") || !intent.hasExtra("EXTRA_GOOGLE_HELP"))
        {
            throw new IllegalArgumentException("The intent you are trying to launch is not GoogleHelp intent! This class only supports GoogleHelp intents.");
        } else
        {
            return;
        }
    }

    private boolean p(Intent intent)
    {
        boolean flag = false;
        if (mActivity.getPackageManager().queryIntentActivities(intent, 0).size() > 0)
        {
            flag = true;
        }
        return flag;
    }

    public final void launch(Intent intent)
    {
        o(intent);
        int i = isGooglePlayServicesAvailable();
        if (i == 0)
        {
            mActivity.startActivityForResult(intent, 123);
            return;
        } else
        {
            c(i, intent);
            return;
        }
    }
}
