// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public final class ety
    implements dho
{

    public ety()
    {
    }

    private static void a(View view, float f)
    {
        f = Math.max(0.0F, 1.0F - 2.0F * f);
        dhl dhl1 = (dhl)view.getTag(0x7f1100e0);
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

    public final int a()
    {
        return 0;
    }

    public final void a(View view, float f, int i)
    {
        a(view, f);
    }

    public final int b()
    {
        return 0;
    }

    public final void b(View view, float f, int i)
    {
        a(view, f);
    }
}
