// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;

public final class jot
{

    public jot()
    {
    }

    public static boolean a(Context context, AdLauncherIntentInfoParcel adlauncherintentinfoparcel, k k)
    {
        if (adlauncherintentinfoparcel == null)
        {
            b.m("No intent data for launcher overlay.");
            return false;
        }
        k = new Intent();
        if (TextUtils.isEmpty(adlauncherintentinfoparcel.c))
        {
            b.m("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(adlauncherintentinfoparcel.d))
        {
            k.setDataAndType(Uri.parse(adlauncherintentinfoparcel.c), adlauncherintentinfoparcel.d);
        } else
        {
            k.setData(Uri.parse(adlauncherintentinfoparcel.c));
        }
        k.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(adlauncherintentinfoparcel.e))
        {
            k.setPackage(adlauncherintentinfoparcel.e);
        }
        if (!TextUtils.isEmpty(adlauncherintentinfoparcel.f))
        {
            String as[] = adlauncherintentinfoparcel.f.split("/", 2);
            if (as.length < 2)
            {
                b.m((new StringBuilder("Could not parse component name from open GMSG: ")).append(adlauncherintentinfoparcel.f).toString());
                return false;
            }
            k.setClassName(as[0], as[1]);
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
                b.m("Could not parse intent flags.");
                i = 0;
            }
            k.addFlags(i);
        }
        try
        {
            (new StringBuilder("Launching an intent: ")).append(k.toURI()).toString();
            b.p(2);
            context.startActivity(k);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            b.m(context.getMessage());
            return false;
        }
        return true;
    }
}
