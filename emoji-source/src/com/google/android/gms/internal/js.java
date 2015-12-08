// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            jt, hm

public final class js
    implements SafeParcelable
{

    public static final jt CREATOR = new jt();
    public static final js WA = br("bowling_alley");
    public static final js WB = br("bus_station");
    public static final js WC = br("cafe");
    public static final js WD = br("campground");
    public static final js WE = br("car_dealer");
    public static final js WF = br("car_rental");
    public static final js WG = br("car_repair");
    public static final js WH = br("car_wash");
    public static final js WI = br("casino");
    public static final js WJ = br("cemetery");
    public static final js WK = br("church");
    public static final js WL = br("city_hall");
    public static final js WM = br("clothing_store");
    public static final js WN = br("convenience_store");
    public static final js WO = br("courthouse");
    public static final js WP = br("dentist");
    public static final js WQ = br("department_store");
    public static final js WR = br("doctor");
    public static final js WS = br("electrician");
    public static final js WT = br("electronics_store");
    public static final js WU = br("embassy");
    public static final js WV = br("establishment");
    public static final js WW = br("finance");
    public static final js WX = br("fire_station");
    public static final js WY = br("florist");
    public static final js WZ = br("food");
    public static final js Wo = br("accounting");
    public static final js Wp = br("airport");
    public static final js Wq = br("amusement_park");
    public static final js Wr = br("aquarium");
    public static final js Ws = br("art_gallery");
    public static final js Wt = br("atm");
    public static final js Wu = br("bakery");
    public static final js Wv = br("bank");
    public static final js Ww = br("bar");
    public static final js Wx = br("beauty_salon");
    public static final js Wy = br("bicycle_store");
    public static final js Wz = br("book_store");
    public static final js XA = br("moving_company");
    public static final js XB = br("museum");
    public static final js XC = br("night_club");
    public static final js XD = br("painter");
    public static final js XE = br("park");
    public static final js XF = br("parking");
    public static final js XG = br("pet_store");
    public static final js XH = br("pharmacy");
    public static final js XI = br("physiotherapist");
    public static final js XJ = br("place_of_worship");
    public static final js XK = br("plumber");
    public static final js XL = br("police");
    public static final js XM = br("post_office");
    public static final js XN = br("real_estate_agency");
    public static final js XO = br("restaurant");
    public static final js XP = br("roofing_contractor");
    public static final js XQ = br("rv_park");
    public static final js XR = br("school");
    public static final js XS = br("shoe_store");
    public static final js XT = br("shopping_mall");
    public static final js XU = br("spa");
    public static final js XV = br("stadium");
    public static final js XW = br("storage");
    public static final js XX = br("store");
    public static final js XY = br("subway_station");
    public static final js XZ = br("synagogue");
    public static final js Xa = br("funeral_home");
    public static final js Xb = br("furniture_store");
    public static final js Xc = br("gas_station");
    public static final js Xd = br("general_contractor");
    public static final js Xe = br("grocery_or_supermarket");
    public static final js Xf = br("gym");
    public static final js Xg = br("hair_care");
    public static final js Xh = br("hardware_store");
    public static final js Xi = br("health");
    public static final js Xj = br("hindu_temple");
    public static final js Xk = br("home_goods_store");
    public static final js Xl = br("hospital");
    public static final js Xm = br("insurance_agency");
    public static final js Xn = br("jewelry_store");
    public static final js Xo = br("laundry");
    public static final js Xp = br("lawyer");
    public static final js Xq = br("library");
    public static final js Xr = br("liquor_store");
    public static final js Xs = br("local_government_office");
    public static final js Xt = br("locksmith");
    public static final js Xu = br("lodging");
    public static final js Xv = br("meal_delivery");
    public static final js Xw = br("meal_takeaway");
    public static final js Xx = br("mosque");
    public static final js Xy = br("movie_rental");
    public static final js Xz = br("movie_theater");
    public static final js YA = br("street_address");
    public static final js YB = br("sublocality");
    public static final js YC = br("sublocality_level_1");
    public static final js YD = br("sublocality_level_2");
    public static final js YE = br("sublocality_level_3");
    public static final js YF = br("sublocality_level_4");
    public static final js YG = br("sublocality_level_5");
    public static final js YH = br("subpremise");
    public static final js YI = br("transit_station");
    public static final js YJ = br("other");
    public static final js Ya = br("taxi_stand");
    public static final js Yb = br("train_station");
    public static final js Yc = br("travel_agency");
    public static final js Yd = br("university");
    public static final js Ye = br("veterinary_care");
    public static final js Yf = br("zoo");
    public static final js Yg = br("administrative_area_level_1");
    public static final js Yh = br("administrative_area_level_2");
    public static final js Yi = br("administrative_area_level_3");
    public static final js Yj = br("colloquial_area");
    public static final js Yk = br("country");
    public static final js Yl = br("floor");
    public static final js Ym = br("geocode");
    public static final js Yn = br("intersection");
    public static final js Yo = br("locality");
    public static final js Yp = br("natural_feature");
    public static final js Yq = br("neighborhood");
    public static final js Yr = br("political");
    public static final js Ys = br("point_of_interest");
    public static final js Yt = br("post_box");
    public static final js Yu = br("postal_code");
    public static final js Yv = br("postal_code_prefix");
    public static final js Yw = br("postal_town");
    public static final js Yx = br("premise");
    public static final js Yy = br("room");
    public static final js Yz = br("route");
    final String qX;
    final int xM;

    js(int i, String s)
    {
        hm.aE(s);
        xM = i;
        qX = s;
    }

    public static js br(String s)
    {
        return new js(0, s);
    }

    public int describeContents()
    {
        jt jt1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof js) && qX.equals(((js)obj).qX);
    }

    public int hashCode()
    {
        return qX.hashCode();
    }

    public String toString()
    {
        return qX;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        jt jt1 = CREATOR;
        jt.a(this, parcel, i);
    }

}
