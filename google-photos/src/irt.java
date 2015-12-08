// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.apps.photos.list.PhotoTileView;

final class irt extends azf
{

    private itd a;
    private irq b;

    irt(irq irq1, itd itd1)
    {
        b = irq1;
        a = itd1;
        super();
    }

    public final void a(Drawable drawable)
    {
        a.a(new ColorDrawable(irq.b(b)));
    }

    public final void a(Object obj, azp azp)
    {
        obj = (Drawable)obj;
        if (a != null)
        {
            a.j = true;
            a.a(((Drawable) (obj)));
        }
    }

    public final void b(Drawable drawable)
    {
        a.a(new ColorDrawable(irq.b(b)));
    }

    public final void c(Drawable drawable)
    {
    }
}
