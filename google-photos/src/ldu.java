// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;

final class ldu extends ldg
{

    private ldt a;

    ldu(ldt ldt1)
    {
        a = ldt1;
        super();
    }

    public final void a(int i, PendingIntent pendingintent)
    {
        a.a(new leu(new Status(i), pendingintent));
    }
}
