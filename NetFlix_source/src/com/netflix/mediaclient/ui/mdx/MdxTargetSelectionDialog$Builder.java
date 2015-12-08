// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.mdx:
//            MdxTargetSelectionDialog

public static class setCancelable extends android.app.tionDialog.Builder
{

    private final Activity activity;
    private final dapter adapterWrapper;
    private final View content;
    private final ListView listView;
    private final TextView title;

    public AlertDialog create()
    {
        AlertDialog alertdialog = (new android.app.tionDialog.Builder(activity)).activity(content).content();
        alertdialog.setCanceledOnTouchOutside(true);
        return alertdialog;
    }

    public void setAdapterData(List list)
    {
        adapterWrapper.setData(list);
    }

    public void setOnItemClickListener(final android.widget.nDialog.Builder listener)
    {
        listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final MdxTargetSelectionDialog.Builder this$0;
            final android.widget.AdapterView.OnItemClickListener val$listener;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                adapterWrapper.notifyDataSetChanged();
                listener.onItemClick(adapterview, view, i, l);
            }

            
            {
                this$0 = MdxTargetSelectionDialog.Builder.this;
                listener = onitemclicklistener;
                super();
            }
        });
    }

    public void setSelection(int i, String s)
    {
        adapterWrapper.setSelected(i, s);
    }

    public volatile android.app.tionDialog.Builder setTitle(int i)
    {
        return setTitle(i);
    }

    public setTitle setTitle(int i)
    {
        title.setText(i);
        return this;
    }


    public _cls1.val.listener(Activity activity1)
    {
        super(activity1);
        activity = activity1;
        int _tmp = MdxTargetSelectionDialog.access$002(activity1.getResources().getColor(0x7f090046));
        int _tmp1 = MdxTargetSelectionDialog.access$102(activity1.getResources().getColor(0x7f090045));
        activity1 = activity1.getLayoutInflater();
        content = activity1.inflate(0x7f03005c, null);
        title = (TextView)content.findViewById(0x7f070131);
        listView = (ListView)content.findViewById(0x7f070132);
        adapterWrapper = new dapter(activity1);
        listView.setAdapter(adapterWrapper);
        setCancelable(true);
    }
}
