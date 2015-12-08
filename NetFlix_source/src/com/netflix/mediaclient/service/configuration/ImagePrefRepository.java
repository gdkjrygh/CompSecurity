// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration;

import android.content.Context;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.PreferenceUtils;
import com.netflix.mediaclient.util.StringUtils;

public class ImagePrefRepository
{

    private static final String PREF_NAME = "image_pref";
    private static final String TAG = "nf_service_configuration_imagepref";
    private String mImagePref;

    public ImagePrefRepository(Context context)
    {
        mImagePref = null;
        mImagePref = PreferenceUtils.getStringPref(context, "image_pref", null);
        if (StringUtils.isEmpty(mImagePref))
        {
            Log.d("nf_service_configuration_imagepref", "Image preference override not found.");
        } else
        if (Log.isLoggable("nf_service_configuration_imagepref", 3))
        {
            Log.d("nf_service_configuration_imagepref", (new StringBuilder()).append("Image preference override found:").append(mImagePref).toString());
            return;
        }
    }

    public static void clearRecords(Context context)
    {
        PreferenceUtils.removePref(context, "image_pref");
    }

    public String getImgPreference()
    {
        return mImagePref;
    }

    public void update(Context context, String s)
    {
        Log.d("nf_service_configuration_imagepref", String.format("override device image pref to %s", new Object[] {
            s
        }));
        if (s != null)
        {
            PreferenceUtils.putStringPref(context, "image_pref", s);
            return;
        } else
        {
            clearRecords(context);
            return;
        }
    }
}
