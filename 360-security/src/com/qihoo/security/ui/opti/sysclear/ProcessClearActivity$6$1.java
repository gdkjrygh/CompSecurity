// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.opti.sysclear;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.qihoo360.mobilesafe.core.c.c;

// Referenced classes of package com.qihoo.security.ui.opti.sysclear:
//            ProcessClearActivity

class a
    implements Runnable
{

    final a a;

    public void run()
    {
        if (ProcessClearActivity.h(a.a) == null) goto _L2; else goto _L1
_L1:
        if (ProcessClearActivity.h(a.a).f()) goto _L4; else goto _L3
_L3:
        ProcessClearActivity.j(a.a).setVisibility(8);
        ProcessClearActivity.h(a.a).a(true);
_L2:
        a.a.o();
        return;
_L4:
        try
        {
            ProcessClearActivity.k(a.a).setVisibility(8);
            ProcessClearActivity.j(a.a).setVisibility(0);
        }
        catch (RemoteException remoteexception) { }
        if (true) goto _L2; else goto _L5
_L5:
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/qihoo/security/ui/opti/sysclear/ProcessClearActivity$6

/* anonymous class */
    class ProcessClearActivity._cls6
        implements ServiceConnection
    {

        final ProcessClearActivity a;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            ProcessClearActivity.a(a, com.qihoo360.mobilesafe.core.c.c.a.a(ibinder));
            if (ProcessClearActivity.h(a) != null)
            {
                try
                {
                    ProcessClearActivity.h(a).a(ProcessClearActivity.i(a));
                }
                // Misplaced declaration of an exception variable
                catch (ComponentName componentname) { }
            }
            a.y.post(new ProcessClearActivity._cls6._cls1(this));
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            if (ProcessClearActivity.h(a) == null)
            {
                break MISSING_BLOCK_LABEL_29;
            }
            ProcessClearActivity.h(a).b(ProcessClearActivity.i(a));
            return;
            componentname;
        }

            
            {
                a = processclearactivity;
                super();
            }
    }

}
