// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package android.support.v7.app:
//            AlertController, AppCompatDialog

final class val.dialog
    implements android.widget.r
{

    final val.dialog this$0;
    final AlertController val$dialog;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        nClickListener.onClick(val$dialog.mDialog, i);
        val$dialog.mDialog.dismiss();
    }

    ()
    {
        this$0 = final_;
        val$dialog = AlertController.this;
        super();
    }
}
