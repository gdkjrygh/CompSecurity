// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;


// Referenced classes of package com.google.android.gms.dynamic:
//            a, LifecycleDelegate

private static interface cycleDelegate
{

    public abstract void b(LifecycleDelegate lifecycledelegate);

    public abstract int getState();
}
