// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import com.facebook.orca.threadview.aw;
import com.facebook.orca.threadview.ax;

// Referenced classes of package com.facebook.contacts.contactcard:
//            NameConversationView

class av extends aw
{

    final NameConversationView a;

    av(NameConversationView nameconversationview)
    {
        a = nameconversationview;
        super();
    }

    public void a(ax ax1, String s)
    {
        if (ax1 == ax.CHANGE)
        {
            NameConversationView.a(a, s);
            NameConversationView.c(a);
        }
    }
}
