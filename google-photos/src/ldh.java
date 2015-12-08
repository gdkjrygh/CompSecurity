// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.photos.autobackup.model.AutoBackupSettings;

public final class ldh extends lei
{

    private AutoBackupSettings g;

    public ldh(lns lns, jyn jyn, AutoBackupSettings autobackupsettings)
    {
        g = autobackupsettings;
        super(jyn);
    }

    protected final void a(jyl jyl)
    {
        jyl = (lej)jyl;
        ldi ldi1 = new ldi(this);
        AutoBackupSettings autobackupsettings = g;
        ((len)jyl.o()).a(ldi1, autobackupsettings);
    }
}
