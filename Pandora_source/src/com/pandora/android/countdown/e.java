// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.countdown;

import com.pandora.android.provider.b;
import p.cw.c;
import p.dd.an;

// Referenced classes of package com.pandora.android.countdown:
//            a, d, b

public class e
{
    private class a
    {

        final e a;

        public void onCountdownBarData(com.pandora.android.countdown.b b1)
        {
            if (b1 == null || b1.a == null)
            {
                return;
            }
            static class _cls1
            {

                static final int a[];
                static final int b[];

                static 
                {
                    b = new int[com.pandora.android.countdown.a.a.values().length];
                    try
                    {
                        b[com.pandora.android.countdown.a.a.b.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        b[com.pandora.android.countdown.a.a.c.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    a = new int[p.cx.a.values().length];
                    try
                    {
                        a[p.cx.a.d.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[p.cx.a.b.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            com.pandora.android.countdown._cls1.b[b1.b.ordinal()];
            JVM INSTR tableswitch 1 2: default 44
        //                       1 75
        //                       2 198;
               goto _L1 _L2 _L3
_L1:
            p.df.a.a("CountdownBarManager", (new StringBuilder()).append("onCountdownBarData: ").append(e.a(a)).toString());
            return;
_L2:
            if (e.a(a) == null || e.a(a).b().equals(b1.a.b()))
            {
                e.a(a, b1.a);
                b1 = new d(b1.b, e.a(a));
                a.a(b1);
            } else
            if (com.pandora.android.countdown.e.b(a) == null || com.pandora.android.countdown.e.b(a).b().equals(b1.a.b()))
            {
                com.pandora.android.countdown.e.b(a, b1.a);
            }
            continue; /* Loop/switch isn't completed */
_L3:
            if (e.a(a) != null && e.a(a).b().equals(b1.a.b()))
            {
                b1 = new d(b1.b, e.a(a));
                a.a(b1);
                if (com.pandora.android.countdown.e.b(a) != null && com.pandora.android.countdown.e.b(a).h())
                {
                    e.a(a, com.pandora.android.countdown.e.b(a));
                    b1 = new d(com.pandora.android.countdown.a.a.b, e.a(a));
                    a.a(b1);
                    com.pandora.android.countdown.e.b(a, null);
                } else
                {
                    e.a(a, null);
                    com.pandora.android.countdown.e.b(a, null);
                }
            } else
            if (com.pandora.android.countdown.e.b(a) != null && com.pandora.android.countdown.e.b(a).b().equals(b1.a.b()))
            {
                com.pandora.android.countdown.e.b(a, null);
            }
            if (true) goto _L1; else goto _L4
_L4:
        }

        public void onSignInState(an an1)
        {
            switch (_cls1.a[an1.b.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                e.a(a, null);
                break;
            }
            com.pandora.android.countdown.e.b(a, null);
        }

        public d produceCountdownBarUpdateEvent()
        {
            p.df.a.a("CountdownBarManager", (new StringBuilder()).append("produceCountdownBarUpdateEvent - ").append(e.a(a)).toString());
            com.pandora.android.countdown.a a2 = com.pandora.android.countdown.e.c(a);
            a.a a1 = a.a.a;
            if (a2 != null)
            {
                if (a2.h())
                {
                    a1 = com.pandora.android.countdown.a.a.b;
                } else
                {
                    a1 = com.pandora.android.countdown.a.a.c;
                }
            }
            return new d(a1, a2);
        }

        private a()
        {
            a = e.this;
            super();
        }

    }


    private b a;
    private a b;
    private com.pandora.android.countdown.a c;
    private com.pandora.android.countdown.a d;

    public e(b b1)
    {
        c = null;
        d = null;
        a = b1;
        b = new a(null);
        a();
    }

    static com.pandora.android.countdown.a a(e e1)
    {
        return e1.c;
    }

    static com.pandora.android.countdown.a a(e e1, com.pandora.android.countdown.a a1)
    {
        e1.c = a1;
        return a1;
    }

    private void a()
    {
        a.e().c(b);
        a.b().b(b);
    }

    private com.pandora.android.countdown.a b()
    {
label0:
        {
            com.pandora.android.countdown.a a1;
label1:
            {
                if (c == null)
                {
                    break label0;
                }
                a1 = (com.pandora.android.countdown.a)c.clone();
                if (!a1.h())
                {
                    if (d == null || !d.h())
                    {
                        break label1;
                    }
                    c = d;
                    d = null;
                }
                return a1;
            }
            c = null;
            d = null;
            return a1;
        }
        return null;
    }

    static com.pandora.android.countdown.a b(e e1)
    {
        return e1.d;
    }

    static com.pandora.android.countdown.a b(e e1, com.pandora.android.countdown.a a1)
    {
        e1.d = a1;
        return a1;
    }

    static com.pandora.android.countdown.a c(e e1)
    {
        return e1.b();
    }

    protected void a(d d1)
    {
        a.e().a(d1);
    }
}
