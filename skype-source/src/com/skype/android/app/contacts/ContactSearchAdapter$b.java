// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactSearchAdapter, ContactItem, ContactAdapterViewBuilder

final class title extends com.skype.android.app.data.der
{

    final ContactSearchAdapter this$0;
    public TextView title;

    protected final void onSetData(Object obj)
    {
        viewBuilder.bindSearchResultView(this, context, (ContactItem)obj, "");
    }

    public er(View view)
    {
        this$0 = ContactSearchAdapter.this;
        super(view);
        title = (TextView)view.findViewById(0x7f1004f9);
    }
}
