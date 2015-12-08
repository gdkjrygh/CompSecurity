// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.Command;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.google.analytics.tracking.android:
//            AnalyticsThread, Log, Utils, StandardExceptionParser, 
//            ExceptionParser, ServiceProxy, MetaModel, MetaModelInitializer, 
//            GAServiceProxy, HitBuilder

class GAThread extends Thread
    implements AnalyticsThread
{

    static final String API_VERSION = "1";
    private static final String CLIENT_VERSION = "ma1b6";
    private static final int MAX_SAMPLE_RATE = 100;
    private static final int SAMPLE_RATE_MODULO = 10000;
    private static final int SAMPLE_RATE_MULTIPLIER = 100;
    private static GAThread sInstance;
    private volatile boolean mAppOptOut;
    private volatile String mClientId;
    private volatile boolean mClosed;
    private volatile List mCommands;
    private final Context mContext;
    private volatile boolean mDisabled;
    private volatile String mInstallCampaign;
    private volatile MetaModel mMetaModel;
    private volatile ServiceProxy mServiceProxy;
    private final LinkedBlockingQueue queue;

    private GAThread(Context context)
    {
        super("GAThread");
        queue = new LinkedBlockingQueue();
        mDisabled = false;
        mClosed = false;
        if (context != null)
        {
            mContext = context.getApplicationContext();
        } else
        {
            mContext = context;
        }
        start();
    }

    GAThread(Context context, ServiceProxy serviceproxy)
    {
        super("GAThread");
        queue = new LinkedBlockingQueue();
        mDisabled = false;
        mClosed = false;
        if (context != null)
        {
            mContext = context.getApplicationContext();
        } else
        {
            mContext = context;
        }
        mServiceProxy = serviceproxy;
        start();
    }

    private void fillAppParameters(Map map)
    {
        String s;
        String s1;
        String s3;
        Object obj;
        String s4;
        PackageManager packagemanager;
        packagemanager = mContext.getPackageManager();
        s3 = mContext.getPackageName();
        s4 = packagemanager.getInstallerPackageName(s3);
        s1 = s3;
        obj = null;
        s = s1;
        PackageInfo packageinfo = packagemanager.getPackageInfo(mContext.getPackageName(), 0);
        String s2;
        s = s1;
        s2 = obj;
        if (packageinfo == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        s = s1;
        s1 = packagemanager.getApplicationLabel(packageinfo.applicationInfo).toString();
        s = s1;
        s2 = packageinfo.versionName;
        s = s1;
_L2:
        putIfAbsent(map, "appName", s);
        putIfAbsent(map, "appVersion", s2);
        putIfAbsent(map, "appId", s3);
        putIfAbsent(map, "appInstallerId", s4);
        map.put("apiVersion", "1");
        return;
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        Log.e((new StringBuilder()).append("Error retrieving package info: appName set to ").append(s).toString());
        s2 = obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void fillCampaignParameters(Map map)
    {
        Object obj = Utils.filterCampaign((String)map.get("campaign"));
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            return;
        } else
        {
            obj = Utils.parseURLParameters(((String) (obj)));
            map.put("campaignContent", ((Map) (obj)).get("utm_content"));
            map.put("campaignMedium", ((Map) (obj)).get("utm_medium"));
            map.put("campaignName", ((Map) (obj)).get("utm_campaign"));
            map.put("campaignSource", ((Map) (obj)).get("utm_source"));
            map.put("campaignKeyword", ((Map) (obj)).get("utm_term"));
            map.put("campaignId", ((Map) (obj)).get("utm_id"));
            map.put("gclid", ((Map) (obj)).get("gclid"));
            map.put("dclid", ((Map) (obj)).get("dclid"));
            map.put("gmob_t", ((Map) (obj)).get("gmob_t"));
            return;
        }
    }

    private void fillExceptionParameters(Map map)
    {
        Object obj = (String)map.get("rawException");
        if (obj != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        map.remove("rawException");
        obj = new ByteArrayInputStream(Utils.hexDecode(((String) (obj))));
        Object obj1;
        obj = new ObjectInputStream(((java.io.InputStream) (obj)));
        obj1 = ((ObjectInputStream) (obj)).readObject();
        ((ObjectInputStream) (obj)).close();
        if (!(obj1 instanceof Throwable)) goto _L1; else goto _L3
_L3:
        obj = (Throwable)obj1;
        ArrayList arraylist = new ArrayList();
        map.put("exDescription", (new StandardExceptionParser(mContext, arraylist)).getDescription((String)map.get("exceptionThreadName"), ((Throwable) (obj))));
        return;
        map;
        Log.w("IOException reading exception");
        return;
        map;
        Log.w("ClassNotFoundException reading exception");
        return;
    }

    private String generateClientId()
    {
        String s1 = UUID.randomUUID().toString().toLowerCase();
        String s = s1;
        if (!storeClientId(s1))
        {
            s = "0";
        }
        return s;
    }

    static String getAndClearCampaign(Context context)
    {
        Object obj;
        byte abyte0[];
        int i;
        obj = context.openFileInput("gaInstallData");
        abyte0 = new byte[8192];
        i = ((FileInputStream) (obj)).read(abyte0, 0, 8192);
        if (((FileInputStream) (obj)).available() <= 0)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        Log.e("Too much campaign data, ignoring it.");
        ((FileInputStream) (obj)).close();
        context.deleteFile("gaInstallData");
        return null;
        try
        {
            ((FileInputStream) (obj)).close();
            context.deleteFile("gaInstallData");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.i("No campaign data found.");
            return null;
        }
        catch (IOException ioexception)
        {
            Log.e("Error reading campaign data.");
            context.deleteFile("gaInstallData");
            return null;
        }
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        Log.w("Campaign file is empty.");
        return null;
        obj = new String(abyte0, 0, i);
        Log.i((new StringBuilder()).append("Campaign found: ").append(((String) (obj))).toString());
        return ((String) (obj));
    }

    private String getHostUrl(Map map)
    {
label0:
        {
label1:
            {
                String s1 = (String)map.get("internalHitUrl");
                String s = s1;
                if (s1 == null)
                {
                    if (!map.containsKey("useSecure"))
                    {
                        break label0;
                    }
                    if (!Utils.safeParseBoolean((String)map.get("useSecure")))
                    {
                        break label1;
                    }
                    s = "https://ssl.google-analytics.com/collect";
                }
                return s;
            }
            return "http://www.google-analytics.com/collect";
        }
        return "https://ssl.google-analytics.com/collect";
    }

    static GAThread getInstance(Context context)
    {
        if (sInstance == null)
        {
            sInstance = new GAThread(context);
        }
        return sInstance;
    }

    private boolean isSampledOut(Map map)
    {
        if (map.get("sampleRate") != null)
        {
            double d = Utils.safeParseDouble((String)map.get("sampleRate"));
            if (d <= 0.0D)
            {
                return true;
            }
            if (d < 100D)
            {
                map = (String)map.get("clientId");
                if (map != null && (double)(Math.abs(map.hashCode()) % 10000) >= 100D * d)
                {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean loadAppOptOut()
    {
        return mContext.getFileStreamPath("gaOptOut").exists();
    }

    private String printStackTrace(Throwable throwable)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        PrintStream printstream = new PrintStream(bytearrayoutputstream);
        throwable.printStackTrace(printstream);
        printstream.flush();
        return new String(bytearrayoutputstream.toByteArray());
    }

    private void putIfAbsent(Map map, String s, String s1)
    {
        if (!map.containsKey(s))
        {
            map.put(s, s1);
        }
    }

    private void queueToThread(Runnable runnable)
    {
        queue.add(runnable);
    }

    private boolean storeClientId(String s)
    {
        try
        {
            FileOutputStream fileoutputstream = mContext.openFileOutput("gaClientId", 0);
            fileoutputstream.write(s.getBytes());
            fileoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("Error creating clientId file.");
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("Error writing to clientId file.");
            return false;
        }
        return true;
    }

    void close()
    {
        mClosed = true;
        interrupt();
    }

    public void dispatch()
    {
        queueToThread(new Runnable() {

            final GAThread this$0;

            public void run()
            {
                mServiceProxy.dispatch();
            }

            
            {
                this$0 = GAThread.this;
                super();
            }
        });
    }

    public LinkedBlockingQueue getQueue()
    {
        return queue;
    }

    public Thread getThread()
    {
        return this;
    }

    protected void init()
    {
        mServiceProxy.createService();
        mCommands = new ArrayList();
        mCommands.add(new Command("appendVersion", "_v", "ma1b6"));
        mCommands.add(new Command("appendQueueTime", "qt", null));
        mCommands.add(new Command("appendCacheBuster", "z", null));
        mMetaModel = new MetaModel();
        MetaModelInitializer.set(mMetaModel);
    }

    String initializeClientId()
    {
        Object obj1;
        Object obj2;
        Object obj3;
        obj2 = null;
        obj3 = null;
        obj1 = null;
        Object obj;
        FileInputStream fileinputstream;
        int i;
        fileinputstream = mContext.openFileInput("gaClientId");
        obj = new byte[128];
        i = fileinputstream.read(((byte []) (obj)), 0, 128);
        if (fileinputstream.available() > 0)
        {
            Log.e("clientId file seems corrupted, deleting it.");
            fileinputstream.close();
            mContext.deleteFile("gaInstallData");
        }
        if (i > 0) goto _L2; else goto _L1
_L1:
        Log.e("clientId file seems empty, deleting it.");
        fileinputstream.close();
        mContext.deleteFile("gaInstallData");
        obj = obj1;
_L8:
        obj1 = obj;
        if (obj == null)
        {
            obj1 = generateClientId();
        }
        return ((String) (obj1));
_L2:
        obj = new String(((byte []) (obj)), 0, i);
        fileinputstream.close();
        continue; /* Loop/switch isn't completed */
        obj;
        obj = obj2;
_L6:
        Log.e("Error reading clientId file, deleting it.");
        mContext.deleteFile("gaInstallData");
        continue; /* Loop/switch isn't completed */
        obj;
        obj = obj3;
_L4:
        Log.e("cliendId file doesn't have long value, deleting it.");
        mContext.deleteFile("gaInstallData");
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
        obj1;
        if (true) goto _L6; else goto _L5
_L5:
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
        filenotfoundexception = ((FileNotFoundException) (obj1));
        continue; /* Loop/switch isn't completed */
        FileNotFoundException filenotfoundexception1;
        filenotfoundexception1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    boolean isDisabled()
    {
        return mDisabled;
    }

    public void requestAppOptOut(final GoogleAnalytics.AppOptOutCallback callback)
    {
        queueToThread(new Runnable() {

            final GAThread this$0;
            final GoogleAnalytics.AppOptOutCallback val$callback;

            public void run()
            {
                callback.reportAppOptOut(mAppOptOut);
            }

            
            {
                this$0 = GAThread.this;
                callback = appoptoutcallback;
                super();
            }
        });
    }

    public void requestClientId(final AnalyticsThread.ClientIdCallback callback)
    {
        queueToThread(new Runnable() {

            final GAThread this$0;
            final AnalyticsThread.ClientIdCallback val$callback;

            public void run()
            {
                callback.reportClientId(mClientId);
            }

            
            {
                this$0 = GAThread.this;
                callback = clientidcallback;
                super();
            }
        });
    }

    public void run()
    {
        Runnable runnable;
        Object obj;
        try
        {
            Thread.sleep(5000L);
        }
        catch (InterruptedException interruptedexception)
        {
            Log.w("sleep interrupted in GAThread initialize");
        }
        try
        {
            if (mServiceProxy == null)
            {
                mServiceProxy = new GAServiceProxy(mContext, this);
            }
            init();
            mAppOptOut = loadAppOptOut();
            mClientId = initializeClientId();
            mInstallCampaign = getAndClearCampaign(mContext);
        }
        catch (Throwable throwable)
        {
            Log.e((new StringBuilder()).append("Error initializing the GAThread: ").append(printStackTrace(throwable)).toString());
            Log.e("Google Analytics will not start up.");
            mDisabled = true;
        }
        if (mClosed)
        {
            break; /* Loop/switch isn't completed */
        }
        runnable = (Runnable)queue.take();
        if (!mDisabled)
        {
            runnable.run();
        }
        continue; /* Loop/switch isn't completed */
        obj;
        try
        {
            Log.i(((InterruptedException) (obj)).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e((new StringBuilder()).append("Error on GAThread: ").append(printStackTrace(((Throwable) (obj)))).toString());
            Log.e("Google Analytics is shutting down.");
            mDisabled = true;
        }
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_60;
_L1:
    }

    public void sendHit(final Map hitCopy)
    {
        hitCopy = new HashMap(hitCopy);
        final long hitTime = System.currentTimeMillis();
        hitCopy.put("hitTime", Long.toString(hitTime));
        queueToThread(new Runnable() {

            final GAThread this$0;
            final Map val$hitCopy;
            final long val$hitTime;

            public void run()
            {
                hitCopy.put("clientId", mClientId);
                if (mAppOptOut || isSampledOut(hitCopy))
                {
                    return;
                }
                if (!TextUtils.isEmpty(mInstallCampaign))
                {
                    hitCopy.put("campaign", mInstallCampaign);
                    mInstallCampaign = null;
                }
                fillAppParameters(hitCopy);
                fillCampaignParameters(hitCopy);
                fillExceptionParameters(hitCopy);
                Map map = HitBuilder.generateHitParams(mMetaModel, hitCopy);
                mServiceProxy.putHit(map, hitTime, getHostUrl(hitCopy), mCommands);
            }

            
            {
                this$0 = GAThread.this;
                hitCopy = map;
                hitTime = l;
                super();
            }
        });
    }

    public void setAppOptOut(final boolean appOptOut)
    {
        queueToThread(new Runnable() {

            final GAThread this$0;
            final boolean val$appOptOut;

            public void run()
            {
                if (mAppOptOut == appOptOut)
                {
                    return;
                }
                if (appOptOut)
                {
                    File file = mContext.getFileStreamPath("gaOptOut");
                    try
                    {
                        file.createNewFile();
                    }
                    catch (IOException ioexception)
                    {
                        Log.w("Error creating optOut file.");
                    }
                    mServiceProxy.clearHits();
                } else
                {
                    mContext.deleteFile("gaOptOut");
                }
                mAppOptOut = appOptOut;
            }

            
            {
                this$0 = GAThread.this;
                appOptOut = flag;
                super();
            }
        });
    }





/*
    static boolean access$102(GAThread gathread, boolean flag)
    {
        gathread.mAppOptOut = flag;
        return flag;
    }

*/





/*
    static String access$302(GAThread gathread, String s)
    {
        gathread.mInstallCampaign = s;
        return s;
    }

*/






}
