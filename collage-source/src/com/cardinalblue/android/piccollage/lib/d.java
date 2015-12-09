// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.lib;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.volley.r;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.model.gson.PICDeviceConfig;
import com.google.b.f;
import org.json.JSONException;

public class d
{

    private PICDeviceConfig a;
    private com.android.volley.k b;

    public d()
    {
        b();
    }

    static void a(d d1, PICDeviceConfig picdeviceconfig)
    {
        d1.a(picdeviceconfig);
    }

    private void a(PICDeviceConfig picdeviceconfig)
    {
        if (a == null || a.getAmplitudeSubsamplingProb() != picdeviceconfig.getAmplitudeSubsamplingProb())
        {
            float f1 = picdeviceconfig.getAmplitudeSubsamplingProb();
            android.content.SharedPreferences.Editor editor = k.j().edit();
            boolean flag;
            if (Math.random() < (double)f1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            editor.putBoolean("pref_is_report_amplitude", flag).apply();
        }
        a = picdeviceconfig;
        b(a);
    }

    private void b()
    {
        c();
    }

    private void b(PICDeviceConfig picdeviceconfig)
    {
        String s = (new f()).a(picdeviceconfig);
        android.content.SharedPreferences.Editor editor = k.j().edit();
        if (!TextUtils.isEmpty(s))
        {
            editor.putString("pref_device_configuration", s);
        }
        editor.putLong("pref_key_paid_sticker_expire_time", (long)(picdeviceconfig.getVideoAdsExpiredDay() * 24F * 60F * 60F * 1000F)).apply();
    }

    private void c()
    {
        String s = k.j().getString("pref_device_configuration", "");
        if (TextUtils.isEmpty(s))
        {
            a(new com.cardinalblue.android.piccollage.model.gson.PICDeviceConfig.PICDeviceConfigDefault());
            return;
        }
        try
        {
            a((PICDeviceConfig)(new f()).a(s, com/cardinalblue/android/piccollage/model/gson/PICDeviceConfig));
            return;
        }
        catch (Throwable throwable)
        {
            k.j().edit().remove("pref_device_configuration").apply();
        }
        a(new com.cardinalblue.android.piccollage.model.gson.PICDeviceConfig.PICDeviceConfigDefault());
    }

    public PICDeviceConfig a()
    {
        return a;
    }

    public void a(Context context)
    {
        if (b != null && !b.y())
        {
            b.i();
        }
        b = com.cardinalblue.android.piccollage.controller.network.f.a(context, new com.android.volley.m.b() {

            final d a;

            public volatile void a(Object obj)
            {
                a((String)obj);
            }

            public void a(String s)
            {
                com.cardinalblue.android.piccollage.model.gson.PICDeviceConfig.PICServerDeviceConfig picserverdeviceconfig;
                try
                {
                    picserverdeviceconfig = (com.cardinalblue.android.piccollage.model.gson.PICDeviceConfig.PICServerDeviceConfig)k.b(s, com/cardinalblue/android/piccollage/model/gson/PICDeviceConfig$PICServerDeviceConfig);
                }
                catch (JSONException jsonexception)
                {
                    com.cardinalblue.android.piccollage.a.f.a(new JSONException((new StringBuilder()).append("response : ").append(s).toString()));
                    com.cardinalblue.android.piccollage.a.b.aV();
                    return;
                }
                if (picserverdeviceconfig == null)
                {
                    break MISSING_BLOCK_LABEL_25;
                }
                d.a(a, picserverdeviceconfig.getConfig());
            }

            
            {
                a = d.this;
                super();
            }
        }, new com.android.volley.m.a() {

            final d a;

            public void a(r r)
            {
                com.cardinalblue.android.piccollage.a.b.aV();
            }

            
            {
                a = d.this;
                super();
            }
        });
    }

    public String toString()
    {
        return a.toString();
    }
}
