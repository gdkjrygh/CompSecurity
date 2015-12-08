// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class chb
    implements android.content.DialogInterface.OnClickListener
{

    private cha a;

    chb(cha cha1)
    {
        a = cha1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.dismiss();
    }
}
