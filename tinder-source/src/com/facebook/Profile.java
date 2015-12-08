// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.m;
import com.facebook.internal.n;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            m, AccessToken, FacebookException

public final class Profile
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new Profile(parcel, (byte)0);
        }

        public final volatile Object[] newArray(int i)
        {
            return new Profile[i];
        }

    };
    public final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final Uri f;

    private Profile(Parcel parcel)
    {
        b = parcel.readString();
        c = parcel.readString();
        d = parcel.readString();
        e = parcel.readString();
        a = parcel.readString();
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
        n.a(s, "id");
        b = s;
        c = s1;
        d = s2;
        e = s3;
        a = s4;
        f = uri;
    }

    Profile(JSONObject jsonobject)
    {
        Object obj = null;
        super();
        b = jsonobject.optString("id", null);
        c = jsonobject.optString("first_name", null);
        d = jsonobject.optString("middle_name", null);
        e = jsonobject.optString("last_name", null);
        a = jsonobject.optString("name", null);
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
        return m.a().b;
    }

    public static void a(Profile profile)
    {
        m.a().a(profile, true);
    }

    public static void b()
    {
        AccessToken accesstoken = AccessToken.a();
        if (accesstoken == null)
        {
            a(null);
            return;
        } else
        {
            m.a(accesstoken.d, new com.facebook.internal.m.c() {

                public final void a(FacebookException facebookexception)
                {
                }

                public final void a(JSONObject jsonobject)
                {
                    String s = jsonobject.optString("id");
                    if (s == null)
                    {
                        return;
                    }
                    String s5 = jsonobject.optString("link");
                    String s1 = jsonobject.optString("first_name");
                    String s2 = jsonobject.optString("middle_name");
                    String s3 = jsonobject.optString("last_name");
                    String s4 = jsonobject.optString("name");
                    if (s5 != null)
                    {
                        jsonobject = Uri.parse(s5);
                    } else
                    {
                        jsonobject = null;
                    }
                    Profile.a(new Profile(s, s1, s2, s3, s4, jsonobject));
                }

            });
            return;
        }
    }

    final JSONObject c()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("id", b);
            jsonobject.put("first_name", c);
            jsonobject.put("middle_name", d);
            jsonobject.put("last_name", e);
            jsonobject.put("name", a);
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
        if (!b.equals(((Profile) (obj)).b) || c != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((Profile) (obj)).c != null)
        {
            return false;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!c.equals(((Profile) (obj)).c) || d != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((Profile) (obj)).d != null)
        {
            return false;
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (!d.equals(((Profile) (obj)).d) || e != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((Profile) (obj)).e != null)
        {
            return false;
        }
        if (true) goto _L1; else goto _L5
_L5:
        if (!e.equals(((Profile) (obj)).e) || a != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((Profile) (obj)).a != null)
        {
            return false;
        }
        if (true) goto _L1; else goto _L6
_L6:
        if (a.equals(((Profile) (obj)).a) && f == null)
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
        int j = b.hashCode() + 527;
        int i = j;
        if (c != null)
        {
            i = j * 31 + c.hashCode();
        }
        j = i;
        if (d != null)
        {
            j = i * 31 + d.hashCode();
        }
        i = j;
        if (e != null)
        {
            i = j * 31 + e.hashCode();
        }
        j = i;
        if (a != null)
        {
            j = i * 31 + a.hashCode();
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
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeString(e);
        parcel.writeString(a);
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
