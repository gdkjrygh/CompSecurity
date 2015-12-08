// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class ang.Object
    implements android.view.nClickListener
{

    private boolean a;
    private fkm b;

    public final void onClick(View view)
    {
        u u1 = b.k();
        u u2 = b.k();
        if (a)
        {
            view = "spotify:hub:music";
        } else
        {
            view = "spotify:app:browse";
        }
        u1.startActivity(gms.a(u2, view).a);
    }

    (fkm fkm1, boolean flag)
    {
        b = fkm1;
        a = flag;
        super();
    }
}
