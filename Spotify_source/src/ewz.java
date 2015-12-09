// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import com.spotify.cosmos.android.RxTypedResolver;
import com.spotify.mobile.android.spotlets.onboarding.taste.model.ArtistQuestionnaire;
import com.spotify.mobile.android.spotlets.onboarding.taste.model.GenreQuestionnaire;
import com.spotify.mobile.android.spotlets.onboarding.taste.model.Question;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ewz
{

    public exd a;
    public RxTypedResolver b;
    public hfg c;
    public GenreQuestionnaire d;
    public ArtistQuestionnaire e;

    public ewz(exd exd1, RxTypedResolver rxtypedresolver, GenreQuestionnaire genrequestionnaire)
    {
        a = (exd)ctz.a(exd1);
        b = (RxTypedResolver)ctz.a(rxtypedresolver);
        d = (GenreQuestionnaire)ctz.a(genrequestionnaire);
    }

    public final String a()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = d.questions.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Question question = (Question)iterator.next();
            if (question.isSelected)
            {
                arraylist.add(Uri.encode(question.id));
            }
        } while (true);
        return ctw.a("&genres=").a(arraylist);
    }

    // Unreferenced inner class ewz$1

/* anonymous class */
    public final class _cls1
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

            public 
            {
                a = ewz.this;
                super();
            }
    }

}
