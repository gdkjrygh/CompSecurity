// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.content.Context;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.games.ui.appcontent.AppContentUtils;
import com.google.android.gms.games.ui.appcontent.ExtendedAppContentSection;
import com.google.android.gms.games.ui.appcontent.TextViewLayoutSlot;
import com.google.android.gms.games.ui.layouts.LayoutSlot;
import java.util.Collection;

// Referenced classes of package com.google.android.gms.games.ui:
//            SingleItemRecyclerAdapter, GamesRecyclerAdapter

public final class HeaderItemRecyclerAdapter extends SingleItemRecyclerAdapter
{
    public static interface HeaderEventListener
    {

        public abstract void onHeaderClicked(String s);
    }

    private static final class HeaderItemViewHolder extends SingleItemRecyclerAdapter.SingleItemViewHolder
        implements android.view.View.OnClickListener, com.google.android.gms.games.ui.layouts.LayoutSlot.LayoutSlotProvider
    {

        private final View mButton;
        private final TextView mButtonTextView;
        private final View mContentView;
        private ArrayMap mLayoutSlots;
        private final TextView mSubtitleTextView;
        private final TextView mTitleTextView;

        public final LayoutSlot getLayoutSlot(String s)
        {
            return (LayoutSlot)mLayoutSlots.get(s);
        }

        public final Collection getLayoutSlots()
        {
            return mLayoutSlots.values();
        }

        public final void onClick(View view)
        {
            view = (HeaderItemRecyclerAdapter)mAdapter;
            if (((HeaderItemRecyclerAdapter) (view)).mHeaderEventListener != null && ((HeaderItemRecyclerAdapter) (view)).mShowButton)
            {
                ((HeaderItemRecyclerAdapter) (view)).mHeaderEventListener.onHeaderClicked(((HeaderItemRecyclerAdapter) (view)).mButtonTag);
            }
        }

        public final void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i)
        {
            super.populateViews(gamesrecycleradapter, i);
            gamesrecycleradapter = (HeaderItemRecyclerAdapter)mAdapter;
            if (((HeaderItemRecyclerAdapter) (gamesrecycleradapter)).mAppContentSection != null)
            {
                gamesrecycleradapter = ((HeaderItemRecyclerAdapter) (gamesrecycleradapter)).mAppContentSection;
                AppContentUtils.resetLayoutSlots(this);
                AppContentUtils.populateLayoutSlots(gamesrecycleradapter, this);
                AppContentUtils.setupLogflowAndImpressView$5256e446(mButtonTextView, mAdapter, gamesrecycleradapter);
                return;
            }
            mTitleTextView.setText(((HeaderItemRecyclerAdapter) (gamesrecycleradapter)).mTitle);
            if (!TextUtils.isEmpty(((HeaderItemRecyclerAdapter) (gamesrecycleradapter)).mSubtitle))
            {
                mSubtitleTextView.setVisibility(0);
                mSubtitleTextView.setText(((HeaderItemRecyclerAdapter) (gamesrecycleradapter)).mSubtitle);
            } else
            {
                mSubtitleTextView.setVisibility(8);
            }
            mContentView.setFocusable(true);
            if (((HeaderItemRecyclerAdapter) (gamesrecycleradapter)).mShowButton)
            {
                mButtonTextView.setOnClickListener(this);
                mButtonTextView.setTag(((HeaderItemRecyclerAdapter) (gamesrecycleradapter)).mButtonTag);
                mButton.setVisibility(0);
                mButtonTextView.setText(((HeaderItemRecyclerAdapter) (gamesrecycleradapter)).mButtonText);
                mButtonTextView.setContentDescription(((HeaderItemRecyclerAdapter) (gamesrecycleradapter)).mButtonContentDescription);
                return;
            } else
            {
                mButtonTextView.setClickable(false);
                mButton.setVisibility(8);
                return;
            }
        }

        public HeaderItemViewHolder(View view)
        {
            super(view);
            mContentView = view.findViewById(0x7f0d0123);
            mTitleTextView = (TextView)view.findViewById(0x7f0d02a9);
            mSubtitleTextView = (TextView)view.findViewById(0x7f0d02aa);
            mButton = view.findViewById(0x7f0d02ab);
            mButtonTextView = (TextView)view.findViewById(0x7f0d02ac);
            mLayoutSlots = new ArrayMap();
            mLayoutSlots.put("TITLE", (new TextViewLayoutSlot(mContext, mTitleTextView)).setDefaultTextColorResId(0x7f0b02ca));
            mLayoutSlots.put("SUBTITLE", (new TextViewLayoutSlot(mContext, mSubtitleTextView)).setDefaultTextColorResId(0x7f0b02ca));
            mLayoutSlots.put("LARGE_PRIMARY_LABEL", (new TextViewLayoutSlot(mContext, mButtonTextView)).setDefaultTextColorResId(0x7f0b0065));
        }
    }


    public ExtendedAppContentSection mAppContentSection;
    private String mButtonContentDescription;
    private String mButtonTag;
    private String mButtonText;
    private HeaderEventListener mHeaderEventListener;
    private boolean mShowButton;
    private String mSubtitle;
    private String mTitle;

    public HeaderItemRecyclerAdapter(Context context)
    {
        super(context);
    }

    public final int getItemViewType()
    {
        return 0x7f0400e3;
    }

    protected final SingleItemRecyclerAdapter.SingleItemViewHolder onCreateItemViewHolder(ViewGroup viewgroup)
    {
        return new HeaderItemViewHolder(mInflater.inflate(0x7f0400e3, viewgroup, false));
    }

    public final void setButton(HeaderEventListener headereventlistener, int i, int j, String s)
    {
        String s1 = mContext.getString(i);
        String s2 = mContext.getString(j);
        mShowButton = true;
        mButtonText = s1;
        mButtonContentDescription = s2;
        mHeaderEventListener = headereventlistener;
        mButtonTag = s;
        notifySingleItemChanged();
    }

    public final void setButtonWithMoreCount(HeaderEventListener headereventlistener, String s)
    {
        mShowButton = true;
        mHeaderEventListener = headereventlistener;
        mButtonTag = s;
        notifySingleItemChanged();
    }

    public final void setMoreCount(int i)
    {
        String s = mContext.getString(0x7f1000b4, new Object[] {
            Integer.valueOf(i)
        });
        mButtonContentDescription = s;
        mButtonText = s;
        notifySingleItemChanged();
    }

    public final void setSubtitle$13462e()
    {
        mSubtitle = mContext.getString(0x7f10018d);
        notifySingleItemChanged();
    }

    public final void setTitle(int i)
    {
        setTitle(mContext.getString(i));
    }

    public final void setTitle(String s)
    {
        mTitle = s;
        notifySingleItemChanged();
    }

    public final void showButton(boolean flag)
    {
        if (mShowButton != flag)
        {
            mShowButton = flag;
            notifySingleItemChanged();
        }
    }

    public final boolean updateHeaderAdapter(int i, int j)
    {
        if (i > 0)
        {
            setVisible(true);
            i -= j;
            if (i > 0)
            {
                showButton(true);
                setMoreCount(i);
                return true;
            } else
            {
                showButton(false);
                return true;
            }
        } else
        {
            setVisible(false);
            return false;
        }
    }








}
