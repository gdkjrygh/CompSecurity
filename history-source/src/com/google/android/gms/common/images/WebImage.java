// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.common.images:
//            b

public final class WebImage
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    private final int CK;
    private final Uri LU;
    private final int li;
    private final int lj;

    WebImage(int i, Uri uri, int j, int k)
    {
        CK = i;
        LU = uri;
        li = j;
        lj = k;
    }

    public WebImage(Uri uri)
        throws IllegalArgumentException
    {
        this(uri, 0, 0);
    }

    public WebImage(Uri uri, int i, int j)
        throws IllegalArgumentException
    {
        this(1, uri, i, j);
        if (uri == null)
        {
            throw new IllegalArgumentException("url cannot be null");
        }
        if (i < 0 || j < 0)
        {
            throw new IllegalArgumentException("width and height must not be negative");
        } else
        {
            return;
        }
    }

    public WebImage(JSONObject jsonobject)
        throws IllegalArgumentException
    {
        this(d(jsonobject), jsonobject.optInt("width", 0), jsonobject.optInt("height", 0));
    }

    private static Uri d(JSONObject jsonobject)
    {
        Uri uri = null;
        if (jsonobject.has("url"))
        {
            try
            {
                uri = Uri.parse(jsonobject.getString("url"));
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                return null;
            }
        }
        return uri;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || !(obj instanceof WebImage))
            {
                return false;
            }
            obj = (WebImage)obj;
            if (!jv.equal(LU, ((WebImage) (obj)).LU) || li != ((WebImage) (obj)).li || lj != ((WebImage) (obj)).lj)
            {
                return false;
            }
        }
        return true;
    }

    public int getHeight()
    {
        return lj;
    }

    public Uri getUrl()
    {
        return LU;
    }

    int getVersionCode()
    {
        return CK;
    }

    public int getWidth()
    {
        return li;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            LU, Integer.valueOf(li), Integer.valueOf(lj)
        });
    }

    public JSONObject toJson()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("url", LU.toString());
            jsonobject.put("width", li);
            jsonobject.put("height", lj);
        }
        catch (JSONException jsonexception)
        {
            return jsonobject;
        }
        return jsonobject;
    }

    public String toString()
    {
        return String.format("Image %dx%d %s", new Object[] {
            Integer.valueOf(li), Integer.valueOf(lj), LU.toString()
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel, i);
    }

}
