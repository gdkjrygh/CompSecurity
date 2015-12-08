// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bt;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.google.android.m4b.maps.cg.a;
import com.google.android.m4b.maps.cg.bg;
import com.google.android.m4b.maps.df.h;
import java.util.concurrent.Executor;

public final class m extends a
{

    protected m(View view, View view1, View view2, Executor executor, bg bg)
    {
        super(view, view1, view2, false, executor, bg);
    }

    protected final void a(Bitmap bitmap, h h)
    {
        b.execute(new Runnable(bitmap, h) {

            private Bitmap a;
            private boolean b;
            private h c;
            private m d;

            public final void run()
            {
                Canvas canvas = new Canvas(a);
                d.a.draw(canvas);
                d.a(a, b);
                d.a(c, a);
            }

            
            {
                d = m.this;
                a = bitmap;
                b = false;
                c = h;
                super();
            }
        });
    }
}
