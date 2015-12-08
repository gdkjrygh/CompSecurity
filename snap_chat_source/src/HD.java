// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

public final class HD extends HG
{

    private final GK b;

    public HD(GK gk)
    {
        b = gk;
    }

    public final String a()
    {
        return "Battery";
    }

    public final void a(int i, Context context)
    {
        ImageView imageview = (ImageView)b.a.findViewById(0x7f0d0092);
        float f = Jo.a(57F, context);
        if (i == 2)
        {
            imageview.setTranslationY(f);
            return;
        } else
        {
            imageview.setTranslationY(0.0F);
            return;
        }
    }

    public final View d()
    {
        return b.a;
    }

    public final void e()
    {
        GK gk = b;
        gk.b.a(0x7f04000b, gk.a);
        gk.a = null;
    }
}
