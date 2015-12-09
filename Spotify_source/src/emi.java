// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.cosmos.android.RxTypedResolver;
import com.spotify.mobile.android.spotlets.charts.model.ChartsOverview;

public final class emi
{

    public emm a;
    public RxTypedResolver b;
    public hfg c;
    public String d;

    public emi(emm emm1, RxTypedResolver rxtypedresolver)
    {
        a = (emm)ctz.a(emm1);
        b = (RxTypedResolver)ctz.a(rxtypedresolver);
    }

    // Unreferenced inner class emi$1

/* anonymous class */
    public final class _cls1
        implements hfb
    {

        private emi a;

        public final void onCompleted()
        {
        }

        public final void onError(Throwable throwable)
        {
            a.a.H();
        }

        public final void onNext(Object obj)
        {
            obj = (ChartsOverview)obj;
            a.a.a(((ChartsOverview) (obj)));
        }

            public 
            {
                a = emi.this;
                super();
            }
    }

}
