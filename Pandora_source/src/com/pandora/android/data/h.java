// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.data;

import android.app.Application;
import android.content.res.Resources;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.TokenCachingStrategy;
import com.facebook.model.GraphUser;
import com.pandora.android.util.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.json.JSONObject;
import p.bx.b;
import p.bx.d;
import p.df.a;

public class h extends TokenCachingStrategy
{

    private String a;
    private GraphUser b;
    private String c;
    private long d;
    private long e;
    private String f[];
    private String g[];
    private String h[];
    private String i[];
    private String j[];
    private String k[];
    private boolean l;

    public h(JSONObject jsonobject)
    {
        d = 0L;
        e = 0L;
        l = false;
        if (jsonobject == null)
        {
            return;
        } else
        {
            a(jsonobject);
            return;
        }
    }

    private static Date a(Bundle bundle, String s1)
    {
        long l1;
        if (bundle != null)
        {
            if ((l1 = bundle.getLong(s1, 0x8000000000000000L)) != 0x8000000000000000L)
            {
                return new Date(l1);
            }
        }
        return null;
    }

    private static List a(String as[])
    {
        if (as != null)
        {
            return Arrays.asList(as);
        } else
        {
            return Collections.emptyList();
        }
    }

    private static String[] a(List list)
    {
        if (list != null)
        {
            String as[] = new String[list.size()];
            for (int i1 = 0; i1 < as.length; i1++)
            {
                as[i1] = (String)list.get(i1);
            }

            return as;
        } else
        {
            return new String[0];
        }
    }

    public void a(GraphUser graphuser)
    {
        b = graphuser;
    }

    public void a(JSONObject jsonobject)
    {
        boolean flag = false;
        a = jsonobject.optString("facebookAppId", a);
        if (!jsonobject.has("facebookAccessToken"))
        {
            clear();
        } else
        {
            c = jsonobject.optString("facebookAccessToken", "");
            d = jsonobject.optLong("facebookAccessTokenExpires", 0L);
            l = jsonobject.optBoolean("facebookReauthorize", false);
        }
        f = jsonobject.optString("facebookPermissions", "").split(",");
        g = jsonobject.optString("facebookRequiredExplicitSharePermissions", "").split(",");
        h = jsonobject.optString("facebookRequiredAutoSharePermissions", "").split(",");
        if (!s.p())
        {
            jsonobject = new StringBuffer();
            jsonobject.append((new StringBuilder()).append("FacebookUserData.update() : updating facebookUserData ( appId: ").append(a).append(" acessToken: ").append(c).append(" acessTokenExp: ").append(d).append(" fbReAuth: ").append(l).toString());
            jsonobject.append("AllPerms: [");
            if (f != null)
            {
                String as[] = f;
                int l1 = as.length;
                for (int i1 = 0; i1 < l1; i1++)
                {
                    jsonobject.append(as[i1]);
                    jsonobject.append(", ");
                }

            }
            jsonobject.append("]");
            jsonobject.append(" ReqExplSharePerms: [");
            if (g != null)
            {
                String as1[] = g;
                int i2 = as1.length;
                for (int j1 = 0; j1 < i2; j1++)
                {
                    jsonobject.append(as1[j1]);
                    jsonobject.append(", ");
                }

            }
            jsonobject.append("]");
            jsonobject.append(" ReqAutoSharePerms: [");
            if (h != null)
            {
                String as2[] = h;
                int j2 = as2.length;
                for (int k1 = ((flag) ? 1 : 0); k1 < j2; k1++)
                {
                    jsonobject.append(as2[k1]);
                    jsonobject.append(", ");
                }

            }
            jsonobject.append("]");
            jsonobject.append(")");
            p.df.a.a("FacebookUserData", jsonobject.toString());
            p.df.a.a("FacebookUserData", (new StringBuilder()).append("FacebookUserData.update() --> isFacebookConnectedOnServer = ").append(a()).toString());
        }
    }

    public boolean a()
    {
        return c != null && c.length() != 0;
    }

    public boolean b()
    {
        return f != null && f.length != 0;
    }

    public String c()
    {
        return c;
    }

    public void clear()
    {
        c = null;
        d = 0L;
        e = 0L;
        l = false;
        b = null;
        k = null;
    }

    public AccessToken d()
    {
        Bundle bundle = load();
        Object obj = bundle.getStringArrayList("com.facebook.TokenCachingStrategy.Permissions");
        if (obj == null)
        {
            obj = Collections.emptyList();
        } else
        {
            obj = Collections.unmodifiableList(new ArrayList(((java.util.Collection) (obj))));
        }
        return AccessToken.createFromExistingAccessToken(bundle.getString("com.facebook.TokenCachingStrategy.Token"), a(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate"), a(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate"), getSource(bundle), ((List) (obj)));
    }

    public long e()
    {
        return d;
    }

    public String f()
    {
        if (b != null)
        {
            return b.getName();
        } else
        {
            return "";
        }
    }

    public String g()
    {
        if (p.bx.d.a().c() && b != null)
        {
            Resources resources = com.pandora.android.provider.b.a.h().getResources();
            int i1 = resources.getDimensionPixelSize(0x7f0900e0);
            int j1 = resources.getDimensionPixelSize(0x7f0900df);
            return (new StringBuilder()).append("http://graph.facebook.com/").append(b.getId()).append("/picture?width=").append(i1).append("&height=").append(j1).toString();
        } else
        {
            return null;
        }
    }

    public String h()
    {
        if (b != null)
        {
            return b.getId();
        } else
        {
            return "";
        }
    }

    public boolean i()
    {
        return l;
    }

    public String[] j()
    {
        if (i == null)
        {
            if (f == null)
            {
                return null;
            }
            ArrayList arraylist = new ArrayList(f.length);
            String as[] = f;
            int j1 = as.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                String s1 = as[i1];
                if (!s1.startsWith("publish_"))
                {
                    arraylist.add(s1);
                }
            }

            i = (String[])arraylist.toArray(new String[arraylist.size()]);
        }
        return i;
    }

    public String[] k()
    {
        if (j == null)
        {
            if (f == null)
            {
                return null;
            }
            ArrayList arraylist = new ArrayList(f.length);
            String as[] = f;
            int j1 = as.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                String s1 = as[i1];
                if (s1.startsWith("publish_"))
                {
                    arraylist.add(s1);
                }
            }

            j = (String[])arraylist.toArray(new String[arraylist.size()]);
        }
        return j;
    }

    public String[] l()
    {
        return g;
    }

    public Bundle load()
    {
        Bundle bundle = new Bundle(5);
        if (c != null)
        {
            if (k == null)
            {
                k = new String[g.length];
                System.arraycopy(g, 0, k, 0, g.length);
            }
            TokenCachingStrategy.putToken(bundle, c);
            TokenCachingStrategy.putExpirationMilliseconds(bundle, d);
            TokenCachingStrategy.putPermissions(bundle, a(k));
            TokenCachingStrategy.putLastRefreshMilliseconds(bundle, e);
        }
        p.df.a.a("FacebookUserData", (new StringBuilder()).append("FacebookUserData.load() : ").append(bundle).toString());
        return bundle;
    }

    public String[] m()
    {
        return h;
    }

    public String n()
    {
        return a;
    }

    public void save(Bundle bundle)
    {
        p.df.a.a("FacebookUserData", (new StringBuilder()).append("FacebookUserData.save(Bundle) : ").append(bundle).toString());
        c = TokenCachingStrategy.getToken(bundle);
        d = TokenCachingStrategy.getExpirationMilliseconds(bundle);
        k = a(TokenCachingStrategy.getPermissions(bundle));
        e = TokenCachingStrategy.getLastRefreshMilliseconds(bundle);
    }
}
