// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import android.view.View;

// Referenced classes of package com.facebook.orca.contacts.picker:
//            k

class l
    implements android.view.View.OnClickListener
{

    final String a;
    final k b;

    l(k k1, String s)
    {
        b = k1;
        a = s;
        super();
    }

    public void onClick(View view)
    {
        k.a(b, a);
    }
}
