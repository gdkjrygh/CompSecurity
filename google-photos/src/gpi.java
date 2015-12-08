// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;

public final class gpi
{

    ImageView a;
    View b;
    int c;
    gpj d;
    PointF e;
    float f;
    float g;
    PointF h;
    float i;
    private final float j;
    private final float k;

    public gpi(ImageView imageview, View view, int l, gpj gpj1)
    {
        Resources resources = imageview.getContext().getResources();
        j = TypedValue.applyDimension(1, 25F, resources.getDisplayMetrics());
        k = TypedValue.applyDimension(1, 100F, resources.getDisplayMetrics());
        a = imageview;
        b = view;
        c = 0xff000000;
        d = gpj1;
    }

    float a(float f1)
    {
        if (d.w() == gpb.a)
        {
            return Math.max(0.0F, Math.min(1.0F, (f1 - (f + j)) / k));
        } else
        {
            return Math.max(0.0F, Math.min(1.0F, (f1 - (f - j - k)) / k));
        }
    }

    public final void a(float f1, PointF pointf)
    {
        i = f1;
        h = pointf;
    }
}
