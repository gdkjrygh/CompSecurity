// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactAdapter, ContactItem

public class this._cls0 extends com.skype.android.app.data.ter
{

    final ContactAdapter this$0;

    protected int getItemId(Object obj)
    {
        return ((ContactItem)obj).getContactObjectId();
    }

    protected View onCreateView(ViewGroup viewgroup)
    {
        return LayoutInflater.from(context).inflate(ContactAdapter.access$300(ContactAdapter.this), viewgroup, false);
    }

    protected this._cls0 onCreateViewHolder(View view)
    {
        return new init>(ContactAdapter.this, view);
    }

    protected volatile com.skype.android.app.data.ter onCreateViewHolder(View view)
    {
        return onCreateViewHolder(view);
    }

    public ()
    {
        this$0 = ContactAdapter.this;
        super();
    }
}
