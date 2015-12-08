// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.view.View;
import com.skype.Contact;
import com.skype.android.app.Navigation;

// Referenced classes of package com.skype.android.app.chat:
//            e

final class val.contact
    implements android.view..OnClickListener
{

    final e this$0;
    final Contact val$contact;

    public final void onClick(View view)
    {
        navigation.chatWithUpAsBack(val$contact.getIdentity(), false);
    }

    n()
    {
        this$0 = final_e1;
        val$contact = Contact.this;
        super();
    }
}
