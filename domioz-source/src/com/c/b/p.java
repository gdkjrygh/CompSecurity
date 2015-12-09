// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

// Referenced classes of package com.c.b:
//            ay, m

final class p
    implements android.view.ViewTreeObserver.OnPreDrawListener
{

    final ay a;
    final WeakReference b;
    m c;

    p(ay ay1, ImageView imageview, m m)
    {
        a = ay1;
        b = new WeakReference(imageview);
        c = m;
        imageview.getViewTreeObserver().addOnPreDrawListener(this);
    }

    public final boolean onPreDraw()
    {
        ImageView imageview = (ImageView)b.get();
        ViewTreeObserver viewtreeobserver;
        if (imageview != null)
        {
            if ((viewtreeobserver = imageview.getViewTreeObserver()).isAlive())
            {
                int i = imageview.getWidth();
                int j = imageview.getHeight();
                if (i > 0 && j > 0)
                {
                    viewtreeobserver.removeOnPreDrawListener(this);
                    a.b().b(i, j).a(imageview, c);
                    return true;
                }
            }
        }
        return true;
    }
}
