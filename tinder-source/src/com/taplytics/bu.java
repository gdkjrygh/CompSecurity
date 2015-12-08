// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.KeyEvent;

// Referenced classes of package com.taplytics:
//            bs, br, bq, bp, 
//            gs

final class bu
    implements android.content.DialogInterface.OnKeyListener
{

    final bs a;

    bu(bs bs1)
    {
        a = bs1;
        super();
    }

    public final boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            try
            {
                a.b.a.a.c.dismiss();
                a.b.a.a.b.show();
            }
            // Misplaced declaration of an exception variable
            catch (DialogInterface dialoginterface)
            {
                gs.c("Error clicking dialog");
            }
        }
        return true;
    }
}
