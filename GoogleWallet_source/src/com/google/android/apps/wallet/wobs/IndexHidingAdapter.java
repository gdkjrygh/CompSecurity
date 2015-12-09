// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public final class IndexHidingAdapter extends ArrayAdapter
{

    private final int hidingItemIndex;

    public IndexHidingAdapter(Context context, int i, String as[], int j)
    {
        super(context, i, as);
        hidingItemIndex = j;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        if (i == hidingItemIndex)
        {
            view = new TextView(getContext());
            view.setHeight(0);
            view.setVisibility(8);
        } else
        {
            view = super.getDropDownView(i, null, viewgroup);
        }
        viewgroup.setVerticalScrollBarEnabled(false);
        return view;
    }
}
