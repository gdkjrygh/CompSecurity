// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanRemovePlaylist;

public final class fvv
{

    private fvt a;

    private fvv(fvt fvt1)
    {
        a = fvt1;
        super();
    }

    fvv(fvt fvt1, byte byte0)
    {
        this(fvt1);
    }

    public final fvw a(boolean flag)
    {
        fvt fvt1 = a;
        CanRemovePlaylist canremoveplaylist;
        if (flag)
        {
            canremoveplaylist = CanRemovePlaylist.a;
        } else
        {
            canremoveplaylist = CanRemovePlaylist.b;
        }
        fvt1.d = canremoveplaylist;
        return new fvw(a, (byte)0);
    }
}
