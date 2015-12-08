// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;

public final class bhk
{

    public bhk()
    {
    }

    public static boolean a(Context context, AdLauncherIntentInfoParcel adlauncherintentinfoparcel, bhz bhz1)
    {
        if (adlauncherintentinfoparcel == null)
        {
            bka.e("No intent data for launcher overlay.");
            return false;
        }
        Intent intent = new Intent();
        if (TextUtils.isEmpty(adlauncherintentinfoparcel.c))
        {
            bka.e("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(adlauncherintentinfoparcel.d))
        {
            intent.setDataAndType(Uri.parse(adlauncherintentinfoparcel.c), adlauncherintentinfoparcel.d);
        } else
        {
            intent.setData(Uri.parse(adlauncherintentinfoparcel.c));
        }
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(adlauncherintentinfoparcel.e))
        {
            intent.setPackage(adlauncherintentinfoparcel.e);
        }
        if (!TextUtils.isEmpty(adlauncherintentinfoparcel.f))
        {
            String as[] = adlauncherintentinfoparcel.f.split("/", 2);
            if (as.length < 2)
            {
                bka.e((new StringBuilder("Could not parse component name from open GMSG: ")).append(adlauncherintentinfoparcel.f).toString());
                return false;
            }
            intent.setClassName(as[0], as[1]);
        }
        adlauncherintentinfoparcel = adlauncherintentinfoparcel.g;
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
                bka.e("Could not parse intent flags.");
                i = 0;
            }
            intent.addFlags(i);
        }
        try
        {
            bka.d((new StringBuilder("Launching an intent: ")).append(intent.toURI()).toString());
            bkv.e();
            cjj.a(context, intent);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            bka.e(context.getMessage());
            return false;
        }
        if (bhz1 == null)
        {
            break MISSING_BLOCK_LABEL_235;
        }
        bhz1.m();
        return true;
    }
}
