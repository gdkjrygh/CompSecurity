// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.ListView;

// Referenced classes of package com.taplytics:
//            br, bq, bp, bd, 
//            bt, hk, bu

final class bs
    implements android.content.DialogInterface.OnClickListener
{

    final bd a;
    final br b;

    bs(br br1, bd bd1)
    {
        b = br1;
        a = bd1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        try
        {
            dialoginterface = ((String)b.a.a.b.getListView().getItemAtPosition(i)).replaceAll(" \\(draft\\)", "").replaceAll(" \\(active\\)", "");
            b.a.a.c = hk.a("Variation", a.a(dialoginterface), new bt(this, dialoginterface)).create();
            b.a.a.c.setOnKeyListener(new bu(this));
            b.a.a.c.show();
            b.a.a.b.dismiss();
            hk.a(b.a.a.c);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface)
        {
            bp.a(b.a.a, "second", dialoginterface);
        }
    }
}
