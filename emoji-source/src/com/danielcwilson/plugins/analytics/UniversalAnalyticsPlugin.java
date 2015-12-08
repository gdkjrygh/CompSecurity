// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.danielcwilson.plugins.analytics;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Logger;
import com.google.android.gms.analytics.Tracker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

public class UniversalAnalyticsPlugin extends CordovaPlugin
{

    public static final String ADD_DIMENSION = "addCustomDimension";
    public static final String ADD_TRANSACTION = "addTransaction";
    public static final String ADD_TRANSACTION_ITEM = "addTransactionItem";
    public static final String DEBUG_MODE = "debugMode";
    public static final String SET_USER_ID = "setUserId";
    public static final String START_TRACKER = "startTrackerWithId";
    public static final String TRACK_EVENT = "trackEvent";
    public static final String TRACK_EXCEPTION = "trackException";
    public static final String TRACK_TIMING = "trackTiming";
    public static final String TRACK_VIEW = "trackView";
    public HashMap customDimensions;
    public Boolean debugModeEnabled;
    public Tracker tracker;
    public Boolean trackerStarted;

    public UniversalAnalyticsPlugin()
    {
        trackerStarted = Boolean.valueOf(false);
        debugModeEnabled = Boolean.valueOf(false);
        customDimensions = new HashMap();
    }

    private void addCustomDimension(String s, String s1, CallbackContext callbackcontext)
    {
        if (s != null && s.length() > 0 && s1 != null && s1.length() > 0)
        {
            customDimensions.put(s, s1);
            callbackcontext.success("custom dimension started");
            return;
        } else
        {
            callbackcontext.error("Expected non-empty string arguments.");
            return;
        }
    }

    private void addCustomDimensionsToTracker(Tracker tracker1)
    {
        String s;
        Object obj;
        for (Iterator iterator = customDimensions.entrySet().iterator(); iterator.hasNext(); tracker1.send(((com.google.android.gms.analytics.HitBuilders.AppViewBuilder)(new com.google.android.gms.analytics.HitBuilders.AppViewBuilder()).setCustomDimension(Integer.parseInt(s), ((String) (obj)))).build()))
        {
            obj = (java.util.Map.Entry)iterator.next();
            s = (String)((java.util.Map.Entry) (obj)).getKey();
            obj = (String)((java.util.Map.Entry) (obj)).getValue();
        }

    }

    private void addTransaction(String s, String s1, double d, double d1, double d2, String s2, CallbackContext callbackcontext)
    {
        if (!trackerStarted.booleanValue())
        {
            callbackcontext.error("Tracker not started");
            return;
        }
        addCustomDimensionsToTracker(tracker);
        if (s != null && s.length() > 0)
        {
            tracker.send((new com.google.android.gms.analytics.HitBuilders.TransactionBuilder()).setTransactionId(s).setAffiliation(s1).setRevenue(d).setTax(d1).setShipping(d2).setCurrencyCode(s2).build());
            callbackcontext.success((new StringBuilder()).append("Add Transaction: ").append(s).toString());
            return;
        } else
        {
            callbackcontext.error("Expected non-empty ID.");
            return;
        }
    }

    private void addTransactionItem(String s, String s1, String s2, String s3, double d, long l, String s4, CallbackContext callbackcontext)
    {
        if (!trackerStarted.booleanValue())
        {
            callbackcontext.error("Tracker not started");
            return;
        }
        addCustomDimensionsToTracker(tracker);
        if (s != null && s.length() > 0)
        {
            tracker.send((new com.google.android.gms.analytics.HitBuilders.ItemBuilder()).setTransactionId(s).setName(s1).setSku(s2).setCategory(s3).setPrice(d).setQuantity(l).setCurrencyCode(s4).build());
            callbackcontext.success((new StringBuilder()).append("Add Transaction Item: ").append(s).toString());
            return;
        } else
        {
            callbackcontext.error("Expected non-empty ID.");
            return;
        }
    }

    private void debugMode(CallbackContext callbackcontext)
    {
        GoogleAnalytics.getInstance(cordova.getActivity()).getLogger().setLogLevel(0);
        debugModeEnabled = Boolean.valueOf(true);
        callbackcontext.success("debugMode enabled");
    }

    private void setUserId(String s, CallbackContext callbackcontext)
    {
        if (!trackerStarted.booleanValue())
        {
            callbackcontext.error("Tracker not started");
            return;
        } else
        {
            tracker.set("&uid", s);
            callbackcontext.success((new StringBuilder()).append("Set user id").append(s).toString());
            return;
        }
    }

    private void startTracker(String s, CallbackContext callbackcontext)
    {
        if (s != null && s.length() > 0)
        {
            tracker = GoogleAnalytics.getInstance(cordova.getActivity()).newTracker(s);
            callbackcontext.success("tracker started");
            trackerStarted = Boolean.valueOf(true);
            GoogleAnalytics.getInstance(cordova.getActivity()).setLocalDispatchPeriod(30);
            return;
        } else
        {
            callbackcontext.error("tracker id is not valid");
            return;
        }
    }

    private void trackEvent(String s, String s1, String s2, long l, CallbackContext callbackcontext)
    {
        if (!trackerStarted.booleanValue())
        {
            callbackcontext.error("Tracker not started");
            return;
        }
        addCustomDimensionsToTracker(tracker);
        if (s != null && s.length() > 0)
        {
            tracker.send((new com.google.android.gms.analytics.HitBuilders.EventBuilder()).setCategory(s).setAction(s1).setLabel(s2).setValue(l).build());
            callbackcontext.success((new StringBuilder()).append("Track Event: ").append(s).toString());
            return;
        } else
        {
            callbackcontext.error("Expected non-empty string arguments.");
            return;
        }
    }

    private void trackException(String s, Boolean boolean1, CallbackContext callbackcontext)
    {
        if (!trackerStarted.booleanValue())
        {
            callbackcontext.error("Tracker not started");
            return;
        }
        addCustomDimensionsToTracker(tracker);
        if (s != null && s.length() > 0)
        {
            tracker.send((new com.google.android.gms.analytics.HitBuilders.ExceptionBuilder()).setDescription(s).setFatal(boolean1.booleanValue()).build());
            callbackcontext.success((new StringBuilder()).append("Track Exception: ").append(s).toString());
            return;
        } else
        {
            callbackcontext.error("Expected non-empty string arguments.");
            return;
        }
    }

    private void trackTiming(String s, long l, String s1, String s2, CallbackContext callbackcontext)
    {
        if (!trackerStarted.booleanValue())
        {
            callbackcontext.error("Tracker not started");
            return;
        }
        addCustomDimensionsToTracker(tracker);
        if (s != null && s.length() > 0)
        {
            tracker.send((new com.google.android.gms.analytics.HitBuilders.TimingBuilder()).setCategory(s).setValue(l).setVariable(s1).setLabel(s2).build());
            callbackcontext.success((new StringBuilder()).append("Track Timing: ").append(s).toString());
            return;
        } else
        {
            callbackcontext.error("Expected non-empty string arguments.");
            return;
        }
    }

    private void trackView(String s, CallbackContext callbackcontext)
    {
        if (!trackerStarted.booleanValue())
        {
            callbackcontext.error("Tracker not started");
            return;
        }
        addCustomDimensionsToTracker(tracker);
        if (s != null && s.length() > 0)
        {
            tracker.setScreenName(s);
            tracker.send((new com.google.android.gms.analytics.HitBuilders.AppViewBuilder()).build());
            callbackcontext.success((new StringBuilder()).append("Track Screen: ").append(s).toString());
            return;
        } else
        {
            callbackcontext.error("Expected one non-empty string argument.");
            return;
        }
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        if ("startTrackerWithId".equals(s))
        {
            startTracker(jsonarray.getString(0), callbackcontext);
            return true;
        }
        if ("trackView".equals(s))
        {
            trackView(jsonarray.getString(0), callbackcontext);
            return true;
        }
        if ("trackEvent".equals(s))
        {
            int i = jsonarray.length();
            if (i > 0)
            {
                String s5 = jsonarray.getString(0);
                String s1;
                long l1;
                if (i > 1)
                {
                    s = jsonarray.getString(1);
                } else
                {
                    s = "";
                }
                if (i > 2)
                {
                    s1 = jsonarray.getString(2);
                } else
                {
                    s1 = "";
                }
                if (i > 3)
                {
                    l1 = jsonarray.getLong(3);
                } else
                {
                    l1 = 0L;
                }
                trackEvent(s5, s, s1, l1, callbackcontext);
            }
            return true;
        }
        if ("trackException".equals(s))
        {
            trackException(jsonarray.getString(0), Boolean.valueOf(jsonarray.getBoolean(1)), callbackcontext);
            return true;
        }
        if ("trackTiming".equals(s))
        {
            int j = jsonarray.length();
            if (j > 0)
            {
                String s2 = jsonarray.getString(0);
                long l2;
                if (j > 1)
                {
                    l2 = jsonarray.getLong(1);
                } else
                {
                    l2 = 0L;
                }
                if (j > 2)
                {
                    s = jsonarray.getString(2);
                } else
                {
                    s = "";
                }
                if (j > 3)
                {
                    jsonarray = jsonarray.getString(3);
                } else
                {
                    jsonarray = "";
                }
                trackTiming(s2, l2, s, jsonarray, callbackcontext);
            }
            return true;
        }
        if ("addCustomDimension".equals(s))
        {
            addCustomDimension(jsonarray.getString(0), jsonarray.getString(1), callbackcontext);
            return true;
        }
        if ("addTransaction".equals(s))
        {
            int k = jsonarray.length();
            if (k > 0)
            {
                String s3 = jsonarray.getString(0);
                double d;
                double d2;
                double d3;
                if (k > 1)
                {
                    s = jsonarray.getString(1);
                } else
                {
                    s = "";
                }
                if (k > 2)
                {
                    d = jsonarray.getDouble(2);
                } else
                {
                    d = 0.0D;
                }
                if (k > 3)
                {
                    d2 = jsonarray.getDouble(3);
                } else
                {
                    d2 = 0.0D;
                }
                if (k > 4)
                {
                    d3 = jsonarray.getDouble(4);
                } else
                {
                    d3 = 0.0D;
                }
                if (k > 5)
                {
                    jsonarray = jsonarray.getString(5);
                } else
                {
                    jsonarray = null;
                }
                addTransaction(s3, s, d, d2, d3, jsonarray, callbackcontext);
            }
            return true;
        }
        if ("addTransactionItem".equals(s))
        {
            int l = jsonarray.length();
            if (l > 0)
            {
                String s7 = jsonarray.getString(0);
                double d1;
                String s4;
                String s6;
                long l3;
                if (l > 1)
                {
                    s = jsonarray.getString(1);
                } else
                {
                    s = "";
                }
                if (l > 2)
                {
                    s4 = jsonarray.getString(2);
                } else
                {
                    s4 = "";
                }
                if (l > 3)
                {
                    s6 = jsonarray.getString(3);
                } else
                {
                    s6 = "";
                }
                if (l > 4)
                {
                    d1 = jsonarray.getDouble(4);
                } else
                {
                    d1 = 0.0D;
                }
                if (l > 5)
                {
                    l3 = jsonarray.getLong(5);
                } else
                {
                    l3 = 0L;
                }
                if (l > 6)
                {
                    jsonarray = jsonarray.getString(6);
                } else
                {
                    jsonarray = null;
                }
                addTransactionItem(s7, s, s4, s6, d1, l3, jsonarray, callbackcontext);
            }
            return true;
        }
        if (!"setUserId".equals(s)) goto _L2; else goto _L1
_L1:
        setUserId(jsonarray.getString(0), callbackcontext);
_L4:
        return false;
_L2:
        if ("debugMode".equals(s))
        {
            debugMode(callbackcontext);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
