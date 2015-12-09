// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.h;
import android.support.v4.app.k;
import android.view.View;
import android.view.ViewGroup;
import com.pandora.android.ads.AdView;
import com.pandora.android.ads.c;
import com.pandora.android.ads.g;
import com.pandora.radio.data.ag;
import com.pandora.radio.data.aj;
import p.ca.b;
import p.dg.i;

// Referenced classes of package com.pandora.android.activity:
//            BaseFragmentActivity, PandoraIntentFilter, PandoraIntent

public abstract class BaseAdFragmentActivity extends BaseFragmentActivity
    implements com.pandora.android.ads.AdView.b
{

    private ViewGroup A;
    private KeyguardManager B;
    private boolean C;
    private boolean D;
    private int o;
    private g p;
    protected boolean q;
    private com.pandora.android.ads.h z;

    public BaseAdFragmentActivity()
    {
        D = false;
    }

    private void b(com.pandora.android.ads.h h1)
    {
        b b1;
label0:
        {
            b1 = (b)f().a("ADVIEW_STORAGE_FRAGMENT");
            if (b1 != null)
            {
                boolean flag;
                if (((View)h1).getVisibility() == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    break label0;
                }
                h1.b();
                b1.b(h1);
            }
            return;
        }
        h1.a(null, m());
        b1.b(null);
    }

    private com.pandora.android.ads.h r()
    {
        b b1 = (b)f().a("ADVIEW_STORAGE_FRAGMENT");
        if (b1 == null)
        {
            return null;
        } else
        {
            return b1.b();
        }
    }

    public void A()
    {
        C = true;
    }

    protected PandoraIntentFilter B()
    {
        PandoraIntentFilter pandoraintentfilter = new PandoraIntentFilter();
        pandoraintentfilter.a("keep_sample_playing");
        return pandoraintentfilter;
    }

    public int C()
    {
        return o;
    }

    public BaseAdFragmentActivity D()
    {
        return this;
    }

    public boolean E()
    {
        return s;
    }

    public boolean F()
    {
        return true;
    }

    public boolean G()
    {
        return true;
    }

    public void H()
    {
        p.b(o);
    }

    protected boolean I()
    {
        return B.inKeyguardRestrictedInputMode();
    }

    protected boolean J()
    {
        return false;
    }

    protected void a(Context context, Intent intent, String s)
    {
        if (s.equals(PandoraIntent.a("keep_sample_playing")))
        {
            q = false;
        }
    }

    protected void a(Bundle bundle)
    {
        if (bundle == null && J())
        {
            bundle = p.ca.b.a();
            f().a().a(bundle, "ADVIEW_STORAGE_FRAGMENT").b();
        }
    }

    public void a(com.pandora.android.ads.h.b b1, int j, int i1, boolean flag, boolean flag1)
    {
        if (j != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        ViewGroup viewgroup = n();
        if (b1 != com.pandora.android.ads.h.b.b)
        {
            break; /* Loop/switch isn't completed */
        }
        if (A == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        b1 = n().getLayoutParams();
        b1.height = -1;
        b1.width = -1;
        if (flag)
        {
            if (b1 instanceof android.widget.RelativeLayout.LayoutParams)
            {
                ((android.widget.RelativeLayout.LayoutParams)b1).addRule(2, 0);
            }
            A.setBackgroundColor(0);
        } else
        {
            if (b1 instanceof android.widget.RelativeLayout.LayoutParams)
            {
                ((android.widget.RelativeLayout.LayoutParams)b1).addRule(2, o());
            }
            if (p.a() == 1)
            {
                A.setBackgroundColor(0xff000000);
            } else
            {
                A.setBackgroundColor(0);
            }
            ((View)z).findViewById(0x7f1000a5).setBackgroundColor(0);
        }
        viewgroup.setLayoutParams(b1);
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        e(true);
        return;
    }

    protected void a(com.pandora.android.ads.h h1)
    {
    }

    public void a(com.pandora.radio.util.k.a a1)
    {
        z.b(a1);
    }

    public void a(String s, boolean flag)
    {
        p.a(o, s, flag);
    }

    protected void b(Bundle bundle)
    {
        B = (KeyguardManager)getSystemService("keyguard");
        A = p();
        if (z == null)
        {
            bundle = r();
            if (bundle == null)
            {
                z = w();
                z.a(this, m());
                ((View)z).setVisibility(8);
                D = false;
            } else
            {
                z = bundle;
                z.d();
                a(z);
                z.a(this, m());
                z.a();
                D = true;
            }
        }
        o = p.a(this, z, m());
    }

    public void d(boolean flag)
    {
        int j = m();
        if (j != p.a())
        {
            if (z != null)
            {
                z.setZone(j);
                p.c(o);
                p.d(o);
                o = p.a(this, z, j);
            }
            if (E())
            {
                p.a(o);
            }
        } else
        if (flag)
        {
            z.b(null);
            return;
        }
    }

    public void e(boolean flag)
    {
        if (A != null)
        {
            ViewGroup viewgroup = A;
            int j;
            if (flag)
            {
                j = 0;
            } else
            {
                j = 8;
            }
            viewgroup.setVisibility(j);
        }
    }

    protected IntentFilter l()
    {
        return B();
    }

    protected abstract int m();

    protected abstract ViewGroup n();

    protected abstract int o();

    protected void onActivityResult(int j, int i1, Intent intent)
    {
        switch (j)
        {
        default:
            super.onActivityResult(j, i1, intent);
            return;

        case 124: // '|'
        case 125: // '}'
            C = true;
            break;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        p = c.b();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        b(z);
        if (z != null)
        {
            z.o();
            if (isFinishing())
            {
                z.a(null, -1);
            }
        }
        if (p != null)
        {
            p.d(o);
        }
        o = 0;
    }

    protected void onPause()
    {
        super.onPause();
        if (z != null)
        {
            z.m();
        }
        if (p != null)
        {
            p.c(o);
        }
        if (A != null && z != null)
        {
            A.removeView((View)z);
        }
        if (q)
        {
            com.pandora.android.provider.b.a.b().f().b();
            return;
        } else
        {
            q = true;
            return;
        }
    }

    protected void onResume()
    {
        super.onResume();
        x();
    }

    protected abstract ViewGroup p();

    protected boolean q()
    {
        return !C && !D;
    }

    protected com.pandora.android.ads.h w()
    {
        return new AdView(this);
    }

    protected void x()
    {
        if (z != null)
        {
            z.n();
        }
        p.a(o);
        if (A != null && z != null)
        {
            A.addView((View)z, 0);
        }
        aj aj1 = com.pandora.android.provider.b.a.b().k().J();
        boolean flag;
        if (C && aj1 != null && aj1.g())
        {
            flag = true;
        } else
        if (t() && q() && !I() && !com.pandora.android.util.k.a().c())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            a("return", true);
        }
        C = false;
        D = false;
        q = true;
    }

    protected void y()
    {
        z.a();
    }

    protected boolean z()
    {
        return D;
    }
}
