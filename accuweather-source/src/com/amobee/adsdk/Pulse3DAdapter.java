// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.adsdk;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.amobee.pulse3d.Pulse3DView;
import com.amobee.pulse3d.Pulse3DViewListener;
import com.amobee.richmedia.view.Browser;
import java.util.Map;

// Referenced classes of package com.amobee.adsdk:
//            BaseAdapter, AdManager, Parameters, AmobeeAdPlaceholder, 
//            Log, IAmobeeListener

class Pulse3DAdapter extends BaseAdapter
    implements Pulse3DViewListener
{

    static final String TAG = "Pulse3DAdapter";
    boolean adIsLoadingFromCache;
    private boolean adReceivedDispatched;
    private String mAdURL;
    private Pulse3DView mPulse3DView;
    private boolean useCache;

    Pulse3DAdapter(Context context, Parameters parameters)
    {
        super(context, parameters);
        useCache = true;
        adReceivedDispatched = false;
        adIsLoadingFromCache = false;
        networkName = "Pulse3D";
        if (AdManager.debugLevel == AdManager.DebugLevel.DEBUG)
        {
            Pulse3DView.debugLevel = com.amobee.pulse3d.Log.DebugLevel.DEBUG;
        }
        mPulse3DView = new Pulse3DView(context);
        mPulse3DView.setAdkUniqueUserId((String)parameters.getParameters().get("androidaid"));
        mPulse3DView.setPulse3DViewListener(this);
    }

    public void adFailed()
    {
    }

    public void adRecieved()
    {
    }

    protected android.view.ViewGroup.LayoutParams defaultLayoutParams(AmobeeAdPlaceholder amobeeadplaceholder)
    {
        android.view.ViewGroup.LayoutParams layoutparams = amobeeadplaceholder.getLayoutParams();
        int i = layoutparams.width;
        int j = layoutparams.height;
        if (-1 == layoutparams.width || -2 == layoutparams.width || -1 == layoutparams.width)
        {
            i = (int)((double)amobeeadplaceholder.mDefaultBannerWidth * am.getDensity());
        }
        if (-1 == layoutparams.height || -2 == layoutparams.height || -1 == layoutparams.height)
        {
            j = (int)((double)amobeeadplaceholder.mDefaultBannerHeight * am.getDensity());
        }
        return new android.widget.FrameLayout.LayoutParams(i, j);
    }

    public void getAd()
    {
    }

    String getAdURL()
    {
        return mAdURL;
    }

    public View getAdView()
    {
        return mPulse3DView;
    }

    boolean isAdCached(String s)
    {
        return Pulse3DView.isAdCached(m_context, mAdURL);
    }

    public void onEndTransition(Pulse3DView pulse3dview, boolean flag)
    {
        if (!flag)
        {
            onOverlayDismissed();
            am.setIsExpanded(false);
            pulse3dview = getPlaceHolder();
            am.fireOnOverlay(false, pulse3dview);
            am.getAd(true, am.getPlaceholders());
        }
    }

    public void onError()
    {
    }

    public void onFailLoadingSceneAtURL(final Pulse3DView view, String s, Error error)
    {
        am.parameters().getParameters().put("pulse3d", "2");
        mAdURL = null;
        Log.d("Pulse3DAdapter", "onFailLoadingSceneAtURL");
        ((AmobeeAdPlaceholder)view.getParent()).post(new Runnable() {

            final Pulse3DAdapter this$0;
            private final Pulse3DView val$view;

            public void run()
            {
                view.setVisibility(4);
                fireAdFailed(networkName, false);
            }

            
            {
                this$0 = Pulse3DAdapter.this;
                view = pulse3dview;
                super();
            }
        });
    }

    public void onFinishLoadingSceneAtURL(final Pulse3DView view, final String placeholder)
    {
        Log.d("Pulse3DAdapter", "onFinishLoadingSceneAtURL");
        placeholder = (AmobeeAdPlaceholder)view.getParent();
        if (adReceivedDispatched)
        {
            return;
        } else
        {
            placeholder.post(new Runnable() {

                final Pulse3DAdapter this$0;
                private final AmobeeAdPlaceholder val$placeholder;
                private final Pulse3DView val$view;

                public void run()
                {
                    placeholder.setCurrentAdapter(Pulse3DAdapter.this);
                    view.setVisibility(0);
                    placeholder.setNextAdapter(null);
                    do
                    {
                        if (placeholder.getChildCount() <= 1)
                        {
                            fireAdRecieved(networkName);
                            return;
                        }
                        if (placeholder.getChildAt(0) != mPulse3DView)
                        {
                            placeholder.removeViewAt(0);
                        } else
                        {
                            placeholder.removeViewAt(1);
                        }
                    } while (true);
                }

            
            {
                this$0 = Pulse3DAdapter.this;
                placeholder = amobeeadplaceholder;
                view = pulse3dview;
                super();
            }
            });
            am.parameters().getParameters().put("pulse3d", "2");
            return;
        }
    }

    public void onLeavingApplication()
    {
    }

    public void onLeavingApplication(Pulse3DView pulse3dview)
    {
        pulse3dview = getPlaceHolder();
        am.getAmobeeListener().amobeeOnLeavingApplication(pulse3dview);
    }

    public void onOverlay()
    {
        fireOnOverlay(true);
    }

    public void onOverlayDismissed()
    {
    }

    public void onStartTransition(Pulse3DView pulse3dview, boolean flag)
    {
        if (flag)
        {
            onOverlay();
            am.setIsExpanded(true);
        }
    }

    public void setURLFromFragment(String s)
    {
        String s1;
        adReceivedDispatched = false;
        s1 = "";
        int i = s.indexOf("<Pulse3DFileLocation>") + "<Pulse3DFileLocation>".length();
        if (i > -1)
        {
            s = s.substring(i);
            i = s.indexOf("</Pulse3DFileLocation>");
            s1 = s;
            if (i > -1)
            {
                s1 = s.substring(0, i);
            }
        }
        adIsLoadingFromCache = Pulse3DView.isAdCached(m_context, s1);
        s = (AmobeeAdPlaceholder)mPulse3DView.getParent();
        if (shouldUseDefaultLayoutParms(s))
        {
            mPulse3DView.setLayoutParams(defaultLayoutParams(s));
        }
        if (mAdURL != null && s1.equals(mAdURL) && s1.equals(mPulse3DView.getURL()))
        {
            break MISSING_BLOCK_LABEL_222;
        }
        mPulse3DView.loadSceneAtURL(s1, useCache);
        if (s.getWindowVisibility() != 8) goto _L2; else goto _L1
_L1:
        adReceivedDispatched = true;
        s.setCurrentAdapter(this);
        mPulse3DView.setVisibility(0);
        s.setNextAdapter(null);
_L5:
        if (s.getChildCount() > 1) goto _L4; else goto _L3
_L3:
        fireAdRecieved(networkName);
_L2:
        mAdURL = s1;
        return;
_L4:
        if (s.getChildAt(0) != mPulse3DView)
        {
            s.removeViewAt(0);
        } else
        {
            s.removeViewAt(1);
        }
          goto _L5
        Log.d("Pulse3DAdapter", "consecutive pulse3d url, will not reload, just register impression again");
        mPulse3DView.registerImpressionAgain();
        super.fireAdRecieved(networkName);
          goto _L2
    }

    boolean shouldUseDefaultLayoutParms(AmobeeAdPlaceholder amobeeadplaceholder)
    {
        if (amobeeadplaceholder != null)
        {
            for (amobeeadplaceholder = amobeeadplaceholder.getLayoutParams(); -1 == ((android.view.ViewGroup.LayoutParams) (amobeeadplaceholder)).width || -2 == ((android.view.ViewGroup.LayoutParams) (amobeeadplaceholder)).width || -1 == ((android.view.ViewGroup.LayoutParams) (amobeeadplaceholder)).width || -1 == ((android.view.ViewGroup.LayoutParams) (amobeeadplaceholder)).height || -2 == ((android.view.ViewGroup.LayoutParams) (amobeeadplaceholder)).height || -1 == ((android.view.ViewGroup.LayoutParams) (amobeeadplaceholder)).height;)
            {
                return true;
            }

        }
        return false;
    }

    protected void updateParameters(Parameters parameters)
    {
    }

    public boolean webLinkOutRequested(String s, boolean flag)
    {
        Log.d("Pulse3DAdapter", (new StringBuilder("open URL:")).append(s).toString());
        try
        {
            Intent intent = new Intent(m_context, com/amobee/richmedia/view/Browser);
            intent.putExtra("extra_url", s);
            intent.putExtra("open_show_back", true);
            intent.putExtra("open_show_forward", true);
            intent.putExtra("open_show_refresh", true);
            intent.addFlags(0x10000000);
            m_context.startActivity(intent);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return true;
    }

}
