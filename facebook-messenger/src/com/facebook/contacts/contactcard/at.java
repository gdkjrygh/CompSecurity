// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import android.view.View;

// Referenced classes of package com.facebook.contacts.contactcard:
//            NameConversationView

class at
    implements android.view.View.OnClickListener
{

    final NameConversationView a;

    at(NameConversationView nameconversationview)
    {
        a = nameconversationview;
        super();
    }

    public void onClick(View view)
    {
        NameConversationView.a(a);
    }
}
