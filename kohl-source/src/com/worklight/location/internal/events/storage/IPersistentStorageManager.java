// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.events.storage;


// Referenced classes of package com.worklight.location.internal.events.storage:
//            IChunkStorage

public interface IPersistentStorageManager
{

    public abstract void clearOldPersistentData();

    public abstract IChunkStorage createStorage();
}
