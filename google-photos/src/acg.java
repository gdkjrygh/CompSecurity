// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;

public final class acg
    implements ack
{

    public acg()
    {
    }

    private static float c(ach ach1)
    {
        return ((afq)ach1.getBackground()).a;
    }

    public final float a(ach ach1)
    {
        return c(ach1) * 2.0F;
    }

    public final void a()
    {
    }

    public final void a(ach ach1, Context context, int i, float f, float f1, float f2)
    {
        ach1.setBackgroundDrawable(new afq(i, f));
        context = (View)ach1;
        context.setClipToOutline(true);
        context.setElevation(f1);
        context = (afq)ach1.getBackground();
        boolean flag = ach1.a();
        boolean flag1 = ach1.b();
        if (f2 != ((afq) (context)).b || ((afq) (context)).c != flag || ((afq) (context)).d != flag1)
        {
            context.b = f2;
            context.c = flag;
            context.d = flag1;
            context.a(null);
            context.invalidateSelf();
        }
        if (!ach1.a())
        {
            ach1.a(0, 0, 0, 0);
            return;
        } else
        {
            f = ((afq)ach1.getBackground()).b;
            f1 = c(ach1);
            i = (int)Math.ceil(afr.b(f, f1, ach1.b()));
            int j = (int)Math.ceil(afr.a(f, f1, ach1.b()));
            ach1.a(i, j, i, j);
            return;
        }
    }

    public final float b(ach ach1)
    {
        return c(ach1) * 2.0F;
    }
}
