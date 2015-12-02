// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

final class cfn
    implements android.view.ViewTreeObserver.OnPreDrawListener
{

    final cgt a;
    final WeakReference b;
    cfj c;

    cfn(cgt cgt1, ImageView imageview, cfj cfj)
    {
        a = cgt1;
        b = new WeakReference(imageview);
        c = cfj;
        imageview.getViewTreeObserver().addOnPreDrawListener(this);
    }

    final void a()
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
