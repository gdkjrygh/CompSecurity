// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.cosmos.android.RxTypedResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel;

public final class eiy
{

    public ekb a;
    RxTypedResolver b;
    public final hew c;
    public hkm d;
    String e;
    public ArtistModel f;
    hfb g;
    public hfb h;

    public eiy(ekb ekb1, RxTypedResolver rxtypedresolver, hew hew1, String s)
    {
        d = new hkm();
        g = new hfb() {

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

            
            {
                a = eiy.this;
                super();
            }
        };
        h = new hfb() {

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
label0:
                {
                    Object obj1 = (SessionState)obj;
                    obj = a;
                    if (((eiy) (obj)).f == null)
                    {
                        if (!((SessionState) (obj1)).j)
                        {
                            break label0;
                        }
                        ((eiy) (obj)).a.H();
                        obj1 = new Request("GET", String.format("hm://artist/v1/%s/android?format=json&release_window=true", new Object[] {
                            ((eiy) (obj)).e
                        }));
                        ((eiy) (obj)).d.a(((eiy) (obj)).b.resolve(((Request) (obj1))).a(((dup)dmz.a(dup)).c()).a(((eiy) (obj)).g));
                    }
                    return;
                }
                ((eiy) (obj)).a.K();
            }

            
            {
                a = eiy.this;
                super();
            }
        };
        a = (ekb)ctz.a(ekb1);
        b = (RxTypedResolver)ctz.a(rxtypedresolver);
        c = (hew)ctz.a(hew1);
        e = (String)ctz.a(s);
    }
}
