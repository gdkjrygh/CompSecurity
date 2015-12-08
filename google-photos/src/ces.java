// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.DialogInterface;

final class ces
    implements android.content.DialogInterface.OnClickListener
{

    private ceq a;

    ces(ceq ceq1)
    {
        a = ceq1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.a(false);
        if (ceq.a(a).b())
        {
            dialoginterface = a.O_();
            if (dialoginterface != null)
            {
                dialoginterface.finish();
            }
        }
    }
}
