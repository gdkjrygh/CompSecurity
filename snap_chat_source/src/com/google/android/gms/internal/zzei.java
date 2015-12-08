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
//            zzhx, zzek, zzes

public class zzei
{

    public zzei()
    {
    }

    public boolean zza(Context context, zzek zzek1, zzes zzes1)
    {
        if (zzek1 == null)
        {
            zzhx.zzac("No intent data for launcher overlay.");
            return false;
        }
        Intent intent = new Intent();
        if (TextUtils.isEmpty(zzek1.zztR))
        {
            zzhx.zzac("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(zzek1.mimeType))
        {
            intent.setDataAndType(Uri.parse(zzek1.zztR), zzek1.mimeType);
        } else
        {
            intent.setData(Uri.parse(zzek1.zztR));
        }
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(zzek1.packageName))
        {
            intent.setPackage(zzek1.packageName);
        }
        if (!TextUtils.isEmpty(zzek1.zztS))
        {
            String as[] = zzek1.zztS.split("/", 2);
            if (as.length < 2)
            {
                zzhx.zzac((new StringBuilder("Could not parse component name from open GMSG: ")).append(zzek1.zztS).toString());
                return false;
            }
            intent.setClassName(as[0], as[1]);
        }
        zzek1 = zzek1.zztT;
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
                zzhx.zzac("Could not parse intent flags.");
                i = 0;
            }
            intent.addFlags(i);
        }
        try
        {
            zzhx.zzab((new StringBuilder("Launching an intent: ")).append(intent.toURI()).toString());
            context.startActivity(intent);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            zzhx.zzac(context.getMessage());
            return false;
        }
        if (zzes1 == null)
        {
            break MISSING_BLOCK_LABEL_240;
        }
        zzes1.zzae();
        return true;
    }
}
