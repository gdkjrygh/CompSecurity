// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class jeq
    implements android.view.View.OnClickListener
{

    private jem a;

    jeq(jem jem1)
    {
        a = jem1;
        super();
    }

    public final void onClick(View view)
    {
        if (jem.d(a) != null && jem.d(a).a())
        {
            jem.d(a).c();
        }
    }
}
