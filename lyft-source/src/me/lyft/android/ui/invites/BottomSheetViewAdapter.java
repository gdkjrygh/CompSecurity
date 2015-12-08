// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.invites;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class BottomSheetViewAdapter extends BaseAdapter
{

    private static final int POSITION_GRAVITY[] = {
        3, 17, 5
    };
    private final List data = new ArrayList();
    private final LayoutInflater inflater;

    public BottomSheetViewAdapter(LayoutInflater layoutinflater)
    {
        inflater = layoutinflater;
    }

    public int getCount()
    {
        return data.size();
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public SocialIntentProvider.ShareItem getItem(int i)
    {
        return (SocialIntentProvider.ShareItem)data.get(i);
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        SocialIntentProvider.ShareItem shareitem;
        if (view == null)
        {
            view = inflater.inflate(0x7f03012b, viewgroup, false);
            viewgroup = new ViewHolder(view);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (ViewHolder)view.getTag();
        }
        shareitem = getItem(i);
        ((ViewHolder) (viewgroup)).icon.setImageResource(shareitem.iconResId);
        ((ViewHolder) (viewgroup)).text.setText(shareitem.titleResId);
        ((ViewHolder) (viewgroup)).view.setGravity(POSITION_GRAVITY[i % 3]);
        return view;
    }

    public void swapData(List list)
    {
        data.clear();
        if (list != null)
        {
            data.addAll(list);
        }
        notifyDataSetChanged();
    }


    private class ViewHolder
    {

        ImageView icon;
        TextView text;
        LinearLayout view;

        ViewHolder(View view1)
        {
            ButterKnife.a(this, view1);
            view = (LinearLayout)view1;
        }
    }

}
