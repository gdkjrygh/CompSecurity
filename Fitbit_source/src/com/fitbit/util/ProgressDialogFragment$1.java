// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.content.DialogInterface;
import android.view.KeyEvent;

// Referenced classes of package com.fitbit.util:
//            ProgressDialogFragment

class a
    implements android.content.ener
{

    final ProgressDialogFragment a;

    public boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
    {
        return i == 84;
    }

    ener(ProgressDialogFragment progressdialogfragment)
    {
        a = progressdialogfragment;
        super();
    }
}
