// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.messageview;

import android.content.Intent;
import android.view.View;
import com.facebook.common.j.a;
import com.facebook.location.Coordinates;
import com.facebook.location.ab;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.ParticipantInfo;

// Referenced classes of package com.facebook.orca.messageview:
//            MessageViewFragment

class i
    implements android.view.View.OnClickListener
{

    final Message a;
    final MessageViewFragment b;

    i(MessageViewFragment messageviewfragment, Message message)
    {
        b = messageviewfragment;
        a = message;
        super();
    }

    public void onClick(View view)
    {
        view = a.n();
        view = ab.a(a.i().d(), view.b(), view.c());
        if (view != null)
        {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(view);
            if (com.facebook.common.j.a.a(b.n(), intent))
            {
                b.a(intent);
                return;
            }
        }
    }
}
