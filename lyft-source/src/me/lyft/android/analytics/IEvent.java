// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics;

import java.util.Map;

// Referenced classes of package me.lyft.android.analytics:
//            ITrackerExtra

public interface IEvent
{

    public abstract IEvent addTracker(ITrackerExtra itrackerextra);

    public abstract ITrackerExtra getExtra(Class class1);

    public abstract String getName();

    public abstract Map getParameters();
}
