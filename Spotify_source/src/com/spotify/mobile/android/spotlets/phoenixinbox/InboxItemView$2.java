// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.phoenixinbox;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import dft;

// Referenced classes of package com.spotify.mobile.android.spotlets.phoenixinbox:
//            InboxItemView

final class a extends ShapeDrawable
{

    private InboxItemView a;

    public final int getIntrinsicHeight()
    {
        return dft.b(8F, a.getResources());
    }

    public final int getIntrinsicWidth()
    {
        return dft.b(8F, a.getResources());
    }

    (InboxItemView inboxitemview, Shape shape)
    {
        a = inboxitemview;
        super(shape);
    }
}
