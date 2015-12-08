// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.photos.autobackup.model.LocalFolder;

public final class ldl extends leh
{

    private String g;
    private LocalFolder h;

    public ldl(lns lns, jyn jyn, String s, LocalFolder localfolder)
    {
        g = s;
        h = localfolder;
        super(jyn);
    }

    protected final void a(jyl jyl)
    {
        jyl = (lej)jyl;
        ldm ldm1 = new ldm(this);
        String s = g;
        LocalFolder localfolder = h;
        ((len)jyl.o()).a(ldm1, s, localfolder);
    }
}
