// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class ang.Object
    implements android.view.nFocusChangeListener
{

    private dyc a;

    public final void onFocusChange(View view, boolean flag)
    {
        if (!flag)
        {
            dyc.a(dyc.y(a));
            dyc.a(a, dyc.a(a, dyc.A(a)));
        }
    }

    (dyc dyc1)
    {
        a = dyc1;
        super();
    }
}
