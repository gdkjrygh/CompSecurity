// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.messageview;

import android.content.Intent;
import android.net.Uri;
import android.text.style.URLSpan;
import android.widget.TextView;
import com.facebook.widget.text.k;
import com.facebook.zero.a.c;
import com.facebook.zero.ui.l;
import com.google.common.base.Objects;

// Referenced classes of package com.facebook.orca.messageview:
//            MessageViewFragment

class f
    implements k
{

    final MessageViewFragment a;

    f(MessageViewFragment messageviewfragment)
    {
        a = messageviewfragment;
        super();
    }

    public boolean a(URLSpan urlspan, TextView textview)
    {
        if (!Objects.equal(Uri.parse(urlspan.getURL()).getScheme(), "tel"))
        {
            urlspan = new Intent("android.intent.action.VIEW", Uri.parse(urlspan.getURL()));
            com.facebook.orca.messageview.MessageViewFragment.c(a).a(c.k, a.p(), urlspan);
            return true;
        } else
        {
            return false;
        }
    }
}
