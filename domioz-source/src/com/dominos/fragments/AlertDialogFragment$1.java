// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.content.DialogInterface;

// Referenced classes of package com.dominos.fragments:
//            AlertDialogFragment

class this._cls0
    implements android.content.kListener
{

    final AlertDialogFragment this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (AlertDialogFragment.access$000(AlertDialogFragment.this) != null)
        {
            AlertDialogFragment.access$000(AlertDialogFragment.this).onAlertDismiss();
        }
        dialoginterface.dismiss();
    }

    AlertDialogListener()
    {
        this$0 = AlertDialogFragment.this;
        super();
    }
}
