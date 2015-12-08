// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.app.AlertDialog;

// Referenced classes of package com.taplytics:
//            cv, ci, br, hk, 
//            bp, gs

final class bq
    implements Runnable
{

    final bp a;

    bq(bp bp1)
    {
        a = bp1;
        super();
    }

    public final void run()
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if (cv.a().b)
        {
            s = "Disable";
        } else
        {
            s = "Enable";
        }
        s = stringbuilder.append(s).append(" Borders").toString();
        try
        {
            if (ci.b().v != null && ci.b().l)
            {
                bp bp1 = a;
                br br1 = new br(this);
                bp1.a = hk.a("Taplytics", new String[] {
                    "Show Experiments", "Clear", s
                }, br1).create();
                hk.a(a.a);
                a.a.dismiss();
                a.a.show();
                bp.a(a);
            }
            return;
        }
        catch (Exception exception)
        {
            gs.b("dialog err", exception);
        }
    }
}
