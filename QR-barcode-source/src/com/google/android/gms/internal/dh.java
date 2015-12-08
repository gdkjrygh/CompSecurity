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
//            gs, dj, dq

public final class dh
{

    public static boolean a(Context context, dj dj1, dq dq1)
    {
        if (dj1 == null)
        {
            gs.W("No intent data for launcher overlay.");
            return false;
        }
        Intent intent = new Intent();
        if (TextUtils.isEmpty(dj1.rq))
        {
            gs.W("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(dj1.mimeType))
        {
            intent.setDataAndType(Uri.parse(dj1.rq), dj1.mimeType);
        } else
        {
            intent.setData(Uri.parse(dj1.rq));
        }
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(dj1.packageName))
        {
            intent.setPackage(dj1.packageName);
        }
        if (!TextUtils.isEmpty(dj1.rr))
        {
            String as[] = dj1.rr.split("/", 2);
            if (as.length < 2)
            {
                gs.W((new StringBuilder()).append("Could not parse component name from open GMSG: ").append(dj1.rr).toString());
                return false;
            }
            intent.setClassName(as[0], as[1]);
        }
        try
        {
            gs.V((new StringBuilder()).append("Launching an intent: ").append(intent).toString());
            context.startActivity(intent);
            dq1.ab();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            gs.W(context.getMessage());
            return false;
        }
        return true;
    }
}
