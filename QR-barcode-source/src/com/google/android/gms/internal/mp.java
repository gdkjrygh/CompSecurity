// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            mq

public final class mp
    implements SafeParcelable
{

    public static final mq CREATOR = new mq();
    public static final mp afC = bZ("accounting");
    public static final mp afD = bZ("airport");
    public static final mp afE = bZ("amusement_park");
    public static final mp afF = bZ("aquarium");
    public static final mp afG = bZ("art_gallery");
    public static final mp afH = bZ("atm");
    public static final mp afI = bZ("bakery");
    public static final mp afJ = bZ("bank");
    public static final mp afK = bZ("bar");
    public static final mp afL = bZ("beauty_salon");
    public static final mp afM = bZ("bicycle_store");
    public static final mp afN = bZ("book_store");
    public static final mp afO = bZ("bowling_alley");
    public static final mp afP = bZ("bus_station");
    public static final mp afQ = bZ("cafe");
    public static final mp afR = bZ("campground");
    public static final mp afS = bZ("car_dealer");
    public static final mp afT = bZ("car_rental");
    public static final mp afU = bZ("car_repair");
    public static final mp afV = bZ("car_wash");
    public static final mp afW = bZ("casino");
    public static final mp afX = bZ("cemetery");
    public static final mp afY = bZ("church");
    public static final mp afZ = bZ("city_hall");
    public static final mp agA = bZ("insurance_agency");
    public static final mp agB = bZ("jewelry_store");
    public static final mp agC = bZ("laundry");
    public static final mp agD = bZ("lawyer");
    public static final mp agE = bZ("library");
    public static final mp agF = bZ("liquor_store");
    public static final mp agG = bZ("local_government_office");
    public static final mp agH = bZ("locksmith");
    public static final mp agI = bZ("lodging");
    public static final mp agJ = bZ("meal_delivery");
    public static final mp agK = bZ("meal_takeaway");
    public static final mp agL = bZ("mosque");
    public static final mp agM = bZ("movie_rental");
    public static final mp agN = bZ("movie_theater");
    public static final mp agO = bZ("moving_company");
    public static final mp agP = bZ("museum");
    public static final mp agQ = bZ("night_club");
    public static final mp agR = bZ("painter");
    public static final mp agS = bZ("park");
    public static final mp agT = bZ("parking");
    public static final mp agU = bZ("pet_store");
    public static final mp agV = bZ("pharmacy");
    public static final mp agW = bZ("physiotherapist");
    public static final mp agX = bZ("place_of_worship");
    public static final mp agY = bZ("plumber");
    public static final mp agZ = bZ("police");
    public static final mp aga = bZ("clothing_store");
    public static final mp agb = bZ("convenience_store");
    public static final mp agc = bZ("courthouse");
    public static final mp agd = bZ("dentist");
    public static final mp age = bZ("department_store");
    public static final mp agf = bZ("doctor");
    public static final mp agg = bZ("electrician");
    public static final mp agh = bZ("electronics_store");
    public static final mp agi = bZ("embassy");
    public static final mp agj = bZ("establishment");
    public static final mp agk = bZ("finance");
    public static final mp agl = bZ("fire_station");
    public static final mp agm = bZ("florist");
    public static final mp agn = bZ("food");
    public static final mp ago = bZ("funeral_home");
    public static final mp agp = bZ("furniture_store");
    public static final mp agq = bZ("gas_station");
    public static final mp agr = bZ("general_contractor");
    public static final mp ags = bZ("grocery_or_supermarket");
    public static final mp agt = bZ("gym");
    public static final mp agu = bZ("hair_care");
    public static final mp agv = bZ("hardware_store");
    public static final mp agw = bZ("health");
    public static final mp agx = bZ("hindu_temple");
    public static final mp agy = bZ("home_goods_store");
    public static final mp agz = bZ("hospital");
    public static final mp ahA = bZ("geocode");
    public static final mp ahB = bZ("intersection");
    public static final mp ahC = bZ("locality");
    public static final mp ahD = bZ("natural_feature");
    public static final mp ahE = bZ("neighborhood");
    public static final mp ahF = bZ("political");
    public static final mp ahG = bZ("point_of_interest");
    public static final mp ahH = bZ("post_box");
    public static final mp ahI = bZ("postal_code");
    public static final mp ahJ = bZ("postal_code_prefix");
    public static final mp ahK = bZ("postal_town");
    public static final mp ahL = bZ("premise");
    public static final mp ahM = bZ("room");
    public static final mp ahN = bZ("route");
    public static final mp ahO = bZ("street_address");
    public static final mp ahP = bZ("sublocality");
    public static final mp ahQ = bZ("sublocality_level_1");
    public static final mp ahR = bZ("sublocality_level_2");
    public static final mp ahS = bZ("sublocality_level_3");
    public static final mp ahT = bZ("sublocality_level_4");
    public static final mp ahU = bZ("sublocality_level_5");
    public static final mp ahV = bZ("subpremise");
    public static final mp ahW = bZ("transit_station");
    public static final mp ahX = bZ("other");
    public static final mp aha = bZ("post_office");
    public static final mp ahb = bZ("real_estate_agency");
    public static final mp ahc = bZ("restaurant");
    public static final mp ahd = bZ("roofing_contractor");
    public static final mp ahe = bZ("rv_park");
    public static final mp ahf = bZ("school");
    public static final mp ahg = bZ("shoe_store");
    public static final mp ahh = bZ("shopping_mall");
    public static final mp ahi = bZ("spa");
    public static final mp ahj = bZ("stadium");
    public static final mp ahk = bZ("storage");
    public static final mp ahl = bZ("store");
    public static final mp ahm = bZ("subway_station");
    public static final mp ahn = bZ("synagogue");
    public static final mp aho = bZ("taxi_stand");
    public static final mp ahp = bZ("train_station");
    public static final mp ahq = bZ("travel_agency");
    public static final mp ahr = bZ("university");
    public static final mp ahs = bZ("veterinary_care");
    public static final mp aht = bZ("zoo");
    public static final mp ahu = bZ("administrative_area_level_1");
    public static final mp ahv = bZ("administrative_area_level_2");
    public static final mp ahw = bZ("administrative_area_level_3");
    public static final mp ahx = bZ("colloquial_area");
    public static final mp ahy = bZ("country");
    public static final mp ahz = bZ("floor");
    final int BR;
    final String uO;

    mp(int i, String s)
    {
        o.aZ(s);
        BR = i;
        uO = s;
    }

    public static mp bZ(String s)
    {
        return new mp(0, s);
    }

    public int describeContents()
    {
        mq mq1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof mp) && uO.equals(((mp)obj).uO);
    }

    public int hashCode()
    {
        return uO.hashCode();
    }

    public String toString()
    {
        return uO;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        mq mq1 = CREATOR;
        mq.a(this, parcel, i);
    }

}
