// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard.entry;

import android.view.View;

// Referenced classes of package com.facebook.contacts.contactcard.entry:
//            h, k

class j
    implements android.view.View.OnClickListener
{

    final h a;

    j(h h1)
    {
        a = h1;
        super();
    }

    public void onClick(View view)
    {
        if (h.a(a) != null)
        {
            h.a(a).b(h.b(a));
        }
    }
}
