// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            SearchView

final class this._cls0
    implements android.view.hangeListener
{

    final SearchView this$0;

    public final void onFocusChange(View view, boolean flag)
    {
        if (SearchView.access$200(SearchView.this) != null)
        {
            SearchView.access$200(SearchView.this).onFocusChange(SearchView.this, flag);
        }
    }

    ()
    {
        this$0 = SearchView.this;
        super();
    }
}
