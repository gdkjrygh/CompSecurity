// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;

public final class gpk extends omp
{

    public ekp a;
    public int b;
    private View c;
    private final azh d = new gpl(this);

    public gpk()
    {
    }

    static void a(gpk gpk1, Drawable drawable)
    {
        Display display = gpk1.O_().getWindowManager().getDefaultDisplay();
        Point point = new Point();
        float f;
        float f1;
        float f2;
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            display.getRealSize(point);
        } else
        {
            DisplayMetrics displaymetrics = new DisplayMetrics();
            display.getMetrics(displaymetrics);
            point.x = displaymetrics.widthPixels;
            point.y = gpk1.b;
        }
        f1 = point.x;
        f = point.y;
        f2 = f / f1;
        gpk1 = (ImageView)gpk1.c.findViewById(af.o);
        if (f2 > (float)drawable.getIntrinsicHeight() / (float)drawable.getIntrinsicWidth())
        {
            f = f1 / (float)drawable.getIntrinsicWidth();
        } else
        {
            f /= drawable.getIntrinsicHeight();
        }
        gpk1.setImageDrawable(drawable);
        gpk1.setScaleX(f);
        gpk1.setScaleY(f);
        gpk1.setX(Math.round(f1 / 2.0F - (float)(drawable.getIntrinsicWidth() / 2)));
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        c = layoutinflater.inflate(b.sR, null);
        if (a != null)
        {
            layoutinflater = (elt)a.b(elt);
            if (layoutinflater != null)
            {
                layoutinflater = layoutinflater.e();
                viewgroup = (fli)ae.a(fli);
                ((amh)ae.a(amh)).a(layoutinflater).a(viewgroup.e()).a(d);
            }
        }
        return c;
    }
}
