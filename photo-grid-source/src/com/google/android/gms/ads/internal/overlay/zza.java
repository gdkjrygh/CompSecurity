// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.internal.qa;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            AdLauncherIntentInfoParcel, zzn

public class zza
{

    public zza()
    {
    }

    public boolean zza(Context context, AdLauncherIntentInfoParcel adlauncherintentinfoparcel, zzn zzn1)
    {
        if (adlauncherintentinfoparcel == null)
        {
            zzb.zzaH("No intent data for launcher overlay.");
            return false;
        }
        Intent intent = new Intent();
        if (TextUtils.isEmpty(adlauncherintentinfoparcel.url))
        {
            zzb.zzaH("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(adlauncherintentinfoparcel.mimeType))
        {
            intent.setDataAndType(Uri.parse(adlauncherintentinfoparcel.url), adlauncherintentinfoparcel.mimeType);
        } else
        {
            intent.setData(Uri.parse(adlauncherintentinfoparcel.url));
        }
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(adlauncherintentinfoparcel.packageName))
        {
            intent.setPackage(adlauncherintentinfoparcel.packageName);
        }
        if (!TextUtils.isEmpty(adlauncherintentinfoparcel.zzAL))
        {
            String as[] = adlauncherintentinfoparcel.zzAL.split("/", 2);
            if (as.length < 2)
            {
                zzb.zzaH((new StringBuilder("Could not parse component name from open GMSG: ")).append(adlauncherintentinfoparcel.zzAL).toString());
                return false;
            }
            intent.setClassName(as[0], as[1]);
        }
        adlauncherintentinfoparcel = adlauncherintentinfoparcel.zzAM;
        if (!TextUtils.isEmpty(adlauncherintentinfoparcel))
        {
            int i;
            try
            {
                i = Integer.parseInt(adlauncherintentinfoparcel);
            }
            // Misplaced declaration of an exception variable
            catch (AdLauncherIntentInfoParcel adlauncherintentinfoparcel)
            {
                zzb.zzaH("Could not parse intent flags.");
                i = 0;
            }
            intent.addFlags(i);
        }
        try
        {
            zzb.v((new StringBuilder("Launching an intent: ")).append(intent.toURI()).toString());
            zzp.zzbv();
            qa.a(context, intent);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            zzb.zzaH(context.getMessage());
            return false;
        }
        if (zzn1 == null)
        {
            break MISSING_BLOCK_LABEL_244;
        }
        zzn1.zzaO();
        return true;
    }
}
