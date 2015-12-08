// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.os.Bundle;

// Referenced classes of package android.support.v7.media:
//            MediaRouteSelector

public final class MediaRouteDiscoveryRequest
{

    private static final String KEY_ACTIVE_SCAN = "activeScan";
    private static final String KEY_SELECTOR = "selector";
    private final Bundle mBundle;
    private MediaRouteSelector mSelector;

    private MediaRouteDiscoveryRequest(Bundle bundle)
    {
        mBundle = bundle;
    }

    public MediaRouteDiscoveryRequest(MediaRouteSelector mediarouteselector, boolean flag)
    {
        if (mediarouteselector == null)
        {
            throw new IllegalArgumentException("selector must not be null");
        } else
        {
            mBundle = new Bundle();
            mSelector = mediarouteselector;
            mBundle.putBundle("selector", mediarouteselector.asBundle());
            mBundle.putBoolean("activeScan", flag);
            return;
        }
    }

    private void ensureSelector()
    {
        if (mSelector == null)
        {
            mSelector = MediaRouteSelector.fromBundle(mBundle.getBundle("selector"));
            if (mSelector == null)
            {
                mSelector = MediaRouteSelector.EMPTY;
            }
        }
    }

    public static MediaRouteDiscoveryRequest fromBundle(Bundle bundle)
    {
        if (bundle != null)
        {
            return new MediaRouteDiscoveryRequest(bundle);
        } else
        {
            return null;
        }
    }

    public Bundle asBundle()
    {
        return mBundle;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof MediaRouteDiscoveryRequest)
        {
            obj = (MediaRouteDiscoveryRequest)obj;
            flag = flag1;
            if (getSelector().equals(((MediaRouteDiscoveryRequest) (obj)).getSelector()))
            {
                flag = flag1;
                if (isActiveScan() == ((MediaRouteDiscoveryRequest) (obj)).isActiveScan())
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public MediaRouteSelector getSelector()
    {
        ensureSelector();
        return mSelector;
    }

    public int hashCode()
    {
        int i = getSelector().hashCode();
        boolean flag;
        if (isActiveScan())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag ^ i;
    }

    public boolean isActiveScan()
    {
        return mBundle.getBoolean("activeScan");
    }

    public boolean isValid()
    {
        ensureSelector();
        return mSelector.isValid();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("DiscoveryRequest{ selector=").append(getSelector());
        stringbuilder.append(", activeScan=").append(isActiveScan());
        stringbuilder.append(", isValid=").append(isValid());
        stringbuilder.append(" }");
        return stringbuilder.toString();
    }
}
