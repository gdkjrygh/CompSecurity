// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.analytics;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.apps.common.csi.lib.Reporter;
import com.google.android.apps.common.csi.lib.TickItem;
import com.google.android.apps.common.csi.lib.Ticker;
import com.google.android.apps.wallet.logging.WLog;
import com.google.common.base.Preconditions;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.google.android.apps.wallet.analytics:
//            ClientTimingReportingConfiguration

public class CsiManager
{
    static final class Session
    {

        private final long expirationTimestamp = SystemClock.elapsedRealtime() + 0x36ee80L;
        public final String id = UUID.randomUUID().toString();

        public final boolean isExpired()
        {
            return SystemClock.elapsedRealtime() > expirationTimestamp;
        }

        public Session()
        {
        }
    }


    public static final String TAG = com/google/android/apps/wallet/analytics/CsiManager.getSimpleName();
    private final HashMap actionTickerMap = new HashMap();
    private String eventId;
    private final HashMap pairTickItemMap = new HashMap();
    private final Reporter reporter;
    private final ClientTimingReportingConfiguration reportingConfig;
    private Session session;

    CsiManager(Reporter reporter1, ClientTimingReportingConfiguration clienttimingreportingconfiguration)
    {
        reporter = reporter1;
        reportingConfig = clienttimingreportingconfiguration;
        eventId = null;
        session = new Session();
    }

    private String getSessionId()
    {
        if (session.isExpired())
        {
            session = new Session();
        }
        return session.id;
    }

    private void report(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (s != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Ticker ticker = (Ticker)actionTickerMap.get(s);
        if (ticker == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        WLog.dfmt(TAG, "report: %s", new Object[] {
            s
        });
        if (!TextUtils.isEmpty(eventId))
        {
            ticker.putCustomizedParam("ei", eventId);
        }
        reportTicker(ticker);
        actionTickerMap.remove(s);
        if (true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
    }

    final void clear(String s)
    {
        this;
        JVM INSTR monitorenter ;
        actionTickerMap.remove(s);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final void endTiming(String s)
    {
        boolean flag;
        if (s != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        WLog.dfmt(TAG, "finish/report timing: %s", new Object[] {
            s
        });
        if (reportingConfig.isTimingReportedEnabled())
        {
            finish(s, "prt");
            report(s);
        }
    }

    public final void finish(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        if (s1 != null && s != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Ticker ticker = (Ticker)actionTickerMap.get(s);
        if (ticker == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        WLog.dfmt(TAG, "finish: %s", new Object[] {
            s
        });
        s = (TickItem)pairTickItemMap.get(Pair.create(s, s1));
        if (s == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        ticker.tick(s, new String[] {
            s1
        });
        if (true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
    }

    public final void reportTicker(Ticker ticker)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = reportingConfig.isTimingReportedEnabled();
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!ticker.getCustomizedParam().containsKey("si"))
        {
            ticker.putCustomizedParam("si", getSessionId());
        }
        reporter.report(ticker);
        if (true) goto _L1; else goto _L3
_L3:
        ticker;
        throw ticker;
    }

    public final void setEventId(String s)
    {
        this;
        JVM INSTR monitorenter ;
        eventId = s;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final void start(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        if (s1 != null && s != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Ticker ticker1;
        if (!reportingConfig.isTimingReportedEnabled())
        {
            continue; /* Loop/switch isn't completed */
        }
        ticker1 = (Ticker)actionTickerMap.get(s);
        Ticker ticker;
        ticker = ticker1;
        if (ticker1 != null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        ticker = new Ticker(s);
        actionTickerMap.put(s, ticker);
        ticker.putCustomizedParam("si", getSessionId());
        long l = SystemClock.elapsedRealtime();
        ticker.putCustomizedParam("st", (new StringBuilder(20)).append(l).toString());
        pairTickItemMap.put(Pair.create(s, s1), ticker.tick());
        if (true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
    }

    public final void startTiming(String s)
    {
        this;
        JVM INSTR monitorenter ;
        WLog.dfmt(TAG, "start timing: %s", new Object[] {
            s
        });
        start(s, "prt");
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

}
