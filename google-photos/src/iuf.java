// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class iuf
    implements android.content.DialogInterface.OnClickListener
{

    private iue a;

    iuf(iue iue)
    {
        a = iue;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.a(false);
    }
}
