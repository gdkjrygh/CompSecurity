// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v5;

import android.view.View;
import com.qihoo360.mobilesafe.b.a;

// Referenced classes of package com.qihoo.security.v5:
//            UpdatedDialog, c

class a
    implements android.view.ener
{

    final UpdatedDialog a;

    public void onClick(View view)
    {
        com.qihoo.security.v5.c.a(com.qihoo.security.v5.UpdatedDialog.a(a));
        if (UpdatedDialog.c(a))
        {
            com.qihoo360.mobilesafe.b.a.e(com.qihoo.security.v5.UpdatedDialog.a(a));
        }
        a.finish();
    }

    (UpdatedDialog updateddialog)
    {
        a = updateddialog;
        super();
    }
}
