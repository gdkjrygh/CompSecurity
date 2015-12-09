// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;

import android.content.Context;
import android.util.Log;
import java.io.Closeable;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.crypto.NoSuchPaddingException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.nielsen.app.sdk:
//            c, e, b, h, 
//            AppNative, AppCache, AppLocationManager, AppScheduler, 
//            AppRequestManager, AppConfig, AppLogUploader, AppSdk, 
//            f

class a
    implements Closeable
{

    public static final String a = "www.nielsen.com";
    public static final int b = 249;
    public static final String c = "/";
    public static final int d = 7;
    private static a h = null;
    private static c i = null;
    private static h j = null;
    private static AppConfig k = null;
    private static AppCache l = null;
    private static AppScheduler m = null;
    private static AppNative n = null;
    private static AppLogUploader o = null;
    private static e p = null;
    private static AppRequestManager q = null;
    private static b r = null;
    private static AppLocationManager s = null;
    private boolean e;
    private boolean f;
    private Lock g;

    private a()
    {
        e = false;
        f = false;
        g = new ReentrantLock();
    }

    public static a a(Context context, String s1, f f1)
    {
        com/nielsen/app/sdk/a;
        JVM INSTR monitorenter ;
        if (h == null) goto _L2; else goto _L1
_L1:
        boolean flag = h.e;
        if (!flag) goto _L4; else goto _L3
_L3:
        h.close();
_L2:
        a a1 = new a();
        h = a1;
        if (!a1.b(context, s1, f1))
        {
            h.close();
            h = null;
            throw new Exception("AppApi initialization failed but successfully closed");
        }
        break MISSING_BLOCK_LABEL_111;
        context;
        com/nielsen/app/sdk/a;
        JVM INSTR monitorexit ;
        throw context;
        Exception exception;
        exception;
        com.nielsen.app.sdk.c.a(exception, true, 'E', "AppApi.getInstance(), exception while closing previous AppApi", new Object[0]);
          goto _L2
_L4:
        if (h.f) goto _L2; else goto _L5
_L5:
        context = h;
_L6:
        com/nielsen/app/sdk/a;
        JVM INSTR monitorexit ;
        return context;
        context = h;
          goto _L6
    }

    public static boolean b()
    {
        return com.nielsen.app.sdk.e.g();
    }

    private boolean b(Context context, String s1, f f1)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        if (context != null) goto _L2; else goto _L1
_L1:
        boolean flag = flag1;
_L8:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        r = com.nielsen.app.sdk.b.a(context, "{\"nol_errlogInterval\" : \"86400\",\"sdk_useroptoutsent\" : \"false\",\"sdk_appdisablesent\" : \"false\",\"sdk_appdisablets\" : \"0\",\"nol_useroptout\" : \"nielsenappsdk://0\",\"nol_appdisable\" : \"false\",\"nol_deviceId\" : \"\",\"nol_nuid\" : \"\"}");
        j = com.nielsen.app.sdk.h.a(context);
        i = com.nielsen.app.sdk.c.a(context);
        com.nielsen.app.sdk.c.a('W');
        n = AppNative.a(context);
        Object obj;
        obj = AppCache.a(context);
        l = ((AppCache) (obj));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        l.a();
        obj = AppLocationManager.a(context);
        s = ((AppLocationManager) (obj));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        s.a(2, 2, 500L, 250F);
        m = AppScheduler.a();
        q = AppRequestManager.a(context, 2);
        if (s1 == null) goto _L4; else goto _L3
_L3:
        flag = s1.isEmpty();
        if (flag) goto _L4; else goto _L5
_L5:
        s1 = new JSONObject(s1);
        if (!s1.has("nol_nslApiDbg"))
        {
            break MISSING_BLOCK_LABEL_518;
        }
        flag = s1.getBoolean("nol_nslApiDbg");
_L11:
        com.nielsen.app.sdk.c.a(flag);
        if (!s1.has("appVersion") && !s1.has("appversion") && !s1.has("apv"))
        {
            throw new Exception((new StringBuilder("Incorrect AppId provided - ")).append(s1).toString());
        }
          goto _L6
        context;
_L10:
        try
        {
            throw new Exception((new StringBuilder("Failed to parse JSON - ")).append(s1).append("; ").append(context.getMessage()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        finally
        {
            this;
        }
        com.nielsen.app.sdk.c.c(16);
        flag = flag1;
        if (true) goto _L8; else goto _L7
_L7:
        JVM INSTR monitorexit ;
        throw context;
        context;
        Log.e("AppSdk", "Nielsen AppSDK: hit an exception while loading the shared libary. Closing the API");
        com.nielsen.app.sdk.c.a(3, "AppSDK could not load the shared libary.", new Object[0]);
        flag = flag1;
          goto _L8
        context;
        Log.e("AppSdk", "Nielsen AppSDK: could not load the shared libary - Possible Cause - UnsatisfiedLinkError. Closing the API");
        com.nielsen.app.sdk.c.a(3, "AppSDK could not load the shared libary.", new Object[0]);
        flag = flag1;
          goto _L8
        context;
        Log.e("AppSdk", "Nielsen AppSDK: could not load the shared libary  - Possible Cause - Other Error.  Closing the API");
        com.nielsen.app.sdk.c.a(3, "AppSDK could not load the shared libary.", new Object[0]);
        flag = flag1;
          goto _L8
        context;
        throw context;
_L6:
        if (!s1.has("appId") && !s1.has("appid") && !s1.has("apid"))
        {
            throw new Exception((new StringBuilder("Incorrect AppId provided - ")).append(s1).toString());
        }
        if (!s1.has("appName") && !s1.has("appname"))
        {
            throw new Exception((new StringBuilder("Incorrect AppId provided - ")).append(s1).toString());
        }
          goto _L9
_L4:
        throw new Exception("JSON string is empty or null");
_L9:
        com.nielsen.app.sdk.c.a('I', "appInit: %s", new Object[] {
            s1.toString()
        });
        k = AppConfig.a(context, s1, f1);
        p = com.nielsen.app.sdk.e.b();
        o = AppLogUploader.a();
        com.nielsen.app.sdk.c.a(0, "App SDK was successfully initiated.", new Object[0]);
        flag = true;
          goto _L8
        context;
        s1 = null;
          goto _L10
        flag = false;
          goto _L11
    }

    public static String c()
    {
        return com.nielsen.app.sdk.h.m();
    }

    public static String d()
    {
        if (h == null)
        {
            com.nielsen.app.sdk.c.c(16);
        } else
        {
            JSONObject jsonobject = com.nielsen.app.sdk.c.e();
            if (jsonobject != null)
            {
                return jsonobject.toString();
            }
        }
        return "";
    }

    public static String e()
    {
        if (h == null)
        {
            com.nielsen.app.sdk.c.c(16);
        } else
        {
            JSONObject jsonobject = com.nielsen.app.sdk.c.f();
            if (jsonobject != null)
            {
                return jsonobject.toString();
            }
        }
        return "";
    }

    public static String f()
    {
        return com.nielsen.app.sdk.h.q();
    }

    public static a k()
    {
        if (h == null)
        {
            throw new Exception("There is no AppSdk object yet!");
        } else
        {
            return h;
        }
    }

    public static c l()
    {
        if (i == null)
        {
            throw new Exception("There is no AppSdk logger object yet!");
        } else
        {
            return i;
        }
    }

    public static h m()
    {
        if (j == null)
        {
            throw new Exception("There is no AppSdk utilities object yet!");
        } else
        {
            return j;
        }
    }

    public static AppConfig n()
    {
        if (k == null)
        {
            throw new Exception("There is no AppSdk configuration object yet!");
        } else
        {
            return k;
        }
    }

    public static AppCache o()
    {
        if (l == null)
        {
            throw new Exception("There is no AppSdk cache object yet!");
        } else
        {
            return l;
        }
    }

    public static AppScheduler p()
    {
        if (m == null)
        {
            throw new Exception("There is no AppSdk scheduler object yet!");
        } else
        {
            return m;
        }
    }

    public static AppNative q()
    {
        if (n == null)
        {
            throw new Exception("There is no AppSdk native object yet!");
        } else
        {
            return n;
        }
    }

    public static AppLogUploader r()
    {
        if (o == null)
        {
            throw new Exception("There is no AppSdk client logger object yet!");
        } else
        {
            return o;
        }
    }

    public static e s()
    {
        if (p == null)
        {
            throw new Exception("There is no AppSdk processor manager object yet!");
        } else
        {
            return p;
        }
    }

    public static AppRequestManager t()
    {
        if (q == null)
        {
            throw new Exception("There is no AppSdk request manager object yet!");
        } else
        {
            return q;
        }
    }

    public static b u()
    {
        if (r == null)
        {
            throw new Exception("There is no AppSdk keychain object yet!");
        } else
        {
            return r;
        }
    }

    public static AppLocationManager v()
    {
        if (s == null)
        {
            throw new Exception("There is no AppSdk location manager object yet!");
        } else
        {
            return s;
        }
    }

    public boolean a()
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        e = false;
        if (h != null && k != null && p != null) goto _L2; else goto _L1
_L1:
        com.nielsen.app.sdk.c.c(16);
        boolean flag = false;
_L5:
        if (!flag1 || !flag) goto _L4; else goto _L3
_L3:
        e = true;
_L6:
        flag = e;
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = com.nielsen.app.sdk.e.g();
        boolean flag2 = k.a("nol_backgroundMode", false);
        flag1 = flag2;
          goto _L5
        Object obj;
        obj;
        com.nielsen.app.sdk.c.a('E', "App SDK Config is not configured correctly", new Object[0]);
          goto _L5
        obj;
        throw obj;
_L4:
        com.nielsen.app.sdk.c.a(2, "App SDK closed while application goes into background:", new Object[0]);
        close();
          goto _L6
        obj;
        com.nielsen.app.sdk.c.a('E', "Failure while App SDK goes into background", new Object[0]);
        com.nielsen.app.sdk.c.c(17);
          goto _L6
    }

    public boolean a(long l1)
    {
        if (h == null || p == null || j == null)
        {
            com.nielsen.app.sdk.c.c(16);
            return false;
        }
        if (j())
        {
            com.nielsen.app.sdk.c.c(19);
            return false;
        }
        if (j.d())
        {
            com.nielsen.app.sdk.c.c(19);
            return false;
        }
        boolean flag;
        try
        {
            flag = p.a(l1);
        }
        catch (Exception exception)
        {
            com.nielsen.app.sdk.c.a(exception, true, 'E', "Failure while setting playhead position", new Object[0]);
            return false;
        }
        return flag;
    }

    public boolean a(f f1)
    {
        if (k != null)
        {
            k.a(f1);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean a(String s1)
    {
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = false;
        if (j != null && p != null) goto _L2; else goto _L1
_L1:
        com.nielsen.app.sdk.c.c(16);
_L4:
        return flag1;
_L2:
        if (j())
        {
            com.nielsen.app.sdk.c.c(19);
            return false;
        }
        if (j.d())
        {
            com.nielsen.app.sdk.c.c(19);
            return false;
        }
        flag1 = p.a(s1);
        flag = flag1;
_L5:
        flag1 = flag;
        if (!flag)
        {
            com.nielsen.app.sdk.c.c(5);
            return flag;
        }
        if (true) goto _L4; else goto _L3
_L3:
        s1;
        com.nielsen.app.sdk.c.a(s1, true, 'E', "Failed while loading metadata", new Object[0]);
          goto _L5
    }

    public boolean a(boolean flag)
    {
        boolean flag1;
        boolean flag2;
        flag2 = false;
        flag1 = false;
        if (h != null && k != null) goto _L2; else goto _L1
_L1:
        com.nielsen.app.sdk.c.c(16);
_L4:
        return flag1;
_L2:
        k.a(flag);
        flag = true;
_L5:
        flag1 = flag;
        if (!flag)
        {
            com.nielsen.app.sdk.c.c(22);
            return flag;
        }
        if (true) goto _L4; else goto _L3
_L3:
        Object obj;
        obj;
        com.nielsen.app.sdk.c.a(((Throwable) (obj)), true, 'W', "Could not Opt Out App SDK. No such algorithm", new Object[0]);
        flag = flag2;
          goto _L5
        obj;
        com.nielsen.app.sdk.c.a(((Throwable) (obj)), true, 'W', "Could not Opt Out App SDK. No such padding", new Object[0]);
        flag = flag2;
          goto _L5
        obj;
        com.nielsen.app.sdk.c.a(((Throwable) (obj)), true, 'W', "Could not Opt Out App SDK. General exception", new Object[0]);
        flag = flag2;
          goto _L5
    }

    public boolean a(boolean aflag[])
    {
        boolean flag1 = false;
        if (h != null && p != null && j != null) goto _L2; else goto _L1
_L1:
        com.nielsen.app.sdk.c.c(16);
_L4:
        return flag1;
_L2:
        if (j())
        {
            com.nielsen.app.sdk.c.c(19);
            return false;
        }
        if (j.d())
        {
            com.nielsen.app.sdk.c.c(19);
            return false;
        }
        if (aflag != null)
        {
            aflag[0] = false;
        }
        boolean flag = p.h();
        StringBuilder stringbuilder = new StringBuilder("Session stopped ");
        String s1;
        if (flag)
        {
            s1 = "successfully";
        } else
        {
            s1 = "failed";
        }
        com.nielsen.app.sdk.c.a('I', stringbuilder.append(s1).toString(), new Object[0]);
        if (!e || !flag)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        com.nielsen.app.sdk.c.a(2, "App SDK closed when playing back ends in background:", new Object[0]);
        close();
        e = false;
        if (aflag != null)
        {
            aflag[0] = true;
        }
_L5:
        flag1 = flag;
        if (!flag)
        {
            com.nielsen.app.sdk.c.c(21);
            return flag;
        }
        if (true) goto _L4; else goto _L3
_L3:
        aflag;
        flag = false;
_L6:
        com.nielsen.app.sdk.c.a(aflag, true, 'E', "Failed stopping session", new Object[0]);
          goto _L5
        aflag;
          goto _L6
    }

    public boolean b(String s1)
    {
        String s3;
        String s4;
        if (h == null || j == null || p == null)
        {
            com.nielsen.app.sdk.c.c(16);
            return false;
        }
        s3 = s1;
        s4 = s1;
        g.lock();
        s3 = s1;
        s4 = s1;
        if (!j()) goto _L2; else goto _L1
_L1:
        s3 = s1;
        s4 = s1;
        com.nielsen.app.sdk.c.c(19);
        boolean flag = false;
_L3:
        g.unlock();
        return flag;
_L2:
        s3 = s1;
        s4 = s1;
        if (!j.d())
        {
            break MISSING_BLOCK_LABEL_106;
        }
        s3 = s1;
        s4 = s1;
        com.nielsen.app.sdk.c.c(19);
        flag = false;
          goto _L3
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        s3 = s1;
        s4 = s1;
        if (!s1.isEmpty())
        {
            break MISSING_BLOCK_LABEL_170;
        }
        s3 = s1;
        s4 = s1;
        throw new Exception("Invalid ID3. Empty string");
        s1;
        com.nielsen.app.sdk.c.a(s1, false, 8, 'E', "Interruption while processing ID3 tag (%s)", new Object[] {
            s3
        });
        g.unlock();
        return false;
        s3 = s1;
        s4 = s1;
        s1.trim();
        s3 = s1;
        s4 = s1;
        int i1 = s1.length();
        if (i1 >= 249)
        {
            break MISSING_BLOCK_LABEL_304;
        }
        s3 = s1;
        s4 = s1;
        throw new Exception((new StringBuilder("Invalid ID3. Length too short(")).append(Integer.valueOf(i1)).append(")").toString());
        s1;
        if (AppSdk.a())
        {
            Log.d("AppSdk", (new StringBuilder("Nielsen AppSDK: ")).append(s1.getMessage()).toString());
        }
        com.nielsen.app.sdk.c.a(s1, false, 8, 'E', "Invalid format ID3 tag (%s)", new Object[] {
            s4
        });
        g.unlock();
        return false;
        s3 = s1;
        s4 = s1;
        int j1 = s1.indexOf("www.nielsen.com", 0);
        if (j1 >= 0 && j1 <= 0)
        {
            break MISSING_BLOCK_LABEL_356;
        }
        s3 = s1;
        s4 = s1;
        throw new Exception("Invalid ID3. Didn't start with Nielsen domain");
        s1;
        g.unlock();
        throw s1;
        String s2;
        s2 = s1;
        if (i1 < 249)
        {
            break MISSING_BLOCK_LABEL_380;
        }
        s3 = s1;
        s4 = s1;
        s2 = s1.substring(0, 249);
        s3 = s2;
        s4 = s2;
        if (s2.split("/").length == 7)
        {
            break MISSING_BLOCK_LABEL_413;
        }
        s3 = s2;
        s4 = s2;
        throw new Exception("Invalid ID3. Did not have 7 parts separated by \"/\" characters");
        s3 = s2;
        s4 = s2;
        flag = p.b(s2);
          goto _L3
    }

    public boolean c(String s1)
    {
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = false;
        if (h != null && p != null && j != null) goto _L2; else goto _L1
_L1:
        com.nielsen.app.sdk.c.c(16);
_L4:
        return flag1;
_L2:
        if (s1 == null || s1.isEmpty())
        {
            com.nielsen.app.sdk.c.c(18);
            return false;
        }
        if (j())
        {
            com.nielsen.app.sdk.c.c(19);
            return false;
        }
        if (j.d())
        {
            com.nielsen.app.sdk.c.c(19);
            return false;
        }
        flag1 = p.c(s1);
        flag = flag1;
_L5:
        flag1 = flag;
        if (!flag)
        {
            com.nielsen.app.sdk.c.c(4);
            return flag;
        }
        if (true) goto _L4; else goto _L3
_L3:
        s1;
        com.nielsen.app.sdk.c.a(s1, true, 'E', "Failed starting session", new Object[0]);
          goto _L5
    }

    public void close()
    {
        if (p != null)
        {
            p.close();
        }
        if (o != null)
        {
            o.close();
        }
        if (s != null)
        {
            s.close();
        }
        if (l != null)
        {
            l.a();
        }
        if (k != null)
        {
            k.close();
        }
        if (r != null)
        {
            r.close();
        }
        if (j != null)
        {
            j.close();
        }
        if (m != null)
        {
            AppScheduler.AppTask apptask = m.c("AppUpload");
            if (apptask != null)
            {
                apptask.execute();
            }
            m.b("AppUpload");
        }
        if (l != null)
        {
            l.close();
        }
        if (i != null)
        {
            i.close();
        }
        f = true;
    }

    public boolean d(String s1)
    {
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = false;
        if (h != null && k != null) goto _L2; else goto _L1
_L1:
        com.nielsen.app.sdk.c.c(16);
_L4:
        return flag1;
_L2:
        k.d(s1);
        com.nielsen.app.sdk.c.a('I', "Response from Opt In/Out web page (%s)", new Object[] {
            s1
        });
        flag = true;
_L5:
        flag1 = flag;
        if (!flag)
        {
            com.nielsen.app.sdk.c.c(22);
            return flag;
        }
        if (true) goto _L4; else goto _L3
_L3:
        s1;
        com.nielsen.app.sdk.c.a(s1, true, 'W', "Could not set Opt In/Out App SDK. No such algorithm", new Object[0]);
          goto _L5
        s1;
        com.nielsen.app.sdk.c.a(s1, true, 'W', "Could not set Opt In/Out App SDK. No such padding", new Object[0]);
          goto _L5
        s1;
        com.nielsen.app.sdk.c.a(s1, true, 'W', "Could not set Opt In/Out App SDK. General exception", new Object[0]);
          goto _L5
    }

    public String g()
    {
        String s1;
        if (h == null || j == null)
        {
            com.nielsen.app.sdk.c.c(16);
            s1 = "";
        } else
        {
            try
            {
                s1 = j.getNuid();
            }
            catch (Exception exception)
            {
                com.nielsen.app.sdk.c.a(exception, true, 'E', "Could not get the NUID number.", new Object[0]);
                exception = "";
            }
        }
        if (s1 == null || s1.isEmpty())
        {
            com.nielsen.app.sdk.c.c(22);
        }
        return s1;
    }

    public String h()
    {
        String s1;
        if (h == null || j == null)
        {
            com.nielsen.app.sdk.c.c(16);
            s1 = "";
        } else
        {
            try
            {
                s1 = j.getDeviceId();
            }
            catch (Exception exception)
            {
                com.nielsen.app.sdk.c.a(exception, true, 'E', "Could not get the Device ID number.", new Object[0]);
                exception = "";
            }
        }
        if (s1 == null || s1.isEmpty())
        {
            com.nielsen.app.sdk.c.c(22);
        }
        return s1;
    }

    public String i()
    {
        String s1 = "";
        if (h == null || k == null)
        {
            if (AppSdk.a())
            {
                Log.d("AppSdk", "Nielsen AppSDK: Cannot retreive optOutUrlString; no config object");
            }
            com.nielsen.app.sdk.c.c(16);
        } else
        {
            s1 = k.e();
        }
        if (s1 == null || s1.isEmpty())
        {
            if (AppSdk.a())
            {
                Log.d("AppSdk", "Nielsen AppSDK: Cannot retreive optOutUrlString; no config received yet");
            }
            com.nielsen.app.sdk.c.c(22);
        }
        return s1;
    }

    public boolean j()
    {
        if (h == null || j == null)
        {
            com.nielsen.app.sdk.c.c(16);
            return true;
        } else
        {
            return j.a();
        }
    }

}
