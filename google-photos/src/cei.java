// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class cei
    implements android.content.DialogInterface.OnClickListener
{

    private ceh a;

    cei(ceh ceh1)
    {
        a = ceh1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.onCancel(dialoginterface);
    }
}
