// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services.request;

import android.content.Context;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.accuweather.android.services.request:
//            NativeGeocoder, BingGeocoder

public class CompositeGeocoder
{

    private BingGeocoder bingGeocoder;
    private NativeGeocoder nativeGeocoder;

    public CompositeGeocoder(Context context)
    {
        nativeGeocoder = new NativeGeocoder(context);
        bingGeocoder = new BingGeocoder(context);
    }

    public List geocode(Double double1, Double double2)
        throws IOException
    {
        if (double1 != null && double2 != null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        return new ArrayList();
        List list = nativeGeocoder.geocode(double1, double2);
        return list;
        Exception exception;
        exception;
        try
        {
            double1 = bingGeocoder.geocode(double1, double2);
        }
        // Misplaced declaration of an exception variable
        catch (Double double1)
        {
            throw new IOException(double1);
        }
        return double1;
    }

    public List geocode(String s)
        throws IOException
    {
        List list;
        try
        {
            list = nativeGeocoder.geocode(s);
        }
        catch (Exception exception)
        {
            try
            {
                s = bingGeocoder.geocode(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new IOException(s);
            }
            return s;
        }
        return list;
    }
}
