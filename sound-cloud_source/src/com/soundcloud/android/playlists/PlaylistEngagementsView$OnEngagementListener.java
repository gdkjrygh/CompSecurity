// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import android.content.Context;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistEngagementsView

public static interface 
{

    public abstract void onMakeOfflineAvailable(boolean flag);

    public abstract void onPlayShuffled();

    public abstract void onShare();

    public abstract void onToggleLike(boolean flag);

    public abstract void onToggleRepost(boolean flag, boolean flag1);

    public abstract void onUpsell(Context context);

    public abstract void onUpsellImpression();
}
