// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import com.snapchat.android.ui.chat.ChatStickersDrawerView;
import com.snapchat.android.util.fragment.SnapchatFragment;
import java.util.List;

public final class xQ
    implements com.snapchat.android.ui.chat.ChatStickersDrawerView.d, xP.c, xR
{

    private final xW a;
    private final View b;
    private final View c;
    private final View d;
    private final View e;
    private final int f;
    private int g;
    private boolean h;
    private boolean i;
    private boolean j;

    public xQ(SnapchatFragment snapchatfragment, zG zg, View view)
    {
        this(snapchatfragment, zg, view, xW.a());
    }

    private xQ(SnapchatFragment snapchatfragment, zG zg, View view, xW xw)
    {
        zg.a(this);
        zg = snapchatfragment.getResources();
        a = xw;
        c = snapchatfragment.d(0x7f0d01b5);
        d = snapchatfragment.d(0x7f0d0135);
        e = snapchatfragment.d(0x7f0d01ac);
        float f1 = zg.getDimension(0x7f0a0057);
        f = (int)(zg.getDimension(0x7f0a0024) + f1);
        b = view;
        ((ChatStickersDrawerView)a.a(xY.a.a)).e.add(this);
    }

    private void b(int k)
    {
        int l = c.getHeight();
        i = false;
        j = true;
        c(l - k);
    }

    private void c(int k)
    {
        int i1 = e();
        int l = k;
        if (f + k > i1)
        {
            l = i1 - f;
        }
        k = l;
        if (l < g)
        {
            k = g;
        }
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)c.getLayoutParams();
        if (k != layoutparams.height)
        {
            layoutparams.height = k;
            c.setLayoutParams(layoutparams);
        }
    }

    private void d()
    {
        if (!i) goto _L2; else goto _L1
_L1:
        c(e() - f);
_L4:
        i = false;
        j = false;
        return;
_L2:
        if (j)
        {
            c(g);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private int e()
    {
        return (b.getRootView().getHeight() * 2) / 3;
    }

    public final void O_()
    {
        h = false;
    }

    public final void a(int k)
    {
        g = k;
        h = true;
    }

    public final void a(MotionEvent motionevent, boolean flag)
    {
        boolean flag2 = false;
        float f1;
        boolean flag1;
        if (motionevent.getHistorySize() > 0)
        {
            f1 = motionevent.getY() - motionevent.getHistoricalY(0);
        } else
        {
            f1 = 0.0F;
        }
        flag1 = flag2;
        if (f1 > 0.0F)
        {
            flag1 = flag2;
            if (motionevent.getY() + (float)d.getTop() > (float)e.getTop())
            {
                flag1 = true;
            }
        }
        if (flag1 && !h)
        {
            b((int)Math.ceil(f1));
        }
    }

    public final void b()
    {
        d();
    }

    public final void b(MotionEvent motionevent, boolean flag)
    {
        float f1;
        int k;
        int l;
        if (motionevent.getHistorySize() > 0)
        {
            f1 = motionevent.getY() - motionevent.getHistoricalY(0);
        } else
        {
            f1 = 0.0F;
        }
        if (motionevent.getY() <= 0.0F)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (f1 > 0.0F && flag)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (k != 0)
        {
            k = (int)Math.abs(motionevent.getY());
            l = c.getHeight();
            i = true;
            j = false;
            c(k + l);
        } else
        if (l != 0)
        {
            b((int)Math.ceil(f1));
            return;
        }
    }

    public final void c()
    {
        d();
    }
}
