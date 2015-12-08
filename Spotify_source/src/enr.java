// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.show.model.Covers;

public interface enr
    extends env, epq
{

    public abstract ent getArtist();

    public abstract String getCollectionUri();

    public abstract String getCopyright();

    public abstract Covers getCovers();

    public abstract int getInferredOfflineState();

    public abstract String getName();

    public abstract int getNumDiscs();

    public abstract int getNumTracks();

    public abstract int getNumTracksInCollection();

    public abstract int getOfflineState();

    public abstract int getSyncProgress();

    public abstract String getUri();

    public abstract int getYear();

    public abstract boolean isAnyTrackPlayable();

    public abstract boolean isSavedToCollection();
}
