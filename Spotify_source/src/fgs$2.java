// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class ang.Object
    implements android.view.nClickListener
{

    private dhu a;
    private fgs b;

    public final void onClick(View view)
    {
        int i = a.d();
        if (view == a.v())
        {
            fgs.b(b).b(i);
            return;
        }
        if (view == a.x())
        {
            fgs.b(b).a(i);
            return;
        } else
        {
            throw new AssertionError("Unrecognized view!");
        }
    }

    (fgs fgs1, dhu dhu1)
    {
        b = fgs1;
        a = dhu1;
        super();
    }
}
