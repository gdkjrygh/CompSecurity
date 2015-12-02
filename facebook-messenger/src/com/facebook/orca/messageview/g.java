// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.messageview;

import android.view.View;
import com.facebook.zero.a.c;
import com.facebook.zero.ui.l;

// Referenced classes of package com.facebook.orca.messageview:
//            MessageViewFragment

class g
    implements android.view.View.OnClickListener
{

    final MessageViewFragment a;

    g(MessageViewFragment messageviewfragment)
    {
        a = messageviewfragment;
        super();
    }

    public void onClick(View view)
    {
        com.facebook.orca.messageview.MessageViewFragment.c(a).a(c.i, a.p());
    }
}
