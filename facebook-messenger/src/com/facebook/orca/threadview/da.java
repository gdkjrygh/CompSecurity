// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.text.style.URLSpan;
import com.facebook.messages.model.share.Share;

// Referenced classes of package com.facebook.orca.threadview:
//            u, ThreadViewMessageFragment, ac

class da
    implements u
{

    final ThreadViewMessageFragment a;

    da(ThreadViewMessageFragment threadviewmessagefragment)
    {
        a = threadviewmessagefragment;
        super();
    }

    public void a(Share share)
    {
        ThreadViewMessageFragment.a(a, share);
    }

    public void a(ac ac)
    {
        ThreadViewMessageFragment.a(a, ac);
    }

    public void a(ac ac, Parcelable parcelable)
    {
        ThreadViewMessageFragment.a(a, ac, parcelable);
    }

    public boolean a(URLSpan urlspan)
    {
        urlspan = new Intent("android.intent.action.VIEW", Uri.parse(urlspan.getURL()));
        ThreadViewMessageFragment.a(a, urlspan);
        return true;
    }

    public boolean b(ac ac)
    {
        return ThreadViewMessageFragment.a(a, ac, null);
    }

    public void c(ac ac)
    {
        ThreadViewMessageFragment.b(a, ac);
    }
}
