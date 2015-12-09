// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.cosmos.android.RxTypedResolver;
import com.spotify.mobile.android.spotlets.charts.model.ChartsBlock;

public final class emh
{

    public eml a;
    public RxTypedResolver b;
    public hfg c;
    public String d;
    public String e;

    public emh(eml eml1, RxTypedResolver rxtypedresolver, String s)
    {
        a = (eml)ctz.a(eml1);
        b = (RxTypedResolver)ctz.a(rxtypedresolver);
        d = (String)ctz.a(s);
    }

    // Unreferenced inner class emh$1

/* anonymous class */
    public final class _cls1
        implements hfb
    {

        private emh a;

        public final void onCompleted()
        {
        }

        public final void onError(Throwable throwable)
        {
            a.a.H();
        }

        public final void onNext(Object obj)
        {
            obj = (ChartsBlock)obj;
            a.a.a(((ChartsBlock) (obj)));
        }

            public 
            {
                a = emh.this;
                super();
            }
    }

}
