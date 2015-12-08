// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.data.clienttelemetry;

import java.util.ArrayList;

// Referenced classes of package com.skype.data.clienttelemetry:
//            NotImplementedException, InitializeException, TelemetryErrorCode, TelemetryStandaloneUtils, 
//            EcsClientConfig, EcsClientDependencies, EcsClient, EcsErrorCode, 
//            TelemetryConfig, TelemetryDependencies, TelemetryClient, DataRVErrorCode

public class TelemetryManager
{

    public static String a = "https://skypeecs-int-cd-0.cloudapp.net/config/v1/Skype/";
    public static String b = "https://skypeecs-int-cd-1.cloudapp.net/config/v1/Skype/";
    public static String c = "https://a.config.skype.com/config/v1/Skype/";
    public static String d = "https://b.config.skype.com/config/v1/Skype/";
    public static String e = "https://pipe.int.trafficmanager.net/Collector/3.0/";
    public static String f = "https://pipe.skype.com/Collector/3.0/";
    private static final String g = com/skype/data/clienttelemetry/TelemetryManager.getSimpleName();
    private String h;
    private int i;
    private int j;
    private long k;
    private TelemetryClient l;
    private TelemetryConfig m;
    private TelemetryDependencies n;
    private String o;
    private int p;
    private EcsClient q;
    private EcsClientConfig r;
    private EcsClientDependencies s;
    private ArrayList t;
    private boolean u;
    private String v;
    private long w;
    private long x;

    public TelemetryManager(long l1)
        throws NotImplementedException
    {
        h = null;
        k = 0L;
        l = null;
        m = null;
        n = null;
        o = f;
        q = null;
        r = null;
        s = null;
        t = new ArrayList();
        u = false;
        v = null;
        w = 0L;
        x = 0L;
        t.clear();
        t.add(c);
        t.add(d);
        i = 3;
        w = l1;
        x = 0L;
    }

    public final TelemetryErrorCode a()
    {
        Object obj;
        String.format("Initializing with %s", new Object[] {
            null
        });
        obj = TelemetryErrorCode.a;
        if (i == 3) goto _L2; else goto _L1
_L1:
        k = TelemetryStandaloneUtils.a().b();
        if (k != 0L) goto _L2; else goto _L3
_L3:
        Object obj1;
        TelemetryErrorCode.b.a("unknown");
        obj1 = TelemetryErrorCode.b;
_L13:
        return ((TelemetryErrorCode) (obj1));
_L2:
        if (i != 1 && i != 2) goto _L5; else goto _L4
_L4:
        r = new EcsClientConfig();
        s = new EcsClientDependencies();
        q = new EcsClient();
        p = q.b();
        r.a(t);
        r.a(p);
        r.a(h);
        s.a(k);
        s.a(p);
        obj = q.a(r, s);
        if (obj == EcsErrorCode.a) goto _L7; else goto _L6
_L6:
        TelemetryErrorCode.d.a(((EcsErrorCode) (obj)).toString());
        obj = TelemetryErrorCode.d;
_L5:
        if (i != 0 && i != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        m = new TelemetryConfig();
        n = new TelemetryDependencies();
        l = new TelemetryClient();
        j = l.b();
        m.a(j);
        m.a(o);
        m.b(h);
        m.a();
        m.b();
        m.d();
        m.c("NULL");
        if (q == null) goto _L9; else goto _L8
_L8:
        n.b(q.a());
_L15:
        n.a(k);
        n.a(j);
        obj = l.a(m, n);
        if (obj == DataRVErrorCode.a) goto _L11; else goto _L10
_L10:
        TelemetryErrorCode.c.a(((DataRVErrorCode) (obj)).toString());
        obj = TelemetryErrorCode.c;
_L16:
        obj1 = obj;
        if (obj != TelemetryErrorCode.a) goto _L13; else goto _L12
_L12:
        obj1 = obj;
        if (i != 3) goto _L13; else goto _L14
_L14:
        if (w != 0L)
        {
            l = new TelemetryClient(w);
            j = l.b();
        }
        if (x != 0L)
        {
            q = new EcsClient(x);
            p = q.b();
        }
        obj = TelemetryErrorCode.a;
        return ((TelemetryErrorCode) (obj));
_L7:
        try
        {
            obj = TelemetryErrorCode.a;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            TelemetryErrorCode.b.a(((InitializeException) (obj)).toString());
            return TelemetryErrorCode.e;
        }
          goto _L5
_L9:
        try
        {
            n.b(0L);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            TelemetryErrorCode.e.a(((InitializeException) (obj)).toString());
            return TelemetryErrorCode.e;
        }
          goto _L15
_L11:
        obj = TelemetryErrorCode.a;
          goto _L16
        InitializeException initializeexception;
        initializeexception;
        TelemetryErrorCode.e.a(initializeexception.toString());
        return TelemetryErrorCode.e;
          goto _L5
    }

    public final TelemetryClient b()
    {
        return l;
    }

}
