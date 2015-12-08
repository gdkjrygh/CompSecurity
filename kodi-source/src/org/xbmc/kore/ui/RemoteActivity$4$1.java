// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.os.Handler;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.widget.Toast;
import org.xbmc.kore.jsonrpc.ApiCallback;
import org.xbmc.kore.jsonrpc.HostConnection;

// Referenced classes of package org.xbmc.kore.ui:
//            RemoteActivity, PlaylistFragment

class this._cls1
    implements ApiCallback
{

    final onSuccess this$1;

    public void onError(int i, String s)
    {
        Toast.makeText(_fld0, String.format(getString(0x7f0700d5), new Object[] {
            s
        }), 0).show();
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    public void onSuccess(String s)
    {
    }

    l.callbackHandler()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class org/xbmc/kore/ui/RemoteActivity$4

/* anonymous class */
    class RemoteActivity._cls4
        implements ApiCallback
    {

        final RemoteActivity this$0;
        final Handler val$callbackHandler;
        final HostConnection val$connection;
        final boolean val$startPlaylist;

        public void onError(int i, String s)
        {
            Toast.makeText(RemoteActivity.this, String.format(getString(0x7f0700d6), new Object[] {
                s
            }), 0).show();
        }

        public volatile void onSuccess(Object obj)
        {
            onSuccess((String)obj);
        }

        public void onSuccess(String s)
        {
            if (startPlaylist)
            {
                (new org.xbmc.kore.jsonrpc.method.Player.Open(1)).execute(connection, new RemoteActivity._cls4._cls1(), callbackHandler);
            }
            s = (new StringBuilder()).append("android:switcher:").append(viewPager.getId()).append(":").append(3).toString();
            s = (PlaylistFragment)getSupportFragmentManager().findFragmentByTag(s);
            if (s != null)
            {
                s.forceRefreshPlaylist();
            }
        }

            
            {
                this$0 = final_remoteactivity;
                startPlaylist = flag;
                connection = hostconnection;
                callbackHandler = Handler.this;
                super();
            }
    }

}
