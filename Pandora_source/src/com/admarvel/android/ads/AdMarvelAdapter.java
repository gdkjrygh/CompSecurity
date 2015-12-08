// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.io.PrintStream;
import java.util.Map;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelAd, AdMarvelXMLReader, AdMarvelInterstitialAdapterListener, AdMarvelAdapterListener

public abstract class AdMarvelAdapter
{

    public AdMarvelAdapter()
    {
    }

    protected static AdMarvelAdapter createInstance(String s)
    {
        return (AdMarvelAdapter)createObject(s);
    }

    private static Object createObject(String s)
    {
        try
        {
            s = ((String) (Class.forName(s).newInstance()));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            System.out.println(s);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            System.out.println(s);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            System.out.println(s);
            return null;
        }
        return s;
    }

    protected abstract void cleanupView(View view);

    protected abstract void displayInterstitial(Activity activity, String s);

    public abstract String getAdapterVersion();

    protected abstract String getAdnetworkSDKVersionInfo();

    protected abstract void initialize(Activity activity, Map map);

    protected abstract AdMarvelAd loadAd(AdMarvelAd admarvelad, AdMarvelXMLReader admarvelxmlreader);

    protected abstract void pause(Activity activity, Map map);

    protected abstract void requestIntersitialNewAd(AdMarvelInterstitialAdapterListener admarvelinterstitialadapterlistener, Context context, AdMarvelAd admarvelad, Map map, int i, int j);

    protected abstract View requestNewAd(AdMarvelAdapterListener admarveladapterlistener, Context context, AdMarvelAd admarvelad, Map map, int i, int j);

    protected abstract void resume(Activity activity, Map map);

    protected abstract void uninitialize(Activity activity, Map map);
}
