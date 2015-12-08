// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;

// Referenced classes of package bo.app:
//            jn, d, f

final class e extends jn
{

    final d a;

    e(d d1)
    {
        a = d1;
        super();
    }

    public final void a(String s, View view, Bitmap bitmap)
    {
        float f1;
        super.a(s, view, bitmap);
        f1 = bitmap.getHeight();
        break MISSING_BLOCK_LABEL_14;
        if (f1 != 0.0F && !a.c)
        {
            f1 = (float)bitmap.getWidth() / f1;
            s = view.getViewTreeObserver();
            if (s.isAlive())
            {
                s.addOnGlobalLayoutListener(new f(this, f1));
                return;
            }
        }
        return;
    }
}
