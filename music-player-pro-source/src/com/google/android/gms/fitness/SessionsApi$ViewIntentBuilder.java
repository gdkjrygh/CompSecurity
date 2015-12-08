// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.fitness:
//            SessionsApi

public static class mContext
{

    private String TP;
    private Session TQ;
    private boolean TR;
    private final Context mContext;

    private Intent i(Intent intent)
    {
        if (TP != null)
        {
            Intent intent1 = (new Intent(intent)).setPackage(TP);
            ResolveInfo resolveinfo = mContext.getPackageManager().resolveActivity(intent1, 0);
            if (resolveinfo != null)
            {
                intent = resolveinfo.activityInfo.name;
                intent1.setComponent(new ComponentName(TP, intent));
                return intent1;
            }
        }
        return intent;
    }

    public Intent build()
    {
        Intent intent;
        boolean flag;
        if (TQ != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.a(flag, "Session must be set");
        intent = new Intent("vnd.google.fitness.VIEW");
        intent.setType(Session.getMimeType(TQ.getActivity()));
        c.a(TQ, intent, "vnd.google.fitness.session");
        if (!TR)
        {
            TP = TQ.getAppPackageName();
        }
        return i(intent);
    }

    public i setPreferredApplication(String s)
    {
        TP = s;
        TR = true;
        return this;
    }

    public TR setSession(Session session)
    {
        TQ = session;
        return this;
    }

    public (Context context)
    {
        TR = false;
        mContext = context;
    }
}
