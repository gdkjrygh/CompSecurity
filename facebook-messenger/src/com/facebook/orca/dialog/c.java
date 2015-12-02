// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.dialog;

import android.view.View;

// Referenced classes of package com.facebook.orca.dialog:
//            ConfirmActionDialogFragment

class c
    implements android.view.View.OnClickListener
{

    final ConfirmActionDialogFragment a;

    c(ConfirmActionDialogFragment confirmactiondialogfragment)
    {
        a = confirmactiondialogfragment;
        super();
    }

    public void onClick(View view)
    {
        a.Q();
    }
}
