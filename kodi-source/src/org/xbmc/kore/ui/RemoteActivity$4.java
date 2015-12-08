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

class val.callbackHandler
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
        if (val$startPlaylist)
        {
            (new org.xbmc.kore.jsonrpc.method.>(1)).te(val$connection, new ApiCallback() {

                final RemoteActivity._cls4 this$1;

                public void onError(int i, String s1)
                {
                    Toast.makeText(this$0, String.format(getString(0x7f0700d5), new Object[] {
                        s1
                    }), 0).show();
                }

                public volatile void onSuccess(Object obj)
                {
                    onSuccess((String)obj);
                }

                public void onSuccess(String s1)
                {
                }

            
            {
                this$1 = RemoteActivity._cls4.this;
                super();
            }
            }, val$callbackHandler);
        }
        s = (new StringBuilder()).append("android:switcher:").append(viewPager.getId()).append(":").append(3).toString();
        s = (PlaylistFragment)getSupportFragmentManager().findFragmentByTag(s);
        if (s != null)
        {
            s.forceRefreshPlaylist();
        }
    }

    on()
    {
        this$0 = final_remoteactivity;
        val$startPlaylist = flag;
        val$connection = hostconnection;
        val$callbackHandler = Handler.this;
        super();
    }
}
