// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user.tiles;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.common.w.j;
import com.facebook.debug.d.e;
import com.facebook.inject.t;
import com.facebook.q;
import com.facebook.widget.images.UrlImage;

// Referenced classes of package com.facebook.user.tiles:
//            c, a, e

public class UserTileView extends FrameLayout
{

    private c a;
    private a b;
    private UrlImage c;
    private com.facebook.user.tiles.e d;
    private int e;

    public UserTileView(Context context)
    {
        super(context);
        a(context, null);
    }

    public UserTileView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context, attributeset);
    }

    public UserTileView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a(context, attributeset);
    }

    private void a()
    {
        com.facebook.ui.images.b.m m = a.a(d, e, e);
        c.setImageParams(m);
        if (d == null)
        {
            c.setPlaceHolderDrawable(b.a(e, e));
            return;
        } else
        {
            c.setPlaceHolderDrawable(b.a(d.c(), e, e));
            return;
        }
    }

    private void a(Context context, AttributeSet attributeset)
    {
        e e1 = com.facebook.debug.d.e.a("UserTileView.init");
        t t1 = t.a(context);
        a = (c)t1.a(com/facebook/user/tiles/c);
        b = (a)t1.a(com/facebook/user/tiles/a);
        attributeset = context.obtainStyledAttributes(attributeset, q.UserTileView);
        e = attributeset.getDimensionPixelSize(q.UserTileView_tileSize, -1);
        if (e == -1)
        {
            e = j.a(context, 50F);
        }
        attributeset.recycle();
        c = new UrlImage(getContext());
        c.setPlaceHolderDrawable(b.a(50, 50));
        addView(c);
        e1.a();
    }

    public com.facebook.user.tiles.e getParams()
    {
        return d;
    }

    public com.facebook.user.tiles.e getUserTileViewParams()
    {
        return d;
    }

    public void setParams(com.facebook.user.tiles.e e1)
    {
        d = e1;
        a();
    }
}
