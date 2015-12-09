// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanBrowseArtist;

public final class fwx
{

    private fwv a;

    private fwx(fwv fwv1)
    {
        a = fwv1;
        super();
    }

    fwx(fwv fwv1, byte byte0)
    {
        this(fwv1);
    }

    public final fwy a(boolean flag)
    {
        fwv fwv1 = a;
        CanBrowseArtist canbrowseartist;
        if (flag)
        {
            canbrowseartist = CanBrowseArtist.a;
        } else
        {
            canbrowseartist = CanBrowseArtist.b;
        }
        fwv1.e = canbrowseartist;
        return new fwy(a, (byte)0);
    }
}
