// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;

import java.util.List;

// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            Playable

public interface KidsCharacterDetails
    extends Playable
{

    public abstract String getBifUrl();

    public abstract String getCatalogIdUrl();

    public abstract String getCharacterId();

    public abstract String getCharacterName();

    public abstract String getCharacterSynopsis();

    public abstract List getGallery();

    public abstract String getGalleryRequestId();

    public abstract int getGalleryTrackId();

    public abstract String getHighResolutionLandscapeBoxArtUrl();

    public abstract String getHighResolutionPortraitBoxArtUrl();

    public abstract String getStoryUrl();

    public abstract String getSynopsis();

    public abstract String getWatchNextDispUrl();
}
