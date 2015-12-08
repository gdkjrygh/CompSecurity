// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.core.camera;

import java.util.List;
import me.lyft.android.common.INullable;

public interface IMapBound
    extends INullable
{

    public abstract int getHeight();

    public abstract List getLocationList();

    public abstract int getPadding();

    public abstract int getWidth();
}
