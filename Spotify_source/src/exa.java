// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.cosmos.android.RxTypedResolver;
import com.spotify.mobile.android.spotlets.onboarding.taste.model.GenreQuestionnaire;
import java.util.HashSet;
import java.util.Set;

public final class exa
{

    public exe a;
    public RxTypedResolver b;
    public hfg c;
    public Set d;
    public GenreQuestionnaire e;

    public exa(exe exe1, RxTypedResolver rxtypedresolver)
    {
        d = new HashSet();
        a = (exe)ctz.a(exe1);
        b = (RxTypedResolver)ctz.a(rxtypedresolver);
    }

    // Unreferenced inner class exa$1

/* anonymous class */
    public final class _cls1
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

            public 
            {
                a = exa.this;
                super();
            }
    }

}
