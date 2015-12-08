// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crittercism.app;

import android.app.AlertDialog;
import android.content.Context;
import android.location.Location;
import android.os.ConditionVariable;
import crittercism.android.az;
import crittercism.android.bb;
import crittercism.android.bc;
import crittercism.android.bg;
import crittercism.android.ce;
import crittercism.android.dg;
import crittercism.android.dk;
import crittercism.android.dq;
import crittercism.android.dt;
import crittercism.android.dw;
import crittercism.android.dx;
import java.net.URL;
import java.security.InvalidParameterException;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.crittercism.app:
//            Transaction, CrittercismConfig, CritterRateMyAppButtons

public class Crittercism
{

    private Crittercism()
    {
    }

    private static void a(String s)
    {
        dx.b("Crittercism", "Crittercism cannot be initialized", new NullPointerException((new StringBuilder()).append(s).append(" was null").toString()));
    }

    private static void b(String s)
    {
        dx.b("Crittercism", (new StringBuilder("Must initialize Crittercism before calling ")).append(com/crittercism/app/Crittercism.getName()).append(".").append(s).append("().  Request is being ignored...").toString(), new IllegalStateException());
    }

    public static void beginTransaction(String s)
    {
        az az1;
        az1 = az.A();
        if (az1.u)
        {
            dx.c("CrittercismInstance", (new StringBuilder("Transactions are not supported for services. Ignoring Crittercism.beginTransaction() call for ")).append(s).append(".").toString());
            return;
        }
        Transaction transaction;
        transaction = Transaction.a(s);
        if (!(transaction instanceof bg))
        {
            break MISSING_BLOCK_LABEL_117;
        }
        Map map = az1.A;
        map;
        JVM INSTR monitorenter ;
        Transaction transaction1 = (Transaction)az1.A.remove(s);
        if (transaction1 == null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        ((bg)transaction1).h();
        az1.A.put(s, transaction);
        transaction.a();
        map;
        JVM INSTR monitorexit ;
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
        s;
        throw s;
        s;
        dx.a(s);
    }

    public static boolean didCrashOnLastLoad()
    {
        az az1;
        az1 = az.A();
        if (az1.b)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        b("didCrashOnLoad");
        return false;
        boolean flag;
        if (az1.B())
        {
            break MISSING_BLOCK_LABEL_46;
        }
        az1.e.block();
        flag = dq.a;
        return flag;
        Object obj;
        obj;
        throw obj;
        obj;
        dx.a(((Throwable) (obj)));
        return false;
    }

    public static void endTransaction(String s)
    {
        az az1;
        az1 = az.A();
        if (az1.u)
        {
            dx.c("CrittercismInstance", (new StringBuilder("Transactions are not supported for services. Ignoring Crittercism.endTransaction() call for ")).append(s).append(".").toString());
            return;
        }
        synchronized (az1.A)
        {
            s = (Transaction)az1.A.remove(s);
        }
        if (s != null)
        {
            try
            {
                s.b();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                dx.a(s);
            }
        }
        break MISSING_BLOCK_LABEL_83;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static void failTransaction(String s)
    {
        az az1;
        az1 = az.A();
        if (az1.u)
        {
            dx.c("CrittercismInstance", (new StringBuilder("Transactions are not supported for services. Ignoring Crittercism.failTransaction() call for ")).append(s).append(".").toString());
            return;
        }
        synchronized (az1.A)
        {
            s = (Transaction)az1.A.remove(s);
        }
        if (s != null)
        {
            try
            {
                s.c();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                dx.a(s);
            }
        }
        break MISSING_BLOCK_LABEL_83;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static AlertDialog generateRateMyAppAlertDialog(Context context)
    {
        Object obj;
        String s;
        az az1;
        az1 = az.A();
        obj = az1.B;
        if (az1.B == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        s = az1.B.b();
        obj = az1.B.c();
_L1:
        context = az1.a(context, ((String) (obj)), s);
        return context;
        context;
        throw context;
        context;
        dx.a(context);
        return null;
        obj = null;
        s = null;
          goto _L1
    }

    public static AlertDialog generateRateMyAppAlertDialog(Context context, String s, String s1)
    {
        try
        {
            context = az.A().a(context, s, s1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            dx.a(context);
            return null;
        }
        return context;
    }

    public static boolean getOptOutStatus()
    {
        az az1;
        az1 = az.A();
        if (az1.b)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        b("getOptOutStatus");
        return false;
        boolean flag;
        try
        {
            flag = az1.B();
        }
        catch (ThreadDeath threaddeath)
        {
            throw threaddeath;
        }
        catch (Throwable throwable)
        {
            dx.a(throwable);
            return false;
        }
        return flag;
    }

    public static int getTransactionValue(String s)
    {
        int i;
        try
        {
            i = az.A().b(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            dx.a(s);
            return -1;
        }
        return i;
    }

    public static void initialize(Context context, String s)
    {
        com/crittercism/app/Crittercism;
        JVM INSTR monitorenter ;
        initialize(context, s, new CrittercismConfig());
        com/crittercism/app/Crittercism;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public static void initialize(Context context, String s, CrittercismConfig crittercismconfig)
    {
        com/crittercism/app/Crittercism;
        JVM INSTR monitorenter ;
        if (s != null) goto _L2; else goto _L1
_L1:
        a(java/lang/String.getCanonicalName());
_L3:
        com/crittercism/app/Crittercism;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        a(android/content/Context.getCanonicalName());
          goto _L3
        context;
        throw context;
        context;
        com/crittercism/app/Crittercism;
        JVM INSTR monitorexit ;
        throw context;
        if (crittercismconfig != null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        a(com/crittercism/app/CrittercismConfig.getCanonicalName());
          goto _L3
        context;
        dx.a(context);
          goto _L3
label0:
        {
            if (s.length() >= 24)
            {
                break label0;
            }
            dx.b("Crittercism", "Crittercism cannot be initialized", new InvalidParameterException("Given an invalid appID. The appID should be 24 characters in length."));
        }
          goto _L3
        boolean flag = az.A().b;
        if (flag) goto _L3; else goto _L4
_L4:
        long l = System.nanoTime();
        az.A().a(context, s, crittercismconfig);
        l = (System.nanoTime() - l) / 0xf4240L;
        (new StringBuilder("Crittercism finished initializing in ")).append(l).append("ms");
        dx.b();
          goto _L3
        context;
        (new StringBuilder("Exception in init > getInstance().initialize(..): ")).append(context.getClass().getName());
        dx.b();
          goto _L3
    }

    public static void leaveBreadcrumb(String s)
    {
        if (!az.A().b)
        {
            b("leaveBreadcrumb");
            return;
        }
        if (s == null)
        {
            az az1;
            crittercism.android.az._cls7 _lcls7;
            try
            {
                dx.b("Crittercism", "Cannot leave null breadcrumb", new NullPointerException());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                dx.a(s);
            }
            break MISSING_BLOCK_LABEL_120;
        }
        az1 = az.A();
        if (!az1.f.b())
        {
            _lcls7 = new crittercism.android.az._cls7(az1, new ce(s, crittercism.android.ce.a.a));
            if (!az1.r.a(_lcls7))
            {
                (new StringBuilder("SENDING ")).append(s).append(" TO EXECUTOR");
                dx.b();
                az1.t.execute(_lcls7);
                return;
            }
        }
    }

    public static void logHandledException(Throwable throwable)
    {
        if (!az.A().b)
        {
            b("logHandledException");
            return;
        }
        try
        {
            if (!az.A().f.b())
            {
                az.A().a(throwable);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            throw throwable;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            dx.a(throwable);
        }
        return;
    }

    public static void logNetworkRequest(String s, URL url, long l, long l1, long l2, 
            int i, Exception exception)
    {
        long l3;
        l3 = System.currentTimeMillis();
        if (!az.A().b)
        {
            b("logEndpoint");
            return;
        }
        try
        {
            if (!az.A().f.b())
            {
                az.A().a(s, url, l, l1, l2, i, exception, l3 - l);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            dx.a(s);
        }
        return;
    }

    public static void performRateMyAppButtonAction(CritterRateMyAppButtons critterratemyappbuttons)
    {
        if (az.A().f.b())
        {
            dx.c("Crittercism", "User has opted out of crittercism.  performRateMyAppButtonAction exiting.");
            return;
        }
        az az1;
        az1 = az.A();
        if (android.os.Build.VERSION.SDK_INT < 5)
        {
            dx.c("Crittercism", "Rate my app not supported below api level 5");
            return;
        }
        String s = az1.D();
        if (s == null)
        {
            try
            {
                dx.b("Crittercism", "Cannot create proper URI to open app market.  Returning null.");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (CritterRateMyAppButtons critterratemyappbuttons)
            {
                throw critterratemyappbuttons;
            }
            // Misplaced declaration of an exception variable
            catch (CritterRateMyAppButtons critterratemyappbuttons)
            {
                dx.a(critterratemyappbuttons);
            }
            return;
        }
        int i = crittercism.android.az._cls4.a[critterratemyappbuttons.ordinal()];
        i;
        JVM INSTR tableswitch 1 2: default 100
    //                   1 101
    //                   2 120;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        az1.a(s);
        return;
        critterratemyappbuttons;
        dx.c("Crittercism", "performRateMyAppButtonAction(CritterRateMyAppButtons.YES) failed.  Email support@crittercism.com.");
        dx.c();
        return;
_L3:
        try
        {
            az1.C();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CritterRateMyAppButtons critterratemyappbuttons) { }
        dx.c("Crittercism", "performRateMyAppButtonAction(CritterRateMyAppButtons.NO) failed.  Email support@crittercism.com.");
        return;
    }

    public static void sendAppLoadData()
    {
        Object obj = az.A().v;
        if (obj == null)
        {
            crittercism.android.az._cls1 _lcls1;
            try
            {
                b("sendAppLoadData");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            catch (Throwable throwable)
            {
                dx.a(throwable);
            }
            break MISSING_BLOCK_LABEL_106;
        }
        if (!((CrittercismConfig) (obj)).delaySendingAppLoad())
        {
            break MISSING_BLOCK_LABEL_107;
        }
        if (az.A().f.b())
        {
            break MISSING_BLOCK_LABEL_115;
        }
        obj = az.A();
        if (!((az) (obj)).v.delaySendingAppLoad())
        {
            dx.c("CrittercismInstance", "CrittercismConfig instance not set to delay sending app loads.");
            return;
        }
        if (!((az) (obj)).u)
        {
            _lcls1 = new crittercism.android.az._cls1(((az) (obj)));
            if (!((az) (obj)).r.a(_lcls1))
            {
                ((az) (obj)).t.execute(_lcls1);
                return;
            }
        }
        break MISSING_BLOCK_LABEL_115;
        return;
        dx.a("Crittercism", "sendAppLoadData() will only send data to Crittercism if \"delaySendingAppLoad\" is set to true in the configuration settings you include in the init call.");
    }

    public static void setMetadata(JSONObject jsonobject)
    {
        if (!az.A().b)
        {
            b("setMetadata");
            return;
        }
        try
        {
            az.A().a(jsonobject);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw jsonobject;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            dx.a(jsonobject);
        }
        return;
    }

    public static void setOptOutStatus(boolean flag)
    {
        if (!az.A().b)
        {
            b("setOptOutStatus");
            return;
        }
        try
        {
            az az1 = az.A();
            dk dk1 = new dk(az1.c, az1, flag);
            if (!az1.r.a(dk1))
            {
                az1.t.execute(dk1);
                return;
            }
        }
        catch (ThreadDeath threaddeath)
        {
            throw threaddeath;
        }
        catch (Throwable throwable)
        {
            dx.a(throwable);
        }
        return;
    }

    public static void setTransactionValue(String s, int i)
    {
        Map map;
        az az1;
        try
        {
            az1 = az.A();
            if (az1.u)
            {
                dx.c("CrittercismInstance", (new StringBuilder("Transactions are not supported for services. Ignoring Crittercism.setTransactionValue() call for ")).append(s).append(".").toString());
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            dx.a(s);
            return;
        }
        map = az1.A;
        map;
        JVM INSTR monitorenter ;
        s = (Transaction)az1.A.get(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        s.a(i);
        map;
        JVM INSTR monitorexit ;
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static void setUsername(String s)
    {
        if (!az.A().b)
        {
            b("setUsername");
            return;
        }
        if (s == null)
        {
            JSONObject jsonobject;
            try
            {
                dx.c("Crittercism", "Crittercism.setUsername() given invalid parameter: null");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                dx.a(s);
            }
            break MISSING_BLOCK_LABEL_62;
        }
        jsonobject = new JSONObject();
        jsonobject.putOpt("username", s);
        az.A().a(jsonobject);
        return;
        return;
        s;
        dx.b("Crittercism", "Crittercism.setUsername()", s);
        return;
    }

    public static void updateLocation(Location location)
    {
        if (!az.A().b)
        {
            b("updateLocation");
            return;
        }
        if (location == null)
        {
            dx.b("Crittercism", "Cannot leave null location", new NullPointerException());
            return;
        } else
        {
            bc.a(location);
            return;
        }
    }
}
