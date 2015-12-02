// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.locale;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public final class LocaleInfo
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public LocaleInfo a(Parcel parcel)
        {
            return new LocaleInfo(parcel);
        }

        public LocaleInfo[] a(int i)
        {
            return new LocaleInfo[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i)
        {
            return a(i);
        }

    };
    public static final int PKG_MATCHED = 0;
    public static final int PKG_NEED_UPDATE = 1;
    public static final int PKG_NOT_INSTALLED = 2;
    public static final int PKG_NOT_MATCHED = 3;
    public String allVersion;
    public boolean buildin;
    public boolean cfgMatched;
    public String locale;
    public String md5;
    public String name;
    public String path;
    public String pkg;
    public int pkgVersion;
    public long size;
    public int state;
    public boolean support;
    public String translator;
    public String url;

    public LocaleInfo(Context context, String s)
    {
        locale = "";
        md5 = "";
        size = -1L;
        url = "";
        translator = "";
        state = 2;
        buildin = false;
        path = "";
        allVersion = "";
        pkg = "";
        pkgVersion = 1;
        name = "";
        context = s.split(";");
        if (context.length < 7)
        {
            cfgMatched = false;
            return;
        }
        locale = context[0];
        allVersion = context[1];
        pkg = context[2];
        try
        {
            pkgVersion = Integer.valueOf(context[3]).intValue();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            cfgMatched = false;
            return;
        }
        md5 = context[4];
        try
        {
            size = Long.valueOf(context[5]).longValue();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            cfgMatched = false;
            return;
        }
        url = context[6];
        cfgMatched = isAppVersionMatch();
    }

    private LocaleInfo(Parcel parcel)
    {
        locale = "";
        md5 = "";
        size = -1L;
        url = "";
        translator = "";
        state = 2;
        buildin = false;
        path = "";
        allVersion = "";
        pkg = "";
        pkgVersion = 1;
        name = "";
        locale = parcel.readString();
        md5 = parcel.readString();
        size = parcel.readLong();
        url = parcel.readString();
        translator = parcel.readString();
        state = parcel.readInt();
        boolean aflag[] = parcel.createBooleanArray();
        buildin = aflag[0];
        cfgMatched = aflag[1];
        support = aflag[2];
        path = parcel.readString();
        allVersion = parcel.readString();
        pkg = parcel.readString();
        pkgVersion = parcel.readInt();
        name = parcel.readString();
    }


    public LocaleInfo(String s)
    {
        locale = "";
        md5 = "";
        size = -1L;
        url = "";
        translator = "";
        state = 2;
        buildin = false;
        path = "";
        allVersion = "";
        pkg = "";
        pkgVersion = 1;
        name = "";
        locale = s;
        buildin = true;
    }

    public LocaleInfo(String s, String s1, int i, String s2, String s3, String s4)
    {
        boolean flag = false;
        super();
        locale = "";
        md5 = "";
        size = -1L;
        url = "";
        translator = "";
        state = 2;
        buildin = false;
        path = "";
        allVersion = "";
        pkg = "";
        pkgVersion = 1;
        name = "";
        locale = s;
        allVersion = s1;
        pkgVersion = i;
        cfgMatched = isAppVersionMatch();
        if (cfgMatched)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 3;
        }
        state = i;
        pkg = s2;
        translator = s3;
        path = s4;
    }

    public LocaleInfo(String s, boolean flag)
    {
        locale = "";
        md5 = "";
        size = -1L;
        url = "";
        translator = "";
        state = 2;
        buildin = false;
        path = "";
        allVersion = "";
        pkg = "";
        pkgVersion = 1;
        name = "";
        locale = s;
        support = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean isAllVersionMatch()
    {
        String as[];
        if (!TextUtils.isEmpty(allVersion))
        {
            if ((as = allVersion.split(",")) != null && as.length >= 3 && "1.0.8".equals(as[0]))
            {
                int i;
                int j;
                int k;
                try
                {
                    i = Integer.valueOf("3742").intValue();
                    j = Integer.valueOf(as[1]).intValue();
                    k = Integer.valueOf(as[2]).intValue();
                }
                catch (NumberFormatException numberformatexception)
                {
                    return false;
                }
                if (j <= i && k >= i)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isAppBuildMatch()
    {
        String as[];
        if (!TextUtils.isEmpty(allVersion))
        {
            if ((as = allVersion.split(",")) != null && as.length >= 3)
            {
                int i;
                int j;
                try
                {
                    i = Integer.valueOf("3742").intValue();
                    j = Integer.valueOf(as[1]).intValue();
                }
                catch (Exception exception)
                {
                    return false;
                }
                if (j <= i)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isAppVersionMatch()
    {
        String as[];
        if (!TextUtils.isEmpty(allVersion))
        {
            if ((as = allVersion.split(",")) != null && as.length >= 3 && "1.0.8".equals(as[0]))
            {
                return true;
            }
        }
        return false;
    }

    public String toString()
    {
        return String.format("%s %s %s %s %s %s", new Object[] {
            locale, allVersion, Integer.valueOf(pkgVersion), url, Integer.valueOf(state), Boolean.valueOf(cfgMatched)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(locale);
        parcel.writeString(md5);
        parcel.writeLong(size);
        parcel.writeString(url);
        parcel.writeString(translator);
        parcel.writeInt(state);
        parcel.writeBooleanArray(new boolean[] {
            buildin, cfgMatched, support
        });
        parcel.writeString(path);
        parcel.writeString(allVersion);
        parcel.writeString(pkg);
        parcel.writeInt(pkgVersion);
        parcel.writeString(name);
    }

}
