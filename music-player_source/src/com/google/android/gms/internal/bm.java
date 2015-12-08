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
//            ek, bn, ca

public final class bm
{

    public static boolean a(Context context, bn bn1, ca ca1)
    {
        if (bn1 == null)
        {
            ek.d("No intent data for launcher overlay.");
            return false;
        }
        Intent intent = new Intent();
        if (TextUtils.isEmpty(bn1.d))
        {
            ek.d("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(bn1.e))
        {
            intent.setDataAndType(Uri.parse(bn1.d), bn1.e);
        } else
        {
            intent.setData(Uri.parse(bn1.d));
        }
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(bn1.f))
        {
            intent.setPackage(bn1.f);
        }
        if (!TextUtils.isEmpty(bn1.g))
        {
            String as[] = bn1.g.split("/", 2);
            if (as.length < 2)
            {
                ek.d((new StringBuilder("Could not parse component name from open GMSG: ")).append(bn1.g).toString());
                return false;
            }
            intent.setClassName(as[0], as[1]);
        }
        try
        {
            ek.c((new StringBuilder("Launching an intent: ")).append(intent).toString());
            context.startActivity(intent);
            ca1.q();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            ek.d(context.getMessage());
            return false;
        }
        return true;
    }
}
