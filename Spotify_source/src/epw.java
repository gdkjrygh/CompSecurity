// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.spotify.mobile.android.spotlets.common.persistence.json.JsonBundleHelper;
import com.spotify.mobile.android.util.Assertion;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

final class epw
    implements epr
{

    final ExecutorService a = Executors.newSingleThreadExecutor();
    final Handler b = new Handler();
    final String c;
    private boolean d;
    private final epv e;
    private File f;

    epw(epv epv1, String s)
    {
        geh.b();
        c = a(s).intern();
        e = (epv)ctz.a(epv1);
        if (!c())
        {
            epv1.a(new fyi() {

                private epw a;

                public final boolean a()
                {
                    Assertion.a(a.c(), "could not init feature storage");
                    return true;
                }

            
            {
                a = epw.this;
                super();
            }
            });
        }
        epv1.a(new fyi() {

            private epw a;

            public final boolean b()
            {
                a.a.shutdown();
                a.b.removeCallbacksAndMessages(null);
                return true;
            }

            
            {
                a = epw.this;
                super();
            }
        });
    }

    private static String a(String s)
    {
        int i = 0;
        boolean flag;
        if (!TextUtils.isEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.a(flag, "empty feature name");
        for (; i < s.length(); i++)
        {
            char c1 = s.charAt(i);
            if ((c1 < 'a' || c1 > 'z') && (c1 < 'A' || c1 > 'Z') && c1 != '-' && c1 != '_' && (c1 < '0' || c1 > '9'))
            {
                throw new IllegalArgumentException((new StringBuilder("Illegal character '")).append(c1).append("' in feature name '").append(s).append("'").toString());
            }
        }

        return s;
    }

    private void a(Runnable runnable)
    {
        geh.b();
        runnable = new Runnable(runnable) {

            private Runnable a;
            private epw b;

            public final void run()
            {
                if (b.a.isShutdown())
                {
                    Assertion.a("Trying to submit to a shut down executor");
                    return;
                } else
                {
                    b.a.execute(a);
                    return;
                }
            }

            
            {
                b = epw.this;
                a = runnable;
                super();
            }
        };
        if (!c())
        {
            e.a(new fyi(runnable) {

                private Runnable a;

                public final boolean c()
                {
                    a.run();
                    return true;
                }

            
            {
                a = runnable;
                super();
            }
            });
            return;
        } else
        {
            runnable.run();
            return;
        }
    }

    final Bundle a()
    {
        String s = c;
        s;
        JVM INSTR monitorenter ;
        if (!b().exists()) goto _L2; else goto _L1
_L1:
        Object obj = JsonBundleHelper.a(b());
          goto _L3
_L4:
        s;
        JVM INSTR monitorexit ;
        return ((Bundle) (obj));
_L5:
        obj = new Bundle();
        break; /* Loop/switch isn't completed */
        obj;
        s;
        JVM INSTR monitorexit ;
        throw obj;
_L3:
        if (obj == null) goto _L5; else goto _L4
_L2:
        obj = null;
          goto _L3
    }

    public final void a(Bundle bundle, ept ept1)
    {
        a(new Runnable(bundle, (ept)ctz.a(ept1)) {

            final ept a;
            private Bundle b;
            private epw c;

            public final void run()
            {
                Runnable arunnable[] = new Runnable[1];
                epw epw1;
                Bundle bundle1;
                epw1 = c;
                bundle1 = b;
                synchronized (epw1.c)
                {
                    JsonBundleHelper.a(epw1.b(), bundle1);
                }
                if (a != null)
                {
                    arunnable[0] = new Runnable() {

                        public final void run()
                        {
                        }

                    };
                }
_L2:
                if (a != null)
                {
                    c.b.post(new Runnable(arunnable) {

                        private Runnable a[];

                        public final void run()
                        {
                            a[0].run();
                        }

            
            {
                a = arunnable;
                super();
            }
                    });
                }
                return;
                exception;
                s;
                JVM INSTR monitorexit ;
                try
                {
                    throw exception;
                }
                catch (IOException ioexception) { }
                if (a != null)
                {
                    arunnable[0] = new Runnable(this) {

                        private _cls3 a;

                        public final void run()
                        {
                            a.a.a();
                        }

            
            {
                a = _pcls3;
                super();
            }
                    };
                }
                if (true) goto _L2; else goto _L1
_L1:
            }

            
            {
                c = epw.this;
                b = bundle;
                a = ept1;
                super();
            }
        });
    }

    public final void a(Fragment fragment)
    {
        eps eps1 = (eps)fragment;
        fragment = (Fragment)ctz.a(fragment);
        ctz.a(eps1);
        a(new Runnable(eps1, fragment) {

            final eps a;
            final Fragment b;
            private epw c;

            public final void run()
            {
                Runnable arunnable[] = new Runnable[1];
                try
                {
                    arunnable[0] = new Runnable(this, c.a()) {

                        private Bundle a;
                        private _cls4 b;

                        public final void run()
                        {
                            b.a.a_(a);
                        }

            
            {
                b = _pcls4;
                a = bundle;
                super();
            }
                    };
                }
                catch (Exception exception)
                {
                    arunnable[0] = new Runnable(this) {

                        private _cls4 a;

                        public final void run()
                        {
                            a.a.b();
                        }

            
            {
                a = _pcls4;
                super();
            }
                    };
                }
                c.b.post(new Runnable(this, arunnable) {

                    private Runnable a[];
                    private _cls4 b;

                    public final void run()
                    {
                        if (b.b == null || b.b.o())
                        {
                            a[0].run();
                        }
                    }

            
            {
                b = _pcls4;
                a = arunnable;
                super();
            }
                });
            }

            
            {
                c = epw.this;
                a = eps1;
                b = fragment;
                super();
            }
        });
    }

    final File b()
    {
        if (f.exists())
        {
            if (!f.isDirectory() && !(new File(f.getCanonicalPath())).isDirectory())
            {
                Assertion.a("features storage is not a directory!");
            }
        } else
        if (!f.mkdirs())
        {
            Assertion.a("could not create features storage folder");
        }
        if (!f.isDirectory())
        {
            throw new IOException("Features storage is not a directory!");
        } else
        {
            return new File(f, c);
        }
    }

    final boolean c()
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = d;
        if (!flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (!e.o())
        {
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
        f = new File(e.k().getFilesDir(), String.format("features/user-%d", new Object[] {
            Integer.valueOf(e.a.hashCode())
        }));
        d = true;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof epw) && c.equals(((epw)obj).c) && e.a.equals(((epw)obj).e.a);
    }

    public final int hashCode()
    {
        int j = c.hashCode();
        char ac[] = e.a.toCharArray();
        int k = ac.length;
        for (int i = 0; i < k; i++)
        {
            j = j * 31 + ac[i];
        }

        return j;
    }
}
