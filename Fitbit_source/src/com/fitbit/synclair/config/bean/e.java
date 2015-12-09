// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.config.bean;

import android.content.Intent;
import com.fitbit.config.BuildType;
import com.fitbit.config.b;
import com.fitbit.data.bl.StaticAPILogic;
import com.fitbit.data.bl.ag;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.repo.o;
import com.fitbit.e.a;
import com.fitbit.util.z;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;

public class e
{
    private static class a
    {

        public final String a;
        public final b b;
        public final UUID c;

        public a(String s, b b1, UUID uuid)
        {
            b = b1;
            a = s;
            c = uuid;
        }
    }

    private class b extends FutureTask
    {

        final e a;

        public b(String s, String s1, UUID uuid)
        {
            a = e.this;
            super(new _cls1(s, s1, uuid));
        }
    }

    private static class c
    {

        public static e a = new e();


        private c()
        {
        }
    }


    public static final String a = (new StringBuilder()).append(com/fitbit/synclair/config/bean/e.getPackage().getName()).append(".ACTION_ASSET_LOADED").toString();
    public static final String b = (new StringBuilder()).append(com/fitbit/synclair/config/bean/e.getPackage().getName()).append(".EXTRA_REMOTE_PATH").toString();
    private static final String c = "SynclairAssetsManager";
    private o d;
    private final ExecutorService e;
    private final Map f;
    private final Object g;

    private e()
    {
        f = new HashMap();
        g = new Object();
        d = o.a();
        d.d();
        e = ag.b();
    }


    static o a(e e1)
    {
        return e1.d;
    }

    public static e a()
    {
        return com.fitbit.synclair.config.bean.c.a;
    }

    static String a(e e1, String s, byte abyte0[])
    {
        return e1.a(s, abyte0);
    }

    private String a(String s, byte abyte0[])
    {
        return d.b(s, abyte0);
    }

    private boolean a(b b1)
    {
        boolean flag;
        try
        {
            flag = ((Boolean)b1.get()).booleanValue();
        }
        // Misplaced declaration of an exception variable
        catch (b b1)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (b b1)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (b b1)
        {
            return false;
        }
        return flag;
    }

    static Object b(e e1)
    {
        return e1.g;
    }

    static void b(String s)
    {
        c(s);
    }

    static Map c(e e1)
    {
        return e1.f;
    }

    private static void c(String s)
    {
        Intent intent = new Intent(a);
        intent.putExtra(b, s);
        z.a(intent);
    }

    public String a(String s)
    {
        if (s == null)
        {
            return null;
        }
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        s = (a)f.get(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        s = ((a) (s)).a;
        obj;
        JVM INSTR monitorexit ;
        return s;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        obj;
        JVM INSTR monitorexit ;
        return null;
    }

    public void a(boolean flag)
    {
        com.fitbit.e.a.a("SynclairAssetsManager", "reset: %s", new Object[] {
            Boolean.valueOf(flag)
        });
        Object obj1 = g;
        obj1;
        JVM INSTR monitorenter ;
        Object obj;
        Iterator iterator;
        obj = new ArrayList();
        iterator = f.entrySet().iterator();
_L2:
        a a1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_130;
            }
            a1 = (a)((java.util.Map.Entry)iterator.next()).getValue();
        } while (a1 == null);
        if (a1.a != null)
        {
            ((List) (obj)).add(a1.a);
        }
        if (a1.b != null)
        {
            a1.b.cancel(false);
        }
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        f.clear();
        if (((List) (obj)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_208;
        }
        obj = new Runnable(((List) (obj))) {

            final List a;
            final e b;

            public void run()
            {
                File file;
                for (Iterator iterator1 = a.iterator(); iterator1.hasNext(); com.fitbit.synclair.config.bean.e.a(b).b(file.getName()))
                {
                    file = new File((String)iterator1.next());
                }

            }

            
            {
                b = e.this;
                a = list;
                super();
            }
        };
        if (flag)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        e.submit(((Runnable) (obj)));
_L3:
        obj1;
        JVM INSTR monitorexit ;
        if (flag && obj != null)
        {
            ((Runnable) (obj)).run();
        }
        return;
        RejectedExecutionException rejectedexecutionexception;
        rejectedexecutionexception;
        com.fitbit.e.a.a("SynclairAssetsManager", "Unable to reset", rejectedexecutionexception, new Object[0]);
          goto _L3
        obj = null;
          goto _L3
    }

    public boolean a(String s, String s1, boolean flag)
    {
        if (com.fitbit.config.b.a.a())
        {
            com.fitbit.e.a.a("SynclairAssetsManager", "loadAsset: %s", new Object[] {
                s
            });
        }
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        UUID uuid;
        if (f.containsKey(s))
        {
            break MISSING_BLOCK_LABEL_198;
        }
        uuid = UUID.randomUUID();
        s1 = new b(s, s1, uuid);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        com.fitbit.e.a.a("SynclairAssetsManager", "Starting async task", new Object[0]);
        e.execute(s1);
        f.put(s, new a(null, s1, uuid));
        obj;
        JVM INSTR monitorexit ;
        return true;
        s;
        com.fitbit.e.a.a("SynclairAssetsManager", "Could not execute task: ", s, new Object[0]);
        obj;
        JVM INSTR monitorexit ;
        return false;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        f.put(s, new a(null, s1, uuid));
        if (!flag || s1 == null)
        {
            break MISSING_BLOCK_LABEL_247;
        }
        com.fitbit.e.a.a("SynclairAssetsManager", "Starting sync task", new Object[0]);
        s1.run();
        flag = a(((b) (s1)));
        obj;
        JVM INSTR monitorexit ;
        return flag;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        obj;
        JVM INSTR monitorexit ;
        return true;
        s = (a)f.get(s);
        if (((a) (s)).a == null)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        obj;
        JVM INSTR monitorexit ;
        return true;
        flag = a(((a) (s)).b);
        obj;
        JVM INSTR monitorexit ;
        return flag;
        obj;
        JVM INSTR monitorexit ;
        return false;
    }


    // Unreferenced inner class com/fitbit/synclair/config/bean/e$b$1

/* anonymous class */
    class b._cls1
        implements Callable
    {

        final e a;
        final String b;
        final String c;
        final UUID d;

        public Boolean a()
            throws Exception
        {
            boolean flag;
            Object obj;
            Object obj1;
            a a1;
            try
            {
                obj = StaticAPILogic.a().c(b, c);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                if (com.fitbit.config.b.a.a())
                {
                    com.fitbit.e.a.e("SynclairAssetsManager", String.format("Error loading Asset on path %s", new Object[] {
                        b
                    }), ((Throwable) (obj)), new Object[0]);
                } else
                {
                    com.fitbit.e.a.e("SynclairAssetsManager", "Static Asset failed to load", ((Throwable) (obj)), new Object[0]);
                }
                obj = null;
            }
            if (obj != null)
            {
                obj = com.fitbit.synclair.config.bean.e.a(a, b, ((byte []) (obj)));
            } else
            {
                obj = null;
            }
            obj1 = com.fitbit.synclair.config.bean.e.b(a);
            obj1;
            JVM INSTR monitorenter ;
            a1 = (a)e.c(a).get(b);
            if (a1 == null) goto _L2; else goto _L1
_L1:
            if (a1.c == null || !a1.c.equals(d)) goto _L2; else goto _L3
_L3:
            if (obj == null) goto _L5; else goto _L4
_L4:
            a1 = new a(((String) (obj)), null, null);
            e.c(a).put(b, a1);
            com.fitbit.synclair.config.bean.e.b(b);
            flag = true;
_L7:
            obj1;
            JVM INSTR monitorexit ;
            if (!flag && obj != null)
            {
                obj = new File(((String) (obj)));
                com.fitbit.synclair.config.bean.e.a(a).b(((File) (obj)).getName());
            }
            return Boolean.valueOf(flag);
_L5:
            e.c(a).remove(b);
              goto _L2
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
_L2:
            flag = false;
            if (true) goto _L7; else goto _L6
_L6:
        }

        public Object call()
            throws Exception
        {
            return a();
        }

            
            {
                a = e.this;
                b = s;
                c = s1;
                d = uuid;
                super();
            }
    }

}
