// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

// Referenced classes of package com.taplytics:
//            ci, bq, bd, bs, 
//            hk, bp, gs, cv, 
//            hq, bv

final class br
    implements android.content.DialogInterface.OnClickListener
{

    final bq a;

    br(bq bq1)
    {
        a = bq1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        boolean flag = true;
        i;
        JVM INSTR tableswitch 0 2: default 32
    //                   0 33
    //                   1 215
    //                   2 264;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        try
        {
            if (ci.b().t != null)
            {
                dialoginterface = ci.b().t;
                a.a.b = hk.a("Experiments", dialoginterface.a(), new bs(this, dialoginterface)).create();
                a.a.b.dismiss();
                a.a.b.show();
                a.a.a.dismiss();
                hk.a(a.a.b);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface)
        {
            bp.a(a.a, "first", dialoginterface);
            return;
        }
        if (ci.b().v == null || !ci.b().l) goto _L1; else goto _L5
_L5:
        TextView textview;
        dialoginterface = Toast.makeText(ci.b().v, "No experiments found. If you have created an experiment, check your api key and internet connection.", 1);
        textview = (TextView)dialoginterface.getView().findViewById(0x102000b);
        if (textview == null) goto _L7; else goto _L6
_L6:
        textview.setGravity(17);
_L7:
        dialoginterface.show();
        return;
        dialoginterface;
        gs.b("something dialog", dialoginterface);
        return;
_L3:
        cv.a().f();
        cv.a().a = false;
        ci.b().f();
        dialoginterface = new hq();
        dialoginterface.a(new bv(this));
        ci.b().a(null, dialoginterface);
        return;
_L4:
        if (cv.a().b)
        {
            flag = false;
        }
        cv.a().b = flag;
        if (flag) goto _L9; else goto _L8
_L8:
        cv.a().f();
        return;
_L9:
        cv.a().d();
        return;
    }
}
