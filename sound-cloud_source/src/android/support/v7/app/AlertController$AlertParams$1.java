// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

class val.listView extends ArrayAdapter
{

    final val.listView this$0;
    final ListView val$listView;

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = super.getView(i, view, viewgroup);
        if (heckedItems != null && heckedItems[i])
        {
            val$listView.setItemChecked(i, true);
        }
        return view;
    }

    (int i, int j, CharSequence acharsequence[], ListView listview)
    {
        this$0 = final_;
        val$listView = listview;
        super(Context.this, i, j, acharsequence);
    }
}
