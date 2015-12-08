// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

// Referenced classes of package com.google.android.gms.internal:
//            ev, cf, cm

public final class cd
{

    public static boolean a(Context context, cf cf1, cm cm1)
    {
        if (cf1 == null)
        {
            ev.D("No intent data for launcher overlay.");
            return false;
        }
        Intent intent = new Intent();
        if (TextUtils.isEmpty(cf1.nZ))
        {
            ev.D("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(cf1.mimeType))
        {
            intent.setDataAndType(Uri.parse(cf1.nZ), cf1.mimeType);
        } else
        {
            intent.setData(Uri.parse(cf1.nZ));
        }
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(cf1.packageName))
        {
            intent.setPackage(cf1.packageName);
        }
        if (!TextUtils.isEmpty(cf1.oa))
        {
            String as[] = cf1.oa.split("/", 2);
            if (as.length < 2)
            {
                ev.D((new StringBuilder()).append("Could not parse component name from open GMSG: ").append(cf1.oa).toString());
                return false;
            }
            intent.setClassName(as[0], as[1]);
        }
        try
        {
            ev.C((new StringBuilder()).append("Launching an intent: ").append(intent).toString());
            context.startActivity(intent);
            cm1.T();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            ev.D(context.getMessage());
            return false;
        }
        return true;
    }
}
