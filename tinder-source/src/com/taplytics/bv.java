// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.app.Activity;

// Referenced classes of package com.taplytics:
//            hu, ci, br

final class bv extends hu
{

    final br a;

    bv(br br)
    {
        a = br;
        super();
    }

    public final void c()
    {
        Activity activity = ci.b().v;
        android.content.Intent intent = activity.getIntent();
        activity.finish();
        activity.overridePendingTransition(0, 0);
        activity.startActivity(intent);
        activity.overridePendingTransition(0, 0);
        super.c();
    }
}
