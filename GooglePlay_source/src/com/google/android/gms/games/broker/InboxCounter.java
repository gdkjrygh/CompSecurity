// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;


// Referenced classes of package com.google.android.gms.games.broker:
//            GamesClientContext, Lockable

public interface InboxCounter
{

    public abstract void clearActivityTypes(int i);

    public abstract String getActivityKey();

    public abstract int getInboxCount(GamesClientContext gamesclientcontext);

    public abstract Lockable getLockable();

    public abstract boolean hasInboxCountChanged();
}
