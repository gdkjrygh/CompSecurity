// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.artist.model.ArtistModel;

final class ang.Object
    implements hfb
{

    private eiy a;

    public final void onCompleted()
    {
    }

    public final void onError(Throwable throwable)
    {
        a.a.J();
    }

    public final void onNext(Object obj)
    {
        obj = (ArtistModel)obj;
        a.f = ((ArtistModel) (obj));
        a.a.a(((ArtistModel) (obj)));
    }

    (eiy eiy1)
    {
        a = eiy1;
        super();
    }
}
