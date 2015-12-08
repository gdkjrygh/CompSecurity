// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.os.Handler;
import android.widget.Toast;
import java.util.ArrayList;
import org.xbmc.kore.jsonrpc.ApiCallback;
import org.xbmc.kore.jsonrpc.HostConnection;

// Referenced classes of package org.xbmc.kore.ui:
//            MediaFileListFragment

class this._cls1
    implements ApiCallback
{

    final onSuccess this$1;

    public void onError(int i, String s)
    {
        if (!isAdded())
        {
            return;
        } else
        {
            Toast.makeText(getActivity(), String.format(getString(0x7f0700d5), new Object[] {
                s
            }), 0).show();
            return;
        }
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

    // Unreferenced inner class org/xbmc/kore/ui/MediaFileListFragment$7

/* anonymous class */
    class MediaFileListFragment._cls7
        implements ApiCallback
    {

        final MediaFileListFragment this$0;
        final Handler val$callbackHandler;
        final HostConnection val$connection;
        final int val$playlistId;

        public void onError(int i, String s)
        {
            if (!isAdded())
            {
                return;
            } else
            {
                Toast.makeText(getActivity(), String.format(getString(0x7f0700d3), new Object[] {
                    s
                }), 0).show();
                return;
            }
        }

        public volatile void onSuccess(Object obj)
        {
            onSuccess((ArrayList)obj);
        }

        public void onSuccess(ArrayList arraylist)
        {
            if (arraylist.isEmpty())
            {
                (new org.xbmc.kore.jsonrpc.method.Player.Open(playlistId)).execute(connection, new MediaFileListFragment._cls7._cls1(), callbackHandler);
            }
        }

            
            {
                this$0 = final_mediafilelistfragment;
                playlistId = i;
                connection = hostconnection;
                callbackHandler = Handler.this;
                super();
            }
    }

}
