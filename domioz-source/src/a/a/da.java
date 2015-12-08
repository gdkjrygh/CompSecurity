// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;

// Referenced classes of package a.a:
//            il, bz, dz

final class da extends il
{

    final bz a;

    da(bz bz1)
    {
        a = bz1;
        super();
    }

    public final void a(String s, View view, Bitmap bitmap)
    {
        float f;
        super.a(s, view, bitmap);
        f = bitmap.getHeight();
        break MISSING_BLOCK_LABEL_14;
        if (f != 0.0F && !a.c)
        {
            f = (float)bitmap.getWidth() / f;
            s = view.getViewTreeObserver();
            if (s.isAlive())
            {
                s.addOnGlobalLayoutListener(new dz(this, f));
                return;
            }
        }
        return;
    }
}
