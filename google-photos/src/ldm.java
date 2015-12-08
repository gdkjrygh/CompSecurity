// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;
import com.google.android.gms.photos.autobackup.model.LocalFolder;

final class ldm extends ldg
{

    private ldl a;

    ldm(ldl ldl1)
    {
        a = ldl1;
        super();
    }

    public final void a(Status status, LocalFolder localfolder)
    {
        a.a(new lnv(status, localfolder));
    }
}
