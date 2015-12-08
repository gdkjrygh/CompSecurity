// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.googleapps;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.google.android.googleapps:
//            b

public class LoginData
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public byte f[];
    public String g;
    public String h;
    public int i;
    public Status j;
    public String k;
    public String l;
    public String m;

    public LoginData()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = 0;
        j = null;
        k = null;
        l = null;
        m = null;
    }

    LoginData(Parcel parcel)
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = 0;
        j = null;
        k = null;
        l = null;
        m = null;
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
        d = parcel.readString();
        e = parcel.readString();
        int i1 = parcel.readInt();
        String s;
        if (i1 == -1)
        {
            f = null;
        } else
        {
            f = new byte[i1];
            parcel.readByteArray(f);
        }
        g = parcel.readString();
        h = parcel.readString();
        i = parcel.readInt();
        s = parcel.readString();
        if (s == null)
        {
            j = null;
        } else
        {
            j = Status.valueOf(s);
        }
        k = parcel.readString();
        l = parcel.readString();
        m = parcel.readString();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeString(e);
        if (f == null)
        {
            parcel.writeInt(-1);
        } else
        {
            parcel.writeInt(f.length);
            parcel.writeByteArray(f);
        }
        parcel.writeString(g);
        parcel.writeString(h);
        parcel.writeInt(i);
        if (j == null)
        {
            parcel.writeString(null);
        } else
        {
            parcel.writeString(j.name());
        }
        parcel.writeString(k);
        parcel.writeString(l);
        parcel.writeString(m);
    }


    private class Status extends Enum
    {

        public static final Status ACCOUNT_DISABLED;
        public static final Status BAD_REQUEST;
        public static final Status BAD_USERNAME;
        public static final Status CANCELLED;
        public static final Status CAPTCHA;
        public static final Status DELETED_GMAIL;
        public static final Status LOGIN_FAIL;
        public static final Status MISSING_APPS;
        public static final Status NETWORK_ERROR;
        public static final Status NO_GMAIL;
        public static final Status SERVER_ERROR;
        public static final Status SUCCESS;
        private static final Status a[];

        public static Status valueOf(String s)
        {
            return (Status)Enum.valueOf(com/google/android/googleapps/LoginData$Status, s);
        }

        public static final Status[] values()
        {
            return (Status[])a.clone();
        }

        static 
        {
            SUCCESS = new Status("SUCCESS", 0);
            ACCOUNT_DISABLED = new Status("ACCOUNT_DISABLED", 1);
            BAD_USERNAME = new Status("BAD_USERNAME", 2);
            BAD_REQUEST = new Status("BAD_REQUEST", 3);
            LOGIN_FAIL = new Status("LOGIN_FAIL", 4);
            SERVER_ERROR = new Status("SERVER_ERROR", 5);
            MISSING_APPS = new Status("MISSING_APPS", 6);
            NO_GMAIL = new Status("NO_GMAIL", 7);
            NETWORK_ERROR = new Status("NETWORK_ERROR", 8);
            CAPTCHA = new Status("CAPTCHA", 9);
            CANCELLED = new Status("CANCELLED", 10);
            DELETED_GMAIL = new Status("DELETED_GMAIL", 11);
            a = (new Status[] {
                SUCCESS, ACCOUNT_DISABLED, BAD_USERNAME, BAD_REQUEST, LOGIN_FAIL, SERVER_ERROR, MISSING_APPS, NO_GMAIL, NETWORK_ERROR, CAPTCHA, 
                CANCELLED, DELETED_GMAIL
            });
        }

        private Status(String s, int i1)
        {
            super(s, i1);
        }
    }

}
