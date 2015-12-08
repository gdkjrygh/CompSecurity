// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nodex.startup.splashscreen;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.facebook.nodex.resources.NodexResources;
import com.facebook.nodex.startup.crashloop.CrashLoop;
import com.facebook.nodex.startup.signal.DialtoneSignalFile;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.facebook.nodex.startup.splashscreen:
//            NodexBaseActivity, NodexError, NodexInitializer

public abstract class AbstractNodexSplashActivity extends NodexBaseActivity
{

    protected Context a;
    protected Handler b;
    protected NodexResources c;
    protected ExecutorService d;
    protected DialtoneSignalFile e;
    private CrashLoop f;
    private ContentResolver g;
    private NodexInitializer h;
    private boolean i;
    private boolean j;
    private String k;
    private View l;
    private View m;
    private Runnable n;
    private TextView o;
    private Runnable p;

    public AbstractNodexSplashActivity()
    {
    }

    static View a(AbstractNodexSplashActivity abstractnodexsplashactivity)
    {
        return abstractnodexsplashactivity.l;
    }

    private static void a(View view)
    {
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            return;
        } else
        {
            view.setAlpha(0.0F);
            AnimatorSet animatorset = new AnimatorSet();
            Object obj = ObjectAnimator.ofFloat(view, "rotationX", new float[] {
                -45F, 0.0F
            });
            ObjectAnimator objectanimator = ObjectAnimator.ofFloat(view, "scaleX", new float[] {
                2.5F, 0.85F
            });
            ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(view, "scaleY", new float[] {
                2.5F, 0.85F
            });
            ObjectAnimator objectanimator2 = ObjectAnimator.ofFloat(view, "alpha", new float[] {
                0.0F, 1.0F
            });
            animatorset.setInterpolator(new DecelerateInterpolator());
            animatorset.setDuration(600L);
            animatorset.setStartDelay(1000L);
            animatorset.playTogether(new Animator[] {
                obj, objectanimator, objectanimator1, objectanimator2
            });
            animatorset.start();
            obj = new AnimatorSet();
            objectanimator = ObjectAnimator.ofFloat(view, "scaleX", new float[] {
                0.85F, 1.0F
            });
            view = ObjectAnimator.ofFloat(view, "scaleY", new float[] {
                0.85F, 1.0F
            });
            ((AnimatorSet) (obj)).play(objectanimator).with(view).after(animatorset);
            ((AnimatorSet) (obj)).setDuration(250L);
            ((AnimatorSet) (obj)).start();
            return;
        }
    }

    static void a(AbstractNodexSplashActivity abstractnodexsplashactivity, NodexError nodexerror)
    {
        abstractnodexsplashactivity.a(nodexerror);
    }

    static void a(AbstractNodexSplashActivity abstractnodexsplashactivity, String s1)
    {
        abstractnodexsplashactivity.a(s1);
    }

    private void a(NodexError nodexerror)
    {
        startActivity(nodexerror.a(this));
        finish();
    }

    private void a(String s1)
    {
        if (o == null || s1 == null)
        {
            return;
        } else
        {
            b.post(new _cls5(s1));
            return;
        }
    }

    static TextView b(AbstractNodexSplashActivity abstractnodexsplashactivity)
    {
        return abstractnodexsplashactivity.o;
    }

    static Runnable c(AbstractNodexSplashActivity abstractnodexsplashactivity)
    {
        return abstractnodexsplashactivity.n;
    }

    static View d(AbstractNodexSplashActivity abstractnodexsplashactivity)
    {
        return abstractnodexsplashactivity.m;
    }

    static String e(AbstractNodexSplashActivity abstractnodexsplashactivity)
    {
        return abstractnodexsplashactivity.k;
    }

    static Runnable f(AbstractNodexSplashActivity abstractnodexsplashactivity)
    {
        return abstractnodexsplashactivity.p;
    }

    static NodexInitializer g(AbstractNodexSplashActivity abstractnodexsplashactivity)
    {
        return abstractnodexsplashactivity.h;
    }

    static CrashLoop h(AbstractNodexSplashActivity abstractnodexsplashactivity)
    {
        return abstractnodexsplashactivity.f;
    }

    static ContentResolver i(AbstractNodexSplashActivity abstractnodexsplashactivity)
    {
        return abstractnodexsplashactivity.g;
    }

    static void j(AbstractNodexSplashActivity abstractnodexsplashactivity)
    {
        abstractnodexsplashactivity.q();
    }

    private void n()
    {
        String s1 = b();
        if (s1 != null)
        {
            l = findViewById(c.b(s1));
            n = new _cls1();
            s1 = d();
            if (s1 != null)
            {
                o = (TextView)findViewById(c.b(s1));
                p = new _cls2();
                o();
                return;
            }
        }
    }

    private void o()
    {
        String s1 = c();
        if (s1 == null)
        {
            return;
        }
        int i1 = Runtime.getRuntime().availableProcessors();
        AlphaAnimation alphaanimation;
        long l1;
        if (i1 >= 4)
        {
            l1 = 1000L;
        } else
        if (i1 > 1)
        {
            l1 = 2000L;
        } else
        {
            l1 = 5000L;
        }
        alphaanimation = new AlphaAnimation(1.0F, 0.2F);
        alphaanimation.setDuration(600L);
        alphaanimation.setRepeatCount(1);
        alphaanimation.setRepeatMode(2);
        alphaanimation.setAnimationListener(new _cls3(l1));
        m = findViewById(c.b(s1));
        n = new _cls4(alphaanimation);
        a(m);
        p = null;
    }

    private boolean p()
    {
        Intent intent;
        if (!isTaskRoot())
        {
            if ((intent = getIntent()) != null)
            {
                String s1 = intent.getAction();
                if (intent.hasCategory("android.intent.category.LAUNCHER") && "android.intent.action.MAIN".equals(s1))
                {
                    return true;
                }
            }
        }
        return false;
    }

    private void q()
    {
        if (!isFinishing())
        {
            r();
        }
    }

    private void r()
    {
        i = true;
        j = true;
        m();
        overridePendingTransition(0, 0);
    }

    private boolean s()
    {
label0:
        {
            Object obj = (ActivityManager)a.getSystemService("activity");
            String s1 = g();
            obj = ((ActivityManager) (obj)).getRunningAppProcesses();
            if (obj == null)
            {
                break label0;
            }
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
            } while (!s1.equals(((android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj)).next()).processName));
            return true;
        }
        return false;
    }

    private Intent t()
    {
        Intent intent = new Intent();
        for (Iterator iterator = j().iterator(); iterator.hasNext(); intent.addCategory((String)iterator.next())) { }
        intent.setComponent(i());
        intent.addFlags(0x4000000);
        return intent;
    }

    protected abstract String a();

    protected abstract String b();

    protected abstract String c();

    protected abstract String d();

    protected abstract String e();

    protected abstract String f();

    protected abstract String g();

    protected abstract Uri h();

    protected abstract ComponentName i();

    protected abstract Set j();

    protected void k()
    {
        setContentView(c.a(a()));
        n();
    }

    protected final void l()
    {
        if (p())
        {
            finish();
            return;
        }
        if (s())
        {
            m();
            return;
        } else
        {
            d.execute(new InitRunnable((byte)0));
            return;
        }
    }

    protected void m()
    {
        e.b();
        startActivity(t());
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        k = getClass().getSimpleName();
        super.onCreate(bundle);
        a = getApplicationContext();
        f = new CrashLoop(a);
        g = a.getContentResolver();
        h = new NodexInitializer(this);
        b = new Handler();
        d = Executors.newSingleThreadExecutor();
        c = new NodexResources(this);
        e = new DialtoneSignalFile(a);
        k();
        l();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (n != null)
        {
            b.removeCallbacks(n);
        }
        if (p != null)
        {
            b.removeCallbacks(p);
        }
        d.shutdown();
    }

    protected void onPause()
    {
        super.onPause();
        if (i)
        {
            _cls6 _lcls6 = new _cls6();
            b.postDelayed(_lcls6, 3000L);
            j = true;
        }
    }

    protected void onResume()
    {
        super.onResume();
        if (j)
        {
            finish();
        }
    }

    private class _cls5
        implements Runnable
    {

        final String a;
        final AbstractNodexSplashActivity b;

        public void run()
        {
            int i1 = b.c.c(a);
            if (AbstractNodexSplashActivity.b(b) != null)
            {
                AbstractNodexSplashActivity.b(b).setText(i1);
            }
        }

        _cls5(String s1)
        {
            b = AbstractNodexSplashActivity.this;
            a = s1;
            super();
        }
    }


    private class _cls1
        implements Runnable
    {

        final AbstractNodexSplashActivity a;

        public void run()
        {
            AbstractNodexSplashActivity.a(a).setVisibility(0);
        }

        _cls1()
        {
            a = AbstractNodexSplashActivity.this;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final AbstractNodexSplashActivity a;

        public void run()
        {
            AbstractNodexSplashActivity.b(a).setVisibility(0);
        }

        _cls2()
        {
            a = AbstractNodexSplashActivity.this;
            super();
        }
    }


    private class _cls3
        implements android.view.animation.Animation.AnimationListener
    {

        final long a;
        final AbstractNodexSplashActivity b;

        public void onAnimationEnd(Animation animation)
        {
            b.b.postDelayed(AbstractNodexSplashActivity.c(b), a);
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
        }

        _cls3(long l1)
        {
            b = AbstractNodexSplashActivity.this;
            a = l1;
            super();
        }
    }


    private class _cls4
        implements Runnable
    {

        final Animation a;
        final AbstractNodexSplashActivity b;

        public void run()
        {
            AbstractNodexSplashActivity.d(b).startAnimation(a);
        }

        _cls4(Animation animation)
        {
            b = AbstractNodexSplashActivity.this;
            a = animation;
            super();
        }
    }


    private class InitRunnable
        implements Runnable
    {

        final AbstractNodexSplashActivity a;

        public void run()
        {
            Object obj;
            long l1;
            l1 = System.nanoTime();
            if (AbstractNodexSplashActivity.c(a) != null)
            {
                a.b.postDelayed(AbstractNodexSplashActivity.c(a), 3000L);
            }
            if (AbstractNodexSplashActivity.f(a) != null)
            {
                a.b.postDelayed(AbstractNodexSplashActivity.f(a), 10000L);
            }
            AbstractNodexSplashActivity.a(a, a.e());
            obj = AbstractNodexSplashActivity.g(a).a();
            if (obj != null)
            {
                AbstractNodexSplashActivity.a(a, ((NodexError) (obj)));
                return;
            }
            AbstractNodexSplashActivity.a(a, a.f());
            if (!AbstractNodexSplashActivity.h(a).d() || AbstractNodexSplashActivity.h(a).c())
            {
                AbstractNodexSplashActivity.h(a).b();
            }
            obj = AbstractNodexSplashActivity.i(a).acquireContentProviderClient(a.h());
            if (obj == null) goto _L2; else goto _L1
_L1:
            Object obj1;
            obj1 = com.facebook.nodex.startup.warmup.NodexWarmupContentProvider.Action.WaitForInit;
            boolean flag = AbstractNodexSplashActivity.g(a).b();
            LightWeightPerfState.a();
            obj1 = NodexWarmupContentProvider.a(((com.facebook.nodex.startup.warmup.NodexWarmupContentProvider.Action) (obj1)), flag, LightWeightPerfState.b());
            ((ContentProviderClient) (obj)).insert(a.h(), ((android.content.ContentValues) (obj1)));
            ((ContentProviderClient) (obj)).release();
_L4:
            class _cls1
                implements Runnable
            {

                final long a;
                final InitRunnable b;

                public void run()
                {
                    (new StringBuilder("InitRunnable ")).append((int)((double)(System.nanoTime() - a) / 1000000D)).append(" ms");
                    AbstractNodexSplashActivity.j(b.a);
                }

                _cls1(long l1)
                {
                    b = InitRunnable.this;
                    a = l1;
                    super();
                }
            }

            a.b.post(new _cls1(l1));
            return;
            Object obj2;
            obj2;
            Log.e(AbstractNodexSplashActivity.e(a), "Remote exception from main process.", ((Throwable) (obj2)));
            ((ContentProviderClient) (obj)).release();
            continue; /* Loop/switch isn't completed */
            obj2;
            ((ContentProviderClient) (obj)).release();
            throw obj2;
_L2:
            Log.e(AbstractNodexSplashActivity.e(a), "Failed to acquire provider to warmup the main process.");
            if (true) goto _L4; else goto _L3
_L3:
        }

        private InitRunnable()
        {
            a = AbstractNodexSplashActivity.this;
            super();
        }

        InitRunnable(byte byte0)
        {
            this();
        }
    }


    private class _cls6
        implements Runnable
    {

        final AbstractNodexSplashActivity a;

        public void run()
        {
            a.finish();
            a.overridePendingTransition(0, 0);
        }

        _cls6()
        {
            a = AbstractNodexSplashActivity.this;
            super();
        }
    }

}
