// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cm.kinfoc;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Environment;
import android.os.Handler;
import com.cm.kinfoc.a.e;
import com.cm.kinfoc.a.f;
import com.cm.kinfoc.a.g;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

// Referenced classes of package com.cm.kinfoc:
//            aa, ab, ac, ad, 
//            j, ag, g, y, 
//            i, n, af, d, 
//            m

public final class z
{

    private static boolean c = false;
    public n a;
    d b;
    private Context d;
    private boolean e;
    private long f;
    private boolean g;
    private volatile boolean h;
    private final Object i = new Object();
    private j j;
    private m k;
    private int l;
    private IntentFilter m;
    private IntentFilter n;
    private Intent o;
    private PendingIntent p;
    private AlarmManager q;
    private Handler r;
    private BroadcastReceiver s;
    private BroadcastReceiver t;
    private Runnable u;

    public z(Context context, n n1)
    {
        d = null;
        e = true;
        f = 0L;
        g = true;
        h = false;
        a = null;
        j = null;
        k = null;
        b = new aa(this);
        l = 20000;
        m = null;
        n = null;
        o = null;
        p = null;
        q = null;
        r = null;
        s = new ab(this);
        t = new ac(this);
        u = new ad(this);
        if (n1 != null)
        {
            a = n1;
        }
        if (context != null)
        {
            d = context;
            r = new Handler(context.getMainLooper());
        }
        j = new j();
    }

    static void a(z z1, int i1)
    {
        int k1 = 0;
        if (z1.d == null) goto _L2; else goto _L1
_L1:
        File afile[];
        String s1;
        long l2;
        File file;
        String s2;
        NumberFormatException numberformatexception;
        int l1;
        try
        {
            file = ag.b(z1.d, i1);
        }
        // Misplaced declaration of an exception variable
        catch (z z1)
        {
            z1.printStackTrace();
            return;
        }
        if (file == null)
        {
            return;
        }
        afile = file.listFiles();
        if (afile == null) goto _L2; else goto _L3
_L3:
        if (k1 >= afile.length) goto _L2; else goto _L4
_L4:
        com.cm.kinfoc.a.f.a((new StringBuilder("Post cache ")).append(k1 + 1).toString());
        s2 = afile[k1].getName();
        if (!afile[k1].isFile() || !s2.endsWith(".ich")) goto _L6; else goto _L5
_L5:
        l1 = s2.lastIndexOf('_');
        if (l1 == -1) goto _L6; else goto _L7
_L7:
        s1 = s2.substring(0, l1);
        s2 = s2.substring(l1 + 1, s2.length() - 4);
        l2 = Long.parseLong(s2);
_L10:
        if (z1.g) goto _L9; else goto _L8
_L8:
        afile[k1].delete();
          goto _L6
        numberformatexception;
        numberformatexception.printStackTrace();
        l2 = 0L;
          goto _L10
_L9:
        if (z1.f <= 0L || ag.a(l2) < z1.f) goto _L12; else goto _L11
_L11:
        afile[k1].delete();
          goto _L6
_L12:
        byte abyte0[] = com.cm.kinfoc.g.a(afile[k1]);
        if (abyte0 == null) goto _L14; else goto _L13
_L13:
        if (z1.d != null && s1 != null && abyte0 != null) goto _L15; else goto _L14
_L14:
        Thread.sleep(1000L);
        break; /* Loop/switch isn't completed */
_L15:
        if (y.b(z1.d))
        {
            i j1 = new i();
            j1.a(abyte0);
            j1.a(s1);
            j1.d();
            j1.a(l2);
            j1.h();
            com.cm.kinfoc.a.f.a("Post data via network.");
            j1.a(i1);
            com.cm.kinfoc.j.b(j1, z1.a.a(i1), z1.b);
        }
        if (true) goto _L14; else goto _L6
_L2:
        return;
_L6:
        k1++;
        if (true) goto _L3; else goto _L16
_L16:
    }

    public static void a(String s1)
    {
        com.cm.kinfoc.a.e.a();
        (new StringBuilder()).append(s1).append("\n");
        new File(Environment.getExternalStorageDirectory(), "act.log");
    }

    static boolean a(z z1)
    {
        return z1.e;
    }

    static boolean a(z z1, boolean flag)
    {
        z1.h = flag;
        return flag;
    }

    static Handler b(z z1)
    {
        return z1.r;
    }

    static Runnable c(z z1)
    {
        return z1.u;
    }

    static Object d(z z1)
    {
        return z1.i;
    }

    static boolean d()
    {
        return c;
    }

    static boolean e(z z1)
    {
        return z1.h;
    }

    public final void a()
    {
        while (h || !e || !y.b(d)) 
        {
            return;
        }
        com.cm.kinfoc.a.g.a().a(new af(this));
    }

    public final void a(long l1)
    {
        f = l1;
    }

    public final void a(String s1, boolean flag, long l1, int i1)
    {
        if (d != null)
        {
            File file;
            if (flag)
            {
                file = ag.b(d, i1);
            } else
            {
                file = ag.a(d, i1);
            }
            if (file != null)
            {
                s1 = new File((new StringBuilder()).append(file.getAbsolutePath()).append(File.separatorChar).append(s1).append('_').append(l1).append(".ich").toString());
                if (s1.isFile() && s1.exists())
                {
                    s1.delete();
                    return;
                }
            }
        }
    }

    public final void a(byte abyte0[], String s1)
    {
        if (d != null && s1 != null && abyte0 != null)
        {
            if (y.b(d))
            {
                i i1 = new i();
                i1.a(abyte0);
                i1.a(s1);
                i1.d();
                i1.a(0L);
                i1.h();
                com.cm.kinfoc.a.f.a("Post data via network.");
                i1.a(1);
                j.a(i1, a.a(1), b);
                return;
            }
            if (0L == 0L && e)
            {
                a(abyte0, s1, true, 1);
                return;
            }
        }
    }

    public final boolean a(byte abyte0[], String s1, boolean flag, int i1)
    {
        Object obj;
        if (flag)
        {
            obj = ag.c(d, i1);
        } else
        {
            obj = ag.d(d, i1);
        }
        if (obj == null)
        {
            return false;
        }
        new com.cm.kinfoc.g(d);
        obj = ((File) (obj)).getAbsolutePath();
        s1 = (new StringBuilder()).append(s1).append('_').append(System.currentTimeMillis()).append(".ich").toString();
        s1 = new FileOutputStream(new File((new StringBuilder()).append(((String) (obj))).append(File.separator).append(s1).toString()));
        obj = s1.getChannel().tryLock();
        if (obj == null) goto _L2; else goto _L1
_L1:
        s1.write(abyte0);
        ((FileLock) (obj)).release();
        flag = true;
_L4:
        try
        {
            s1.close();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            abyte0.printStackTrace();
            flag = false;
        }
        return flag;
_L2:
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void b()
    {
        g = false;
    }

    public final int c()
    {
        return l + com.cm.kinfoc.a.e.a().i() * 100;
    }

}
