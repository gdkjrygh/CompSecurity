// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class ang.Object
    implements android.view.nClickListener
{

    private eii a;

    public final void onClick(View view)
    {
        view = (eju)view.getTag();
        view = gms.a(a.k(), ((eju) (view)).a).a;
        a.k().startActivity(view);
    }

    (eii eii1)
    {
        a = eii1;
        super();
    }
}
