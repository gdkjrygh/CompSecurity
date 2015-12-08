// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.photos.autobackup.model.AutoBackupSettings;
import com.google.android.gms.photos.autobackup.model.LocalFolder;

public class lns
{

    public lns()
    {
    }

    public jyt a(jyn jyn1)
    {
        return jyn1.a(new ldt(this, jyn1));
    }

    public jyt a(jyn jyn1, AutoBackupSettings autobackupsettings)
    {
        return jyn1.b(new ldh(this, jyn1, autobackupsettings));
    }

    public jyt a(jyn jyn1, String s)
    {
        return jyn1.a(new ldj(this, jyn1, s));
    }

    public jyt a(jyn jyn1, String s, LocalFolder localfolder)
    {
        return jyn1.a(new ldl(this, jyn1, s, localfolder));
    }

    public jyt a(jyn jyn1, String s, String as[])
    {
        return jyn1.a(new ldr(this, jyn1, s, as));
    }

    public jyt b(jyn jyn1)
    {
        return jyn1.a(new ldv(this, jyn1));
    }

    public jyt b(jyn jyn1, String s)
    {
        return jyn1.a(new ldn(this, jyn1, s));
    }

    public jyt c(jyn jyn1, String s)
    {
        return jyn1.a(new ldp(this, jyn1, s));
    }
}
