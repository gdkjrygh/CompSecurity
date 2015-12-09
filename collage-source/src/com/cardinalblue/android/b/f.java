// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.b;

import android.os.Parcel;

public final class f
{
    public static class a
    {

        protected Class a;
        protected String b;

        public Enum a(Parcel parcel)
        {
            return ((Enum[])a.getEnumConstants())[parcel.readInt()];
        }

        public a(Class class1)
        {
            a = class1;
            b = class1.getName();
        }
    }

    public static class b extends a
    {

        private final Enum c;
        private final String d;

        public void b(Parcel parcel)
        {
            parcel.writeInt(c.ordinal());
        }

        public b(Enum enum)
        {
            super(enum.getClass());
            c = enum;
            d = enum.name();
        }
    }


    public f()
    {
    }

    public static a a(Class class1)
    {
        return new a(class1);
    }

    public static b a(Enum enum)
    {
        return new b(enum);
    }
}
