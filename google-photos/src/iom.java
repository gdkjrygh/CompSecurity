// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class iom
    implements android.content.DialogInterface.OnClickListener
{

    private iol a;

    iom(iol iol)
    {
        a = iol;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (((am) (a)).r != null)
        {
            ((am) (a)).r.a(((am) (a)).t, 0, null);
            a.a(false);
        }
    }
}
