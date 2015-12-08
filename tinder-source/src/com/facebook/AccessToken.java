// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.internal.m;
import com.facebook.internal.n;
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
//            AccessTokenSource, b, k, g, 
//            FacebookException, LoggingBehavior

public final class AccessToken
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new AccessToken(parcel);
        }

        public final volatile Object[] newArray(int i1)
        {
            return new AccessToken[i1];
        }

    };
    private static final Date i;
    private static final Date j;
    private static final Date k = new Date();
    private static final AccessTokenSource l;
    final Date a;
    public final Set b;
    public final Set c;
    public final String d;
    final AccessTokenSource e;
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
        e = AccessTokenSource.valueOf(parcel.readString());
        f = new Date(parcel.readLong());
        g = parcel.readString();
        h = parcel.readString();
    }

    public AccessToken(String s, String s1, String s2, Collection collection, Collection collection1, AccessTokenSource accesstokensource, Date date, 
            Date date1)
    {
        n.a(s, "accessToken");
        n.a(s1, "applicationId");
        n.a(s2, "userId");
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
        d = s;
        if (accesstokensource == null)
        {
            accesstokensource = l;
        }
        e = accesstokensource;
        if (date1 == null)
        {
            date1 = k;
        }
        f = date1;
        g = s1;
        h = s2;
    }

    public static AccessToken a()
    {
        return com.facebook.b.a().a;
    }

    static AccessToken a(Bundle bundle)
    {
        List list = a(bundle, "com.facebook.TokenCachingStrategy.Permissions");
        List list1 = a(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
        String s1 = com.facebook.k.d(bundle);
        String s = s1;
        if (m.a(s1))
        {
            s = com.facebook.g.j();
        }
        s1 = com.facebook.k.b(bundle);
        Object obj = m.d(s1);
        try
        {
            obj = ((JSONObject) (obj)).getString("id");
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            return null;
        }
        return new AccessToken(s1, s, ((String) (obj)), list, list1, com.facebook.k.c(bundle), com.facebook.k.a(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate"), com.facebook.k.a(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate"));
    }

    static AccessToken a(JSONObject jsonobject)
        throws JSONException
    {
        if (jsonobject.getInt("version") > 1)
        {
            throw new FacebookException("Unknown AccessToken serialization format.");
        } else
        {
            String s = jsonobject.getString("token");
            Date date = new Date(jsonobject.getLong("expires_at"));
            org.json.JSONArray jsonarray = jsonobject.getJSONArray("permissions");
            org.json.JSONArray jsonarray1 = jsonobject.getJSONArray("declined_permissions");
            Date date1 = new Date(jsonobject.getLong("last_refresh"));
            AccessTokenSource accesstokensource = AccessTokenSource.valueOf(jsonobject.getString("source"));
            return new AccessToken(s, jsonobject.getString("application_id"), jsonobject.getString("user_id"), m.a(jsonarray), m.a(jsonarray1), accesstokensource, date, date1);
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
        com.facebook.b.a().a(accesstoken, true);
    }

    public static void b()
    {
        com.facebook.b.a().c();
    }

    public final boolean c()
    {
        return (new Date()).after(a);
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
        String s;
        if (d == null)
        {
            s = "null";
        } else
        if (com.facebook.g.a(LoggingBehavior.b))
        {
            s = d;
        } else
        {
            s = "ACCESS_TOKEN_REMOVED";
        }
        stringbuilder1.append(s);
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
        l = AccessTokenSource.b;
    }
}
