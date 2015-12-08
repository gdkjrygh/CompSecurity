// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

// Referenced classes of package com.google.android.gms.games.ui:
//            SingleItemRecyclerAdapter, GamesRecyclerAdapter

public final class ErrorStateItemAdapter extends SingleItemRecyclerAdapter
{
    public static interface ErrorStateItemEventListener
    {

        public abstract void onErrorStateItemClicked();
    }

    private final class SnapshotNullStateViewHolder extends SingleItemRecyclerAdapter.SingleItemViewHolder
        implements android.view.View.OnClickListener
    {

        private TextView mGenericErrorView;
        private TextView mNetworkErrorView;
        final ErrorStateItemAdapter this$0;

        public final void onClick(View view)
        {
            view = (ErrorStateItemAdapter)mAdapter;
            if (((ErrorStateItemAdapter) (view)).mErrorStateItemEventListener == null)
            {
                return;
            } else
            {
                ((ErrorStateItemAdapter) (view)).mErrorStateItemEventListener.onErrorStateItemClicked();
                return;
            }
        }

        public final void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i)
        {
            super.populateViews(gamesrecycleradapter, i);
            switch (mViewState)
            {
            default:
                mNetworkErrorView.setVisibility(8);
                mGenericErrorView.setVisibility(0);
                return;

            case 5: // '\005'
                mNetworkErrorView.setVisibility(0);
                break;
            }
            mGenericErrorView.setVisibility(8);
        }

        public SnapshotNullStateViewHolder(View view)
        {
            this$0 = ErrorStateItemAdapter.this;
            super(view);
            mNetworkErrorView = (TextView)view.findViewById(0x7f0d01a7);
            mGenericErrorView = (TextView)view.findViewById(0x7f0d01a8);
            view.setOnClickListener(this);
        }
    }


    protected ErrorStateItemEventListener mErrorStateItemEventListener;
    public int mViewState;

    public ErrorStateItemAdapter(Context context)
    {
        super(context);
    }

    public final int getItemViewType()
    {
        return 0x7f04007e;
    }

    protected final SingleItemRecyclerAdapter.SingleItemViewHolder onCreateItemViewHolder(ViewGroup viewgroup)
    {
        return new SnapshotNullStateViewHolder(mInflater.inflate(0x7f04007e, viewgroup, false));
    }

    public final void setErrorStateItemEventListener(ErrorStateItemEventListener errorstateitemeventlistener)
    {
        mErrorStateItemEventListener = errorstateitemeventlistener;
    }

}
