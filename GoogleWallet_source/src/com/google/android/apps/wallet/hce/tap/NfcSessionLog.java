// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.tap;

import com.google.android.apps.wallet.util.proto.Protos;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public final class NfcSessionLog
{

    private final long mEndTimeMillis;
    private final List mLogEntries;
    private final long mStartTimeMillis;
    private final boolean mTruncated;

    public NfcSessionLog(List list, boolean flag, long l, long l1)
    {
        mLogEntries = list;
        mTruncated = flag;
        mStartTimeMillis = l;
        mEndTimeMillis = l1;
    }

    private long getDurationMillis()
    {
        return mEndTimeMillis - mStartTimeMillis;
    }

    private static String getTimeString(long l)
    {
        Date date = new Date(l);
        return (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS")).format(date);
    }

    private int size()
    {
        return mLogEntries.size();
    }

    public final com.google.wallet.proto.NanoWalletLogging.PhysicalTapLog toPhysicalTapLog()
    {
        com.google.wallet.proto.NanoWalletLogging.PhysicalTapLog physicaltaplog = new com.google.wallet.proto.NanoWalletLogging.PhysicalTapLog();
        physicaltaplog.durationMillis = Long.valueOf(getDurationMillis());
        physicaltaplog.clientStartTimeMillis = Long.valueOf(mStartTimeMillis);
        physicaltaplog.events = (com.google.wallet.proto.NanoWalletLogging.PhysicalTapLog.PhysicalTapLogEvent[])mLogEntries.toArray(physicaltaplog.events);
        return physicaltaplog;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        int i = size();
        StringBuilder stringbuilder1 = stringbuilder.append("NfcSessionLog with ").append(i);
        String s;
        if (i == 1)
        {
            s = " entry";
        } else
        {
            s = " entries";
        }
        stringbuilder1.append(s);
        if (i == 0)
        {
            return stringbuilder.append(".").toString();
        }
        if (i > 1)
        {
            stringbuilder.append(" lasting ").append(mEndTimeMillis - mStartTimeMillis).append("ms");
        }
        if (mTruncated)
        {
            stringbuilder.append(" (truncated)");
        }
        stringbuilder.append(":\n");
        long l = mStartTimeMillis;
        for (Iterator iterator = mLogEntries.iterator(); iterator.hasNext();)
        {
            com.google.wallet.proto.NanoWalletLogging.PhysicalTapLog.PhysicalTapLogEvent physicaltaplogevent = (com.google.wallet.proto.NanoWalletLogging.PhysicalTapLog.PhysicalTapLogEvent)iterator.next();
            long l1 = Protos.valueWithDefault(physicaltaplogevent.clientEventTimeMillis, 0L);
            String s1 = getTimeString(l1);
            int j = physicaltaplogevent.type.intValue();
            long l2 = mStartTimeMillis;
            stringbuilder.append("  ").append(s1).append(String.format("  %5d", new Object[] {
                Long.valueOf(l1 - l2)
            })).append(String.format("  %6s", new Object[] {
                (new StringBuilder(21)).append("+").append(l1 - l).toString()
            })).append("  ").append(j).append("\n");
            l = l1;
        }

        return stringbuilder.toString();
    }
}
