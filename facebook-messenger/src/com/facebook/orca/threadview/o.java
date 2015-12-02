// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.view.View;

// Referenced classes of package com.facebook.orca.threadview:
//            l, r

class o
    implements android.view.View.OnLongClickListener
{

    final l a;

    o(l l1)
    {
        a = l1;
        super();
    }

    public boolean onLongClick(View view)
    {
        if (l.a(a) != null)
        {
            return l.a(a).b(a.getRowMessageItem());
        } else
        {
            return false;
        }
    }
}
