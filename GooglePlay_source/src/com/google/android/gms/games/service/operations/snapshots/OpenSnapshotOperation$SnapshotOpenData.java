// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations.snapshots;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveContents;

// Referenced classes of package com.google.android.gms.games.service.operations.snapshots:
//            OpenSnapshotOperation

public static final class getContents
{

    public final Contents conflictContents;
    public final String conflictId;
    public final Contents currentContents;
    public final DataHolder holder;
    public final Contents resolutionContents;

    private static Contents getContents(DriveContents drivecontents)
    {
        if (drivecontents == null)
        {
            return null;
        }
        drivecontents = drivecontents.getContents();
        boolean flag;
        if (((Contents) (drivecontents)).mMode == 0x30000000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Contents returned must be read-write");
        return drivecontents;
    }

    public (int i)
    {
        holder = DataHolder.empty(i);
        conflictId = null;
        currentContents = null;
        conflictContents = null;
        resolutionContents = null;
    }

    public resolutionContents(DataHolder dataholder, DriveContents drivecontents)
    {
        holder = dataholder;
        conflictId = null;
        currentContents = getContents(drivecontents);
        conflictContents = null;
        resolutionContents = null;
    }

    public resolutionContents(DataHolder dataholder, String s, DriveContents drivecontents, DriveContents drivecontents1, DriveContents drivecontents2)
    {
        holder = dataholder;
        conflictId = s;
        currentContents = getContents(drivecontents);
        conflictContents = getContents(drivecontents1);
        resolutionContents = getContents(drivecontents2);
    }
}
