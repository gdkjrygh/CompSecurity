// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.timeline.advertising;

import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.timeline.PlacementOpportunity;
import java.util.List;

// Referenced classes of package com.adobe.mediacore.timeline.advertising:
//            ContentTracker

public abstract class AdProvider
{
    public static interface OnCompleteListener
    {

        public abstract void onComplete(AdProvider adprovider, List list);

        public abstract void onError(AdProvider adprovider, com.adobe.mediacore.MediaPlayerNotification.Error error);

        public abstract void onWarning(AdProvider adprovider, com.adobe.mediacore.MediaPlayerNotification.Warning warning);
    }


    protected OnCompleteListener _listener;

    public AdProvider()
    {
    }

    protected abstract ContentTracker doProvideAdTracker();

    protected abstract void doResolveAds(Metadata metadata, PlacementOpportunity placementopportunity);

    public ContentTracker getAdTracker()
    {
        return doProvideAdTracker();
    }

    protected void notifyResolveComplete(List list)
    {
        if (_listener != null)
        {
            _listener.onComplete(this, list);
        }
    }

    protected void notifyResolveError(com.adobe.mediacore.MediaPlayerNotification.Error error)
    {
        if (_listener != null)
        {
            _listener.onError(this, error);
        }
    }

    protected void notifyResolveWarning(com.adobe.mediacore.MediaPlayerNotification.Warning warning)
    {
        if (_listener != null)
        {
            _listener.onWarning(this, warning);
        }
    }

    public void registerOnCompleteListener(OnCompleteListener oncompletelistener)
    {
        if (_listener != null)
        {
            throw new IllegalStateException("Only one OnCompleteListener can be registered at a time.Remove first the listener previously registered.");
        }
        if (oncompletelistener == null)
        {
            throw new IllegalArgumentException("The listener which will be registered can't be null.");
        } else
        {
            _listener = oncompletelistener;
            return;
        }
    }

    public void resolveAds(Metadata metadata)
    {
        doResolveAds(metadata, null);
    }

    public void resolveAds(Metadata metadata, PlacementOpportunity placementopportunity)
    {
        doResolveAds(metadata, placementopportunity);
    }

    public void unregisterOnCompleteListener(OnCompleteListener oncompletelistener)
    {
        if (_listener == null)
        {
            throw new IllegalStateException("No listener was previously registered.");
        }
        if (_listener != oncompletelistener)
        {
            throw new IllegalArgumentException("The provided listener was not registered with this instance.Attempting to remove the wrong listener.");
        } else
        {
            _listener = null;
            return;
        }
    }
}
