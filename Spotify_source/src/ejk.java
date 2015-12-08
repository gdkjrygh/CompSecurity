// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ejk
{

    private static final ctv a = new ctv() {

        public final volatile Object a(Object obj)
        {
            obj = (com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Release)obj;
            if (obj == null)
            {
                return "";
            } else
            {
                return ((com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Release) (obj)).name;
            }
        }

    };
    private static final ctv b = new ctv() {

        public final Object a(Object obj)
        {
            obj = (com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Release)obj;
            if (obj == null)
            {
                return Integer.valueOf(-1);
            } else
            {
                return Integer.valueOf(((com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Release) (obj)).year);
            }
        }

    };

    public static ctv a()
    {
        return a;
    }

    public static ctv b()
    {
        return b;
    }

}
