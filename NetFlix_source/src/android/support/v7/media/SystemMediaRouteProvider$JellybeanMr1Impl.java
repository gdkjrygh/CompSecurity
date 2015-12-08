// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.Context;
import android.view.Display;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.media:
//            SystemMediaRouteProvider, MediaRouterJellybeanMr1, MediaRouteDescriptor

private static class it> extends it>
    implements it>
{

    private nd mActiveScanWorkaround;
    private ound mIsConnectingWorkaround;

    protected Object createCallbackObj()
    {
        return MediaRouterJellybeanMr1.createCallback(this);
    }

    protected boolean isConnecting(temRouteRecord temrouterecord)
    {
        if (mIsConnectingWorkaround == null)
        {
            mIsConnectingWorkaround = new ound();
        }
        return mIsConnectingWorkaround.isConnecting(temrouterecord.mRouteObj);
    }

    protected void onBuildSystemRouteDescriptor(temRouteRecord temrouterecord, temRouteRecord temrouterecord1)
    {
        super.uildSystemRouteDescriptor(temrouterecord, temrouterecord1);
        if (!d(temrouterecord.mRouteObj))
        {
            temrouterecord1.mRouteObj(false);
        }
        if (isConnecting(temrouterecord))
        {
            temrouterecord1.(true);
        }
        temrouterecord = ntationDisplay(temrouterecord.mRouteObj);
        if (temrouterecord != null)
        {
            temrouterecord1.onDisplayId(temrouterecord.getDisplayId());
        }
    }

    public void onRoutePresentationDisplayChanged(Object obj)
    {
        int i = findSystemRouteRecord(obj);
        if (i >= 0)
        {
            temRouteRecord temrouterecord = (temRouteRecord)mSystemRouteRecords.get(i);
            obj = ntationDisplay(obj);
            if (obj != null)
            {
                i = ((Display) (obj)).getDisplayId();
            } else
            {
                i = -1;
            }
            if (i != temrouterecord.mRouteDescriptor.getPresentationDisplayId())
            {
                temrouterecord.mRouteDescriptor = (new temRouteRecord.mRouteDescriptor(temrouterecord.mRouteDescriptor)).onDisplayId(i).onDisplayId();
                publishRoutes();
            }
        }
    }

    protected void updateCallback()
    {
        super.ateCallback();
        if (mActiveScanWorkaround == null)
        {
            mActiveScanWorkaround = new nd(getContext(), getHandler());
        }
        nd nd = mActiveScanWorkaround;
        int i;
        if (mActiveScan)
        {
            i = mRouteTypes;
        } else
        {
            i = 0;
        }
        nd.setActiveScanRouteTypes(i);
    }

    public temRouteRecord(Context context, temRouteRecord temrouterecord)
    {
        super(context, temrouterecord);
    }
}
