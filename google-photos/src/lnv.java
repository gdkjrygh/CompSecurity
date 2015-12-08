// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;
import com.google.android.gms.photos.autobackup.model.LocalFolder;

public class lnv
    implements jyw
{

    public final LocalFolder a;
    public final Status b;

    public lnv(Status status)
    {
        b = status;
        a = null;
    }

    public lnv(Status status, LocalFolder localfolder)
    {
        a = localfolder;
        b = status;
    }

    public Status a_()
    {
        return b;
    }

    public LocalFolder b()
    {
        return a;
    }
}
