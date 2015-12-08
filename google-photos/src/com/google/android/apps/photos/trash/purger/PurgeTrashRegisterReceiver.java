// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.trash.purger;

import android.content.Context;
import android.content.Intent;
import ez;

// Referenced classes of package com.google.android.apps.photos.trash.purger:
//            PurgeTrashService

public class PurgeTrashRegisterReceiver extends ez
{

    public PurgeTrashRegisterReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        a(context, PurgeTrashService.a(context));
    }
}
