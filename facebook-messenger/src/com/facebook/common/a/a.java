// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.a;

import android.os.AsyncTask;

// Referenced classes of package com.facebook.common.a:
//            b

public class a
{

    private final AsyncTask a;

    public a(Runnable runnable)
    {
        a = new b(this, runnable);
    }

    public void a()
    {
        a.execute(new Void[] {
            (Void)null
        });
    }
}
