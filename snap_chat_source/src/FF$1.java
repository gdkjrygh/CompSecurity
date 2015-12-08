// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class lang.Object
    implements android.view.OnClickListener
{

    private a a;
    private FF b;

    public final void onClick(View view)
    {
        if (b.c != null)
        {
            b.c.a(a);
        }
    }

    >(FF ff, ew ew)
    {
        b = ff;
        a = ew;
        super();
    }
}
