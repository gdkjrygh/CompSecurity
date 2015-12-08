// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class igm
    implements android.content.DialogInterface.OnClickListener
{

    private igl a;

    igm(igl igl1)
    {
        a = igl1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = a;
        igo igo1 = ((igl) (dialoginterface)).ae.a(i);
        dialoginterface.a(igo1.d);
        ((igl) (dialoginterface)).ad.a(igo1.b);
        dialoginterface.a(false);
    }
}
