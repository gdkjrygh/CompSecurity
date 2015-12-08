// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.AncsNotificationParcelable;

// Referenced classes of package com.google.android.gms.wearable:
//            zzh

class b
    implements Runnable
{

    final zzh a;
    final AncsNotificationParcelable b;
    final lable c;

    public void run()
    {
        a.a(b);
    }

    lable(lable lable, zzh zzh1, AncsNotificationParcelable ancsnotificationparcelable)
    {
        c = lable;
        a = zzh1;
        b = ancsnotificationparcelable;
        super();
    }
}
