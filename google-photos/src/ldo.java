// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;
import com.google.android.gms.photos.autobackup.model.AutoBackupStatus;

final class ldo extends ldg
{

    private ldn a;

    ldo(ldn ldn1)
    {
        a = ldn1;
        super();
    }

    public final void a(int i, AutoBackupStatus autobackupstatus)
    {
        a.a(new ler(new Status(i), autobackupstatus));
    }
}
