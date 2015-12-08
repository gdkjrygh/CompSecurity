// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;

import android.net.Uri;

// Referenced classes of package com.adjust.sdk:
//            ILogger, AdjustFactory, ActivityHandler, AdjustConfig, 
//            AdjustEvent

public class AdjustInstance
{

    private ActivityHandler activityHandler;
    private String referrer;
    private long referrerClickTime;

    public AdjustInstance()
    {
    }

    private boolean checkActivityHandler()
    {
        if (activityHandler == null)
        {
            getLogger().error("Adjust not initialized correctly", new Object[0]);
            return false;
        } else
        {
            return true;
        }
    }

    private static ILogger getLogger()
    {
        return AdjustFactory.getLogger();
    }

    public void appWillOpenUrl(Uri uri)
    {
        if (!checkActivityHandler())
        {
            return;
        } else
        {
            long l = System.currentTimeMillis();
            activityHandler.readOpenUrl(uri, l);
            return;
        }
    }

    public boolean isEnabled()
    {
        if (!checkActivityHandler())
        {
            return false;
        } else
        {
            return activityHandler.isEnabled();
        }
    }

    public void onCreate(AdjustConfig adjustconfig)
    {
        if (activityHandler != null)
        {
            getLogger().error("Adjust already initialized", new Object[0]);
            return;
        } else
        {
            adjustconfig.referrer = referrer;
            adjustconfig.referrerClickTime = referrerClickTime;
            activityHandler = ActivityHandler.getInstance(adjustconfig);
            return;
        }
    }

    public void onPause()
    {
        if (!checkActivityHandler())
        {
            return;
        } else
        {
            activityHandler.trackSubsessionEnd();
            return;
        }
    }

    public void onResume()
    {
        if (!checkActivityHandler())
        {
            return;
        } else
        {
            activityHandler.trackSubsessionStart();
            return;
        }
    }

    public void sendReferrer(String s)
    {
        long l = System.currentTimeMillis();
        if (activityHandler == null)
        {
            referrer = s;
            referrerClickTime = l;
            return;
        } else
        {
            activityHandler.sendReferrer(s, l);
            return;
        }
    }

    public void setEnabled(boolean flag)
    {
        if (!checkActivityHandler())
        {
            return;
        } else
        {
            activityHandler.setEnabled(flag);
            return;
        }
    }

    public void setOfflineMode(boolean flag)
    {
        if (!checkActivityHandler())
        {
            return;
        } else
        {
            activityHandler.setOfflineMode(flag);
            return;
        }
    }

    public void trackEvent(AdjustEvent adjustevent)
    {
        if (!checkActivityHandler())
        {
            return;
        } else
        {
            activityHandler.trackEvent(adjustevent);
            return;
        }
    }
}
