// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.view.View;

// Referenced classes of package com.tinder.c:
//            l

final class <init>
    implements android.view..OnClickListener
{

    final l a;

    public final void onClick(View view)
    {
        a.dismiss();
        if (l.b(a) != null)
        {
            l.b(a).onClick(view);
        }
    }

    (l l1)
    {
        a = l1;
        super();
    }
}
