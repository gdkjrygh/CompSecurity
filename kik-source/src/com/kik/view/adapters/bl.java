// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.widget.ImageView;
import com.kik.g.r;
import kik.a.d.f;
import kik.android.net.a.b;
import kik.android.widget.ProgressWidget;

// Referenced classes of package com.kik.view.adapters:
//            bf

final class bl extends r
{

    final b a;
    final f b;
    final ImageView c;
    final ProgressWidget d;
    final String e;
    final bf f;

    bl(bf bf1, b b1, f f1, ImageView imageview, ProgressWidget progresswidget, String s)
    {
        f = bf1;
        a = b1;
        b = f1;
        c = imageview;
        d = progresswidget;
        e = s;
        super();
    }

    public final void b(Throwable throwable)
    {
        bf.a(f, a, b, c, d, e);
    }
}
