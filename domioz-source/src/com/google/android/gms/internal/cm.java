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
//            fj, zzek

public final class cm
{

    public cm()
    {
    }

    public static boolean a(Context context, zzek zzek1)
    {
        if (zzek1 == null)
        {
            fj.e("No intent data for launcher overlay.");
            return false;
        }
        Intent intent = new Intent();
        if (TextUtils.isEmpty(zzek1.c))
        {
            fj.e("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(zzek1.d))
        {
            intent.setDataAndType(Uri.parse(zzek1.c), zzek1.d);
        } else
        {
            intent.setData(Uri.parse(zzek1.c));
        }
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(zzek1.e))
        {
            intent.setPackage(zzek1.e);
        }
        if (!TextUtils.isEmpty(zzek1.f))
        {
            String as[] = zzek1.f.split("/", 2);
            if (as.length < 2)
            {
                fj.e((new StringBuilder("Could not parse component name from open GMSG: ")).append(zzek1.f).toString());
                return false;
            }
            intent.setClassName(as[0], as[1]);
        }
        zzek1 = zzek1.g;
        if (!TextUtils.isEmpty(zzek1))
        {
            int i;
            try
            {
                i = Integer.parseInt(zzek1);
            }
            // Misplaced declaration of an exception variable
            catch (zzek zzek1)
            {
                fj.e("Could not parse intent flags.");
                i = 0;
            }
            intent.addFlags(i);
        }
        try
        {
            fj.d((new StringBuilder("Launching an intent: ")).append(intent.toURI()).toString());
            context.startActivity(intent);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            fj.e(context.getMessage());
            return false;
        }
        return true;
    }
}
