// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class cfh
    implements android.content.DialogInterface.OnClickListener
{

    private cfg a;

    cfh(cfg cfg1)
    {
        a = cfg1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        boolean flag = false;
        a.a(false);
        dialoginterface = cfg.b(a);
        if (cfg.a(a) == cfk.b)
        {
            flag = true;
        }
        dialoginterface.a(flag);
    }
}
