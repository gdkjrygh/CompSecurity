// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.widget.Toast;
import org.xbmc.kore.jsonrpc.ApiCallback;
import org.xbmc.kore.jsonrpc.HostConnection;

// Referenced classes of package org.xbmc.kore.ui:
//            MediaFileListFragment

class val.connection
    implements ApiCallback
{

    final MediaFileListFragment this$0;
    final HostConnection val$connection;

    public void onError(int i, String s)
    {
        if (!isAdded())
        {
            return;
        } else
        {
            Toast.makeText(getActivity(), String.format(getString(0x7f0700d6), new Object[] {
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
        MediaFileListFragment.access$400(MediaFileListFragment.this, val$connection, playlistId, MediaFileListFragment.access$300(MediaFileListFragment.this));
    }

    ()
    {
        this$0 = final_mediafilelistfragment;
        val$connection = HostConnection.this;
        super();
    }
}
