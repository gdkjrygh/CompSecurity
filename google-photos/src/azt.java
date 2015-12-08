// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public final class azt
    implements azp
{

    private final azu a;

    azt(azu azu1)
    {
        a = azu1;
    }

    public final boolean a(Object obj, azq azq1)
    {
        obj = azq1.f();
        if (obj != null)
        {
            ((View) (obj)).clearAnimation();
            azq1 = a;
            ((View) (obj)).getContext();
            ((View) (obj)).startAnimation(azq1.a());
        }
        return false;
    }
}
