// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view;

import android.view.View;

// Referenced classes of package com.cardinalblue.android.piccollage.view:
//            e

class a
    implements android.view..OnClickListener
{

    final int a;
    final e b;

    public void onClick(View view)
    {
        if (e.a(b) != null)
        {
            e.a(b).a(view, a);
        }
    }

    a(e e1, int i)
    {
        b = e1;
        a = i;
        super();
    }
}
