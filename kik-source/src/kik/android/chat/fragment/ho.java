// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import com.kik.android.a;
import com.kik.g.r;
import kik.a.d.n;
import kik.a.f.q;
import kik.android.util.cq;
import kik.android.util.cy;

// Referenced classes of package kik.android.chat.fragment:
//            hn, ProgressDialogFragment, KikChatInfoFragment, hp

final class ho extends r
{

    final hn a;

    ho(hn hn1)
    {
        a = hn1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (kik.a.f.f.r)obj;
        a.a.dismissAllowingStateLoss();
        a.c.b.post(new hp(this));
        n n1 = (n)kik.android.chat.fragment.KikChatInfoFragment.a(a.c);
        if (((kik.a.f.f.r) (obj)).d())
        {
            a.c.o.b("User Banned").a("Participants Count", n1.F() - 1).a("Banned Count", n1.D() + 1).b();
        } else
        if (((kik.a.f.f.r) (obj)).e())
        {
            a.c.o.b("User Removed").a("Participants Count", n1.F() - 1).b();
            return;
        }
    }

    public final void a(Throwable throwable)
    {
label0:
        {
label1:
            {
label2:
                {
label3:
                    {
label4:
                        {
label5:
                            {
label6:
                                {
                                    int i;
label7:
                                    {
                                        a.a.dismissAllowingStateLoss();
                                        if (throwable instanceof q)
                                        {
                                            i = q.a(throwable);
                                            throwable = q.b(throwable);
                                            switch (i)
                                            {
                                            default:
                                                a.c.d(i);
                                                break;

                                            case 401: 
                                                break label1;

                                            case 405: 
                                                break label0;

                                            case 4001: 
                                                break label7;

                                            case 4002: 
                                                break label6;

                                            case 4003: 
                                                break label5;

                                            case 4004: 
                                                break label4;

                                            case 4005: 
                                                break label2;

                                            case 4006: 
                                                break label3;
                                            }
                                        }
                                        return;
                                    }
                                    KikChatInfoFragment kikchatinfofragment = a.c;
                                    if (cq.c(throwable))
                                    {
                                        throwable = cy.a(i);
                                    } else
                                    {
                                        throwable = kik.android.chat.fragment.KikChatInfoFragment.a(0x7f09004d, new Object[] {
                                            throwable
                                        });
                                    }
                                    kikchatinfofragment.Q = throwable;
                                    a.c.a(KikChatInfoFragment.b(0x7f0902ba), a.c.Q);
                                    return;
                                }
                                a.c.a(KikChatInfoFragment.b(0x7f0902ba), KikChatInfoFragment.b(0x7f09017b));
                                return;
                            }
                            a.c.a(KikChatInfoFragment.b(0x7f0902ba), KikChatInfoFragment.b(0x7f09017e));
                            return;
                        }
                        a.c.a(KikChatInfoFragment.b(0x7f0902ba), KikChatInfoFragment.b(0x7f09017f));
                        return;
                    }
                    a.c.a(KikChatInfoFragment.b(0x7f0902ba), KikChatInfoFragment.b(0x7f09034c));
                }
                a.c.a(KikChatInfoFragment.b(0x7f0902ba), KikChatInfoFragment.b(0x7f09034d));
                return;
            }
            a.c.a(KikChatInfoFragment.b(0x7f0902ba), KikChatInfoFragment.b(0x7f090181));
            return;
        }
        a.c.a(KikChatInfoFragment.b(0x7f0902ba), KikChatInfoFragment.b(0x7f090180));
    }
}
