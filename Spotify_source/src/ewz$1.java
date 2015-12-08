// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.onboarding.taste.model.ArtistQuestionnaire;

public final class ang.Object
    implements hfb
{

    private ewz a;

    public final void onCompleted()
    {
    }

    public final void onError(Throwable throwable)
    {
        a.a.H();
    }

    public final void onNext(Object obj)
    {
        obj = (ArtistQuestionnaire)obj;
        a.a.a(((ArtistQuestionnaire) (obj)));
    }

    public (ewz ewz1)
    {
        a = ewz1;
        super();
    }
}
