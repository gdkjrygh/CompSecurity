// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.momentsstart.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.JacksonModel;
import cty;
import ctz;
import dmx;
import gdf;
import java.util.Arrays;

public class MomentContext
    implements Parcelable, JacksonModel, dmx
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new MomentContext(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new MomentContext[i];
        }

    };
    private static final gdf TYPE_PARSER = gdf.a(com/spotify/mobile/android/spotlets/momentsstart/model/MomentContext$Type);
    public final String contextUrl;
    public final String description;
    public final String imageUri;
    public final String name;
    public final String tagline;
    public final Type type;
    public final String uri;

    protected MomentContext(Parcel parcel)
    {
        description = parcel.readString();
        imageUri = parcel.readString();
        name = parcel.readString();
        tagline = parcel.readString();
        type = Type.values()[parcel.readInt()];
        contextUrl = parcel.readString();
        uri = parcel.readString();
    }

    public MomentContext(String s, String s1, String s2, String s3, String s4, String s5, String s6)
    {
        description = s;
        imageUri = (String)ctz.a(s1);
        name = (String)ctz.a(s2);
        tagline = s3;
        type = (Type)TYPE_PARSER.a(s4).a(Type.d);
        contextUrl = s5;
        uri = (String)ctz.a(s6);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof MomentContext)
            {
                if (!cty.a(description, ((MomentContext) (obj = (MomentContext)obj)).description) || !cty.a(imageUri, ((MomentContext) (obj)).imageUri) || !cty.a(name, ((MomentContext) (obj)).name) || !cty.a(tagline, ((MomentContext) (obj)).tagline) || !cty.a(contextUrl, ((MomentContext) (obj)).contextUrl) || !cty.a(uri, ((MomentContext) (obj)).uri))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            description, imageUri, name, tagline, type, contextUrl, uri
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(description);
        parcel.writeString(imageUri);
        parcel.writeString(name);
        parcel.writeString(tagline);
        parcel.writeInt(type.ordinal());
        parcel.writeString(contextUrl);
        parcel.writeString(uri);
    }


    private class Type extends Enum
    {

        public static final Type a;
        public static final Type b;
        public static final Type c;
        public static final Type d;
        public static final Type e;
        private static final Type f[];

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/spotify/mobile/android/spotlets/momentsstart/model/MomentContext$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])f.clone();
        }

        static 
        {
            a = new Type("AUDIO", 0);
            b = new Type("RADIO", 1);
            c = new Type("VIDEO", 2);
            d = new Type("UNKNOWN", 3);
            e = new Type("INTRO", 4);
            f = (new Type[] {
                a, b, c, d, e
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }

}
