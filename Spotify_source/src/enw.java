// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public interface enw
    extends env, epq
{

    public abstract boolean canAddToCollection();

    public abstract int getAddTime();

    public abstract enr getAlbum();

    public abstract List getArtists();

    public abstract String getName();

    public abstract int getOfflineState();

    public abstract String getUri();

    public abstract boolean inCollection();

    public abstract boolean isAvailable();

    public abstract boolean isExplicit();

    public abstract boolean isLocal();

    public abstract boolean isPlayable();
}
