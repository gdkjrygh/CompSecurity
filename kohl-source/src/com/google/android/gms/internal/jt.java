// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            ju, hn

public final class jt
    implements SafeParcelable
{

    public static final ju CREATOR = new ju();
    public static final jt WA = br("campground");
    public static final jt WB = br("car_dealer");
    public static final jt WC = br("car_rental");
    public static final jt WD = br("car_repair");
    public static final jt WE = br("car_wash");
    public static final jt WF = br("casino");
    public static final jt WG = br("cemetery");
    public static final jt WH = br("church");
    public static final jt WI = br("city_hall");
    public static final jt WJ = br("clothing_store");
    public static final jt WK = br("convenience_store");
    public static final jt WL = br("courthouse");
    public static final jt WM = br("dentist");
    public static final jt WN = br("department_store");
    public static final jt WO = br("doctor");
    public static final jt WP = br("electrician");
    public static final jt WQ = br("electronics_store");
    public static final jt WR = br("embassy");
    public static final jt WS = br("establishment");
    public static final jt WT = br("finance");
    public static final jt WU = br("fire_station");
    public static final jt WV = br("florist");
    public static final jt WW = br("food");
    public static final jt WX = br("funeral_home");
    public static final jt WY = br("furniture_store");
    public static final jt WZ = br("gas_station");
    public static final jt Wl = br("accounting");
    public static final jt Wm = br("airport");
    public static final jt Wn = br("amusement_park");
    public static final jt Wo = br("aquarium");
    public static final jt Wp = br("art_gallery");
    public static final jt Wq = br("atm");
    public static final jt Wr = br("bakery");
    public static final jt Ws = br("bank");
    public static final jt Wt = br("bar");
    public static final jt Wu = br("beauty_salon");
    public static final jt Wv = br("bicycle_store");
    public static final jt Ww = br("book_store");
    public static final jt Wx = br("bowling_alley");
    public static final jt Wy = br("bus_station");
    public static final jt Wz = br("cafe");
    public static final jt XA = br("painter");
    public static final jt XB = br("park");
    public static final jt XC = br("parking");
    public static final jt XD = br("pet_store");
    public static final jt XE = br("pharmacy");
    public static final jt XF = br("physiotherapist");
    public static final jt XG = br("place_of_worship");
    public static final jt XH = br("plumber");
    public static final jt XI = br("police");
    public static final jt XJ = br("post_office");
    public static final jt XK = br("real_estate_agency");
    public static final jt XL = br("restaurant");
    public static final jt XM = br("roofing_contractor");
    public static final jt XN = br("rv_park");
    public static final jt XO = br("school");
    public static final jt XP = br("shoe_store");
    public static final jt XQ = br("shopping_mall");
    public static final jt XR = br("spa");
    public static final jt XS = br("stadium");
    public static final jt XT = br("storage");
    public static final jt XU = br("store");
    public static final jt XV = br("subway_station");
    public static final jt XW = br("synagogue");
    public static final jt XX = br("taxi_stand");
    public static final jt XY = br("train_station");
    public static final jt XZ = br("travel_agency");
    public static final jt Xa = br("general_contractor");
    public static final jt Xb = br("grocery_or_supermarket");
    public static final jt Xc = br("gym");
    public static final jt Xd = br("hair_care");
    public static final jt Xe = br("hardware_store");
    public static final jt Xf = br("health");
    public static final jt Xg = br("hindu_temple");
    public static final jt Xh = br("home_goods_store");
    public static final jt Xi = br("hospital");
    public static final jt Xj = br("insurance_agency");
    public static final jt Xk = br("jewelry_store");
    public static final jt Xl = br("laundry");
    public static final jt Xm = br("lawyer");
    public static final jt Xn = br("library");
    public static final jt Xo = br("liquor_store");
    public static final jt Xp = br("local_government_office");
    public static final jt Xq = br("locksmith");
    public static final jt Xr = br("lodging");
    public static final jt Xs = br("meal_delivery");
    public static final jt Xt = br("meal_takeaway");
    public static final jt Xu = br("mosque");
    public static final jt Xv = br("movie_rental");
    public static final jt Xw = br("movie_theater");
    public static final jt Xx = br("moving_company");
    public static final jt Xy = br("museum");
    public static final jt Xz = br("night_club");
    public static final jt YA = br("sublocality_level_2");
    public static final jt YB = br("sublocality_level_3");
    public static final jt YC = br("sublocality_level_4");
    public static final jt YD = br("sublocality_level_5");
    public static final jt YE = br("subpremise");
    public static final jt YF = br("transit_station");
    public static final jt YG = br("other");
    public static final jt Ya = br("university");
    public static final jt Yb = br("veterinary_care");
    public static final jt Yc = br("zoo");
    public static final jt Yd = br("administrative_area_level_1");
    public static final jt Ye = br("administrative_area_level_2");
    public static final jt Yf = br("administrative_area_level_3");
    public static final jt Yg = br("colloquial_area");
    public static final jt Yh = br("country");
    public static final jt Yi = br("floor");
    public static final jt Yj = br("geocode");
    public static final jt Yk = br("intersection");
    public static final jt Yl = br("locality");
    public static final jt Ym = br("natural_feature");
    public static final jt Yn = br("neighborhood");
    public static final jt Yo = br("political");
    public static final jt Yp = br("point_of_interest");
    public static final jt Yq = br("post_box");
    public static final jt Yr = br("postal_code");
    public static final jt Ys = br("postal_code_prefix");
    public static final jt Yt = br("postal_town");
    public static final jt Yu = br("premise");
    public static final jt Yv = br("room");
    public static final jt Yw = br("route");
    public static final jt Yx = br("street_address");
    public static final jt Yy = br("sublocality");
    public static final jt Yz = br("sublocality_level_1");
    final String qU;
    final int xJ;

    jt(int i, String s)
    {
        hn.aE(s);
        xJ = i;
        qU = s;
    }

    public static jt br(String s)
    {
        return new jt(0, s);
    }

    public int describeContents()
    {
        ju ju1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof jt) && qU.equals(((jt)obj).qU);
    }

    public int hashCode()
    {
        return qU.hashCode();
    }

    public String toString()
    {
        return qU;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ju ju1 = CREATOR;
        ju.a(this, parcel, i);
    }

}
