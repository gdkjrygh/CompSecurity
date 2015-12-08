// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.view.View;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ea, o

class u
    implements android.view.View.OnClickListener
{

    final o a;

    u(o o1)
    {
        a = o1;
        super();
    }

    public void onClick(View view)
    {
        o.a(a, (ea)view.getTag());
    }
}
