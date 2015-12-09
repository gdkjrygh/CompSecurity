// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.pm.PackageInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientInfo;
import java.util.Locale;

public final class ffv
{

    public final String a;
    public final com.spotify.mobile.android.spotlets.search.loader.SearchLoader.SearchType b;
    public final boolean c;
    public int d;
    public Request e;
    public Long f;
    public epo g;
    private int h;
    private final int i;
    private final int j;
    private final boolean k;
    private final boolean l;
    private final String m;
    private final int n;
    private Request o;
    private Integer p;

    ffv(String s, com.spotify.mobile.android.spotlets.search.loader.SearchLoader.SearchType searchtype, int i1, int j1, int k1, boolean flag, boolean flag1, 
            boolean flag2, String s1, int l1)
    {
        b = searchtype;
        i = i1;
        j = j1;
        searchtype = s;
        if (TextUtils.isEmpty(s))
        {
            searchtype = null;
        }
        a = searchtype;
        h = k1;
        k = flag;
        l = flag1;
        if (flag2 && !a(b))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        m = s1;
        n = l1;
    }

    public static boolean a(com.spotify.mobile.android.spotlets.search.loader.SearchLoader.SearchType searchtype)
    {
        return searchtype == null || searchtype == com.spotify.mobile.android.spotlets.search.loader.SearchLoader.SearchType.b;
    }

    public final void a()
    {
        ctz.a(((epo)ctz.a(g)).d(), "Invalid session!");
    }

    public final Request b()
    {
        boolean flag2 = true;
        a();
        boolean flag;
        if (!c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.b(flag, "Cannot create online request if offline!");
        if (o != null)
        {
            return o;
        }
        Object obj;
        if (a(b))
        {
            obj = a;
        } else
        {
            android.net.Uri.Builder builder = (new android.net.Uri.Builder()).scheme("hm").authority("searchview").path("/android/v3/search").appendPath(a).appendQueryParameter("username", g.a()).appendQueryParameter("country", g.c()).appendQueryParameter("catalogue", g.b()).appendQueryParameter("locale", String.valueOf(Locale.getDefault())).appendQueryParameter("limit", String.valueOf(h)).appendQueryParameter("search-image-size", String.valueOf(i)).appendQueryParameter("search-image-size-cards", String.valueOf(j));
            boolean flag1;
            if (k)
            {
                obj = "onDemand";
            } else
            {
                obj = "";
            }
            obj = builder.appendQueryParameter("echo", ((String) (obj))).appendQueryParameter("radio", String.valueOf(l));
            if (!k)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            obj = ((android.net.Uri.Builder) (obj)).appendQueryParameter("mft", String.valueOf(flag1)).appendQueryParameter("searchIntentID", m).appendQueryParameter("sequenceNumber", String.valueOf(n)).appendQueryParameter("entityVersion", String.valueOf(d)).appendQueryParameter("clientVersion", ((ClientInfo)dmz.a(com/spotify/mobile/android/util/ClientInfo)).a.versionName).toString();
        }
        obj = RequestBuilder.get(((String) (obj))).with("country", g.c()).with("catalogue", g.b()).with("username", g.a()).setHermesCacheIdentifier(g.a()).build();
        o = ((Request) (obj));
        return ((Request) (obj));
    }

    public final long c()
    {
        if (f != null)
        {
            return SystemClock.uptimeMillis() - f.longValue();
        } else
        {
            Assertion.b((new StringBuilder("Request ")).append(this).append(" was not started").toString());
            return 0L;
        }
    }

    public final boolean equals(Object obj)
    {
        return this == obj || (obj instanceof ffv) && hashCode() == obj.hashCode();
    }

    public final int hashCode()
    {
        if (p != null) goto _L2; else goto _L1
_L1:
        if (a != null) goto _L4; else goto _L3
_L3:
        p = Integer.valueOf(0);
_L2:
        return p.intValue();
_L4:
        p = Integer.valueOf((new StringBuilder()).append(a).append(b).append(i).append(h).append(k).append(l).toString().hashCode());
        if (c)
        {
            p = Integer.valueOf(~p.intValue());
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public final String toString()
    {
        hashCode();
        return "";
    }
}
