// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.media;

import com.brightcove.player.model.Playlist;

// Referenced classes of package com.brightcove.player.media:
//            ErrorListener

public interface PlaylistListener
    extends ErrorListener
{

    public abstract void onPlaylist(Playlist playlist);
}
