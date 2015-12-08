// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import com.kik.android.a;
import com.kik.view.adapters.MediaTrayTabAdapter;
import kik.android.e.c;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class dl
    implements c
{

    float a;
    final KikChatFragment b;

    dl(KikChatFragment kikchatfragment)
    {
        b = kikchatfragment;
        super();
        a = 0.0F;
    }

    public final boolean a(MotionEvent motionevent)
    {
        boolean flag2 = false;
        boolean flag1 = false;
        if (motionevent.getAction() == 0)
        {
            a = motionevent.getY();
        }
        boolean flag = flag2;
        if (motionevent.getAction() == 1)
        {
            flag = flag2;
            if (!KikChatFragment.g(b))
            {
                flag = flag2;
                if (!KikChatFragment.J(b))
                {
                    flag = flag2;
                    if (!KikChatFragment.af(b))
                    {
                        if (motionevent.getY() < a - 25F && "Camera".equals(KikChatFragment.K(b).a(KikChatFragment.L(b))))
                        {
                            kik.android.chat.fragment.KikChatFragment.a(b, true, true);
                            KikChatFragment.e(b, kik.android.chat.fragment.KikChatFragment.c.c);
                            flag = true;
                        } else
                        {
                            flag = flag1;
                            if (motionevent.getY() > a + 25F)
                            {
                                flag = flag1;
                                if ("Camera".equals(KikChatFragment.K(b).a(KikChatFragment.L(b))))
                                {
                                    b.g.b("Minimized Tray").a("Is Landscape", KikChatFragment.g(b)).a("Tab", KikChatFragment.K(b).a(KikChatFragment.L(b))).b();
                                    b._mediaItemArea.setVisibility(0);
                                    kik.android.chat.fragment.KikChatFragment.a(b, true);
                                    KikChatFragment.e(b, KikChatFragment.c.b);
                                    flag = true;
                                }
                            }
                        }
                        if (kik.android.chat.fragment.KikChatFragment.a(b))
                        {
                            a = b._mediaItemArea.getHeight();
                        } else
                        {
                            a = 0.0F;
                        }
                    }
                }
            }
        }
        if (KikChatFragment.af(b))
        {
            return true;
        } else
        {
            return flag;
        }
    }
}
