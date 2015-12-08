// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.spotlets.eventshub.model.ConcertResults;
import com.spotify.mobile.android.spotlets.eventshub.model.EventSection;
import com.spotify.mobile.android.spotlets.eventshub.model.SourceType;
import com.spotify.mobile.android.util.Assertion;

public final class ert
    implements gck
{

    final eru a;
    final ese b;
    boolean c;
    private final erv d;
    private boolean e;
    private final erz f;
    private erw g;

    public ert(eru eru1, erv erv1, ese ese, erz erz1)
    {
        g = new erw() {

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

            
            {
                a = ert.this;
                super();
            }
        };
        Assertion.a(eru1);
        a = eru1;
        d = erv1;
        b = ese;
        f = erz1;
    }

    public final void d(boolean flag)
    {
        boolean flag2 = false;
        boolean flag1;
        if (!flag && !c)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            a.N();
        }
        flag1 = flag2;
        if (flag)
        {
            flag1 = flag2;
            if (!e)
            {
                flag1 = true;
            }
        }
        if (flag1)
        {
            e = true;
            a.a();
            Object obj = f;
            Object obj1 = com.spotify.mobile.android.spotlets.eventshub.locationsearch.model.Locations.Location.EMPTY;
            String s = ((erz) (obj)).a.a(erz.b, "");
            Object obj2 = ((erz) (obj)).a.a(erz.c, "");
            obj = obj1;
            if (!TextUtils.isEmpty(s))
            {
                obj = obj1;
                if (!TextUtils.isEmpty(((CharSequence) (obj2))))
                {
                    obj = new com.spotify.mobile.android.spotlets.eventshub.locationsearch.model.Locations.Location(s, ((String) (obj2)));
                }
            }
            s = ((com.spotify.mobile.android.spotlets.eventshub.locationsearch.model.Locations.Location) (obj)).getGeoHash();
            obj = d;
            obj1 = g;
            Assertion.a(obj1);
            Assertion.a(s);
            obj2 = erx.a().appendPath("concerts").appendPath("view");
            if (!TextUtils.isEmpty(s))
            {
                ((android.net.Uri.Builder) (obj2)).appendQueryParameter("geohash", s);
            }
            s = ((android.net.Uri.Builder) (obj2)).toString();
            ((erv) (obj)).b.resolve(RequestBuilder.get(s).build(), new erv._cls1(((erv) (obj)).a, com/spotify/mobile/android/spotlets/eventshub/model/ConcertResults, ((erw) (obj1))));
        }
    }
}
