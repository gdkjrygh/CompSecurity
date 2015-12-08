// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker.Search;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.skype.android.widget.SymbolView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.skype.android.app.chat.picker.Search:
//            MediaPickerSearchSuggestionsItem, MediaPickerSearchSuggestionsViewHolder

public class MediaPickerSearchSuggestionsAdapter extends android.support.v7.widget.RecyclerView.a
{
    public static interface SuggestionClickListener
    {

        public abstract void onSuggestionClicked(String s);
    }


    private Context context;
    private boolean hideLabelText;
    private List mediaPickerSearchSuggestionsItems;
    private SuggestionClickListener suggestionClickListener;

    public MediaPickerSearchSuggestionsAdapter(Context context1, SuggestionClickListener suggestionclicklistener)
    {
        mediaPickerSearchSuggestionsItems = new ArrayList();
        hideLabelText = false;
        context = context1;
        suggestionClickListener = suggestionclicklistener;
        addSuggestion("Greetings", com.skype.android.widget.SymbolElement.SymbolCode.gd, 0x7f0f00d3);
        addSuggestion("Happy", com.skype.android.widget.SymbolElement.SymbolCode.ga, 0x7f0f011c);
        addSuggestion("Love", com.skype.android.widget.SymbolElement.SymbolCode.gb, 0x7f0f011f);
        addSuggestion("Angry", com.skype.android.widget.SymbolElement.SymbolCode.gc, 0x7f0f0120);
        addSuggestion("Confused", com.skype.android.widget.SymbolElement.SymbolCode.ge, 0x7f0f0126);
        addSuggestion("Disgust", com.skype.android.widget.SymbolElement.SymbolCode.gf, 0x7f0f0100);
        if (!context1.getResources().getConfiguration().locale.toString().startsWith("en_"))
        {
            hideLabelText = true;
        }
    }

    private void addSuggestion(String s, com.skype.android.widget.SymbolElement.SymbolCode symbolcode, int i)
    {
        MediaPickerSearchSuggestionsItem mediapickersearchsuggestionsitem = new MediaPickerSearchSuggestionsItem();
        mediapickersearchsuggestionsitem.setSuggestion(s);
        mediapickersearchsuggestionsitem.setSymbolCode(symbolcode);
        mediapickersearchsuggestionsitem.setSymbolColor(context.getResources().getColor(i));
        mediaPickerSearchSuggestionsItems.add(mediapickersearchsuggestionsitem);
    }

    public int getItemCount()
    {
        return mediaPickerSearchSuggestionsItems.size();
    }

    public volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.v v, int i)
    {
        onBindViewHolder((MediaPickerSearchSuggestionsViewHolder)v, i);
    }

    public void onBindViewHolder(MediaPickerSearchSuggestionsViewHolder mediapickersearchsuggestionsviewholder, int i)
    {
        final MediaPickerSearchSuggestionsItem mediaPickerSearchSuggestionsItem = (MediaPickerSearchSuggestionsItem)mediaPickerSearchSuggestionsItems.get(i);
        mediapickersearchsuggestionsviewholder.suggestionText.setText(mediaPickerSearchSuggestionsItem.getSuggestion());
        mediapickersearchsuggestionsviewholder.suggestionImage.setSymbolCode(mediaPickerSearchSuggestionsItem.getSymbolCode());
        mediapickersearchsuggestionsviewholder.suggestionImage.setSymbolColor(mediaPickerSearchSuggestionsItem.getSymbolColor());
        mediapickersearchsuggestionsviewholder.itemView.setOnClickListener(new android.view.View.OnClickListener() {

            final MediaPickerSearchSuggestionsAdapter this$0;
            final MediaPickerSearchSuggestionsItem val$mediaPickerSearchSuggestionsItem;

            public final void onClick(View view)
            {
                if (suggestionClickListener != null)
                {
                    suggestionClickListener.onSuggestionClicked(mediaPickerSearchSuggestionsItem.getSuggestion());
                }
            }

            
            {
                this$0 = MediaPickerSearchSuggestionsAdapter.this;
                mediaPickerSearchSuggestionsItem = mediapickersearchsuggestionsitem;
                super();
            }
        });
    }

    public volatile android.support.v7.widget.RecyclerView.v onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return onCreateViewHolder(viewgroup, i);
    }

    public MediaPickerSearchSuggestionsViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        viewgroup = new MediaPickerSearchSuggestionsViewHolder(LayoutInflater.from(viewgroup.getContext()).inflate(0x7f0300ad, viewgroup, false));
        if (hideLabelText)
        {
            ((MediaPickerSearchSuggestionsViewHolder) (viewgroup)).suggestionText.setVisibility(8);
            ((MediaPickerSearchSuggestionsViewHolder) (viewgroup)).suggestionLayout.setGravity(17);
        }
        return viewgroup;
    }

}
