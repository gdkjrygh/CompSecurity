// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.view.View;
import kik.a.d.a.a;

// Referenced classes of package com.kik.view.adapters:
//            n

final class p
    implements android.view.View.OnClickListener
{

    final a a;
    final n b;

    p(n n1, a a1)
    {
        b = n1;
        a = a1;
        super();
    }

    public final void onClick(View view)
    {
        b.d(a);
    }
}
