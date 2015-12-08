// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.content.DialogInterface;

// Referenced classes of package org.xbmc.kore.ui:
//            GenericSelectDialog

class val.token
    implements android.content.kListener
{

    final GenericSelectDialog this$0;
    final int val$token;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (GenericSelectDialog.access$000(GenericSelectDialog.this) != null)
        {
            GenericSelectDialog.access$000(GenericSelectDialog.this).onDialogSelect(val$token, i);
        }
        dialoginterface.dismiss();
    }

    nericSelectDialogListener()
    {
        this$0 = final_genericselectdialog;
        val$token = I.this;
        super();
    }
}
