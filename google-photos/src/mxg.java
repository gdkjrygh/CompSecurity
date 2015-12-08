// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public final class mxg
    implements oov, opl, opp, opr, opv
{

    public int a;
    public CharSequence b;
    public boolean c;
    public mxj d;
    public mxe e;
    private View f;
    private TextView g;
    private View h;
    private TextView i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private final mxi n = new mxi(this);

    public mxg(opd opd1)
    {
        j = true;
        k = true;
        d = mxj.a;
        opd1.a(this);
    }

    private static void a(TextView textview, int i1, CharSequence charsequence)
    {
        if (textview == null)
        {
            return;
        }
        if (i1 != 0)
        {
            charsequence = textview.getContext().getString(i1);
        }
        textview.setText(charsequence);
    }

    static void a(mxg mxg1)
    {
        mxg1.f();
    }

    private void e()
    {
        if (m && f != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        switch (mxh.a[d.ordinal()])
        {
        default:
            throw new IllegalStateException();

        case 1: // '\001'
            if (l)
            {
                mxi mxi1 = n;
                if (!mxi1.hasMessages(0))
                {
                    mxi1.sendEmptyMessageDelayed(0, 800L);
                    return;
                }
            } else
            {
                f();
                return;
            }
            break;

        case 2: // '\002'
            n.removeMessages(0);
            if (j)
            {
                h.setVisibility(8);
                f.setVisibility(0);
                g.setVisibility(0);
            } else
            {
                f.setVisibility(8);
            }
            if (e != null)
            {
                e.v();
                return;
            }
            break;

        case 3: // '\003'
            n.removeMessages(0);
            f.setVisibility(8);
            continue; /* Loop/switch isn't completed */
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (e == null) goto _L1; else goto _L4
_L4:
        e.x();
        return;
    }

    private void f()
    {
        if (m && f != null && d == mxj.a)
        {
            if (k)
            {
                g.setVisibility(8);
                f.setVisibility(0);
                h.setVisibility(0);
            } else
            {
                f.setVisibility(8);
            }
            if (e != null)
            {
                e.w();
            }
        }
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            l = true;
        }
    }

    public final void a(View view, Bundle bundle)
    {
        f = view.findViewById(0x1020004);
        if (f != null)
        {
            g = (TextView)f.findViewById(c.fL);
            g.setOnClickListener(null);
            h = f.findViewById(c.fJ);
            i = (TextView)f.findViewById(c.fK);
            d();
        }
    }

    public final void a(mxj mxj1)
    {
        d = (mxj)p.a(mxj1);
        e();
    }

    public final void al_()
    {
        m = true;
        e();
    }

    public final void am_()
    {
        m = false;
    }

    public final void c()
    {
        mxj mxj1;
        if (c)
        {
            mxj1 = mxj.c;
        } else
        {
            mxj1 = mxj.a;
        }
        a(mxj1);
    }

    public void d()
    {
        if (f == null)
        {
            return;
        } else
        {
            a(g, a, null);
            a(i, 0, null);
            return;
        }
    }
}
