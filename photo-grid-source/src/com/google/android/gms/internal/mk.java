// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            mj

final class mk
    implements Runnable
{

    final mj a;

    mk(mj mj1)
    {
        a = mj1;
        super();
    }

    public final void run()
    {
        a.onStop();
    }
}
