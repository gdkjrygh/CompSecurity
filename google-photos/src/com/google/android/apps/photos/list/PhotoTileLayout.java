// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.list;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import au;
import fqf;
import fqw;

// Referenced classes of package com.google.android.apps.photos.list:
//            PhotoTileView

public class PhotoTileLayout extends FrameLayout
    implements fqw
{

    private PhotoTileView a;

    public PhotoTileLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    private PhotoTileView g()
    {
        if (a == null)
        {
            a = (PhotoTileView)findViewById(au.g);
        }
        return a;
    }

    public final RectF a()
    {
        return g().b.c;
    }

    public final PointF b()
    {
        PhotoTileView phototileview = g();
        fqf fqf1 = phototileview.b;
        float f1 = fqf1.a;
        float f2 = phototileview.getTranslationX();
        float f3 = fqf1.b;
        return new PointF(f1 + f2, phototileview.getTranslationY() + f3);
    }

    public final View c()
    {
        return g();
    }

    public final boolean d()
    {
        return true;
    }

    public final boolean e()
    {
        return true;
    }

    public final PointF f()
    {
        return new PointF(getX() + (float)(getWidth() / 2), getY() + (float)(getHeight() / 2));
    }
}
