// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.DialogInterface;

final class ceo
    implements android.content.DialogInterface.OnClickListener
{

    private cen a;

    ceo(cen cen1)
    {
        a = cen1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.a(false);
        if (cen.a(a).a())
        {
            dialoginterface = a.O_();
            if (dialoginterface != null)
            {
                dialoginterface.finish();
            }
        }
    }
}
