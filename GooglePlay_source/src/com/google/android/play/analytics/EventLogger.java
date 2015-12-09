// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.analytics;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.play.utils.Assertions;
import com.google.android.volley.guava.UrlRules;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Semaphore;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;

// Referenced classes of package com.google.android.play.analytics:
//            ProtoCache, RollingFileStream

public final class EventLogger
    implements RollingFileStream.WriteCallbacks
{
    public static final class Configuration
    {

        public long delayBetweenUploadsMs;
        public String logDirectoryName;
        public int mServerTimeoutMs;
        public String mServerUrl;
        public long maxStorageSize;
        public long minDelayBetweenUploadsMs;
        public long recommendedLogFileSize;

        public Configuration()
        {
            logDirectoryName = "logs";
            maxStorageSize = 0x200000L;
            recommendedLogFileSize = 51200L;
            delayBetweenUploadsMs = 0x493e0L;
            minDelayBetweenUploadsMs = 60000L;
            mServerUrl = "https://play.googleapis.com/log";
            mServerTimeoutMs = 10000;
        }
    }

    public static final class LogSource extends Enum
    {

        private static final LogSource $VALUES[];
        public static final LogSource ANDROID_IDE;
        public static final LogSource BOOKS;
        public static final LogSource CW;
        public static final LogSource GAMES;
        public static final LogSource GMS_CORE;
        public static final LogSource LB_A;
        public static final LogSource LB_P;
        public static final LogSource LB_S;
        public static final LogSource MAGAZINES;
        public static final LogSource MARKET;
        public static final LogSource MOVIES;
        public static final LogSource MUSIC;
        public static final LogSource NEWSSTAND;
        public static final LogSource UDR;
        public static final LogSource VIDEO;
        final int mProtoValue;

        public static LogSource valueOf(String s)
        {
            return (LogSource)Enum.valueOf(com/google/android/play/analytics/EventLogger$LogSource, s);
        }

        public static LogSource[] values()
        {
            return (LogSource[])$VALUES.clone();
        }

        static 
        {
            MARKET = new LogSource("MARKET", 0, 0);
            MUSIC = new LogSource("MUSIC", 1, 1);
            BOOKS = new LogSource("BOOKS", 2, 2);
            VIDEO = new LogSource("VIDEO", 3, 3);
            MOVIES = new LogSource("MOVIES", 4, 74);
            MAGAZINES = new LogSource("MAGAZINES", 5, 4);
            GAMES = new LogSource("GAMES", 6, 5);
            LB_A = new LogSource("LB_A", 7, 6);
            ANDROID_IDE = new LogSource("ANDROID_IDE", 8, 7);
            LB_P = new LogSource("LB_P", 9, 8);
            LB_S = new LogSource("LB_S", 10, 9);
            GMS_CORE = new LogSource("GMS_CORE", 11, 10);
            CW = new LogSource("CW", 12, 27);
            UDR = new LogSource("UDR", 13, 30);
            NEWSSTAND = new LogSource("NEWSSTAND", 14, 63);
            $VALUES = (new LogSource[] {
                MARKET, MUSIC, BOOKS, VIDEO, MOVIES, MAGAZINES, GAMES, LB_A, ANDROID_IDE, LB_P, 
                LB_S, GMS_CORE, CW, UDR, NEWSSTAND
            });
        }

        private LogSource(String s, int i, int j)
        {
            super(s, i);
            mProtoValue = j;
        }
    }


    private static final ClientAnalytics.ActiveExperiments EMPTY_EXPERIMENTS = new ClientAnalytics.ActiveExperiments();
    private static final HashSet sInstantiatedAccounts = new HashSet();
    private final Account mAccount;
    private final long mAndroidId;
    private final String mAppVersion;
    private final String mAuthTokenType;
    private final Context mContext;
    private final String mCountry;
    private final long mDelayBetweenUploadsMs;
    private final long mDeviceId;
    public final Handler mHandler;
    private ClientAnalytics.ActiveExperiments mLastSentExperiments;
    private final int mLogSource;
    private final String mLoggingId;
    private final long mMaxUploadSize;
    private final String mMccmnc;
    private final long mMinDelayBetweenUploadsMs;
    private final long mMinImmediateUploadSize;
    private volatile long mNextAllowedUploadTimeMs;
    public final ProtoCache mProtoCache;
    private final ContentResolver mResolver;
    private final RollingFileStream mRollingFileStream;
    private final int mServerTimeoutMs;
    private final String mServerUrl;
    private final String mUserAgent;

    public EventLogger(Context context, String s, LogSource logsource, String s1, long l, String s2, 
            String s3, Configuration configuration, Account account)
    {
        this(context, null, s, logsource, s1, l, s2, s3, Locale.getDefault().getCountry(), configuration, account);
    }

    private EventLogger(Context context, String s, String s1, LogSource logsource, String s2, long l, 
            String s3, String s4, String s5, Configuration configuration, Account account)
    {
        synchronized (sInstantiatedAccounts)
        {
            Assertions.checkState(sInstantiatedAccounts.add(account), (new StringBuilder("Already instantiated an EventLogger for ")).append(account).toString());
        }
        mContext = context;
        mResolver = context.getContentResolver();
        mLogSource = logsource.mProtoValue;
        mLoggingId = null;
        mAccount = account;
        mAuthTokenType = s1;
        mProtoCache = ProtoCache.getInstance();
        mUserAgent = s2;
        mAndroidId = l;
        context = android.provider.Settings.Secure.getString(mResolver, "android_id");
        l = 0L;
        long l1 = (new BigInteger(context, 16)).longValue();
        l = l1;
_L1:
        mDeviceId = l;
        mAppVersion = s3;
        mMccmnc = s4;
        mCountry = s5;
        mServerUrl = configuration.mServerUrl;
        mDelayBetweenUploadsMs = configuration.delayBetweenUploadsMs;
        mMinDelayBetweenUploadsMs = configuration.minDelayBetweenUploadsMs;
        mServerTimeoutMs = configuration.mServerTimeoutMs;
        mMinImmediateUploadSize = (configuration.recommendedLogFileSize * 50L) / 100L + 1L;
        mMaxUploadSize = (configuration.recommendedLogFileSize * 125L) / 100L;
        s = new File(mContext.getCacheDir(), configuration.logDirectoryName);
        if (account == null)
        {
            context = "null_account";
        } else
        {
            context = (new StringBuilder()).append(account.type).append(".").append(account.name).toString();
        }
        context = new File(s, Uri.encode(context));
        if (account != null && !context.exists())
        {
            s = new File(s, Uri.encode(account.name));
            if (s.exists() && s.isDirectory())
            {
                s.renameTo(context);
            }
        }
        mRollingFileStream = new RollingFileStream(context, "eventlog.store", ".log", configuration.recommendedLogFileSize, configuration.maxStorageSize, this);
        context = new Semaphore(0);
        s = new HandlerThread("PlayEventLogger", context) {

            final Semaphore val$semaphore;

            protected final void onLooperPrepared()
            {
                semaphore.release();
            }

            
            {
                semaphore = semaphore1;
                super(s, 10);
            }
        };
        s.start();
        context.acquireUninterruptibly();
        mHandler = new Handler(s.getLooper()) {

            final EventLogger this$0;

            public final void dispatchMessage(Message message)
            {
                boolean flag2 = false;
            }

            
            {
                this$0 = EventLogger.this;
                super(looper);
            }
        };
        mHandler.sendEmptyMessage(1);
        return;
        context;
        s;
        JVM INSTR monitorexit ;
        throw context;
        s;
        Log.e("PlayEventLogger", (new StringBuilder("Invalid device id ")).append(context).toString());
          goto _L1
        context;
        Log.e("PlayEventLogger", "Null device id");
          goto _L1
    }

    private String getAuthToken(Account account)
    {
        if (account == null)
        {
            Log.w("PlayEventLogger", "No account for auth token provided");
            return null;
        }
        try
        {
            account = AccountManager.get(mContext).blockingGetAuthToken(account, mAuthTokenType, true);
        }
        // Misplaced declaration of an exception variable
        catch (Account account)
        {
            Log.e("PlayEventLogger", (new StringBuilder("Failed to get auth token: ")).append(account.getMessage()).toString(), account);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Account account)
        {
            Log.e("PlayEventLogger", (new StringBuilder("Failed to get auth token: ")).append(account.getMessage()).toString(), account);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Account account)
        {
            Log.e("PlayEventLogger", (new StringBuilder("Failed to get auth token: ")).append(account.getMessage()).toString(), account);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Account account)
        {
            Log.e("PlayEventLogger", (new StringBuilder("Failed to get auth token: ")).append(account.getMessage()).toString(), account);
            return null;
        }
        return account;
    }

    private boolean handleResponse(HttpURLConnection httpurlconnection, String s)
        throws IOException
    {
        String s1;
        int i;
        i = httpurlconnection.getResponseCode();
        s1 = httpurlconnection.getResponseMessage();
        if (200 > i || i >= 300)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        httpurlconnection = httpurlconnection.getInputStream();
        s = new ByteArrayOutputStream();
        s1 = new byte[128];
_L2:
        i = httpurlconnection.read(s1);
        if (i <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            s.write(s1, 0, i);
        }
        // Misplaced declaration of an exception variable
        catch (HttpURLConnection httpurlconnection)
        {
            Log.e("PlayEventLogger", (new StringBuilder("Error parsing content: ")).append(httpurlconnection.getMessage()).toString());
            return true;
        }
        // Misplaced declaration of an exception variable
        catch (HttpURLConnection httpurlconnection)
        {
            Log.e("PlayEventLogger", (new StringBuilder("Error getting the content of the response body: ")).append(httpurlconnection.getMessage()).toString());
            return true;
        }
        // Misplaced declaration of an exception variable
        catch (HttpURLConnection httpurlconnection)
        {
            Log.e("PlayEventLogger", (new StringBuilder("Error reading the content of the response body: ")).append(httpurlconnection.getMessage()).toString());
            return true;
        }
        if (i >= 0) goto _L2; else goto _L1
_L1:
        s = s.toByteArray();
        s = (ClientAnalytics.LogResponse)MessageNano.mergeFrom$1ec43da(new ClientAnalytics.LogResponse(), s, s.length);
        if (((ClientAnalytics.LogResponse) (s)).nextRequestWaitMillis >= 0L)
        {
            setNextUploadTimeAfter(((ClientAnalytics.LogResponse) (s)).nextRequestWaitMillis);
        }
        httpurlconnection.close();
        return true;
        if (300 <= i && i < 400)
        {
            Log.e("PlayEventLogger", (new StringBuilder("Too many redirects for HttpUrlConnection. ")).append(i).toString());
            return false;
        }
        if (i == 400)
        {
            Log.e("PlayEventLogger", "Server returned 400... deleting local malformed logs");
            return true;
        }
        if (i == 401)
        {
            Log.w("PlayEventLogger", "Server returned 401... invalidating auth token");
            AccountManager.get(mContext).invalidateAuthToken(mAccount.type, s);
            return false;
        }
        if (i == 500)
        {
            Log.w("PlayEventLogger", "Server returned 500... server crashed");
            return false;
        }
        if (i == 501)
        {
            Log.w("PlayEventLogger", "Server returned 501... service doesn't seem to exist");
            return false;
        }
        if (i == 502)
        {
            Log.w("PlayEventLogger", "Server returned 502... servers are down");
            return false;
        }
        if (i != 503)
        {
            break MISSING_BLOCK_LABEL_480;
        }
        httpurlconnection = httpurlconnection.getHeaderField("Retry-After");
        if (httpurlconnection == null)
        {
            break MISSING_BLOCK_LABEL_469;
        }
        i = 0;
        long l = Long.valueOf(httpurlconnection).longValue();
        Log.w("PlayEventLogger", (new StringBuilder("Server said to retry after ")).append(l).append(" seconds").toString());
        setNextUploadTimeAfter(1000L * l);
        i = 1;
_L3:
        return i == 0;
        s;
        Log.e("PlayEventLogger", (new StringBuilder("Unknown retry value: ")).append(httpurlconnection).toString());
          goto _L3
        Log.e("PlayEventLogger", "Status 503 without retry-after header");
        return true;
        if (i == 504)
        {
            Log.w("PlayEventLogger", "Server returned 504... timeout");
            return false;
        } else
        {
            Log.e("PlayEventLogger", (new StringBuilder("Unexpected error received from server: ")).append(i).append(" ").append(s1).toString());
            return true;
        }
    }

    private void maybeQueueImmediateUpload()
    {
        RollingFileStream rollingfilestream = mRollingFileStream;
        int i = 0;
        long l = 0L;
        for (; i < rollingfilestream.mWrittenFiles.size(); i++)
        {
            l += ((File)rollingfilestream.mWrittenFiles.get(i)).length();
        }

        if (l >= mMinImmediateUploadSize)
        {
            queueUpload(0L);
        }
    }

    private void queueUpload(long l)
    {
        long l2 = System.currentTimeMillis();
        if (l > 0L)
        {
            long l1 = l;
            if (l2 + l < mNextAllowedUploadTimeMs)
            {
                l1 = mNextAllowedUploadTimeMs - l2;
            }
            mHandler.sendEmptyMessageDelayed(3, l1);
        } else
        {
            mHandler.sendEmptyMessage(3);
        }
        mNextAllowedUploadTimeMs = Math.max(mNextAllowedUploadTimeMs, mMinDelayBetweenUploadsMs + l2);
    }

    private void setNextUploadTimeAfter(long l)
    {
        l = Math.max(mMinDelayBetweenUploadsMs, l);
        mNextAllowedUploadTimeMs = System.currentTimeMillis() + l;
    }

    private boolean uploadEventsImpl()
    {
        Object obj;
        boolean flag;
        if (!mRollingFileStream.mWrittenFiles.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            return false;
        }
        ArrayList arraylist;
        RollingFileStream rollingfilestream;
        File file;
        long l;
        long l1;
        try
        {
            arraylist = new ArrayList();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("PlayEventLogger", (new StringBuilder("Read failed ")).append(obj.getClass()).append("(").append(((IOException) (obj)).getMessage()).append(")").toString());
            mRollingFileStream.markAllFilesAsUnread();
            return false;
        }
        l = 0L;
        rollingfilestream = mRollingFileStream;
        if (!rollingfilestream.mWrittenFiles.isEmpty()) goto _L2; else goto _L1
_L1:
        Log.e("RollingFileStream", "This method should never be called when there are no written files.");
        obj = null;
_L11:
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (obj.length > 0)
        {
            arraylist.add(obj);
            l += obj.length;
        }
        obj = mRollingFileStream;
        if (!((RollingFileStream) (obj)).mWrittenFiles.isEmpty()) goto _L4; else goto _L3
_L3:
        l1 = -1L;
_L10:
        if (l1 < 0L)
        {
            break; /* Loop/switch isn't completed */
        }
        if (l1 + l <= mMaxUploadSize) goto _L6; else goto _L5
_L6:
        break MISSING_BLOCK_LABEL_40;
_L5:
        if (!arraylist.isEmpty()) goto _L8; else goto _L7
_L2:
        file = (File)rollingfilestream.mWrittenFiles.remove(0);
        obj = RollingFileStream.toByteArray(file);
        rollingfilestream.mReadFiles.add(file);
          goto _L9
_L4:
        l1 = ((File)((RollingFileStream) (obj)).mWrittenFiles.get(0)).length();
          goto _L10
_L8:
        obj = new byte[arraylist.size()][];
        arraylist.toArray(((Object []) (obj)));
_L7:
        for (obj = null; obj != null;)
        {
            Object obj2 = new ClientAnalytics.AndroidClientInfo();
            obj2.androidId = mAndroidId;
            obj2.deviceId = mDeviceId;
            if (mLoggingId != null)
            {
                obj2.loggingId = mLoggingId;
            }
            obj2.sdkVersion = android.os.Build.VERSION.SDK_INT;
            obj2.manufacturer = Build.MANUFACTURER;
            obj2.model = Build.MODEL;
            obj2.product = Build.PRODUCT;
            obj2.hardware = Build.HARDWARE;
            obj2.device = Build.DEVICE;
            obj2.osBuild = Build.ID;
            obj2.brand = Build.BRAND;
            obj2.board = Build.BOARD;
            obj2.fingerprint = Build.FINGERPRINT;
            Object obj1;
            boolean flag1;
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                obj1 = Build.getRadioVersion();
            } else
            {
                obj1 = Build.RADIO;
            }
            if (obj1 != null)
            {
                obj2.radioVersion = ((String) (obj1));
            }
            if (mMccmnc != null)
            {
                obj2.mccMnc = mMccmnc;
            }
            obj2.locale = Locale.getDefault().getLanguage();
            if (mCountry != null)
            {
                obj2.country = mCountry;
            }
            if (mAppVersion != null)
            {
                obj2.applicationBuild = mAppVersion;
            }
            obj1 = new ClientAnalytics.ClientInfo();
            obj1.clientType = 4;
            obj1.androidClientInfo = ((ClientAnalytics.AndroidClientInfo) (obj2));
            obj2 = new ClientAnalytics.LogRequest();
            obj2.requestTimeMs = System.currentTimeMillis();
            obj2.serializedLogEvents = ((byte [][]) (obj));
            obj2.logSource = mLogSource;
            obj2.clientInfo = ((ClientAnalytics.ClientInfo) (obj1));
            flag1 = uploadLog(((ClientAnalytics.LogRequest) (obj2)));
            if (flag1)
            {
                mRollingFileStream.deleteAllReadFiles();
                return flag1;
            } else
            {
                mRollingFileStream.markAllFilesAsUnread();
                return flag1;
            }
        }

        return false;
_L9:
        if (true) goto _L11; else goto _L8
    }

    private boolean uploadLog(ClientAnalytics.LogRequest logrequest)
    {
        Object obj2;
        String s1;
        obj2 = null;
        s1 = getAuthToken(mAccount);
        Object obj;
        Object obj1;
        obj = UrlRules.getRules(mResolver);
        obj1 = mServerUrl;
        obj1 = ((UrlRules) (obj)).mPattern.matcher(((CharSequence) (obj1)));
        if (!((Matcher) (obj1)).lookingAt()) goto _L2; else goto _L1
_L1:
        int i = 0;
_L17:
        if (i >= ((UrlRules) (obj)).mRules.length) goto _L2; else goto _L3
_L3:
        if (((Matcher) (obj1)).group(i + 1) == null) goto _L5; else goto _L4
_L4:
        obj1 = ((UrlRules) (obj)).mRules[i];
_L11:
        String s = mServerUrl;
        if (!((com.google.android.volley.guava.UrlRules.Rule) (obj1)).mBlock) goto _L7; else goto _L6
_L6:
        obj = null;
_L13:
        if (!TextUtils.isEmpty(((CharSequence) (obj)))) goto _L9; else goto _L8
_L8:
        obj = obj2;
          goto _L10
_L2:
        try
        {
            obj1 = com.google.android.volley.guava.UrlRules.Rule.DEFAULT;
        }
        // Misplaced declaration of an exception variable
        catch (ClientAnalytics.LogRequest logrequest)
        {
            return false;
        }
          goto _L11
_L7:
        obj = s;
        if (((com.google.android.volley.guava.UrlRules.Rule) (obj1)).mRewrite == null) goto _L13; else goto _L12
_L12:
        obj = (new StringBuilder()).append(((com.google.android.volley.guava.UrlRules.Rule) (obj1)).mRewrite).append(s.substring(((com.google.android.volley.guava.UrlRules.Rule) (obj1)).mPrefix.length())).toString();
          goto _L13
_L9:
        obj1 = (HttpURLConnection)(new URL(((String) (obj)))).openConnection();
        ((HttpURLConnection) (obj1)).setConnectTimeout(mServerTimeoutMs);
        ((HttpURLConnection) (obj1)).setReadTimeout(mServerTimeoutMs);
        ((HttpURLConnection) (obj1)).setDoOutput(true);
        ((HttpURLConnection) (obj1)).setRequestMethod("POST");
        ((HttpURLConnection) (obj1)).setRequestProperty("Content-Encoding", "gzip");
        ((HttpURLConnection) (obj1)).setRequestProperty("Content-Type", "application/x-gzip");
        ((HttpURLConnection) (obj1)).setRequestProperty("User-Agent", mUserAgent);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_277;
        }
        if (mAuthTokenType.startsWith("oauth2:"))
        {
            obj = "Bearer ";
        } else
        {
            obj = "GoogleLogin auth=";
        }
        ((HttpURLConnection) (obj1)).setRequestProperty("Authorization", (new StringBuilder()).append(((String) (obj))).append(s1).toString());
        ((HttpURLConnection) (obj1)).connect();
        obj = obj1;
          goto _L10
_L15:
        boolean flag;
        GZIPOutputStream gzipoutputstream = new GZIPOutputStream(((HttpURLConnection) (obj)).getOutputStream());
        gzipoutputstream.write(MessageNano.toByteArray(logrequest));
        gzipoutputstream.flush();
        gzipoutputstream.close();
        flag = handleResponse(((HttpURLConnection) (obj)), s1);
        ((HttpURLConnection) (obj)).disconnect();
        return flag;
        logrequest;
        Log.e("PlayEventLogger", (new StringBuilder("Upload failed ")).append(logrequest.getClass()).append("(").append(logrequest.getMessage()).append(")").toString());
        ((HttpURLConnection) (obj)).disconnect();
        return false;
        logrequest;
        ((HttpURLConnection) (obj)).disconnect();
        throw logrequest;
_L10:
        if (obj != null) goto _L15; else goto _L14
_L14:
        return true;
_L5:
        i++;
        if (true) goto _L17; else goto _L16
_L16:
    }

    public final void onNewOutputFile()
    {
        mLastSentExperiments = null;
    }

    public final volatile void onWrite(Object obj, OutputStream outputstream)
        throws IOException
    {
        obj = (ClientAnalytics.LogEvent)obj;
        int i;
        if (((ClientAnalytics.LogEvent) (obj)).exp == mLastSentExperiments)
        {
            obj.exp = null;
        } else
        {
            mLastSentExperiments = ((ClientAnalytics.LogEvent) (obj)).exp;
            if (((ClientAnalytics.LogEvent) (obj)).exp == null)
            {
                obj.exp = EMPTY_EXPERIMENTS;
            }
        }
        obj = MessageNano.toByteArray(((MessageNano) (obj)));
        i = obj.length;
        do
        {
            if ((i & 0xffffff80) == 0)
            {
                outputstream.write(i);
                outputstream.write(((byte []) (obj)));
                return;
            }
            outputstream.write(i & 0x7f | 0x80);
            i >>>= 7;
        } while (true);
    }



/*
    static void access$000(EventLogger eventlogger, Message message)
    {
        boolean flag2 = false;
        message.what;
        JVM INSTR tableswitch 1 3: default 32
    //                   1 59
    //                   2 72
    //                   3 271;
           goto _L1 _L2 _L3 _L4
_L1:
        Log.w("PlayEventLogger", (new StringBuilder("Unknown msg: ")).append(message.what).toString());
        return;
_L2:
        eventlogger.maybeQueueImmediateUpload();
        eventlogger.queueUpload(eventlogger.mDelayBetweenUploadsMs);
        return;
_L3:
        message = (ClientAnalytics.LogEvent)message.obj;
        RollingFileStream rollingfilestream = eventlogger.mRollingFileStream;
        if (rollingfilestream.mCurrentOutputFile != null) goto _L6; else goto _L5
_L5:
        rollingfilestream.createNewOutputFile();
        boolean flag1 = flag2;
        if (rollingfilestream.mCurrentOutputFile == null)
        {
            break MISSING_BLOCK_LABEL_190;
        }
_L6:
        rollingfilestream.mCallbacks.onWrite(message, rollingfilestream.mFileOutputStream);
        rollingfilestream.mFileOutputStream.flush();
        boolean flag;
        if (rollingfilestream.mCurrentOutputFile != null && rollingfilestream.mCurrentOutputFile.length() >= rollingfilestream.mRecommendedFileSize)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag2;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_190;
        }
        rollingfilestream.mFileOutputStream.close();
        rollingfilestream.mWrittenFiles.add(rollingfilestream.mCurrentOutputFile);
        rollingfilestream.createNewOutputFile();
        rollingfilestream.ensureMaxStorageSizeLimit();
        flag1 = true;
        if (!flag1) goto _L8; else goto _L7
_L7:
        eventlogger.maybeQueueImmediateUpload();
_L8:
        eventlogger.mProtoCache.recycle(message);
        return;
        Object obj;
        obj;
        Log.e("PlayEventLogger", (new StringBuilder("Could not write string (")).append(message).append(") to file: ").append(((IOException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        eventlogger.mProtoCache.recycle(message);
        return;
        obj;
        eventlogger.mProtoCache.recycle(message);
        throw obj;
_L4:
        eventlogger.mHandler.removeMessages(3);
        if (eventlogger.uploadEventsImpl())
        {
            eventlogger.maybeQueueImmediateUpload();
        }
        eventlogger.queueUpload(eventlogger.mDelayBetweenUploadsMs);
        return;
    }

*/
}
