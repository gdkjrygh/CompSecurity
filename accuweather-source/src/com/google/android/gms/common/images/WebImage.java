// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.hl;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.common.images:
//            b

public final class WebImage
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    private final Uri Fr;
    private final int ks;
    private final int kt;
    private final int xJ;

    WebImage(int i, Uri uri, int j, int k)
    {
        xJ = i;
        Fr = uri;
        ks = j;
        kt = k;
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
        this(c(jsonobject), jsonobject.optInt("width", 0), jsonobject.optInt("height", 0));
    }

    private static Uri c(JSONObject jsonobject)
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

    public JSONObject dU()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("url", Fr.toString());
            jsonobject.put("width", ks);
            jsonobject.put("height", kt);
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
            if (!hl.equal(Fr, ((WebImage) (obj)).Fr) || ks != ((WebImage) (obj)).ks || kt != ((WebImage) (obj)).kt)
            {
                return false;
            }
        }
        return true;
    }

    public int getHeight()
    {
        return kt;
    }

    public Uri getUrl()
    {
        return Fr;
    }

    int getVersionCode()
    {
        return xJ;
    }

    public int getWidth()
    {
        return ks;
    }

    public int hashCode()
    {
        return hl.hashCode(new Object[] {
            Fr, Integer.valueOf(ks), Integer.valueOf(kt)
        });
    }

    public String toString()
    {
        return String.format("Image %dx%d %s", new Object[] {
            Integer.valueOf(ks), Integer.valueOf(kt), Fr.toString()
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel, i);
    }

}
