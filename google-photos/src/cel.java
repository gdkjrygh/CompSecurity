// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class cel
    implements android.content.DialogInterface.OnClickListener
{

    private cek a;

    cel(cek cek1)
    {
        a = cek1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.a(false);
        a.O_().finish();
        cek.a(a).a();
    }
}
