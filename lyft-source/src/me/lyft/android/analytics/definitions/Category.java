// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.definitions;


public final class Category extends Enum
{

    private static final Category $VALUES[];
    public static final Category APPBOY;
    public static final Category APPLICATION;
    public static final Category CONCUR;
    public static final Category DRIVER;
    public static final Category DRIVER_DOCUMENTS;
    public static final Category DRIVER_SIGN_OUT_CONFIRMATION;
    public static final Category EDIT_PROFILE;
    public static final Category END_RIDE_CONFIRMATION;
    public static final Category EXPARESS_PAY;
    public static final Category INVITE_FRIENDS;
    public static final Category LOCATION_SERVICE;
    public static final Category NOTIFICATION;
    public static final Category PASSENGER;
    public static final Category PAYMENT;
    public static final Category PHOTO_PICKER_DIALOG;
    public static final Category PROFILE;
    public static final Category REGISTRATION;
    public static final Category RIDE;
    public static final Category RIDE_HISTORY;
    public static final Category SPLIT_FARE;
    public static final Category WORK_PERKS;
    private final String value = name().toLowerCase();

    private Category(String s, int i)
    {
        super(s, i);
    }

    public static Category valueOf(String s)
    {
        return (Category)Enum.valueOf(me/lyft/android/analytics/definitions/Category, s);
    }

    public static Category[] values()
    {
        return (Category[])$VALUES.clone();
    }

    public String toString()
    {
        return value;
    }

    static 
    {
        REGISTRATION = new Category("REGISTRATION", 0);
        RIDE = new Category("RIDE", 1);
        DRIVER = new Category("DRIVER", 2);
        PASSENGER = new Category("PASSENGER", 3);
        DRIVER_DOCUMENTS = new Category("DRIVER_DOCUMENTS", 4);
        DRIVER_SIGN_OUT_CONFIRMATION = new Category("DRIVER_SIGN_OUT_CONFIRMATION", 5);
        PAYMENT = new Category("PAYMENT", 6);
        PROFILE = new Category("PROFILE", 7);
        EDIT_PROFILE = new Category("EDIT_PROFILE", 8);
        PHOTO_PICKER_DIALOG = new Category("PHOTO_PICKER_DIALOG", 9);
        SPLIT_FARE = new Category("SPLIT_FARE", 10);
        WORK_PERKS = new Category("WORK_PERKS", 11);
        LOCATION_SERVICE = new Category("LOCATION_SERVICE", 12);
        NOTIFICATION = new Category("NOTIFICATION", 13);
        INVITE_FRIENDS = new Category("INVITE_FRIENDS", 14);
        APPLICATION = new Category("APPLICATION", 15);
        APPBOY = new Category("APPBOY", 16);
        RIDE_HISTORY = new Category("RIDE_HISTORY", 17);
        CONCUR = new Category("CONCUR", 18);
        END_RIDE_CONFIRMATION = new Category("END_RIDE_CONFIRMATION", 19);
        EXPARESS_PAY = new Category("EXPARESS_PAY", 20);
        $VALUES = (new Category[] {
            REGISTRATION, RIDE, DRIVER, PASSENGER, DRIVER_DOCUMENTS, DRIVER_SIGN_OUT_CONFIRMATION, PAYMENT, PROFILE, EDIT_PROFILE, PHOTO_PICKER_DIALOG, 
            SPLIT_FARE, WORK_PERKS, LOCATION_SERVICE, NOTIFICATION, INVITE_FRIENDS, APPLICATION, APPBOY, RIDE_HISTORY, CONCUR, END_RIDE_CONFIRMATION, 
            EXPARESS_PAY
        });
    }
}
