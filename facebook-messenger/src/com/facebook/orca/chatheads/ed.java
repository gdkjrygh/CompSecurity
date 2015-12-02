// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;

// Referenced classes of package com.facebook.orca.chatheads:
//            eb, ec

class ed extends View
{

    final eb a;
    private Rect b;

    public ed(eb eb1, Context context)
    {
        a = eb1;
        super(context);
        b = new Rect();
    }

    protected boolean fitSystemWindows(Rect rect)
    {
        b.set(rect);
        if (eb.a(a) != null)
        {
            eb.a(a).a(rect);
        }
        return true;
    }
}
