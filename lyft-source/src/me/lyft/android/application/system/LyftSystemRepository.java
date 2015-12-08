// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.system;

import me.lyft.android.domain.system.LyftSystem;
import me.lyft.android.persistence.ISimpleStorage;

// Referenced classes of package me.lyft.android.application.system:
//            ILyftSystemRepository

public class LyftSystemRepository
    implements ILyftSystemRepository
{

    private static final String SYSTEM_KEY = "system";
    private LyftSystem lyftSystem;
    private final ISimpleStorage simpleStorage;

    public LyftSystemRepository(ISimpleStorage isimplestorage)
    {
        simpleStorage = isimplestorage;
        lyftSystem = (LyftSystem)isimplestorage.getOrDefault("system", me/lyft/android/domain/system/LyftSystem, LyftSystem.empty());
    }

    public LyftSystem getSystem()
    {
        return lyftSystem;
    }

    public void update(LyftSystem lyftsystem)
    {
        lyftSystem = lyftsystem;
        simpleStorage.put("system", lyftsystem);
    }
}
