// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.core.polyline;

import java.util.List;
import me.lyft.android.common.INullable;

public interface IPolyline
    extends INullable
{

    public abstract void remove();

    public abstract void setColor(int i);

    public abstract void setPoints(List list);
}
