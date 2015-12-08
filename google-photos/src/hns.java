// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

public final class hns
    implements android.content.DialogInterface.OnCancelListener
{

    private hnv a;

    public hns(hnv hnv1)
    {
        a = hnv1;
        super();
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        a.a();
    }
}
