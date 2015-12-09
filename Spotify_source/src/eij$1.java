// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class ang.Object
    implements android.view.nClickListener
{

    private eij a;

    public final void onClick(View view)
    {
        view = (ejw)view.getTag();
        view = gms.a(a.k(), ((ejw) (view)).a).a;
        a.k().startActivity(view);
    }

    (eij eij1)
    {
        a = eij1;
        super();
    }
}
