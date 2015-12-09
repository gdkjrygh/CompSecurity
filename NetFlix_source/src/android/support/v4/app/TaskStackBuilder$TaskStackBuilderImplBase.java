// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//            TaskStackBuilder

static class 
    implements 
{

    public PendingIntent getPendingIntent(Context context, Intent aintent[], int i, int j, Bundle bundle)
    {
        aintent = new Intent(aintent[aintent.length - 1]);
        aintent.addFlags(0x10000000);
        return PendingIntent.getActivity(context, i, aintent, j);
    }

    ()
    {
    }
}
