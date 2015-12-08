// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Environment;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.snapchat.android.Timber;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

public final class qk
{

    private static final qk b = new qk();
    public final ExecutorService a;
    private final Map c;
    private final Iz d;
    private final Object e;
    private boolean f;
    private boolean g;
    private final Object h;
    private boolean i;
    private boolean j;

    private qk()
    {
        HashMap hashmap = new HashMap();
        new Ke();
        Iz iz = new Iz();
        ExecutorService executorservice = IO.FILE_OPS_EXECUTOR;
        Bt.a();
        this(((Map) (hashmap)), iz, executorservice);
    }

    private qk(Map map, Iz iz, ExecutorService executorservice)
    {
        e = new Object();
        f = false;
        g = false;
        h = new Object();
        c = map;
        d = iz;
        a = executorservice;
    }

    private Map a(File file)
    {
        if (file.exists()) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        byte abyte0[] = new byte[(int)file.length()];
        Object obj = new BufferedInputStream(new FileInputStream(file));
        file = ((File) (obj));
        int k = ((BufferedInputStream) (obj)).read(abyte0);
        Pf.a(((java.io.Closeable) (obj)));
        if (k > 0)
        {
            file = new String(abyte0, dp.a);
            obj = (new TypeToken() {

            }).getType();
            return (Map)d.a(file, ((java.lang.reflect.Type) (obj)));
        }
        if (true) goto _L1; else goto _L3
_L3:
        Object obj1;
        obj1;
        obj = null;
_L7:
        file = ((File) (obj));
        Timber.e("SnapStateStore", (new StringBuilder("readSnapStateFromFile exception: ")).append(((IOException) (obj1)).getMessage()).toString(), new Object[0]);
        Pf.a(((java.io.Closeable) (obj)));
        return null;
        file;
        java.io.Closeable closeable;
        closeable = null;
        obj = file;
_L5:
        Pf.a(closeable);
        throw obj;
        obj;
        closeable = file;
        if (true) goto _L5; else goto _L4
_L4:
        closeable;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static qk a()
    {
        return b;
    }

    private void a(Map map, File file)
    {
        String s;
        b(file);
        s = d.a(map);
        file.createNewFile();
        file = new BufferedOutputStream(new FileOutputStream(file));
        map = file;
        file.write(s.getBytes(dp.a));
        map = file;
        file.flush();
        Pf.a(file);
        return;
        IOException ioexception;
        ioexception;
        file = null;
_L4:
        map = file;
        Timber.e("SnapStateStore", (new StringBuilder("writeSnapStateToFile exception: ")).append(ioexception.getMessage()).toString(), new Object[0]);
        Pf.a(file);
        return;
        file;
        map = null;
_L2:
        Pf.a(map);
        throw file;
        file;
        if (true) goto _L2; else goto _L1
_L1:
        ioexception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void a(qk qk1)
    {
        boolean flag1 = true;
        Map map = qk1.a(f());
        Object obj = map;
        if (map == null)
        {
            obj = Environment.getExternalStorageState();
            boolean flag = flag1;
            if (!"mounted".equals(obj))
            {
                if ("mounted_ro".equals(obj))
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
            }
            obj = map;
            if (flag)
            {
                obj = qk1.a(g());
            }
        }
        if (obj != null)
        {
            Timber.c("SnapStateStore", (new StringBuilder("initialize: reading ")).append(((Map) (obj)).size()).append(" snap state records from backing file(s)").toString(), new Object[0]);
            if (!((Map) (obj)).isEmpty())
            {
                synchronized (qk1.c)
                {
                    qk1.c.putAll(((Map) (obj)));
                }
            }
        }
        synchronized (qk1.e)
        {
            qk1.f = true;
            if (qk1.g)
            {
                qk1.d();
            }
        }
        return;
        qk1;
        map1;
        JVM INSTR monitorexit ;
        throw qk1;
        qk1;
        obj1;
        JVM INSTR monitorexit ;
        throw qk1;
    }

    static Map b(qk qk1)
    {
        return qk1.c;
    }

    private void b(File file)
    {
        a.execute(new Runnable(file) {

            private File a;

            public final void run()
            {
                if (a.exists())
                {
                    Ke.a(a);
                }
            }

            
            {
                a = file;
                super();
            }
        });
    }

    static Object c(qk qk1)
    {
        return qk1.h;
    }

    static boolean d(qk qk1)
    {
        qk1.i = false;
        return false;
    }

    static boolean e(qk qk1)
    {
        return qk1.j;
    }

    private static File f()
    {
        return new File((new StringBuilder()).append(Kl.sInternalFilesDirectory.getAbsolutePath()).append("/2811fb90a1302f").toString());
    }

    static boolean f(qk qk1)
    {
        qk1.j = false;
        return false;
    }

    private static File g()
    {
        return new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "/2811fb90a1302f");
    }

    static void g(qk qk1)
    {
        Map map = qk1.c;
        map;
        JVM INSTR monitorenter ;
        Timber.c("SnapStateStore", (new StringBuilder("Writing ")).append(qk1.c.size()).append(" snap state records to file").toString(), new Object[0]);
        if (qk1.c.isEmpty())
        {
            break MISSING_BLOCK_LABEL_110;
        }
        qk1.a(qk1.c, f());
        if (!Ke.a()) goto _L2; else goto _L1
_L1:
        qk1.a(qk1.c, g());
_L3:
        return;
_L2:
        Timber.e("SnapStateStore", "external storage not available for write.", new Object[0]);
          goto _L3
        qk1;
        map;
        JVM INSTR monitorexit ;
        throw qk1;
        qk1.b(f());
        qk1.b(g());
          goto _L3
    }

    public final void a(Collection collection)
    {
        Map map = c;
        map;
        JVM INSTR monitorenter ;
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            AT at = (AT)collection.next();
            if (!TextUtils.isEmpty(at.mEsId))
            {
                SD sd = IY.a(at);
                sd.f();
                c.put(at.mEsId, sd);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_78;
        collection;
        map;
        JVM INSTR monitorexit ;
        throw collection;
        map;
        JVM INSTR monitorexit ;
    }

    public final boolean b()
    {
        boolean flag;
        synchronized (e)
        {
            flag = f;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void c()
    {
        synchronized (e)
        {
            g = true;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void d()
    {
label0:
        {
            if (Bt.u())
            {
                break MISSING_BLOCK_LABEL_129;
            }
            synchronized (h)
            {
                if (!i)
                {
                    break label0;
                }
                j = true;
            }
            return;
        }
        synchronized (c)
        {
            Timber.c("SnapStateStore", (new StringBuilder("Flushing ")).append(c.size()).append(" snap state records to server").toString(), new Object[0]);
            if (!c.isEmpty())
            {
                (new mg(c, new mg.a() {

                    private qk a;

                    private void b()
                    {
                        synchronized (qk.c(a))
                        {
                            qk.d(a);
                            if (qk.e(a))
                            {
                                qk.f(a);
                                a.d();
                            }
                        }
                        return;
                        exception1;
                        obj2;
                        JVM INSTR monitorexit ;
                        throw exception1;
                    }

                    public final void a()
                    {
                        b();
                    }

                    public final void a(Map map)
                    {
                        Map map1 = qk.b(a);
                        map1;
                        JVM INSTR monitorenter ;
                        Timber.c("SnapStateStore", (new StringBuilder("Successfully flushed ")).append(map.size()).append(" snap state records to server").toString(), new Object[0]);
                        map = map.entrySet().iterator();
                        do
                        {
                            if (!map.hasNext())
                            {
                                break;
                            }
                            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                            if (((SD)entry.getValue()).equals(qk.b(a).get(entry.getKey())))
                            {
                                qk.b(a).remove(entry.getKey());
                            }
                        } while (true);
                        break MISSING_BLOCK_LABEL_136;
                        map;
                        map1;
                        JVM INSTR monitorexit ;
                        throw map;
                        map1;
                        JVM INSTR monitorexit ;
                        b();
                        return;
                    }

            
            {
                a = qk.this;
                super();
            }
                })).execute();
                i = true;
            }
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void e()
    {
        a.execute(new Runnable() {

            private qk a;

            public final void run()
            {
                qk.g(a);
            }

            
            {
                a = qk.this;
                super();
            }
        });
    }


    // Unreferenced inner class qk$1

/* anonymous class */
    public final class _cls1
        implements Runnable
    {

        private qk a;

        public final void run()
        {
            qk.a(a);
        }

            public 
            {
                a = qk.this;
                super();
            }
    }

}
