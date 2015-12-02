// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.view;

import android.graphics.Canvas;
import android.view.View;
import com.facebook.reflex.view.b.m;

// Referenced classes of package com.facebook.reflex.view:
//            a

class b extends m
{

    final a b;

    b(a a1, View view)
    {
        b = a1;
        super(view);
    }

    protected void a(Canvas canvas)
    {
        i();
        b.a(canvas);
        b(canvas);
    }
}
