// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.core.tileoverlay;

import java.net.URL;

public interface ITileProvider
{

    public abstract int getHeight();

    public abstract URL getTileUrl(int i, int j, int k);

    public abstract int getWidth();
}
