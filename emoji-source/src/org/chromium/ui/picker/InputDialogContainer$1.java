// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.picker;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package org.chromium.ui.picker:
//            InputDialogContainer, DateTimeSuggestionListAdapter, DateTimeSuggestion

class val.step
    implements android.widget.Listener
{

    final InputDialogContainer this$0;
    final DateTimeSuggestionListAdapter val$adapter;
    final int val$dialogType;
    final double val$dialogValue;
    final double val$max;
    final double val$min;
    final double val$step;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (i == val$adapter.getCount() - 1)
        {
            dismissDialog();
            showPickerDialog(val$dialogType, val$dialogValue, val$min, val$max, val$step);
            return;
        } else
        {
            double d = ((DateTimeSuggestion)val$adapter.getItem(i)).value();
            InputDialogContainer.access$000(InputDialogContainer.this).replaceDateTime(d);
            dismissDialog();
            InputDialogContainer.access$102(InputDialogContainer.this, true);
            return;
        }
    }

    dapter()
    {
        this$0 = final_inputdialogcontainer;
        val$adapter = datetimesuggestionlistadapter;
        val$dialogType = i;
        val$dialogValue = d;
        val$min = d1;
        val$max = d2;
        val$step = D.this;
        super();
    }
}
