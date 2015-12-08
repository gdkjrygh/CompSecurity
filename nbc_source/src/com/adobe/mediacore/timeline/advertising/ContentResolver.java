// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.timeline.advertising;

import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.timeline.PlacementOpportunity;
import java.util.List;

// Referenced classes of package com.adobe.mediacore.timeline.advertising:
//            AdProvider, ContentTracker

public abstract class ContentResolver extends AdProvider
{

    private AdProvider.OnCompleteListener _listener;

    protected ContentResolver()
    {
    }

    public final boolean canResolve(PlacementOpportunity placementopportunity)
    {
        return doCanResolve(placementopportunity);
    }

    protected abstract boolean doCanResolve(PlacementOpportunity placementopportunity);

    protected abstract ContentTracker doProvideAdTracker();

    protected abstract void doResolveAds(Metadata metadata, PlacementOpportunity placementopportunity);

    public final ContentTracker getAdTracker()
    {
        return doProvideAdTracker();
    }

    protected final void notifyResolveComplete(List list)
    {
        if (_listener != null)
        {
            _listener.onComplete(this, list);
        }
    }

    protected final void notifyResolveError(com.adobe.mediacore.MediaPlayerNotification.Error error)
    {
        if (_listener != null)
        {
            _listener.onError(this, error);
        }
    }

    protected final void notifyResolveWarning(com.adobe.mediacore.MediaPlayerNotification.Warning warning)
    {
        if (_listener != null)
        {
            _listener.onWarning(this, warning);
        }
    }

    public final void registerOnCompleteListener(AdProvider.OnCompleteListener oncompletelistener)
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

    public final void resolveAds(Metadata metadata)
    {
        doResolveAds(metadata, null);
    }

    public final void resolveAds(Metadata metadata, PlacementOpportunity placementopportunity)
    {
        doResolveAds(metadata, placementopportunity);
    }

    public final void unregisterOnCompleteListener(AdProvider.OnCompleteListener oncompletelistener)
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
