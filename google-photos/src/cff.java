// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class cff
    implements android.content.DialogInterface.OnClickListener
{

    private cfd a;

    cff(cfd cfd1)
    {
        a = cfd1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.a(false);
        cfd.a(a).b();
    }
}
