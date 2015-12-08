// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.ssp;

import android.content.Context;
import android.view.View;
import com.facebook.ads.AdSize;
import com.facebook.ads.internal.adapters.l;
import com.facebook.ads.internal.d;
import com.facebook.ads.internal.e;
import com.facebook.ads.internal.view.c;
import org.json.JSONObject;

public class ANAdRenderer
{

    public ANAdRenderer()
    {
    }

    public static String getSupportedCapabilities()
    {
        return d.c();
    }

    public static int getTemplateID(int i, int j)
    {
        AdSize adsize = AdSize.fromWidthAndHeight(i, j);
        if (adsize == null)
        {
            throw new IllegalArgumentException("unrecognized width/height");
        }
        switch (_cls1.a[adsize.ordinal()])
        {
        default:
            return e.b.a();

        case 1: // '\001'
            return e.f.a();

        case 2: // '\002'
            return e.e.a();

        case 3: // '\003'
            return e.d.a();

        case 4: // '\004'
            return e.c.a();
        }
    }

    public static View renderAd(Context context, JSONObject jsonobject, int i, int j, int k, Listener listener)
    {
        try
        {
            context = new c(context, l.a(jsonobject), k, listener);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            listener.onAdError(context);
            return null;
        }
        return context;
    }

    private class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[AdSize.values().length];
            try
            {
                a[AdSize.INTERSTITIAL.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                a[AdSize.RECTANGLE_HEIGHT_250.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[AdSize.BANNER_HEIGHT_90.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[AdSize.BANNER_HEIGHT_50.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class Listener
    {

        public abstract void onAdClick();

        public abstract void onAdClose();

        public abstract void onAdError(Throwable throwable);

        public abstract void onAdImpression();
    }

}
