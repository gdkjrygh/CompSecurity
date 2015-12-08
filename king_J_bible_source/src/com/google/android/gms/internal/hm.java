// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            hn, fq

public final class hm
    implements SafeParcelable
{

    public static final hn CREATOR = new hn();
    public static final hm OH = aZ("accounting");
    public static final hm OI = aZ("airport");
    public static final hm OJ = aZ("amusement_park");
    public static final hm OK = aZ("aquarium");
    public static final hm OL = aZ("art_gallery");
    public static final hm OM = aZ("atm");
    public static final hm ON = aZ("bakery");
    public static final hm OO = aZ("bank");
    public static final hm OP = aZ("bar");
    public static final hm OQ = aZ("beauty_salon");
    public static final hm OR = aZ("bicycle_store");
    public static final hm OS = aZ("book_store");
    public static final hm OT = aZ("bowling_alley");
    public static final hm OU = aZ("bus_station");
    public static final hm OV = aZ("cafe");
    public static final hm OW = aZ("campground");
    public static final hm OX = aZ("car_dealer");
    public static final hm OY = aZ("car_rental");
    public static final hm OZ = aZ("car_repair");
    public static final hm PA = aZ("hardware_store");
    public static final hm PB = aZ("health");
    public static final hm PC = aZ("hindu_temple");
    public static final hm PD = aZ("home_goods_store");
    public static final hm PE = aZ("hospital");
    public static final hm PF = aZ("insurance_agency");
    public static final hm PG = aZ("jewelry_store");
    public static final hm PH = aZ("laundry");
    public static final hm PI = aZ("lawyer");
    public static final hm PJ = aZ("library");
    public static final hm PK = aZ("liquor_store");
    public static final hm PL = aZ("local_government_office");
    public static final hm PM = aZ("locksmith");
    public static final hm PN = aZ("lodging");
    public static final hm PO = aZ("meal_delivery");
    public static final hm PP = aZ("meal_takeaway");
    public static final hm PQ = aZ("mosque");
    public static final hm PR = aZ("movie_rental");
    public static final hm PS = aZ("movie_theater");
    public static final hm PT = aZ("moving_company");
    public static final hm PU = aZ("museum");
    public static final hm PV = aZ("night_club");
    public static final hm PW = aZ("painter");
    public static final hm PX = aZ("park");
    public static final hm PY = aZ("parking");
    public static final hm PZ = aZ("pet_store");
    public static final hm Pa = aZ("car_wash");
    public static final hm Pb = aZ("casino");
    public static final hm Pc = aZ("cemetery");
    public static final hm Pd = aZ("church");
    public static final hm Pe = aZ("city_hall");
    public static final hm Pf = aZ("clothing_store");
    public static final hm Pg = aZ("convenience_store");
    public static final hm Ph = aZ("courthouse");
    public static final hm Pi = aZ("dentist");
    public static final hm Pj = aZ("department_store");
    public static final hm Pk = aZ("doctor");
    public static final hm Pl = aZ("electrician");
    public static final hm Pm = aZ("electronics_store");
    public static final hm Pn = aZ("embassy");
    public static final hm Po = aZ("establishment");
    public static final hm Pp = aZ("finance");
    public static final hm Pq = aZ("fire_station");
    public static final hm Pr = aZ("florist");
    public static final hm Ps = aZ("food");
    public static final hm Pt = aZ("funeral_home");
    public static final hm Pu = aZ("furniture_store");
    public static final hm Pv = aZ("gas_station");
    public static final hm Pw = aZ("general_contractor");
    public static final hm Px = aZ("grocery_or_supermarket");
    public static final hm Py = aZ("gym");
    public static final hm Pz = aZ("hair_care");
    public static final hm QA = aZ("administrative_area_level_2");
    public static final hm QB = aZ("administrative_area_level_3");
    public static final hm QC = aZ("colloquial_area");
    public static final hm QD = aZ("country");
    public static final hm QE = aZ("floor");
    public static final hm QF = aZ("geocode");
    public static final hm QG = aZ("intersection");
    public static final hm QH = aZ("locality");
    public static final hm QI = aZ("natural_feature");
    public static final hm QJ = aZ("neighborhood");
    public static final hm QK = aZ("political");
    public static final hm QL = aZ("point_of_interest");
    public static final hm QM = aZ("post_box");
    public static final hm QN = aZ("postal_code");
    public static final hm QO = aZ("postal_code_prefix");
    public static final hm QP = aZ("postal_town");
    public static final hm QQ = aZ("premise");
    public static final hm QR = aZ("room");
    public static final hm QS = aZ("route");
    public static final hm QT = aZ("street_address");
    public static final hm QU = aZ("sublocality");
    public static final hm QV = aZ("sublocality_level_1");
    public static final hm QW = aZ("sublocality_level_2");
    public static final hm QX = aZ("sublocality_level_3");
    public static final hm QY = aZ("sublocality_level_4");
    public static final hm QZ = aZ("sublocality_level_5");
    public static final hm Qa = aZ("pharmacy");
    public static final hm Qb = aZ("physiotherapist");
    public static final hm Qc = aZ("place_of_worship");
    public static final hm Qd = aZ("plumber");
    public static final hm Qe = aZ("police");
    public static final hm Qf = aZ("post_office");
    public static final hm Qg = aZ("real_estate_agency");
    public static final hm Qh = aZ("restaurant");
    public static final hm Qi = aZ("roofing_contractor");
    public static final hm Qj = aZ("rv_park");
    public static final hm Qk = aZ("school");
    public static final hm Ql = aZ("shoe_store");
    public static final hm Qm = aZ("shopping_mall");
    public static final hm Qn = aZ("spa");
    public static final hm Qo = aZ("stadium");
    public static final hm Qp = aZ("storage");
    public static final hm Qq = aZ("store");
    public static final hm Qr = aZ("subway_station");
    public static final hm Qs = aZ("synagogue");
    public static final hm Qt = aZ("taxi_stand");
    public static final hm Qu = aZ("train_station");
    public static final hm Qv = aZ("travel_agency");
    public static final hm Qw = aZ("university");
    public static final hm Qx = aZ("veterinary_care");
    public static final hm Qy = aZ("zoo");
    public static final hm Qz = aZ("administrative_area_level_1");
    public static final hm Ra = aZ("subpremise");
    public static final hm Rb = aZ("transit_station");
    public static final hm Rc = aZ("other");
    final String Rd;
    final int xH;

    hm(int i, String s)
    {
        fq.ap(s);
        xH = i;
        Rd = s;
    }

    public static hm aZ(String s)
    {
        return new hm(0, s);
    }

    public int describeContents()
    {
        hn hn1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof hm) && Rd.equals(((hm)obj).Rd);
    }

    public int hashCode()
    {
        return Rd.hashCode();
    }

    public String toString()
    {
        return Rd;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        hn hn1 = CREATOR;
        hn.a(this, parcel, i);
    }

}
