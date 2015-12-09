// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import com.pandora.radio.util.i;
import org.json.JSONException;
import org.json.JSONObject;

public class StationRecommendation
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public StationRecommendation a(Parcel parcel)
        {
            return new StationRecommendation(parcel);
        }

        public StationRecommendation[] a(int i1)
        {
            return new StationRecommendation[i1];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i1)
        {
            return a(i1);
        }

    };
    protected String a;
    private final long b;
    private StationRecommendations.b c;
    private final String d;
    private final String e;
    private final String f;

    public StationRecommendation()
    {
        b = -1L;
        c = StationRecommendations.b.e;
        a = null;
        d = null;
        e = null;
        f = null;
    }

    public StationRecommendation(Cursor cursor)
    {
        b = cursor.getLong(0);
        c = StationRecommendations.b.valueOf(cursor.getString(1));
        a = cursor.getString(2);
        d = cursor.getString(3);
        e = cursor.getString(4);
        f = cursor.getString(5);
    }

    StationRecommendation(Parcel parcel)
    {
        b = parcel.readLong();
        try
        {
            c = StationRecommendations.b.valueOf(parcel.readString());
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            c = null;
        }
        a = parcel.readString();
        d = parcel.readString();
        e = parcel.readString();
        f = parcel.readString();
    }

    protected StationRecommendation(StationRecommendations.b b1, String s, String s1, String s2)
    {
        this(b1, s, s1, s2, null);
    }

    protected StationRecommendation(StationRecommendations.b b1, String s, String s1, String s2, String s3)
    {
        b = -1L;
        c = b1;
        a = s;
        d = s1;
        e = s2;
        f = s3;
    }

    public StationRecommendation(JSONObject jsonobject, StationRecommendations.b b1)
        throws JSONException
    {
        b = -1L;
        c = b1;
        a = jsonobject.optString("artistName");
        if (com.pandora.radio.util.i.a(a))
        {
            a = jsonobject.optString("stationName", "");
        }
        d = jsonobject.optString("artUrl");
        e = jsonobject.getString("musicToken");
        f = jsonobject.optString("explanation");
    }

    public String b()
    {
        if (com.pandora.radio.util.i.a(a))
        {
            return a;
        } else
        {
            return (new StringBuilder()).append(a).append(" Radio").toString();
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (!(obj instanceof StationRecommendation))
            {
                return false;
            }
            obj = (StationRecommendation)obj;
            if (e == null)
            {
                if (((StationRecommendation) (obj)).e != null)
                {
                    return false;
                }
            } else
            if (!e.equals(((StationRecommendation) (obj)).e))
            {
                return false;
            }
            if (a == null)
            {
                if (((StationRecommendation) (obj)).a != null)
                {
                    return false;
                }
            } else
            if (!a.equals(((StationRecommendation) (obj)).a))
            {
                return false;
            }
            if (c != ((StationRecommendation) (obj)).c)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int k1 = 0;
        int i1;
        int j1;
        if (e == null)
        {
            i1 = 0;
        } else
        {
            i1 = e.hashCode();
        }
        if (a == null)
        {
            j1 = 0;
        } else
        {
            j1 = a.hashCode();
        }
        if (c != null)
        {
            k1 = c.hashCode();
        }
        return (j1 + (i1 + 31) * 31) * 31 + k1;
    }

    public ContentValues i()
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("type", c.toString());
        contentvalues.put("name", a);
        contentvalues.put("stationArtUrl", d);
        contentvalues.put("musicToken", e);
        contentvalues.put("explanation", f);
        return contentvalues;
    }

    public StationRecommendations.b j()
    {
        return c;
    }

    protected void k()
    {
        if (c == StationRecommendations.b.b)
        {
            c = StationRecommendations.b.a;
        } else
        if (c == StationRecommendations.b.d)
        {
            c = StationRecommendations.b.c;
            return;
        }
    }

    public String l()
    {
        return a;
    }

    public String m()
    {
        return d;
    }

    public String n()
    {
        return e;
    }

    public String o()
    {
        return f;
    }

    public String toString()
    {
        return String.format("name = %s, type = %s, token = %s", new Object[] {
            a, c.toString(), e
        });
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeLong(b);
        String s;
        if (c == null)
        {
            s = "";
        } else
        {
            s = c.name();
        }
        parcel.writeString(s);
        parcel.writeString(a);
        parcel.writeString(d);
        parcel.writeString(e);
        parcel.writeString(f);
    }

}
