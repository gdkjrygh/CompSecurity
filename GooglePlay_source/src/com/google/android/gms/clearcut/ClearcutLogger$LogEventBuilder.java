// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.clearcut;

import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.TimeZone;

// Referenced classes of package com.google.android.gms.clearcut:
//            ClearcutLogger

public final class <init>
{

    public final <init> mExtensionProducer;
    public boolean mIsConsumed;
    public final com.google.wireless.android.play.playlog.proto.cer mLogEvent;
    public int mLogSource;
    public String mLogSourceName;
    public String mLoggingId;
    public int mQosTier;
    private ArrayList mTestCodes;
    public String mUploadAccountName;
    public final ClearcutLogger this$0;

    private LogEvent(byte abyte0[])
    {
        this(abyte0, (byte)0);
    }

    private LogEvent(byte abyte0[], byte byte0)
    {
        this$0 = ClearcutLogger.this;
        super();
        mLogSource = ClearcutLogger.access$200(ClearcutLogger.this);
        mLogSourceName = ClearcutLogger.access$300(ClearcutLogger.this);
        mUploadAccountName = ClearcutLogger.access$400(ClearcutLogger.this);
        mLoggingId = ClearcutLogger.access$500(ClearcutLogger.this);
        mQosTier = ClearcutLogger.access$600$6ec23d82();
        mTestCodes = null;
        mLogEvent = new com.google.wireless.android.play.playlog.proto.();
        mIsConsumed = false;
        mUploadAccountName = ClearcutLogger.access$400(ClearcutLogger.this);
        mLoggingId = ClearcutLogger.access$500(ClearcutLogger.this);
        mLogEvent.imeMs = ClearcutLogger.access$700(ClearcutLogger.this).currentTimeMillis();
        mLogEvent.ptimeMs = ClearcutLogger.access$700(ClearcutLogger.this).elapsedRealtime();
        com.google.wireless.android.play.playlog.proto.  = mLogEvent;
        ovider _tmp = ClearcutLogger.access$800(ClearcutLogger.this);
        long l = mLogEvent.imeMs;
        .neOffsetSeconds = TimeZone.getDefault().getOffset(l) / 1000;
        if (abyte0 != null)
        {
            mLogEvent.Extension = abyte0;
        }
        mExtensionProducer = null;
    }

    public mExtensionProducer(byte abyte0[], char c)
    {
        this(abyte0);
    }
}
