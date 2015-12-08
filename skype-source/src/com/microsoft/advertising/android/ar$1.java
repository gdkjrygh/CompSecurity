// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.content.Context;
import android.view.MotionEvent;

// Referenced classes of package com.microsoft.advertising.android:
//            ar, j

final class <init> extends <init>
{

    final ar a;
    private final j b;

    public final boolean onSingleTapUp(MotionEvent motionevent)
    {
        return b.c(a.a);
    }

    (ar ar1, Context context, j j1)
    {
        a = ar1;
        b = j1;
        super(context);
    }
}
