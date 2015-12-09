// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import java.util.Iterator;
import java.util.List;

public final class evc
    implements dho
{

    private final int a;

    public evc(Context context)
    {
        ctz.a(context);
        a = context.getResources().getDimensionPixelOffset(0x7f0c0037);
    }

    private static void c(View view, float f, int i)
    {
        if (view.getTag() instanceof euu)
        {
            view = (euu)view.getTag();
            for (Iterator iterator = view.D_().iterator(); iterator.hasNext(); ((View)iterator.next()).setAlpha(1.0F - f)) { }
            view = view.b();
            view.setTranslationX((float)view.getLeft() * f * (float)i);
        }
    }

    public final int a()
    {
        return a;
    }

    public final void a(View view, float f, int i)
    {
        c(view, f, 1);
    }

    public final int b()
    {
        return a;
    }

    public final void b(View view, float f, int i)
    {
        c(view, f, -1);
    }
}
