// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class lang.Object
    implements android.view.OnClickListener
{

    private Ey a;

    public final void onClick(View view)
    {
        a.a();
        if (a.d != null)
        {
            a.d.d();
        }
    }

    >(Ey ey)
    {
        a = ey;
        super();
    }
}
