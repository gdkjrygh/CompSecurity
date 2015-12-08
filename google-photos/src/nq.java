// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public class nq
{

    public nq()
    {
    }

    public void a(View view, float f)
    {
        if (f <= 0.0F || f >= 1.0F)
        {
            view.setAlpha(1.0F);
            view.setTranslationX(0.0F);
            view.setScaleX(1.0F);
            view.setScaleY(1.0F);
            return;
        } else
        {
            view.setTranslationX(-f * (float)view.getWidth());
            view.setAlpha(Math.max(0.0F, 1.0F - f));
            f = 0.9F + 0.1F * (1.0F - Math.abs(f));
            view.setScaleX(f);
            view.setScaleY(f);
            return;
        }
    }
}
