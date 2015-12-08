// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.model.Friend;
import com.snapchat.android.model.chat.ChatConversation;
import com.snapchat.android.ui.ChatLayout;
import com.snapchat.android.util.fragment.SnapchatFragment;
import com.squareup.otto.Bus;

public final class xO
    implements GB.a, su.a, xT.a, zJ, zL, zP
{

    private SnapchatFragment a;
    private Bus b;
    private su c;
    private mB d;
    private ChatLayout e;
    private View f;
    private PI g;
    private Friend h;

    public xO(SnapchatFragment snapchatfragment, zG zg, View view)
    {
        this(snapchatfragment, zg, view, Mf.a(), mB.a());
    }

    private xO(SnapchatFragment snapchatfragment, zG zg, View view, Bus bus, mB mb)
    {
        zg.a(this);
        a = snapchatfragment;
        f = view;
        b = bus;
        d = mb;
        e = (ChatLayout)snapchatfragment.d(0x7f0d0133);
        g = new PI(f, 0x7f0d0178, 0x7f0d0163, new PI.a(snapchatfragment) {

            private SnapchatFragment a;
            private xO b;

            public final void a(View view1)
            {
                xO.a(b, new su(b, a.getActivity()));
                xO.b(b).a(xO.a(b));
                xO.c(b).c(xO.b(b));
            }

            
            {
                b = xO.this;
                a = snapchatfragment;
                super();
            }
        });
        e.setOnTouchListener(new GB(this));
    }

    static View a(xO xo)
    {
        return xo.f;
    }

    static su a(xO xo, su su1)
    {
        xo.c = su1;
        return su1;
    }

    static su b(xO xo)
    {
        return xo.c;
    }

    static Bus c(xO xo)
    {
        return xo.b;
    }

    public final void N_()
    {
        c(false);
        h = null;
        if (c != null)
        {
            c.e();
        }
    }

    public final void a(ChatConversation chatconversation)
    {
        h = chatconversation.l();
    }

    public final void b()
    {
        if (c == null)
        {
            g.a();
        }
        if (c != null && g.b() && c.a(h))
        {
            p();
        }
    }

    public final void c(boolean flag)
    {
        boolean flag1 = false;
        if (e.a)
        {
            e.a(false, flag);
            String s = h.g();
            flag = flag1;
            if (c != null)
            {
                flag = flag1;
                if (c.p)
                {
                    flag = true;
                }
            }
            AnalyticsEvents.c(s, flag);
        }
    }

    public final boolean c()
    {
        if (e.a)
        {
            c(true);
            return true;
        } else
        {
            return false;
        }
    }

    public final void h()
    {
    }

    public final float j()
    {
        return (float)d.mScreenFullWidthPx * 0.66F;
    }

    public final boolean o_()
    {
        return a.isAdded();
    }

    public final void p()
    {
        e.a(true, true);
        AnalyticsEvents.p(h.g());
    }
}
