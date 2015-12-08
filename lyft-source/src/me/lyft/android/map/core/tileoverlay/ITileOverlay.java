// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.core.tileoverlay;

import me.lyft.android.common.INullable;

public interface ITileOverlay
    extends INullable
{

    public abstract void clearTileCache();

    public abstract void remove();
}
