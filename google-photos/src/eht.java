// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

final class eht extends hgu
{

    private static final mjw b;
    private static final mjw c;
    final ekq a;
    private final ehy d;
    private final int e;

    public eht(ehy ehy1, ekq ekq1, int i)
    {
        d = ehy1;
        a = ekq1;
        e = i;
    }

    static int a(esm esm1)
    {
        return b(esm1);
    }

    static ekq a(eht eht1)
    {
        return eht1.a;
    }

    private static String a(Resources resources, int i, int j)
    {
        return resources.getQuantityString(i, j, new Object[] {
            Integer.valueOf(j)
        });
    }

    private static int b(esm esm1)
    {
        switch (ehv.a[esm1.ordinal()])
        {
        default:
            return b.lp;

        case 1: // '\001'
            return b.lq;

        case 2: // '\002'
            return b.lr;
        }
    }

    public final int a()
    {
        return p.w;
    }

    public final int a(int i)
    {
        return 1;
    }

    public final void a(afn afn1)
    {
        Object obj;
        hjt hjt1;
        Object obj2;
        Object obj4;
        int i;
        obj = afn1.a.getContext();
        ehx ehx1 = (ehx)afn1;
        ehw ehw1 = (ehw)olm.a(((Context) (obj)), ehw);
        hjt1 = (hjt)a.a(hjt);
        hkf hkf1 = (hkf)a.a(hkf);
        Object obj1 = hkf1.a;
        hpe hpe1 = (hpe)a.a(hpe);
        Object obj3 = (amh)olm.a(((Context) (obj)), amh);
        obj2 = (fli)olm.a(((Context) (obj)), fli);
        if (!TextUtils.isEmpty(hjt1.a))
        {
            hjr hjr1;
            if (hjt1.b == null)
            {
                afn1 = new gat(hjt1.a, d.a);
            } else
            {
                afn1 = new gan(hjt1.b);
            }
            obj3 = ((amh) (obj3)).a(afn1);
            obj4 = ehy.a(d, ((esm) (obj1)));
            obj2 = ((fli) (obj2)).a();
            if (obj1 == esm.d)
            {
                afn1 = c;
            } else
            {
                afn1 = b;
            }
            ((ame) (obj3)).a(((ayt) (obj4)).a(((anf) (obj2)), afn1)).a(awl.b()).a(ehx1.o);
            ehx1.p.setVisibility(0);
        } else
        {
            ((amh) (obj3)).a(ehx1.o);
            ehx1.o.setImageResource(b(((esm) (obj1))));
            ehx1.p.setVisibility(8);
        }
        afn1 = ((elj)a.a(elj)).a;
        obj2 = ehx1.q;
        if (TextUtils.isEmpty(afn1))
        {
            i = 8;
        } else
        {
            i = 0;
        }
        ((TextView) (obj2)).setVisibility(i);
        ehx1.q.setText(afn1);
        afn1 = ehx1.s;
        ehv.a[((esm) (obj1)).ordinal()];
        JVM INSTR tableswitch 1 2: default 300
    //                   1 733
    //                   2 741;
           goto _L1 _L2 _L3
_L1:
        i = c.cC;
_L15:
        afn1.setImageResource(i);
        ehv.a[((esm) (obj1)).ordinal()];
        JVM INSTR tableswitch 1 3: default 348
    //                   1 771
    //                   2 760
    //                   3 749;
           goto _L4 _L5 _L6 _L7
_L4:
        afn1 = null;
_L16:
        ehx1.s.setContentDescription(afn1);
        afn1 = ehx1.s;
        ehv.a[((esm) (obj1)).ordinal()];
        JVM INSTR tableswitch 1 2: default 396
    //                   1 782
    //                   2 790;
           goto _L8 _L9 _L10
_L8:
        i = c.cx;
_L17:
        afn1.setBackgroundResource(i);
        obj1 = ehx1.r;
        obj3 = (hjp)a.a(hjp);
        hjr1 = (hjr)a.a(hjr);
        afn1 = (hkd)a.a(hkd);
        obj4 = ((Context) (obj)).getResources();
        obj2 = ((Context) (obj)).getResources().getString(b.lN);
        afn1 = afn1.a(((Context) (obj)));
        i = hjr1.a;
        ehv.a[hkf1.a.ordinal()];
        JVM INSTR tableswitch 1 3: default 528
    //                   1 882
    //                   2 993
    //                   3 798;
           goto _L11 _L12 _L13 _L14
_L13:
        break MISSING_BLOCK_LABEL_993;
_L11:
        afn1 = "";
_L18:
        obj = afn1;
        if (((hjp) (obj3)).a.c)
        {
            obj = ((Resources) (obj4)).getString(b.lJ);
            obj = (new StringBuilder(String.valueOf(afn1).length() + 0 + String.valueOf(obj2).length() + String.valueOf(obj).length())).append(afn1).append(((String) (obj2))).append(((String) (obj))).toString();
        }
        ((TextView) (obj1)).setText(((CharSequence) (obj)));
        afn1 = hpe1.a.a;
        b.a(ehx1.a, new ogu(pwt.j, new String[] {
            afn1
        }));
        ehx1.a.setOnClickListener(new msj(new ehu(this, ehw1, hkf1)));
        return;
_L2:
        i = c.cB;
          goto _L15
_L3:
        i = c.cA;
          goto _L15
_L7:
        afn1 = ((Context) (obj)).getString(b.lA);
          goto _L16
_L6:
        afn1 = ((Context) (obj)).getString(b.lM);
          goto _L16
_L5:
        afn1 = ((Context) (obj)).getString(b.lG);
          goto _L16
_L9:
        i = c.cy;
          goto _L17
_L10:
        i = c.cz;
          goto _L17
_L14:
        if (i == 0)
        {
            afn1 = ((Resources) (obj4)).getString(b.lB);
        } else
        {
            String s = String.valueOf(a(((Resources) (obj4)), b.ly, i));
            afn1 = (new StringBuilder(String.valueOf(afn1).length() + 0 + String.valueOf(obj2).length() + String.valueOf(s).length())).append(afn1).append(((String) (obj2))).append(s).toString();
        }
          goto _L18
_L12:
        long l = TimeUnit.MILLISECONDS.toSeconds(hjt1.c);
        long l1 = l / 60L;
        String s1 = String.valueOf(String.format(Locale.getDefault(), "%d:%02d", new Object[] {
            Long.valueOf(l1), Long.valueOf(l % 60L)
        }));
        afn1 = (new StringBuilder(String.valueOf(afn1).length() + 0 + String.valueOf(obj2).length() + String.valueOf(s1).length())).append(afn1).append(((String) (obj2))).append(s1).toString();
          goto _L18
        String s2 = String.valueOf(a(((Resources) (obj4)), b.lz, i));
        afn1 = (new StringBuilder(String.valueOf(afn1).length() + 0 + String.valueOf(obj2).length() + String.valueOf(s2).length())).append(afn1).append(((String) (obj2))).append(s2).toString();
          goto _L18
    }

    public final int b(int i)
    {
        return e % i;
    }

    public final long b()
    {
        return (long)a.hashCode();
    }

    static 
    {
        mjw mjw1 = new mjw();
        mjw1.a(16);
        mjw1 = mjw1.c();
        mjw1.a(4);
        mjw1.a(1);
        mjw1.b = true;
        b = mjw1;
        mjw1 = new mjw();
        mjw1.a(16);
        mjw1 = mjw1.c();
        mjw1.a(4);
        mjw1.a(1);
        mjw1.b = true;
        mjw1.c = 1;
        c = mjw1;
    }
}
