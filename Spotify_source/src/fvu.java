// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanDownload;

public final class fvu
{

    private fvt a;

    private fvu(fvt fvt1)
    {
        a = fvt1;
        super();
    }

    fvu(fvt fvt1, byte byte0)
    {
        this(fvt1);
    }

    public final fvv a(boolean flag)
    {
        fvt fvt1 = a;
        CanDownload candownload;
        if (flag)
        {
            candownload = CanDownload.a;
        } else
        {
            candownload = CanDownload.b;
        }
        fvt1.c = candownload;
        return new fvv(a, (byte)0);
    }
}
