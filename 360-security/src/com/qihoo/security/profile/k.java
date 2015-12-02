// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.profile;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.SparseArray;
import java.io.File;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.qihoo.security.profile:
//            c, g, ProfileDataKeeper, f, 
//            a, b, i, h, 
//            d

public final class k extends e.a
{
    class a
        implements android.os.IBinder.DeathRecipient
    {

        String a;
        d b;
        final k c;

        public void binderDied()
        {
            synchronized (k.a(c))
            {
                k.a(c).remove(b.asBinder());
                k.a(c, -1, 2, (new StringBuilder()).append(a).append(" died").toString());
            }
            return;
            exception;
            map;
            JVM INSTR monitorexit ;
            throw exception;
        }

        a(d d1, String s)
        {
            c = k.this;
            super();
            b = d1;
            a = s;
        }
    }


    private static k a;
    private final Context b;
    private final Handler c;
    private final f d;
    private final Map e = new HashMap();
    private final SparseArray f = new SparseArray();
    private ProfileDataKeeper g;

    private k(Context context)
    {
        b = context;
        d = new c(b);
        context = new HandlerThread("ProfileManager");
        context.start();
        c = new Handler(context.getLooper()) {

            final k a;

            public void handleMessage(Message message)
            {
                try
                {
                    k.a(a, message);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Message message)
                {
                    return;
                }
            }

            
            {
                a = k.this;
                super(looper);
            }
        };
        c.sendEmptyMessage(0);
    }

    public static k a(Context context)
    {
        com/qihoo/security/profile/k;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new k(context);
        }
        context = a;
        com/qihoo/security/profile/k;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    static Map a(k k1)
    {
        return k1.e;
    }

    private void a()
    {
        c.removeMessages(3);
        c.sendEmptyMessageDelayed(3, 30000L);
    }

    private void a(int j, int l, String s)
    {
        long l1 = System.currentTimeMillis();
        ProfileDataKeeper.Sample sample = new ProfileDataKeeper.Sample();
        sample.a = l1;
        sample.d = s;
        sample.c = l;
        int i1 = f.size();
        for (l = 0; l < i1; l++)
        {
            s = (g)f.valueAt(l);
            if (j == -1 || j == s.a())
            {
                String s1 = s.a(l1);
                sample.e.put(s.a(), s1);
            }
        }

        sample.b = System.currentTimeMillis() - l1;
        g.a(sample);
        a();
    }

    private final void a(int j, int l, String s, long l1)
    {
        s = c.obtainMessage(1, j, l, s);
        if (l1 > 0L)
        {
            c.sendMessageDelayed(s, l1);
            return;
        } else
        {
            c.sendMessage(s);
            return;
        }
    }

    private void a(Message message)
    {
        message.what;
        JVM INSTR tableswitch 0 4: default 40
    //                   0 41
    //                   1 46
    //                   2 78
    //                   3 220
    //                   4 182;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        return;
_L2:
        b();
        return;
_L3:
        if (d.a())
        {
            a(message.arg1, message.arg2, (String)message.obj);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (d.a())
        {
            if (d.a(g.a()))
            {
                a();
            }
        } else
        {
            message = new File(b.getFilesDir(), "pf.bin");
            if (message.exists())
            {
                java.util.List list = ProfileDataKeeper.a(message);
                if (d.a(list))
                {
                    message.delete();
                }
            }
        }
        c.sendEmptyMessageDelayed(2, d.e());
        return;
_L6:
        if (d.a())
        {
            a(-1, 0, "peroidic");
            a(-1, 0, "peroidic", d.c());
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
        g.b();
        return;
    }

    static void a(k k1, int j, int l, String s)
    {
        k1.b(j, l, s);
    }

    static void a(k k1, Message message)
    {
        k1.a(message);
    }

    private final void b()
    {
        d.b();
        c.sendEmptyMessage(2);
        if (d.a())
        {
            Object obj = new com.qihoo.security.profile.a(b);
            f.put(4, obj);
            obj = new b(b);
            f.put(1, obj);
            obj = new i(b);
            f.put(2, obj);
            obj = new h();
            f.put(5, obj);
            c.sendEmptyMessageDelayed(4, d.c());
            g = new ProfileDataKeeper(c.getLooper(), new File(b.getFilesDir(), "pf.bin"), d);
        }
    }

    private final void b(int j, int l, String s)
    {
        a(j, l, s, 0L);
    }

    public void a(int j, int l)
        throws RemoteException
    {
        Message message = c.obtainMessage(2, j, l, null);
        c.dispatchMessage(message);
    }

    public void a(d d1)
        throws RemoteException
    {
        Map map = e;
        map;
        JVM INSTR monitorenter ;
        a a1;
        d1 = d1.asBinder();
        a1 = (a)e.remove(d1);
        try
        {
            d1.unlinkToDeath(a1, 0);
        }
        // Misplaced declaration of an exception variable
        catch (d d1) { }
        return;
        d1;
        map;
        JVM INSTR monitorexit ;
        throw d1;
    }

    public void a(d d1, int j, int l, String s)
        throws RemoteException
    {
        b(j, l, s);
    }

    public void a(d d1, String s)
        throws RemoteException
    {
        IBinder ibinder;
        if (d1 == null)
        {
            return;
        }
        synchronized (e)
        {
            ibinder = d1.asBinder();
            if ((a)e.get(ibinder) == null)
            {
                break MISSING_BLOCK_LABEL_45;
            }
        }
        return;
        d1;
        map;
        JVM INSTR monitorexit ;
        throw d1;
        try
        {
            d1 = new a(d1, s);
            ibinder.linkToDeath(d1, 0);
            e.put(ibinder, d1);
            b(-1, 1, (new StringBuilder()).append(s).append(" started").toString());
        }
        // Misplaced declaration of an exception variable
        catch (d d1) { }
        map;
        JVM INSTR monitorexit ;
    }

    protected void dump(FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
    }
}
