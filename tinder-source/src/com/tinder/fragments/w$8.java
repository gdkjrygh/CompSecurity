// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.view.View;

// Referenced classes of package com.tinder.fragments:
//            w

final class a
    implements android.view..OnClickListener
{

    final w a;

    public final void onClick(View view)
    {
        if (w.b(a) == 0)
        {
            int i = w.e(a);
            w.b(a, i);
            w.a(a, i);
            a.startActivityForResult(w.d(a), 1111);
        }
    }

    Listener(w w1)
    {
        a = w1;
        super();
    }
}
