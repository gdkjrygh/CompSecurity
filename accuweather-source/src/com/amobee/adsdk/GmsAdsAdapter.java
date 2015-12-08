// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.adsdk;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.view.View;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

// Referenced classes of package com.amobee.adsdk:
//            BaseAdapter, AdManager, Parameters, Log, 
//            IAmobeeListener, NetworkHelper

class GmsAdsAdapter extends BaseAdapter
{

    private AdRequest adRequest;
    private AdView adView;
    private boolean firedOnOverly;
    private Method method;

    GmsAdsAdapter(Context context, Parameters parameters, String s, String s1, String s2)
    {
        super(context, parameters);
        firedOnOverly = false;
        super.networkName = "adMob";
        setAdspace(s2);
        adView = new AdView((Activity)context);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId(s);
        adView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2, 17));
        adRequest = (new com.google.android.gms.ads.AdRequest.Builder()).addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build();
        updateParameters(parameters);
        adView.setAdListener(new AdListener() {

            final GmsAdsAdapter this$0;

            public void onAdClosed()
            {
                fireOnOverlay(false);
                am.setIsExpanded(false);
            }

            public void onAdFailedToLoad(int i)
            {
                if (i == 2)
                {
                    fireAdFailed(networkName, false);
                    return;
                } else
                {
                    fireAdFailed(networkName, true);
                    return;
                }
            }

            public void onAdLeftApplication()
            {
                AmobeeAdPlaceholder amobeeadplaceholder = getPlaceHolder();
                am.getAmobeeListener().amobeeOnLeavingApplication(amobeeadplaceholder);
                if (firedOnOverly)
                {
                    return;
                } else
                {
                    NetworkHelper.sendNotification(GmsAdsAdapter.createNotificationURL(29, getCorrelator()));
                    firedOnOverly = true;
                    return;
                }
            }

            public void onAdLoaded()
            {
                am.setPassbackURL("");
                firedOnOverly = false;
                fireAdRecieved(networkName);
            }

            public void onAdOpened()
            {
                am.setIsExpanded(true);
                if (firedOnOverly)
                {
                    AmobeeAdPlaceholder amobeeadplaceholder = getPlaceHolder();
                    am.fireOnOverlay(true, amobeeadplaceholder);
                    return;
                } else
                {
                    fireOnOverlay(true);
                    firedOnOverly = true;
                    return;
                }
            }

            
            {
                this$0 = GmsAdsAdapter.this;
                super();
            }
        });
        if (s1 != null)
        {
            super.setCorrelator(s1);
        }
        getAd();
    }

    private transient Method getGmsMethod(String s, Class aclass[])
    {
        try
        {
            s = com/google/android/gms/ads/AdRequest$Builder.getMethod(s, aclass);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return s;
    }

    public void adFailed()
    {
    }

    public void adRecieved()
    {
    }

    public void getAd()
    {
        updateParameters(am.parameters());
        adView.loadAd(adRequest);
    }

    public View getAdView()
    {
        return adView;
    }

    public void onError()
    {
    }

    public void onLeavingApplication()
    {
    }

    public void onOverlay()
    {
    }

    public void onOverlayDismissed()
    {
    }

    public void updateParameters(Parameters parameters)
    {
        com.google.android.gms.ads.AdRequest.Builder builder;
        Object obj;
        int i;
        super.setParameters(parameters);
        builder = new com.google.android.gms.ads.AdRequest.Builder();
        obj = parameters.getDob();
        if (obj != null)
        {
            Method method1 = getGmsMethod("setBirthday", new Class[] {
                java/util/Date
            });
            method = method1;
            if (method1 != null)
            {
                (new SimpleDateFormat("yyyyMMDD")).format(((Date) (obj)));
                Method method2;
                int j;
                try
                {
                    method.invoke(builder, new Object[] {
                        obj
                    });
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    Log.d("[a\u2022mo\u2022bee]", "Exception while invoking method");
                }
            }
        }
        obj = parameters.getGender();
        if (parameters.getGender() != null && !parameters.getGender().equals(""))
        {
            method2 = getGmsMethod("setGender", new Class[] {
                Integer.TYPE
            });
            method = method2;
            if (method2 != null)
            {
                try
                {
                    if (((String) (obj)).equals("m"))
                    {
                        method.invoke(builder, new Object[] {
                            Integer.valueOf(1)
                        });
                    }
                    if (((String) (obj)).equals("f"))
                    {
                        method.invoke(builder, new Object[] {
                            Integer.valueOf(2)
                        });
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    Log.d("[a\u2022mo\u2022bee]", "Exception while invoking method");
                }
            }
        }
        obj = parameters.getKeywords(Parameters.KEYWORD);
        if (obj == null) goto _L2; else goto _L1
_L1:
        method2 = getGmsMethod("addKeyword", new Class[] {
            java/lang/String
        });
        method = method2;
        if (method2 == null) goto _L2; else goto _L3
_L3:
        j = obj.length;
        i = 0;
_L6:
        if (i < j) goto _L4; else goto _L2
_L2:
        if (parameters.getLocation() != null)
        {
            obj = getGmsMethod("setLocation", new Class[] {
                android/location/Location
            });
            method = ((Method) (obj));
            Object obj1;
            Exception exception1;
            if (obj != null)
            {
                try
                {
                    method.invoke(builder, new Object[] {
                        parameters.getLocation()
                    });
                }
                catch (Exception exception)
                {
                    Log.d("[a\u2022mo\u2022bee]", "Exception while invoking method");
                }
            }
        }
        parameters = parameters.getContentUrl();
        if (parameters != null && !parameters.equals(""))
        {
            obj = getGmsMethod("setContentUrl", new Class[] {
                java/lang/String
            });
            method = ((Method) (obj));
            if (obj != null)
            {
                Log.d("[a\u2022mo\u2022bee]", "invoking setContentUrl!");
                try
                {
                    method.invoke(builder, new Object[] {
                        parameters
                    });
                }
                // Misplaced declaration of an exception variable
                catch (Parameters parameters)
                {
                    Log.d("[a\u2022mo\u2022bee]", "Exception while invoking method");
                }
            }
        }
        adRequest = builder.addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build();
        return;
_L4:
        obj1 = obj[i];
        try
        {
            method.invoke(builder, new Object[] {
                obj1
            });
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception1)
        {
            Log.d("[a\u2022mo\u2022bee]", "Exception while invoking method");
        }
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }


}
