// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import com.soundcloud.android.model.Urn;

// Referenced classes of package com.soundcloud.android.tracks:
//            TrackItemMenuPresenter

public static interface 
{

    public abstract Urn getPlaylistUrn();

    public abstract void onPlaylistTrackRemoved(int i);
}
