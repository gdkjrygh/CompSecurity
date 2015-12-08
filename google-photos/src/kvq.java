// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class kvq
    implements android.content.DialogInterface.OnClickListener
{

    private kvo a;

    kvq(kvo kvo1)
    {
        a = kvo1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.a("User canceled the download.");
    }
}
