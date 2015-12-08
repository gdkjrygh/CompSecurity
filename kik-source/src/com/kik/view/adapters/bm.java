// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.content.Context;
import android.widget.ImageView;
import android.widget.Toast;
import kik.a.d.f;
import kik.android.net.a.b;
import kik.android.widget.ProgressWidget;

// Referenced classes of package com.kik.view.adapters:
//            bf

final class bm
    implements Runnable
{

    final b a;
    final ImageView b;
    final ProgressWidget c;
    final f d;
    final String e;
    final bf f;

    bm(bf bf1, b b1, ImageView imageview, ProgressWidget progresswidget, f f1, String s)
    {
        f = bf1;
        a = b1;
        b = imageview;
        c = progresswidget;
        d = f1;
        e = s;
        super();
    }

    public final void run()
    {
        Toast.makeText(f.l, f.l.getString(0x7f090267), 0).show();
        f.a(a, b, c, d, e);
    }
}
