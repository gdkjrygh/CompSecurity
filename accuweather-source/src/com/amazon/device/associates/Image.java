// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.amazon.device.associates:
//            bv

public class Image
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new bv();
    final String a;
    final int b;
    final int c;

    private Image(Parcel parcel)
    {
        b = parcel.readInt();
        c = parcel.readInt();
        a = parcel.readString();
    }

    Image(Parcel parcel, bv bv1)
    {
        this(parcel);
    }

    Image(String s, int i, int j)
    {
        a = s;
        b = i;
        c = j;
    }

    JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("url", a);
            jsonobject.put("width", b);
            jsonobject.put("height", c);
        }
        catch (JSONException jsonexception)
        {
            return jsonobject;
        }
        return jsonobject;
    }

    public int describeContents()
    {
        return hashCode();
    }

    public int getHeight()
    {
        return c;
    }

    public String getUrl()
    {
        return a;
    }

    public int getWidth()
    {
        return b;
    }

    public String toString()
    {
        String s;
        try
        {
            s = a().toString(4);
        }
        catch (JSONException jsonexception)
        {
            return null;
        }
        return s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeIntArray(new int[] {
            b, c
        });
        parcel.writeString(a);
    }


    // Unreferenced inner class com/amazon/device/associates/bv
    static final class bv
        implements android.os.Parcelable.Creator
    {

        public Image a(Parcel parcel)
        {
            return new Image(parcel, null);
        }

        public Image[] a(int i)
        {
            return new Image[i];
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public volatile Object[] newArray(int i)
        {
            return a(i);
        }

            bv()
            {
            }
    }

}
