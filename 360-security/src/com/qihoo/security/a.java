// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security;

import android.content.Context;
import android.content.res.Resources;
import com.qihoo.security.app.e;
import com.qihoo.security.h.h;
import com.qihoo.security.lite.AppEnterActivity;
import com.qihoo.security.locale.d;
import com.qihoo.security.malware.b;
import com.qihoo360.mobilesafe.b.m;
import com.qihoo360.mobilesafe.share.SharedPref;

// Referenced classes of package com.qihoo.security:
//            SecurityApplication

public class a
{

    private static boolean a = false;
    private static boolean b = false;
    private static a c = null;

    private a()
    {
    }

    public static void a()
    {
        Context context = SecurityApplication.a();
        if (!SharedPref.b(context, "shortcut_created", false))
        {
            SharedPref.a(context, "shortcut_created", true);
            if (!m.a(context, 0x7f0c01d2))
            {
                m.a(context, com/qihoo/security/lite/AppEnterActivity, 0x7f020043, 0x7f0c01d2, null, new String[] {
                    "android.intent.category.LAUNCHER"
                });
            }
        }
    }

    public static a b()
    {
        if (c == null)
        {
            c = new a();
        }
        return c;
    }

    public static void c()
    {
        if (a)
        {
            return;
        } else
        {
            a = true;
            a a1 = b();
            a1.e();
            a1.f();
            return;
        }
    }

    public static void d()
    {
        if (b)
        {
            return;
        } else
        {
            b = true;
            g();
            h();
            return;
        }
    }

    private void e()
    {
        if (com.qihoo.security.env.a.g)
        {
            com.qihoo.security.env.a.g = false;
            com.qihoo.security.locale.d.a().b("");
        }
    }

    private void f()
    {
    }

    private static void g()
    {
        com.qihoo.security.malware.b.a(SecurityApplication.a());
        SharedPref.a(SecurityApplication.a(), "setting_auto_update");
    }

    private static void h()
    {
        Context context = SecurityApplication.a();
        if (context != null)
        {
            (new Thread(context) {

                final Context a;

                public void run()
                {
                    com.qihoo.security.h.h.a(a);
                    if (a.getResources().getBoolean(0x7f070008))
                    {
                        com.qihoo.security.app.e.a();
                    }
                    com.qihoo.security.support.b.a(a);
                    com.qihoo.security.support.b.a(10006);
                }

            
            {
                a = context;
                super();
            }
            }).start();
        }
    }

}
