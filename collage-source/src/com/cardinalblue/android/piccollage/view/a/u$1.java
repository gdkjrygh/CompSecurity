// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.view.View;

// Referenced classes of package com.cardinalblue.android.piccollage.view.a:
//            u

class a
    implements android.view..OnClickListener
{

    final int a;
    final u b;

    public void onClick(View view)
    {
        if (u.a(b) != null)
        {
            u.a(b).onItemClick(null, view, a, 0L);
        }
    }

    (u u1, int i)
    {
        b = u1;
        a = i;
        super();
    }
}
