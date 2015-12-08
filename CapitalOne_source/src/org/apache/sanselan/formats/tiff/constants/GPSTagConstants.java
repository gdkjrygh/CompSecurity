// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.tiff.constants;


// Referenced classes of package org.apache.sanselan.formats.tiff.constants:
//            TiffDirectoryConstants, TiffFieldTypeConstants, TagInfo

public interface GPSTagConstants
    extends TiffDirectoryConstants, TiffFieldTypeConstants
{

    public static final TagInfo Q[] = {
        aV_, aW_, aX_, aY_, aZ_, ba_, bb_, bc_, bd_, be_, 
        bf_, bg_, bh_, bi_, bj_, bk_, bl_, bm_, bn_, bo_, 
        bp_, bq_, br_, bs_, bt_, bu_, bv_, bw_, bx_, by_, 
        bz_
    };
    public static final TagInfo aV_ = new TagInfo("GPS Version ID", 0, gl, 4, ge);
    public static final TagInfo aW_ = new TagInfo("GPS Latitude Ref", 1, gh, 2, ge);
    public static final TagInfo aX_ = new TagInfo("GPS Latitude", 2, gj, 3, ge);
    public static final TagInfo aY_ = new TagInfo("GPS Longitude Ref", 3, gh, 2, ge);
    public static final TagInfo aZ_ = new TagInfo("GPS Longitude", 4, gj, 3, ge);
    public static final TagInfo ba_ = new TagInfo("GPS Altitude Ref", 5, gl, -1, ge);
    public static final TagInfo bb_ = new TagInfo("GPS Altitude", 6, gj, -1, ge);
    public static final TagInfo bc_ = new TagInfo("GPS Time Stamp", 7, gj, 3, ge);
    public static final TagInfo bd_ = new TagInfo("GPS Satellites", 8, gh, -1, ge);
    public static final TagInfo be_ = new TagInfo("GPS Status", 9, gh, 2, ge);
    public static final TagInfo bf_ = new TagInfo("GPS Measure Mode", 10, gh, 2, ge);
    public static final TagInfo bg_ = new TagInfo("GPS DOP", 11, gj, -1, ge);
    public static final TagInfo bh_ = new TagInfo("GPS Speed Ref", 12, gh, 2, ge);
    public static final TagInfo bi_ = new TagInfo("GPS Speed", 13, gj, -1, ge);
    public static final TagInfo bj_ = new TagInfo("GPS Track Ref", 14, gh, 2, ge);
    public static final TagInfo bk_ = new TagInfo("GPS Track", 15, gj, -1, ge);
    public static final TagInfo bl_ = new TagInfo("GPS Img Direction Ref", 16, gh, 2, ge);
    public static final TagInfo bm_ = new TagInfo("GPS Img Direction", 17, gj, -1, ge);
    public static final TagInfo bn_ = new TagInfo("GPS Map Datum", 18, gh, -1, ge);
    public static final TagInfo bo_ = new TagInfo("GPS Dest Latitude Ref", 19, gh, 2, ge);
    public static final TagInfo bp_ = new TagInfo("GPS Dest Latitude", 20, gj, 3, ge);
    public static final TagInfo bq_ = new TagInfo("GPS Dest Longitude Ref", 21, gh, 2, ge);
    public static final TagInfo br_ = new TagInfo("GPS Dest Longitude", 22, gj, 3, ge);
    public static final TagInfo bs_ = new TagInfo("GPS Dest Bearing Ref", 23, gh, 2, ge);
    public static final TagInfo bt_ = new TagInfo("GPS Dest Bearing", 24, gj, -1, ge);
    public static final TagInfo bu_ = new TagInfo("GPS Dest Distance Ref", 25, gh, 2, ge);
    public static final TagInfo bv_ = new TagInfo("GPS Dest Distance", 26, gj, -1, ge);
    public static final TagInfo bw_ = new TagInfo.Text("GPS Processing Method", 27, gn, ge);
    public static final TagInfo bx_ = new TagInfo.Text("GPS Area Information", 28, gn, ge);
    public static final TagInfo by_ = new TagInfo("GPS Date Stamp", 29, gh, 11, ge);
    public static final TagInfo bz_ = new TagInfo("GPS Differential", 30, r_, -1, ge);

}
