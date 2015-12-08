// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ride;

import me.lyft.android.common.INullable;
import me.lyft.android.common.Objects;

public class Passenger
    implements INullable
{

    private boolean driverCanPenalize;
    private String firstName;
    private String id;
    private boolean isDroppedoff;
    private boolean isPickedup;
    private boolean isSelf;
    private int partySize;
    private String phoneNumber;
    private String photoUrl;
    private float rating;
    private boolean ratingCompleted;
    private String rideId;

    public Passenger(String s, boolean flag, String s1, String s2, String s3, int i, boolean flag1, 
            boolean flag2, boolean flag3)
    {
        id = s;
        isSelf = flag;
        firstName = s1;
        photoUrl = s2;
        phoneNumber = s3;
        partySize = i;
        isPickedup = flag1;
        isDroppedoff = flag2;
        ratingCompleted = flag3;
    }

    public static Passenger empty()
    {
        return NullPassenger.instance;
    }

    public boolean driverCanPenalize()
    {
        return driverCanPenalize;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof Passenger)
        {
            if (Objects.equals(getId(), ((Passenger) (obj = (Passenger)obj)).getId()) && Objects.equals(getRideId(), ((Passenger) (obj)).getRideId()) && Objects.equals(getFirstName(), ((Passenger) (obj)).getFirstName()) && Objects.equals(getPhotoUrl(), ((Passenger) (obj)).getPhotoUrl()) && Math.abs(getRating() - ((Passenger) (obj)).getRating()) < 0.001F && Objects.equals(getPhoneNumber(), ((Passenger) (obj)).getPhoneNumber()) && getPartySize() == ((Passenger) (obj)).getPartySize() && driverCanPenalize() == ((Passenger) (obj)).driverCanPenalize())
            {
                return true;
            }
        }
        return false;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getId()
    {
        return id;
    }

    public int getPartySize()
    {
        return partySize;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public String getPhotoUrl()
    {
        return photoUrl;
    }

    public float getRating()
    {
        return rating;
    }

    public String getRideId()
    {
        return rideId;
    }

    public boolean isDroppedoff()
    {
        return isDroppedoff;
    }

    public boolean isNull()
    {
        return false;
    }

    public boolean isPickedup()
    {
        return isPickedup;
    }

    public boolean isRatingCompleted()
    {
        return ratingCompleted;
    }

    public boolean isSelf()
    {
        return isSelf;
    }

    void setDriverCanPenalize(boolean flag)
    {
        driverCanPenalize = flag;
    }

    void setFirstName(String s)
    {
        firstName = s;
    }

    void setId(String s)
    {
        id = s;
    }

    void setPartySize(int i)
    {
        partySize = i;
    }

    void setPhoneNumber(String s)
    {
        phoneNumber = s;
    }

    void setPhotoUrl(String s)
    {
        photoUrl = s;
    }

    void setRating(float f)
    {
        rating = f;
    }

    void setRideId(String s)
    {
        rideId = s;
    }

    private class NullPassenger extends Passenger
    {

        private static final Passenger instance = new NullPassenger();

        public String getFirstName()
        {
            return "";
        }

        public String getId()
        {
            return "";
        }

        public String getPhoneNumber()
        {
            return "";
        }

        public String getPhotoUrl()
        {
            return "";
        }

        public boolean isNull()
        {
            return true;
        }



        private NullPassenger()
        {
            super("", false, "", "", "", 0, false, false, false);
        }
    }

}
