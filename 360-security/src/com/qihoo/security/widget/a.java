// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import com.qihoo.security.quc.AccountLog;
import com.qihoo360.common.utils.Utils;
import java.util.List;

public class com.qihoo.security.widget.a extends RelativeLayout
    implements android.view.SurfaceHolder.Callback
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(boolean flag);

        public abstract void b();

        public abstract void b(boolean flag);
    }


    private static final String a = com/qihoo/security/widget/a.getSimpleName();
    private static final String m[] = {
        "XT531"
    };
    private Context b;
    private Camera c;
    private WindowManager d;
    private android.view.WindowManager.LayoutParams e;
    private SurfaceView f;
    private SurfaceHolder g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private List n;
    private AlarmManager o;
    private PendingIntent p;
    private a q;
    private Intent r;
    private Handler s;
    private final Object t = new Object();
    private BroadcastReceiver u;

    public com.qihoo.security.widget.a(Context context, a a1)
    {
        super(context);
        l = false;
        n = null;
        o = null;
        p = null;
        s = new Handler() {

            final com.qihoo.security.widget.a a;

            public void handleMessage(Message message)
            {
                super.handleMessage(message);
                message.what;
                JVM INSTR tableswitch 0 0: default 28
            //                           0 29;
                   goto _L1 _L2
_L1:
                return;
_L2:
                if (!com.qihoo.security.widget.a.a(a))
                {
                    com.qihoo.security.widget.a.b(a).a(com.qihoo.security.widget.a.a(a));
                    if (com.qihoo.security.widget.a.b(a) != null)
                    {
                        com.qihoo.security.widget.a.b(a).b(true);
                        return;
                    }
                }
                if (true) goto _L1; else goto _L3
_L3:
            }

            
            {
                a = com.qihoo.security.widget.a.this;
                super();
            }
        };
        u = new BroadcastReceiver() {

            final com.qihoo.security.widget.a a;

            public void onReceive(Context context1, Intent intent)
            {
                if (intent != null)
                {
                    context1 = intent.getAction();
                    if (!"android.intent.action.SCREEN_OFF".equals(context1))
                    {
                        continue;
                    }
                    if (com.qihoo.security.widget.a.d(a) && com.qihoo.security.widget.a.e(a) != null)
                    {
                        try
                        {
                            if (com.qihoo.security.widget.a.f(a) == null || com.qihoo.security.widget.a.f(a).isEmpty() || !com.qihoo.security.widget.a.f(a).contains(Build.MODEL))
                            {
                                com.qihoo.security.widget.a.g(a);
                                com.qihoo.security.widget.a.h(a);
                                com.qihoo.security.widget.a.e(a).release();
                                com.qihoo.security.widget.a.a(a, null);
                                com.qihoo.security.widget.a.a(a, false);
                            }
                            com.qihoo.security.widget.a.i(a);
                            (new Thread(new Runnable(this) {

                                final _cls3 a;

                                public void run()
                                {
                                    com.qihoo.security.widget.a.c(a.a);
                                    if (com.qihoo.security.widget.a.b(a.a) != null)
                                    {
                                        com.qihoo.security.widget.a.b(a.a).b(true);
                                    }
                                    com.qihoo.security.widget.a.a(a.a, true);
                                }

            
            {
                a = _pcls3;
                super();
            }
                            })).start();
                            if (com.qihoo.security.widget.a.b(a) != null)
                            {
                                com.qihoo.security.widget.a.b(a).b(false);
                            }
                            if (com.qihoo.security.widget.a.j(a) != null)
                            {
                                com.qihoo.security.widget.a.j(a).removeMessages(0);
                                com.qihoo.security.widget.a.j(a).sendEmptyMessageDelayed(0, 5000L);
                                return;
                            }
                        }
                        // Misplaced declaration of an exception variable
                        catch (Context context1)
                        {
                            return;
                        }
                    }
                }
                do
                {
                    return;
                } while (!"com.qihoo.security.action.TURN_OFF_LIGHT".equals(context1) || com.qihoo.security.widget.a.b(a) == null);
                com.qihoo.security.widget.a.b(a).a();
            }

            
            {
                a = com.qihoo.security.widget.a.this;
                super();
            }
        };
        b = context.getApplicationContext();
        q = a1;
        h();
        f = (SurfaceView)inflate(context, 0x7f03004e, this).findViewById(0x7f0b010f);
        g = f.getHolder();
        g.addCallback(this);
        g.setType(3);
        h = c();
        a1 = new IntentFilter();
        a1.addAction("android.intent.action.SCREEN_OFF");
        a1.addAction("com.qihoo.security.action.TURN_OFF_LIGHT");
        context.registerReceiver(u, a1, "com.qihoo.security.lite.PERMISSION", null);
        e = new android.view.WindowManager.LayoutParams(-1, -1, 2002, 24, -3);
        d = (WindowManager)b.getSystemService("window");
        setFocusableInTouchMode(true);
        setFocusable(true);
        o = (AlarmManager)context.getSystemService("alarm");
        r = new Intent("com.qihoo.security.action.TURN_OFF_LIGHT");
    }

    static Camera a(com.qihoo.security.widget.a a1, Camera camera)
    {
        a1.c = camera;
        return camera;
    }

    static List a(com.qihoo.security.widget.a a1, List list)
    {
        a1.n = list;
        return list;
    }

    static boolean a(com.qihoo.security.widget.a a1)
    {
        return a1.l;
    }

    static boolean a(com.qihoo.security.widget.a a1, boolean flag)
    {
        a1.l = flag;
        return flag;
    }

    static a b(com.qihoo.security.widget.a a1)
    {
        return a1.q;
    }

    static void c(com.qihoo.security.widget.a a1)
    {
        a1.d();
    }

    private boolean c()
    {
        Object obj;
        String as[];
        int j1;
        obj = Build.MODEL;
        as = m;
        j1 = as.length;
        int i1 = 0;
_L2:
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        if (((String) (obj)).equals(as[i1]))
        {
            return false;
        }
        break MISSING_BLOCK_LABEL_95;
        getCamera();
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        obj = c.getParameters();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        obj = ((android.hardware.Camera.Parameters) (obj)).getSupportedFlashModes();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        boolean flag;
        if (((List) (obj)).contains("torch"))
        {
            break MISSING_BLOCK_LABEL_90;
        }
        flag = ((List) (obj)).contains("on");
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        return true;
        Exception exception;
        exception;
        return false;
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void d()
    {
        android.hardware.Camera.Parameters parameters;
        List list;
        try
        {
            if (!h)
            {
                return;
            }
        }
        catch (Exception exception)
        {
            return;
        }
        getCamera();
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        parameters = c.getParameters();
        if (parameters == null)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        list = parameters.getSupportedFlashModes();
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        setIsLightOn(true);
        if ("torch".equals(parameters.getFlashMode())) goto _L2; else goto _L1
_L1:
        if (!list.contains("torch")) goto _L4; else goto _L3
_L3:
        f();
        parameters.setFlashMode("torch");
        c.setParameters(parameters);
_L2:
        p = PendingIntent.getBroadcast(b, 0, r, 0x8000000);
        if (o != null)
        {
            o.set(2, SystemClock.elapsedRealtime() + 0x2bf20L, p);
            return;
        }
        break MISSING_BLOCK_LABEL_164;
_L4:
        if (list.contains("on"))
        {
            f();
            parameters.setFlashMode("on");
            c.setParameters(parameters);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    static boolean d(com.qihoo.security.widget.a a1)
    {
        return a1.getIsLightOn();
    }

    static Camera e(com.qihoo.security.widget.a a1)
    {
        return a1.c;
    }

    private void e()
    {
        if (!h || !getIsLightOn())
        {
            break MISSING_BLOCK_LABEL_122;
        }
        if (c == null)
        {
            return;
        }
        android.hardware.Camera.Parameters parameters = c.getParameters();
        if (parameters == null)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        List list;
        String s1;
        list = parameters.getSupportedFlashModes();
        s1 = parameters.getFlashMode();
        if (list != null)
        {
            try
            {
                if (!"off".equals(s1) && list.contains("off"))
                {
                    parameters.setFlashMode("off");
                    c.setParameters(parameters);
                }
                if (o != null && p != null)
                {
                    o.cancel(p);
                    p = null;
                }
                setIsLightOn(false);
                return;
            }
            catch (Exception exception) { }
        }
    }

    static List f(com.qihoo.security.widget.a a1)
    {
        return a1.n;
    }

    private void f()
    {
        try
        {
            if (!j && c != null)
            {
                c.startPreview();
                j = true;
            }
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    private void g()
    {
        try
        {
            if (j && c != null)
            {
                c.stopPreview();
                j = false;
            }
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    static void g(com.qihoo.security.widget.a a1)
    {
        a1.e();
    }

    private void getCamera()
    {
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        c = Camera.open();
        return;
        RuntimeException runtimeexception;
        runtimeexception;
    }

    private boolean getIsLightOn()
    {
        boolean flag;
        synchronized (t)
        {
            flag = i;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void h()
    {
        (new Thread(new Runnable() {

            final com.qihoo.security.widget.a a;

            public void run()
            {
                com.qihoo.security.widget.a.a(a, Utils.openConfigFileDescrypt(com.qihoo.security.widget.a.k(a), "flsm.list", "com.qihoo.security.lite"));
            }

            
            {
                a = com.qihoo.security.widget.a.this;
                super();
            }
        })).start();
    }

    static void h(com.qihoo.security.widget.a a1)
    {
        a1.g();
    }

    static void i(com.qihoo.security.widget.a a1)
    {
        a1.getCamera();
    }

    static Handler j(com.qihoo.security.widget.a a1)
    {
        return a1.s;
    }

    static Context k(com.qihoo.security.widget.a a1)
    {
        return a1.b;
    }

    private void setIsLightOn(boolean flag)
    {
        synchronized (t)
        {
            i = flag;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a()
    {
        if (!h)
        {
            if (q != null)
            {
                q.b();
            }
        } else
        if (!k)
        {
            k = true;
            if (q != null)
            {
                q.b(false);
            }
            try
            {
                d.addView(this, e);
            }
            catch (Exception exception) { }
            AccountLog.a(com.qihoo.security.quc.AccountLog.FUNC_LIST.FUNC_NOTIFICATION_FLASHLIGHT);
            (new Thread(new Runnable() {

                final com.qihoo.security.widget.a a;

                public void run()
                {
                    com.qihoo.security.widget.a.c(a);
                    if (com.qihoo.security.widget.a.b(a) != null)
                    {
                        com.qihoo.security.widget.a.b(a).a(true);
                    }
                    com.qihoo.security.widget.a.a(a, true);
                    if (com.qihoo.security.widget.a.b(a) != null)
                    {
                        com.qihoo.security.widget.a.b(a).b(true);
                    }
                }

            
            {
                a = com.qihoo.security.widget.a.this;
                super();
            }
            })).start();
            s.sendEmptyMessageDelayed(0, 5000L);
            return;
        }
    }

    public void b()
    {
        if (!h)
        {
            Exception exception;
            try
            {
                if (c != null)
                {
                    e();
                    g();
                    c.release();
                    c = null;
                }
            }
            catch (Exception exception1) { }
            if (b != null)
            {
                b.unregisterReceiver(u);
            }
        } else
        if (k)
        {
            k = false;
            try
            {
                d.removeView(this);
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception) { }
            if (s != null)
            {
                s.removeMessages(0);
                return;
            }
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        try
        {
            if (c != null)
            {
                e();
                g();
                c.release();
                c = null;
            }
        }
        catch (Exception exception) { }
        if (b != null)
        {
            b.unregisterReceiver(u);
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceholder, int i1, int j1, int k1)
    {
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
        try
        {
            getCamera();
            c.setPreviewDisplay(surfaceholder);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SurfaceHolder surfaceholder)
        {
            surfaceholder.printStackTrace();
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
    }

}
