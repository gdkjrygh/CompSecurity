// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            bl, bg, be

class a
    implements a
{

    final bl a;

    public void a(com.google.android.gms.internal.zze zze, Set set, Set set1, bg bg1)
    {
        set.addAll(zze.zzyC());
        set1.addAll(zze.zzyD());
        bg1.e().zzc(zze.zzyC(), zze.zzyH());
        bg1.f().zzc(zze.zzyD(), zze.zzyI());
    }

    e(bl bl1)
    {
        a = bl1;
        super();
    }
}
