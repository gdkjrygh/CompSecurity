// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

// Referenced classes of package com.google.android.gms.games.ui:
//            SingleItemAdapter, GamesViewHolder, GamesBaseAdapter

public final class HeaderItemAdapter extends SingleItemAdapter
{
    private final class ViewHolder extends GamesViewHolder
    {

        final View mButton;
        final TextView mButtonTextView;
        final View mContentView;
        final TextView mSubtitleTextView;
        final TextView mTitleTextView;
        final HeaderItemAdapter this$0;

        public ViewHolder(GamesBaseAdapter gamesbaseadapter, View view)
        {
            this$0 = HeaderItemAdapter.this;
            super(gamesbaseadapter);
            mContentView = view.findViewById(0x7f0d0123);
            mTitleTextView = (TextView)view.findViewById(0x7f0d02a9);
            mSubtitleTextView = (TextView)view.findViewById(0x7f0d02aa);
            mButton = view.findViewById(0x7f0d02ab);
            mButtonTextView = (TextView)view.findViewById(0x7f0d02ac);
        }
    }


    private final Context mContext;
    private final LayoutInflater mInflater;
    private String mTitle;

    public HeaderItemAdapter(Context context)
    {
        mContext = context;
        mInflater = (LayoutInflater)context.getSystemService("layout_inflater");
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = mInflater.inflate(0x7f0400e3, viewgroup, false);
            viewgroup = new ViewHolder(this, view);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (ViewHolder)view.getTag();
        }
        ((ViewHolder) (viewgroup)).mTitleTextView.setText(((ViewHolder) (viewgroup))._fld0.mTitle);
        if (!TextUtils.isEmpty(null))
        {
            ((ViewHolder) (viewgroup)).mSubtitleTextView.setVisibility(0);
            ((ViewHolder) (viewgroup)).mSubtitleTextView.setText(null);
        } else
        {
            ((ViewHolder) (viewgroup)).mSubtitleTextView.setVisibility(8);
        }
        ((ViewHolder) (viewgroup)).mContentView.setOnClickListener(null);
        ((ViewHolder) (viewgroup)).mContentView.setClickable(false);
        ((ViewHolder) (viewgroup)).mContentView.setFocusable(false);
        ((ViewHolder) (viewgroup)).mButton.setVisibility(8);
        return view;
    }

    public final void setTitle(int i)
    {
        mTitle = mContext.getString(i);
        notifyDataSetChanged();
    }
}
