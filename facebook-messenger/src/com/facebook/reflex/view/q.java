// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.view;

import android.graphics.Canvas;
import android.view.View;
import com.facebook.reflex.view.b.m;

// Referenced classes of package com.facebook.reflex.view:
//            p

class q extends m
{

    final p b;

    q(p p1, View view)
    {
        b = p1;
        super(view);
    }

    protected void a(Canvas canvas)
    {
        i();
        p.a(b, canvas);
        b(canvas);
    }
}
