// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

public interface drz
    extends drx
{

    public abstract String getContext();

    public abstract String getGroup();

    public abstract String getUri();

    public abstract boolean isPlayable();

    public abstract PlayerTrack toPlayerTrack();
}
