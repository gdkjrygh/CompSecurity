// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.b.c;

import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import com.b.a.b.a.f;
import com.b.a.b.e.a;

// Referenced classes of package com.b.a.b.c:
//            a

public final class b
    implements com.b.a.b.c.a
{

    private final int a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    public b()
    {
        this((byte)0);
    }

    private b(byte byte0)
    {
        a = 200;
        b = true;
        c = true;
        d = true;
    }

    public final void display(Bitmap bitmap, a a1, f f1)
    {
        a1.a(bitmap);
        if (b && f1 == f.a || c && f1 == f.b || d && f1 == f.c)
        {
            bitmap = a1.d();
            int i = a;
            if (bitmap != null)
            {
                a1 = new AlphaAnimation(0.0F, 1.0F);
                a1.setDuration(i);
                a1.setInterpolator(new DecelerateInterpolator());
                bitmap.startAnimation(a1);
            }
        }
    }
}
