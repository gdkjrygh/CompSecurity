// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.games.ui:
//            SingleItemRecyclerAdapter, GamesRecyclerAdapter

public final class ButtonRecyclerAdapter extends SingleItemRecyclerAdapter
{
    public static interface ButtonEventListener
    {

        public abstract void onButtonClicked$5d527811();
    }

    private static final class ButtonViewHolder extends SingleItemRecyclerAdapter.SingleItemViewHolder
        implements android.view.View.OnClickListener
    {

        private final Button mButtonView;

        public final void onClick(View view)
        {
            view = (ButtonRecyclerAdapter)mAdapter;
            ButtonEventListener buttoneventlistener = ((ButtonRecyclerAdapter) (view)).mListener;
            null;
            buttoneventlistener._mth5d527811();
        }

        public final void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i)
        {
            super.populateViews(gamesrecycleradapter, i);
            gamesrecycleradapter = (ButtonRecyclerAdapter)mAdapter;
            mButtonView.setText(((ButtonRecyclerAdapter) (gamesrecycleradapter)).mButtonTextResId);
        }

        public ButtonViewHolder(View view)
        {
            super(view);
            mButtonView = (Button)view.findViewById(0x7f0d011b);
            mButtonView.setOnClickListener(this);
        }
    }


    private final Object mButtonTag = null;
    public int mButtonTextResId;
    private final ButtonEventListener mListener;

    public ButtonRecyclerAdapter(Context context, ButtonEventListener buttoneventlistener)
    {
        super(context);
        mListener = (ButtonEventListener)Preconditions.checkNotNull(buttoneventlistener);
    }

    public final int getItemViewType()
    {
        return 0x7f04004a;
    }

    protected final SingleItemRecyclerAdapter.SingleItemViewHolder onCreateItemViewHolder(ViewGroup viewgroup)
    {
        return new ButtonViewHolder(mInflater.inflate(0x7f04004a, viewgroup, false));
    }



}
