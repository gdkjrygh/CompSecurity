// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.widget.Toast;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xbmc.kore.jsonrpc.ApiCallback;

// Referenced classes of package org.xbmc.kore.ui:
//            MediaFileListFragment

class leLocation
    implements ApiCallback
{

    final MediaFileListFragment this$0;
    final leLocation val$dir;

    public void onError(int i, String s)
    {
        if (!isAdded())
        {
            return;
        } else
        {
            Toast.makeText(getActivity(), String.format(getString(0x7f0700d4), new Object[] {
                s
            }), 0).show();
            return;
        }
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((List)obj);
    }

    public void onSuccess(List list)
    {
        if (!isAdded())
        {
            return;
        }
        ArrayList arraylist = new ArrayList();
        leLocation lelocation = new leLocation("..", parentDirectory, true);
        lelocation.setRootDir(val$dir.isRootDir());
        arraylist.add(0, lelocation);
        org.xbmc.kore.jsonrpc.type. ;
        for (list = list.iterator(); list.hasNext(); arraylist.add(leLocation.newInstanceFromItemFile(getActivity(), )))
        {
             = (org.xbmc.kore.jsonrpc.type.)list.next();
        }

        MediaFileListFragment.access$100(MediaFileListFragment.this).setFilelistItems(arraylist);
        browseRootAlready = false;
    }

    leLocation()
    {
        this$0 = final_mediafilelistfragment;
        val$dir = leLocation.this;
        super();
    }
}
