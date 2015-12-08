// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
        rootFileLocation.clear();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Object obj = (org.xbmc.kore.jsonrpc.type.tion)list.next();
            if (!((org.xbmc.kore.jsonrpc.type.tion) (obj)).tion.contains("addons:"))
            {
                obj = new leLocation(((org.xbmc.kore.jsonrpc.type.) (obj))., ((org.xbmc.kore.jsonrpc.type.) (obj))., true);
                ((leLocation) (obj)).setRootDir(true);
                rootFileLocation.add(obj);
            }
        } while (true);
        browseRootAlready = true;
        emptyView.setText(getString(0x7f0700de));
        MediaFileListFragment.access$100(MediaFileListFragment.this).setFilelistItems(rootFileLocation);
    }

    diaFileListAdapter()
    {
        this$0 = MediaFileListFragment.this;
        super();
    }
}
