// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.views;

import android.widget.AutoCompleteTextView;

// Referenced classes of package com.accuweather.android.views:
//            SimpleSearchView

class this._cls0
    implements Runnable
{

    final SimpleSearchView this$0;

    public void run()
    {
        if (SimpleSearchView.access$100(SimpleSearchView.this) != null)
        {
            SimpleSearchView.access$000(SimpleSearchView.this).clearFocus();
            SimpleSearchView.access$000(SimpleSearchView.this).addTextChangedListener(SimpleSearchView.access$100(SimpleSearchView.this));
        }
    }

    ()
    {
        this$0 = SimpleSearchView.this;
        super();
    }
}
