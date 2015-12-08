// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;


// Referenced classes of package com.google.android.gms.maps.model:
//            Tile

public interface TileProvider
{

    public static final Tile NO_TILE = new Tile(-1, -1, null);

    public abstract Tile getTile(int i, int j, int k);

}
