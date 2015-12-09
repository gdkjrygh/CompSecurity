// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.spotify.mobile.android.provider.PaymentState;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import com.spotify.mobile.android.ui.activity.upsell.repository.ShowOfferInNavigationDrawerFlag;
import com.spotify.mobile.android.ui.fragments.logic.Flags;

public final class fkw
    implements dwx, eda, fku
{

    public fla a;
    public fkt b;
    public fri c;
    public fkv d;
    public Flags e;
    public SessionState f;
    fry g;
    Offer h;
    public boolean i;
    private boolean j;

    public fkw(fla fla1, fkt fkt1, fkv fkv, Flags flags, fri fri1, fry fry)
    {
        a = fla1;
        b = fkt1;
        d = fkv;
        e = flags;
        g = fry;
        c = fri1;
    }

    public final void a()
    {
        boolean flag1 = true;
        if (a != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        boolean flag;
        boolean flag2;
        a.F();
        if (f == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        PaymentState paymentstate = f.l;
        String s = f.m;
        flag = paymentstate.c();
        boolean flag3 = s.equalsIgnoreCase("premium");
        flag2 = dtw.a(s);
        if (!flag3 || !flag)
        {
            break; /* Loop/switch isn't completed */
        }
        a.e(true);
        flag = f.e;
_L6:
        if (!i && e != null && b() && flag)
        {
            c.a(new frj() {

                private fkw a;

                public final void a()
                {
                    if (a.i)
                    {
                        return;
                    } else
                    {
                        a.a.f(false);
                        return;
                    }
                }

                public final void a(Offer offer)
                {
                    if (!a.i && a.b())
                    {
                        if (offer == null)
                        {
                            a.a.f(false);
                            return;
                        }
                        if (!offer.equals(a.h))
                        {
                            a.h = offer;
                            if (offer.getProductType() != com.spotify.mobile.android.ui.activity.upsell.model.Offer.ProductType.PREMIUM)
                            {
                                a.a.e(false);
                                a.a.f(false);
                                return;
                            }
                            offer = fss.a(a.h, a.g);
                            if (offer != null)
                            {
                                a.a.f(true);
                                a.a.c(offer);
                                return;
                            } else
                            {
                                a.a.f(false);
                                return;
                            }
                        }
                    }
                }

            
            {
                a = fkw.this;
                super();
            }
            });
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        fla fla1 = a;
        if (!flag2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fla1.e(flag);
        if (flag2) goto _L5; else goto _L4
_L4:
        flag = flag1;
        if (f.e) goto _L6; else goto _L5
_L5:
        flag = false;
          goto _L6
    }

    public final void a(int k, int l)
    {
        if (a == null)
        {
            return;
        }
        a.a(k, l);
        fla fla1 = a;
        boolean flag;
        if (k + l > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fla1.d(flag);
    }

    public final void a(SessionState sessionstate)
    {
        if (b == null)
        {
            return;
        }
        if (!j)
        {
            j = true;
            b.b = this;
        }
        f = sessionstate;
        fkt fkt1 = b;
        String s = sessionstate.b;
        if (!TextUtils.equals(s, fkt1.a))
        {
            fkt1.a = s;
            fkt1.a();
        }
        c.a(sessionstate);
        a();
    }

    public final void a(Flags flags)
    {
        e = flags;
        a();
    }

    public final void a(String s, String s1)
    {
        if (a == null)
        {
            return;
        } else
        {
            a.a(s1);
            a.b(s);
            return;
        }
    }

    final boolean b()
    {
        boolean flag;
        if (e.a(fys.aI) == ShowOfferInNavigationDrawerFlag.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            a.f(false);
        }
        return flag;
    }
}
