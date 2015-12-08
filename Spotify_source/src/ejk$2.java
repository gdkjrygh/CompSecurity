// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class 
    implements ctv
{

    public final Object a(Object obj)
    {
        obj = (com.spotify.mobile.android.spotlets.artist.model.Model.Release)obj;
        if (obj == null)
        {
            return Integer.valueOf(-1);
        } else
        {
            return Integer.valueOf(((com.spotify.mobile.android.spotlets.artist.model.Model.Release) (obj)).year);
        }
    }

    ()
    {
    }
}
