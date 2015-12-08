// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class cgn
    implements android.content.DialogInterface.OnClickListener
{

    private cgl a;

    cgn(cgl cgl1)
    {
        a = cgl1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        mry.a(cgl.c(a), 4, (new msn()).a(cgl.s()).a(cgl.d(a)));
        if (cgl.e(a) != null)
        {
            cgl.e(a).a();
        }
        a.a(false);
    }
}
