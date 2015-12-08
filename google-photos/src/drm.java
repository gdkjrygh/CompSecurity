// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.android.apps.photos.allphotos.fragment.month.MonthView;

public final class drm extends ayz
{

    public Bitmap a;
    private final int b;
    private MonthView c;

    public drm(MonthView monthview, int i)
    {
        c = monthview;
        super();
        b = i;
    }

    public final void a(Drawable drawable)
    {
        super.a(drawable);
        a = null;
    }

    public final void a(azg azg)
    {
        throw new UnsupportedOperationException();
    }

    public final void a(Object obj, azp azp)
    {
        a = (Bitmap)obj;
        MonthView.a(c, b);
    }

    public final void b(Drawable drawable)
    {
        super.b(drawable);
        a = null;
        MonthView.a(c, b);
    }

    public final void c(Drawable drawable)
    {
        super.c(drawable);
        a = null;
        MonthView.a(c, b);
    }
}
