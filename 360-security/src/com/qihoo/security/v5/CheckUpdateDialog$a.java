// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v5;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

// Referenced classes of package com.qihoo.security.v5:
//            CheckUpdateDialog

private static class a extends Handler
{

    private final WeakReference a;

    public void handleMessage(Message message)
    {
        CheckUpdateDialog checkupdatedialog = (CheckUpdateDialog)a.get();
        if (checkupdatedialog != null)
        {
            CheckUpdateDialog.a(checkupdatedialog, message);
        }
    }

    public (CheckUpdateDialog checkupdatedialog)
    {
        a = new WeakReference(checkupdatedialog);
    }
}
