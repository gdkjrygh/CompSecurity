// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bu;

import android.app.Application;
import com.pandora.android.data.t;
import com.pandora.android.provider.b;
import com.pandora.radio.data.af;
import com.pandora.radio.util.NetworkUtil;
import com.pandora.radio.util.g;
import java.io.File;
import java.security.InvalidParameterException;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p.cw.c;
import p.dd.an;
import p.dd.bo;
import p.df.a;

// Referenced classes of package p.bu:
//            b, c

public class e
{
    private class a extends LinkedHashMap
    {

        final e a;
        private int b;

        protected boolean removeEldestEntry(java.util.Map.Entry entry)
        {
            return size() > b;
        }

        public a(int i)
        {
            a = e.this;
            super(i + 1, 1.0F, false);
            b = i;
        }
    }


    private static e d;
    private ExecutorService a;
    private final a b = new a(3);
    private File c;

    private e()
    {
        a = Executors.newFixedThreadPool(4);
        b.a.b().b(this);
        b();
    }

    public static e a()
    {
        if (d != null) goto _L2; else goto _L1
_L1:
        p/bu/e;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            d = new e();
        }
        p/bu/e;
        JVM INSTR monitorexit ;
_L2:
        return d;
        Exception exception;
        exception;
        p/bu/e;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private boolean a(File file)
    {
        if (file != null)
        {
            return file.delete();
        } else
        {
            return false;
        }
    }

    private void b()
    {
        c = new File(b.a.h().getCacheDir(), "/cache/video/");
        if (!c.exists())
        {
            c.mkdirs();
            p.df.a.a("VideoCacheManager", (new StringBuilder()).append("Cache Dir did not exist - created ").append(c.getAbsolutePath()).toString());
            return;
        } else
        {
            c();
            return;
        }
    }

    private void c()
    {
        b.clear();
        File afile[] = c.listFiles();
        if (afile != null)
        {
            for (int i = 0; i < afile.length; i++)
            {
                a(afile[i]);
            }

        }
    }

    public p.bu.b a(t t1, p.bu.c c1)
    {
        p.bu.b b1;
        boolean flag;
        boolean flag1;
        flag1 = false;
        b1 = c(t1);
        if (b1 == null)
        {
            return null;
        }
        flag = flag1;
        static class _cls1
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[p.cx.a.values().length];
                try
                {
                    b[p.cx.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    b[p.cx.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    b[p.cx.a.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    b[p.cx.a.c.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                a = new int[p.bu.b.a.values().length];
                try
                {
                    a[p.bu.b.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.bu.b.a.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.bu.b.a.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[b.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        p.bu._cls1.a[b1.c().ordinal()];
        JVM INSTR tableswitch 1 4: default 60
    //                   1 71
    //                   2 85
    //                   3 114
    //                   4 64;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break; /* Loop/switch isn't completed */
_L1:
        flag = flag1;
_L6:
        if (flag)
        {
            return b1;
        } else
        {
            return null;
        }
_L2:
        a().b(t1);
        flag = flag1;
          goto _L6
_L3:
        if (c1 == null) goto _L8; else goto _L7
_L7:
        flag = flag1;
        if (c1.a() >= b1.a().length()) goto _L6; else goto _L8
_L8:
        flag = true;
          goto _L6
_L4:
        if (c1 == null) goto _L10; else goto _L9
_L9:
        flag = flag1;
        if (c1.a() != 0L) goto _L6; else goto _L10
_L10:
        flag = true;
          goto _L6
    }

    public void a(t t1)
    {
        p.bu.b b2 = (p.bu.b)b.get(t1);
        if (b2 == null || b2.c() == b.a.d)
        {
            String s;
            p.bu.b b1;
            if (b.a.b().u().c())
            {
                s = t1.a;
            } else
            {
                s = t1.b;
            }
            b1 = b2;
            if (b2 == null)
            {
                b1 = new p.bu.b(s, new File(c, g.a(s)));
                b.put(t1, b1);
            }
            b1.a(a);
            return;
        } else
        {
            p.df.a.a("VideoCacheManager", "Video already prefetched, ignoring request");
            return;
        }
    }

    public void b(t t1)
    {
        this;
        JVM INSTR monitorenter ;
        t1 = (p.bu.b)b.remove(t1);
        if (t1 == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        t1.e();
        this;
        JVM INSTR monitorexit ;
        return;
        t1;
        throw t1;
    }

    public p.bu.b c(t t1)
    {
        return (p.bu.b)b.get(t1);
    }

    public void onSignInState(an an1)
    {
        switch (p.bu._cls1.b[an1.b.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("onSignInState called with unknown signInState: ").append(an1.b).toString());

        case 4: // '\004'
            c();
            // fall through

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return;
        }
    }

    public void onUserData(bo bo1)
    {
        while (bo1.a == null || !bo1.a.i()) 
        {
            return;
        }
        c();
    }
}
