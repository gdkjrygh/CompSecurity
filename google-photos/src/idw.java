// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.widget.Toast;

final class idw
    implements jcq
{

    private idu a;

    idw(idu idu1)
    {
        a = idu1;
        super();
    }

    public final void a(Exception exception)
    {
        if (!nuo.a(a, exception, nup.d))
        {
            Toast.makeText(idu.g(a), b.yL, 1).show();
        }
    }

    public final void b(Intent intent)
    {
        intent = (ihk)intent.getParcelableExtra("envelope_share_details");
        idu.d(a).a(idu.b(a), intent, idu.c(a));
    }
}
