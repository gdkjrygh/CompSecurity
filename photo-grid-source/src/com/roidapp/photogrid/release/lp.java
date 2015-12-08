// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class lp
{

    public lp()
    {
    }

    public static void a(Activity activity, AdView adview, LinearLayout linearlayout)
    {
        android.view.ViewGroup.LayoutParams layoutparams;
        int i;
        int j;
        linearlayout.removeAllViews();
        layoutparams = linearlayout.getLayoutParams();
        layoutparams.height = AdSize.SMART_BANNER.getHeightInPixels(activity);
        if (layoutparams.height >= 35)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        DisplayMetrics displaymetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        i = displaymetrics.widthPixels;
        j = displaymetrics.heightPixels;
        if (i <= 240)
        {
            i = 37;
        } else
        if (i > 240 && i <= 320)
        {
            i = 50;
        } else
        if (i > 320 && j <= 855)
        {
            i = 75;
        } else
        if ((i <= 320 || j > 1280) && i > 1079 && j <= 1920)
        {
            i = 150;
        } else
        {
            i = 100;
        }
        layoutparams.height = i;
        linearlayout.setLayoutParams(layoutparams);
        if (adview == null)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        try
        {
            activity = (ViewGroup)adview.getParent();
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            activity.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            activity.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            activity.printStackTrace();
            return;
        }
        if (activity == null)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        activity.removeAllViews();
        linearlayout.addView(adview);
        activity = new com.google.android.gms.ads.AdRequest.Builder();
        a(((com.google.android.gms.ads.AdRequest.Builder) (activity)));
        adview.loadAd(activity.build());
    }

    private static void a(com.google.android.gms.ads.AdRequest.Builder builder)
    {
        Object obj = Arrays.asList(new String[] {
            "E53AF8403808FF9EFB43D301DC7CD525", "30693E3A920BB941B0BE9E5A78C383EE", "38AB110462D602F3DA1DC2D7CFEC70D9", "51AA1B7EA68B87A0362976088F99B550", "9FEEE5BA9214100A9FA080321D54AFE3", "1486E03FC30314F813E60BF2324DBFB3", "0688E951AB60B1F0424BCFEC56ED832F", "9769AA58048C16BE345F1B41F488C351", "6E9B1F60BBDB7089F3C5378535541872", "2BBE921B44E0B7F23C3BF705AD95DB39", 
            "D85DDF14A66EF344B6062ACDC46CFE24", "9510C3785612E056CAAD2B2369FEA602", "7F756B20D5AB727C1AFF9E526EA62F6A", "582E9E80E5FDCE0A9B28E469C807E7B2", "E2DDD8882806067531F153A7AD520147", "5F75F75F096D844DBC223354A4C6F463", "4E5BA6A6D8929320057A412F93C4A87A", "052435A7CD69A65D63990CBDA87DDE86", "CD9AB097966F78C0890C34AFE7755653", "49058ED58D92ABA02A69D55993310238", 
            "5294498C2D72559FD6AEEB0E826341D8", "A715E2E42D3E8945D2C3A24943663BC3", "5294498C2D72559FD6AEEB0E826341D8", "079EBCA9F7673E4C99503690B8034220", "8E546C71CE10BF1886E480F3C2C698F7", "0F99F56EA622B714E1CAD99EC35BD63A", "25B781C0A6DB7ED5C58C9C044C0C1B4F"
        });
        builder.addTestDevice(AdRequest.DEVICE_ID_EMULATOR);
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); builder.addTestDevice((String)((Iterator) (obj)).next())) { }
    }
}
