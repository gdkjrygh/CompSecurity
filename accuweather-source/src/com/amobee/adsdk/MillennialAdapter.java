// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.adsdk;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import com.millennialmedia.android.MMAd;
import com.millennialmedia.android.MMAdView;
import com.millennialmedia.android.MMException;
import com.millennialmedia.android.MMLog;
import com.millennialmedia.android.MMRequest;
import com.millennialmedia.android.MMSDK;
import com.millennialmedia.android.RequestListener;
import java.util.Hashtable;
import java.util.Map;

// Referenced classes of package com.amobee.adsdk:
//            BaseAdapter, AdManager, Parameters, IAmobeeListener, 
//            NetworkHelper, AmobeeAdPlaceholder

class MillennialAdapter extends BaseAdapter
    implements RequestListener
{

    private static final int BANNER_AD_HEIGHT = 50;
    private static final int BANNER_AD_WIDTH = 320;
    private static final int IAB_LEADERBOARD_HEIGHT = 90;
    private static final int IAB_LEADERBOARD_WIDTH = 728;
    private static final int MED_BANNER_HEIGHT = 60;
    private static final int MED_BANNER_WIDTH = 480;
    private MMAdView adView;
    AdManager am;
    private boolean didReportClick;
    private Hashtable map;
    AmobeeAdPlaceholder placeholder;
    MMRequest request;

    MillennialAdapter(Context context, Parameters parameters, String s, String s1, AmobeeAdPlaceholder amobeeadplaceholder, String s2)
    {
        int i;
        int j;
        super(context, parameters);
        am = AdManager.getInstance();
        didReportClick = false;
        setAdspace(s2);
        super.networkName = "clMmi";
        map = new Hashtable();
        placeholder = amobeeadplaceholder;
        updateParameters(parameters);
        parameters = AdManager.getInstance();
        try
        {
            MMSDK.initialize(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            adFailed();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            adFailed();
            return;
        }
        adView = new MMAdView(context);
        adView.setApid(s);
        if (AdManager.debugLevel == AdManager.DebugLevel.DEBUG)
        {
            MMLog.setLogLevel(1);
        }
        j = 320;
        i = 50;
        if (!canFit(728)) goto _L2; else goto _L1
_L1:
        j = 728;
        i = 90;
_L4:
        adView.setWidth(j);
        adView.setHeight(i);
        context = new android.widget.RelativeLayout.LayoutParams((int)TypedValue.applyDimension(1, j, m_context.getResources().getDisplayMetrics()), (int)TypedValue.applyDimension(1, i, m_context.getResources().getDisplayMetrics()));
        context.addRule(10);
        context.addRule(14);
        adView.setLayoutParams(context);
        request = new MMRequest();
        request.setMetaValues(map);
        if (parameters.parameters().lastKnownLocation != null)
        {
            MMRequest.setUserLocation(parameters.parameters().lastKnownLocation);
        }
        adView.setMMRequest(request);
        adView.setId(MMSDK.getDefaultAdId());
        adView.setListener(this);
        if (s1 != null)
        {
            super.setCorrelator(s1);
        }
        getAd();
        return;
_L2:
        if (canFit(480))
        {
            j = 480;
            i = 60;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void MMAdOverlayClosed(MMAd mmad)
    {
        onOverlayDismissed();
    }

    public void MMAdOverlayLaunched(MMAd mmad)
    {
        onOverlay();
    }

    public void MMAdRequestIsCaching(MMAd mmad)
    {
    }

    public void adFailed()
    {
        adFailed(false);
    }

    public void adFailed(boolean flag)
    {
        didReportClick = false;
        super.fireAdFailed(networkName, flag);
    }

    public void adRecieved()
    {
        am.setPassbackURL("");
        didReportClick = false;
        super.fireAdRecieved(networkName);
    }

    protected boolean canFit(int i)
    {
        i = (int)TypedValue.applyDimension(1, i, m_context.getResources().getDisplayMetrics());
        return m_context.getResources().getDisplayMetrics().widthPixels >= i;
    }

    public void getAd()
    {
        updateParameters(am.parameters());
        request.setMetaValues(map);
        adView.getAd();
    }

    public View getAdView()
    {
        return adView;
    }

    public void onError()
    {
        didReportClick = false;
        am.getAmobeeListener().amobeeOnError();
    }

    public void onLeavingApplication()
    {
        if (!didReportClick)
        {
            didReportClick = true;
            NetworkHelper.sendNotification(createNotificationURL(29, super.getCorrelator()));
        }
        AmobeeAdPlaceholder amobeeadplaceholder = getPlaceHolder();
        if (amobeeadplaceholder != null)
        {
            am.getAmobeeListener().amobeeOnLeavingApplication(amobeeadplaceholder);
        }
    }

    public void onOverlay()
    {
        if (!didReportClick)
        {
            didReportClick = true;
            super.fireOnOverlay(true);
        }
    }

    public void onOverlayDismissed()
    {
        super.fireOnOverlay(false);
        didReportClick = false;
    }

    public void onSingleTap(MMAd mmad)
    {
        onLeavingApplication();
    }

    public void requestCompleted(MMAd mmad)
    {
        adRecieved();
    }

    public void requestFailed(MMAd mmad, MMException mmexception)
    {
        int i = mmexception.getCode();
        if (i == 2 || i == 14 || i == 15)
        {
            adFailed(true);
            return;
        } else
        {
            adFailed(false);
            return;
        }
    }

    public void updateParameters(Parameters parameters)
    {
        String s;
        Object obj;
        int i;
        super.setParameters(parameters);
        if (parameters.getAge() != null && !parameters.getAge().equals(""))
        {
            map.put("age", parameters.getAge());
        } else
        {
            map.put("age", "unknown");
        }
        if (parameters.getGender() != null)
        {
            s = parameters.getGender();
            if (s.equals(""))
            {
                map.put("gender", "unknown");
            } else
            {
                obj = map;
                if (s.equals("m"))
                {
                    s = "male";
                } else
                {
                    s = "female";
                }
                ((Hashtable) (obj)).put("gender", s);
            }
        }
        if (parameters.getZip() != null && !parameters.getZip().equals(""))
        {
            map.put("zip", parameters.getZip());
        }
        obj = parameters.getKeywords(Parameters.KEYWORD);
        if (obj == null || obj.equals("")) goto _L2; else goto _L1
_L1:
        s = "";
        i = 0;
_L6:
        if (i < obj.length) goto _L4; else goto _L3
_L3:
        map.put("keywords", s);
_L2:
        s = (String)parameters.getParameters().get("income");
        if (s != null && !s.equals(""))
        {
            map.put("income", s);
        }
        s = (String)parameters.getParameters().get("ethnicity");
        if (s != null && !s.equals(""))
        {
            map.put("ethnicity", s);
        }
        s = (String)parameters.getParameters().get("children");
        if (s != null && !s.equals(""))
        {
            map.put("children", s);
        }
        s = (String)parameters.getParameters().get("education");
        if (s != null && !s.equals(""))
        {
            map.put("education", s);
        }
        s = (String)parameters.getParameters().get("politics");
        if (s != null && !s.equals(""))
        {
            map.put("politics", s);
        }
        parameters = (String)parameters.getParameters().get("marital");
        if (parameters != null && !parameters.equals(""))
        {
            map.put("marital", parameters);
        }
        if (placeholder.getBannerHeight(false) != 0)
        {
            map.put("hsht", (new StringBuilder(String.valueOf(placeholder.getBannerHeight(false)))).toString());
        }
        if (placeholder.getBannerWidth(false) != 0)
        {
            map.put("hswd", (new StringBuilder(String.valueOf(placeholder.getBannerWidth(false)))).toString());
        }
        return;
_L4:
        if (!s.equals(""))
        {
            s = (new StringBuilder(String.valueOf(s))).append(",").append(obj[i]).toString();
        } else
        {
            s = (new StringBuilder(String.valueOf(s))).append(obj[i]).toString();
        }
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
