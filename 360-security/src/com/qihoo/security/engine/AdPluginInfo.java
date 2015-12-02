// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine;

import android.os.Parcel;
import android.os.Parcelable;

public class AdPluginInfo
    implements Parcelable
{
    public static class AdPlugin
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public AdPlugin a(Parcel parcel)
            {
                return new AdPlugin(parcel);
            }

            public AdPlugin[] a(int i)
            {
                return new AdPlugin[i];
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
        public String description;
        public String hostNameList;
        public int id;
        public int level;
        public String name;
        public int risk;
        public int suggestOption;
        public int type;
        public int version;
        public String viewClassName;

        public int describeContents()
        {
            return 0;
        }

        public String toString()
        {
            return (new StringBuilder(String.valueOf(name))).append("|").append(id).append("|").append(type).append("|").append(risk).append("|").append(version).append("|").append(level).append("|").append(description).toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(name);
            parcel.writeInt(id);
            parcel.writeInt(type);
            parcel.writeInt(risk);
            parcel.writeInt(version);
            parcel.writeInt(level);
            parcel.writeString(description);
        }


        public AdPlugin()
        {
            name = null;
            description = null;
            id = -1;
            type = 0;
            risk = 0;
            version = 0;
            level = 0;
            viewClassName = null;
            hostNameList = null;
            suggestOption = 0;
        }

        AdPlugin(Parcel parcel)
        {
            name = parcel.readString();
            id = parcel.readInt();
            type = parcel.readInt();
            risk = parcel.readInt();
            version = parcel.readInt();
            level = parcel.readInt();
            description = parcel.readString();
        }
    }


    public static final int COPYRIGHT_ILLEGAL = 2;
    public static final int COPYRIGHT_OFFCIAL = 1;
    public static final int COPYRIGHT_UNKNOWN = 0;
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public AdPluginInfo a(Parcel parcel)
        {
            return new AdPluginInfo(parcel);
        }

        public AdPluginInfo[] a(int i)
        {
            return new AdPluginInfo[i];
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
    public static final int SIGNVALUE_COMMONPLUGIN = 0;
    public static final int SIGNVALUE_DANGERPLUGIN = 1;
    public int AdAllRisk;
    public int AdAllType;
    public AdPlugin AdPlugins[];
    public int AdSignValue;
    public int CopyRightFlags;

    public AdPluginInfo()
    {
        AdAllRisk = 0;
        AdAllType = 0;
        AdSignValue = 0;
        CopyRightFlags = 0;
        AdPlugins = null;
    }

    AdPluginInfo(Parcel parcel)
    {
        AdAllType = parcel.readInt();
        AdAllRisk = parcel.readInt();
        AdSignValue = parcel.readInt();
        CopyRightFlags = parcel.readInt();
        if (parcel.readInt() > 0)
        {
            AdPlugins = (AdPlugin[])parcel.createTypedArray(AdPlugin.CREATOR);
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(AdAllType);
        parcel.writeInt(AdAllRisk);
        parcel.writeInt(AdSignValue);
        parcel.writeInt(CopyRightFlags);
        if (AdPlugins != null)
        {
            parcel.writeInt(AdPlugins.length);
            parcel.writeTypedArray(AdPlugins, 1);
            return;
        } else
        {
            parcel.writeInt(0);
            return;
        }
    }

}
