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
//            gr, do, dv

public final class dm
{

    public static boolean a(Context context, do do1, dv dv1)
    {
        if (do1 == null)
        {
            gr.W("No intent data for launcher overlay.");
            return false;
        }
        Intent intent = new Intent();
        if (TextUtils.isEmpty(do1.rH))
        {
            gr.W("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(do1.mimeType))
        {
            intent.setDataAndType(Uri.parse(do1.rH), do1.mimeType);
        } else
        {
            intent.setData(Uri.parse(do1.rH));
        }
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(do1.packageName))
        {
            intent.setPackage(do1.packageName);
        }
        if (!TextUtils.isEmpty(do1.rI))
        {
            String as[] = do1.rI.split("/", 2);
            if (as.length < 2)
            {
                gr.W((new StringBuilder()).append("Could not parse component name from open GMSG: ").append(do1.rI).toString());
                return false;
            }
            intent.setClassName(as[0], as[1]);
        }
        try
        {
            gr.V((new StringBuilder()).append("Launching an intent: ").append(intent).toString());
            context.startActivity(intent);
            dv1.af();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            gr.W(context.getMessage());
            return false;
        }
        return true;
    }
}
