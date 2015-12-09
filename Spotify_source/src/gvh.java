// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

public final class gvh
    implements android.view.ViewTreeObserver.OnPreDrawListener
{

    public final WeakReference a;

    public final boolean onPreDraw()
    {
        ImageView imageview = (ImageView)a.get();
        ViewTreeObserver viewtreeobserver;
        if (imageview != null)
        {
            if ((viewtreeobserver = imageview.getViewTreeObserver()).isAlive())
            {
                int j = imageview.getWidth();
                int i = imageview.getHeight();
                if (j > 0 && i > 0)
                {
                    viewtreeobserver.removeOnPreDrawListener(this);
                    throw new NullPointerException();
                }
            }
        }
        return true;
    }
}
