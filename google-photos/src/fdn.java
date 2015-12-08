// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public final class fdn extends omn
{

    public fdn()
    {
        new dsu(ah);
    }

    public static fdn a(fcm fcm1)
    {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("arg_batch", fcm1);
        fcm1 = new fdn();
        fcm1.f(bundle);
        return fcm1;
    }

    static void a(fdn fdn1, msp msp)
    {
        mry.a(fdn1.af, 4, (new msn()).a(new msm(msp)).a(fdn1.af));
    }

    public final Dialog c(Bundle bundle)
    {
        fcm fcm1;
        View view;
        TextView textview;
        int j;
        fcm1 = (fcm)super.q.getParcelable("arg_batch");
        view = LayoutInflater.from(af).inflate(b.nJ, null);
        ((TextView)view.findViewById(aa.e)).setText(af.getString(s.D, new Object[] {
            Formatter.formatFileSize(af, fcm1.e)
        }));
        j = fcm1.d;
        ((TextView)view.findViewById(aa.c)).setText(af.getResources().getQuantityString(b.nM, j, new Object[] {
            Integer.valueOf(j)
        }));
        textview = (TextView)view.findViewById(aa.d);
        fdq.a[fcm1.h.ordinal()];
        JVM INSTR tableswitch 1 3: default 164
    //                   1 209
    //                   2 290
    //                   3 321;
           goto _L1 _L2 _L3 _L4
_L1:
        bundle = String.valueOf(fcm1.h);
        throw new IllegalStateException((new StringBuilder(String.valueOf(bundle).length() + 28)).append("Unknown batch backup quality").append(bundle).toString());
_L2:
        bundle = af.getResources().getQuantityString(b.nL, j, new Object[] {
            Integer.valueOf(j)
        });
_L6:
        textview.setText(bundle);
        return (new android.app.AlertDialog.Builder(af)).setView(view).setNegativeButton(0x1040000, new fdp(this)).setPositiveButton(s.w, new fdo(this, fcm1)).create();
_L3:
        bundle = af.getResources().getQuantityString(b.nK, j, new Object[] {
            Integer.valueOf(j)
        });
        continue; /* Loop/switch isn't completed */
_L4:
        bundle = af.getString(s.C);
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected final void i(Bundle bundle)
    {
        super.i(bundle);
        bundle = (fcm)super.q.getParcelable("arg_batch");
        fdq.a[((fcm) (bundle)).h.ordinal()];
        JVM INSTR tableswitch 1 3: default 56
    //                   1 66
    //                   2 87
    //                   3 94;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalStateException("Unknown batch quality");
_L2:
        bundle = pws.p;
_L6:
        (new msi(bundle)).a(ag);
        return;
_L3:
        bundle = pws.n;
        continue; /* Loop/switch isn't completed */
_L4:
        bundle = pws.o;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
