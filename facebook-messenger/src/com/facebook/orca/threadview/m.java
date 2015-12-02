// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.text.style.URLSpan;
import android.widget.TextView;
import com.facebook.widget.text.k;

// Referenced classes of package com.facebook.orca.threadview:
//            l, r

class m
    implements k
{

    final l a;

    m(l l1)
    {
        a = l1;
        super();
    }

    public boolean a(URLSpan urlspan, TextView textview)
    {
        if (l.a(a) != null)
        {
            return l.a(a).a(urlspan);
        } else
        {
            return false;
        }
    }
}
