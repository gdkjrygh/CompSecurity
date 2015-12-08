// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker.Search;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class MediaPickerSearchSuggestionItemSpacing extends android.support.v7.widget.RecyclerView.g
{

    private int spacing;

    public MediaPickerSearchSuggestionItemSpacing(int i)
    {
        spacing = i;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.s s)
    {
        rect.left = spacing;
        rect.right = spacing;
        rect.bottom = spacing;
        if (recyclerview.getChildLayoutPosition(view) == 0 || recyclerview.getChildLayoutPosition(view) == 1)
        {
            rect.top = spacing;
        }
    }
}
