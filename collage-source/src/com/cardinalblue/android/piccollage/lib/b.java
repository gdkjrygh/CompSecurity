// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.lib;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.text.TextUtils;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.f;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.lib:
//            c

public class com.cardinalblue.android.piccollage.lib.b
{
    private static class a
    {

        private String a;
        private String b;
        private String c;

        public String a()
        {
            return a;
        }

        public String b()
        {
            return b;
        }

        public String c()
        {
            return c;
        }

        public String toString()
        {
            return (new StringBuilder()).append("title='").append(a).append('\'').append(", message='").append(b).append('\'').append(", button='").append(c).append('\'').append(" }").toString();
        }

        private a()
        {
        }
    }

    public static class b
    {

        private a a;

        public String a()
        {
            if (a != null)
            {
                return a.a();
            } else
            {
                return null;
            }
        }

        public String b()
        {
            if (a != null)
            {
                return a.b();
            } else
            {
                return null;
            }
        }

        public String c()
        {
            if (a != null)
            {
                return a.c();
            } else
            {
                return null;
            }
        }

        public String toString()
        {
            return (new StringBuilder()).append("Announcement{ ").append(a).append(" }").toString();
        }

        public b()
        {
        }
    }


    public com.cardinalblue.android.piccollage.lib.b()
    {
    }

    private void a(Activity activity, b b1)
    {
        if (activity == null || b1 == null)
        {
            return;
        } else
        {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);
            builder.setTitle(b1.a());
            builder.setMessage(b1.b());
            builder.setPositiveButton(b1.c(), null);
            b1 = builder.create();
            b1.setCanceledOnTouchOutside(false);
            k.b(activity, b1);
            return;
        }
    }

    static void a(com.cardinalblue.android.piccollage.lib.b b1, Activity activity, b b2)
    {
        b1.a(activity, b2);
    }

    private boolean a(b b1)
    {
        return b1 != null && !TextUtils.isEmpty(b1.b()) && !TextUtils.isEmpty(b1.a()) && !TextUtils.isEmpty(b1.c());
    }

    static boolean a(com.cardinalblue.android.piccollage.lib.b b1, b b2)
    {
        return b1.a(b2);
    }

    private boolean b(b b1)
    {
        String s = k.j().getString("announcer_last_message", "");
        return s != null && !TextUtils.isEmpty(s) && b1.b() != null && b1.b().equals(s);
    }

    static boolean b(com.cardinalblue.android.piccollage.lib.b b1, b b2)
    {
        return b1.b(b2);
    }

    public void a()
    {
        j.a(new Callable() {

            final com.cardinalblue.android.piccollage.lib.b a;

            public b a()
                throws Exception
            {
                return com.cardinalblue.android.piccollage.controller.network.f.p();
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                a = com.cardinalblue.android.piccollage.lib.b.this;
                super();
            }
        }).c(new i() {

            final com.cardinalblue.android.piccollage.lib.b a;

            public Object then(j j1)
                throws Exception
            {
                Activity activity = ((c)com.cardinalblue.android.a.a.a(com/cardinalblue/android/piccollage/lib/c)).a();
                j1 = (b)j1.e();
                if (activity != null && com.cardinalblue.android.piccollage.lib.b.a(a, j1) && !com.cardinalblue.android.piccollage.lib.b.b(a, j1))
                {
                    com.cardinalblue.android.piccollage.lib.b.a(a, activity, j1);
                    k.j().edit().putString("announcer_last_message", j1.b()).commit();
                }
                return null;
            }

            
            {
                a = com.cardinalblue.android.piccollage.lib.b.this;
                super();
            }
        }, k.a).a(new i() {

            final com.cardinalblue.android.piccollage.lib.b a;

            public Object then(j j1)
                throws Exception
            {
                if (j1.d())
                {
                    f.a(j1.f());
                }
                return null;
            }

            
            {
                a = com.cardinalblue.android.piccollage.lib.b.this;
                super();
            }
        }, k.a);
    }

    public void b()
    {
        k.j().edit().remove("announcer_last_message").commit();
    }

    public void onAppDidForeground(c.b b1)
    {
        a();
    }
}
