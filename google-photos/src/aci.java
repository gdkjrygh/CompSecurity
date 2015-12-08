// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

public class aci
    implements ack
{

    final RectF a = new RectF();

    public aci()
    {
    }

    private static afr c(ach ach1)
    {
        return (afr)ach1.getBackground();
    }

    public final float a(ach ach1)
    {
        ach1 = c(ach1);
        float f = Math.max(((afr) (ach1)).d, ((afr) (ach1)).c + (float)((afr) (ach1)).a + ((afr) (ach1)).d / 2.0F);
        float f1 = ((afr) (ach1)).d;
        return ((float)((afr) (ach1)).a + f1) * 2.0F + f * 2.0F;
    }

    public void a()
    {
        afr.b = new acj(this);
    }

    public final void a(ach ach1, Context context, int i, float f, float f1, float f2)
    {
        context = new afr(context.getResources(), i, f, f1, f2);
        context.e = ach1.b();
        context.invalidateSelf();
        ach1.setBackgroundDrawable(context);
        context = new Rect();
        c(ach1).getPadding(context);
        View view = (View)ach1;
        afr afr1 = c(ach1);
        f = Math.max(afr1.d, afr1.c + (float)afr1.a + (afr1.d * 1.5F) / 2.0F);
        f1 = afr1.d;
        view.setMinimumHeight((int)Math.ceil(((float)afr1.a + f1 * 1.5F) * 2.0F + f * 2.0F));
        view = (View)ach1;
        afr1 = c(ach1);
        f = Math.max(afr1.d, afr1.c + (float)afr1.a + afr1.d / 2.0F);
        f1 = afr1.d;
        view.setMinimumWidth((int)Math.ceil(((float)afr1.a + f1) * 2.0F + f * 2.0F));
        ach1.a(((Rect) (context)).left, ((Rect) (context)).top, ((Rect) (context)).right, ((Rect) (context)).bottom);
    }

    public final float b(ach ach1)
    {
        ach1 = c(ach1);
        float f = Math.max(((afr) (ach1)).d, ((afr) (ach1)).c + (float)((afr) (ach1)).a + (((afr) (ach1)).d * 1.5F) / 2.0F);
        float f1 = ((afr) (ach1)).d;
        return ((float)((afr) (ach1)).a + f1 * 1.5F) * 2.0F + f * 2.0F;
    }
}
