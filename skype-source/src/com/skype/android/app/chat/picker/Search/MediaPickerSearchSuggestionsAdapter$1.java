// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker.Search;

import android.view.View;

// Referenced classes of package com.skype.android.app.chat.picker.Search:
//            MediaPickerSearchSuggestionsAdapter, MediaPickerSearchSuggestionsItem

final class val.mediaPickerSearchSuggestionsItem
    implements android.view.rSearchSuggestionsAdapter._cls1
{

    final MediaPickerSearchSuggestionsAdapter this$0;
    final MediaPickerSearchSuggestionsItem val$mediaPickerSearchSuggestionsItem;

    public final void onClick(View view)
    {
        if (MediaPickerSearchSuggestionsAdapter.access$000(MediaPickerSearchSuggestionsAdapter.this) != null)
        {
            MediaPickerSearchSuggestionsAdapter.access$000(MediaPickerSearchSuggestionsAdapter.this).onSuggestionClicked(val$mediaPickerSearchSuggestionsItem.getSuggestion());
        }
    }

    ggestionClickListener()
    {
        this$0 = final_mediapickersearchsuggestionsadapter;
        val$mediaPickerSearchSuggestionsItem = MediaPickerSearchSuggestionsItem.this;
        super();
    }
}
