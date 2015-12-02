// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.share;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.FileUtils;
import android.util.Log;
import com.qihoo.security.SecurityApplication;
import com.qihoo360.common.utils.NativeLoader;
import com.qihoo360.i.v1.main.IIpcPref;
import com.qihoo360.i.v1.main.IIpcPrefManager;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

// Referenced classes of package com.qihoo360.mobilesafe.share:
//            a, e, IpcPrefJni

public class b
    implements IIpcPrefManager
{

    private static final HashMap a = new HashMap();
    private static File b;
    private static File c;
    private static String d;
    private static b e;

    private b()
    {
    }

    private static IIpcPref a(String s)
    {
        HashMap hashmap = a;
        hashmap;
        JVM INSTR monitorenter ;
        IIpcPref iipcpref = (IIpcPref)a.get(s);
        Object obj;
        obj = iipcpref;
        if (iipcpref != null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        obj = new a(b, s);
        a.put(s, obj);
        hashmap;
        JVM INSTR monitorexit ;
        return ((IIpcPref) (obj));
        s;
        hashmap;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static b a()
    {
        return e;
    }

    private static void a(Context context)
    {
        com/qihoo360/mobilesafe/share/b;
        JVM INSTR monitorenter ;
        e e1;
        e1 = new e("com.qihoo360.mobilesafe.lite.share.IpcPrefManager.socklock_security");
        if (!e1.a(15000))
        {
            Log.e("IpcPrefManager", "failed to lock: can't wait ipc pref ready");
            throw new IllegalStateException("IpcPref: get lock failed");
        }
        break MISSING_BLOCK_LABEL_47;
        context;
        com/qihoo360/mobilesafe/share/b;
        JVM INSTR monitorexit ;
        throw context;
        boolean flag = NativeLoader.load(context, "ipc_pref.525.1");
        e1.b();
_L2:
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        throw new IllegalStateException("NativeLoader.load ipc_pref.525.1 failed");
        context;
        Log.e("IpcPrefManager", "NativeLoader.load", context);
        e1.b();
        flag = false;
        if (true) goto _L2; else goto _L1
_L1:
        break MISSING_BLOCK_LABEL_100;
        context;
        e1.b();
        throw context;
    }

    private static File b(Context context)
    {
        Object obj1;
        Object obj3;
        Object obj4;
        obj3 = null;
        obj4 = null;
        obj1 = null;
        Object obj = context.getClass().getMethod("getSharedPrefsFile", new Class[] {
            java/lang/String
        });
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = (File)((Method) (obj)).invoke(context, new Object[] {
            "test"
        });
        context = ((Context) (obj));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        context = ((File) (obj)).getParentFile();
_L9:
        obj = context;
        if (context == null)
        {
            obj = new File(c.getParentFile(), "shared_prefs");
        }
        return ((File) (obj));
        obj;
        context = obj1;
_L7:
        Log.e("IpcPrefManager", "getSharedPrefsFile failed", ((Throwable) (obj)));
        continue; /* Loop/switch isn't completed */
        obj;
        context = obj3;
_L6:
        Log.e("IpcPrefManager", "getSharedPrefsFile failed", ((Throwable) (obj)));
        continue; /* Loop/switch isn't completed */
        obj;
        context = obj4;
_L4:
        Log.e("IpcPrefManager", "getSharedPrefsFile failed", ((Throwable) (obj)));
        continue; /* Loop/switch isn't completed */
        Object obj2;
        obj2;
        context = ((Context) (obj));
        obj = obj2;
        if (true) goto _L4; else goto _L3
_L3:
        obj2;
        context = ((Context) (obj));
        obj = obj2;
        if (true) goto _L6; else goto _L5
_L5:
        obj2;
        context = ((Context) (obj));
        obj = obj2;
        if (true) goto _L7; else goto _L2
_L2:
        context = null;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private static void c(Context context)
    {
        c = context.getFilesDir();
        if (c == null)
        {
            throw new IllegalStateException("context.getFilesDir() failed");
        }
        d = context.getPackageName();
        if (d == null)
        {
            throw new IllegalStateException("context.getPackageName() failed");
        }
        b = b(context);
        if (!b.exists())
        {
            if (!b.mkdir())
            {
                context = context.getSharedPreferences("dummy", 0).edit();
                context.putString("dummy", "dummy");
                context.commit();
                if (!b.exists())
                {
                    throw new IllegalStateException((new StringBuilder()).append(b.getAbsolutePath()).append(" mkdir failed").toString());
                }
            }
            FileUtils.setPermissions(b.getAbsolutePath(), 505, -1, -1);
        }
        context = new File(b, "ipc_pref");
        String s = context.getAbsolutePath();
        if (!context.exists())
        {
            if (!context.mkdir())
            {
                throw new IllegalStateException((new StringBuilder()).append(context.getAbsolutePath()).append(" mkdir failed").toString());
            }
            FileUtils.setPermissions(s, 505, -1, -1);
        }
        if (!IpcPrefJni.prefInit(s))
        {
            throw new IllegalStateException("ipc pref init failed");
        } else
        {
            return;
        }
    }

    public IIpcPref getDefaultSharedPreferences()
    {
        return getSharedPreferences((new StringBuilder()).append(d).append("_preferences").toString());
    }

    public IIpcPref getSharedPreferences(String s)
    {
        return a(s);
    }

    public transient Object invoke(Object aobj[])
    {
        throw new RuntimeException("Not supported");
    }

    static 
    {
        Context context = SecurityApplication.a();
        if (context == null)
        {
            throw new IllegalArgumentException("context is null");
        } else
        {
            e = new b();
            a(context);
            c(context);
        }
    }
}
