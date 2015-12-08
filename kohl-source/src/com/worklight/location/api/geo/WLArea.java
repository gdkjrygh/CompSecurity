// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.api.geo;

import com.worklight.location.internal.geo.AreaVisitor;

public interface WLArea
{

    public abstract Object accept(AreaVisitor areavisitor);
}
