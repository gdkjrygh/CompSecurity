// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.internal.U;
import com.facebook.internal.Y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            h, a, c, F, 
//            s, p, G

public final class AccessToken
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    private static final Date i;
    private static final Date j;
    private static final Date k = new Date();
    private static final h l;
    final Date a;
    public final Set b;
    final Set c;
    public final String d;
    final h e;
    final Date f;
    public final String g;
    public final String h;

    AccessToken(Parcel parcel)
    {
        a = new Date(parcel.readLong());
        ArrayList arraylist = new ArrayList();
        parcel.readStringList(arraylist);
        b = Collections.unmodifiableSet(new HashSet(arraylist));
        arraylist.clear();
        parcel.readStringList(arraylist);
        c = Collections.unmodifiableSet(new HashSet(arraylist));
        d = parcel.readString();
        e = com.facebook.h.valueOf(parcel.readString());
        f = new Date(parcel.readLong());
        g = parcel.readString();
        h = parcel.readString();
    }

    public AccessToken(String s1, String s2, String s3, Collection collection, Collection collection1, h h1, Date date, 
            Date date1)
    {
        Y.a(s1, "accessToken");
        Y.a(s2, "applicationId");
        Y.a(s3, "userId");
        if (date == null)
        {
            date = j;
        }
        a = date;
        if (collection != null)
        {
            collection = new HashSet(collection);
        } else
        {
            collection = new HashSet();
        }
        b = Collections.unmodifiableSet(collection);
        if (collection1 != null)
        {
            collection = new HashSet(collection1);
        } else
        {
            collection = new HashSet();
        }
        c = Collections.unmodifiableSet(collection);
        d = s1;
        if (h1 == null)
        {
            h1 = l;
        }
        e = h1;
        if (date1 == null)
        {
            date1 = k;
        }
        f = date1;
        g = s2;
        h = s3;
    }

    public static AccessToken a()
    {
        return com.facebook.c.a().b;
    }

    static AccessToken a(Bundle bundle)
    {
        List list = a(bundle, "com.facebook.TokenCachingStrategy.Permissions");
        List list1 = a(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
        String s2 = F.d(bundle);
        String s1 = s2;
        if (U.a(s2))
        {
            s1 = s.h();
        }
        s2 = F.b(bundle);
        Object obj = U.f(s2);
        try
        {
            obj = ((JSONObject) (obj)).getString("id");
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            return null;
        }
        return new AccessToken(s2, s1, ((String) (obj)), list, list1, F.c(bundle), F.a(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate"), F.a(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate"));
    }

    static AccessToken a(JSONObject jsonobject)
        throws JSONException
    {
        if (jsonobject.getInt("version") > 1)
        {
            throw new p("Unknown AccessToken serialization format.");
        } else
        {
            String s1 = jsonobject.getString("token");
            Date date = new Date(jsonobject.getLong("expires_at"));
            org.json.JSONArray jsonarray = jsonobject.getJSONArray("permissions");
            org.json.JSONArray jsonarray1 = jsonobject.getJSONArray("declined_permissions");
            Date date1 = new Date(jsonobject.getLong("last_refresh"));
            h h1 = com.facebook.h.valueOf(jsonobject.getString("source"));
            return new AccessToken(s1, jsonobject.getString("application_id"), jsonobject.getString("user_id"), U.a(jsonarray), U.a(jsonarray1), h1, date, date1);
        }
    }

    private static List a(Bundle bundle, String s1)
    {
        bundle = bundle.getStringArrayList(s1);
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
        com.facebook.c.a().a(accesstoken, true);
    }

    public final int describeContents()
    {
        return 0;
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
            if (!a.equals(((AccessToken) (obj)).a) || !b.equals(((AccessToken) (obj)).b) || !c.equals(((AccessToken) (obj)).c) || !d.equals(((AccessToken) (obj)).d) || e != ((AccessToken) (obj)).e || !f.equals(((AccessToken) (obj)).f) || (g != null ? !g.equals(((AccessToken) (obj)).g) : ((AccessToken) (obj)).g != null) || !h.equals(((AccessToken) (obj)).h))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j1 = a.hashCode();
        int k1 = b.hashCode();
        int l1 = c.hashCode();
        int i2 = d.hashCode();
        int j2 = e.hashCode();
        int k2 = f.hashCode();
        int i1;
        if (g == null)
        {
            i1 = 0;
        } else
        {
            i1 = g.hashCode();
        }
        return (i1 + ((((((j1 + 527) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31) * 31 + h.hashCode();
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("{AccessToken");
        StringBuilder stringbuilder1 = stringbuilder.append(" token:");
        String s1;
        if (d == null)
        {
            s1 = "null";
        } else
        if (s.a(G.b))
        {
            s1 = d;
        } else
        {
            s1 = "ACCESS_TOKEN_REMOVED";
        }
        stringbuilder1.append(s1);
        stringbuilder.append(" permissions:");
        if (b == null)
        {
            stringbuilder.append("null");
        } else
        {
            stringbuilder.append("[");
            stringbuilder.append(TextUtils.join(", ", b));
            stringbuilder.append("]");
        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeLong(a.getTime());
        parcel.writeStringList(new ArrayList(b));
        parcel.writeStringList(new ArrayList(c));
        parcel.writeString(d);
        parcel.writeString(e.name());
        parcel.writeLong(f.getTime());
        parcel.writeString(g);
        parcel.writeString(h);
    }

    static 
    {
        Date date = new Date(0x7fffffffffffffffL);
        i = date;
        j = date;
        l = h.b;
    }
}
