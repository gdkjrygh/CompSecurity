// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.settings;

import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.settings:
//            OpenSourceLicensesActivity

private class <init> extends BaseAdapter
{

    final OpenSourceLicensesActivity this$0;

    public int getCount()
    {
        return OpenSourceLicensesActivity.access$100().size();
    }

    public <init> getItem(int i)
    {
        return (<init>)OpenSourceLicensesActivity.access$100().get(i);
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        if (view == null)
        {
            viewgroup = getLayoutInflater().inflate(0x7f030060, null);
            viewgroup.setTag(new t>((TextView)viewgroup.findViewById(0x7f070138), (TextView)viewgroup.findViewById(0x7f070139)));
        }
        view = (t>)viewgroup.getTag();
        getItem getitem = getItem(i);
        ((getItem) (view)).e.setText(getitem.le);
        ((le) (view)).nse.setText(getitem.ense);
        Linkify.addLinks(((ense) (view)).nse, 1);
        return viewgroup;
    }

    private ()
    {
        this$0 = OpenSourceLicensesActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
