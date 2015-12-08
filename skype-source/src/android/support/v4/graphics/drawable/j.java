// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;

// Referenced classes of package android.support.v4.graphics.drawable:
//            i

final class j extends i
{

    protected j(Resources resources, Bitmap bitmap)
    {
        super(resources, bitmap);
    }

    final void a(int k, int l, int i1, Rect rect, Rect rect1)
    {
        Gravity.apply(k, l, i1, rect, rect1, 0);
    }

    public final void getOutline(Outline outline)
    {
        a();
        outline.setRoundRect(b, b());
    }
}
