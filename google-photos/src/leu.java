// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.Status;

public final class leu
    implements lny
{

    private final Status a;
    private final PendingIntent b;

    public leu(Status status, PendingIntent pendingintent)
    {
        a = status;
        b = pendingintent;
    }

    public final void a(Context context)
    {
        try
        {
            context.startIntentSender(b.getIntentSender(), null, 0, 0, 0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
    }

    public final Status a_()
    {
        return a;
    }
}
