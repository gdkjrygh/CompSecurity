// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            jc

public final class ht
    implements SafeParcelable
{

    public static final ht A = a("courthouse");
    public static final ht B = a("dentist");
    public static final ht C = a("department_store");
    public static final ht D = a("doctor");
    public static final ht E = a("electrician");
    public static final ht F = a("electronics_store");
    public static final ht G = a("embassy");
    public static final ht H = a("establishment");
    public static final ht I = a("finance");
    public static final ht J = a("fire_station");
    public static final ht K = a("florist");
    public static final ht L = a("food");
    public static final ht M = a("funeral_home");
    public static final ht N = a("furniture_store");
    public static final ht O = a("gas_station");
    public static final ht P = a("general_contractor");
    public static final ht Q = a("grocery_or_supermarket");
    public static final ht R = a("gym");
    public static final ht S = a("hair_care");
    public static final ht T = a("hardware_store");
    public static final ht U = a("health");
    public static final ht V = a("hindu_temple");
    public static final ht W = a("home_goods_store");
    public static final ht X = a("hospital");
    public static final ht Y = a("insurance_agency");
    public static final ht Z = a("jewelry_store");
    public static final ht a = a("accounting");
    public static final ht aA = a("restaurant");
    public static final ht aB = a("roofing_contractor");
    public static final ht aC = a("rv_park");
    public static final ht aD = a("school");
    public static final ht aE = a("shoe_store");
    public static final ht aF = a("shopping_mall");
    public static final ht aG = a("spa");
    public static final ht aH = a("stadium");
    public static final ht aI = a("storage");
    public static final ht aJ = a("store");
    public static final ht aK = a("subway_station");
    public static final ht aL = a("synagogue");
    public static final ht aM = a("taxi_stand");
    public static final ht aN = a("train_station");
    public static final ht aO = a("travel_agency");
    public static final ht aP = a("university");
    public static final ht aQ = a("veterinary_care");
    public static final ht aR = a("zoo");
    public static final ht aS = a("administrative_area_level_1");
    public static final ht aT = a("administrative_area_level_2");
    public static final ht aU = a("administrative_area_level_3");
    public static final ht aV = a("colloquial_area");
    public static final ht aW = a("country");
    public static final ht aX = a("floor");
    public static final ht aY = a("geocode");
    public static final ht aZ = a("intersection");
    public static final ht aa = a("laundry");
    public static final ht ab = a("lawyer");
    public static final ht ac = a("library");
    public static final ht ad = a("liquor_store");
    public static final ht ae = a("local_government_office");
    public static final ht af = a("locksmith");
    public static final ht ag = a("lodging");
    public static final ht ah = a("meal_delivery");
    public static final ht ai = a("meal_takeaway");
    public static final ht aj = a("mosque");
    public static final ht ak = a("movie_rental");
    public static final ht al = a("movie_theater");
    public static final ht am = a("moving_company");
    public static final ht an = a("museum");
    public static final ht ao = a("night_club");
    public static final ht ap = a("painter");
    public static final ht aq = a("park");
    public static final ht ar = a("parking");
    public static final ht as = a("pet_store");
    public static final ht at = a("pharmacy");
    public static final ht au = a("physiotherapist");
    public static final ht av = a("place_of_worship");
    public static final ht aw = a("plumber");
    public static final ht ax = a("police");
    public static final ht ay = a("post_office");
    public static final ht az = a("real_estate_agency");
    public static final ht b = a("airport");
    public static final ht ba = a("locality");
    public static final ht bb = a("natural_feature");
    public static final ht bc = a("neighborhood");
    public static final ht bd = a("political");
    public static final ht be = a("point_of_interest");
    public static final ht bf = a("post_box");
    public static final ht bg = a("postal_code");
    public static final ht bh = a("postal_code_prefix");
    public static final ht bi = a("postal_town");
    public static final ht bj = a("premise");
    public static final ht bk = a("room");
    public static final ht bl = a("route");
    public static final ht bm = a("street_address");
    public static final ht bn = a("sublocality");
    public static final ht bo = a("sublocality_level_1");
    public static final ht bp = a("sublocality_level_2");
    public static final ht bq = a("sublocality_level_3");
    public static final ht br = a("sublocality_level_4");
    public static final ht bs = a("sublocality_level_5");
    public static final ht bt = a("subpremise");
    public static final ht bu = a("transit_station");
    public static final jc bv = new jc();
    public static final ht c = a("amusement_park");
    public static final ht d = a("aquarium");
    public static final ht e = a("art_gallery");
    public static final ht f = a("atm");
    public static final ht g = a("bakery");
    public static final ht h = a("bank");
    public static final ht i = a("bar");
    public static final ht j = a("beauty_salon");
    public static final ht k = a("bicycle_store");
    public static final ht l = a("book_store");
    public static final ht m = a("bowling_alley");
    public static final ht n = a("bus_station");
    public static final ht o = a("cafe");
    public static final ht p = a("campground");
    public static final ht q = a("car_dealer");
    public static final ht r = a("car_rental");
    public static final ht s = a("car_repair");
    public static final ht t = a("car_wash");
    public static final ht u = a("casino");
    public static final ht v = a("cemetary");
    public static final ht w = a("church");
    public static final ht x = a("city_hall");
    public static final ht y = a("clothing_store");
    public static final ht z = a("convenience_store");
    final int bw;
    final String bx;

    ht(int i1, String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            throw new IllegalArgumentException("Given String is empty or null");
        } else
        {
            bw = i1;
            bx = s1;
            return;
        }
    }

    public static ht a(String s1)
    {
        return new ht(0, s1);
    }

    public final int describeContents()
    {
        jc jc1 = bv;
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof ht) && bx.equals(((ht)obj).bx);
    }

    public final int hashCode()
    {
        return bx.hashCode();
    }

    public final String toString()
    {
        return bx;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        jc jc1 = bv;
        jc.a(this, parcel);
    }

}
