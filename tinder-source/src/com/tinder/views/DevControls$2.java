// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.support.v4.g.g;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

// Referenced classes of package com.tinder.views:
//            DevControls

class t> extends BaseAdapter
{

    final DevControls this$0;

    public boolean areAllItemsEnabled()
    {
        return true;
    }

    public int getCount()
    {
        return DevControls.access$000(DevControls.this).size();
    }

    public vPanelStatusRunnable getItem(int i)
    {
        return (vPanelStatusRunnable)DevControls.access$000(DevControls.this).get(i);
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        vPanelStatusRunnable vpanelstatusrunnable = getItem(i);
        View view1 = view;
        if (view == null)
        {
            view1 = LayoutInflater.from(getContext()).inflate(0x7f03007f, viewgroup, false);
            view1.setOnClickListener(vpanelstatusrunnable);
        }
        view = vpanelstatusrunnable.run();
        ((TextView)view1.findViewById(0x7f0e01fb)).setText((CharSequence)((g) (view)).a);
        ((TextView)view1.findViewById(0x7f0e01b3)).setText((CharSequence)((g) (view)).b);
        return view1;
    }

    public int getViewTypeCount()
    {
        return 1;
    }

    public boolean hasStableIds()
    {
        return false;
    }

    public boolean isEmpty()
    {
        return DevControls.access$000(DevControls.this).isEmpty();
    }

    public boolean isEnabled(int i)
    {
        return true;
    }

    vPanelStatusRunnable()
    {
        this$0 = DevControls.this;
        super();
    }
}
