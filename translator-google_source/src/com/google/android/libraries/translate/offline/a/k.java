// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline.a;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.widget.CheckBox;

// Referenced classes of package com.google.android.libraries.translate.offline.a:
//            i

final class k
    implements android.content.DialogInterface.OnClickListener
{

    final CheckBox a;
    final CheckBox b;
    final int c;
    final SharedPreferences d;
    final i e;

    k(i j, CheckBox checkbox, CheckBox checkbox1, int l, SharedPreferences sharedpreferences)
    {
        e = j;
        a = checkbox;
        b = checkbox1;
        c = l;
        d = sharedpreferences;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int j)
    {
        j = 0;
        dialoginterface.dismiss();
        dialoginterface = e;
        boolean flag;
        if (!a.isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dialoginterface.a(flag);
        if (!b.isChecked()) goto _L2; else goto _L1
_L1:
        if (c == 2) goto _L4; else goto _L3
_L3:
        dialoginterface = d;
        j = 2;
_L6:
        i.a(dialoginterface, j);
_L4:
        return;
_L2:
        SharedPreferences sharedpreferences = d;
        dialoginterface = sharedpreferences;
        if (!a.isChecked())
        {
            j = 1;
            dialoginterface = sharedpreferences;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
