// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.analytics.tracking.android:
//            Transaction, GAUsage, Log, TrackerHandler, 
//            Utils, ExceptionParser

public class Tracker
{
    private static class SimpleModel
    {

        private Map permanentMap;
        private Map temporaryMap;

        public void clearTemporaryValues()
        {
            this;
            JVM INSTR monitorenter ;
            temporaryMap.clear();
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        public String get(String s)
        {
            this;
            JVM INSTR monitorenter ;
            String s1 = (String)temporaryMap.get(s);
            if (s1 == null) goto _L2; else goto _L1
_L1:
            s = s1;
_L4:
            this;
            JVM INSTR monitorexit ;
            return s;
_L2:
            s = (String)permanentMap.get(s);
            if (true) goto _L4; else goto _L3
_L3:
            s;
            throw s;
        }

        public Map getKeysAndValues()
        {
            this;
            JVM INSTR monitorenter ;
            HashMap hashmap;
            hashmap = new HashMap(permanentMap);
            hashmap.putAll(temporaryMap);
            this;
            JVM INSTR monitorexit ;
            return hashmap;
            Exception exception;
            exception;
            throw exception;
        }

        public void set(String s, String s1)
        {
            this;
            JVM INSTR monitorenter ;
            permanentMap.put(s, s1);
            this;
            JVM INSTR monitorexit ;
            return;
            s;
            throw s;
        }

        public void setAll(Map map, Boolean boolean1)
        {
            this;
            JVM INSTR monitorenter ;
            if (!boolean1.booleanValue()) goto _L2; else goto _L1
_L1:
            temporaryMap.putAll(map);
_L4:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            permanentMap.putAll(map);
            if (true) goto _L4; else goto _L3
_L3:
            map;
            throw map;
        }

        public void setForNextHit(String s, String s1)
        {
            this;
            JVM INSTR monitorenter ;
            temporaryMap.put(s, s1);
            this;
            JVM INSTR monitorexit ;
            return;
            s;
            throw s;
        }

        private SimpleModel()
        {
            temporaryMap = new HashMap();
            permanentMap = new HashMap();
        }

    }


    private static final DecimalFormat DF;
    static final long MAX_TOKENS = 0x1d4c0L;
    static final long TIME_PER_TOKEN_MILLIS = 2000L;
    private volatile ExceptionParser mExceptionParser;
    private final TrackerHandler mHandler;
    private boolean mIsThrottlingEnabled;
    private volatile boolean mIsTrackerClosed;
    private volatile boolean mIsTrackingStarted;
    private long mLastTrackTime;
    private final SimpleModel mModel;
    private long mTokens;

    Tracker()
    {
        mIsTrackerClosed = false;
        mIsTrackingStarted = false;
        mTokens = 0x1d4c0L;
        mIsThrottlingEnabled = true;
        mHandler = null;
        mModel = null;
    }

    Tracker(String s, TrackerHandler trackerhandler)
    {
        mIsTrackerClosed = false;
        mIsTrackingStarted = false;
        mTokens = 0x1d4c0L;
        mIsThrottlingEnabled = true;
        if (s == null)
        {
            throw new IllegalArgumentException("trackingId cannot be null");
        } else
        {
            mHandler = trackerhandler;
            mModel = new SimpleModel();
            mModel.set("trackingId", s);
            mModel.set("sampleRate", "100");
            mModel.setForNextHit("sessionControl", "start");
            mModel.set("useSecure", Boolean.toString(true));
            return;
        }
    }

    private void assertTrackerOpen()
    {
        if (mIsTrackerClosed)
        {
            throw new IllegalStateException("Tracker closed");
        } else
        {
            return;
        }
    }

    private Map constructItem(Transaction.Item item, Transaction transaction)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("transactionId", transaction.getTransactionId());
        hashmap.put("currencyCode", transaction.getCurrencyCode());
        hashmap.put("itemCode", item.getSKU());
        hashmap.put("itemName", item.getName());
        hashmap.put("itemCategory", item.getCategory());
        hashmap.put("itemPrice", microsToCurrencyString(item.getPriceInMicros()));
        hashmap.put("itemQuantity", Long.toString(item.getQuantity()));
        GAUsage.getInstance().setUsage(GAUsage.Field.CONSTRUCT_ITEM);
        return hashmap;
    }

    private void internalSend(String s, Map map)
    {
        mIsTrackingStarted = true;
        Object obj = map;
        if (map == null)
        {
            obj = new HashMap();
        }
        ((Map) (obj)).put("hitType", s);
        mModel.setAll(((Map) (obj)), Boolean.valueOf(true));
        if (!tokensAvailable())
        {
            Log.wDebug("Too many hits sent too quickly, throttling invoked.");
        } else
        {
            mHandler.sendHit(mModel.getKeysAndValues());
        }
        mModel.clearTemporaryValues();
    }

    private static String microsToCurrencyString(long l)
    {
        return DF.format((double)l / 1000000D);
    }

    public void close()
    {
        mIsTrackerClosed = true;
        mHandler.closeTracker(this);
    }

    public Map constructEvent(String s, String s1, String s2, Long long1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("eventCategory", s);
        hashmap.put("eventAction", s1);
        hashmap.put("eventLabel", s2);
        if (long1 != null)
        {
            hashmap.put("eventValue", Long.toString(long1.longValue()));
        }
        GAUsage.getInstance().setUsage(GAUsage.Field.CONSTRUCT_EVENT);
        return hashmap;
    }

    public Map constructException(String s, boolean flag)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("exDescription", s);
        hashmap.put("exFatal", Boolean.toString(flag));
        GAUsage.getInstance().setUsage(GAUsage.Field.CONSTRUCT_EXCEPTION);
        return hashmap;
    }

    public Map constructRawException(String s, Throwable throwable, boolean flag)
        throws IOException
    {
        HashMap hashmap = new HashMap();
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        ObjectOutputStream objectoutputstream = new ObjectOutputStream(bytearrayoutputstream);
        objectoutputstream.writeObject(throwable);
        objectoutputstream.close();
        hashmap.put("rawException", Utils.hexEncode(bytearrayoutputstream.toByteArray()));
        if (s != null)
        {
            hashmap.put("exceptionThreadName", s);
        }
        hashmap.put("exFatal", Boolean.toString(flag));
        GAUsage.getInstance().setUsage(GAUsage.Field.CONSTRUCT_RAW_EXCEPTION);
        return hashmap;
    }

    public Map constructSocial(String s, String s1, String s2)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("socialNetwork", s);
        hashmap.put("socialAction", s1);
        hashmap.put("socialTarget", s2);
        GAUsage.getInstance().setUsage(GAUsage.Field.CONSTRUCT_SOCIAL);
        return hashmap;
    }

    public Map constructTiming(String s, long l, String s1, String s2)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("timingCategory", s);
        hashmap.put("timingValue", Long.toString(l));
        hashmap.put("timingVar", s1);
        hashmap.put("timingLabel", s2);
        GAUsage.getInstance().setUsage(GAUsage.Field.CONSTRUCT_TIMING);
        return hashmap;
    }

    public Map constructTransaction(Transaction transaction)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("transactionId", transaction.getTransactionId());
        hashmap.put("transactionAffiliation", transaction.getAffiliation());
        hashmap.put("transactionShipping", microsToCurrencyString(transaction.getShippingCostInMicros()));
        hashmap.put("transactionTax", microsToCurrencyString(transaction.getTotalTaxInMicros()));
        hashmap.put("transactionTotal", microsToCurrencyString(transaction.getTotalCostInMicros()));
        hashmap.put("currencyCode", transaction.getCurrencyCode());
        GAUsage.getInstance().setUsage(GAUsage.Field.CONSTRUCT_TRANSACTION);
        return hashmap;
    }

    public String get(String s)
    {
        GAUsage.getInstance().setUsage(GAUsage.Field.GET);
        return mModel.get(s);
    }

    public String getAppId()
    {
        GAUsage.getInstance().setUsage(GAUsage.Field.GET_APP_ID);
        return mModel.get("appId");
    }

    public String getAppInstallerId()
    {
        GAUsage.getInstance().setUsage(GAUsage.Field.GET_APP_INSTALLER_ID);
        return mModel.get("appInstallerId");
    }

    public ExceptionParser getExceptionParser()
    {
        GAUsage.getInstance().setUsage(GAUsage.Field.GET_EXCEPTION_PARSER);
        return mExceptionParser;
    }

    public double getSampleRate()
    {
        GAUsage.getInstance().setUsage(GAUsage.Field.GET_SAMPLE_RATE);
        return Utils.safeParseDouble(mModel.get("sampleRate"));
    }

    public String getTrackingId()
    {
        GAUsage.getInstance().setUsage(GAUsage.Field.GET_TRACKING_ID);
        return mModel.get("trackingId");
    }

    public boolean isAnonymizeIpEnabled()
    {
        GAUsage.getInstance().setUsage(GAUsage.Field.GET_ANONYMIZE_IP);
        return Utils.safeParseBoolean(mModel.get("anonymizeIp"));
    }

    public boolean isUseSecure()
    {
        GAUsage.getInstance().setUsage(GAUsage.Field.GET_USE_SECURE);
        return Boolean.parseBoolean(mModel.get("useSecure"));
    }

    public void send(String s, Map map)
    {
        assertTrackerOpen();
        GAUsage.getInstance().setUsage(GAUsage.Field.SEND);
        internalSend(s, map);
    }

    public void sendEvent(String s, String s1, String s2, Long long1)
    {
        assertTrackerOpen();
        GAUsage.getInstance().setUsage(GAUsage.Field.TRACK_EVENT);
        GAUsage.getInstance().setDisableUsage(true);
        internalSend("event", constructEvent(s, s1, s2, long1));
        GAUsage.getInstance().setDisableUsage(false);
    }

    public void sendException(String s, Throwable throwable, boolean flag)
    {
        assertTrackerOpen();
        GAUsage.getInstance().setUsage(GAUsage.Field.TRACK_EXCEPTION_WITH_THROWABLE);
        if (mExceptionParser != null)
        {
            s = mExceptionParser.getDescription(s, throwable);
        } else
        {
            try
            {
                GAUsage.getInstance().setDisableUsage(true);
                internalSend("exception", constructRawException(s, throwable, flag));
                GAUsage.getInstance().setDisableUsage(false);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.w("trackException: couldn't serialize, sending \"Unknown Exception\"");
            }
            s = "Unknown Exception";
        }
        GAUsage.getInstance().setDisableUsage(true);
        sendException(s, flag);
        GAUsage.getInstance().setDisableUsage(false);
    }

    public void sendException(String s, boolean flag)
    {
        assertTrackerOpen();
        GAUsage.getInstance().setUsage(GAUsage.Field.TRACK_EXCEPTION_WITH_DESCRIPTION);
        GAUsage.getInstance().setDisableUsage(true);
        internalSend("exception", constructException(s, flag));
        GAUsage.getInstance().setDisableUsage(false);
    }

    public void sendSocial(String s, String s1, String s2)
    {
        assertTrackerOpen();
        GAUsage.getInstance().setUsage(GAUsage.Field.TRACK_SOCIAL);
        GAUsage.getInstance().setDisableUsage(true);
        internalSend("social", constructSocial(s, s1, s2));
        GAUsage.getInstance().setDisableUsage(false);
    }

    public void sendTiming(String s, long l, String s1, String s2)
    {
        assertTrackerOpen();
        GAUsage.getInstance().setUsage(GAUsage.Field.TRACK_TIMING);
        GAUsage.getInstance().setDisableUsage(true);
        internalSend("timing", constructTiming(s, l, s1, s2));
        GAUsage.getInstance().setDisableUsage(false);
    }

    public void sendTransaction(Transaction transaction)
    {
        assertTrackerOpen();
        GAUsage.getInstance().setUsage(GAUsage.Field.TRACK_TRANSACTION);
        GAUsage.getInstance().setDisableUsage(true);
        internalSend("tran", constructTransaction(transaction));
        for (Iterator iterator = transaction.getItems().iterator(); iterator.hasNext(); internalSend("item", constructItem((Transaction.Item)iterator.next(), transaction))) { }
        GAUsage.getInstance().setDisableUsage(false);
    }

    public void sendView()
    {
        assertTrackerOpen();
        if (TextUtils.isEmpty(mModel.get("description")))
        {
            throw new IllegalStateException("trackView requires a appScreen to be set");
        } else
        {
            GAUsage.getInstance().setUsage(GAUsage.Field.TRACK_VIEW);
            internalSend("appview", null);
            return;
        }
    }

    public void sendView(String s)
    {
        assertTrackerOpen();
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalStateException("trackView requires a appScreen to be set");
        } else
        {
            GAUsage.getInstance().setUsage(GAUsage.Field.TRACK_VIEW_WITH_APPSCREEN);
            mModel.set("description", s);
            internalSend("appview", null);
            return;
        }
    }

    public void set(String s, String s1)
    {
        GAUsage.getInstance().setUsage(GAUsage.Field.SET);
        mModel.set(s, s1);
    }

    public void setAnonymizeIp(boolean flag)
    {
        GAUsage.getInstance().setUsage(GAUsage.Field.SET_ANONYMIZE_IP);
        mModel.set("anonymizeIp", Boolean.toString(flag));
    }

    public void setAppId(String s)
    {
        GAUsage.getInstance().setUsage(GAUsage.Field.SET_APP_ID);
        mModel.set("appId", s);
    }

    public void setAppInstallerId(String s)
    {
        GAUsage.getInstance().setUsage(GAUsage.Field.SET_APP_INSTALLER_ID);
        mModel.set("appInstallerId", s);
    }

    public void setAppName(String s)
    {
        if (mIsTrackingStarted)
        {
            Log.wDebug("Tracking already started, setAppName call ignored");
            return;
        }
        if (TextUtils.isEmpty(s))
        {
            Log.wDebug("setting appName to empty value not allowed, call ignored");
            return;
        } else
        {
            GAUsage.getInstance().setUsage(GAUsage.Field.SET_APP_NAME);
            mModel.set("appName", s);
            return;
        }
    }

    public void setAppScreen(String s)
    {
        assertTrackerOpen();
        GAUsage.getInstance().setUsage(GAUsage.Field.SET_APP_SCREEN);
        mModel.set("description", s);
    }

    public void setAppVersion(String s)
    {
        if (mIsTrackingStarted)
        {
            Log.wDebug("Tracking already started, setAppVersion call ignored");
            return;
        } else
        {
            GAUsage.getInstance().setUsage(GAUsage.Field.SET_APP_VERSION);
            mModel.set("appVersion", s);
            return;
        }
    }

    public void setCampaign(String s)
    {
        GAUsage.getInstance().setUsage(GAUsage.Field.SET_CAMPAIGN);
        mModel.setForNextHit("campaign", s);
    }

    public void setCustomDimension(int i, String s)
    {
        if (i < 1)
        {
            Log.w((new StringBuilder()).append("index must be > 0, ignoring setCustomDimension call for ").append(i).append(", ").append(s).toString());
            return;
        } else
        {
            mModel.setForNextHit(Utils.getSlottedModelField("customDimension", i), s);
            return;
        }
    }

    public void setCustomDimensionsAndMetrics(Map map, Map map1)
    {
        if (map != null)
        {
            Integer integer1;
            for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); setCustomDimension(integer1.intValue(), (String)map.get(integer1)))
            {
                integer1 = (Integer)iterator.next();
            }

        }
        if (map1 != null)
        {
            Integer integer;
            for (map = map1.keySet().iterator(); map.hasNext(); setCustomMetric(integer.intValue(), (Long)map1.get(integer)))
            {
                integer = (Integer)map.next();
            }

        }
    }

    public void setCustomMetric(int i, Long long1)
    {
        if (i < 1)
        {
            Log.w((new StringBuilder()).append("index must be > 0, ignoring setCustomMetric call for ").append(i).append(", ").append(long1).toString());
            return;
        }
        String s = null;
        if (long1 != null)
        {
            s = Long.toString(long1.longValue());
        }
        mModel.setForNextHit(Utils.getSlottedModelField("customMetric", i), s);
    }

    public void setExceptionParser(ExceptionParser exceptionparser)
    {
        GAUsage.getInstance().setUsage(GAUsage.Field.SET_EXCEPTION_PARSER);
        mExceptionParser = exceptionparser;
    }

    void setLastTrackTime(long l)
    {
        mLastTrackTime = l;
    }

    public void setReferrer(String s)
    {
        GAUsage.getInstance().setUsage(GAUsage.Field.SET_REFERRER);
        mModel.setForNextHit("referrer", s);
    }

    public void setSampleRate(double d)
    {
        GAUsage.getInstance().setUsage(GAUsage.Field.SET_SAMPLE_RATE);
        mModel.set("sampleRate", Double.toString(d));
    }

    public void setStartSession(boolean flag)
    {
        assertTrackerOpen();
        GAUsage.getInstance().setUsage(GAUsage.Field.SET_START_SESSION);
        SimpleModel simplemodel = mModel;
        String s;
        if (flag)
        {
            s = "start";
        } else
        {
            s = null;
        }
        simplemodel.setForNextHit("sessionControl", s);
    }

    public void setThrottlingEnabled(boolean flag)
    {
        mIsThrottlingEnabled = flag;
    }

    void setTokens(long l)
    {
        mTokens = l;
    }

    public void setUseSecure(boolean flag)
    {
        GAUsage.getInstance().setUsage(GAUsage.Field.SET_USE_SECURE);
        mModel.set("useSecure", Boolean.toString(flag));
    }

    boolean tokensAvailable()
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = mIsThrottlingEnabled;
        if (flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        long l;
        long l1;
        l = System.currentTimeMillis();
        if (mTokens >= 0x1d4c0L)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        l1 = l - mLastTrackTime;
        if (l1 <= 0L)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        mTokens = Math.min(0x1d4c0L, mTokens + l1);
        mLastTrackTime = l;
        if (mTokens >= 2000L)
        {
            mTokens = mTokens - 2000L;
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_104;
        Exception exception;
        exception;
        throw exception;
        Log.wDebug("Excessive tracking detected.  Tracking call ignored.");
        flag = false;
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void trackEvent(String s, String s1, String s2, Long long1)
    {
        sendEvent(s, s1, s2, long1);
    }

    public void trackException(String s, Throwable throwable, boolean flag)
    {
        sendException(s, throwable, flag);
    }

    public void trackException(String s, boolean flag)
    {
        sendException(s, flag);
    }

    public void trackSocial(String s, String s1, String s2)
    {
        sendSocial(s, s1, s2);
    }

    public void trackTiming(String s, long l, String s1, String s2)
    {
        sendTiming(s, l, s1, s2);
    }

    public void trackTransaction(Transaction transaction)
    {
        sendTransaction(transaction);
    }

    public void trackView()
    {
        sendView();
    }

    public void trackView(String s)
    {
        sendView(s);
    }

    static 
    {
        DF = new DecimalFormat("0.######", new DecimalFormatSymbols(Locale.US));
    }
}
