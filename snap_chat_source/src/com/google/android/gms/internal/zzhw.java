// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
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
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.internal:
//            zzba, zzhx

public class zzhw
{

    public static final Handler zzzG = new Handler(Looper.getMainLooper());

    public zzhw()
    {
    }

    private void zza(ViewGroup viewgroup, zzba zzba1, String s, int i, int j)
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
            s.addView(textview, new android.widget.FrameLayout.LayoutParams(zzba1.widthPixels - i, zzba1.heightPixels - i, 17));
            viewgroup.addView(s, zzba1.widthPixels, zzba1.heightPixels);
            return;
        }
    }

    public boolean zzA(Context context)
    {
        return GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) == 0;
    }

    public String zzX(String s)
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

    public int zza(DisplayMetrics displaymetrics, int i)
    {
        return (int)TypedValue.applyDimension(1, i, displaymetrics);
    }

    public void zza(ViewGroup viewgroup, zzba zzba1, String s)
    {
        zza(viewgroup, zzba1, s, 0xff000000, -1);
    }

    public void zza(ViewGroup viewgroup, zzba zzba1, String s, String s1)
    {
        zzhx.zzac(s1);
        zza(viewgroup, zzba1, s, 0xffff0000, 0xff000000);
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

    public boolean zzeB()
    {
        return Build.DEVICE.startsWith("generic");
    }

    public boolean zzeC()
    {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public String zzz(Context context)
    {
        context = context.getContentResolver();
        if (context == null)
        {
            context = null;
        } else
        {
            context = android.provider.Settings.Secure.getString(context, "android_id");
        }
        if (context == null || zzeB())
        {
            context = "emulator";
        }
        return zzX(context);
    }

}
