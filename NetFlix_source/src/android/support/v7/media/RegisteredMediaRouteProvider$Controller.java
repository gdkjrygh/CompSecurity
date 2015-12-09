// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.Intent;

// Referenced classes of package android.support.v7.media:
//            RegisteredMediaRouteProvider

private final class mRouteId extends mRouteId
{

    private mPendingUpdateVolumeDelta mConnection;
    private int mControllerId;
    private int mPendingSetVolume;
    private int mPendingUpdateVolumeDelta;
    private final String mRouteId;
    private boolean mSelected;
    final RegisteredMediaRouteProvider this$0;

    public void attachConnection(mRouteId mrouteid)
    {
        mConnection = mrouteid;
        mControllerId = mrouteid.createRouteController(mRouteId);
        if (mSelected)
        {
            mrouteid.selectRoute(mControllerId);
            if (mPendingSetVolume >= 0)
            {
                mrouteid.setVolume(mControllerId, mPendingSetVolume);
                mPendingSetVolume = -1;
            }
            if (mPendingUpdateVolumeDelta != 0)
            {
                mrouteid.updateVolume(mControllerId, mPendingUpdateVolumeDelta);
                mPendingUpdateVolumeDelta = 0;
            }
        }
    }

    public void detachConnection()
    {
        if (mConnection != null)
        {
            mConnection.releaseRouteController(mControllerId);
            mConnection = null;
            mControllerId = 0;
        }
    }

    public boolean onControlRequest(Intent intent, mControllerId mcontrollerid)
    {
        if (mConnection != null)
        {
            return mConnection.sendControlRequest(mControllerId, intent, mcontrollerid);
        } else
        {
            return false;
        }
    }

    public void onRelease()
    {
        RegisteredMediaRouteProvider.access$100(RegisteredMediaRouteProvider.this, this);
    }

    public void onSelect()
    {
        mSelected = true;
        if (mConnection != null)
        {
            mConnection.selectRoute(mControllerId);
        }
    }

    public void onSetVolume(int i)
    {
        if (mConnection != null)
        {
            mConnection.setVolume(mControllerId, i);
            return;
        } else
        {
            mPendingSetVolume = i;
            mPendingUpdateVolumeDelta = 0;
            return;
        }
    }

    public void onUnselect()
    {
        mSelected = false;
        if (mConnection != null)
        {
            mConnection.unselectRoute(mControllerId);
        }
    }

    public void onUpdateVolume(int i)
    {
        if (mConnection != null)
        {
            mConnection.updateVolume(mControllerId, i);
            return;
        } else
        {
            mPendingUpdateVolumeDelta = mPendingUpdateVolumeDelta + i;
            return;
        }
    }

    public (String s)
    {
        this$0 = RegisteredMediaRouteProvider.this;
        super();
        mPendingSetVolume = -1;
        mRouteId = s;
    }
}
