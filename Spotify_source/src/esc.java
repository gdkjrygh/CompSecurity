// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.spotify.mobile.android.spotlets.eventshub.locationsearch.model.Locations;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.List;

public final class esc
{

    final esd a;
    final erv b;
    final erz c;
    final esb d;
    final hkg e = hkg.e();
    final hfw f = new hfw() {

        public final Object call(Object obj)
        {
            obj = (String)obj;
            boolean flag;
            if (!TextUtils.isEmpty(((CharSequence) (obj))) && ((String) (obj)).length() >= 3)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        }

    };
    hfg g;
    final hfb h = new hfb() {

        private esc a;

        public final void onCompleted()
        {
        }

        public final void onError(Throwable throwable)
        {
            Logger.c(throwable.getMessage(), new Object[0]);
        }

        public final void onNext(Object obj)
        {
            obj = (String)obj;
            a.j = ((String) (obj));
            a.b.a(a.l, ((String) (obj)));
        }

            
            {
                a = esc.this;
                super();
            }
    };
    boolean i;
    String j;
    Locations k;
    final erw l = new erw() {

        private esc a;

        public final void a()
        {
            a.a.N();
        }

        public final volatile void a(Object obj)
        {
            Locations locations = (Locations)obj;
            esc esc1 = a;
            obj = locations;
            if (locations == null)
            {
                obj = Locations.EMPTY;
            }
            esc1.k = ((Locations) (obj));
            a.a();
        }

            
            {
                a = esc.this;
                super();
            }
    };

    public esc(esd esd1, erv erv, erz erz, esb esb)
    {
        k = Locations.EMPTY;
        Assertion.a(esd1);
        Assertion.a(erv);
        Assertion.a(erz);
        Assertion.a(esb);
        a = esd1;
        b = erv;
        c = erz;
        d = esb;
    }

    final void a()
    {
        if (k.getLocations().size() == 0)
        {
            a.M();
            return;
        } else
        {
            a.a(k);
            return;
        }
    }
}
