// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fo;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.common.images:
//            b

public final class WebImage
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    private final Uri Cu;
    private final int kr;
    private final int ks;
    private final int xH;

    WebImage(int i, Uri uri, int j, int k)
    {
        xH = i;
        Cu = uri;
        kr = j;
        ks = k;
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

    public JSONObject dB()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("url", Cu.toString());
            jsonobject.put("width", kr);
            jsonobject.put("height", ks);
        }
        catch (JSONException jsonexception)
        {
            return jsonobject;
        }
        return jsonobject;
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
            if (!fo.equal(Cu, ((WebImage) (obj)).Cu) || kr != ((WebImage) (obj)).kr || ks != ((WebImage) (obj)).ks)
            {
                return false;
            }
        }
        return true;
    }

    public int getHeight()
    {
        return ks;
    }

    public Uri getUrl()
    {
        return Cu;
    }

    int getVersionCode()
    {
        return xH;
    }

    public int getWidth()
    {
        return kr;
    }

    public int hashCode()
    {
        return fo.hashCode(new Object[] {
            Cu, Integer.valueOf(kr), Integer.valueOf(ks)
        });
    }

    public String toString()
    {
        return String.format("Image %dx%d %s", new Object[] {
            Integer.valueOf(kr), Integer.valueOf(ks), Cu.toString()
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel, i);
    }

}
