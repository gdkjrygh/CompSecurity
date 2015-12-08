// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.common.images:
//            b

public final class WebImage
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    private final int BR;
    private final Uri KQ;
    private final int lf;
    private final int lg;

    WebImage(int i, Uri uri, int j, int k)
    {
        BR = i;
        KQ = uri;
        lf = j;
        lg = k;
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

    public JSONObject bK()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("url", KQ.toString());
            jsonobject.put("width", lf);
            jsonobject.put("height", lg);
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
            if (!n.equal(KQ, ((WebImage) (obj)).KQ) || lf != ((WebImage) (obj)).lf || lg != ((WebImage) (obj)).lg)
            {
                return false;
            }
        }
        return true;
    }

    public int getHeight()
    {
        return lg;
    }

    public Uri getUrl()
    {
        return KQ;
    }

    int getVersionCode()
    {
        return BR;
    }

    public int getWidth()
    {
        return lf;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            KQ, Integer.valueOf(lf), Integer.valueOf(lg)
        });
    }

    public String toString()
    {
        return String.format("Image %dx%d %s", new Object[] {
            Integer.valueOf(lf), Integer.valueOf(lg), KQ.toString()
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel, i);
    }

}
