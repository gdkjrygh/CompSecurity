// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;
import com.fitbit.serverinteraction.restrictions.RestrictionInfo;
import com.fitbit.util.r;

// Referenced classes of package com.fitbit:
//            AppUpdateManager

public static class setCancelable extends DialogFragment
{

    private static final String a = "com.fitbit.AppUpdateManager.UpdateAvailableDialogFragment.ARG_RESTRICTION";
    private boolean b;

    protected void a()
    {
        b = true;
        dismiss();
        AppUpdateManager.b(AppUpdateManager.a());
    }

    public void a(RestrictionInfo restrictioninfo)
    {
        if (restrictioninfo != null)
        {
            Bundle bundle = r.a(d(), restrictioninfo.d());
            bundle.putSerializable("com.fitbit.AppUpdateManager.UpdateAvailableDialogFragment.ARG_RESTRICTION", restrictioninfo);
            setArguments(bundle);
        }
    }

    public boolean b()
    {
        return b;
    }

    public RestrictionInfo c()
    {
        Bundle bundle = getArguments();
        if (bundle != null && bundle.containsKey("com.fitbit.AppUpdateManager.UpdateAvailableDialogFragment.ARG_RESTRICTION"))
        {
            return (RestrictionInfo)bundle.getSerializable("com.fitbit.AppUpdateManager.UpdateAvailableDialogFragment.ARG_RESTRICTION");
        } else
        {
            return null;
        }
    }

    protected int d()
    {
        return 0;
    }

    protected boolean e()
    {
        try
        {
            Intent intent = new Intent("android.intent.action.VIEW");
            String s = getActivity().getApplicationContext().getPackageName();
            intent.setData(Uri.parse((new StringBuilder()).append("market://details?id=").append(s).toString()));
            startActivity(intent);
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            Toast.makeText(getActivity(), 0x7f08018c, 1).show();
            return false;
        }
        return false;
    }

    public tionInfo()
    {
        b = false;
        setCancelable(false);
    }
}
