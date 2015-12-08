// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import me.lyft.android.application.system.ILyftSystemRepository;
import me.lyft.android.domain.system.LyftSystem;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.system.SystemDTO;

// Referenced classes of package me.lyft.android.jobs:
//            Job

public class UpdateSystemJob
    implements Job
{

    private AppStateDTO appStateDTO;
    ILyftSystemRepository lyftSystemRepository;

    public UpdateSystemJob(AppStateDTO appstatedto)
    {
        appStateDTO = appstatedto;
    }

    private LyftSystem mapFromDTO(SystemDTO systemdto)
    {
        return new LyftSystem(systemdto.region, systemdto.shortMessage);
    }

    public void execute()
    {
        Object obj = appStateDTO.getSystem();
        if (obj != null)
        {
            obj = mapFromDTO(((SystemDTO) (obj)));
            lyftSystemRepository.update(((LyftSystem) (obj)));
        }
    }
}
