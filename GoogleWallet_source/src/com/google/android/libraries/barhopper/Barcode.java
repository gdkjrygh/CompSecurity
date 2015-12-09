// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.barhopper;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

public final class Barcode
    implements Parcelable
{
    public static final class Address
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            private static Address createFromParcel(Parcel parcel)
            {
                return new Address(parcel);
            }

            private static Address[] newArray(int i)
            {
                return new Address[i];
            }

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        public String addressLines[];
        public int type;

        public final int describeContents()
        {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeInt(type);
            parcel.writeStringArray(addressLines);
        }


        public Address()
        {
        }

        private Address(Parcel parcel)
        {
            type = parcel.readInt();
            addressLines = parcel.createStringArray();
        }

    }

    public static class CalendarDateTime
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            private static CalendarDateTime createFromParcel(Parcel parcel)
            {
                return new CalendarDateTime(parcel);
            }

            private static CalendarDateTime[] newArray(int i)
            {
                return new CalendarDateTime[i];
            }

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        public int day;
        public int hours;
        public boolean isUtc;
        public int minutes;
        public int month;
        public String rawValue;
        public int seconds;
        public int year;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeInt(year);
            parcel.writeInt(month);
            parcel.writeInt(day);
            parcel.writeInt(hours);
            parcel.writeInt(minutes);
            parcel.writeInt(seconds);
            if (isUtc)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeByte((byte)i);
            parcel.writeString(rawValue);
        }


        public CalendarDateTime()
        {
        }

        private CalendarDateTime(Parcel parcel)
        {
            year = parcel.readInt();
            month = parcel.readInt();
            day = parcel.readInt();
            hours = parcel.readInt();
            minutes = parcel.readInt();
            seconds = parcel.readInt();
            boolean flag;
            if (parcel.readByte() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            isUtc = flag;
            rawValue = parcel.readString();
        }

    }

    public static class CalendarEvent
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            private static CalendarEvent createFromParcel(Parcel parcel)
            {
                return new CalendarEvent(parcel);
            }

            private static CalendarEvent[] newArray(int i)
            {
                return new CalendarEvent[i];
            }

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        public String description;
        public CalendarDateTime end;
        public String location;
        public String organizer;
        public CalendarDateTime start;
        public String status;
        public String summary;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(summary);
            parcel.writeString(description);
            parcel.writeString(location);
            parcel.writeString(organizer);
            parcel.writeString(status);
            parcel.writeParcelable(start, 0);
            parcel.writeParcelable(end, 0);
        }


        public CalendarEvent()
        {
        }

        private CalendarEvent(Parcel parcel)
        {
            summary = parcel.readString();
            description = parcel.readString();
            location = parcel.readString();
            organizer = parcel.readString();
            status = parcel.readString();
            start = (CalendarDateTime)parcel.readParcelable(com/google/android/libraries/barhopper/Barcode$CalendarDateTime.getClassLoader());
            end = (CalendarDateTime)parcel.readParcelable(com/google/android/libraries/barhopper/Barcode$CalendarDateTime.getClassLoader());
        }

    }

    public static class ContactInfo
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            private static ContactInfo createFromParcel(Parcel parcel)
            {
                return new ContactInfo(parcel);
            }

            private static ContactInfo[] newArray(int i)
            {
                return new ContactInfo[i];
            }

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        public Address addresses[];
        public Email emails[];
        public PersonName name;
        public String organization;
        public Phone phones[];
        public String title;
        public String urls[];

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeParcelable(name, 0);
            parcel.writeString(organization);
            parcel.writeString(title);
            parcel.writeTypedArray(phones, 0);
            parcel.writeTypedArray(emails, 0);
            parcel.writeStringArray(urls);
            parcel.writeTypedArray(addresses, 0);
        }


        public ContactInfo()
        {
        }

        private ContactInfo(Parcel parcel)
        {
            name = (PersonName)parcel.readParcelable(com/google/android/libraries/barhopper/Barcode$PersonName.getClassLoader());
            organization = parcel.readString();
            title = parcel.readString();
            phones = (Phone[])parcel.createTypedArray(Phone.CREATOR);
            emails = (Email[])parcel.createTypedArray(Email.CREATOR);
            urls = parcel.createStringArray();
            addresses = (Address[])parcel.createTypedArray(Address.CREATOR);
        }

    }

    public static class DriverLicense
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            private static DriverLicense createFromParcel(Parcel parcel)
            {
                return new DriverLicense(parcel);
            }

            private static DriverLicense[] newArray(int i)
            {
                return new DriverLicense[i];
            }

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        public String addressCity;
        public String addressState;
        public String addressStreet;
        public String addressZip;
        public String birthDate;
        public String documentType;
        public String expiryDate;
        public String firstName;
        public String gender;
        public String issueDate;
        public String issuingCountry;
        public String lastName;
        public String licenseNumber;
        public String middleName;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(documentType);
            parcel.writeString(firstName);
            parcel.writeString(middleName);
            parcel.writeString(lastName);
            parcel.writeString(gender);
            parcel.writeString(addressStreet);
            parcel.writeString(addressCity);
            parcel.writeString(addressState);
            parcel.writeString(addressZip);
            parcel.writeString(licenseNumber);
            parcel.writeString(issueDate);
            parcel.writeString(expiryDate);
            parcel.writeString(birthDate);
            parcel.writeString(issuingCountry);
        }


        public DriverLicense()
        {
        }

        private DriverLicense(Parcel parcel)
        {
            documentType = parcel.readString();
            firstName = parcel.readString();
            middleName = parcel.readString();
            lastName = parcel.readString();
            gender = parcel.readString();
            addressStreet = parcel.readString();
            addressCity = parcel.readString();
            addressState = parcel.readString();
            addressZip = parcel.readString();
            licenseNumber = parcel.readString();
            issueDate = parcel.readString();
            expiryDate = parcel.readString();
            birthDate = parcel.readString();
            issuingCountry = parcel.readString();
        }

    }

    public static class Email
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            private static Email createFromParcel(Parcel parcel)
            {
                return new Email(parcel);
            }

            private static Email[] newArray(int i)
            {
                return new Email[i];
            }

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        public String address;
        public String body;
        public String subject;
        public int type;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeInt(type);
            parcel.writeString(address);
            parcel.writeString(subject);
            parcel.writeString(body);
        }


        public Email()
        {
        }

        private Email(Parcel parcel)
        {
            type = parcel.readInt();
            address = parcel.readString();
            subject = parcel.readString();
            body = parcel.readString();
        }

    }

    public static class GeoPoint
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            private static GeoPoint createFromParcel(Parcel parcel)
            {
                return new GeoPoint(parcel);
            }

            private static GeoPoint[] newArray(int i)
            {
                return new GeoPoint[i];
            }

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        public double lat;
        public double lng;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeDouble(lat);
            parcel.writeDouble(lng);
        }


        public GeoPoint()
        {
        }

        private GeoPoint(Parcel parcel)
        {
            lat = parcel.readDouble();
            lng = parcel.readDouble();
        }

    }

    public static class PersonName
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            private static PersonName createFromParcel(Parcel parcel)
            {
                return new PersonName(parcel);
            }

            private static PersonName[] newArray(int i)
            {
                return new PersonName[i];
            }

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        public String first;
        public String formattedName;
        public String last;
        public String middle;
        public String prefix;
        public String pronunciation;
        public String suffix;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(formattedName);
            parcel.writeString(pronunciation);
            parcel.writeString(prefix);
            parcel.writeString(first);
            parcel.writeString(middle);
            parcel.writeString(last);
            parcel.writeString(suffix);
        }


        public PersonName()
        {
        }

        private PersonName(Parcel parcel)
        {
            formattedName = parcel.readString();
            pronunciation = parcel.readString();
            prefix = parcel.readString();
            first = parcel.readString();
            middle = parcel.readString();
            last = parcel.readString();
            suffix = parcel.readString();
        }

    }

    public static class Phone
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            private static Phone createFromParcel(Parcel parcel)
            {
                return new Phone(parcel);
            }

            private static Phone[] newArray(int i)
            {
                return new Phone[i];
            }

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        public String number;
        public int type;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeInt(type);
            parcel.writeString(number);
        }


        public Phone()
        {
        }

        private Phone(Parcel parcel)
        {
            type = parcel.readInt();
            number = parcel.readString();
        }

    }

    public static class Sms
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            private static Sms createFromParcel(Parcel parcel)
            {
                return new Sms(parcel);
            }

            private static Sms[] newArray(int i)
            {
                return new Sms[i];
            }

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        public String message;
        public String phoneNumber;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(message);
            parcel.writeString(phoneNumber);
        }


        public Sms()
        {
        }

        private Sms(Parcel parcel)
        {
            message = parcel.readString();
            phoneNumber = parcel.readString();
        }

    }

    public static class UrlBookmark
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            private static UrlBookmark createFromParcel(Parcel parcel)
            {
                return new UrlBookmark(parcel);
            }

            private static UrlBookmark[] newArray(int i)
            {
                return new UrlBookmark[i];
            }

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        public String title;
        public String url;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(title);
            parcel.writeString(url);
        }


        public UrlBookmark()
        {
        }

        private UrlBookmark(Parcel parcel)
        {
            title = parcel.readString();
            url = parcel.readString();
        }

    }

    public static class WiFi
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            private static WiFi createFromParcel(Parcel parcel)
            {
                return new WiFi(parcel);
            }

            private static WiFi[] newArray(int i)
            {
                return new WiFi[i];
            }

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        public int encryptionType;
        public String password;
        public String ssid;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(ssid);
            parcel.writeString(password);
            parcel.writeInt(encryptionType);
        }


        public WiFi()
        {
        }

        private WiFi(Parcel parcel)
        {
            ssid = parcel.readString();
            password = parcel.readString();
            encryptionType = parcel.readInt();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static Barcode createFromParcel(Parcel parcel)
        {
            return new Barcode(parcel);
        }

        private static Barcode[] newArray(int i)
        {
            return new Barcode[i];
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    public CalendarEvent calendarEvent;
    public ContactInfo contactInfo;
    public Point cornerPoints[];
    public String displayValue;
    public DriverLicense driverLicense;
    public Email email;
    public int format;
    public GeoPoint geoPoint;
    public Phone phone;
    public String rawValue;
    public Sms sms;
    public UrlBookmark url;
    public int valueFormat;
    public WiFi wifi;

    public Barcode()
    {
    }

    private Barcode(Parcel parcel)
    {
        format = parcel.readInt();
        rawValue = parcel.readString();
        displayValue = parcel.readString();
        valueFormat = parcel.readInt();
        cornerPoints = (Point[])parcel.createTypedArray(Point.CREATOR);
        email = (Email)parcel.readParcelable(com/google/android/libraries/barhopper/Barcode$Email.getClassLoader());
        phone = (Phone)parcel.readParcelable(com/google/android/libraries/barhopper/Barcode$Phone.getClassLoader());
        sms = (Sms)parcel.readParcelable(com/google/android/libraries/barhopper/Barcode$Sms.getClassLoader());
        wifi = (WiFi)parcel.readParcelable(com/google/android/libraries/barhopper/Barcode$WiFi.getClassLoader());
        url = (UrlBookmark)parcel.readParcelable(com/google/android/libraries/barhopper/Barcode$UrlBookmark.getClassLoader());
        geoPoint = (GeoPoint)parcel.readParcelable(com/google/android/libraries/barhopper/Barcode$GeoPoint.getClassLoader());
        calendarEvent = (CalendarEvent)parcel.readParcelable(com/google/android/libraries/barhopper/Barcode$CalendarEvent.getClassLoader());
        contactInfo = (ContactInfo)parcel.readParcelable(com/google/android/libraries/barhopper/Barcode$ContactInfo.getClassLoader());
        driverLicense = (DriverLicense)parcel.readParcelable(com/google/android/libraries/barhopper/Barcode$DriverLicense.getClassLoader());
    }


    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(format);
        parcel.writeString(rawValue);
        parcel.writeString(displayValue);
        parcel.writeInt(valueFormat);
        parcel.writeTypedArray(cornerPoints, 0);
        parcel.writeParcelable(email, 0);
        parcel.writeParcelable(phone, 0);
        parcel.writeParcelable(sms, 0);
        parcel.writeParcelable(wifi, 0);
        parcel.writeParcelable(url, 0);
        parcel.writeParcelable(geoPoint, 0);
        parcel.writeParcelable(calendarEvent, 0);
        parcel.writeParcelable(contactInfo, 0);
        parcel.writeParcelable(driverLicense, 0);
    }

}
