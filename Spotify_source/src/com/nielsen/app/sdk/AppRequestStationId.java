// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;

import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.nielsen.app.sdk:
//            a, AppConfig, c, h, 
//            AppRequestManager

public class AppRequestStationId
{

    public static final int BUFFER_SIZE = 0x3e800;
    public static final long STATION_ID_TIMEOUT = 30L;
    public static final int TIMEOUT_CONNECTION = 60000;
    public static final int TIMEOUT_DATA = 60000;
    private static final String b = "StationIdHandler";
    private static AppRequestStationId d = null;
    Map a;
    private StationIdHandler c;
    private AppRequestManager e;
    private AppConfig f;
    private h g;
    private AppRequestManager.AppRequest h;
    private BlockingQueue i;
    private Lock j;
    private Boolean k;
    private String l;
    private String m;
    private SparseBooleanArray n;

    private AppRequestStationId()
    {
        c = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = new LinkedBlockingQueue();
        j = new ReentrantLock();
        k = Boolean.valueOf(false);
        l = "";
        m = "";
        a = new HashMap();
        n = null;
        n = new SparseBooleanArray();
        e = com.nielsen.app.sdk.a.t();
        f = com.nielsen.app.sdk.a.n();
        g = com.nielsen.app.sdk.a.m();
        m = f.a("nol_stationIdDefault", "");
    }

    static String a(AppRequestStationId apprequeststationid, String s)
    {
        apprequeststationid.m = s;
        return s;
    }

    static BlockingQueue a(AppRequestStationId apprequeststationid)
    {
        return apprequeststationid.i;
    }

    static String b(AppRequestStationId apprequeststationid)
    {
        return apprequeststationid.l;
    }

    public static AppRequestStationId getInstance()
    {
        com/nielsen/app/sdk/AppRequestStationId;
        JVM INSTR monitorenter ;
        AppRequestStationId apprequeststationid;
        if (d == null)
        {
            d = new AppRequestStationId();
        }
        apprequeststationid = d;
        com/nielsen/app/sdk/AppRequestStationId;
        JVM INSTR monitorexit ;
        return apprequeststationid;
        Exception exception;
        exception;
        throw exception;
    }

    public String getAssetId(int i1)
    {
        if (n.get(i1))
        {
            return l;
        } else
        {
            return null;
        }
    }

    public Map getData(int i1)
    {
        if (n.get(i1))
        {
            return a;
        } else
        {
            return null;
        }
    }

    public String getStationId(int i1)
    {
        if (n.get(i1))
        {
            if (m == null || m.isEmpty())
            {
                return "";
            } else
            {
                return m;
            }
        } else
        {
            return "";
        }
    }

    public boolean gotStationId(int i1)
    {
        return n.get(i1);
    }

    public void postRequest(String s)
    {
        c = new StationIdHandler(e);
        AppRequestManager apprequestmanager = e;
        apprequestmanager.getClass();
        h = new AppRequestManager.AppRequest(apprequestmanager, "StationIdHandler", c, 60000, 60000, 0x3e800);
        h.get(null, s);
    }

    public boolean sendRequest(AppConfig.a a1, int i1, String s)
    {
        boolean flag = false;
        j.lock();
        if (s == null) goto _L2; else goto _L1
_L1:
        if (l == null || l.compareToIgnoreCase(s) != 0) goto _L2; else goto _L3
_L3:
        a1.a("nol_assetid", l);
        a1.a("nol_stationId", m);
        com.nielsen.app.sdk.c.a('I', "ProcessorId(%d) : Other thread already got the stationId (%s) for the assetId (%s)", new Object[] {
            Integer.valueOf(i1), m, s
        });
        flag = k.booleanValue();
        n.put(i1, k.booleanValue());
        a1 = j;
_L5:
        a1.unlock();
        return flag;
_L2:
        boolean flag1;
        l = "";
        m = a1.a("nol_stationIdDefault");
        a1.a("nol_stationId", m);
        a1.a("nol_assetid", s);
        flag1 = f.h();
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        com.nielsen.app.sdk.c.a('I', "ProcessorId(%d) : No config file yet. Use last stationId (%s) for the assetId (%s)", new Object[] {
            Integer.valueOf(i1), m, s
        });
        n.put(i1, k.booleanValue());
        a1 = j;
        continue; /* Loop/switch isn't completed */
        boolean flag2 = g.r();
        if (flag1 && flag2)
        {
            break; /* Loop/switch isn't completed */
        }
        com.nielsen.app.sdk.c.a('I', "ProcessorId(%d) : AppSdk offline. Use last stationId (%s) for the assetId (%s)", new Object[] {
            Integer.valueOf(i1), m, s
        });
        n.put(i1, k.booleanValue());
        a1 = j;
        if (true) goto _L5; else goto _L4
_L4:
        String s2 = a1.a("nol_stationURL");
        String s1;
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_316;
        }
        s1 = s2;
        if (!s2.isEmpty())
        {
            break MISSING_BLOCK_LABEL_329;
        }
        s1 = f.a("nol_stationURL", "");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_738;
        }
        boolean aflag[];
        if (s1.isEmpty())
        {
            break MISSING_BLOCK_LABEL_738;
        }
        aflag = new boolean[1];
        aflag[0] = false;
        s1 = a1.a(s1, aflag);
        if (!aflag[0] || s1 == null) goto _L7; else goto _L6
_L6:
        if (s1.isEmpty()) goto _L7; else goto _L8
_L8:
        s1 = (new StringBuilder()).append(s1).append("&rnd=").append(Integer.toString(com.nielsen.app.sdk.h.s())).toString();
        com.nielsen.app.sdk.c.a('I', "Station Id on processor(%d). Sending message: %s", new Object[] {
            Integer.valueOf(i1), s1
        });
        postRequest(s1);
        k = (Boolean)i.poll(30L, TimeUnit.SECONDS);
        if (k == null || !k.booleanValue()) goto _L10; else goto _L9
_L9:
        l = s;
        a1.a("nol_assetid", l);
        a1.a("nol_stationId", m);
        f.b(i1, "nol_assetid", l);
        f.b(i1, "nol_stationId", m);
        com.nielsen.app.sdk.c.a('I', "Station Id response on processor(%d). StationId(%s). AssedId(%s)", new Object[] {
            Integer.valueOf(i1), m, l
        });
_L11:
        n.put(i1, k.booleanValue());
        a1 = j;
_L12:
        a1.unlock();
        return k.booleanValue();
_L10:
        k = Boolean.valueOf(false);
        com.nielsen.app.sdk.c.a(12, 'E', "Station ID request failed, %s", new Object[] {
            s1
        });
          goto _L11
        a1;
        k = Boolean.valueOf(false);
        com.nielsen.app.sdk.c.a(a1, true, 12, 'E', "Could not get StaionId for assetId(%s)", new Object[] {
            s
        });
        n.put(i1, k.booleanValue());
        a1 = j;
          goto _L12
_L7:
        k = Boolean.valueOf(false);
        com.nielsen.app.sdk.c.a('I', "Station ID URL parsing failed, %s", new Object[] {
            s1
        });
          goto _L11
        a1;
        n.put(i1, k.booleanValue());
        j.unlock();
        throw a1;
        k = Boolean.valueOf(false);
        com.nielsen.app.sdk.c.a(12, 'E', "No Station ID URL to parse", new Object[0]);
          goto _L11
    }


    private class StationIdHandler extends AppRequestManager.AppRequestHandler
    {

        Boolean a;
        final AppRequestStationId b;

        public void onError(String s, long l1, Exception exception)
        {
            AppRequestStationId.a(b).put(a);
            s = ((String) (new Object[0]));
_L2:
            com.nielsen.app.sdk.c.a(exception, true, 12, 'E', "Error while responding request", s);
            return;
            s;
            com.nielsen.app.sdk.c.a(exception, true, 12, 'E', "Error while responding request", new Object[0]);
            throw s;
            s;
            s = ((String) (new Object[0]));
            if (true) goto _L2; else goto _L1
_L1:
        }

        public void onFinish(String s, long l1, String s1)
        {
            com.nielsen.app.sdk.c.a('I', "STATION ID response: %s", new Object[] {
                s1
            });
            if (s1 == null)
            {
                break MISSING_BLOCK_LABEL_186;
            }
            if (s1.isEmpty())
            {
                break MISSING_BLOCK_LABEL_186;
            }
            s = new JSONObject(s1);
            if (!s.has("nol_stationId"))
            {
                break MISSING_BLOCK_LABEL_186;
            }
            b.a.clear();
            String s2;
            String s3;
            for (s1 = s.keys(); s1.hasNext(); b.a.put(s2, s3))
            {
                s2 = (String)s1.next();
                s3 = s.getString(s2);
            }

            try
            {
                s = s.getString("nol_stationId");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                onError((new StringBuilder("Failed recovering StationId value for assetId(")).append(AppRequestStationId.b(b)).append(")").toString(), l1, s);
                return;
            }
            if (s == null)
            {
                break MISSING_BLOCK_LABEL_186;
            }
            if (!s.isEmpty())
            {
                AppRequestStationId.a(b, s);
                a = Boolean.valueOf(true);
            }
            AppRequestStationId.a(b).put(a);
            return;
        }

        public void onIdle(String s, long l1)
        {
        }

        public void onStart(String s, long l1)
        {
        }

        public void onUpdate(String s, long l1, long l2, long l3, 
                String s1)
        {
        }

        public StationIdHandler(AppRequestManager apprequestmanager)
        {
            b = AppRequestStationId.this;
            apprequestmanager.getClass();
            super(apprequestmanager, "StationIdHandler");
            a = Boolean.valueOf(false);
        }
    }

}
