// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.photos.autobackup.model.AutoBackupStatus;
import com.google.android.gms.photos.autobackup.model.LocalFolder;
import com.google.android.gms.photos.autobackup.model.MediaState;
import com.google.android.gms.photos.autobackup.model.MigrationStatus;
import com.google.android.gms.photos.autobackup.model.SyncSettings;
import java.util.List;

public interface lek
    extends IInterface
{

    public abstract void a(int i);

    public abstract void a(int i, PendingIntent pendingintent);

    public abstract void a(int i, AutoBackupStatus autobackupstatus);

    public abstract void a(int i, MediaState mediastate);

    public abstract void a(int i, MigrationStatus migrationstatus);

    public abstract void a(int i, SyncSettings syncsettings);

    public abstract void a(int i, List list);

    public abstract void a(int i, boolean flag, String s);

    public abstract void a(Status status, LocalFolder localfolder);

    public abstract void b(int i);

    public abstract void b(int i, List list);

    public abstract void c(int i);

    public abstract void d(int i);
}
