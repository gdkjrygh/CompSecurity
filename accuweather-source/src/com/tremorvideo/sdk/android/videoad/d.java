// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.view.View;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            c

class d
    implements android.view.View.OnClickListener
{

    final c a;

    d(c c1)
    {
        a = c1;
        super();
    }

    public void onClick(View view)
    {
        if (view.getTag().equals(ea.b.A.c()))
        {
            c.a(a);
            return;
        }
        if (view.getTag().equals(ea.b.K.c()))
        {
            c.b(a);
            return;
        } else
        {
            c.a(a, true);
            return;
        }
    }
}
