// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.pandora.android.ads.s;
import java.util.Timer;
import java.util.TimerTask;
import p.dd.e;
import p.df.a;

// Referenced classes of package com.pandora.android.activity:
//            BaseFragmentActivity

public class YuMeVideoActivity extends BaseFragmentActivity
{

    private int A;
    private boolean B;
    private boolean C;
    private Runnable D;
    private final BroadcastReceiver E = new BroadcastReceiver() {

        final YuMeVideoActivity a;

        public void onReceive(Context context, Intent intent)
        {
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction()))
            {
                com.pandora.android.activity.YuMeVideoActivity.e(a).c();
            }
        }

            
            {
                a = YuMeVideoActivity.this;
                super();
            }
    };
    private s o;
    private RelativeLayout p;
    private FrameLayout q;
    private Timer z;

    public YuMeVideoActivity()
    {
        A = 0;
        D = new Runnable() {

            final YuMeVideoActivity a;

            public void run()
            {
                try
                {
                    YuMeVideoActivity.b(a);
                    YuMeVideoActivity.c(a);
                    com.pandora.android.activity.YuMeVideoActivity.e(a).a(YuMeVideoActivity.d(a));
                    if (!com.pandora.android.activity.YuMeVideoActivity.e(a).e())
                    {
                        a.finish();
                    }
                    return;
                }
                catch (Exception exception)
                {
                    p.df.a.c("YuMeVideoActivity", "Exception displaying YUME ad", exception);
                }
            }

            
            {
                a = YuMeVideoActivity.this;
                super();
            }
        };
    }

    static void a(YuMeVideoActivity yumevideoactivity)
    {
        yumevideoactivity.s();
    }

    static void b(YuMeVideoActivity yumevideoactivity)
    {
        yumevideoactivity.q();
    }

    static void c(YuMeVideoActivity yumevideoactivity)
    {
        yumevideoactivity.t();
    }

    static FrameLayout d(YuMeVideoActivity yumevideoactivity)
    {
        return yumevideoactivity.q;
    }

    private void d(int i)
    {
        switch (i)
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
            t();
            break;
        }
    }

    static s e(YuMeVideoActivity yumevideoactivity)
    {
        return yumevideoactivity.o;
    }

    private void n()
    {
        p();
        o();
    }

    private void o()
    {
        if (p != null)
        {
            p.addView(q);
        }
    }

    private void p()
    {
        if (p != null)
        {
            p.removeView(q);
        }
    }

    private void q()
    {
        Rect rect = new Rect();
        Object obj = getWindow();
        ((Window) (obj)).getDecorView().getWindowVisibleDisplayFrame(rect);
        int j = rect.top;
        int k = ((Window) (obj)).findViewById(0x1020002).getTop();
        int i;
        if (k > 0)
        {
            i = k - j;
        } else
        {
            i = 0;
        }
        if (k == 0)
        {
            j = 0;
        }
        obj = ((WindowManager)getSystemService("window")).getDefaultDisplay();
        if (rect.bottom < ((Display) (obj)).getHeight())
        {
            A = i;
            return;
        } else
        {
            A = j + i;
            return;
        }
    }

    private void r()
    {
        if (z == null)
        {
            z = new Timer();
            z.schedule(new TimerTask() {

                final YuMeVideoActivity a;

                public void run()
                {
                    com.pandora.android.activity.YuMeVideoActivity.a(a);
                }

            
            {
                a = YuMeVideoActivity.this;
                super();
            }
            }, 50);
        }
    }

    private void s()
    {
        m();
        runOnUiThread(D);
    }

    private void t()
    {
        Display display = getWindowManager().getDefaultDisplay();
        int i = display.getWidth();
        int j = display.getHeight();
        if (p != null)
        {
            p.setPadding(0, 0, 0, 0);
        }
        if (q != null)
        {
            Object obj = q.getLayoutParams();
            if (obj == null)
            {
                obj = new android.widget.FrameLayout.LayoutParams(i, j - A);
            } else
            {
                obj.width = i;
                obj.height = j - A;
            }
            q.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        }
    }

    protected void a(Context context, Intent intent, String s1)
    {
    }

    protected void e(String s1)
    {
    }

    protected IntentFilter l()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.SCREEN_OFF");
        registerReceiver(E, intentfilter);
        B = true;
        return null;
    }

    void m()
    {
        if (z != null)
        {
            z.cancel();
            z = null;
        }
    }

    public void onAutomotiveAccessory(e e1)
    {
        if (e1.a == p.dd.e.a.a)
        {
            o.d();
            o.a(true);
        }
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        C = true;
        o.c();
        o.a(true);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        d(configuration.orientation);
    }

    public void onCreate(Bundle bundle)
    {
        setTheme(0x103000a);
        requestWindowFeature(3);
        super.onCreate(bundle);
        o = com.pandora.android.ads.s.b.a();
        p = new RelativeLayout(this);
        if (p != null)
        {
            bundle = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            p.setLayoutParams(bundle);
        }
        q = new FrameLayout(this);
        if (q != null)
        {
            bundle = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            q.setLayoutParams(bundle);
        }
        setContentView(p);
        n();
        o.a(this);
        r();
    }

    public void onDestroy()
    {
        if (B)
        {
            unregisterReceiver(E);
            B = false;
        }
        super.onDestroy();
    }

    public void onPause()
    {
        super.onPause();
        if (!C)
        {
            o.d();
            o.a(true);
        }
    }

    public boolean onSearchRequested()
    {
        return false;
    }
}
