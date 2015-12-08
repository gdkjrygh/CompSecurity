// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aq;

import android.graphics.Bitmap;
import android.view.View;
import com.google.android.m4b.maps.al.b;
import com.google.android.m4b.maps.cg.a;
import com.google.android.m4b.maps.cg.bg;
import com.google.android.m4b.maps.df.h;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.m4b.maps.aq:
//            v

public final class q extends a
{

    public q(v v1, View view, View view1, boolean flag, Executor executor, bg bg)
    {
        super((View)v1, view, view1, flag, executor, bg);
    }

    protected final void a(Bitmap bitmap, h h)
    {
        bitmap = b.a(((v)a).a(bitmap));
        a(bitmap, false);
        b.execute(new Runnable(h, bitmap) {

            private h a;
            private Bitmap b;
            private q c;

            public final void run()
            {
                c.a(a, b);
            }

            
            {
                c = q.this;
                a = h;
                b = bitmap;
                super();
            }
        });
    }
}
