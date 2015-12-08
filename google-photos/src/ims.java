// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class ims
    implements android.content.DialogInterface.OnClickListener
{

    private imq a;

    ims(imq imq)
    {
        a = imq;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (((am) (a)).r != null)
        {
            ((am) (a)).r.a(((am) (a)).t, -1, null);
        }
        a.a(false);
    }
}
