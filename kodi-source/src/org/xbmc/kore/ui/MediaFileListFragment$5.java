// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.widget.Toast;
import java.util.Queue;
import org.xbmc.kore.jsonrpc.ApiCallback;

// Referenced classes of package org.xbmc.kore.ui:
//            MediaFileListFragment

class this._cls0
    implements ApiCallback
{

    final MediaFileListFragment this$0;

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
        for (; mediaQueueFileLocation.size() > 0; MediaFileListFragment.access$200(MediaFileListFragment.this, ((leLocation)mediaQueueFileLocation.poll()).file)) { }
    }

    leLocation()
    {
        this$0 = MediaFileListFragment.this;
        super();
    }
}
