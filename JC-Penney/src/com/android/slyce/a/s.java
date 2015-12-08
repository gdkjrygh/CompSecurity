// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;

import android.util.Log;

// Referenced classes of package com.android.slyce.a:
//            bm

final class s
    implements Runnable
{

    final bm a;

    s(bm bm1)
    {
        a = bm1;
        super();
    }

    public void run()
    {
        try
        {
            a.h();
            return;
        }
        catch (Exception exception)
        {
            Log.i("NIO", "Selector Exception? L Preview?");
        }
    }
}
