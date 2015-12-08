// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.photos.autobackup.model.LocalFolder;

final class mih extends mhp
{

    public LocalFolder a;

    public mih(LocalFolder localfolder)
    {
        a = localfolder;
    }

    public final String a()
    {
        return a.c;
    }

    public final void a(boolean flag)
    {
        a.d = flag;
    }

    public final boolean b()
    {
        return a.d;
    }
}
