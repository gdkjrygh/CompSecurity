// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class iii
    implements android.view.View.OnClickListener
{

    private iig a;

    iii(iig iig1)
    {
        a = iig1;
        super();
    }

    public final void onClick(View view)
    {
        iig iig1 = a;
        ekq ekq1 = a.a;
        View view1 = (View)view.getParent();
        android.content.Context context = view.getContext();
        view = new aeh(context, view);
        mmx mmx = ((mmr)olm.a(context, mmr)).g();
        if (((hjv)ekq1.a(hjv)).a.a(mmx))
        {
            view.a(b.zB);
        } else
        {
            view.a(b.zA);
        }
        view.c = new iij(iig1, context, view1, ekq1);
        ((aeh) (view)).b.b();
    }
}
