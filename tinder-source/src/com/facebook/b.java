// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.b.d;
import android.util.Log;
import com.facebook.internal.m;
import com.facebook.internal.n;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            g, a, GraphRequest, HttpMethod, 
//            i, k, AccessToken, j

final class b
{
    private static final class a
    {

        public String a;
        public int b;

        private a()
        {
        }

        a(byte byte0)
        {
            this();
        }
    }


    private static volatile b c;
    AccessToken a;
    Date b;
    private final d d;
    private final com.facebook.a e;
    private AtomicBoolean f;

    private b(d d1, com.facebook.a a1)
    {
        f = new AtomicBoolean(false);
        b = new Date(0L);
        n.a(d1, "localBroadcastManager");
        n.a(a1, "accessTokenCache");
        d = d1;
        e = a1;
    }

    static b a()
    {
        if (c != null) goto _L2; else goto _L1
_L1:
        com/facebook/b;
        JVM INSTR monitorenter ;
        if (c == null)
        {
            c = new b(android.support.v4.b.d.a(g.g()), new com.facebook.a());
        }
        com/facebook/b;
        JVM INSTR monitorexit ;
_L2:
        return c;
        Exception exception;
        exception;
        com/facebook/b;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static void a(b b1)
    {
        b1.d();
    }

    static AtomicBoolean b(b b1)
    {
        return b1.f;
    }

    private void d()
    {
        Object obj;
        for (obj = a; obj == null || !f.compareAndSet(false, true);)
        {
            return;
        }

        n.a();
        b = new Date();
        HashSet hashset = new HashSet();
        HashSet hashset1 = new HashSet();
        AtomicBoolean atomicboolean = new AtomicBoolean(false);
        a a1 = new a((byte)0);
        Object obj1 = new GraphRequest.b(atomicboolean, hashset, hashset1) {

            final AtomicBoolean a;
            final Set b;
            final Set c;
            final b d;

            public final void a(j j1)
            {
                j1 = j1.a;
                if (j1 != null) goto _L2; else goto _L1
_L1:
                return;
_L2:
                if ((j1 = j1.optJSONArray("data")) != null)
                {
                    a.set(true);
                    int l = 0;
                    while (l < j1.length()) 
                    {
                        Object obj2 = j1.optJSONObject(l);
                        if (obj2 != null)
                        {
                            String s = ((JSONObject) (obj2)).optString("permission");
                            obj2 = ((JSONObject) (obj2)).optString("status");
                            if (!m.a(s) && !m.a(((String) (obj2))))
                            {
                                obj2 = ((String) (obj2)).toLowerCase(Locale.US);
                                if (((String) (obj2)).equals("granted"))
                                {
                                    b.add(s);
                                } else
                                if (((String) (obj2)).equals("declined"))
                                {
                                    c.add(s);
                                } else
                                {
                                    Log.w("AccessTokenManager", (new StringBuilder("Unexpected status: ")).append(((String) (obj2))).toString());
                                }
                            }
                        }
                        l++;
                    }
                }
                if (true) goto _L1; else goto _L3
_L3:
            }

            
            {
                d = b.this;
                a = atomicboolean;
                b = set;
                c = set1;
                super();
            }
        };
        obj1 = new GraphRequest(((AccessToken) (obj)), "me/permissions", new Bundle(), HttpMethod.a, ((GraphRequest.b) (obj1)));
        GraphRequest.b b1 = new GraphRequest.b(a1) {

            final a a;
            final b b;

            public final void a(j j1)
            {
                j1 = j1.a;
                if (j1 == null)
                {
                    return;
                } else
                {
                    a.a = j1.optString("access_token");
                    a.b = j1.optInt("expires_at");
                    return;
                }
            }

            
            {
                b = b.this;
                a = a1;
                super();
            }
        };
        Bundle bundle = new Bundle();
        bundle.putString("grant_type", "fb_extend_sso_token");
        obj1 = new i(new GraphRequest[] {
            obj1, new GraphRequest(((AccessToken) (obj)), "oauth/access_token", bundle, HttpMethod.a, b1)
        });
        obj = new i.a(((AccessToken) (obj)), atomicboolean, a1, hashset, hashset1) {

            final AccessToken a;
            final AtomicBoolean b;
            final a c;
            final Set d;
            final Set e;
            final b f;

            public final void a()
            {
                if (b.a().a == null || b.a().a.h != a.h)
                {
                    return;
                }
                int j;
                if (b.get() || c.a != null)
                {
                    break MISSING_BLOCK_LABEL_75;
                }
                j = c.b;
                if (j == 0)
                {
                    b.b(f).set(false);
                    return;
                }
                if (c.a == null) goto _L2; else goto _L1
_L1:
                Object obj2 = c.a;
_L9:
                String s;
                String s1;
                s = a.g;
                s1 = a.h;
                if (!b.get()) goto _L4; else goto _L3
_L3:
                Set set = d;
_L10:
                if (!b.get()) goto _L6; else goto _L5
_L5:
                Set set1 = e;
_L11:
                AccessTokenSource accesstokensource = a.e;
                if (c.b == 0) goto _L8; else goto _L7
_L7:
                Date date = new Date((long)c.b * 1000L);
_L12:
                obj2 = new AccessToken(((String) (obj2)), s, s1, set, set1, accesstokensource, date, new Date());
                b.a().a(((AccessToken) (obj2)), true);
                b.b(f).set(false);
                return;
_L2:
                obj2 = a.d;
                  goto _L9
_L4:
                set = a.b;
                  goto _L10
_L6:
                set1 = a.c;
                  goto _L11
_L8:
                date = a.a;
                  goto _L12
                Exception exception;
                exception;
                b.b(f).set(false);
                throw exception;
                  goto _L9
            }

            
            {
                f = b.this;
                a = accesstoken;
                b = atomicboolean;
                c = a1;
                d = set;
                e = set1;
                super();
            }
        };
        if (!((i) (obj1)).e.contains(obj))
        {
            ((i) (obj1)).e.add(obj);
        }
        GraphRequest.b(((i) (obj1)));
    }

    final void a(AccessToken accesstoken, boolean flag)
    {
        AccessToken accesstoken1 = a;
        a = accesstoken;
        f.set(false);
        b = new Date(0L);
        if (flag)
        {
            if (accesstoken != null)
            {
                e.a(accesstoken);
            } else
            {
                com.facebook.a a1 = e;
                a1.a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
                if (g.c())
                {
                    a1.b().b();
                }
                m.b(g.g());
            }
        }
        if (!m.a(accesstoken1, accesstoken))
        {
            Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accesstoken1);
            intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accesstoken);
            d.a(intent);
        }
    }

    final boolean b()
    {
        boolean flag = false;
        AccessToken accesstoken = e.a();
        if (accesstoken != null)
        {
            a(accesstoken, false);
            flag = true;
        }
        return flag;
    }

    final void c()
    {
        if (Looper.getMainLooper().equals(Looper.myLooper()))
        {
            d();
            return;
        } else
        {
            (new Handler(Looper.getMainLooper())).post(new Runnable() {

                final b a;

                public final void run()
                {
                    b.a(a);
                }

            
            {
                a = b.this;
                super();
            }
            });
            return;
        }
    }
}
