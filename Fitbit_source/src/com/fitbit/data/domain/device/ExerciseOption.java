// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.device;

import android.os.Parcel;
import android.os.Parcelable;
import com.fitbit.d.b;
import org.json.JSONException;
import org.json.JSONObject;

public class ExerciseOption
    implements Parcelable, b
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public ExerciseOption a(Parcel parcel)
        {
            ExerciseOption exerciseoption = new ExerciseOption();
            ExerciseOption.a(exerciseoption, parcel.readString());
            com.fitbit.data.domain.device.ExerciseOption.b(exerciseoption, parcel.readString());
            return exerciseoption;
        }

        public ExerciseOption[] a(int i)
        {
            return new ExerciseOption[i];
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
    private String a;
    private String b;

    public ExerciseOption()
    {
    }

    public ExerciseOption(String s, String s1)
    {
        b = s1;
        a = s;
    }

    static String a(ExerciseOption exerciseoption, String s)
    {
        exerciseoption.a = s;
        return s;
    }

    static String b(ExerciseOption exerciseoption, String s)
    {
        exerciseoption.b = s;
        return s;
    }

    public String a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && obj.getClass().equals(com/fitbit/data/domain/device/ExerciseOption))
        {
            return a.equals(((ExerciseOption)obj).a);
        } else
        {
            return false;
        }
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        a = jsonobject.optString("id");
        b = jsonobject.optString("name");
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        throw new UnsupportedOperationException();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(super.toString());
        stringbuilder.append(" id: ").append(a());
        stringbuilder.append(" name: ").append(b());
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
    }

}
