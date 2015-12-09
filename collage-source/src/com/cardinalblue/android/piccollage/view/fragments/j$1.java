// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.view.View;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            j

class a
    implements android.view..OnClickListener
{

    final int a;
    final j b;

    public void onClick(View view)
    {
        if (j.a(b) != null)
        {
            j.a(b).onItemClick(null, view, a, 0L);
        }
    }

    (j j1, int i)
    {
        b = j1;
        a = i;
        super();
    }
}
