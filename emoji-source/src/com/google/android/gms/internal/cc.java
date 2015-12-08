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
//            eu, ce, cl

public final class cc
{

    public static boolean a(Context context, ce ce1, cl cl1)
    {
        if (ce1 == null)
        {
            eu.D("No intent data for launcher overlay.");
            return false;
        }
        Intent intent = new Intent();
        if (TextUtils.isEmpty(ce1.ob))
        {
            eu.D("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(ce1.mimeType))
        {
            intent.setDataAndType(Uri.parse(ce1.ob), ce1.mimeType);
        } else
        {
            intent.setData(Uri.parse(ce1.ob));
        }
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(ce1.packageName))
        {
            intent.setPackage(ce1.packageName);
        }
        if (!TextUtils.isEmpty(ce1.oc))
        {
            String as[] = ce1.oc.split("/", 2);
            if (as.length < 2)
            {
                eu.D((new StringBuilder()).append("Could not parse component name from open GMSG: ").append(ce1.oc).toString());
                return false;
            }
            intent.setClassName(as[0], as[1]);
        }
        try
        {
            eu.C((new StringBuilder()).append("Launching an intent: ").append(intent).toString());
            context.startActivity(intent);
            cl1.Y();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            eu.D(context.getMessage());
            return false;
        }
        return true;
    }
}
