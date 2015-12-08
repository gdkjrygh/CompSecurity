// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.onboarding.taste.model.GenreQuestionnaire;

public final class ang.Object
    implements hfb
{

    private exa a;

    public final void onCompleted()
    {
    }

    public final void onError(Throwable throwable)
    {
        a.a.H();
    }

    public final void onNext(Object obj)
    {
        obj = (GenreQuestionnaire)obj;
        a.a.b(((GenreQuestionnaire) (obj)));
    }

    public (exa exa1)
    {
        a = exa1;
        super();
    }
}
