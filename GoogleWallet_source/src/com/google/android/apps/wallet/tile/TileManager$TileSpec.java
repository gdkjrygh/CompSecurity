// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.tile;

import com.google.common.base.Preconditions;

// Referenced classes of package com.google.android.apps.wallet.tile:
//            TileManager, Tile

public static final class tile
{

    public boolean inserted;
    public final Tile tile;

    public (Tile tile1)
    {
        tile = (Tile)Preconditions.checkNotNull(tile1);
    }
}
