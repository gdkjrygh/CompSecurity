// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import com.facebook.reflex.view.b.p;

// Referenced classes of package com.facebook.reflex:
//            j

class k extends View
{

    final j a;

    k(j j1, Context context)
    {
        a = j1;
        super(context);
    }

    protected void onDraw(Canvas canvas)
    {
        j.a(a).b();
    }
}
