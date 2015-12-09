// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eji
{

    private static final ctv a = new ctv() {

        public final volatile Object a(Object obj)
        {
            obj = (com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Playlist)obj;
            if (obj == null)
            {
                return "";
            } else
            {
                return ((com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Playlist) (obj)).name;
            }
        }

    };

    public static ctv a()
    {
        return a;
    }

}
