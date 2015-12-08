// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import me.lyft.android.application.ride.IDestinySession;
import me.lyft.android.common.Objects;
import me.lyft.android.domain.location.LocationMapper;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.location.LocationDTO;
import me.lyft.android.infrastructure.lyft.location.NullLocationDTO;
import me.lyft.android.infrastructure.lyft.profile.NullUserDTO;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;

// Referenced classes of package me.lyft.android.jobs:
//            Job

public class DestinyUpdateJob
    implements Job
{

    private final AppStateDTO currentAppState;
    IDestinySession destinySession;

    public DestinyUpdateJob(AppStateDTO appstatedto)
    {
        currentAppState = appstatedto;
    }

    public void execute()
    {
        while (currentAppState == null || Objects.firstNonNull(currentAppState.getUser(), NullUserDTO.getInstance()) == null || destinySession.isInDestinyEditMode()) 
        {
            return;
        }
        destinySession.setLocation(LocationMapper.fromLocationDTO((LocationDTO)Objects.firstNonNull(((UserDTO)Objects.firstNonNull(currentAppState.getUser(), NullUserDTO.getInstance())).getDestinyLocation(), NullLocationDTO.getInstance())));
    }
}
