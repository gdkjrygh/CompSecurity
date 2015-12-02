// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import com.facebook.messages.model.share.Share;
import com.facebook.orca.share.c;

// Referenced classes of package com.facebook.orca.threadview:
//            l, r

class p
    implements c
{

    final boolean a;
    final l b;

    p(l l1, boolean flag)
    {
        b = l1;
        a = flag;
        super();
    }

    public void a(Share share)
    {
label0:
        {
            if (l.a(b) != null)
            {
                if (!a)
                {
                    break label0;
                }
                l.a(b).a(l.b(b));
            }
            return;
        }
        l.a(b).a(share);
    }
}
