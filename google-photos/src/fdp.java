// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class fdp
    implements android.content.DialogInterface.OnClickListener
{

    private fdn a;

    fdp(fdn fdn1)
    {
        a = fdn1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        fdn.a(a, pws.d);
    }
}
