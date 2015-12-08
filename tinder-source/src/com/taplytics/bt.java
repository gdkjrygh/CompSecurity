// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            cv, turkey, bs, bd, 
//            br, bq, bp, ci

final class bt
    implements android.content.DialogInterface.OnClickListener
{

    final String a;
    final bs b;

    bt(bs bs1, String s)
    {
        b = bs1;
        a = s;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        Object obj;
        ci ci1;
        Object obj1;
        if (cv.a().d.equals(turkey.e))
        {
            break MISSING_BLOCK_LABEL_114;
        }
        obj1 = b.a.b(a);
        obj = b.b.a.a.c.getListView().getItemAtPosition(i).toString();
        dialoginterface = bd.a(((JSONObject) (obj1)), ((String) (obj)));
        ci1 = ci.b();
        obj1 = ((JSONObject) (obj1)).optString("_id");
        if (!((String) (obj)).equals("baseline"))
        {
            break MISSING_BLOCK_LABEL_104;
        }
        dialoginterface = ((DialogInterface) (obj));
_L1:
        try
        {
            ci1.a(((String) (obj1)), dialoginterface, ((String) (obj)), a);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface)
        {
            bp.a(b.b.a.a, "third", dialoginterface);
        }
        break MISSING_BLOCK_LABEL_193;
        dialoginterface = dialoginterface.optString("_id");
          goto _L1
        if (ci.b().v == null || !ci.b().l)
        {
            break MISSING_BLOCK_LABEL_193;
        }
        dialoginterface = Toast.makeText(ci.b().v, "No connection to Taplytics. Please check your internet connection or restart the app.", 1);
        obj = (TextView)dialoginterface.getView().findViewById(0x102000b);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        ((TextView) (obj)).setGravity(17);
        dialoginterface.show();
        return;
    }
}
