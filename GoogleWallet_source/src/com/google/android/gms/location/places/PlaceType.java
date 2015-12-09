// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.kn;

// Referenced classes of package com.google.android.gms.location.places:
//            h

public final class PlaceType
    implements SafeParcelable
{

    public static final PlaceType ACCOUNTING = create("accounting");
    public static final PlaceType ADMINISTRATIVE_AREA_LEVEL_1 = create("administrative_area_level_1");
    public static final PlaceType ADMINISTRATIVE_AREA_LEVEL_2 = create("administrative_area_level_2");
    public static final PlaceType ADMINISTRATIVE_AREA_LEVEL_3 = create("administrative_area_level_3");
    public static final PlaceType AIRPORT = create("airport");
    public static final PlaceType AMUSEMENT_PARK = create("amusement_park");
    public static final PlaceType AQUARIUM = create("aquarium");
    public static final PlaceType ART_GALLERY = create("art_gallery");
    public static final PlaceType ATM = create("atm");
    public static final PlaceType BAKERY = create("bakery");
    public static final PlaceType BANK = create("bank");
    public static final PlaceType BAR = create("bar");
    public static final PlaceType BEAUTY_SALON = create("beauty_salon");
    public static final PlaceType BICYCLE_STORE = create("bicycle_store");
    public static final PlaceType BOOK_STORE = create("book_store");
    public static final PlaceType BOWLING_ALLEY = create("bowling_alley");
    public static final PlaceType BUS_STATION = create("bus_station");
    public static final PlaceType CAFE = create("cafe");
    public static final PlaceType CAMPGROUND = create("campground");
    public static final PlaceType CAR_DEALER = create("car_dealer");
    public static final PlaceType CAR_RENTAL = create("car_rental");
    public static final PlaceType CAR_REPAIR = create("car_repair");
    public static final PlaceType CAR_WASH = create("car_wash");
    public static final PlaceType CASINO = create("casino");
    public static final PlaceType CEMETERY = create("cemetery");
    public static final PlaceType CHURCH = create("church");
    public static final PlaceType CITY_HALL = create("city_hall");
    public static final PlaceType CLOTHING_STORE = create("clothing_store");
    public static final PlaceType COLLOQUIAL_AREA = create("colloquial_area");
    public static final PlaceType CONVENIENCE_STORE = create("convenience_store");
    public static final PlaceType COUNTRY = create("country");
    public static final PlaceType COURTHOUSE = create("courthouse");
    public static final h CREATOR = new h();
    public static final PlaceType DENTIST = create("dentist");
    public static final PlaceType DEPARTMENT_STORE = create("department_store");
    public static final PlaceType DOCTOR = create("doctor");
    public static final PlaceType ELECTRICIAN = create("electrician");
    public static final PlaceType ELECTRONICS_STORE = create("electronics_store");
    public static final PlaceType EMBASSY = create("embassy");
    public static final PlaceType ESTABLISHMENT = create("establishment");
    public static final PlaceType FINANCE = create("finance");
    public static final PlaceType FIRE_STATION = create("fire_station");
    public static final PlaceType FLOOR = create("floor");
    public static final PlaceType FLORIST = create("florist");
    public static final PlaceType FOOD = create("food");
    public static final PlaceType FUNERAL_HOME = create("funeral_home");
    public static final PlaceType FURNITURE_STORE = create("furniture_store");
    public static final PlaceType GAS_STATION = create("gas_station");
    public static final PlaceType GENERAL_CONTRACTOR = create("general_contractor");
    public static final PlaceType GEOCODE = create("geocode");
    public static final PlaceType GROCERY_OR_SUPERMARKET = create("grocery_or_supermarket");
    public static final PlaceType GYM = create("gym");
    public static final PlaceType HAIR_CARE = create("hair_care");
    public static final PlaceType HARDWARE_STORE = create("hardware_store");
    public static final PlaceType HEALTH = create("health");
    public static final PlaceType HINDU_TEMPLE = create("hindu_temple");
    public static final PlaceType HOME_GOODS_STORE = create("home_goods_store");
    public static final PlaceType HOSPITAL = create("hospital");
    public static final PlaceType INSURANCE_AGENCY = create("insurance_agency");
    public static final PlaceType INTERSECTION = create("intersection");
    public static final PlaceType JEWELRY_STORE = create("jewelry_store");
    public static final PlaceType LAUNDRY = create("laundry");
    public static final PlaceType LAWYER = create("lawyer");
    public static final PlaceType LIBRARY = create("library");
    public static final PlaceType LIQUOR_STORE = create("liquor_store");
    public static final PlaceType LOCALITY = create("locality");
    public static final PlaceType LOCAL_GOVERNMENT_OFFICE = create("local_government_office");
    public static final PlaceType LOCKSMITH = create("locksmith");
    public static final PlaceType LODGING = create("lodging");
    public static final PlaceType MEAL_DELIVERY = create("meal_delivery");
    public static final PlaceType MEAL_TAKEAWAY = create("meal_takeaway");
    public static final PlaceType MOSQUE = create("mosque");
    public static final PlaceType MOVIE_RENTAL = create("movie_rental");
    public static final PlaceType MOVIE_THEATER = create("movie_theater");
    public static final PlaceType MOVING_COMPANY = create("moving_company");
    public static final PlaceType MUSEUM = create("museum");
    public static final PlaceType NATURAL_FEATURE = create("natural_feature");
    public static final PlaceType NEIGHBORHOOD = create("neighborhood");
    public static final PlaceType NIGHT_CLUB = create("night_club");
    public static final PlaceType OTHER = create("other");
    public static final PlaceType PAINTER = create("painter");
    public static final PlaceType PARK = create("park");
    public static final PlaceType PARKING = create("parking");
    public static final PlaceType PET_STORE = create("pet_store");
    public static final PlaceType PHARMACY = create("pharmacy");
    public static final PlaceType PHYSIOTHERAPIST = create("physiotherapist");
    public static final PlaceType PLACE_OF_WORSHIP = create("place_of_worship");
    public static final PlaceType PLUMBER = create("plumber");
    public static final PlaceType POINT_OF_INTEREST = create("point_of_interest");
    public static final PlaceType POLICE = create("police");
    public static final PlaceType POLITICAL = create("political");
    public static final PlaceType POSTAL_CODE = create("postal_code");
    public static final PlaceType POSTAL_CODE_PREFIX = create("postal_code_prefix");
    public static final PlaceType POSTAL_TOWN = create("postal_town");
    public static final PlaceType POST_BOX = create("post_box");
    public static final PlaceType POST_OFFICE = create("post_office");
    public static final PlaceType PREMISE = create("premise");
    public static final PlaceType REAL_ESTATE_AGENCY = create("real_estate_agency");
    public static final PlaceType RESTAURANT = create("restaurant");
    public static final PlaceType ROOFING_CONTRACTOR = create("roofing_contractor");
    public static final PlaceType ROOM = create("room");
    public static final PlaceType ROUTE = create("route");
    public static final PlaceType RV_PARK = create("rv_park");
    public static final PlaceType SCHOOL = create("school");
    public static final PlaceType SHOE_STORE = create("shoe_store");
    public static final PlaceType SHOPPING_MALL = create("shopping_mall");
    public static final PlaceType SPA = create("spa");
    public static final PlaceType STADIUM = create("stadium");
    public static final PlaceType STORAGE = create("storage");
    public static final PlaceType STORE = create("store");
    public static final PlaceType STREET_ADDRESS = create("street_address");
    public static final PlaceType SUBLOCALITY = create("sublocality");
    public static final PlaceType SUBLOCALITY_LEVEL_1 = create("sublocality_level_1");
    public static final PlaceType SUBLOCALITY_LEVEL_2 = create("sublocality_level_2");
    public static final PlaceType SUBLOCALITY_LEVEL_3 = create("sublocality_level_3");
    public static final PlaceType SUBLOCALITY_LEVEL_4 = create("sublocality_level_4");
    public static final PlaceType SUBLOCALITY_LEVEL_5 = create("sublocality_level_5");
    public static final PlaceType SUBPREMISE = create("subpremise");
    public static final PlaceType SUBWAY_STATION = create("subway_station");
    public static final PlaceType SYNAGOGUE = create("synagogue");
    public static final PlaceType TAXI_STAND = create("taxi_stand");
    public static final PlaceType TRAIN_STATION = create("train_station");
    public static final PlaceType TRANSIT_STATION = create("transit_station");
    public static final PlaceType TRAVEL_AGENCY = create("travel_agency");
    public static final PlaceType UNIVERSITY = create("university");
    public static final PlaceType VETERINARY_CARE = create("veterinary_care");
    public static final PlaceType ZOO = create("zoo");
    final int mVersionCode;
    final String vc;

    PlaceType(int i, String s)
    {
        kn.bk(s);
        mVersionCode = i;
        vc = s;
    }

    private static PlaceType create(String s)
    {
        return new PlaceType(0, s);
    }

    public final int describeContents()
    {
        h h1 = CREATOR;
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof PlaceType) && vc.equals(((PlaceType)obj).vc);
    }

    public final int hashCode()
    {
        return vc.hashCode();
    }

    public final String toString()
    {
        return vc;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        h h1 = CREATOR;
        h.a(this, parcel, i);
    }

}
