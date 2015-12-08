// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactSearchAdapter

public class this._cls0 extends com.skype.android.app.data.ter
{

    final ContactSearchAdapter this$0;

    protected int getItemId(Object obj)
    {
        return ~obj.toString().charAt(0);
    }

    protected View onCreateView(ViewGroup viewgroup)
    {
        return LayoutInflater.from(context).inflate(0x7f0300f5, viewgroup, false);
    }

    protected this._cls0 onCreateViewHolder(View view)
    {
        return new this._cls0(ContactSearchAdapter.this, view);
    }

    protected volatile com.skype.android.app.data.ter onCreateViewHolder(View view)
    {
        return onCreateViewHolder(view);
    }

    public ()
    {
        this$0 = ContactSearchAdapter.this;
        super();
    }
}
