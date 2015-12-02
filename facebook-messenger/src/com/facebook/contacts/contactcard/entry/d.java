// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard.entry;

import android.view.View;

// Referenced classes of package com.facebook.contacts.contactcard.entry:
//            b, e

class d
    implements android.view.View.OnClickListener
{

    final b a;

    d(b b1)
    {
        a = b1;
        super();
    }

    public void onClick(View view)
    {
        if (b.a(a) != null)
        {
            b.a(a).b();
        }
    }
}
