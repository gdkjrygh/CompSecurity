// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.service.session.SessionState;

public final class ede
    implements hey
{

    ecz a;

    public ede(ecz ecz1)
    {
        a = ecz1;
    }

    public final void a(Object obj)
    {
        obj = (hff)obj;
        eda eda = new eda(((hff) (obj))) {

            private hff a;
            private ede b;

            public final void a(SessionState sessionstate)
            {
                if (a.isUnsubscribed())
                {
                    b.a.b(this);
                    return;
                } else
                {
                    a.onNext(sessionstate);
                    return;
                }
            }

            
            {
                b = ede.this;
                a = hff1;
                super();
            }
        };
        ((hff) (obj)).add(hkr.a(new hfr(eda) {

            private eda a;
            private ede b;

            public final void call()
            {
                b.a.b(a);
            }

            
            {
                b = ede.this;
                a = eda;
                super();
            }
        }));
        a.a(eda);
    }
}
