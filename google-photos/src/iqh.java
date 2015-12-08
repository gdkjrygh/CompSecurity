// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class iqh
    implements android.content.DialogInterface.OnClickListener
{

    private iqf a;

    iqh(iqf iqf1)
    {
        a = iqf1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        iqf.a(a);
    }
}
