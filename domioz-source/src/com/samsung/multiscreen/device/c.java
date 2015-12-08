// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.device;


// Referenced classes of package com.samsung.multiscreen.device:
//            f, Device, d, g

final class c
    implements f
{

    c()
    {
    }

    public final void onError(g g)
    {
    }

    public final void onResult(Object obj)
    {
        ((Device)obj).a("ChatDemo", new d(this));
    }
}
