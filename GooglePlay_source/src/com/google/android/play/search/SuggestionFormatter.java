// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.search;

import android.content.Context;
import android.text.Spannable;
import android.text.style.TextAppearanceSpan;

public abstract class SuggestionFormatter
{

    private final Context mContext;

    protected SuggestionFormatter(Context context)
    {
        mContext = context;
    }

    protected final void applyTextStyle(int i, Spannable spannable, int j, int k)
    {
        if (j != k)
        {
            spannable.setSpan(new TextAppearanceSpan(mContext, i), j, k, 0);
        }
    }

    protected abstract CharSequence formatSuggestion(String s, String s1, int i, int j);
}
