// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class axy
    implements bla, blc, ble
{

    private AdView a;
    private bes b;
    private ben c;

    public axy()
    {
    }

    private bep a(Context context, bky bky1, Bundle bundle, Bundle bundle1)
    {
        beq beq1 = new beq();
        Object obj = bky1.a();
        if (obj != null)
        {
            beq1.a.g = ((java.util.Date) (obj));
        }
        int i = bky1.b();
        if (i != 0)
        {
            beq1.a.h = i;
        }
        obj = bky1.c();
        if (obj != null)
        {
            String s;
            for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); beq1.a.a.add(s))
            {
                s = (String)((Iterator) (obj)).next();
            }

        }
        obj = bky1.d();
        if (obj != null)
        {
            beq1.a.i = ((android.location.Location) (obj));
        }
        if (bky1.f())
        {
            bfq.a();
            context = bjz.a(context);
            beq1.a.a(context);
        }
        if (bky1.e() != -1)
        {
            boolean flag;
            if (bky1.e() == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            beq1.a.a(flag);
        }
        context = a(bundle, bundle1);
        beq1.a.a(ayk, context);
        if (ayk.equals(ayk) && context.getBoolean("_emulatorLiveAds"))
        {
            context = beq1.a;
            bky1 = bep.a;
            ((bgx) (context)).d.remove(bky1);
        }
        return new bep(beq1, (byte)0);
    }

    public abstract Bundle a(Bundle bundle, Bundle bundle1);

    public String a(Bundle bundle)
    {
        return bundle.getString("pubid");
    }

    public final void a()
    {
        if (a != null)
        {
            a.a.a();
            a = null;
        }
        if (b != null)
        {
            b = null;
        }
        if (c != null)
        {
            c = null;
        }
    }

    public final void a(Context context, blb blb, Bundle bundle, ber ber1, bky bky1, Bundle bundle1)
    {
        a = new AdView(context);
        Object obj = a;
        ber1 = new ber(ber1.i, ber1.j);
        obj = ((AdView) (obj)).a;
        if (((bgy) (obj)).c != null)
        {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        obj.c = (new ber[] {
            ber1
        });
        try
        {
            if (((bgy) (obj)).b != null)
            {
                ((bgy) (obj)).b.a(new AdSizeParcel(((bgy) (obj)).e.getContext(), ((bgy) (obj)).c));
            }
        }
        // Misplaced declaration of an exception variable
        catch (ber ber1)
        {
            bka.c("Failed to set the ad size.", ber1);
        }
        ((bgy) (obj)).e.requestLayout();
        obj = a;
        ber1 = a(bundle);
        obj = ((AdView) (obj)).a;
        if (((bgy) (obj)).d != null)
        {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        obj.d = ber1;
        ber1 = a;
        blb = new ayb(blb);
        ((AdView) (ber1)).a.a(blb);
        ber1 = ((AdView) (ber1)).a;
        blb = (bfe)blb;
        try
        {
            ber1.a = blb;
            if (((bgy) (ber1)).b != null)
            {
                ((bgy) (ber1)).b.a(new bfi(blb));
            }
        }
        // Misplaced declaration of an exception variable
        catch (blb blb)
        {
            bka.c("Failed to set the AdClickListener.", blb);
        }
        blb = a;
        context = a(context, bky1, bundle1, bundle);
        ((AdView) (blb)).a.a(((bep) (context)).b);
    }

    public final void a(Context context, bld bld, Bundle bundle, bky bky1, Bundle bundle1)
    {
label0:
        {
            b = new bes(context);
            Object obj1 = b;
            Object obj = a(bundle);
            obj1 = ((bes) (obj1)).a;
            if (((bff) (obj1)).f != null)
            {
                throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
            }
            obj1.f = ((String) (obj));
            obj = b;
            bld = new ayc(bld);
            obj1 = ((bes) (obj)).a;
            cew cew1;
            try
            {
                obj1.c = bld;
                if (((bff) (obj1)).e != null)
                {
                    ((bff) (obj1)).e.a(new bfj(bld));
                }
            }
            catch (RemoteException remoteexception)
            {
                bka.c("Failed to set the AdListener.", remoteexception);
            }
            obj = ((bes) (obj)).a;
            bld = (bfe)bld;
            try
            {
                obj.d = bld;
                if (((bff) (obj)).e != null)
                {
                    ((bff) (obj)).e.a(new bfi(bld));
                }
            }
            // Misplaced declaration of an exception variable
            catch (bld bld)
            {
                bka.c("Failed to set the AdClickListener.", bld);
            }
            bld = b;
            context = a(context, bky1, bundle1, bundle);
            bundle = ((bes) (bld)).a;
            bky1 = ((bep) (context)).b;
            try
            {
                if (((bff) (bundle)).e != null)
                {
                    break MISSING_BLOCK_LABEL_358;
                }
                if (((bff) (bundle)).f == null)
                {
                    bundle.a("loadAd");
                }
                context = bfq.b();
                bundle1 = ((bff) (bundle)).b;
                obj = new AdSizeParcel();
                obj1 = ((bff) (bundle)).f;
                cew1 = ((bff) (bundle)).a;
                bfq.a();
                if (!bjz.b(bundle1))
                {
                    break label0;
                }
                bld = context.a(bundle1, ((AdSizeParcel) (obj)), ((String) (obj1)), cew1, 2);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                bka.c("Failed to load ad.", context);
                return;
            }
            context = bld;
            if (bld != null)
            {
                break MISSING_BLOCK_LABEL_299;
            }
        }
        bka.e("Using InterstitialAdManager from the client jar.");
        context = new bko(bundle1, ((AdSizeParcel) (obj)), ((String) (obj1)), cew1, new VersionInfoParcel(), bkf.a());
        bundle.e = context;
        if (((bff) (bundle)).c != null)
        {
            ((bff) (bundle)).e.a(new bfj(((bff) (bundle)).c));
        }
        if (((bff) (bundle)).d != null)
        {
            ((bff) (bundle)).e.a(new bfi(((bff) (bundle)).d));
        }
        if (((bff) (bundle)).e.a(bfo.a(((bff) (bundle)).b, bky1)))
        {
            ((bff) (bundle)).a.a = ((bgw) (bky1)).i;
        }
        return;
    }

    public final void a(Context context, blf blf, Bundle bundle, blj blj1, Bundle bundle1)
    {
        blf = new ayd(blf);
        beo beo1 = (new beo(context, bundle.getString("pubid"))).a(blf);
        bey bey = blj1.g();
        if (bey != null)
        {
            beo1.a(bey);
        }
        if (blj1.h())
        {
            beo1.a(blf);
        }
        if (blj1.i())
        {
            beo1.a(blf);
        }
        c = beo1.a();
        blf = c;
        context = a(context, ((bky) (blj1)), bundle1, bundle).b;
        try
        {
            ((ben) (blf)).b.a(bfo.a(((ben) (blf)).a, context));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            bka.b("Failed to load ad.", context);
        }
    }

    public final void b()
    {
        if (a != null)
        {
            a.a.c();
        }
    }

    public final void c()
    {
        if (a != null)
        {
            a.a.d();
        }
    }

    public final View d()
    {
        return a;
    }

    public final void e()
    {
        bff bff1 = b.a;
        try
        {
            bff1.a("show");
            bff1.e.g();
            return;
        }
        catch (RemoteException remoteexception)
        {
            bka.c("Failed to show interstitial.", remoteexception);
        }
    }
}
