// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v5;

import android.os.Message;

// Referenced classes of package com.qihoo.security.v5:
//            CheckUpdateDialog

class a extends Thread
{

    final a a;
    final CheckUpdateDialog b;

    public void run()
    {
        int i = CheckUpdateDialog.c();
        a.sendMessage(Message.obtain(a, 0, i, 0));
    }

    (CheckUpdateDialog checkupdatedialog,  )
    {
        b = checkupdatedialog;
        a = ;
        super();
    }
}
