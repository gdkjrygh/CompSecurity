// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.util.client;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.wn;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.ads.internal.util.client:
//            zzb

public class zza
{

    public static final Handler zzJt = new Handler(Looper.getMainLooper());

    public zza()
    {
    }

    private void a(ViewGroup viewgroup, AdSizeParcel adsizeparcel, String s, int i, int j)
    {
        if (viewgroup.getChildCount() != 0)
        {
            return;
        } else
        {
            Context context = viewgroup.getContext();
            TextView textview = new TextView(context);
            textview.setGravity(17);
            textview.setText(s);
            textview.setTextColor(i);
            textview.setBackgroundColor(j);
            s = new FrameLayout(context);
            s.setBackgroundColor(i);
            i = zzb(context, 3);
            s.addView(textview, new android.widget.FrameLayout.LayoutParams(adsizeparcel.widthPixels - i, adsizeparcel.heightPixels - i, 17));
            viewgroup.addView(s, adsizeparcel.widthPixels, adsizeparcel.heightPixels);
            return;
        }
    }

    public String zzQ(Context context)
    {
        context = context.getContentResolver();
        if (context == null)
        {
            context = null;
        } else
        {
            context = android.provider.Settings.Secure.getString(context, "android_id");
        }
        if (context == null || zzgS())
        {
            context = "emulator";
        }
        return zzaE(context);
    }

    public boolean zzR(Context context)
    {
        return GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) == 0;
    }

    public boolean zzS(Context context)
    {
        if (context.getResources().getConfiguration().orientation == 2)
        {
            if ((int)((float)((DisplayMetrics) (context = context.getResources().getDisplayMetrics())).heightPixels / ((DisplayMetrics) (context)).density) < 600)
            {
                return true;
            }
        }
        return false;
    }

    public boolean zzT(Context context)
    {
        DisplayMetrics displaymetrics = context.getResources().getDisplayMetrics();
        context = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        int i;
        int j;
        int k;
        int l;
        if (wn.e())
        {
            context.getRealMetrics(displaymetrics);
            j = displaymetrics.heightPixels;
            i = displaymetrics.widthPixels;
        } else
        {
            try
            {
                j = ((Integer)android/view/Display.getMethod("getRawHeight", new Class[0]).invoke(context, new Object[0])).intValue();
                i = ((Integer)android/view/Display.getMethod("getRawWidth", new Class[0]).invoke(context, new Object[0])).intValue();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return false;
            }
        }
        context.getMetrics(displaymetrics);
        k = displaymetrics.heightPixels;
        l = displaymetrics.widthPixels;
        return k == j && l == i;
    }

    public int zzU(Context context)
    {
        int i = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
        if (i > 0)
        {
            return context.getResources().getDimensionPixelSize(i);
        } else
        {
            return 0;
        }
    }

    public int zza(DisplayMetrics displaymetrics, int i)
    {
        return (int)TypedValue.applyDimension(1, i, displaymetrics);
    }

    public void zza(ViewGroup viewgroup, AdSizeParcel adsizeparcel, String s)
    {
        a(viewgroup, adsizeparcel, s, 0xff000000, -1);
    }

    public void zza(ViewGroup viewgroup, AdSizeParcel adsizeparcel, String s, String s1)
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaH(s1);
        a(viewgroup, adsizeparcel, s, 0xffff0000, 0xff000000);
    }

    public String zzaE(String s)
    {
        int i = 0;
_L2:
        if (i >= 2)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj;
        obj = MessageDigest.getInstance("MD5");
        ((MessageDigest) (obj)).update(s.getBytes());
        obj = String.format(Locale.US, "%032X", new Object[] {
            new BigInteger(1, ((MessageDigest) (obj)).digest())
        });
        return ((String) (obj));
        NoSuchAlgorithmException nosuchalgorithmexception;
        nosuchalgorithmexception;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        return null;
    }

    public int zzb(Context context, int i)
    {
        return zza(context.getResources().getDisplayMetrics(), i);
    }

    public int zzb(DisplayMetrics displaymetrics, int i)
    {
        return Math.round((float)i / displaymetrics.density);
    }

    public int zzc(Context context, int i)
    {
        context = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        context.getMetrics(displaymetrics);
        return zzb(displaymetrics, i);
    }

    public boolean zzgS()
    {
        return Build.DEVICE.startsWith("generic");
    }

    public boolean zzgT()
    {
        return Looper.myLooper() == Looper.getMainLooper();
    }

}
