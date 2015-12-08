// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class kvk
    implements android.content.DialogInterface.OnClickListener
{

    private kvi a;

    kvk(kvi kvi1)
    {
        a = kvi1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.a("Operation denied by user.");
    }
}
