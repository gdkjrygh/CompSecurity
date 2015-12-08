// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package android.support.v4.app:
//            an

static final class 
    implements 
{

    public final PendingIntent a(Context context, Intent aintent[])
    {
        aintent = new Intent(aintent[aintent.length - 1]);
        aintent.addFlags(0x10000000);
        return PendingIntent.getActivity(context, 0, aintent, 0x40000000);
    }

    ()
    {
    }
}
