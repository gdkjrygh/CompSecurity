// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.share.model;

import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Arrays;

// Referenced classes of package com.spotify.mobile.android.spotlets.share.model:
//            Resource, Network

public class mNetworks
    implements JacksonModel
{

    private Network mNetworks[];
    private Resource mResource;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof mNetworks))
            {
                return false;
            }
            obj = (mNetworks)obj;
            if (!Arrays.equals(mNetworks, ((mNetworks) (obj)).mNetworks))
            {
                return false;
            }
            if (mResource == null ? ((mResource) (obj)).mResource != null : !mResource.equals(((s) (obj)).mResource))
            {
                return false;
            }
        }
        return true;
    }

    public Network getNetwork(mResource mresource)
    {
        for (int i = 0; i < mNetworks.length; i++)
        {
            Network network = mNetworks[i];
            if (network.getNetworkType().quals(mresource))
            {
                return network;
            }
        }

        return null;
    }

    public Network[] getNetworks()
    {
        return mNetworks;
    }

    public Resource getResource()
    {
        return mResource;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (mResource != null)
        {
            i = mResource.hashCode();
        } else
        {
            i = 0;
        }
        if (mNetworks != null)
        {
            j = Arrays.hashCode(mNetworks);
        }
        return i * 31 + j;
    }

    public void replaceNetwork(Network network)
    {
        int i = 0;
        do
        {
label0:
            {
                if (i < mNetworks.length)
                {
                    if (!mNetworks[i].getNetworkType().quals(network.getNetworkType()))
                    {
                        break label0;
                    }
                    mNetworks[i] = network;
                }
                return;
            }
            i++;
        } while (true);
    }

    public (Resource resource, Network anetwork[])
    {
        mResource = resource;
        mNetworks = anetwork;
    }
}
