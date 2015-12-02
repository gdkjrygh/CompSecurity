// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.messageview;

import android.widget.TextView;
import com.facebook.orca.common.ui.a.b;
import com.facebook.orca.k.d;
import com.google.common.d.a.h;

// Referenced classes of package com.facebook.orca.messageview:
//            MessageViewFragment

class j
    implements h
{

    final MessageViewFragment a;

    j(MessageViewFragment messageviewfragment)
    {
        a = messageviewfragment;
        super();
    }

    public void a(d d1)
    {
        MessageViewFragment.a(a, null);
        d1 = com.facebook.orca.messageview.MessageViewFragment.d(a).a(d1.a(), d1.b());
        if (d1 != null)
        {
            MessageViewFragment.e(a).setText(d1);
        }
    }

    public volatile void a(Object obj)
    {
        a((d)obj);
    }

    public void a(Throwable throwable)
    {
        MessageViewFragment.a(a, null);
    }
}
