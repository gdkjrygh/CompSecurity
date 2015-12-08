// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;

import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

// Referenced classes of package com.squareup.a:
//            ba, m

class q
    implements android.view.ViewTreeObserver.OnPreDrawListener
{

    final ba a;
    final WeakReference b;
    m c;

    q(ba ba1, ImageView imageview, m m)
    {
        a = ba1;
        b = new WeakReference(imageview);
        c = m;
        imageview.getViewTreeObserver().addOnPreDrawListener(this);
    }

    void a()
    {
        c = null;
        Object obj = (ImageView)b.get();
        if (obj != null)
        {
            if (((ViewTreeObserver) (obj = ((ImageView) (obj)).getViewTreeObserver())).isAlive())
            {
                ((ViewTreeObserver) (obj)).removeOnPreDrawListener(this);
                return;
            }
        }
    }

    public boolean onPreDraw()
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
                    a.a().a(i, j).a(imageview, c);
                    return true;
                }
            }
        }
        return true;
    }
}
