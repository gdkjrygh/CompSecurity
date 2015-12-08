// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class fyg
    implements android.content.DialogInterface.OnClickListener
{

    private fyf a;

    fyg(fyf fyf1)
    {
        a = fyf1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (a.a != null)
        {
            a.a.f();
        }
    }
}
