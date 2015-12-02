// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui:
//            ResidualFileUninstallDialog

class a
    implements ServiceConnection
{

    final ResidualFileUninstallDialog a;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        ResidualFileUninstallDialog.a(a, com.qihoo.security.opti.trashclear.service.(ibinder));
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        ResidualFileUninstallDialog.a(a, null);
    }

    I(ResidualFileUninstallDialog residualfileuninstalldialog)
    {
        a = residualfileuninstalldialog;
        super();
    }
}
