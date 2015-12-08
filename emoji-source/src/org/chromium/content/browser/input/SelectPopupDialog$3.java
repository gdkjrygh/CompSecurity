// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser.input;

import android.app.AlertDialog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

// Referenced classes of package org.chromium.content.browser.input:
//            SelectPopupDialog

class val.listView
    implements android.widget.ickListener
{

    final SelectPopupDialog this$0;
    final ListView val$listView;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        SelectPopupDialog.access$100(SelectPopupDialog.this, SelectPopupDialog.access$000(val$listView));
        SelectPopupDialog.access$200(SelectPopupDialog.this).dismiss();
    }

    ()
    {
        this$0 = final_selectpopupdialog;
        val$listView = ListView.this;
        super();
    }
}
