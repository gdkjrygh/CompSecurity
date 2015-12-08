// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.service;

import java.util.List;

// Referenced classes of package com.fsr.tracker.service:
//            Callback

public interface ITrackerServiceClient
{

    public abstract Void checkShouldInvite(Callback callback, List list);

    public abstract boolean connectionAvailable();
}
