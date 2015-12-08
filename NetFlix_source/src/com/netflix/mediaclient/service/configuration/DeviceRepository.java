// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration;

import android.content.Context;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.DeviceCategory;
import com.netflix.mediaclient.util.PreferenceUtils;

public class DeviceRepository
{

    private static final String PREF_NAME = "nf_device_category";
    private static final String TAG = "nf_device";
    private DeviceCategory category;

    public DeviceRepository(Context context)
    {
        context = PreferenceUtils.getStringPref(context, "nf_device_category", null);
        if (context != null) goto _L2; else goto _L1
_L1:
        Log.d("nf_device", "Device category override not found.");
_L4:
        category = DeviceCategory.find(context);
        if (Log.isLoggable("nf_device", 3))
        {
            Log.d("nf_device", (new StringBuilder()).append("Device category override is:").append(category).toString());
        }
        return;
_L2:
        if (Log.isLoggable("nf_device", 3))
        {
            Log.d("nf_device", (new StringBuilder()).append("Device category override found:").append(context).toString());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public DeviceCategory getCategory()
    {
        return category;
    }

    public void update(Context context, String s)
    {
        Log.d("nf_device", "Device category update start");
        if (category == null && s == null)
        {
            Log.d("nf_device", "Both new and old category are null! Do nothing.");
        } else
        {
            if (category != null && s == null)
            {
                if (Log.isLoggable("nf_device", 3))
                {
                    Log.d("nf_device", (new StringBuilder()).append("Old category was ").append(category).append(" and new category is null! Remove saved category!").toString());
                }
                category = null;
                PreferenceUtils.removePref(context, "nf_device_category");
                return;
            }
            s = DeviceCategory.find(s);
            if (s.equals(category))
            {
                if (Log.isLoggable("nf_device", 3))
                {
                    Log.d("nf_device", (new StringBuilder()).append("Both new and old category have the same value: ").append(s).append(". Do NOT update.").toString());
                    return;
                }
            } else
            {
                if (Log.isLoggable("nf_device", 3))
                {
                    Log.d("nf_device", (new StringBuilder()).append("Old category was ").append(category).append(" and new category is now ").append(s).toString());
                }
                category = s;
                PreferenceUtils.putStringPref(context, "nf_device_category", s.getValue());
                return;
            }
        }
    }
}
