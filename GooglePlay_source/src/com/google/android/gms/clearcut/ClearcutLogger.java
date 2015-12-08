// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.clearcut;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.clearcut.internal.ClearcutLoggerApiImpl;
import com.google.android.gms.clearcut.internal.ClearcutLoggerClientImpl;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.util.ArrayList;
import java.util.TimeZone;

// Referenced classes of package com.google.android.gms.clearcut:
//            ClearcutLoggerApi

public final class ClearcutLogger
{
    public final class LogEventBuilder
    {

        public final MessageProducer mExtensionProducer;
        public boolean mIsConsumed;
        public final com.google.wireless.android.play.playlog.proto.ClientAnalytics.LogEvent mLogEvent;
        public int mLogSource;
        public String mLogSourceName;
        public String mLoggingId;
        public int mQosTier;
        private ArrayList mTestCodes;
        public String mUploadAccountName;
        public final ClearcutLogger this$0;

        private LogEventBuilder(byte abyte0[])
        {
            this(abyte0, (byte)0);
        }

        private LogEventBuilder(byte abyte0[], byte byte0)
        {
            this$0 = ClearcutLogger.this;
            super();
            mLogSource = ClearcutLogger.this.mLogSource;
            mLogSourceName = ClearcutLogger.this.mLogSourceName;
            mUploadAccountName = ClearcutLogger.this.mUploadAccountName;
            mLoggingId = null;
            mQosTier = 0;
            mTestCodes = null;
            mLogEvent = new com.google.wireless.android.play.playlog.proto.ClientAnalytics.LogEvent();
            mIsConsumed = false;
            mUploadAccountName = ClearcutLogger.this.mUploadAccountName;
            mLoggingId = null;
            mLogEvent.eventTimeMs = mClock.currentTimeMillis();
            mLogEvent.eventUptimeMs = mClock.elapsedRealtime();
            com.google.wireless.android.play.playlog.proto.ClientAnalytics.LogEvent logevent = mLogEvent;
            TimeZoneOffsetProvider _tmp = mOffsetProvider;
            long l = mLogEvent.eventTimeMs;
            logevent.timezoneOffsetSeconds = TimeZone.getDefault().getOffset(l) / 1000;
            if (abyte0 != null)
            {
                mLogEvent.sourceExtension = abyte0;
            }
            mExtensionProducer = null;
        }

        public LogEventBuilder(byte abyte0[], char c)
        {
            this(abyte0);
        }
    }

    public static interface MessageProducer
    {

        public abstract byte[] toProtoBytes();
    }

    public static final class TimeZoneOffsetProvider
    {

        public TimeZoneOffsetProvider()
        {
        }
    }


    public static final Api API;
    public static final com.google.android.gms.common.api.Api.AbstractClientBuilder CLIENT_BUILDER;
    public static final com.google.android.gms.common.api.Api.ClientKey CLIENT_KEY;
    public static final ClearcutLoggerApi ClearcutLoggerApi = new ClearcutLoggerApiImpl();
    private final Clock mClock;
    private final Context mContext;
    private final boolean mIsAnonymous;
    private int mLogSource;
    private String mLogSourceName;
    private final ClearcutLoggerApi mLoggerApi;
    private String mLoggingId;
    private TimeZoneOffsetProvider mOffsetProvider;
    private final String mPackageName;
    private final int mPackageVersionCode;
    private int mQosTier;
    private String mUploadAccountName;

    public ClearcutLogger(Context context, String s, String s1)
    {
        this(context, s, s1, ClearcutLoggerApi, DefaultClock.getInstance());
    }

    private ClearcutLogger(Context context, String s, String s1, ClearcutLoggerApi clearcutloggerapi, Clock clock)
    {
        mLogSource = -1;
        mQosTier = 0;
        mContext = context.getApplicationContext();
        mPackageName = context.getPackageName();
        mPackageVersionCode = getVersionCode(context);
        mLogSource = -1;
        mLogSourceName = s;
        mUploadAccountName = s1;
        mLoggingId = null;
        mIsAnonymous = false;
        mLoggerApi = clearcutloggerapi;
        mClock = clock;
        mOffsetProvider = new TimeZoneOffsetProvider();
        mQosTier = 0;
    }

    private static int getVersionCode(Context context)
    {
        int i;
        try
        {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.wtf("ClearcutLogger", "This can't happen.");
            return 0;
        }
        return i;
    }

    static 
    {
        CLIENT_KEY = new com.google.android.gms.common.api.Api.ClientKey();
        CLIENT_BUILDER = new com.google.android.gms.common.api.Api.AbstractClientBuilder() {

            public final volatile com.google.android.gms.common.api.Api.Client buildClient(Context context, Looper looper, ClientSettings clientsettings, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return new ClearcutLoggerClientImpl(context, looper, clientsettings, connectioncallbacks, onconnectionfailedlistener);
            }

        };
        API = new Api("ClearcutLogger.API", CLIENT_BUILDER, CLIENT_KEY);
    }













}
