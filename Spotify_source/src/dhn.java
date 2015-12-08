// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;

public class dhn
    implements dho
{

    private int a;
    private boolean b;
    private boolean c;

    public dhn(Context context)
    {
        a = (int)TypedValue.applyDimension(1, 16F, context.getResources().getDisplayMetrics());
    }

    private void a(View view, float f, boolean flag)
    {
        float f1 = 1.0F - ((float)(a * 2) / (float)view.getMeasuredWidth()) * f;
        view.setScaleX(f1);
        view.setScaleY(f1);
        dhl dhl1;
        if (flag)
        {
            f = Math.max(0.0F, 1.0F - f);
        } else
        {
            f = Math.max(0.6F, 1.0F - 0.4F * f);
        }
        dhl1 = (dhl)view.getTag(0x7f1100e0);
        if (dhl1 == null)
        {
            view.setAlpha(f);
            return;
        } else
        {
            dhl1.a = f;
            return;
        }
    }

    public int a()
    {
        return a;
    }

    public void a(View view, float f, int i)
    {
        a(view, f, b);
    }

    public final void a(boolean flag)
    {
        b = flag;
    }

    public final int b()
    {
        return a;
    }

    public void b(View view, float f, int i)
    {
        a(view, f, c);
    }

    public final void b(boolean flag)
    {
        c = flag;
    }
}
