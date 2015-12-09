// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.provider;


// Referenced classes of package com.google.android.gms.games.provider:
//            PlayGamesContentProvider, GamesDataStore, ImageStore

final class taDeleter extends taDeleter
{

    final PlayGamesContentProvider this$0;

    public final int delete(GamesDataStore gamesdatastore, long l)
    {
        return gamesdatastore.mImageStore.remove(l);
    }

    taDeleter()
    {
        this$0 = PlayGamesContentProvider.this;
        super(PlayGamesContentProvider.this, null, null, null);
    }
}
