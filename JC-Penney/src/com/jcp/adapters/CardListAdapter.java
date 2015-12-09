// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.jcp.model.CardDetails;
import com.jcp.util.bl;
import java.util.List;

public class CardListAdapter extends BaseAdapter
{

    private static final Integer a = Integer.valueOf(2);
    private List b;
    private LayoutInflater c;

    public CardListAdapter(Context context, List list)
    {
        c = LayoutInflater.from(context);
        b = list;
    }

    public int getCount()
    {
        return b.size();
    }

    public Object getItem(int i)
    {
        return a;
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        return !((CardDetails)b.get(i)).isDefault() ? 1 : 0;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Object obj = null;
        String s;
        CardDetails carddetails;
        if (view == null)
        {
            view = c.inflate(0x7f0300db, null);
            viewgroup = new ViewHolder(view);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (ViewHolder)view.getTag();
        }
        carddetails = (CardDetails)b.get(i);
        s = obj;
        if (!TextUtils.isEmpty(carddetails.getCardYY()))
        {
            s = obj;
            if (4 <= carddetails.getCardYY().length())
            {
                s = (new StringBuilder()).append(carddetails.getCardMM()).append("/").append(carddetails.getCardYY().substring(2, 4)).toString();
            }
        }
        if (carddetails.isDefault())
        {
            ((ViewHolder) (viewgroup)).defaultText.setVisibility(0);
        } else
        {
            ((ViewHolder) (viewgroup)).defaultText.setVisibility(4);
        }
        ((ViewHolder) (viewgroup)).tvCardnumbar.setText((new StringBuilder()).append("#").append(carddetails.getCardNumber()).toString());
        bl.a(carddetails.getType(), s, ((ViewHolder) (viewgroup)).tvCardmmyy, ((ViewHolder) (viewgroup)).ivIcon);
        view.setTag(viewgroup);
        return view;
    }

    public int getViewTypeCount()
    {
        return a.intValue();
    }


    private class ViewHolder
    {

        protected TextView defaultText;
        protected ImageView ivIcon;
        protected TextView tvCardmmyy;
        protected TextView tvCardnumbar;

        public ViewHolder(View view)
        {
            ButterKnife.inject(this, view);
        }
    }

}
