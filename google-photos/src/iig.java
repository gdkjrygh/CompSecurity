// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

final class iig extends hgu
{

    final ekq a;

    public iig(ekq ekq1)
    {
        a = ekq1;
    }

    static void a(iig iig1, View view, msp msp)
    {
        mry.a(view.getContext(), 4, (new msn()).a(new msm(msp)).a(view));
    }

    public final int a()
    {
        return ce.w;
    }

    public final void a(afn afn1)
    {
        Context context;
        Object obj;
        String s;
        esm esm1;
        int i;
        context = afn1.a.getContext();
        afn1 = (iil)afn1;
        obj = (mmr)olm.a(context, mmr);
        obj = new gat(((hjt)a.a(hjt)).a, ((mmr) (obj)).d());
        Object obj1 = (fli)olm.a(context, fli);
        ((amh)olm.a(context, amh)).a(obj).a(((fli) (obj1)).f().b(b.zu)).a(((iil) (afn1)).o);
        obj = ((elj)a.a(elj)).a;
        ((iil) (afn1)).p.setText(((CharSequence) (obj)));
        obj = ((iil) (afn1)).q;
        obj1 = (ewz)olm.a(context, ewz);
        long l = ((hkd)a.a(hkd)).a;
        s = ((ewz) (obj1)).a(l, exa.a);
        esm1 = ((hkf)a.a(hkf)).a;
        i = ((ewz) (obj1)).b(l, exa.a);
        iik.b[esm1.ordinal()];
        JVM INSTR tableswitch 1 3: default 244
    //                   1 323
    //                   2 508
    //                   3 571;
           goto _L1 _L2 _L3 _L4
_L1:
        iik.a[i - 1];
        JVM INSTR tableswitch 1 3: default 280
    //                   1 631
    //                   2 639
    //                   3 647;
           goto _L5 _L6 _L7 _L8
_L5:
        afn1 = String.valueOf(esm1);
        throw new IllegalStateException((new StringBuilder(String.valueOf(afn1).length() + 19)).append("Unknown link type: ").append(afn1).toString());
_L2:
        iik.a[i - 1];
        JVM INSTR tableswitch 1 3: default 356
    //                   1 359
    //                   2 492
    //                   3 500;
           goto _L5 _L9 _L10 _L11
_L9:
        i = b.zE;
_L12:
        ((TextView) (obj)).setText(context.getString(i, new Object[] {
            s
        }));
        ((iil) (afn1)).a.setOnClickListener(new msj(new iih(this, context)));
        b.a(((iil) (afn1)).a, new ogu(pwz.j, new String[] {
            ((hpe)a.a(hpe)).a.a
        }));
        ((iil) (afn1)).r.setOnClickListener(new msj(new iii(this)));
        b.a(((iil) (afn1)).r, new msm(pwr.n));
        return;
_L10:
        i = b.zF;
          goto _L12
_L11:
        i = b.zD;
          goto _L12
_L3:
        iik.a[i - 1];
        JVM INSTR tableswitch 1 3: default 544
    //                   1 547
    //                   2 555
    //                   3 563;
           goto _L5 _L13 _L14 _L15
_L13:
        i = b.zQ;
          goto _L12
_L14:
        i = b.zR;
          goto _L12
_L15:
        i = b.zP;
          goto _L12
_L4:
        iik.a[i - 1];
        JVM INSTR tableswitch 1 3: default 604
    //                   1 607
    //                   2 615
    //                   3 623;
           goto _L5 _L16 _L17 _L18
_L16:
        i = b.zX;
          goto _L12
_L17:
        i = b.zY;
          goto _L12
_L18:
        i = b.zW;
          goto _L12
_L6:
        i = b.zM;
          goto _L12
_L7:
        i = b.zN;
          goto _L12
_L8:
        i = b.zL;
          goto _L12
    }
}
