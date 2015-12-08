// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.DialogInterface;

final class cgm
    implements android.content.DialogInterface.OnClickListener
{

    private cgl a;

    cgm(cgl cgl1)
    {
        a = cgl1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        mry.a(cgl.a(a), 4, (new msn()).a(cgl.r()).a(cgl.b(a)));
        a.a(false);
        dialoginterface = a.O_();
        if (dialoginterface != null)
        {
            dialoginterface.finish();
        }
    }
}
