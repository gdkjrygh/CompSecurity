// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.remotemedia.enrichment.ui;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import b;
import fqw;
import hiw;
import hix;

public final class LocationEnrichmentLayout extends FrameLayout
    implements fqw, hiw
{

    private hix a;

    public LocationEnrichmentLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setTag(b.wk, Boolean.valueOf(true));
    }

    public final RectF a()
    {
        return new RectF(a.a());
    }

    public final void a(float f1)
    {
        a.a(f1);
    }

    public final PointF b()
    {
        return new PointF(getTranslationX(), getTranslationY());
    }

    public final void b(float f1)
    {
        a.b(f1);
    }

    public final View c()
    {
        return this;
    }

    public final boolean d()
    {
        return false;
    }

    public final boolean e()
    {
        return false;
    }

    public final PointF f()
    {
        Rect rect = a.a();
        float f1 = getX();
        float f2 = rect.width() / 2;
        float f3 = getY();
        return new PointF(f1 + f2, (float)(rect.height() / 2) + f3);
    }

    protected final void onFinishInflate()
    {
        a = new hix(this);
    }
}
