// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.photos.settings.PhotosAboutSettingsActivity;

public final class icb extends nzf
    implements oar
{

    private static final myc ad;
    private static final onh h = (new oqh("debug.photos.devmgmt_settings")).a();
    private oaq ae;
    private egk af;
    private myf ag;

    public icb()
    {
        ae = new oaq(this, c);
        (new ibz(this, c)).a(b);
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.a(layoutinflater, viewgroup, bundle);
        super.d.c.b = false;
        return layoutinflater;
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        b.a(oau, ae);
        af = (egk)b.b(egk);
        ag = (myf)b.b(myf);
    }

    public final void r()
    {
        boolean flag = ((mmr)b.a(mmr)).f();
        if (flag)
        {
            ae.a(new ibg());
            ae.a(new iat());
            ae.a(new ibi());
            ae.a(new ibo());
            ae.a(new ibq());
        }
        if (af != null)
        {
            ae.a(af.a());
        }
        obd obd1 = new obd();
        Intent intent = new Intent(a, com/google/android/apps/photos/settings/PhotosAboutSettingsActivity);
        intent.putExtra("privacy_uri", "http://m.google.com/app/plus/serviceurl?type=privacy");
        intent.putExtra("terms_uri", "http://m.google.com/app/plus/serviceurl?type=tos");
        obd1.a = a(p.aS);
        obd1.b = intent;
        ae.a(obd1);
        if (flag)
        {
            Object obj = (ibc)b.b(ibc);
            if (obj != null)
            {
                int i = ((mmr)b.a(mmr)).d();
                obj = ((ibc) (obj)).a();
                ibn ibn1 = new ibn();
                ibn1.a = ((Intent) (obj));
                ibn1.b = i;
                ae.a(ibn1);
            }
            obj = (iba)b.b(iba);
            if (obj != null)
            {
                ((mmr)b.a(mmr)).d();
                obj = ((iba) (obj)).a();
                ibu ibu1 = new ibu();
                Bundle bundle = new Bundle();
                bundle.putParcelable("photos_stats_intent", ((android.os.Parcelable) (obj)));
                ibu1.f(bundle);
                ae.a(ibu1);
            }
        }
        if (b.b(iby) != null)
        {
            ibe ibe1 = new ibe();
            ibe1.f(new Bundle());
            ae.a(ibe1);
        }
        if (b.b(ibx) != null)
        {
            ibb ibb1 = new ibb();
            ibb1.f(new Bundle());
            ae.a(ibb1);
        }
    }

    static 
    {
        ad = new myc("debug.photos.devmgmt_ser_exp", "false", "33b4a87d", myi.b);
    }
}
