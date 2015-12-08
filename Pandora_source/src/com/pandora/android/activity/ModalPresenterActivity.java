// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v4.app.h;
import android.support.v4.app.k;
import android.view.View;
import android.view.ViewGroup;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import p.ca.o;
import p.df.a;

// Referenced classes of package com.pandora.android.activity:
//            BaseAdFragmentActivity

public class ModalPresenterActivity extends BaseAdFragmentActivity
{

    private o o;

    public ModalPresenterActivity()
    {
        o = null;
    }

    private boolean v()
    {
        if (o != null)
        {
            return true;
        }
        Object obj1 = getIntent();
        Object obj = (Class)((Intent) (obj1)).getSerializableExtra("intent_modal_presenter_fragment_class");
        Object obj3 = f();
        Object obj2 = ((h) (obj3)).a();
        o = (o)((h) (obj3)).a(((Class) (obj)).getCanonicalName());
        String s1;
        int i;
        int j;
        int l;
        boolean flag;
        if (o == null)
        {
            try
            {
                o = (o)((Class) (obj)).newInstance();
            }
            catch (InstantiationException instantiationexception)
            {
                p.df.a.b("ModalPresenterActivity", "Failed to load fragment", instantiationexception);
            }
            catch (IllegalAccessException illegalaccessexception)
            {
                p.df.a.b("ModalPresenterActivity", "Failed to load fragment", illegalaccessexception);
            }
            if (o == null)
            {
                return false;
            }
            o.setArguments(getIntent().getExtras());
            o.setRetainInstance(true);
            ((k) (obj2)).a(0x7f1000c9, o, ((Class) (obj)).getCanonicalName());
            ((k) (obj2)).b();
        } else
        {
            ((k) (obj2)).c(o);
        }
        if (!com.pandora.android.util.s.u())
        {
            findViewById(0x7f1000c9).setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        }
        flag = ((Intent) (obj1)).getBooleanExtra("intent_modal_presenter_show_header", false);
        i = ((Intent) (obj1)).getIntExtra("intent_modal_presenter_header_color", getResources().getColor(0x7f0b005a));
        j = ((Intent) (obj1)).getIntExtra("intent_modal_presenter_footer_color", getResources().getColor(0x7f0b005a));
        l = ((Intent) (obj1)).getIntExtra("intent_modal_presenter_header_divider_color", getResources().getColor(0x7f0b005b));
        if (o.n())
        {
            findViewById(0x7f1001b3).setBackgroundColor(j);
        } else
        {
            findViewById(0x7f1001b3).setVisibility(8);
        }
        findViewById(0x7f100193).setBackgroundColor(l);
        illegalaccessexception = ((Intent) (obj1)).getStringExtra("intent_title");
        s1 = ((Intent) (obj1)).getStringExtra("intent_modal_presenter_right_button_title");
        if (s1 == null)
        {
            obj = com.pandora.android.view.HeaderLayout.a.a;
        } else
        {
            obj = com.pandora.android.view.HeaderLayout.a.f;
        }
        obj2 = (com.pandora.android.view.HeaderLayout.a)((Intent) (obj1)).getSerializableExtra("intent_modal_presenter_left_button_type");
        obj1 = obj2;
        if (obj2 == null)
        {
            obj1 = com.pandora.android.view.HeaderLayout.a.a;
        }
        obj = (new p.bz.i.a()).a(com.pandora.android.view.HeaderLayout.d.b).a(((com.pandora.android.view.HeaderLayout.a) (obj1))).a(((com.pandora.android.view.HeaderLayout.a) (obj)), s1).a(com.pandora.android.view.HeaderLayout.b.c).a(illegalaccessexception).a(flag).a(i).a();
        b.a.e().a(obj);
        return true;
    }

    protected boolean J()
    {
        if (o == null)
        {
            return false;
        } else
        {
            return o.o();
        }
    }

    public void a(com.pandora.android.ads.h.b b1)
    {
    }

    public void ignoreClick(View view)
    {
    }

    protected void k()
    {
    }

    public int m()
    {
        return o.l_();
    }

    public ViewGroup n()
    {
        return o.j();
    }

    public int o()
    {
        return o.k();
    }

    public void onBackPressed()
    {
        if (o.f_())
        {
            o.a(0);
        }
    }

    public void onBackgroundClicked(View view)
    {
        if (o.e_())
        {
            o.a(0);
        }
    }

    protected void onCreate(Bundle bundle)
    {
        int i;
        if (com.pandora.android.util.s.u())
        {
            i = 0x7f0d008f;
        } else
        {
            i = 0x7f0d0078;
        }
        setTheme(i);
        super.onCreate(bundle);
        setContentView(0x7f040066);
        v();
        a(bundle);
    }

    public void onHeaderButtonEvent(p.bz.h h1)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.pandora.android.view.HeaderLayout.a.values().length];
                try
                {
                    a[com.pandora.android.view.HeaderLayout.a.f.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[com.pandora.android.view.HeaderLayout.a.e.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.pandora.android.view.HeaderLayout.a.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.pandora.android.view.HeaderLayout.a.c.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.pandora.android.view.HeaderLayout.a.d.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.pandora.android.view.HeaderLayout.a.a.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.pandora.android.activity._cls1.a[h1.b.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            o.a(null);
            return;

        case 2: // '\002'
            s();
            break;
        }
    }

    protected void onPause()
    {
        q = false;
        super.onPause();
    }

    public void onResume()
    {
        boolean flag = super.q();
        super.onResume();
        String s1 = o.m();
        if (s1 != null && !I() && flag)
        {
            a(s1, true);
        }
    }

    protected ViewGroup p()
    {
        return o.l();
    }

    protected boolean q()
    {
        return false;
    }

    public void r()
    {
        if (m() != -1)
        {
            b(null);
        }
    }

    public void s()
    {
        setResult(-1);
        finish();
    }

    public boolean t()
    {
        return o.a();
    }

    public Point u()
    {
        return null;
    }
}
