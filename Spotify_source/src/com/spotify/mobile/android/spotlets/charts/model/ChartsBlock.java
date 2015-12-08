// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.charts.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.JacksonModel;
import dmz;
import gdf;
import gdw;
import gng;
import gni;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ChartsBlock
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            Type type1 = Type.values()[parcel.readInt()];
            String s = parcel.readString();
            ArrayList arraylist = new ArrayList();
            parcel.readList(arraylist, com/spotify/mobile/android/spotlets/charts/model/ChartsBlock.getClassLoader());
            return new ChartsBlock(type1.name(), s, arraylist);
        }

        public final volatile Object[] newArray(int i)
        {
            return new ChartsBlock[i];
        }

    };
    private static final gdf TYPE_PARSER = gdf.a(com/spotify/mobile/android/spotlets/charts/model/ChartsBlock$Type);
    public final List items;
    private ObjectMapper mObjectMapper;
    public final String name;
    public final Type type;

    public ChartsBlock(String s, String s1, List list)
    {
        mObjectMapper = ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
        type = (Type)TYPE_PARSER.a(s).a(Type.a);
        name = s1;
        items = gdw.a(list);
    }

    public ChartsBlock(Map map)
    {
        Object obj;
        Object obj1;
        mObjectMapper = ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
        obj = (String)map.get("type");
        name = (String)map.get("name");
        type = (Type)TYPE_PARSER.a(((String) (obj))).a(Type.a);
        obj = ImmutableList.d();
        obj1 = map.get("items");
        map = ((Map) (obj));
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        final class _cls4
        {

            static final int a[];

            static 
            {
                a = new int[Type.values().length];
                try
                {
                    a[Type.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[Type.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls4.a[type.ordinal()];
        JVM INSTR tableswitch 1 2: default 132
    //                   1 140
    //                   2 162;
           goto _L3 _L4 _L5
_L3:
        map = ((Map) (obj));
_L2:
        items = map;
        return;
_L4:
        map = (List)mObjectMapper.convertValue(obj1, new TypeReference() {

        });
        continue; /* Loop/switch isn't completed */
_L5:
        map = (List)mObjectMapper.convertValue(obj1, new TypeReference() {

        });
        if (true) goto _L2; else goto _L6
_L6:
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(type.ordinal());
        parcel.writeString(name);
        parcel.writeList(items);
    }


    private class Type extends Enum
    {

        public static final Type a;
        public static final Type b;
        private static final Type c[];

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/spotify/mobile/android/spotlets/charts/model/ChartsBlock$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])c.clone();
        }

        static 
        {
            a = new Type("STATIC", 0);
            b = new Type("DRILLDOWN", 1);
            c = (new Type[] {
                a, b
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }

}
