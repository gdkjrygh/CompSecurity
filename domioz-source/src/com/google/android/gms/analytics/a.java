// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.common.internal.ap;
import com.google.android.gms.internal.kw;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            c, an, bb, ay, 
//            ac, x, l, d, 
//            h, bd, e, b, 
//            m, bc, w, u

public class a extends c
{

    private static volatile a a;
    private static List b;
    private static boolean p;
    private final Context c;
    private final kw d;
    private final bb e;
    private final w f;
    private final m g;
    private final l h;
    private final x i;
    private final ac j;
    private final d k;
    private Set l;
    private boolean m;
    private String n;
    private String o;

    private a(Context context)
    {
        this(context, ((m) (an.c())));
    }

    private a(Context context, m m1)
    {
        ap.a(context);
        context = context.getApplicationContext();
        ap.a(context);
        ap.a(m1);
        e = bb.a();
        c = context;
        d = kw.a(context);
        ap.a(d);
        g = m1;
        f = new ay(this);
        j = new ac(d);
        i = new x(d);
        h = new l(d);
        k = new d(d, j);
        l = new HashSet();
        if (!p)
        {
            try
            {
                context = c.getPackageManager().getApplicationInfo(c.getPackageName(), 129);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                com.google.android.gms.analytics.h.c((new StringBuilder("PackageManager doesn't know about package: ")).append(context).toString());
                context = null;
            }
            if (context == null)
            {
                com.google.android.gms.analytics.h.d("Couldn't get ApplicationInfo to load global config.");
            } else
            {
                context = ((ApplicationInfo) (context)).metaData;
                if (context != null)
                {
                    int i1 = context.getInt("com.google.android.gms.analytics.globalConfigResource");
                    if (i1 > 0)
                    {
                        context = (e)(new bd(c)).a(i1);
                        if (context != null)
                        {
                            com.google.android.gms.analytics.h.c("Loading global config values.");
                            int j1;
                            if (((e) (context)).a != null)
                            {
                                j1 = 1;
                            } else
                            {
                                j1 = 0;
                            }
                            if (j1 != 0)
                            {
                                o = ((e) (context)).a;
                                com.google.android.gms.analytics.h.c((new StringBuilder("app name loaded: ")).append(o).toString());
                            }
                            if (((e) (context)).b != null)
                            {
                                j1 = 1;
                            } else
                            {
                                j1 = 0;
                            }
                            if (j1 != 0)
                            {
                                n = ((e) (context)).b;
                                com.google.android.gms.analytics.h.c((new StringBuilder("app version loaded: ")).append(n).toString());
                            }
                            if (((e) (context)).c != null)
                            {
                                j1 = 1;
                            } else
                            {
                                j1 = 0;
                            }
                            if (j1 != 0)
                            {
                                m1 = ((e) (context)).c.toLowerCase();
                                if ("verbose".equals(m1))
                                {
                                    j1 = 0;
                                } else
                                if ("info".equals(m1))
                                {
                                    j1 = 1;
                                } else
                                if ("warning".equals(m1))
                                {
                                    j1 = 2;
                                } else
                                if ("error".equals(m1))
                                {
                                    j1 = 3;
                                } else
                                {
                                    j1 = -1;
                                }
                                if (j1 >= 0)
                                {
                                    com.google.android.gms.analytics.h.c((new StringBuilder("log level loaded: ")).append(j1).toString());
                                    com.google.android.gms.analytics.h.b().a(j1);
                                }
                            }
                            if (((e) (context)).d >= 0)
                            {
                                j1 = 1;
                            } else
                            {
                                j1 = 0;
                            }
                            if (j1 != 0)
                            {
                                g.a(((e) (context)).d);
                            }
                            if (((e) (context)).e != -1)
                            {
                                j1 = 1;
                            } else
                            {
                                j1 = 0;
                            }
                            if (j1 != 0)
                            {
                                boolean flag;
                                if (((e) (context)).e == 1)
                                {
                                    flag = true;
                                } else
                                {
                                    flag = false;
                                }
                                e.a(bc.ac);
                                m = flag;
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    static a a()
    {
        com/google/android/gms/analytics/a;
        JVM INSTR monitorenter ;
        a a1 = a;
        com/google/android/gms/analytics/a;
        JVM INSTR monitorexit ;
        return a1;
        Exception exception;
        exception;
        com/google/android/gms/analytics/a;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static a a(Context context)
    {
        ap.a(context);
        if (a != null) goto _L2; else goto _L1
_L1:
        com/google/android/gms/analytics/a;
        JVM INSTR monitorenter ;
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        a = new a(context);
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        for (context = b.iterator(); context.hasNext(); ((Runnable)context.next()).run()) { }
        break MISSING_BLOCK_LABEL_78;
        context;
        com/google/android/gms/analytics/a;
        JVM INSTR monitorexit ;
        throw context;
        b = null;
        com/google/android/gms/analytics/a;
        JVM INSTR monitorexit ;
_L2:
        return a;
    }

    public final boolean b()
    {
        e.a(bc.ad);
        return m;
    }

    final u c()
    {
        return g.a(c);
    }

    public final Context d()
    {
        return c;
    }

    final w e()
    {
        return f;
    }

    public final void f()
    {
        g.a();
    }
}
