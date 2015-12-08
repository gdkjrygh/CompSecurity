// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.view.View;

// Referenced classes of package com.facebook:
//            e

final class <init>
    implements android.view..OnClickListener
{

    final e a;

    public final void onClick(View view)
    {
        e.a(a, a.getContext());
        if (e.a(a) != null)
        {
            e.a(a).onClick(view);
        } else
        if (e.b(a) != null)
        {
            e.b(a).onClick(view);
            return;
        }
    }

    (e e1)
    {
        a = e1;
        super();
    }
}
