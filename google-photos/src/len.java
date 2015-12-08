// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IInterface;
import com.google.android.gms.photos.autobackup.model.AutoBackupSettings;
import com.google.android.gms.photos.autobackup.model.LocalFolder;
import com.google.android.gms.photos.autobackup.model.SyncSettings;

public interface len
    extends IInterface
{

    public abstract void a(lek lek);

    public abstract void a(lek lek, AutoBackupSettings autobackupsettings);

    public abstract void a(lek lek, String s);

    public abstract void a(lek lek, String s, LocalFolder localfolder);

    public abstract void a(lek lek, String s, SyncSettings syncsettings);

    public abstract void a(lek lek, String s, String as[]);

    public abstract void b(lek lek);

    public abstract void b(lek lek, String s);

    public abstract void c(lek lek);

    public abstract void c(lek lek, String s);

    public abstract void d(lek lek);

    public abstract void d(lek lek, String s);

    public abstract void e(lek lek);

    public abstract void e(lek lek, String s);
}
