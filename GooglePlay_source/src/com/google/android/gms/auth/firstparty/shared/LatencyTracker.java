// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.auth.firstparty.shared:
//            LatencyTrackerCreator

public class LatencyTracker
    implements SafeParcelable
{

    public static final LatencyTrackerCreator CREATOR = new LatencyTrackerCreator();
    final String mName;
    final long mStartRealtimeMillis;
    final int mVersion;
    public final LatencyTracker parent;

    LatencyTracker(int i, String s, long l, LatencyTracker latencytracker)
    {
        mVersion = i;
        mName = s;
        mStartRealtimeMillis = l;
        parent = latencytracker;
        log(s, "constructed");
    }

    private void log(String s, String s1)
    {
        if (Log.isLoggable("GLSLogging", 2))
        {
            long l = SystemClock.elapsedRealtime();
            LinkedList linkedlist = new LinkedList();
            for (LatencyTracker latencytracker = this; latencytracker != null; latencytracker = latencytracker.parent)
            {
                long l1 = l - latencytracker.mStartRealtimeMillis;
                long l2 = TimeUnit.MILLISECONDS.toSeconds(l1);
                long l3 = TimeUnit.SECONDS.toMillis(l2);
                linkedlist.addFirst(String.format("[%s, %,d.%03ds]", new Object[] {
                    latencytracker.mName, Long.valueOf(l2), Long.valueOf(l1 - l3)
                }));
            }

            String s2 = TextUtils.join(" > ", linkedlist);
            Log.println(2, "GLSLogging", (new StringBuilder()).append(s).append(" ").append(s2).append(" > ").append(s1).toString());
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        log(mName, "writing to parcel");
        LatencyTrackerCreator.writeToParcel(this, parcel, i);
    }

}
