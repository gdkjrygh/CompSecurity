// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.ads;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.pandora.android.provider.b;
import com.pandora.android.view.PersonalInfoAdImageView;
import com.pandora.radio.data.af;
import com.pandora.radio.util.k;
import p.bz.u;
import p.cm.an;
import p.cm.r;
import p.cw.c;
import p.l.d;
import p.l.g;

// Referenced classes of package com.pandora.android.ads:
//            c, g

public class j
{
    private static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        private static final a g[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/pandora/android/ads/j$a, s);
        }

        public static a[] values()
        {
            return (a[])g.clone();
        }

        static 
        {
            a = new a("DISPLAYING_AD", 0);
            b = new a("ASKING_PERMISSION", 1);
            c = new a("LOADING", 2);
            d = new a("CONFIRMATION", 3);
            e = new a("ERROR", 4);
            f = new a("CLOSE", 5);
            g = (new a[] {
                a, b, c, d, e, f
            });
        }

        private a(String s, int i1)
        {
            super(s, i1);
        }
    }


    private a a;
    private RelativeLayout b;
    private TextView c;
    private PersonalInfoAdImageView d;
    private TextView e;
    private TextView f;
    private LinearLayout g;
    private TextView h;
    private TextView i;
    private TextView j;
    private LinearLayout k;
    private Button l;
    private com.pandora.android.data.j m;
    private boolean n;
    private boolean o;
    private boolean p;
    private a q;
    private final com.pandora.radio.data.b r;

    public j(RelativeLayout relativelayout, com.pandora.android.data.j j1, com.pandora.radio.data.b b1)
    {
        b = relativelayout;
        m = j1;
        r = b1;
        d = (PersonalInfoAdImageView)relativelayout.findViewById(0x7f1001f5);
        g = (LinearLayout)relativelayout.findViewById(0x7f1001f6);
        f = (TextView)relativelayout.findViewById(0x7f1001f7);
        e = (TextView)relativelayout.findViewById(0x7f1001f8);
        k = (LinearLayout)relativelayout.findViewById(0x7f1001f9);
        j = (TextView)relativelayout.findViewById(0x7f1001fb);
        i = (TextView)relativelayout.findViewById(0x7f1001fc);
        h = (TextView)relativelayout.findViewById(0x7f1001fd);
        c = (TextView)relativelayout.findViewById(0x7f1001fe);
        c.setText(0x7f080211);
        c.setClickable(true);
        c.setOnClickListener(new android.view.View.OnClickListener(j1, b1) {

            final com.pandora.android.data.j a;
            final com.pandora.radio.data.b b;
            final j c;

            public void onClick(View view)
            {
                com.pandora.android.activity.a.a(j.a(c).getContext(), a.i());
                b.a.b().o().a(com.pandora.radio.util.k.h.e, b);
            }

            
            {
                c = j.this;
                a = j2;
                b = b1;
                super();
            }
        });
        l = (Button)relativelayout.findViewById(0x7f1001ff);
        l.setOnClickListener(new android.view.View.OnClickListener(j1, b1) {

            final com.pandora.android.data.j a;
            final com.pandora.radio.data.b b;
            final j c;

            public void onClick(View view)
            {
                static class _cls3
                {

                    static final int a[];

                    static 
                    {
                        a = new int[a.values().length];
                        try
                        {
                            a[a.a.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror5) { }
                        try
                        {
                            a[com.pandora.android.ads.a.b.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror4) { }
                        try
                        {
                            a[com.pandora.android.ads.a.d.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            a[a.e.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            a[com.pandora.android.ads.a.c.ordinal()] = 5;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            a[a.f.ordinal()] = 6;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                switch (_cls3.a[com.pandora.android.ads.j.b(c).ordinal()])
                {
                default:
                    throw new IllegalArgumentException((new StringBuilder()).append("Unknown state - ").append(com.pandora.android.ads.j.b(c)).toString());

                case 1: // '\001'
                    j.a(c, com.pandora.android.ads.a.b);
                    // fall through

                case 5: // '\005'
                case 6: // '\006'
                    return;

                case 2: // '\002'
                    (new an()).execute(new Object[] {
                        a.j()
                    });
                    j.a(c, com.pandora.android.ads.a.c);
                    return;

                case 3: // '\003'
                    com.pandora.android.activity.a.a(j.a(c).getContext(), a.h());
                    b.a.b().o().a(com.pandora.radio.util.k.h.f, b);
                    return;

                case 4: // '\004'
                    j.a(c, com.pandora.android.ads.a.b);
                    break;
                }
            }

            
            {
                c = j.this;
                a = j2;
                b = b1;
                super();
            }
        });
        h.setText(0x7f08020d);
        b.a.e().c(this);
    }

    static RelativeLayout a(j j1)
    {
        return j1.b;
    }

    private void a(a a1)
    {
        a = a1;
        b(a);
    }

    static void a(j j1, a a1)
    {
        j1.a(a1);
    }

    private void a(String as[])
    {
        new r(as, null, p.cm.r.b.b, null);
    }

    static a b(j j1)
    {
        return j1.a;
    }

    private void b(a a1)
    {
        _cls3.a[a1.ordinal()];
        JVM INSTR tableswitch 1 6: default 48
    //                   1 75
    //                   2 314
    //                   3 574
    //                   4 721
    //                   5 474
    //                   6 840;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown state - ").append(a1).toString());
_L2:
        p.l.g.b(b.getContext()).a(m.d()).a(d);
        g.setVisibility(0);
        f.setVisibility(0);
        f.setText(m.c());
        e.setVisibility(0);
        e.setText(m.b());
        k.setVisibility(8);
        j.setVisibility(8);
        i.setVisibility(8);
        h.setVisibility(8);
        l.setVisibility(0);
        l.setText(0x7f080240);
        if (!n)
        {
            a(m.f());
            b.a.b().o().a(com.pandora.radio.util.k.h.a, r);
            n = true;
        }
_L9:
        if (a != a.a && a != com.pandora.android.ads.a.c)
        {
            long l1 = 0L;
            if (a == com.pandora.android.ads.a.b)
            {
                l1 = 60000L;
            }
            com.pandora.android.ads.c.b().a(l1, com.pandora.android.ads.h.b.d);
        }
        if (a1 != a.f)
        {
            b.setVisibility(0);
        }
        return;
_L3:
        g.setVisibility(8);
        f.setVisibility(8);
        e.setVisibility(8);
        k.setVisibility(0);
        j.setVisibility(0);
        j.setText(0x7f080210);
        j.setTextAppearance(b.getContext(), 0x7f0d012e);
        i.setVisibility(0);
        i.setText(e());
        h.setVisibility(0);
        l.setVisibility(0);
        l.setText(0x7f08026a);
        if (!o)
        {
            a(m.g());
            b.a.b().o().a(com.pandora.radio.util.k.h.b, r);
            o = true;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        g.setVisibility(8);
        f.setVisibility(8);
        e.setVisibility(8);
        k.setVisibility(0);
        j.setVisibility(0);
        j.setText(0x7f08020f);
        j.setTextAppearance(b.getContext(), 0x7f0d012e);
        i.setVisibility(8);
        h.setVisibility(8);
        l.setVisibility(8);
        continue; /* Loop/switch isn't completed */
_L4:
        g.setVisibility(8);
        f.setVisibility(8);
        e.setVisibility(8);
        k.setVisibility(0);
        j.setText(m.a());
        j.setTextAppearance(b.getContext(), 0x7f0d012e);
        i.setVisibility(8);
        h.setVisibility(8);
        l.setVisibility(0);
        l.setText(0x7f0801b9);
        if (!p)
        {
            a(m.e());
            b.a.b().o().a(com.pandora.radio.util.k.h.c, r);
            p = true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        g.setVisibility(8);
        f.setVisibility(8);
        e.setVisibility(8);
        k.setVisibility(0);
        j.setText(0x7f08020e);
        j.setTextAppearance(b.getContext(), 0x7f0d0130);
        i.setVisibility(8);
        h.setVisibility(8);
        l.setVisibility(0);
        l.setText(0x7f080240);
        b.a.b().o().a(com.pandora.radio.util.k.h.d, r);
        continue; /* Loop/switch isn't completed */
_L7:
        b.setVisibility(8);
        if (true) goto _L9; else goto _L8
_L8:
    }

    private String e()
    {
        String s = b.a.d().c();
        String as[] = s.split("@");
        String s1 = as[0];
        String s2 = as[1];
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(s.charAt(0));
        stringbuilder.append(s.charAt(1));
        int j1 = Math.min(Math.max(0, s1.length() - 2), 10);
        for (int i1 = 0; i1 < j1; i1++)
        {
            stringbuilder.append("*");
        }

        stringbuilder.append("@");
        if (s2.length() > 12)
        {
            stringbuilder.append(s2.substring(0, 12));
            stringbuilder.append("...");
        } else
        {
            stringbuilder.append(s2);
        }
        return stringbuilder.toString();
    }

    void a()
    {
        a a2 = a.a;
        a a1 = a2;
        if (a == a.f)
        {
            a1 = a2;
            if (q != null)
            {
                a1 = q;
            }
        }
        a(a1);
    }

    void b()
    {
        if (a == com.pandora.android.ads.a.b || a == com.pandora.android.ads.a.d || a == com.pandora.android.ads.a.c || a == a.e)
        {
            q = a;
        }
        a(a.f);
    }

    void c()
    {
        a(a.f);
        b.a.e().b(this);
    }

    boolean d()
    {
        return a == a.f;
    }

    public void onSubmitPersonalInfoResponseAppEvent(u u1)
    {
        if (u1.a)
        {
            a(com.pandora.android.ads.a.d);
            return;
        } else
        {
            a(a.e);
            return;
        }
    }
}
