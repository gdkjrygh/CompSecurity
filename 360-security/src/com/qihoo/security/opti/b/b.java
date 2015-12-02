// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.b;

import android.text.TextUtils;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.enginehelper.clean.CleanScanType;
import com.qihoo.security.enginehelper.clean.a;
import com.qihoo.security.opti.trashclear.d;
import com.qihoo.security.opti.trashclear.e;
import java.util.Map;

// Referenced classes of package com.qihoo.security.opti.b:
//            d

public class b
{

    private static boolean a = false;
    private static final b b = new b();
    private static long c = 0x3200000L;
    private a d;
    private boolean e;
    private boolean f;
    private String g;
    private com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus h;
    private final com.qihoo.security.enginehelper.clean.a.b i = new com.qihoo.security.enginehelper.clean.a.b() {

        final b a;
        private long b;

        private void a(d d1)
        {
            if (d1 != null && d1.k != null)
            {
                b = d1.k.e();
            }
        }

        public void a()
        {
            b = 0L;
        }

        public void a(int j, Map map)
        {
        }

        public void a(Map map)
        {
        }

        public void b()
        {
            com.qihoo.security.opti.b.b.a(a, false);
            b.b(a).f();
        }

        public void b(int j, Map map)
        {
            map = com.qihoo.security.opti.trashclear.e.a(j, map);
            com.qihoo.security.opti.b.b.a(a, false);
            if (!com.qihoo.security.opti.b.b.a(a))
            {
                a(map);
                if (b >= b.f() || b.g())
                {
                    com.qihoo.security.opti.b.b.a(a, com.qihoo.security.opti.b.d.a(SecurityApplication.a(), b, true));
                    com.qihoo.security.opti.b.b.a(a, com.qihoo.security.opti.trashclear.ui.mainpage.a.a(com.qihoo.security.opti.trashclear.ui.mainpage.a.a(b)));
                }
            }
        }

        public void c()
        {
            com.qihoo.security.opti.b.b.a(a, false);
        }

            
            {
                a = b.this;
                super();
            }
    };

    private b()
    {
    }

    public static b a()
    {
        return b;
    }

    static com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus a(b b1, com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus)
    {
        b1.h = examstatus;
        return examstatus;
    }

    static String a(b b1, String s)
    {
        b1.g = s;
        return s;
    }

    static boolean a(b b1)
    {
        return b1.f;
    }

    static boolean a(b b1, boolean flag)
    {
        b1.e = flag;
        return flag;
    }

    static a b(b b1)
    {
        return b1.d;
    }

    static long f()
    {
        return c;
    }

    static boolean g()
    {
        return a;
    }

    private void h()
    {
        d = com.qihoo.security.enginehelper.clean.a.a(SecurityApplication.a());
        d.e();
        d.a(i);
    }

    public void b()
    {
        h();
        f = false;
        e = true;
        d.a(CleanScanType.NOTIFICATION);
        d.a(null);
        d.a(null);
        d.b();
    }

    public void c()
    {
        f = true;
        if (e && d != null)
        {
            d.c();
        }
    }

    public boolean d()
    {
        return com.qihoo.security.enginehelper.clean.a.a(SecurityApplication.a()).g();
    }

    public void e()
    {
        if (!TextUtils.isEmpty(g))
        {
            com.qihoo.utils.notice.a.a().a(h, g);
            g = null;
        }
    }

}
