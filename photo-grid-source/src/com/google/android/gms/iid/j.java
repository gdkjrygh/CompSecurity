// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.gcm.a;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.PublicKey;
import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

// Referenced classes of package com.google.android.gms.iid:
//            a, k, MessengerCompat, g, 
//            InstanceIDListenerService

public final class j
{

    static String a = null;
    static int b = 0;
    static int c = 0;
    static int d = 0;
    Context e;
    Map f;
    Messenger g;
    Messenger h;
    MessengerCompat i;
    PendingIntent j;
    long k;
    long l;
    int m;
    int n;
    long o;

    public j(Context context)
    {
        f = new HashMap();
        e = context;
    }

    public static String a()
    {
        com/google/android/gms/iid/j;
        JVM INSTR monitorenter ;
        String s;
        int i1 = d;
        d = i1 + 1;
        s = Integer.toString(i1);
        com/google/android/gms/iid/j;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public static String a(Context context)
    {
        if (a != null)
        {
            return a;
        }
        b = Process.myUid();
        context = context.getPackageManager();
        Object obj = context.queryIntentServices(new Intent("com.google.android.c2dm.intent.REGISTER"), 0).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Object obj1 = (ResolveInfo)((Iterator) (obj)).next();
            if (context.checkPermission("com.google.android.c2dm.permission.RECEIVE", ((ResolveInfo) (obj1)).serviceInfo.packageName) == 0)
            {
                try
                {
                    ApplicationInfo applicationinfo = context.getApplicationInfo(((ResolveInfo) (obj1)).serviceInfo.packageName, 0);
                    Log.w("InstanceID/Rpc", (new StringBuilder("Found ")).append(applicationinfo.uid).toString());
                    c = applicationinfo.uid;
                    obj1 = ((ResolveInfo) (obj1)).serviceInfo.packageName;
                    a = ((String) (obj1));
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1)
                {
                    continue;
                }
                return ((String) (obj1));
            }
            Log.w("InstanceID/Rpc", (new StringBuilder("Possible malicious package ")).append(((ResolveInfo) (obj1)).serviceInfo.packageName).append(" declares com.google.android.c2dm.intent.REGISTER without permission").toString());
        } while (true);
        Log.w("InstanceID/Rpc", "Failed to resolve REGISTER intent, falling back");
        try
        {
            obj = context.getApplicationInfo("com.google.android.gms", 0);
            a = ((ApplicationInfo) (obj)).packageName;
            c = ((ApplicationInfo) (obj)).uid;
            obj = a;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            try
            {
                context = context.getApplicationInfo("com.google.android.gsf", 0);
                a = ((ApplicationInfo) (context)).packageName;
                c = ((ApplicationInfo) (context)).uid;
                context = a;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.w("InstanceID/Rpc", "Both Google Play Services and legacy GSF package are missing");
                return null;
            }
            return context;
        }
        return ((String) (obj));
    }

    static String a(Intent intent)
    {
        if (intent == null)
        {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String s1 = intent.getStringExtra("registration_id");
        String s = s1;
        if (s1 == null)
        {
            s = intent.getStringExtra("unregistered");
        }
        intent.getLongExtra("Retry-After", 0L);
        if (s == null)
        {
            s = intent.getStringExtra("error");
            if (s != null)
            {
                throw new IOException(s);
            } else
            {
                Log.w("InstanceID/Rpc", (new StringBuilder("Unexpected response from GCM ")).append(intent.getExtras()).toString(), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else
        {
            return s;
        }
    }

    private static transient String a(KeyPair keypair, String as[])
    {
        java.security.PrivateKey privatekey;
        try
        {
            as = TextUtils.join("\n", as).getBytes("UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (KeyPair keypair)
        {
            Log.e("InstanceID/Rpc", "Unable to encode string", keypair);
            return null;
        }
        privatekey = keypair.getPrivate();
        if (privatekey instanceof RSAPrivateKey)
        {
            keypair = "SHA256withRSA";
        } else
        {
            keypair = "SHA256withECDSA";
        }
        try
        {
            keypair = Signature.getInstance(keypair);
            keypair.initSign(privatekey);
            keypair.update(as);
            keypair = com.google.android.gms.iid.a.a(keypair.sign());
        }
        // Misplaced declaration of an exception variable
        catch (KeyPair keypair)
        {
            Log.e("InstanceID/Rpc", "Unable to sign registration request", keypair);
            return null;
        }
        return keypair;
    }

    private void a(Object obj)
    {
        Class class1 = getClass();
        class1;
        JVM INSTR monitorenter ;
        Object obj1;
        for (Iterator iterator = f.keySet().iterator(); iterator.hasNext(); a(obj1, obj))
        {
            String s = (String)iterator.next();
            obj1 = f.get(s);
            f.put(s, obj);
        }

        break MISSING_BLOCK_LABEL_82;
        obj;
        class1;
        JVM INSTR monitorexit ;
        throw obj;
        class1;
        JVM INSTR monitorexit ;
    }

    private static void a(Object obj, Object obj1)
    {
        Message message;
        if (obj instanceof ConditionVariable)
        {
            ((ConditionVariable)obj).open();
        }
        if (!(obj instanceof Messenger))
        {
            break MISSING_BLOCK_LABEL_40;
        }
        obj = (Messenger)obj;
        message = Message.obtain();
        message.obj = obj1;
        ((Messenger) (obj)).send(message);
        return;
        obj;
        Log.w("InstanceID/Rpc", (new StringBuilder("Failed to send response ")).append(obj).toString());
        return;
    }

    private void a(String s, Object obj)
    {
        synchronized (getClass())
        {
            Object obj1 = f.get(s);
            f.put(s, obj);
            a(obj1, obj);
        }
        return;
        s;
        class1;
        JVM INSTR monitorexit ;
        throw s;
    }

    private Intent b(Bundle bundle, KeyPair keypair)
    {
        String s;
        ConditionVariable conditionvariable;
        conditionvariable = new ConditionVariable();
        s = a();
        synchronized (getClass())
        {
            f.put(s, conditionvariable);
        }
        long l1 = SystemClock.elapsedRealtime();
        if (o != 0L && l1 <= o)
        {
            Log.w("InstanceID/Rpc", (new StringBuilder("Backoff mode, next request attempt: ")).append(o - l1).append(" interval: ").append(n).toString());
            throw new IOException("RETRY_LATER");
        }
        break MISSING_BLOCK_LABEL_121;
        bundle;
        class1;
        JVM INSTR monitorexit ;
        throw bundle;
        Intent intent;
        boolean flag;
        if (g == null)
        {
            a(e);
            g = new Messenger(new k(this, Looper.getMainLooper()));
        }
        if (a == null)
        {
            throw new IOException("MISSING_INSTANCEID_SERVICE");
        }
        k = SystemClock.elapsedRealtime();
        intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage(a);
        bundle.putString("gmsv", Integer.toString(com.google.android.gms.gcm.a.b(e)));
        bundle.putString("osv", Integer.toString(android.os.Build.VERSION.SDK_INT));
        bundle.putString("app_ver", Integer.toString(com.google.android.gms.iid.a.a(e)));
        bundle.putString("cliv", "1");
        bundle.putString("appid", com.google.android.gms.iid.a.a(keypair));
        String s1 = com.google.android.gms.iid.a.a(keypair.getPublic().getEncoded());
        bundle.putString("pub2", s1);
        bundle.putString("sig", a(keypair, new String[] {
            e.getPackageName(), s1
        }));
        intent.putExtras(bundle);
        c(intent);
        k = SystemClock.elapsedRealtime();
        intent.putExtra("kid", (new StringBuilder("|ID|")).append(s).append("|").toString());
        intent.putExtra("X-kid", (new StringBuilder("|ID|")).append(s).append("|").toString());
        flag = "com.google.android.gsf".equals(a);
        bundle = intent.getStringExtra("useGsf");
        if (bundle != null)
        {
            flag = "1".equals(bundle);
        }
        if (Log.isLoggable("InstanceID/Rpc", 3))
        {
            (new StringBuilder("Sending ")).append(intent.getExtras());
        }
        if (h == null) goto _L2; else goto _L1
_L1:
        intent.putExtra("google.messenger", g);
        bundle = Message.obtain();
        bundle.obj = intent;
        h.send(bundle);
_L4:
        conditionvariable.block(30000L);
        synchronized (getClass())
        {
            keypair = ((KeyPair) (f.remove(s)));
            if (!(keypair instanceof Intent))
            {
                break MISSING_BLOCK_LABEL_705;
            }
            keypair = (Intent)keypair;
        }
        return keypair;
        bundle;
        Log.isLoggable("InstanceID/Rpc", 3);
_L2:
label0:
        {
            if (!flag)
            {
                break label0;
            }
            bundle = new Intent("com.google.android.gms.iid.InstanceID");
            bundle.setPackage(e.getPackageName());
            bundle.putExtra("GSF", intent);
            e.startService(bundle);
        }
        if (true) goto _L4; else goto _L3
_L3:
        intent.putExtra("google.messenger", g);
        intent.putExtra("messenger2", "1");
        if (i == null)
        {
            break MISSING_BLOCK_LABEL_679;
        }
        bundle = Message.obtain();
        bundle.obj = intent;
        keypair = i;
        if (((MessengerCompat) (keypair)).a == null)
        {
            break MISSING_BLOCK_LABEL_692;
        }
        ((MessengerCompat) (keypair)).a.send(bundle);
          goto _L4
        bundle;
        Log.isLoggable("InstanceID/Rpc", 3);
        e.startService(intent);
          goto _L4
        ((MessengerCompat) (keypair)).b.a(bundle);
          goto _L4
        if (keypair instanceof String)
        {
            throw new IOException((String)keypair);
        }
        break MISSING_BLOCK_LABEL_729;
        keypair;
        bundle;
        JVM INSTR monitorexit ;
        throw keypair;
        Log.w("InstanceID/Rpc", (new StringBuilder("No response ")).append(keypair).toString());
        throw new IOException("TIMEOUT");
    }

    private void c(Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        if (j == null)
        {
            Intent intent1 = new Intent();
            intent1.setPackage("com.google.example.invalidpackage");
            j = PendingIntent.getBroadcast(e, 0, intent1, 0);
        }
        intent.putExtra("app", j);
        this;
        JVM INSTR monitorexit ;
        return;
        intent;
        throw intent;
    }

    final Intent a(Bundle bundle, KeyPair keypair)
    {
        Intent intent1 = b(bundle, keypair);
        Intent intent = intent1;
        if (intent1 != null)
        {
            intent = intent1;
            if (intent1.hasExtra("google.messenger"))
            {
                intent = b(bundle, keypair);
            }
        }
        return intent;
    }

    public final void a(Message message)
    {
        if (message == null)
        {
            return;
        }
        if (message.obj instanceof Intent)
        {
            Object obj = (Intent)message.obj;
            ((Intent) (obj)).setExtrasClassLoader(com/google/android/gms/iid/MessengerCompat.getClassLoader());
            if (((Intent) (obj)).hasExtra("google.messenger"))
            {
                obj = ((Intent) (obj)).getParcelableExtra("google.messenger");
                if (obj instanceof MessengerCompat)
                {
                    i = (MessengerCompat)obj;
                }
                if (obj instanceof Messenger)
                {
                    h = (Messenger)obj;
                }
            }
            b((Intent)message.obj);
            return;
        } else
        {
            Log.w("InstanceID/Rpc", "Dropping invalid message");
            return;
        }
    }

    final void b(Intent intent)
    {
        if (intent != null) goto _L2; else goto _L1
_L1:
        Log.isLoggable("InstanceID/Rpc", 3);
_L4:
        return;
_L2:
        String s = intent.getAction();
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(s) || "com.google.android.gms.iid.InstanceID".equals(s))
        {
            break; /* Loop/switch isn't completed */
        }
        if (Log.isLoggable("InstanceID/Rpc", 3))
        {
            (new StringBuilder("Unexpected response ")).append(intent.getAction());
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        Object obj;
        obj = intent.getStringExtra("registration_id");
        if (obj == null)
        {
            obj = intent.getStringExtra("unregistered");
        }
        if (obj != null)
        {
            break; /* Loop/switch isn't completed */
        }
        String s3 = intent.getStringExtra("error");
        if (s3 == null)
        {
            Log.w("InstanceID/Rpc", (new StringBuilder("Unexpected response, no error or registration id ")).append(intent.getExtras()).toString());
            return;
        }
        Log.isLoggable("InstanceID/Rpc", 3);
        String s1 = null;
        Object obj1 = null;
        obj = s3;
        if (s3.startsWith("|"))
        {
            obj = s3.split("\\|");
            if (!"ID".equals(obj[1]))
            {
                Log.w("InstanceID/Rpc", (new StringBuilder("Unexpected structured response ")).append(s3).toString());
            }
            long l1;
            if (obj.length > 2)
            {
                obj1 = obj[2];
                String s4 = obj[3];
                s1 = obj1;
                obj = s4;
                if (s4.startsWith(":"))
                {
                    obj = s4.substring(1);
                    s1 = obj1;
                }
            } else
            {
                obj = "UNKNOWN";
                s1 = obj1;
            }
            intent.putExtra("error", ((String) (obj)));
        }
        if (s1 == null)
        {
            a(obj);
        } else
        {
            a(s1, obj);
        }
        l1 = intent.getLongExtra("Retry-After", 0L);
        if (l1 > 0L)
        {
            l = SystemClock.elapsedRealtime();
            n = (int)l1 * 1000;
            o = SystemClock.elapsedRealtime() + (long)n;
            Log.w("InstanceID/Rpc", (new StringBuilder("Explicit request from server to backoff: ")).append(n).toString());
            return;
        }
        if (("SERVICE_NOT_AVAILABLE".equals(obj) || "AUTHENTICATION_FAILED".equals(obj)) && "com.google.android.gsf".equals(a))
        {
            m = m + 1;
            if (m >= 3)
            {
                if (m == 3)
                {
                    n = (new Random()).nextInt(1000) + 1000;
                }
                n = n * 2;
                o = SystemClock.elapsedRealtime() + (long)n;
                Log.w("InstanceID/Rpc", (new StringBuilder("Backoff due to ")).append(((String) (obj))).append(" for ").append(n).toString());
                return;
            }
        }
        if (true) goto _L4; else goto _L5
_L5:
        k = SystemClock.elapsedRealtime();
        o = 0L;
        m = 0;
        n = 0;
        if (Log.isLoggable("InstanceID/Rpc", 3))
        {
            (new StringBuilder("AppIDResponse: ")).append(((String) (obj))).append(" ").append(intent.getExtras());
        }
        String s2 = null;
        if (((String) (obj)).startsWith("|"))
        {
            Object obj2 = ((String) (obj)).split("\\|");
            if (!"ID".equals(obj2[1]))
            {
                Log.w("InstanceID/Rpc", (new StringBuilder("Unexpected structured response ")).append(((String) (obj))).toString());
            }
            s2 = obj2[2];
            if (obj2.length > 4)
            {
                if ("SYNC".equals(obj2[3]))
                {
                    com.google.android.gms.iid.InstanceIDListenerService.a(e);
                } else
                if ("RST".equals(obj2[3]))
                {
                    Context context = e;
                    com.google.android.gms.iid.a.b(e);
                    com.google.android.gms.iid.InstanceIDListenerService.a(context, com.google.android.gms.iid.a.b());
                    intent.removeExtra("registration_id");
                    a(s2, intent);
                    return;
                }
            }
            obj2 = obj2[obj2.length - 1];
            obj = obj2;
            if (((String) (obj2)).startsWith(":"))
            {
                obj = ((String) (obj2)).substring(1);
            }
            intent.putExtra("registration_id", ((String) (obj)));
        }
        if (s2 == null)
        {
            a(intent);
            return;
        } else
        {
            a(s2, intent);
            return;
        }
    }

}
