// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.h;
import android.support.v4.app.k;
import android.view.View;
import android.view.ViewGroup;
import com.pandora.android.util.p;
import p.ca.ad;
import p.ca.ak;
import p.ca.ap;
import p.ca.r;
import p.ca.x;
import p.df.a;

// Referenced classes of package com.pandora.android.activity:
//            BaseAdFragmentActivity, d, e

public class BaseHomeActivity extends BaseAdFragmentActivity
    implements d
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static final a e[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/pandora/android/activity/BaseHomeActivity$a, s1);
        }

        public static a[] values()
        {
            return (a[])e.clone();
        }

        static 
        {
            a = new a("STATIONS", 0);
            b = new a("FEED", 1);
            c = new a("PROFILE", 2);
            d = new a("SETTINGS", 3);
            e = (new a[] {
                a, b, c, d
            });
        }

        private a(String s1, int i)
        {
            super(s1, i);
        }
    }


    protected a A;
    protected h o;
    protected View p;
    protected x z;

    public BaseHomeActivity()
    {
    }

    public static a a(p p1)
    {
        if (p1 == null)
        {
            return null;
        }
        static class _cls2
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[a.values().length];
                try
                {
                    b[com.pandora.android.activity.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror29) { }
                try
                {
                    b[a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror28) { }
                try
                {
                    b[a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror27) { }
                try
                {
                    b[a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror26) { }
                a = new int[com.pandora.android.util.p.values().length];
                try
                {
                    a[p.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror25) { }
                try
                {
                    a[p.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror24) { }
                try
                {
                    a[p.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror23) { }
                try
                {
                    a[p.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror22) { }
                try
                {
                    a[p.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror21) { }
                try
                {
                    a[p.f.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror20) { }
                try
                {
                    a[p.h.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror19) { }
                try
                {
                    a[p.i.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    a[p.j.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    a[p.k.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    a[p.n.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    a[p.m.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    a[p.q.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    a[p.p.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    a[p.o.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    a[p.l.ordinal()] = 16;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    a[p.u.ordinal()] = 17;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[p.r.ordinal()] = 18;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[p.s.ordinal()] = 19;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[p.t.ordinal()] = 20;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[p.v.ordinal()] = 21;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[p.w.ordinal()] = 22;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[p.z.ordinal()] = 23;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.x.ordinal()] = 24;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.y.ordinal()] = 25;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.A.ordinal()] = 26;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.pandora.android.activity._cls2.a[p1.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
            return com.pandora.android.activity.a.a;

        case 9: // '\t'
        case 10: // '\n'
            return a.b;

        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
            return a.c;

        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
        case 23: // '\027'
        case 24: // '\030'
        case 25: // '\031'
        case 26: // '\032'
            return a.d;
        }
    }

    private void c(Intent intent)
    {
        Object obj;
        Object obj1;
        if (intent == null)
        {
            p.df.a.a("BaseHomeActivity", "handleIntent() --> Intent was null.");
            return;
        }
        if (intent.getExtras() == null)
        {
            p.df.a.a("BaseHomeActivity", "handleIntent() --> Intent missing extras.");
            setIntent(null);
            return;
        }
        obj = (p)intent.getSerializableExtra("intent_page_name");
        obj1 = a(((p) (obj)));
        if (obj1 == null)
        {
            p.df.a.a("BaseHomeActivity", "handleIntent() --> Missing or unrecognized INTENT_PAGE.");
            setIntent(null);
            return;
        }
        _cls2.b[((a) (obj1)).ordinal()];
        JVM INSTR tableswitch 1 4: default 104
    //                   1 131
    //                   2 213
    //                   3 223
    //                   4 233;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Invalid HomeSection ").append(obj1).toString());
_L2:
        obj = com.pandora.android.activity.e.a(this, ((p) (obj)), intent);
_L7:
        if (A != obj1)
        {
            a(((a) (obj1)));
            Fragment fragment = (Fragment)z;
            Bundle bundle = fragment.getArguments();
            obj1 = bundle;
            if (bundle == null)
            {
                obj1 = new Bundle();
            }
            ((Bundle) (obj1)).putAll(intent.getExtras());
            fragment.setArguments(((Bundle) (obj1)));
        }
        if (obj != null)
        {
            a(((x) (obj)));
        }
        setIntent(null);
        return;
_L3:
        obj = e.b(this, ((p) (obj)), intent);
        continue; /* Loop/switch isn't completed */
_L4:
        obj = e.c(this, ((p) (obj)), intent);
        continue; /* Loop/switch isn't completed */
_L5:
        obj = e.d(this, ((p) (obj)), intent);
        if (true) goto _L7; else goto _L6
_L6:
    }

    public int a(x x1)
    {
        String s1 = x1.getClass().getName();
        k k1 = o.a();
        k1.b(0x7f100199, (Fragment)x1, s1);
        if (z != null)
        {
            k1.b((Fragment)z);
        }
        k1.a(s1);
        k1.b();
        z = x1;
        p.df.a.a("BaseHomeActivity", "addFragment() --> %s [%d]", new Object[] {
            x1.getClass().getSimpleName(), Integer.valueOf(x1.hashCode())
        });
        return o.e();
    }

    protected void a(a a1)
    {
        _cls2.b[a1.ordinal()];
        JVM INSTR tableswitch 1 4: default 40
    //                   1 67
    //                   2 96
    //                   3 107
    //                   4 114;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Invalid HomeSection ").append(a1).toString());
_L2:
        Object obj = new ap();
_L7:
        o.a(null, 1);
        A = a1;
        a(((x) (obj)));
        return;
_L3:
        obj = new r();
        continue; /* Loop/switch isn't completed */
_L4:
        obj = p.ca.ad.o_();
        continue; /* Loop/switch isn't completed */
_L5:
        obj = new ak();
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void a(com.pandora.android.ads.h.b b)
    {
    }

    protected boolean a(Context context, Intent intent)
    {
        if (z != null)
        {
            return z.a(intent);
        } else
        {
            return super.a(context, intent);
        }
    }

    protected CharSequence ad()
    {
        CharSequence charsequence;
        CharSequence charsequence1;
        if (z != null && ((Fragment)z).isAdded())
        {
            charsequence = z.d();
        } else
        {
            charsequence = null;
        }
        charsequence1 = charsequence;
        if (charsequence == null)
        {
            charsequence1 = getTitle();
        }
        return charsequence1;
    }

    public void ae()
    {
        setTitle(ad());
    }

    protected boolean af()
    {
        boolean flag = false;
        boolean flag1;
        if (z != null)
        {
            flag1 = z.i();
        } else
        {
            flag1 = false;
        }
        if (o.e() > 1)
        {
            flag = true;
        }
        return flag1 | flag;
    }

    public void ag()
    {
        boolean flag = af();
        f(flag);
        g(flag);
    }

    protected int m()
    {
        return 0;
    }

    protected ViewGroup n()
    {
        return null;
    }

    protected int o()
    {
        return 0;
    }

    public void onBackPressed()
    {
        if (z != null && z.c())
        {
            return;
        }
        if (o.e() > 1)
        {
            r();
            return;
        } else
        {
            finish();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        o = f();
        o.a(new android.support.v4.app.h.b() {

            final BaseHomeActivity a;

            public void a()
            {
                a.v();
            }

            
            {
                a = BaseHomeActivity.this;
                super();
            }
        });
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    protected void onResume()
    {
        super.onResume();
        c(getIntent());
    }

    protected void onStart()
    {
        super.onStart();
        if (p != null)
        {
            p = findViewById(0x7f100199);
            if (p == null)
            {
                throw new IllegalStateException("Could not find home_fragment_container.");
            }
        }
    }

    protected ViewGroup p()
    {
        return null;
    }

    public void r()
    {
        int i = o.e();
        if (i > 1)
        {
            android.support.v4.app.h.a a1 = o.b(i - 2);
            z = (x)o.a(a1.d());
        } else
        {
            z = null;
        }
        o.c();
        p.df.a.a("BaseHomeActivity", "removeFragment()");
    }

    public void s()
    {
    }

    public boolean t()
    {
        return false;
    }

    public Point u()
    {
        return null;
    }

    protected void v()
    {
        ag();
        ae();
    }
}
