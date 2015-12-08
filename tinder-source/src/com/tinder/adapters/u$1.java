// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.adapters;

import android.view.View;

// Referenced classes of package com.tinder.adapters:
//            u

final class a
    implements android.view..OnClickListener
{

    final u a;

    public final void onClick(View view)
    {
        if (a.b != null)
        {
            a.b.onClick(view);
        }
    }

    kListener(u u1)
    {
        a = u1;
        super();
    }
}
