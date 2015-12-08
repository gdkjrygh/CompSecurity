// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import android.app.ProgressDialog;
import com.arist.a.e;
import com.arist.view.a;

// Referenced classes of package com.arist.activity:
//            z, MainActivity

final class aa
    implements Runnable
{

    final z a;

    aa(z z1)
    {
        a = z1;
        super();
    }

    public final void run()
    {
        com.arist.activity.z.a(a).d.dismiss();
        com.arist.activity.z.a(a).d = null;
        com.arist.activity.MainActivity.a(com.arist.activity.z.a(a)).notifyDataSetChanged();
        MainActivity.h(com.arist.activity.z.a(a)).b();
        com.arist.activity.z.a(a).a(0x7f09005d);
    }
}
