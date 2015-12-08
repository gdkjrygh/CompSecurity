// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import java.util.List;
import org.xbmc.kore.jsonrpc.ApiCallback;

// Referenced classes of package org.xbmc.kore.ui:
//            PlaylistFragment

class ItemsAll
    implements ApiCallback
{

    final PlaylistFragment this$0;
    final org.xbmc.kore.jsonrpc.type.mResult val$getItemResult;

    public void onError(int i, String s)
    {
        if (!isAdded())
        {
            return;
        } else
        {
            PlaylistFragment.access$600(PlaylistFragment.this, s);
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
        } else
        {
            PlaylistFragment.access$402(PlaylistFragment.this, list);
            PlaylistFragment.access$500(PlaylistFragment.this, val$getItemResult, list);
            return;
        }
    }

    ItemsAll()
    {
        this$0 = final_playlistfragment;
        val$getItemResult = org.xbmc.kore.jsonrpc.type.mResult.this;
        super();
    }
}
