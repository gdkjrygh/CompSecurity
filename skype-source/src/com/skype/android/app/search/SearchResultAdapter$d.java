// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.skype.android.app.search:
//            SearchResultAdapter

private final class textView extends com.skype.android.app.data.lder
{

    private TextView textView;
    final SearchResultAdapter this$0;

    protected final void onSetData(Object obj)
    {
        textView.setText(getHeaderText());
    }

    public er(View view)
    {
        this$0 = SearchResultAdapter.this;
        super(view);
        textView = (TextView)view.findViewById(0x7f1004fb);
    }
}
