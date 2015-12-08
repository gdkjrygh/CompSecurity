// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.location;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Address;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.google.android.gms.common.b;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.skype.android.config.ecs.EcsConfiguration;

public class LocationUtil
{

    public LocationUtil()
    {
    }

    private int dpToPx(DisplayMetrics displaymetrics, int i)
    {
        return Math.round(TypedValue.applyDimension(1, i, displaymetrics));
    }

    private static LatLngBounds getBounds(LatLng alatlng[])
    {
        com.google.android.gms.maps.model.LatLngBounds.a a = new com.google.android.gms.maps.model.LatLngBounds.a();
        int j = alatlng.length;
        for (int i = 0; i < j; i++)
        {
            a.a(alatlng[i]);
        }

        return a.a();
    }

    private boolean isGPServiceAvailable(Context context)
    {
        if (context != null)
        {
            b.a();
            if (b.a(context) == 0)
            {
                return true;
            }
        }
        return false;
    }

    public String getAddressString(Address address, int i)
    {
        StringBuilder stringbuilder = new StringBuilder();
        int k = address.getMaxAddressLineIndex();
        for (int j = 0; j < k; j++)
        {
            stringbuilder.append(address.getAddressLine(j));
            if (j < k - 1)
            {
                stringbuilder.append(", ");
            }
        }

        return getAddressString(stringbuilder.toString(), i);
    }

    public String getAddressString(com.skype.Message.GetLocation_Result getlocation_result, int i)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (!TextUtils.isEmpty(getlocation_result.m_pointOfInterest) && !TextUtils.isEmpty(getlocation_result.m_address) && !getlocation_result.m_address.startsWith(getlocation_result.m_pointOfInterest))
        {
            stringbuilder.append(getlocation_result.m_pointOfInterest).append(", ");
        }
        stringbuilder.append(getlocation_result.m_address);
        return getAddressString(stringbuilder.toString(), i);
    }

    public String getAddressString(String s, int i)
    {
        if (!TextUtils.isEmpty(s) && i > 0)
        {
            String as[] = s.split(",", i);
            if (as.length > 0)
            {
                s = new StringBuilder(as[0]);
                for (i = 1; i < as.length; i++)
                {
                    s.append(',').append('\n').append(as[i].trim());
                }

                s = s.toString();
            }
            return s;
        } else
        {
            return "";
        }
    }

    public a getCameraUpdateWithLocations(LatLng alatlng[], DisplayMetrics displaymetrics, int i)
    {
        return CameraUpdateFactory.newLatLngBounds(getBounds(alatlng), dpToPx(displaymetrics, i));
    }

    public Bitmap getReceivedMarker(Context context, int i, boolean flag)
    {
        int j = 0x7f0201d5;
        if (flag)
        {
            j = 0x7f0201d6;
        }
        context = BitmapFactory.decodeResource(context.getResources(), j);
        float f = (float)i / (float)context.getHeight();
        return Bitmap.createScaledBitmap(context, Math.round((float)context.getWidth() * f), Math.round((float)context.getHeight() * f), true);
    }

    public boolean isLocationSendingEnabled(Context context, EcsConfiguration ecsconfiguration)
    {
        return isGPServiceAvailable(context) && ecsconfiguration.isLocationSendingEnabled();
    }

    public boolean isLocationSharingEnabled(Context context, EcsConfiguration ecsconfiguration)
    {
        return isGPServiceAvailable(context) && ecsconfiguration.isLocationSharingEnabled();
    }
}
