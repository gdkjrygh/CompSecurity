// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class ang.Object
    implements android.view.nClickListener
{

    private fjq a;

    public final void onClick(View view)
    {
        if (a.a != null)
        {
            a.a.onClick(view);
        }
        if (a.b)
        {
            a.c();
        }
    }

    (fjq fjq1)
    {
        a = fjq1;
        super();
    }
}
