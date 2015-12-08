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
//            dw, cb, ci

public final class bz
{

    public static boolean a(Context context, cb cb1, ci ci1)
    {
        if (cb1 == null)
        {
            dw.z("No intent data for launcher overlay.");
            return false;
        }
        Intent intent = new Intent();
        if (TextUtils.isEmpty(cb1.nO))
        {
            dw.z("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(cb1.mimeType))
        {
            intent.setDataAndType(Uri.parse(cb1.nO), cb1.mimeType);
        } else
        {
            intent.setData(Uri.parse(cb1.nO));
        }
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(cb1.packageName))
        {
            intent.setPackage(cb1.packageName);
        }
        if (!TextUtils.isEmpty(cb1.nP))
        {
            String as[] = cb1.nP.split("/", 2);
            if (as.length < 2)
            {
                dw.z((new StringBuilder()).append("Could not parse component name from open GMSG: ").append(cb1.nP).toString());
                return false;
            }
            intent.setClassName(as[0], as[1]);
        }
        try
        {
            dw.y((new StringBuilder()).append("Launching an intent: ").append(intent).toString());
            context.startActivity(intent);
            ci1.U();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            dw.z(context.getMessage());
            return false;
        }
        return true;
    }
}
