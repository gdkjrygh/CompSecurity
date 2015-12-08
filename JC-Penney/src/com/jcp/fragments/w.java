// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;

// Referenced classes of package com.jcp.fragments:
//            u

class w
    implements android.view.View.OnClickListener
{

    final u a;

    w(u u1)
    {
        a = u1;
        super();
    }

    public void onClick(View view)
    {
        if (u.b(a))
        {
            u.a(a, false);
        } else
        {
            u.c(a);
        }
        u.a(a);
    }
}
