// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.c.a;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.g;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.appbox.c.b.a;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.qihoo.security.appbox.c.a:
//            a

public class com.qihoo.security.appbox.c.a.b
{
    class a
        implements Runnable
    {

        final com.qihoo.security.appbox.c.a.b a;

        public void run()
        {
            String s = com.qihoo.security.appbox.c.a.b.a(a).a();
            if (!TextUtils.isEmpty(s) && s.equals("com.qihoo.security.lite"))
            {
                com.qihoo.security.appbox.c.a.b.b(a);
                return;
            } else
            {
                a.b();
                return;
            }
        }

        a()
        {
            a = com.qihoo.security.appbox.c.a.b.this;
            super();
        }
    }

    public static interface b
    {

        public abstract void a();
    }

    static class c
        implements b
    {

        private final com.android.volley.toolbox.g.c a;

        public void a()
        {
            a.a();
        }

        public c(com.android.volley.toolbox.g.c c1)
        {
            a = c1;
        }
    }

    private static class d
    {

        public static final com.qihoo.security.appbox.c.a.b a = new com.qihoo.security.appbox.c.a.b();

    }


    private static String a = "ImageCacheManager";
    private static AtomicInteger g = new AtomicInteger();
    private Handler b;
    private com.qihoo360.mobilesafe.core.d.b c;
    private final g d;
    private final com.qihoo.security.appbox.c.a.a e = new com.qihoo.security.appbox.c.a.a((((ActivityManager)SecurityApplication.a().getSystemService("activity")).getMemoryClass() * 0x100000) / 3);
    private a f;

    public com.qihoo.security.appbox.c.a.b()
    {
        d = new g(com.qihoo.security.appbox.c.b.a.a(), e);
        HandlerThread handlerthread = new HandlerThread("ImageCacheManager", 10);
        handlerthread.start();
        b = new Handler(handlerthread.getLooper());
        f = new a();
        c = new com.qihoo360.mobilesafe.core.d.b(SecurityApplication.a());
    }

    private com.android.volley.toolbox.g.d a(ImageView imageview, Drawable drawable, Drawable drawable1)
    {
        Integer integer = Integer.valueOf(g.incrementAndGet());
        imageview.setTag(0x7f0b0006, integer);
        return new com.android.volley.toolbox.g.d(imageview, integer, drawable1, drawable) {

            final ImageView a;
            final Integer b;
            final Drawable c;
            final Drawable d;
            final com.qihoo.security.appbox.c.a.b e;

            private boolean a()
            {
                Integer integer1 = (Integer)a.getTag(0x7f0b0006);
                return integer1 != null && integer1 == b;
            }

            public void a(VolleyError volleyerror)
            {
                if (c != null && a())
                {
                    a.setImageDrawable(c);
                }
            }

            public void a(com.android.volley.toolbox.g.c c1, boolean flag)
            {
                if (a())
                {
                    if (c1.b() != null)
                    {
                        if (!flag && d != null)
                        {
                            c1 = new TransitionDrawable(new Drawable[] {
                                d, new BitmapDrawable(SecurityApplication.a().getResources(), c1.b())
                            });
                            c1.setCrossFadeEnabled(true);
                            a.setImageDrawable(c1);
                            c1.startTransition(100);
                            return;
                        } else
                        {
                            a.setImageBitmap(c1.b());
                            return;
                        }
                    }
                    if (d != null)
                    {
                        a.setImageDrawable(d);
                        return;
                    }
                }
            }

            
            {
                e = com.qihoo.security.appbox.c.a.b.this;
                a = imageview;
                b = integer;
                c = drawable;
                d = drawable1;
                super();
            }
        };
    }

    public static com.qihoo.security.appbox.c.a.b a()
    {
        return com.qihoo.security.appbox.c.a.d.a;
    }

    static com.qihoo360.mobilesafe.core.d.b a(com.qihoo.security.appbox.c.a.b b1)
    {
        return b1.c;
    }

    static void b(com.qihoo.security.appbox.c.a.b b1)
    {
        b1.d();
    }

    static String c()
    {
        return a;
    }

    private void d()
    {
        b.removeCallbacks(f);
        b.postDelayed(f, 0x493e0L);
    }

    public b a(String s, ImageView imageview, int i)
    {
        return a(s, imageview, i, 0, 0);
    }

    public b a(String s, ImageView imageview, int i, int j, int k)
    {
        Drawable drawable = null;
        if (i > 0)
        {
            drawable = imageview.getResources().getDrawable(i);
        }
        imageview = a(imageview, drawable, drawable);
        s = new c(d.a(s, imageview, j, k));
        d();
        return s;
    }

    public void a(String s)
    {
        while (TextUtils.isEmpty(s) || com.qihoo.security.appbox.c.b.a.b(s) || d.a(s, 0, 0)) 
        {
            return;
        }
        d.a(s, new com.android.volley.toolbox.g.d() {

            final com.qihoo.security.appbox.c.a.b a;

            public void a(VolleyError volleyerror)
            {
            }

            public void a(com.android.volley.toolbox.g.c c1, boolean flag)
            {
                if (c1 == null)
                {
                    Log.e(com.qihoo.security.appbox.c.a.b.c(), (new StringBuilder()).append("imagecontainer = null ").append(flag).toString());
                }
            }

            
            {
                a = com.qihoo.security.appbox.c.a.b.this;
                super();
            }
        });
        d();
    }

    public void b()
    {
        if (e != null)
        {
            e.a();
        }
    }

}
