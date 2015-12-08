// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanBrowseAlbum;

public final class fww
{

    private fwv a;

    private fww(fwv fwv1)
    {
        a = fwv1;
        super();
    }

    fww(fwv fwv1, byte byte0)
    {
        this(fwv1);
    }

    public final fwx a(boolean flag)
    {
        fwv fwv1 = a;
        CanBrowseAlbum canbrowsealbum;
        if (flag)
        {
            canbrowsealbum = CanBrowseAlbum.a;
        } else
        {
            canbrowsealbum = CanBrowseAlbum.b;
        }
        fwv1.d = canbrowsealbum;
        return new fwx(a, (byte)0);
    }
}
