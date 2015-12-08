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
//            a, AppConfig, h, c, 
//            AppNative, AppRequestManager

public class AppRequestTimeShiftValue
{

    public static final int BUFFER_SIZE = 0x3e800;
    public static final int TIMEOUT_CONNECTION = 60000;
    public static final int TIMEOUT_DATA = 60000;
    public static final long TSV_TIMEOUT = 30L;
    private static final String b = "TimeShiftValueHandler";
    private static AppRequestTimeShiftValue d = null;
    Map a;
    private TimeShiftValueHandler c;
    private AppRequestManager e;
    private AppNative f;
    private AppConfig g;
    private h h;
    private AppRequestManager.AppRequest i;
    private BlockingQueue j;
    private Lock k;
    private String l;
    private String m;
    private long n;
    private long o;
    private SparseBooleanArray p;

    private AppRequestTimeShiftValue()
    {
        c = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = new LinkedBlockingQueue();
        k = new ReentrantLock();
        a = new HashMap();
        l = "99";
        m = "";
        n = 0L;
        o = 0L;
        p = null;
        p = new SparseBooleanArray();
        e = com.nielsen.app.sdk.a.t();
        f = com.nielsen.app.sdk.a.q();
        g = com.nielsen.app.sdk.a.n();
        h = com.nielsen.app.sdk.a.m();
        l = g.a("nol_tsvFlag", "99");
    }

    static long a(AppRequestTimeShiftValue apprequesttimeshiftvalue, long l1)
    {
        apprequesttimeshiftvalue.n = l1;
        return l1;
    }

    static String a(AppRequestTimeShiftValue apprequesttimeshiftvalue, String s)
    {
        apprequesttimeshiftvalue.l = s;
        return s;
    }

    static BlockingQueue a(AppRequestTimeShiftValue apprequesttimeshiftvalue)
    {
        return apprequesttimeshiftvalue.j;
    }

    static long b(AppRequestTimeShiftValue apprequesttimeshiftvalue, long l1)
    {
        apprequesttimeshiftvalue.o = l1;
        return l1;
    }

    static String b(AppRequestTimeShiftValue apprequesttimeshiftvalue)
    {
        return apprequesttimeshiftvalue.m;
    }

    public static AppRequestTimeShiftValue getInstance()
    {
        com/nielsen/app/sdk/AppRequestTimeShiftValue;
        JVM INSTR monitorenter ;
        AppRequestTimeShiftValue apprequesttimeshiftvalue;
        if (d == null)
        {
            d = new AppRequestTimeShiftValue();
        }
        apprequesttimeshiftvalue = d;
        com/nielsen/app/sdk/AppRequestTimeShiftValue;
        JVM INSTR monitorexit ;
        return apprequesttimeshiftvalue;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean didItGetTimeShiftValue(int i1)
    {
        boolean flag = false;
        if (p != null)
        {
            flag = p.get(i1);
        }
        return flag;
    }

    public Map getData(int i1)
    {
        if (p.get(i1))
        {
            return a;
        } else
        {
            return null;
        }
    }

    public long getTimeCodeFd(int i1)
    {
        if (p.get(i1))
        {
            return o;
        } else
        {
            return -1L;
        }
    }

    public long getTimeCodePc(int i1)
    {
        if (p.get(i1))
        {
            return n;
        } else
        {
            return -1L;
        }
    }

    public String getTimeShiftValue()
    {
        return l;
    }

    public String getTimeShiftValue(int i1)
    {
        if (p.get(i1))
        {
            return l;
        } else
        {
            return null;
        }
    }

    public void postRequest(String s)
    {
        c = new TimeShiftValueHandler(e);
        AppRequestManager apprequestmanager = e;
        apprequestmanager.getClass();
        i = new AppRequestManager.AppRequest(apprequestmanager, "TimeShiftValueHandler", c, 60000, 60000, 0x3e800);
        i.get(null, s);
    }

    public void resetTimeShiftValue(int i1)
    {
        m = "";
        l = "";
        p.put(i1, false);
    }

    public boolean senRequest(AppConfig.a a1, long l1, int i1, String s, String s1, String s2)
    {
        Boolean boolean1;
        Object obj;
        Object obj1;
        boolean1 = Boolean.valueOf(false);
        obj = boolean1;
        obj1 = boolean1;
        k.lock();
        if (s1 == null) goto _L2; else goto _L1
_L1:
        obj = boolean1;
        obj1 = boolean1;
        if (m == null) goto _L2; else goto _L3
_L3:
        obj = boolean1;
        obj1 = boolean1;
        if (m.compareToIgnoreCase(s1) != 0) goto _L2; else goto _L4
_L4:
        obj = boolean1;
        obj1 = boolean1;
        a1.a(s2, m);
        obj = boolean1;
        obj1 = boolean1;
        a1.a("nol_tsvFlag", l);
        obj = boolean1;
        obj1 = boolean1;
        a1 = Boolean.valueOf(true);
        obj = a1;
        obj1 = a1;
        boolean flag = a1.booleanValue();
        s = a1;
        if (a1 == null)
        {
            s = Boolean.valueOf(false);
        }
        if (p != null)
        {
            p.put(i1, s.booleanValue());
        }
        a1 = k;
_L6:
        a1.unlock();
        return flag;
_L2:
        obj = boolean1;
        obj1 = boolean1;
        flag = g.h();
        obj = boolean1;
        obj1 = boolean1;
        boolean flag1 = h.r();
        if (flag && flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = boolean1;
        obj1 = boolean1;
        com.nielsen.app.sdk.c.a('I', "ProcessorId(%d) : No config file yet or AppSdk offline. Use last TSV (%s) for cid (%s)", new Object[] {
            Integer.valueOf(i1), l, m
        });
        obj = boolean1;
        obj1 = boolean1;
        flag = boolean1.booleanValue();
        a1 = boolean1;
        if (boolean1 == null)
        {
            a1 = Boolean.valueOf(false);
        }
        if (p != null)
        {
            p.put(i1, a1.booleanValue());
        }
        a1 = k;
        if (true) goto _L6; else goto _L5
_L5:
        obj = boolean1;
        obj1 = boolean1;
        String s3 = f.id3TagGetStreamType(l1);
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_368;
        }
        obj = boolean1;
        obj1 = boolean1;
        if (s3.isEmpty())
        {
            break MISSING_BLOCK_LABEL_368;
        }
        obj = boolean1;
        obj1 = boolean1;
        a1.a("nol_breakout", s3);
        obj = boolean1;
        obj1 = boolean1;
        s3 = Long.toString(com.nielsen.app.sdk.h.g());
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_421;
        }
        obj = boolean1;
        obj1 = boolean1;
        if (s3.isEmpty())
        {
            break MISSING_BLOCK_LABEL_421;
        }
        obj = boolean1;
        obj1 = boolean1;
        a1.a("nol_devtime", s3);
        obj = boolean1;
        obj1 = boolean1;
        s3 = h.l();
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_475;
        }
        obj = boolean1;
        obj1 = boolean1;
        if (s3.isEmpty())
        {
            break MISSING_BLOCK_LABEL_475;
        }
        obj = boolean1;
        obj1 = boolean1;
        a1.a("nol_devtimezone", s3);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_512;
        }
        obj = boolean1;
        obj1 = boolean1;
        if (s.isEmpty())
        {
            break MISSING_BLOCK_LABEL_512;
        }
        obj = boolean1;
        obj1 = boolean1;
        a1.a("nol_id3Raw", s);
        obj = boolean1;
        obj1 = boolean1;
        s3 = a1.a("nol_tsvURL");
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_553;
        }
        s = s3;
        obj = boolean1;
        obj1 = boolean1;
        if (!s3.isEmpty())
        {
            break MISSING_BLOCK_LABEL_574;
        }
        obj = boolean1;
        obj1 = boolean1;
        s = g.a("nol_tsvURL", "");
        if (s == null) goto _L8; else goto _L7
_L7:
        obj = boolean1;
        obj1 = boolean1;
        if (s.isEmpty()) goto _L8; else goto _L9
_L9:
        obj = boolean1;
        obj1 = boolean1;
        boolean aflag[] = new boolean[1];
        aflag[0] = false;
        obj = boolean1;
        obj1 = boolean1;
        s = a1.a(s, aflag);
        if (!aflag[0] || s == null) goto _L11; else goto _L10
_L10:
        obj = boolean1;
        obj1 = boolean1;
        if (s.isEmpty()) goto _L11; else goto _L12
_L12:
        obj = boolean1;
        obj1 = boolean1;
        aflag = (new StringBuilder()).append(s).append("&rnd=").append(Integer.toString(com.nielsen.app.sdk.h.s())).toString();
        obj = boolean1;
        obj1 = boolean1;
        com.nielsen.app.sdk.c.a('I', "TSV request on processor(%d) : Sending message: %s", new Object[] {
            Integer.valueOf(i1), aflag
        });
        obj = boolean1;
        obj1 = boolean1;
        postRequest(aflag);
        obj = boolean1;
        obj1 = boolean1;
        s = (Boolean)j.poll(30L, TimeUnit.SECONDS);
        if (s == null) goto _L14; else goto _L13
_L13:
        if (!s.booleanValue()) goto _L14; else goto _L15
_L15:
        m = s1;
        a1.a("nol_stationId", l);
        a1.a(s2, m);
        com.nielsen.app.sdk.c.a('I', "Processor(%d) : Received TSV (%s) for cid(%s)", new Object[] {
            Integer.valueOf(i1), l, m
        });
_L16:
        a1 = s;
        if (s == null)
        {
            a1 = Boolean.valueOf(false);
        }
        if (p != null)
        {
            p.put(i1, a1.booleanValue());
        }
        s = k;
_L17:
        s.unlock();
        return a1.booleanValue();
_L14:
        com.nielsen.app.sdk.c.a(11, 'E', "Failed request, %s", new Object[] {
            aflag
        });
        resetTimeShiftValue(i1);
          goto _L16
        s2;
        a1 = s;
        s = s2;
_L21:
        com.nielsen.app.sdk.c.a(s, true, 11, 'E', "Could not get the TSV for cid(%s)", new Object[] {
            s1
        });
        resetTimeShiftValue(i1);
_L18:
        if (a1 == null)
        {
            a1 = Boolean.valueOf(false);
        }
        if (p != null)
        {
            p.put(i1, a1.booleanValue());
        }
        s = k;
          goto _L17
_L8:
        obj = boolean1;
        obj1 = boolean1;
        com.nielsen.app.sdk.c.a(11, 'E', "Failed parsing. There is no URL for the TSV request", new Object[0]);
_L11:
        s = boolean1;
          goto _L16
        s;
        com.nielsen.app.sdk.c.a(s, true, 11, 'E', "Could not reset TSV for cid(%s)", new Object[] {
            s1
        });
          goto _L18
        s;
_L20:
        s1 = a1;
        if (a1 == null)
        {
            s1 = Boolean.valueOf(false);
        }
        if (p != null)
        {
            p.put(i1, s1.booleanValue());
        }
        k.unlock();
        throw s;
        s;
        a1 = ((AppConfig.a) (obj));
        continue; /* Loop/switch isn't completed */
        s1;
        a1 = s;
        s = s1;
        if (true) goto _L20; else goto _L19
_L19:
        s;
        a1 = ((AppConfig.a) (obj1));
          goto _L21
    }


    private class TimeShiftValueHandler extends AppRequestManager.AppRequestHandler
    {

        boolean a;
        final AppRequestTimeShiftValue b;

        public void onError(String s, long l1, Exception exception)
        {
            AppRequestTimeShiftValue.a(b).put(Boolean.valueOf(a));
            s = ((String) (new Object[0]));
_L2:
            com.nielsen.app.sdk.c.a(exception, true, 9, 'E', "Error while responding request", s);
            return;
            s;
            com.nielsen.app.sdk.c.a(exception, true, 9, 'E', "Error while responding request", new Object[0]);
            throw s;
            s;
            s = ((String) (new Object[0]));
            if (true) goto _L2; else goto _L1
_L1:
        }

        public void onFinish(String s, long l1, String s1)
        {
            com.nielsen.app.sdk.c.a('I', "TSV response: %s", new Object[] {
                s1
            });
            if (s1 == null)
            {
                break MISSING_BLOCK_LABEL_225;
            }
            if (s1.isEmpty())
            {
                break MISSING_BLOCK_LABEL_225;
            }
            s = new JSONObject(s1);
            if (!s.has("nol_tsvFlag"))
            {
                break MISSING_BLOCK_LABEL_225;
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
                s1 = s.getString("nol_tsvFlag");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                onError(String.format("Failed recovering TSV value for CID(%s)", new Object[] {
                    AppRequestTimeShiftValue.b(b)
                }), l1, s);
                return;
            }
            if (s1 == null)
            {
                break MISSING_BLOCK_LABEL_225;
            }
            if (!s1.isEmpty())
            {
                AppRequestTimeShiftValue.a(b, s1);
                if (s.has("nol_pcTimeCode"))
                {
                    AppRequestTimeShiftValue.a(b, s.getLong("nol_pcTimeCode"));
                }
                if (s.has("nol_fdTimeCode"))
                {
                    AppRequestTimeShiftValue.b(b, s.getLong("nol_fdTimeCode"));
                }
                a = true;
            }
            AppRequestTimeShiftValue.a(b).put(Boolean.valueOf(a));
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

        public TimeShiftValueHandler(AppRequestManager apprequestmanager)
        {
            b = AppRequestTimeShiftValue.this;
            apprequestmanager.getClass();
            super(apprequestmanager, "TimeShiftValueHandler");
            a = false;
        }
    }

}
