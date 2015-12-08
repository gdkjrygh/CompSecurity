// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendshare;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.List;

public class IconTextGridAdapter extends android.support.v7.widget.RecyclerView.Adapter
{

    private final OnItemClickListener itemClickListener;
    private List itemList;

    public IconTextGridAdapter(OnItemClickListener onitemclicklistener)
    {
        itemList = Collections.EMPTY_LIST;
        itemClickListener = onitemclicklistener;
    }

    public int getItemCount()
    {
        return itemList.size();
    }

    public volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
    {
        onBindViewHolder((SendShareTargetViewHolder)viewholder, i);
    }

    public void onBindViewHolder(SendShareTargetViewHolder sendsharetargetviewholder, int i)
    {
        sendsharetargetviewholder.bind((com.pinterest.adapter.IconTextListAdapter.IconText)itemList.get(i));
    }

    public volatile android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return onCreateViewHolder(viewgroup, i);
    }

    public SendShareTargetViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return new SendShareTargetViewHolder(LayoutInflater.from(viewgroup.getContext()).inflate(0x7f0301fe, viewgroup, false));
    }

    public void setItems(List list)
    {
        itemList = list;
    }


    private class SendShareTargetViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        ImageView _iconIv;
        com.pinterest.adapter.IconTextListAdapter.IconText _item;
        TextView _textTv;
        final IconTextGridAdapter this$0;

        public void bind(com.pinterest.adapter.IconTextListAdapter.IconText icontext)
        {
            _item = icontext;
            _textTv.setText(icontext.text);
            _iconIv.setImageDrawable(icontext.icon);
            _iconIv.setBackgroundResource(0x7f0e00b0);
            int i = (int)_iconIv.getResources().getDimension(0x7f0a0161);
            _iconIv.setPadding(i, i, i, i);
        }

        public SendShareTargetViewHolder(View view)
        {
            this$0 = IconTextGridAdapter.this;
            super(view);
            ButterKnife.a(this, view);
            class _cls1
                implements android.view.View.OnClickListener
            {

                final SendShareTargetViewHolder this$1;
                final IconTextGridAdapter val$this$0;

                public void onClick(View view1)
                {
                    itemClickListener.onItemClick(_item);
                }


// JavaClassFileOutputException: Invalid index accessing method local variables table of <init>

                private class OnItemClickListener
                {

                    public abstract void onItemClick(com.pinterest.adapter.IconTextListAdapter.IconText icontext);
                }

            }

            view.setOnClickListener(new _cls1());
        }
    }

}
