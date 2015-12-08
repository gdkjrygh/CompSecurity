// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;

// Referenced classes of package com.jcp.adapters:
//            cp

class cq
    implements android.view.View.OnClickListener
{

    final int a;
    final cp b;

    cq(cp cp1, int i)
    {
        b = cp1;
        a = i;
        super();
    }

    public void onClick(View view)
    {
        cp.a(b, b.a(a));
    }
}
