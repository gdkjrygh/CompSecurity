// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v5;

import android.content.Intent;
import android.view.View;
import com.qihoo360.common.e.b;

// Referenced classes of package com.qihoo.security.v5:
//            UpdatedDialog, UpdateDownloadUIService, MobileConnectWarningDialog

class b
    implements android.view.ener
{

    final boolean a;
    final boolean b;
    final UpdatedDialog c;

    public void onClick(View view)
    {
        boolean flag = com.qihoo.security.v5.UpdatedDialog.b(com.qihoo360.common.e.b.c(c.getApplicationContext()));
        com.qihoo.security.support.b.b(27010);
        if (!flag)
        {
            view = new Intent(UpdatedDialog.a(c), com/qihoo/security/v5/UpdateDownloadUIService);
            view.putExtra("uiforce", a);
            view.putExtra("ispatch", b);
            view.putExtra("type", com.qihoo.security.v5.UpdatedDialog.b(c));
            c.startService(view);
            c.finish();
            return;
        } else
        {
            view = new Intent(UpdatedDialog.a(c), com/qihoo/security/v5/MobileConnectWarningDialog);
            view.putExtra("uiforce", a);
            view.putExtra("ispatch", b);
            view.putExtra("type", com.qihoo.security.v5.UpdatedDialog.b(c));
            c.startActivity(view);
            c.finish();
            com.qihoo.security.support.b.b(27011);
            return;
        }
    }

    ningDialog(UpdatedDialog updateddialog, boolean flag, boolean flag1)
    {
        c = updateddialog;
        a = flag;
        b = flag1;
        super();
    }
}
