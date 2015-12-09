// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.audio;

import android.app.PendingIntent;

// Referenced classes of package com.pandora.android.audio:
//            f, d

public class e
{

    public static d a(PendingIntent pendingintent)
    {
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            return new f(pendingintent);
        } else
        {
            return new d(pendingintent);
        }
    }
}
