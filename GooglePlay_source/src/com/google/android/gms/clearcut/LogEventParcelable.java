// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.clearcut;

import android.os.Parcel;
import com.google.android.gms.common.internal.Joiner;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.clearcut:
//            LogEventParcelableCreator

public class LogEventParcelable
    implements SafeParcelable
{

    public static final LogEventParcelableCreator CREATOR = new LogEventParcelableCreator();
    public final ClearcutLogger.MessageProducer clientVisualElementsProducer;
    public final ClearcutLogger.MessageProducer extensionProducer;
    public final com.google.wireless.android.play.playlog.proto.ClientAnalytics.LogEvent logEvent;
    public byte logEventBytes[];
    public PlayLoggerContext playLoggerContext;
    public int testCodes[];
    public final int versionCode;

    LogEventParcelable(int i, PlayLoggerContext playloggercontext, byte abyte0[], int ai[])
    {
        versionCode = i;
        playLoggerContext = playloggercontext;
        logEventBytes = abyte0;
        testCodes = ai;
        logEvent = null;
        extensionProducer = null;
        clientVisualElementsProducer = null;
    }

    public LogEventParcelable(PlayLoggerContext playloggercontext, com.google.wireless.android.play.playlog.proto.ClientAnalytics.LogEvent logevent, ClearcutLogger.MessageProducer messageproducer, ClearcutLogger.MessageProducer messageproducer1, int ai[])
    {
        versionCode = 1;
        playLoggerContext = playloggercontext;
        logEvent = logevent;
        extensionProducer = messageproducer;
        clientVisualElementsProducer = null;
        testCodes = ai;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof LogEventParcelable)
            {
                if (versionCode != ((LogEventParcelable) (obj = (LogEventParcelable)obj)).versionCode || !Objects.equal(playLoggerContext, ((LogEventParcelable) (obj)).playLoggerContext) || !Arrays.equals(logEventBytes, ((LogEventParcelable) (obj)).logEventBytes) || !Arrays.equals(testCodes, ((LogEventParcelable) (obj)).testCodes) || !Objects.equal(logEvent, ((LogEventParcelable) (obj)).logEvent) || !Objects.equal(extensionProducer, ((LogEventParcelable) (obj)).extensionProducer) || !Objects.equal(clientVisualElementsProducer, ((LogEventParcelable) (obj)).clientVisualElementsProducer))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(versionCode), playLoggerContext, logEventBytes, testCodes, logEvent, extensionProducer, clientVisualElementsProducer
        });
    }

    public String toString()
    {
        Object obj = null;
        StringBuilder stringbuilder = new StringBuilder("LogEventParcelable[");
        stringbuilder.append(versionCode);
        stringbuilder.append(", ");
        stringbuilder.append(playLoggerContext);
        stringbuilder.append(", ");
        String s;
        if (logEventBytes == null)
        {
            s = null;
        } else
        {
            s = new String(logEventBytes);
        }
        stringbuilder.append(s);
        stringbuilder.append(", ");
        if (testCodes == null)
        {
            s = obj;
        } else
        {
            s = Joiner.on(", ").join(Arrays.asList(new int[][] {
                testCodes
            }));
        }
        stringbuilder.append(s);
        stringbuilder.append(", ");
        stringbuilder.append(logEvent);
        stringbuilder.append(", ");
        stringbuilder.append(extensionProducer);
        stringbuilder.append(", ");
        stringbuilder.append(clientVisualElementsProducer);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        LogEventParcelableCreator.writeToParcel(this, parcel, i);
    }

}
