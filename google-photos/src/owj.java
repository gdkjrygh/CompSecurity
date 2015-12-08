// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public final class owj
    implements aff
{

    public owj(owh owh)
    {
    }

    public final void a(afn afn1)
    {
        afn1 = afn1.a;
        if (afn1 != null && (afn1.getAlpha() < 1.0F || afn1.getTranslationX() != 0.0F))
        {
            afn1.setAlpha(1.0F);
            afn1.setTranslationX(0.0F);
        }
    }
}
