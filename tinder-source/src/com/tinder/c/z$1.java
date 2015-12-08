// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.view.View;

// Referenced classes of package com.tinder.c:
//            z

final class <init>
    implements android.view..OnClickListener
{

    final z a;

    public final void onClick(View view)
    {
        a.dismissAllowingStateLoss();
    }

    (z z1)
    {
        a = z1;
        super();
    }
}
