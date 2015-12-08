// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker.Search;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.skype.android.widget.SymbolView;

public class MediaPickerSearchSuggestionsViewHolder extends android.support.v7.widget.RecyclerView.v
{

    public SymbolView suggestionImage;
    public LinearLayout suggestionLayout;
    public TextView suggestionText;

    public MediaPickerSearchSuggestionsViewHolder(View view)
    {
        super(view);
        suggestionLayout = (LinearLayout)view.findViewById(0x7f10041f);
        suggestionImage = (SymbolView)view.findViewById(0x7f100420);
        suggestionText = (TextView)view.findViewById(0x7f100421);
    }
}
