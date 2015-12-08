// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            ob, jx

public final class oa
    implements SafeParcelable
{

    public static final ob CREATOR = new ob();
    public static final oa ahB = cc("accounting");
    public static final oa ahC = cc("airport");
    public static final oa ahD = cc("amusement_park");
    public static final oa ahE = cc("aquarium");
    public static final oa ahF = cc("art_gallery");
    public static final oa ahG = cc("atm");
    public static final oa ahH = cc("bakery");
    public static final oa ahI = cc("bank");
    public static final oa ahJ = cc("bar");
    public static final oa ahK = cc("beauty_salon");
    public static final oa ahL = cc("bicycle_store");
    public static final oa ahM = cc("book_store");
    public static final oa ahN = cc("bowling_alley");
    public static final oa ahO = cc("bus_station");
    public static final oa ahP = cc("cafe");
    public static final oa ahQ = cc("campground");
    public static final oa ahR = cc("car_dealer");
    public static final oa ahS = cc("car_rental");
    public static final oa ahT = cc("car_repair");
    public static final oa ahU = cc("car_wash");
    public static final oa ahV = cc("casino");
    public static final oa ahW = cc("cemetery");
    public static final oa ahX = cc("church");
    public static final oa ahY = cc("city_hall");
    public static final oa ahZ = cc("clothing_store");
    public static final oa aiA = cc("jewelry_store");
    public static final oa aiB = cc("laundry");
    public static final oa aiC = cc("lawyer");
    public static final oa aiD = cc("library");
    public static final oa aiE = cc("liquor_store");
    public static final oa aiF = cc("local_government_office");
    public static final oa aiG = cc("locksmith");
    public static final oa aiH = cc("lodging");
    public static final oa aiI = cc("meal_delivery");
    public static final oa aiJ = cc("meal_takeaway");
    public static final oa aiK = cc("mosque");
    public static final oa aiL = cc("movie_rental");
    public static final oa aiM = cc("movie_theater");
    public static final oa aiN = cc("moving_company");
    public static final oa aiO = cc("museum");
    public static final oa aiP = cc("night_club");
    public static final oa aiQ = cc("painter");
    public static final oa aiR = cc("park");
    public static final oa aiS = cc("parking");
    public static final oa aiT = cc("pet_store");
    public static final oa aiU = cc("pharmacy");
    public static final oa aiV = cc("physiotherapist");
    public static final oa aiW = cc("place_of_worship");
    public static final oa aiX = cc("plumber");
    public static final oa aiY = cc("police");
    public static final oa aiZ = cc("post_office");
    public static final oa aia = cc("convenience_store");
    public static final oa aib = cc("courthouse");
    public static final oa aic = cc("dentist");
    public static final oa aid = cc("department_store");
    public static final oa aie = cc("doctor");
    public static final oa aif = cc("electrician");
    public static final oa aig = cc("electronics_store");
    public static final oa aih = cc("embassy");
    public static final oa aii = cc("establishment");
    public static final oa aij = cc("finance");
    public static final oa aik = cc("fire_station");
    public static final oa ail = cc("florist");
    public static final oa aim = cc("food");
    public static final oa ain = cc("funeral_home");
    public static final oa aio = cc("furniture_store");
    public static final oa aip = cc("gas_station");
    public static final oa aiq = cc("general_contractor");
    public static final oa air = cc("grocery_or_supermarket");
    public static final oa ais = cc("gym");
    public static final oa ait = cc("hair_care");
    public static final oa aiu = cc("hardware_store");
    public static final oa aiv = cc("health");
    public static final oa aiw = cc("hindu_temple");
    public static final oa aix = cc("home_goods_store");
    public static final oa aiy = cc("hospital");
    public static final oa aiz = cc("insurance_agency");
    public static final oa ajA = cc("intersection");
    public static final oa ajB = cc("locality");
    public static final oa ajC = cc("natural_feature");
    public static final oa ajD = cc("neighborhood");
    public static final oa ajE = cc("political");
    public static final oa ajF = cc("point_of_interest");
    public static final oa ajG = cc("post_box");
    public static final oa ajH = cc("postal_code");
    public static final oa ajI = cc("postal_code_prefix");
    public static final oa ajJ = cc("postal_town");
    public static final oa ajK = cc("premise");
    public static final oa ajL = cc("room");
    public static final oa ajM = cc("route");
    public static final oa ajN = cc("street_address");
    public static final oa ajO = cc("sublocality");
    public static final oa ajP = cc("sublocality_level_1");
    public static final oa ajQ = cc("sublocality_level_2");
    public static final oa ajR = cc("sublocality_level_3");
    public static final oa ajS = cc("sublocality_level_4");
    public static final oa ajT = cc("sublocality_level_5");
    public static final oa ajU = cc("subpremise");
    public static final oa ajV = cc("transit_station");
    public static final oa ajW = cc("other");
    public static final oa aja = cc("real_estate_agency");
    public static final oa ajb = cc("restaurant");
    public static final oa ajc = cc("roofing_contractor");
    public static final oa ajd = cc("rv_park");
    public static final oa aje = cc("school");
    public static final oa ajf = cc("shoe_store");
    public static final oa ajg = cc("shopping_mall");
    public static final oa ajh = cc("spa");
    public static final oa aji = cc("stadium");
    public static final oa ajj = cc("storage");
    public static final oa ajk = cc("store");
    public static final oa ajl = cc("subway_station");
    public static final oa ajm = cc("synagogue");
    public static final oa ajn = cc("taxi_stand");
    public static final oa ajo = cc("train_station");
    public static final oa ajp = cc("travel_agency");
    public static final oa ajq = cc("university");
    public static final oa ajr = cc("veterinary_care");
    public static final oa ajs = cc("zoo");
    public static final oa ajt = cc("administrative_area_level_1");
    public static final oa aju = cc("administrative_area_level_2");
    public static final oa ajv = cc("administrative_area_level_3");
    public static final oa ajw = cc("colloquial_area");
    public static final oa ajx = cc("country");
    public static final oa ajy = cc("floor");
    public static final oa ajz = cc("geocode");
    final int CK;
    final String vc;

    oa(int i, String s)
    {
        jx.bb(s);
        CK = i;
        vc = s;
    }

    public static oa cc(String s)
    {
        return new oa(0, s);
    }

    public int describeContents()
    {
        ob ob1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof oa) && vc.equals(((oa)obj).vc);
    }

    public int hashCode()
    {
        return vc.hashCode();
    }

    public String toString()
    {
        return vc;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ob ob1 = CREATOR;
        ob.a(this, parcel, i);
    }

}
