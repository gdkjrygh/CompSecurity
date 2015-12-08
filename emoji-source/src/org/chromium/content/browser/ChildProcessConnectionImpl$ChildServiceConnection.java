// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import org.chromium.base.TraceEvent;
import org.chromium.content.app.ChromiumLinkerParams;

// Referenced classes of package org.chromium.content.browser:
//            ChildProcessConnectionImpl

private class mBindFlags
    implements ServiceConnection
{

    private final int mBindFlags;
    private boolean mBound;
    final ChildProcessConnectionImpl this$0;

    private Intent createServiceBindIntent()
    {
        Intent intent = new Intent();
        intent.setClassName(ChildProcessConnectionImpl.access$000(ChildProcessConnectionImpl.this), (new StringBuilder()).append(ChildProcessConnectionImpl.access$100(ChildProcessConnectionImpl.this).getName()).append(ChildProcessConnectionImpl.access$200(ChildProcessConnectionImpl.this)).toString());
        intent.setPackage(ChildProcessConnectionImpl.access$000(ChildProcessConnectionImpl.this).getPackageName());
        return intent;
    }

    boolean bind(String as[])
    {
        if (!mBound)
        {
            TraceEvent.begin();
            Intent intent = createServiceBindIntent();
            if (as != null)
            {
                intent.putExtra("com.google.android.apps.chrome.extra.command_line", as);
            }
            if (ChildProcessConnectionImpl.access$300(ChildProcessConnectionImpl.this) != null)
            {
                ChildProcessConnectionImpl.access$300(ChildProcessConnectionImpl.this).addIntentExtras(intent);
            }
            mBound = ChildProcessConnectionImpl.access$000(ChildProcessConnectionImpl.this).bindService(intent, this, mBindFlags);
            TraceEvent.end();
        }
        return mBound;
    }

    boolean isBound()
    {
        return mBound;
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
label0:
        {
            synchronized (ChildProcessConnectionImpl.access$400(ChildProcessConnectionImpl.this))
            {
                if (!ChildProcessConnectionImpl.access$500(ChildProcessConnectionImpl.this))
                {
                    break label0;
                }
            }
            return;
        }
        TraceEvent.begin();
        ChildProcessConnectionImpl.access$502(ChildProcessConnectionImpl.this, true);
        ChildProcessConnectionImpl.access$602(ChildProcessConnectionImpl.this, org.chromium.content.common..this._mth0(ibinder));
        if (ChildProcessConnectionImpl.access$700(ChildProcessConnectionImpl.this) != null)
        {
            ChildProcessConnectionImpl.access$800(ChildProcessConnectionImpl.this);
        }
        TraceEvent.end();
        componentname;
        JVM INSTR monitorexit ;
        return;
        ibinder;
        componentname;
        JVM INSTR monitorexit ;
        throw ibinder;
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        boolean flag;
label0:
        {
            flag = false;
            synchronized (ChildProcessConnectionImpl.access$400(ChildProcessConnectionImpl.this))
            {
                if (!ChildProcessConnectionImpl.access$900(ChildProcessConnectionImpl.this))
                {
                    break label0;
                }
            }
            return;
        }
        ChildProcessConnectionImpl childprocessconnectionimpl;
        ChildProcessConnectionImpl.access$902(ChildProcessConnectionImpl.this, true);
        childprocessconnectionimpl = ChildProcessConnectionImpl.this;
        if (ChildProcessConnectionImpl.access$1100(ChildProcessConnectionImpl.this).isBound() || ChildProcessConnectionImpl.access$1200(ChildProcessConnectionImpl.this).isBound())
        {
            flag = true;
        }
        ChildProcessConnectionImpl.access$1002(childprocessconnectionimpl, flag);
        Log.w("ChildProcessConnection", (new StringBuilder()).append("onServiceDisconnected (crash or killed by oom): pid=").append(ChildProcessConnectionImpl.access$1300(ChildProcessConnectionImpl.this)).toString());
        stop();
        ChildProcessConnectionImpl.access$1400(ChildProcessConnectionImpl.this).sDied(ChildProcessConnectionImpl.this);
        if (ChildProcessConnectionImpl.access$1500(ChildProcessConnectionImpl.this) != null)
        {
            ChildProcessConnectionImpl.access$1500(ChildProcessConnectionImpl.this).ted(0);
        }
        ChildProcessConnectionImpl.access$1502(ChildProcessConnectionImpl.this, null);
        componentname;
        JVM INSTR monitorexit ;
        return;
        exception;
        componentname;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void unbind()
    {
        if (mBound)
        {
            ChildProcessConnectionImpl.access$000(ChildProcessConnectionImpl.this).unbindService(this);
            mBound = false;
        }
    }

    public (int i)
    {
        this$0 = ChildProcessConnectionImpl.this;
        super();
        mBound = false;
        mBindFlags = i;
    }
}
