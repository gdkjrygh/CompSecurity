// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.d;

import java.util.Map;

public interface j
    extends Map
{

    public abstract void add(Object obj, Object obj1);

    public abstract Object getFirst(Object obj);

    public abstract void set(Object obj, Object obj1);

    public abstract void setAll(Map map);

    public abstract Map toSingleValueMap();
}
