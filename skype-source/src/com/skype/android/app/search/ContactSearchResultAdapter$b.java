// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.skype.android.app.search:
//            ContactSearchResultAdapter

private final class descriptionTextView extends com.skype.android.app.data.b
{

    private TextView descriptionTextView;
    private TextView searchTextView;
    final ContactSearchResultAdapter this$0;

    protected final void onSetData(Object obj)
    {
        searchTextView.setText(0x7f0804d9);
        descriptionTextView.setText(String.format(ContactSearchResultAdapter.access$100(ContactSearchResultAdapter.this).getString(0x7f0804bf), new Object[] {
            query.toString()
        }));
    }

    public (View view)
    {
        this$0 = ContactSearchResultAdapter.this;
        super(view);
        searchTextView = (TextView)view.findViewById(0x7f1004fd);
        descriptionTextView = (TextView)view.findViewById(0x7f1004fe);
    }
}
