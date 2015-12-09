// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.SparseArray;

// Referenced classes of package android.support.v7.media:
//            MediaRouteProviderService, MediaRouteProvider, MediaRouteDiscoveryRequest

private final class mVersion
    implements android.os..ClientRecord
{

    private final SparseArray mControllers = new SparseArray();
    public MediaRouteDiscoveryRequest mDiscoveryRequest;
    public final Messenger mMessenger;
    public final int mVersion;
    final MediaRouteProviderService this$0;

    public void binderDied()
    {
        MediaRouteProviderService.access$900(MediaRouteProviderService.this).obtainMessage(1, mMessenger).sendToTarget();
    }

    public boolean createRouteController(String s, int i)
    {
        if (mControllers.indexOfKey(i) < 0)
        {
            s = MediaRouteProviderService.access$700(MediaRouteProviderService.this).onCreateRouteController(s);
            if (s != null)
            {
                mControllers.put(i, s);
                return true;
            }
        }
        return false;
    }

    public void dispose()
    {
        int j = mControllers.size();
        for (int i = 0; i < j; i++)
        {
            ((mControllers)mControllers.valueAt(i)).lease();
        }

        mControllers.clear();
        mMessenger.getBinder().unlinkToDeath(this, 0);
        setDiscoveryRequest(null);
    }

    public setDiscoveryRequest getRouteController(int i)
    {
        return (setDiscoveryRequest)mControllers.get(i);
    }

    public boolean hasMessenger(Messenger messenger)
    {
        return mMessenger.getBinder() == messenger.getBinder();
    }

    public boolean register()
    {
        try
        {
            mMessenger.getBinder().linkToDeath(this, 0);
        }
        catch (RemoteException remoteexception)
        {
            binderDied();
            return false;
        }
        return true;
    }

    public boolean releaseRouteController(int i)
    {
        binderDied binderdied = (binderDied)mControllers.get(i);
        if (binderdied != null)
        {
            mControllers.remove(i);
            binderdied.lease();
            return true;
        } else
        {
            return false;
        }
    }

    public boolean setDiscoveryRequest(MediaRouteDiscoveryRequest mediaroutediscoveryrequest)
    {
        if (mDiscoveryRequest != mediaroutediscoveryrequest && (mDiscoveryRequest == null || !mDiscoveryRequest.equals(mediaroutediscoveryrequest)))
        {
            mDiscoveryRequest = mediaroutediscoveryrequest;
            return MediaRouteProviderService.access$800(MediaRouteProviderService.this);
        } else
        {
            return false;
        }
    }

    public String toString()
    {
        return MediaRouteProviderService.access$1000(mMessenger);
    }

    public r(Messenger messenger, int i)
    {
        this$0 = MediaRouteProviderService.this;
        super();
        mMessenger = messenger;
        mVersion = i;
    }
}
