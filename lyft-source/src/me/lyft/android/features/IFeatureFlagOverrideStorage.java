// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.features;

import java.util.List;

interface IFeatureFlagOverrideStorage
{

    public abstract void clear();

    public abstract void removeFlag(String s);

    public abstract void restore(List list);

    public abstract void saveFlag(String s, boolean flag);
}
