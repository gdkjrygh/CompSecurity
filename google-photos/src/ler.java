// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;
import com.google.android.gms.photos.autobackup.model.AutoBackupStatus;

public final class ler
    implements lnu
{

    private final Status a;
    private final AutoBackupStatus b;

    public ler(Status status, AutoBackupStatus autobackupstatus)
    {
        a = status;
        b = autobackupstatus;
    }

    public final Status a_()
    {
        return a;
    }

    public final AutoBackupStatus b()
    {
        return b;
    }
}
