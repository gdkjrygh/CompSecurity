// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

// Referenced classes of package android.support.v7.app:
//            AlertController

class val.dialog
    implements android.widget.r
{

    final val.listView this$0;
    final AlertController val$dialog;
    final ListView val$listView;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (heckedItems != null)
        {
            heckedItems[i] = val$listView.isItemChecked(i);
        }
        nCheckboxClickListener.onClick(AlertController.access$600(val$dialog), i, val$listView.isItemChecked(i));
    }

    tener()
    {
        this$0 = final_tener;
        val$listView = listview;
        val$dialog = AlertController.this;
        super();
    }
}
