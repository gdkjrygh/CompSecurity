// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ObjectAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ViewSwitcher;

public final class dvf extends hgu
{

    final dvi a;
    eey b;
    private String c;
    private final long d;
    private final int e;

    public dvf(dvi dvi, dum dum1)
    {
        e = dum1.e;
        d = dum1.c;
        b = (new efa()).a();
        a = dvi;
    }

    private static void a(ViewSwitcher viewswitcher)
    {
        ((ImageView)viewswitcher.getCurrentView()).setImageDrawable(null);
        ((ImageView)viewswitcher.getNextView()).setImageDrawable(null);
    }

    public final int a()
    {
        return b.jH;
    }

    public final void a(afn afn1)
    {
        dvl dvl1 = (dvl)afn1;
        if (ContentResolver.getMasterSyncAutomatically()) goto _L2; else goto _L1
_L1:
        dvl1.p.setVisibility(0);
        dvl1.s.setVisibility(0);
        dvl1.q.setVisibility(8);
        dvl1.r.setVisibility(8);
_L8:
        Object obj1;
        if (c != null && b.a != efb.c)
        {
            dvl1.q.setProgress(0);
        }
        obj1 = dvl1.a.getContext();
        if (ContentResolver.getMasterSyncAutomatically() || b.a == efb.b) goto _L4; else goto _L3
_L3:
        dvl1.o.setText(b.jU);
        dvl1.p.setText(b.jT);
        dvl1.s.setImageResource(b.jB);
_L6:
        c = b.d;
        b.a(afn1.a, ogh.a(pws.a, e));
        dvl1.a.setOnClickListener(new dvj(this, pwt.i, b.a));
        return;
_L2:
        switch (dvh.a[b.a.ordinal()])
        {
        default:
            afn1 = String.valueOf(b.a);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(afn1).length() + 39)).append("State ").append(afn1).append(" is not a valid Auto Backup State").toString());

        case 2: // '\002'
            dvl1.p.setVisibility(0);
            dvl1.s.setVisibility(0);
            dvl1.q.setVisibility(8);
            dvl1.r.setVisibility(8);
            break;

        case 1: // '\001'
        case 5: // '\005'
            dvl1.p.setVisibility(8);
            dvl1.s.setVisibility(0);
            dvl1.q.setVisibility(8);
            dvl1.r.setVisibility(8);
            break;

        case 3: // '\003'
            TextView textview = dvl1.p;
            byte byte0;
            if (b.c == 0)
            {
                byte0 = 8;
            } else
            {
                byte0 = 0;
            }
            textview.setVisibility(byte0);
            dvl1.q.setVisibility(0);
            if (b.d != null)
            {
                dvl1.r.setVisibility(0);
                dvl1.s.setVisibility(8);
            } else
            {
                dvl1.r.setVisibility(8);
                dvl1.s.setVisibility(0);
            }
            break;

        case 4: // '\004'
            TextView textview1 = dvl1.p;
            byte byte1;
            if (b.c == 0)
            {
                byte1 = 8;
            } else
            {
                byte1 = 0;
            }
            textview1.setVisibility(byte1);
            dvl1.q.setVisibility(8);
            dvl1.r.setVisibility(8);
            dvl1.s.setVisibility(8);
            break;

        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
            dvl1.p.setVisibility(0);
            dvl1.s.setVisibility(0);
            dvl1.q.setVisibility(8);
            dvl1.r.setVisibility(8);
            break;
        }
          goto _L5
_L4:
        switch (dvh.a[b.a.ordinal()])
        {
        default:
            afn1 = String.valueOf(b.a);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(afn1).length() + 39)).append("State ").append(afn1).append(" is not a valid Auto Backup State").toString());

        case 1: // '\001'
            dvl1.o.setText(b.jW);
            dvl1.s.setImageResource(b.jB);
            break;

        case 2: // '\002'
            dvl1.o.setText(b.jO);
            dvl1.p.setText(b.jP);
            dvl1.s.setImageResource(b.jB);
            break;

        case 3: // '\003'
            dvl1.o.setText(b.jM);
            dvl1.p.setText(((Context) (obj1)).getResources().getQuantityString(b.jJ, b.c, new Object[] {
                Integer.valueOf(b.c)
            }));
            Object obj = dvl1.q;
            int i = b.b;
            if (((ProgressBar) (obj)).getProgress() <= i)
            {
                obj = ObjectAnimator.ofInt(obj, "progress", new int[] {
                    i
                });
            } else
            {
                obj = ObjectAnimator.ofInt(obj, "progress", new int[] {
                    0, i
                });
            }
            ((ObjectAnimator) (obj)).setDuration(100L);
            ((ObjectAnimator) (obj)).setInterpolator(new DecelerateInterpolator());
            ((ObjectAnimator) (obj)).start();
            if (b.d == null)
            {
                dvl1.s.setImageResource(b.jA);
                a(dvl1.r);
            } else
            if (!b.d.equals(c))
            {
                ViewSwitcher viewswitcher = dvl1.r;
                ame ame1 = aly.c(((Context) (obj1))).g().a(Uri.parse(b.d));
                ayt ayt1 = ayt.b(apa.b);
                int j = (int)((Context) (obj1)).getResources().getDimension(b.jw);
                obj1 = ame1.a(((ayt)((ayt)ayt1.a(j, j)).a(true)).a(((Context) (obj1)))).a(awl.b());
                obj1.a = new dvg(this, viewswitcher);
                ((ame) (obj1)).a((ImageView)dvl1.r.getNextView());
            }
            break;

        case 4: // '\004'
            dvl1.o.setText(b.jV);
            dvl1.p.setText(((Context) (obj1)).getResources().getQuantityString(b.jK, b.c));
            break;

        case 5: // '\005'
            dvl1.o.setText(b.jL);
            dvl1.s.setImageResource(b.jy);
            a(dvl1.r);
            break;

        case 6: // '\006'
            dvl1.o.setText(b.jN);
            dvl1.p.setText(b.e);
            dvl1.s.setImageResource(b.jB);
            break;

        case 7: // '\007'
            dvl1.o.setText(b.jX);
            dvl1.p.setText(((Context) (obj1)).getResources().getQuantityString(b.jK, b.c, new Object[] {
                Integer.valueOf(b.c)
            }));
            dvl1.s.setImageResource(b.jz);
            break;

        case 8: // '\b'
            dvl1.o.setText(b.jZ);
            dvl1.p.setText(((Context) (obj1)).getResources().getQuantityString(b.jK, b.c, new Object[] {
                Integer.valueOf(b.c)
            }));
            dvl1.s.setImageResource(b.jz);
            break;

        case 9: // '\t'
            dvl1.o.setText(b.jY);
            dvl1.p.setText(((Context) (obj1)).getResources().getQuantityString(b.jK, b.c, new Object[] {
                Integer.valueOf(b.c)
            }));
            dvl1.s.setImageResource(b.jx);
            break;
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final long b()
    {
        return d;
    }
}
