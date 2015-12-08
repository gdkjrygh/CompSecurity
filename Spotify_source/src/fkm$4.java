// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.view.View;

final class ang.Object
    implements android.view.nClickListener
{

    private fkm a;

    public final void onClick(View view)
    {
        view = a.l().getString(0x7f080426);
        String s = fko.b(fkm.d(a));
        a.a(gms.a(a.k(), s).a(view).a);
    }

    (fkm fkm1)
    {
        a = fkm1;
        super();
    }
}
