// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.template.c;

import android.graphics.Rect;
import android.support.v7.widget.as;
import android.view.View;

// Referenced classes of package com.roidapp.cloudlib.template.c:
//            f

final class g extends as
{

    final f a;

    g(f f1)
    {
        a = f1;
        super();
    }

    public final void a(Rect rect, View view)
    {
        int i = a.g / 2;
        rect.right = i;
        rect.left = i;
        rect.bottom = a.g;
    }
}
