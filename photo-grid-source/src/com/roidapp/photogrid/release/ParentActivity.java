// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.NotificationManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.roidapp.baselib.c.b;
import com.roidapp.cloudlib.a.a;
import com.roidapp.cloudlib.ads.l;
import com.roidapp.cloudlib.ads.s;
import com.roidapp.cloudlib.al;
import com.roidapp.photogrid.a.m;
import com.roidapp.photogrid.b.e;
import com.roidapp.photogrid.common.an;

// Referenced classes of package com.roidapp.photogrid.release:
//            qi

public abstract class ParentActivity extends FragmentActivity
{

    private ImageView a;
    private boolean b;
    private boolean c;
    private l d;
    private long e;
    private long f;
    private boolean g;
    private int h;
    protected String t;
    protected LinearLayout u;
    protected boolean v;
    protected boolean w;
    public com.roidapp.photogrid.filter.selfiecam.a x;

    public ParentActivity()
    {
        t = "";
        v = false;
        w = true;
        b = false;
    }

    protected final int A()
    {
        return Math.round((float)(f - e) / 1000F);
    }

    protected boolean B()
    {
        return false;
    }

    protected final void C()
    {
        if (!c)
        {
            c = true;
            x();
            if (!v)
            {
                u = (LinearLayout)findViewById(0x7f0d0086);
                a = (ImageView)findViewById(0x7f0d0087);
                if (a != null)
                {
                    a.setVisibility(8);
                }
                d = al.g().d(this, t);
                if (d != null)
                {
                    d.a(this, u, o_());
                    return;
                } else
                {
                    D();
                    return;
                }
            }
        }
    }

    final void D()
    {
        RelativeLayout relativelayout = (RelativeLayout)findViewById(0x7f0d0085);
        if (relativelayout != null)
        {
            relativelayout.setVisibility(8);
        }
    }

    public final boolean E()
    {
        return h != 7;
    }

    public final boolean F()
    {
        if (E())
        {
            h = 7;
            PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit().putInt("unlockedRes", h).apply();
            return true;
        } else
        {
            return false;
        }
    }

    public String c()
    {
        return null;
    }

    public final boolean h()
    {
        return b;
    }

    protected String o_()
    {
        return "ca-app-pub-7109791911060569/9716033936";
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        b = false;
        if (i == 16 || i == 32)
        {
            qi qi1 = (qi)getSupportFragmentManager().findFragmentByTag("PremiumDialog");
            if (qi1 != null)
            {
                qi1.onActivityResult(i, j, intent);
            } else
            {
                super.onActivityResult(i, j, intent);
            }
        }
        super.onActivityResult(i, j, intent);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        b = false;
        an.b(this, an.a(this));
        boolean flag;
        if (m.a(this) == 1)
        {
            flag = false;
        } else
        if (!com.roidapp.cloudlib.a.a.a(this).a("ad", "adColonyEnable", true))
        {
            flag = false;
        } else
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (flag)
        {
            s.a(this);
        } else
        {
            s.a();
        }
        if (c() != null)
        {
            bundle = String.format("page_name=%s", new Object[] {
                (new StringBuilder()).append(c()).append("_View").toString()
            });
            com.roidapp.photogrid.b.e.a();
            com.cm.kinfoc.s.a().a("grid_adpage_view", bundle);
        }
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (u != null)
        {
            u.removeAllViews();
        }
        if (d != null)
        {
            d.d();
            d.c();
            d = null;
        }
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        b = false;
    }

    protected void onPause()
    {
        com.roidapp.baselib.f.a.b = false;
        super.onPause();
        if (d != null)
        {
            d.a();
        }
        s.b();
    }

    protected void onResume()
    {
        com.roidapp.baselib.f.a.b = true;
        NotificationManager notificationmanager = (NotificationManager)getSystemService("notification");
        if (notificationmanager != null)
        {
            notificationmanager.cancelAll();
        }
        if (!B())
        {
            C();
        }
        super.onResume();
        if (d != null)
        {
            d.b();
        }
        s.b(this);
        b = false;
        if (g)
        {
            setRequestedOrientation(1);
            g = false;
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        b = true;
        super.onSaveInstanceState(bundle);
    }

    protected void onStart()
    {
        super.onStart();
        b = false;
        e = System.currentTimeMillis();
        com.roidapp.baselib.c.b.b(this);
    }

    protected void onStop()
    {
        b = true;
        super.onStop();
        f = System.currentTimeMillis();
        com.roidapp.baselib.c.b.c(this);
    }

    public abstract void x();
}
