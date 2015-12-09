// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.internal;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;
import com.millennialmedia.c;
import com.millennialmedia.internal.utils.ThreadUtils;
import com.millennialmedia.internal.utils.a;
import com.millennialmedia.internal.utils.e;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class MMActivity extends Activity
{
    private static class a
    {

        CountDownLatch a;
        b b;
        c c;

        private a(c c1, b b1)
        {
            a = new CountDownLatch(1);
            c = c1;
            b = b1;
        }

    }

    public static class b
    {

        private boolean a;
        private boolean b;
        private int c;
        private int d;
        private Integer e;
        private Integer f;

        static int a(b b1, int i)
        {
            b1.c = i;
            return i;
        }

        static Integer a(b b1)
        {
            return b1.e;
        }

        static Integer b(b b1)
        {
            return b1.f;
        }

        static int c(b b1)
        {
            return b1.c;
        }

        static int d(b b1)
        {
            return b1.d;
        }

        static boolean e(b b1)
        {
            return b1.a;
        }

        static boolean f(b b1)
        {
            return b1.b;
        }

        public b a(int i)
        {
            c = i;
            return this;
        }

        public b a(Integer integer, Integer integer1)
        {
            e = integer;
            f = integer1;
            return this;
        }

        public b a(boolean flag)
        {
            a = flag;
            return this;
        }

        public b b(boolean flag)
        {
            b = flag;
            return this;
        }

        public b()
        {
            d = -1;
            c = -1;
        }
    }

    public static abstract class c
    {

        public void a()
        {
        }

        public void a(MMActivity mmactivity)
        {
        }

        public void b(MMActivity mmactivity)
        {
        }

        public boolean b()
        {
            return true;
        }

        public void c(MMActivity mmactivity)
        {
        }

        public void d(MMActivity mmactivity)
        {
        }

        public c()
        {
        }
    }


    private static final String a = com/millennialmedia/internal/MMActivity.getSimpleName();
    private a b;
    private RelativeLayout c;

    public MMActivity()
    {
    }

    public static void a(Context context, b b1, c c1)
    {
        int k = 0;
        if (c1 == null)
        {
            com.millennialmedia.c.d(a, "Unable to launch MMActivity, provided MMActivityListener instance is null");
            return;
        }
        b b2 = b1;
        if (b1 == null)
        {
            if (com.millennialmedia.c.a())
            {
                com.millennialmedia.c.a(a, "No MMActivity Configuration specified, creating default activity Configuration.");
            }
            b2 = new b();
        }
        b1 = new a(c1, b2);
        int i = e.a(b1, Long.valueOf(5000L));
        if (i == 0)
        {
            com.millennialmedia.c.d(a, "Unable to launch MMActivity, failed to cache activity state");
            c1.a();
            return;
        }
        c1 = new Intent(context, com/millennialmedia/internal/MMActivity);
        c1.putExtra("activity_state_id", i);
        if (com.millennialmedia.internal.b.a(b2) != null || b.b(b2) != null)
        {
            int j;
            if (com.millennialmedia.internal.b.a(b2) != null)
            {
                j = com.millennialmedia.internal.b.a(b2).intValue();
            } else
            {
                j = 0;
            }
            if (b.b(b2) != null)
            {
                k = b.b(b2).intValue();
            }
            context.startActivity(c1, ActivityOptions.makeCustomAnimation(context, j, k).toBundle());
        } else
        {
            context.startActivity(c1);
        }
        ThreadUtils.c(new Runnable(b1) {

            final a a;

            public void run()
            {
                try
                {
                    if (!a.a.await(5000L, TimeUnit.MILLISECONDS))
                    {
                        a.c.a();
                    }
                    return;
                }
                catch (InterruptedException interruptedexception)
                {
                    return;
                }
            }

            
            {
                a = a1;
                super();
            }
        });
    }

    static void a(MMActivity mmactivity)
    {
        mmactivity.b();
    }

    private void b()
    {
        View view = getWindow().getDecorView();
        if (com.millennialmedia.c.a())
        {
            com.millennialmedia.c.a(a, (new StringBuilder()).append("Enabling immersive mode:\ndecorView = ").append(view).append("\nActivity = ").append(this).toString());
        }
        view.setSystemUiVisibility(5894);
    }

    private boolean c()
    {
        Object obj = e.a(getIntent().getIntExtra("activity_state_id", 0));
        if (!(obj instanceof a))
        {
            return false;
        } else
        {
            b = (a)obj;
            return true;
        }
    }

    private boolean d()
    {
        Intent intent = getIntent();
        intent.removeExtra("activity_state_id");
        int i = e.a(b, null);
        if (i == 0)
        {
            return false;
        } else
        {
            intent.putExtra("activity_state_id", i);
            return true;
        }
    }

    public ViewGroup a()
    {
        return c;
    }

    public void a(int i)
    {
        if (i != getRequestedOrientation())
        {
            com.millennialmedia.internal.b.a(b.b, i);
            setRequestedOrientation(i);
        }
    }

    public void finish()
    {
        super.finish();
        if (b != null && b.b != null && (com.millennialmedia.internal.b.a(b.b) != null || b.b(b.b) != null))
        {
            overridePendingTransition(com.millennialmedia.internal.b.a(b.b).intValue(), b.b(b.b).intValue());
        }
    }

    public void onBackPressed()
    {
        if (b.c.b())
        {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (c()) goto _L2; else goto _L1
_L1:
        com.millennialmedia.c.d(a, (new StringBuilder()).append("Failed to load activity state, aborting activity launch <").append(this).append(">").toString());
        finish();
_L4:
        return;
_L2:
        b.a.countDown();
        int i = getRequestedOrientation();
        int k = com.millennialmedia.internal.b.c(b.b);
        if (i == k)
        {
            break; /* Loop/switch isn't completed */
        }
        setRequestedOrientation(k);
        int l = com.millennialmedia.internal.utils.a.D();
        int i1 = com.millennialmedia.internal.utils.a.a(k);
        if (l == i1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (com.millennialmedia.c.a())
        {
            com.millennialmedia.c.a(a, (new StringBuilder()).append("Requested orientation will force orientation change:\n\tCurrent requested orientation: ").append(i).append("\n\tDesired requested orientation: ").append(k).append("\n\tCurrent config orientation: ").append(l).append("\n\tDesired config orientation: ").append(i1).toString());
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (com.millennialmedia.c.a())
        {
            com.millennialmedia.c.a(a, (new StringBuilder()).append("New activity created with orientation ").append(com.millennialmedia.internal.utils.a.E()).toString());
        }
        if (b.d(b.b) != -1)
        {
            setVolumeControlStream(b.d(b.b));
        }
        int j;
        if (android.os.Build.VERSION.SDK_INT >= 19 && com.millennialmedia.internal.b.e(b.b))
        {
            b();
            getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new android.view.View.OnSystemUiVisibilityChangeListener() {

                final MMActivity a;

                public void onSystemUiVisibilityChange(int j1)
                {
                    if ((j1 & 4) == 0)
                    {
                        com.millennialmedia.internal.MMActivity.a(a);
                    }
                }

            
            {
                a = MMActivity.this;
                super();
            }
            });
        } else
        if (com.millennialmedia.internal.b.e(b.b))
        {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
        }
        c = new RelativeLayout(this);
        if (b.f(b.b))
        {
            j = 0;
        } else
        {
            j = 160;
        }
        bundle = new ColorDrawable(0xff000000);
        bundle.setAlpha(j);
        c.setBackground(bundle);
        c.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        setContentView(c);
        b.c.a(this);
        return;
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (b == null || b.c == null)
        {
            return;
        }
        if (!isFinishing() && !d())
        {
            com.millennialmedia.c.d(a, (new StringBuilder()).append("Failed to save activity state <").append(this).append(">").toString());
        }
        b.c.d(this);
    }

    public void onPause()
    {
        super.onPause();
        b.c.c(this);
    }

    public void onResume()
    {
        super.onResume();
        b.c.b(this);
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        if (com.millennialmedia.c.a())
        {
            com.millennialmedia.c.a(a, (new StringBuilder()).append("onWindowFocusChanged: hasFocus = ").append(flag).toString());
            if (b != null)
            {
                com.millennialmedia.c.a(a, (new StringBuilder()).append("activityState.configuration.immersive = ").append(com.millennialmedia.internal.b.e(b.b)).toString());
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 19 && b != null && com.millennialmedia.internal.b.e(b.b) && flag)
        {
            b();
        }
    }

}
