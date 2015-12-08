// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.history;

import android.content.Context;
import android.content.SearchRecentSuggestionsProvider;
import com.google.android.apps.unveil.g;

public class SuggestionProvider extends SearchRecentSuggestionsProvider
{

    public SuggestionProvider()
    {
    }

    public boolean onCreate()
    {
        setupSuggestions(getContext().getString(g.suggestion_provider_authority), 1);
        return super.onCreate();
    }
}
