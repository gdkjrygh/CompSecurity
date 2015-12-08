// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

final class ang.Object
    implements cua
{

    private eip a;

    public final boolean a(Object obj)
    {
        obj = (com.spotify.mobile.android.spotlets.artist.model.Model.Playlist)obj;
        return obj != null && ((com.spotify.mobile.android.spotlets.artist.model.Model.Playlist) (obj)).name.toLowerCase(Locale.getDefault()).contains(a.b.toLowerCase(Locale.getDefault()));
    }

    (eip eip1)
    {
        a = eip1;
        super();
    }
}
