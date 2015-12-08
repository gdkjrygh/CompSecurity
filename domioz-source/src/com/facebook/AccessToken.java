// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.internal.aw;
import com.facebook.internal.bc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            g, a, d, al, 
//            q, l, am

public final class AccessToken
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    private static final Date a;
    private static final Date b;
    private static final Date c = new Date();
    private static final g d;
    private final Date e;
    private final Set f;
    private final Set g;
    private final String h;
    private final g i;
    private final Date j;
    private final String k;
    private final String l;

    AccessToken(Parcel parcel)
    {
        e = new Date(parcel.readLong());
        ArrayList arraylist = new ArrayList();
        parcel.readStringList(arraylist);
        f = Collections.unmodifiableSet(new HashSet(arraylist));
        arraylist.clear();
        parcel.readStringList(arraylist);
        g = Collections.unmodifiableSet(new HashSet(arraylist));
        h = parcel.readString();
        i = com.facebook.g.valueOf(parcel.readString());
        j = new Date(parcel.readLong());
        k = parcel.readString();
        l = parcel.readString();
    }

    public AccessToken(String s, String s1, String s2, Collection collection, Collection collection1, g g1, Date date, 
            Date date1)
    {
        bc.a(s, "accessToken");
        bc.a(s1, "applicationId");
        bc.a(s2, "userId");
        if (date == null)
        {
            date = b;
        }
        e = date;
        if (collection != null)
        {
            collection = new HashSet(collection);
        } else
        {
            collection = new HashSet();
        }
        f = Collections.unmodifiableSet(collection);
        if (collection1 != null)
        {
            collection = new HashSet(collection1);
        } else
        {
            collection = new HashSet();
        }
        g = Collections.unmodifiableSet(collection);
        h = s;
        if (g1 == null)
        {
            g1 = d;
        }
        i = g1;
        if (date1 == null)
        {
            date1 = c;
        }
        j = date1;
        k = s1;
        l = s2;
    }

    public static AccessToken a()
    {
        return com.facebook.d.a().b();
    }

    static AccessToken a(Bundle bundle)
    {
        List list = a(bundle, "com.facebook.TokenCachingStrategy.Permissions");
        List list1 = a(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
        String s1 = al.d(bundle);
        String s = s1;
        if (aw.a(s1))
        {
            s = q.h();
        }
        s1 = al.b(bundle);
        Object obj = aw.e(s1);
        try
        {
            obj = ((JSONObject) (obj)).getString("id");
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            return null;
        }
        return new AccessToken(s1, s, ((String) (obj)), list, list1, al.c(bundle), al.a(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate"), al.a(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate"));
    }

    static AccessToken a(AccessToken accesstoken, Bundle bundle)
    {
        if (accesstoken.i != g.b && accesstoken.i != g.c && accesstoken.i != g.d)
        {
            throw new l((new StringBuilder("Invalid token source: ")).append(accesstoken.i).toString());
        }
        Date date = aw.a(bundle, "expires_in", new Date(0L));
        bundle = bundle.getString("access_token");
        if (aw.a(bundle))
        {
            return null;
        } else
        {
            return new AccessToken(bundle, accesstoken.k, accesstoken.l, accesstoken.f, accesstoken.g, accesstoken.i, date, new Date());
        }
    }

    static AccessToken a(JSONObject jsonobject)
    {
        if (jsonobject.getInt("version") > 1)
        {
            throw new l("Unknown AccessToken serialization format.");
        } else
        {
            String s = jsonobject.getString("token");
            Date date = new Date(jsonobject.getLong("expires_at"));
            JSONArray jsonarray = jsonobject.getJSONArray("permissions");
            JSONArray jsonarray1 = jsonobject.getJSONArray("declined_permissions");
            Date date1 = new Date(jsonobject.getLong("last_refresh"));
            g g1 = com.facebook.g.valueOf(jsonobject.getString("source"));
            return new AccessToken(s, jsonobject.getString("application_id"), jsonobject.getString("user_id"), aw.a(jsonarray), aw.a(jsonarray1), g1, date, date1);
        }
    }

    private static List a(Bundle bundle, String s)
    {
        bundle = bundle.getStringArrayList(s);
        if (bundle == null)
        {
            return Collections.emptyList();
        } else
        {
            return Collections.unmodifiableList(new ArrayList(bundle));
        }
    }

    public static void a(AccessToken accesstoken)
    {
        com.facebook.d.a().a(accesstoken);
    }

    public final String b()
    {
        return h;
    }

    public final Set c()
    {
        return f;
    }

    public final g d()
    {
        return i;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final Date e()
    {
        return j;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof AccessToken))
            {
                return false;
            }
            obj = (AccessToken)obj;
            if (!e.equals(((AccessToken) (obj)).e) || !f.equals(((AccessToken) (obj)).f) || !g.equals(((AccessToken) (obj)).g) || !h.equals(((AccessToken) (obj)).h) || i != ((AccessToken) (obj)).i || !j.equals(((AccessToken) (obj)).j) || (k != null ? !k.equals(((AccessToken) (obj)).k) : ((AccessToken) (obj)).k != null) || !l.equals(((AccessToken) (obj)).l))
            {
                return false;
            }
        }
        return true;
    }

    public final String f()
    {
        return k;
    }

    public final String g()
    {
        return l;
    }

    final JSONObject h()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("version", 1);
        jsonobject.put("token", h);
        jsonobject.put("expires_at", e.getTime());
        jsonobject.put("permissions", new JSONArray(f));
        jsonobject.put("declined_permissions", new JSONArray(g));
        jsonobject.put("last_refresh", j.getTime());
        jsonobject.put("source", i.name());
        jsonobject.put("application_id", k);
        jsonobject.put("user_id", l);
        return jsonobject;
    }

    public final int hashCode()
    {
        int j1 = e.hashCode();
        int k1 = f.hashCode();
        int l1 = g.hashCode();
        int i2 = h.hashCode();
        int j2 = i.hashCode();
        int k2 = j.hashCode();
        int i1;
        if (k == null)
        {
            i1 = 0;
        } else
        {
            i1 = k.hashCode();
        }
        return (i1 + ((((((j1 + 527) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31) * 31 + l.hashCode();
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("{AccessToken");
        StringBuilder stringbuilder1 = stringbuilder.append(" token:");
        String s;
        if (h == null)
        {
            s = "null";
        } else
        if (q.a(am.b))
        {
            s = h;
        } else
        {
            s = "ACCESS_TOKEN_REMOVED";
        }
        stringbuilder1.append(s);
        stringbuilder.append(" permissions:");
        if (f == null)
        {
            stringbuilder.append("null");
        } else
        {
            stringbuilder.append("[");
            stringbuilder.append(TextUtils.join(", ", f));
            stringbuilder.append("]");
        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeLong(e.getTime());
        parcel.writeStringList(new ArrayList(f));
        parcel.writeStringList(new ArrayList(g));
        parcel.writeString(h);
        parcel.writeString(i.name());
        parcel.writeLong(j.getTime());
        parcel.writeString(k);
        parcel.writeString(l);
    }

    static 
    {
        Date date = new Date(0x7fffffffffffffffL);
        a = date;
        b = date;
        d = g.b;
    }
}
