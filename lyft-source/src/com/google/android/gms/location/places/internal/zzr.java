// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzt, zzo, PlaceImpl

public class zzr extends zzt
    implements Place
{

    private boolean c;
    private final zzo d;
    private final String e = a("place_id", "");

    public zzr(DataHolder dataholder, int i1, Context context)
    {
        super(dataholder, i1);
        if (context != null)
        {
            dataholder = zzo.a(context);
        } else
        {
            dataholder = null;
        }
        d = dataholder;
        c = a("place_is_logging_enabled", false);
    }

    private void h(String s)
    {
        if (c && d != null)
        {
            d.a(e, s);
        }
    }

    public Object a()
    {
        return h();
    }

    public String b()
    {
        h("getId");
        return e;
    }

    public List c()
    {
        h("getPlaceTypes");
        return a("place_types", Collections.emptyList());
    }

    public CharSequence d()
    {
        h("getAddress");
        return a("place_address", "");
    }

    public CharSequence e()
    {
        h("getName");
        return a("place_name", "");
    }

    public LatLng f()
    {
        h("getLatLng");
        return (LatLng)a("place_lat_lng", LatLng.CREATOR);
    }

    public CharSequence g()
    {
        h("getPhoneNumber");
        return a("place_phone_number", "");
    }

    public Place h()
    {
        Object obj = (new PlaceImpl.zza()).b(c);
        c = false;
        obj = ((PlaceImpl.zza) (obj)).c(d().toString()).b(b("place_attributions", Collections.emptyList())).a(b()).a(o()).a(f()).a(i()).b(e().toString()).d(g().toString()).a(k()).b(l()).a(c()).a(m()).a(n()).a();
        ((PlaceImpl) (obj)).a(j());
        ((PlaceImpl) (obj)).a(d);
        return ((Place) (obj));
    }

    public float i()
    {
        h("getLevelNumber");
        return a("place_level_number", 0.0F);
    }

    public Locale j()
    {
        h("getLocale");
        String s = a("place_locale", "");
        if (!TextUtils.isEmpty(s))
        {
            return new Locale(s);
        } else
        {
            return Locale.getDefault();
        }
    }

    public int k()
    {
        h("getPriceLevel");
        return a("place_price_level", -1);
    }

    public float l()
    {
        h("getRating");
        return a("place_rating", -1F);
    }

    public LatLngBounds m()
    {
        h("getViewport");
        return (LatLngBounds)a("place_viewport", LatLngBounds.CREATOR);
    }

    public Uri n()
    {
        h("getWebsiteUri");
        String s = a("place_website_uri", null);
        if (s == null)
        {
            return null;
        } else
        {
            return Uri.parse(s);
        }
    }

    public boolean o()
    {
        h("isPermanentlyClosed");
        return a("place_is_permanently_closed", false);
    }
}
