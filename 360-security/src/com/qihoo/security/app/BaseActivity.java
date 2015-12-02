// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.f;
import android.support.v4.content.g;
import android.support.v4.view.j;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.support.ScreenAnalytics;
import com.qihoo.security.ui.fragment.utils.FragmentAction;
import com.qihoo.security.v7.MaterialMenuView;
import com.qihoo360.mobilesafe.b.a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

public abstract class BaseActivity extends ActionBarActivity
    implements com.qihoo.security.ui.fragment.BaseFragment.b
{
    protected static final class a extends Handler
    {

        private final WeakReference a;

        public void handleMessage(Message message)
        {
            if (a != null && a.get() != null && message != null)
            {
                ((BaseActivity)a.get()).a(message);
            }
        }

        public a(BaseActivity baseactivity)
        {
            a = new WeakReference(baseactivity);
        }
    }


    private LocaleTextView A;
    private View B;
    private final BroadcastReceiver C = new BroadcastReceiver() {

        final BaseActivity a;

        public void onReceive(Context context, Intent intent)
        {
            a.finish();
        }

            
            {
                a = BaseActivity.this;
                super();
            }
    };
    public d o;
    public Context p;
    protected MaterialMenuView q;
    protected ActionBar r;
    protected f s;
    protected boolean t;
    protected boolean u;
    protected boolean v;
    protected a w;
    protected g x;
    private boolean y;
    private boolean z;

    public BaseActivity()
    {
        y = false;
        o = d.a();
        p = SecurityApplication.a();
        z = false;
        t = true;
        u = true;
        v = false;
    }

    private void a(int i1, int j1)
    {
        if (t && android.os.Build.VERSION.SDK_INT >= 19)
        {
            int k1 = com.qihoo360.mobilesafe.b.a.c(p);
            ViewGroup viewgroup = (ViewGroup)getWindow().getDecorView();
            android.support.v4.widget.DrawerLayout.LayoutParams layoutparams = new android.support.v4.widget.DrawerLayout.LayoutParams(-1, k1);
            layoutparams.a = 48;
            B = new View(p);
            c(j1);
            B.setLayoutParams(layoutparams);
            viewgroup.addView(B);
            View view = new View(p);
            view.setBackgroundColor(i1);
            view.setLayoutParams(layoutparams);
            viewgroup.addView(view);
        }
    }

    private void o()
    {
        if (android.os.Build.VERSION.SDK_INT < 19) goto _L2; else goto _L1
_L1:
        Window window;
        android.view.WindowManager.LayoutParams layoutparams;
        window = getWindow();
        layoutparams = window.getAttributes();
        Field field;
        int i1;
        try
        {
            field = android/view/WindowManager$LayoutParams.getDeclaredField("FLAG_TRANSLUCENT_STATUS");
        }
        catch (Exception exception)
        {
            i1 = 0;
            continue; /* Loop/switch isn't completed */
        }
        if (field == null) goto _L4; else goto _L3
_L3:
        i1 = ((Integer)field.get((Object)null)).intValue();
_L6:
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        layoutparams.flags = i1 | layoutparams.flags;
        window.setAttributes(layoutparams);
_L2:
        if (t)
        {
            a(getResources().getColor(0x7f080020), getResources().getColor(0x7f080056));
            return;
        } else
        {
            i1 = getResources().getColor(0x7f08001f);
            a(i1, i1);
            return;
        }
        Throwable throwable;
        throwable;
        if (true) goto _L2; else goto _L4
_L4:
        i1 = 0;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void a(Drawable drawable)
    {
        if (r != null && drawable != null)
        {
            r.a(drawable);
            drawable = r.b();
            r.a("");
            if (drawable == null)
            {
                r.a("");
            } else
            {
                r.a(drawable);
            }
            r.d(false);
            r.d(true);
        }
    }

    protected void a(Message message)
    {
    }

    protected void a(Menu menu, int i1, int j1)
    {
        if (menu != null)
        {
            menu = menu.findItem(i1);
            android.support.v4.view.j.b(menu, 0x7f030000);
            ImageView imageview = (ImageView)android.support.v4.view.j.a(menu);
            imageview.setImageResource(j1);
            imageview.setOnClickListener(new android.view.View.OnClickListener(menu) {

                final MenuItem a;
                final BaseActivity b;

                public void onClick(View view)
                {
                    b.onOptionsItemSelected(a);
                }

            
            {
                b = BaseActivity.this;
                a = menuitem;
                super();
            }
            });
        }
    }

    public void a(FragmentAction fragmentaction, Bundle bundle)
    {
    }

    protected void a(com.qihoo.security.v7.MaterialMenuDrawable.IconState iconstate)
    {
        if (r != null && q != null)
        {
            q.setState(iconstate);
        }
    }

    protected void b(int i1)
    {
        b(d.a().a(i1));
    }

    protected void b(Drawable drawable)
    {
        if (android.os.Build.VERSION.SDK_INT >= 19 && B != null)
        {
            B.setBackgroundDrawable(drawable);
        }
    }

    protected void b(String s1)
    {
label0:
        {
            if (r != null && A != null)
            {
                A.setVisibility(0);
                if (TextUtils.isEmpty(s1))
                {
                    break label0;
                }
                A.setLocalText(s1);
            }
            return;
        }
        A.setLocalText("");
    }

    protected void b(boolean flag)
    {
        ImageView imageview = (ImageView)r.a().findViewById(0x7f0b0215);
        int i1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        if (imageview != null)
        {
            imageview.setVisibility(i1);
        }
    }

    protected void c(int i1)
    {
        if (android.os.Build.VERSION.SDK_INT >= 19 && B != null)
        {
            B.setBackgroundColor(i1);
        }
    }

    protected String i()
    {
        return getClass().getSimpleName();
    }

    protected void j()
    {
        r = f();
        if (r == null)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        Object obj;
        r.d(false);
        r.e(true);
        r.a(false);
        r.b(false);
        obj = com.qihoo.security.ui.b.a.a().b(0x7f03009f);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        r.a(0x7f03009f);
_L2:
        Object obj1 = r.a();
        q = (MaterialMenuView)((View) (obj1)).findViewById(0x7f0b0213);
        obj = (ImageView)((View) (obj1)).findViewById(0x7f0b0214);
        a(com.qihoo.security.v7.MaterialMenuDrawable.IconState.ARROW);
        ((ImageView) (obj)).setVisibility(8);
        A = (LocaleTextView)((View) (obj1)).findViewById(0x7f0b0216);
        obj1 = new android.view.View.OnClickListener() {

            final BaseActivity a;

            public void onClick(View view)
            {
                a.n();
            }

            
            {
                a = BaseActivity.this;
                super();
            }
        };
        q.setOnClickListener(((android.view.View.OnClickListener) (obj1)));
        ((ImageView) (obj)).setOnClickListener(((android.view.View.OnClickListener) (obj1)));
        return;
        android.support.v7.app.ActionBar.LayoutParams layoutparams = new android.support.v7.app.ActionBar.LayoutParams(-1, -2);
        r.a(((com.qihoo.security.ui.b.a.f) (obj)).b, layoutparams);
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        r = null;
    }

    protected void k()
    {
        if (t && android.os.Build.VERSION.SDK_INT > 10) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (r == null) goto _L4; else goto _L3
_L3:
        int i1;
        int j1;
        j1 = p.getResources().getDimensionPixelSize(0x7f09001c);
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        i1 = com.qihoo360.mobilesafe.b.a.c(p);
_L9:
        View view = ((ViewGroup)findViewById(0x1020002)).getChildAt(0);
        if (view == null) goto _L1; else goto _L5
_L5:
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams;
        marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        if (!v)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        marginlayoutparams.topMargin = i1;
_L6:
        if (!u)
        {
            marginlayoutparams.topMargin = 0;
        }
        view.setLayoutParams(marginlayoutparams);
        return;
        try
        {
            marginlayoutparams.topMargin = i1 + j1;
        }
        catch (Exception exception)
        {
            return;
        }
          goto _L6
_L4:
        p.getResources();
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        i1 = com.qihoo360.mobilesafe.b.a.c(p);
_L8:
        view = ((ViewGroup)findViewById(0x1020002)).getChildAt(0);
        if (view == null) goto _L1; else goto _L7
_L7:
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams1 = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        marginlayoutparams1.topMargin = i1;
        if (!u)
        {
            marginlayoutparams1.topMargin = 0;
        }
        view.setLayoutParams(marginlayoutparams1);
        return;
        i1 = 0;
          goto _L8
        i1 = 0;
          goto _L9
    }

    protected void l()
    {
        ScreenAnalytics screenanalytics = (ScreenAnalytics)getClass().getAnnotation(com/qihoo/security/support/ScreenAnalytics);
    }

    protected void m()
    {
        y = true;
        x.a(C, new IntentFilter("com.qihoo.security.ACTION_FINISH"));
    }

    protected void n()
    {
        onBackPressed();
    }

    public void onBackPressed()
    {
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        z = true;
        super.onCreate(bundle);
        com.qihoo.security.profile.j.a().a(-1, 3, i());
        com.qihoo.security.service.d.a(getClass().getSimpleName(), Integer.valueOf(getClass().hashCode()));
        j();
        if (u)
        {
            o();
        }
        s = e();
        w = new a(this);
        x = g.a(p);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        com.qihoo.security.service.d.b(getClass().getSimpleName(), Integer.valueOf(getClass().hashCode()));
        if (y)
        {
            x.a(C);
        }
        w.removeCallbacksAndMessages(null);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR tableswitch 16908332 16908332: default 24
    //                   16908332 30;
           goto _L1 _L2
_L1:
        return super.onOptionsItemSelected(menuitem);
_L2:
        onBackPressed();
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void onPause()
    {
        z = false;
        super.onPause();
        com.qihoo.security.profile.j.a().a(-1, 4, i());
    }

    protected void onResume()
    {
        k();
        z = true;
        l();
        super.onResume();
    }

    protected void onStart()
    {
        z = true;
        super.onStart();
    }

    public void setTitleColor(int i1)
    {
        A.setTextColor(i1);
        q.setColor(i1);
    }
}
