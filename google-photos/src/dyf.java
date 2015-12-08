// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.ImageView;

final class dyf extends hgu
{

    private final dum a;

    public dyf(dum dum1)
    {
        a = dum1;
    }

    public final int a()
    {
        return b.kC;
    }

    public final void a(afn afn1)
    {
        ImageView imageview = ((dyk)afn1).o;
        if (mk.h(afn1.a) == 1)
        {
            imageview.setScaleX(-1F);
        }
    }

    public final long b()
    {
        return a.c;
    }
}
