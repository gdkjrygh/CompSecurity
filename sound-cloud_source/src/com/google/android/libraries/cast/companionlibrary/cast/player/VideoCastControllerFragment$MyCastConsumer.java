// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast.player;

import com.google.android.gms.cast.o;
import com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager;
import com.google.android.libraries.cast.companionlibrary.cast.callbacks.VideoCastConsumerImpl;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException;
import com.google.android.libraries.cast.companionlibrary.utils.LogUtils;
import com.google.android.libraries.cast.companionlibrary.utils.Utils;
import java.util.List;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast.player:
//            VideoCastControllerFragment, VideoCastController

private class <init> extends VideoCastConsumerImpl
{

    final VideoCastControllerFragment this$0;

    public void onApplicationDisconnected(int i)
    {
        VideoCastControllerFragment.access$200(VideoCastControllerFragment.this).closeActivity();
    }

    public void onConnectionSuspended(int i)
    {
        VideoCastControllerFragment.access$200(VideoCastControllerFragment.this).updateControllersStatus(false);
    }

    public void onConnectivityRecovered()
    {
        VideoCastControllerFragment.access$200(VideoCastControllerFragment.this).updateControllersStatus(true);
    }

    public void onDisconnected()
    {
        VideoCastControllerFragment.access$200(VideoCastControllerFragment.this).closeActivity();
    }

    public void onFailed(int i, int j)
    {
        LogUtils.LOGD(VideoCastControllerFragment.access$100(), (new StringBuilder("onFailed(): ")).append(getString(i)).append(", status code: ").append(j).toString());
        if (j == 2100 || j == 2102)
        {
            Utils.showToast(getActivity(), i);
            VideoCastControllerFragment.access$200(VideoCastControllerFragment.this).closeActivity();
        }
    }

    public void onMediaQueueUpdated(List list, o o, int i, boolean flag)
    {
        i = 0;
        int j;
        if (list != null)
        {
            j = list.size();
            i = list.indexOf(o);
        } else
        {
            j = 0;
        }
        VideoCastControllerFragment.access$200(VideoCastControllerFragment.this).onQueueItemsUpdated(j, i);
    }

    public void onRemoteMediaPlayerMetadataUpdated()
    {
        VideoCastControllerFragment.access$602(VideoCastControllerFragment.this, VideoCastControllerFragment.access$700(VideoCastControllerFragment.this).getRemoteMediaInformation());
        VideoCastControllerFragment.access$800(VideoCastControllerFragment.this);
        VideoCastControllerFragment.access$900(VideoCastControllerFragment.this);
        return;
        Object obj;
        obj;
_L2:
        LogUtils.LOGE(VideoCastControllerFragment.access$100(), "Failed to update the metadata due to network issues", ((Throwable) (obj)));
        return;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void onRemoteMediaPlayerStatusUpdated()
    {
        VideoCastControllerFragment.access$1000(VideoCastControllerFragment.this);
    }

    private ()
    {
        this$0 = VideoCastControllerFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
