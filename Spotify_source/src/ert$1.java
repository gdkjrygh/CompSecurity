// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.eventshub.model.ConcertResults;
import com.spotify.mobile.android.spotlets.eventshub.model.EventSection;
import com.spotify.mobile.android.spotlets.eventshub.model.SourceType;
import com.spotify.mobile.android.util.Assertion;

final class ang.Object
    implements erw
{

    private ert a;

    public final void a()
    {
        a.b.a(0);
        a.a.M();
    }

    public final void a(Object obj)
    {
        obj = (ConcertResults)obj;
        Assertion.a(obj);
        a.c = true;
        a.b.a(((ConcertResults) (obj)).getConcertResults().length);
        if (((ConcertResults) (obj)).getLocation() == null)
        {
            a.a.L();
            return;
        }
        if (!((ConcertResults) (obj)).hasConcerts())
        {
            a.a.K();
            return;
        } else
        {
            a.a.b(((ConcertResults) (obj)).getLocation());
            a.a.a(((ConcertResults) (obj)).getHeaderImageUri());
            a.a.a(((ConcertResults) (obj)).getConcertResultsInSource(SourceType.a), EventSection.b);
            a.a.a(((ConcertResults) (obj)).getConcertResultsInSource(SourceType.b), EventSection.a);
            a.a.J();
            return;
        }
    }

    (ert ert1)
    {
        a = ert1;
        super();
    }
}
