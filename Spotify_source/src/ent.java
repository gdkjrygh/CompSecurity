// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.show.model.Covers;

public interface ent
    extends env, epq
{

    public abstract String getCollectionUri();

    public abstract Covers getCovers();

    public abstract int getInferredOfflineState();

    public abstract String getName();

    public abstract int getNumAlbumsInCollection();

    public abstract int getNumTracksInCollection();

    public abstract int getOfflineState();

    public abstract int getSyncProgress();

    public abstract String getUri();

    public abstract boolean isFollowed();

    public abstract boolean isVariousArtists();
}
