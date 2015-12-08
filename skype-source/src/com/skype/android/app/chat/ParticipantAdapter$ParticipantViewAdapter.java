// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.skype.Contact;

// Referenced classes of package com.skype.android.app.chat:
//            ParticipantAdapter

public class this._cls0 extends com.skype.android.app.data.this._cls0
{

    final ParticipantAdapter this$0;

    protected int getItemId(Contact contact)
    {
        return contact.getObjectID();
    }

    protected volatile int getItemId(Object obj)
    {
        return getItemId((Contact)obj);
    }

    protected View onCreateView(ViewGroup viewgroup)
    {
        return LayoutInflater.from(viewgroup.getContext()).inflate(0x7f0300c9, viewgroup, false);
    }

    protected getItemId onCreateViewHolder(View view)
    {
        return new getItemId(ParticipantAdapter.this, view);
    }

    protected volatile com.skype.android.app.data.this._cls0 onCreateViewHolder(View view)
    {
        return onCreateViewHolder(view);
    }

    public ()
    {
        this$0 = ParticipantAdapter.this;
        super();
    }
}
