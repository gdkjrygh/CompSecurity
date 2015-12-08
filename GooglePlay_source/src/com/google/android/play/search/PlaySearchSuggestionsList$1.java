// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.search;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

// Referenced classes of package com.google.android.play.search:
//            PlaySearchSuggestionsList

final class this._cls0 extends LinearLayoutManager
{

    final PlaySearchSuggestionsList this$0;

    public final View onInterceptFocusSearch(View view, int i)
    {
        if (i == 130)
        {
            int k = getPosition(view);
            android.support.v7.widget.st._cls1 _lcls1;
            int j;
            if (super.RecyclerView != null)
            {
                _lcls1 = super.RecyclerView.mAdapter;
            } else
            {
                _lcls1 = null;
            }
            if (_lcls1 != null)
            {
                j = _lcls1.Count();
            } else
            {
                j = 0;
            }
            if (k >= j - 1)
            {
                return view;
            }
        }
        return super.onInterceptFocusSearch(view, i);
    }

    (Context context)
    {
        this$0 = PlaySearchSuggestionsList.this;
        super();
    }
}
