// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

// Referenced classes of package com.millennialmedia.android:
//            MMLog, MMAdImplController, MMAdImpl, MMAd

public class MMBroadcastReceiver extends BroadcastReceiver
{

    public static final String ACTION_AD_SINGLE_TAP = "millennialmedia.action.ACTION_AD_SINGLE_TAP";
    public static final String ACTION_DISPLAY_STARTED = "millennialmedia.action.ACTION_DISPLAY_STARTED";
    public static final String ACTION_FETCH_FAILED = "millennialmedia.action.ACTION_FETCH_FAILED";
    public static final String ACTION_FETCH_STARTED_CACHING = "millennialmedia.action.ACTION_FETCH_STARTED_CACHING";
    public static final String ACTION_FETCH_SUCCEEDED = "millennialmedia.action.ACTION_FETCH_SUCCEEDED";
    public static final String ACTION_GETAD_FAILED = "millennialmedia.action.ACTION_GETAD_FAILED";
    public static final String ACTION_GETAD_SUCCEEDED = "millennialmedia.action.ACTION_GETAD_SUCCEEDED";
    public static final String ACTION_INTENT_STARTED = "millennialmedia.action.ACTION_INTENT_STARTED";
    public static final String ACTION_OVERLAY_CLOSED = "millennialmedia.action.ACTION_OVERLAY_CLOSED";
    public static final String ACTION_OVERLAY_OPENED = "millennialmedia.action.ACTION_OVERLAY_OPENED";
    public static final String ACTION_OVERLAY_TAP = "millennialmedia.action.ACTION_OVERLAY_TAP";
    public static final String CATEGORY_SDK = "millennialmedia.category.CATEGORY_SDK";
    private static final String TAG = "MMBroadcastReceiver";

    public MMBroadcastReceiver()
    {
    }

    public static IntentFilter createIntentFilter()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addCategory("millennialmedia.category.CATEGORY_SDK");
        intentfilter.addAction("millennialmedia.action.ACTION_DISPLAY_STARTED");
        intentfilter.addAction("millennialmedia.action.ACTION_FETCH_FAILED");
        intentfilter.addAction("millennialmedia.action.ACTION_FETCH_SUCCEEDED");
        intentfilter.addAction("millennialmedia.action.ACTION_FETCH_STARTED_CACHING");
        intentfilter.addAction("millennialmedia.action.ACTION_GETAD_FAILED");
        intentfilter.addAction("millennialmedia.action.ACTION_GETAD_SUCCEEDED");
        intentfilter.addAction("millennialmedia.action.ACTION_INTENT_STARTED");
        intentfilter.addAction("millennialmedia.action.ACTION_OVERLAY_CLOSED");
        intentfilter.addAction("millennialmedia.action.ACTION_OVERLAY_OPENED");
        intentfilter.addAction("millennialmedia.action.ACTION_OVERLAY_TAP");
        intentfilter.addAction("millennialmedia.action.ACTION_AD_SINGLE_TAP");
        return intentfilter;
    }

    public void displayStarted(MMAd mmad)
    {
        MMLog.i("MMBroadcastReceiver", "Millennial Media display started.");
    }

    public void fetchFailure(MMAd mmad)
    {
        MMLog.i("MMBroadcastReceiver", "Millennial Media fetch failed.");
    }

    public void fetchFinishedCaching(MMAd mmad)
    {
        MMLog.i("MMBroadcastReceiver", "Millennial Media fetch finished caching.");
    }

    public void fetchStartedCaching(MMAd mmad)
    {
        MMLog.i("MMBroadcastReceiver", "Millennial Media fetch started caching.");
    }

    public void getAdFailure(MMAd mmad)
    {
        MMLog.i("MMBroadcastReceiver", "Millennial Media ad Failure.");
    }

    public void getAdSuccess(MMAd mmad)
    {
        MMLog.i("MMBroadcastReceiver", "Millennial Media ad Success.");
    }

    public void intentStarted(MMAd mmad, String s)
    {
        if (s != null)
        {
            MMLog.i("MMBroadcastReceiver", (new StringBuilder()).append("Millennial Media started intent: ").append(s).toString());
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        String s1 = intent.getAction();
        String s2 = intent.getStringExtra("packageName");
        long l = intent.getLongExtra("internalId", -4L);
        String s = null;
        if (context.getPackageName().equals(s2))
        {
            context = s;
            if (l != -4L)
            {
                MMAdImpl mmadimpl = MMAdImplController.getAdImplWithId(l);
                context = s;
                if (mmadimpl != null)
                {
                    context = mmadimpl.getCallingAd();
                }
            }
            StringBuilder stringbuilder = (new StringBuilder()).append(" @@ Intent - Ad in receiver = ");
            if (context == null)
            {
                s = " null";
            } else
            {
                s = context.toString();
            }
            MMLog.v("MMBroadcastReceiver", stringbuilder.append(s).toString());
            if (s1.equals("millennialmedia.action.ACTION_OVERLAY_OPENED"))
            {
                overlayOpened(context);
                return;
            }
            if (s1.equals("millennialmedia.action.ACTION_OVERLAY_CLOSED"))
            {
                overlayClosed(context);
                return;
            }
            if (s1.equals("millennialmedia.action.ACTION_OVERLAY_TAP"))
            {
                overlayTap(context);
                return;
            }
            if (s1.equals("millennialmedia.action.ACTION_AD_SINGLE_TAP"))
            {
                onSingleTap(context);
                return;
            }
            if (s1.equals("millennialmedia.action.ACTION_DISPLAY_STARTED"))
            {
                displayStarted(context);
                return;
            }
            if (s1.equals("millennialmedia.action.ACTION_FETCH_FAILED"))
            {
                fetchFailure(context);
                return;
            }
            if (s1.equals("millennialmedia.action.ACTION_FETCH_SUCCEEDED"))
            {
                fetchFinishedCaching(context);
                return;
            }
            if (s1.equals("millennialmedia.action.ACTION_FETCH_STARTED_CACHING"))
            {
                fetchStartedCaching(context);
                return;
            }
            if (s1.equals("millennialmedia.action.ACTION_GETAD_FAILED"))
            {
                getAdFailure(context);
                return;
            }
            if (s1.equals("millennialmedia.action.ACTION_GETAD_SUCCEEDED"))
            {
                getAdSuccess(context);
                return;
            }
            if (s1.equals("millennialmedia.action.ACTION_INTENT_STARTED"))
            {
                intentStarted(context, intent.getStringExtra("intentType"));
                return;
            }
        }
    }

    public void onSingleTap(MMAd mmad)
    {
        MMLog.i("MMBroadcastReceiver", "Millennial Media ad Tap.");
    }

    public void overlayClosed(MMAd mmad)
    {
        MMLog.i("MMBroadcastReceiver", "Millennial Media overlay closed.");
    }

    public void overlayOpened(MMAd mmad)
    {
        MMLog.i("MMBroadcastReceiver", "Millennial Media overlay opened.");
    }

    public void overlayTap(MMAd mmad)
    {
        MMLog.i("MMBroadcastReceiver", "Millennial Media overlay Tap.");
    }
}
