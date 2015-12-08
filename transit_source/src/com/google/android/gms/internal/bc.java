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
//            cn, be, bl

public final class bc
{

    public static boolean a(Context context, be be1, bl bl1)
    {
        if (be1 == null)
        {
            cn.q("No intent data for launcher overlay.");
            return false;
        }
        Intent intent = new Intent();
        if (TextUtils.isEmpty(be1.fz))
        {
            cn.q("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(be1.mimeType))
        {
            intent.setDataAndType(Uri.parse(be1.fz), be1.mimeType);
        } else
        {
            intent.setData(Uri.parse(be1.fz));
        }
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(be1.packageName))
        {
            intent.setPackage(be1.packageName);
        }
        if (!TextUtils.isEmpty(be1.fA))
        {
            String as[] = be1.fA.split("/", 2);
            if (as.length < 2)
            {
                cn.q((new StringBuilder()).append("Could not parse component name from open GMSG: ").append(be1.fA).toString());
                return false;
            }
            intent.setClassName(as[0], as[1]);
        }
        try
        {
            cn.p((new StringBuilder()).append("Launching an intent: ").append(intent).toString());
            context.startActivity(intent);
            bl1.A();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            cn.q(context.getMessage());
            return false;
        }
        return true;
    }
}
