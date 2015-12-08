// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.aw;
import com.facebook.internal.bc;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            ao, aq, AccessToken, an

public final class Profile
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ao();
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final Uri f;

    private Profile(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
        d = parcel.readString();
        e = parcel.readString();
        parcel = parcel.readString();
        if (parcel == null)
        {
            parcel = null;
        } else
        {
            parcel = Uri.parse(parcel);
        }
        f = parcel;
    }

    Profile(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public Profile(String s, String s1, String s2, String s3, String s4, Uri uri)
    {
        bc.a(s, "id");
        a = s;
        b = s1;
        c = s2;
        d = s3;
        e = s4;
        f = uri;
    }

    Profile(JSONObject jsonobject)
    {
        Object obj = null;
        super();
        a = jsonobject.optString("id", null);
        b = jsonobject.optString("first_name", null);
        c = jsonobject.optString("middle_name", null);
        d = jsonobject.optString("last_name", null);
        e = jsonobject.optString("name", null);
        jsonobject = jsonobject.optString("link_uri", null);
        if (jsonobject == null)
        {
            jsonobject = obj;
        } else
        {
            jsonobject = Uri.parse(jsonobject);
        }
        f = jsonobject;
    }

    public static Profile a()
    {
        return aq.a().b();
    }

    public static void a(Profile profile)
    {
        aq.a().a(profile);
    }

    public static void b()
    {
        AccessToken accesstoken = AccessToken.a();
        if (accesstoken == null)
        {
            aq.a().a(null);
            return;
        } else
        {
            aw.a(accesstoken.b(), new an());
            return;
        }
    }

    final JSONObject c()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("id", a);
            jsonobject.put("first_name", b);
            jsonobject.put("middle_name", c);
            jsonobject.put("last_name", d);
            jsonobject.put("name", e);
            if (f != null)
            {
                jsonobject.put("link_uri", f.toString());
            }
        }
        catch (JSONException jsonexception)
        {
            return null;
        }
        return jsonobject;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof Profile))
        {
            return false;
        }
        obj = (Profile)obj;
        if (!a.equals(((Profile) (obj)).a) || b != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((Profile) (obj)).b != null)
        {
            return false;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!b.equals(((Profile) (obj)).b) || c != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((Profile) (obj)).c != null)
        {
            return false;
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (!c.equals(((Profile) (obj)).c) || d != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((Profile) (obj)).d != null)
        {
            return false;
        }
        if (true) goto _L1; else goto _L5
_L5:
        if (!d.equals(((Profile) (obj)).d) || e != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((Profile) (obj)).e != null)
        {
            return false;
        }
        if (true) goto _L1; else goto _L6
_L6:
        if (e.equals(((Profile) (obj)).e) && f == null)
        {
            if (((Profile) (obj)).f != null)
            {
                return false;
            }
        } else
        {
            return f.equals(((Profile) (obj)).f);
        }
        if (true) goto _L1; else goto _L7
_L7:
    }

    public final int hashCode()
    {
        int j = a.hashCode() + 527;
        int i = j;
        if (b != null)
        {
            i = j * 31 + b.hashCode();
        }
        j = i;
        if (c != null)
        {
            j = i * 31 + c.hashCode();
        }
        i = j;
        if (d != null)
        {
            i = j * 31 + d.hashCode();
        }
        j = i;
        if (e != null)
        {
            j = i * 31 + e.hashCode();
        }
        i = j;
        if (f != null)
        {
            i = j * 31 + f.hashCode();
        }
        return i;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeString(e);
        String s;
        if (f == null)
        {
            s = null;
        } else
        {
            s = f.toString();
        }
        parcel.writeString(s);
    }

}
