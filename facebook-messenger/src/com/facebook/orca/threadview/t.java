// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.os.Parcelable;
import android.text.style.URLSpan;
import com.facebook.messages.model.share.Share;

// Referenced classes of package com.facebook.orca.threadview:
//            r, s, u, ad

class t
    implements r
{

    final s a;

    t(s s1)
    {
        a = s1;
        super();
    }

    public void a(Share share)
    {
        if (s.a(a) != null)
        {
            s.a(a).a(share);
        }
    }

    public void a(ad ad)
    {
        if (s.a(a) != null)
        {
            s.a(a).a(ad);
        }
    }

    public void a(ad ad, Parcelable parcelable)
    {
        if (s.a(a) != null)
        {
            s.a(a).a(ad, parcelable);
        }
    }

    public boolean a(URLSpan urlspan)
    {
        if (s.a(a) != null)
        {
            return s.a(a).a(urlspan);
        } else
        {
            return false;
        }
    }

    public boolean b(ad ad)
    {
        if (s.a(a) != null)
        {
            return s.a(a).b(ad);
        } else
        {
            return false;
        }
    }

    public void c(ad ad)
    {
        if (s.a(a) != null)
        {
            s.a(a).c(ad);
        }
    }
}
