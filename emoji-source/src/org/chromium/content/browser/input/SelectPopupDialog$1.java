// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser.input;

import android.content.DialogInterface;
import android.widget.ListView;

// Referenced classes of package org.chromium.content.browser.input:
//            SelectPopupDialog

class val.listView
    implements android.content.ickListener
{

    final SelectPopupDialog this$0;
    final ListView val$listView;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        SelectPopupDialog.access$100(SelectPopupDialog.this, SelectPopupDialog.access$000(val$listView));
    }

    ()
    {
        this$0 = final_selectpopupdialog;
        val$listView = ListView.this;
        super();
    }
}
