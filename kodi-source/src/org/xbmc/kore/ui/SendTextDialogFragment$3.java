// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.app.Dialog;
import android.view.View;
import android.view.Window;

// Referenced classes of package org.xbmc.kore.ui:
//            SendTextDialogFragment

class val.dialog
    implements android.view.r
{

    final SendTextDialogFragment this$0;
    final Dialog val$dialog;

    public void onFocusChange(View view, boolean flag)
    {
        if (flag)
        {
            val$dialog.getWindow().setSoftInputMode(5);
        }
    }

    ()
    {
        this$0 = final_sendtextdialogfragment;
        val$dialog = Dialog.this;
        super();
    }
}
