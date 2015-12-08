// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.crop;

import android.app.ProgressDialog;

// Referenced classes of package com.android.slyce.crop:
//            z, u

class aa
    implements Runnable
{

    final z a;

    aa(z z1)
    {
        a = z1;
        super();
    }

    public void run()
    {
        z.a(a).b(a);
        if (z.b(a).getWindow() != null)
        {
            z.b(a).dismiss();
        }
    }
}
