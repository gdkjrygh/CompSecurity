// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

// Referenced classes of package android.support.v4.media:
//            MediaBrowserCompat, IMediaBrowserServiceCompat

private class <init>
    implements ServiceConnection
{

    final this._cls0 this$0;

    private boolean isCurrent(String s)
    {
        if (<init>(this._cls0.this) != this)
        {
            if (this._mth0(this._cls0.this) != 0)
            {
                Log.i("MediaBrowserCompat", (new StringBuilder()).append(s).append(" for ").append(this._mth0(this._cls0.this)).append(" with mServiceConnection=").append(this._mth0(this._cls0.this)).append(" this=").append(this).toString());
            }
            return false;
        } else
        {
            return true;
        }
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        if (!isCurrent("onServiceConnected"))
        {
            return;
        }
        isCurrent(this._cls0.this, android.support.v4.media.this._mth0(ibinder));
        this._mth0(this._cls0.this, this._mth0(this._cls0.this));
        this._mth0(this._cls0.this, 1);
        try
        {
            this._mth0(this._cls0.this).connect(this._mth0(this._cls0.this).getPackageName(), this._mth0(this._cls0.this), this._mth0(this._cls0.this));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname)
        {
            Log.w("MediaBrowserCompat", (new StringBuilder()).append("RemoteException during connect for ").append(this._mth0(this._cls0.this)).toString());
        }
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        if (!isCurrent("onServiceDisconnected"))
        {
            return;
        } else
        {
            isCurrent(this._cls0.this, null);
            this._mth0(this._cls0.this, null);
            this._mth0(this._cls0.this, 3);
            this._mth0(this._cls0.this)._mth0();
            return;
        }
    }

    private ()
    {
        this$0 = this._cls0.this;
        super();
    }

    this._cls0(this._cls0 _pcls0_1)
    {
        this();
    }
}
