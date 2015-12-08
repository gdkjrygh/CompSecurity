// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class fdl
    implements android.content.DialogInterface.OnClickListener
{

    private fdk a;

    fdl(fdk fdk1)
    {
        a = fdk1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        mry.a(fdk.a(a), 4, (new msn()).a(fdk.r()).a(fdk.b(a)));
        dialoginterface.dismiss();
    }
}
