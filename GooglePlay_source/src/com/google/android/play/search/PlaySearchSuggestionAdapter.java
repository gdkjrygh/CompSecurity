// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.search;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.play.search:
//            PlaySearchSuggestionModel, PlaySearchController, PlaySearchOneSuggestion, PlaySearchListener

public final class PlaySearchSuggestionAdapter extends android.support.v7.widget.RecyclerView.Adapter
{
    public static final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        public PlaySearchOneSuggestion oneSuggestionView;

        public ViewHolder(PlaySearchOneSuggestion playsearchonesuggestion)
        {
            super(playsearchonesuggestion);
            oneSuggestionView = playsearchonesuggestion;
        }
    }


    PlaySearchController mController;
    final List mItems = new ArrayList();

    public PlaySearchSuggestionAdapter()
    {
    }

    public final int getItemCount()
    {
        return mItems.size();
    }

    public final volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
    {
        viewholder = ((ViewHolder)viewholder).oneSuggestionView;
        final PlaySearchSuggestionModel model = (PlaySearchSuggestionModel)mItems.get(i);
        viewholder.bindSuggestion(model, null, mController.mCurrentQuery);
        viewholder.setOnClickListener(new android.view.View.OnClickListener() {

            final PlaySearchSuggestionAdapter this$0;
            final PlaySearchSuggestionModel val$model;

            public final void onClick(View view)
            {
                if (mController != null)
                {
                    view = mController;
                    view.setQueryInternal(model.displayText, false);
                    for (int j = ((PlaySearchController) (view)).mListeners.size() - 1; j >= 0; j--)
                    {
                        ((PlaySearchListener)((PlaySearchController) (view)).mListeners.get(j)).onSuggestionClicked$299d808f();
                    }

                }
            }

            
            {
                this$0 = PlaySearchSuggestionAdapter.this;
                model = playsearchsuggestionmodel;
                super();
            }
        });
    }

    public final volatile android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return new ViewHolder((PlaySearchOneSuggestion)LayoutInflater.from(viewgroup.getContext()).inflate(0x7f04012a, viewgroup, false));
    }
}
