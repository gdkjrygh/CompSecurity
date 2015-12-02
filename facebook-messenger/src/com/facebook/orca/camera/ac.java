// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.camera;

import android.app.ProgressDialog;

// Referenced classes of package com.facebook.orca.camera:
//            ab, x

class ac
    implements Runnable
{

    final ab a;

    ac(ab ab1)
    {
        a = ab1;
        super();
    }

    public void run()
    {
        ab.a(a).b(a);
        if (ab.b(a).getWindow() != null)
        {
            ab.b(a).dismiss();
        }
    }
}
