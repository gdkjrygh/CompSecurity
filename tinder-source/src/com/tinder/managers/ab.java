// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.content.SharedPreferences;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.android.volley.k;
import com.tinder.a.d;
import com.tinder.a.f;
import com.tinder.a.g;
import com.tinder.b.e;
import com.tinder.d.a;
import com.tinder.e.ad;
import com.tinder.e.al;
import com.tinder.e.ao;
import com.tinder.e.as;
import com.tinder.e.l;
import com.tinder.e.n;
import com.tinder.e.u;
import com.tinder.e.z;
import com.tinder.enums.Blend;
import com.tinder.enums.RateType;
import com.tinder.events.EventGlobalsLoaded;
import com.tinder.events.EventNewMatch;
import com.tinder.events.EventRecsAdded;
import com.tinder.f.ak;
import com.tinder.model.Career;
import com.tinder.model.ConnectionsGroup;
import com.tinder.model.GlobalConfig;
import com.tinder.model.Match;
import com.tinder.model.Person;
import com.tinder.model.SparksEvent;
import com.tinder.model.SuperlikeStatus;
import com.tinder.model.User;
import com.tinder.model.UserMeta;
import com.tinder.parse.UserParse;
import com.tinder.utils.o;
import com.tinder.utils.t;
import com.tinder.utils.v;
import de.greenrobot.event.c;
import java.lang.ref.WeakReference;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            ae, i, e, z, 
//            a, ad, d, ManagerApp, 
//            y, g

public final class ab
{

    public LinkedList a;
    public Set b;
    Map c;
    boolean d;
    public boolean e;
    boolean f;
    public int g;
    public long h;
    public SuperlikeStatus i;
    public boolean j;
    UserParse k;
    c l;
    public f m;
    public a n;
    com.tinder.managers.d o;
    private final int p;
    private k q;
    private e r;
    private Handler s;
    private int t;
    private ae u;
    private y v;
    private i w;
    private com.tinder.managers.ad x;
    private com.tinder.managers.e y;
    private com.tinder.managers.z z;

    public ab(ae ae1, i i1, y y1, UserParse userparse, com.tinder.managers.ad ad1, c c1, f f1, 
            a a1, com.tinder.managers.e e1, com.tinder.managers.z z1, com.tinder.managers.d d1)
    {
        g = 100;
        u = ae1;
        w = i1;
        v = y1;
        k = userparse;
        x = ad1;
        l = c1;
        m = f1;
        n = a1;
        y = e1;
        z = z1;
        o = d1;
        l.a(this, false);
        a = new LinkedList();
        b = new HashSet(3);
        p = com.tinder.managers.ae.a.getInt("REC_SIZE", 40);
        t = com.tinder.managers.ae.a.getInt("RECS_INTERVAL", 4000);
        c = new HashMap();
        r = new e();
        q = new com.android.volley.c(20000, 4, 2.0F);
        com.tinder.utils.e.a(new com.tinder.utils.e.b() {

            final ab a;

            public final void a()
            {
                HashMap hashmap = (HashMap)com.tinder.b.e.e();
                for (Iterator iterator = hashmap.keySet().iterator(); iterator.hasNext();)
                {
                    String s1 = (String)iterator.next();
                    Pair pair = (Pair)hashmap.get(s1);
                    if (((Boolean)pair.first).booleanValue())
                    {
                        a.a(s1, new l(this, s1) {

                            final String a;
                            final _cls1 b;

                            public final void a(int i1)
                            {
                                b.a.g = i1;
                                com.tinder.utils.e.a(new com.tinder.utils.e.b(this) {

                                    final _cls1 a;

                                    public final void a()
                                    {
                                        com.tinder.b.e.a(a.a);
                                    }

            
            {
                a = _pcls1;
                super();
            }
                                }).a(false);
                            }

                            public final void c()
                            {
                                b.a.o.e();
                            }

                            public final void d()
                            {
                                b.a.o.a(1, null);
                            }

            
            {
                b = _pcls1;
                a = s1;
                super();
            }
                        });
                    } else
                    if (((Boolean)pair.second).booleanValue())
                    {
                        a.a(s1, new l(this, s1) {

                            final String a;
                            final _cls1 b;

                            public final void a(int i1)
                            {
                                com.tinder.utils.e.a(new com.tinder.utils.e.b(this) {

                                    final _cls2 a;

                                    public final void a()
                                    {
                                        com.tinder.b.e.a(a.a);
                                    }

            
            {
                a = _pcls2;
                super();
            }
                                }).a(false);
                            }

                            public final void c()
                            {
                                b.a.o.e();
                            }

                            public final void d()
                            {
                                b.a.o.a(1, null);
                            }

            
            {
                b = _pcls1;
                a = s1;
                super();
            }
                        });
                    } else
                    {
                        a.a(s1, new u(this, s1) {

                            final String a;
                            final _cls1 b;

                            public final void c()
                            {
                                b.a.o.e();
                            }

                            public final void d()
                            {
                                b.a.o.a(1, null);
                            }

                            public final void f()
                            {
                                com.tinder.utils.e.a(new com.tinder.utils.e.b(this) {

                                    final _cls3 a;

                                    public final void a()
                                    {
                                        com.tinder.b.e.a(a.a);
                                    }

            
            {
                a = _pcls3;
                super();
            }
                                }).a(false);
                            }

            
            {
                b = _pcls1;
                a = s1;
                super();
            }
                        });
                    }
                }

            }

            
            {
                a = ab.this;
                super();
            }
        }).a(false);
        i = new SuperlikeStatus();
    }

    static Match a(ab ab1, JSONObject jsonobject, User user)
        throws JSONException, ParseException
    {
        (new StringBuilder("jsonObjectMatch=")).append(jsonobject);
        jsonobject = com.tinder.parse.e.a(jsonobject, com.tinder.managers.i.l());
        if (jsonobject == null)
        {
            return null;
        }
        jsonobject.setPerson(new Person(user.getId(), user.getName(), user.getPhotos(), user.getGender(), user.isVerified(), user.getBadges(), user.getUsername(), user.getCareer(), null));
        Object obj = new ArrayList(1);
        ((List) (obj)).add(jsonobject);
        ab1.w.a(((List) (obj)), null);
        (new i.b(jsonobject)).start();
        ab1.n.a(jsonobject.isSuperlike(), user.getId());
        obj = new SparksEvent("Match.New");
        ((SparksEvent) (obj)).put("matchId", jsonobject.getId());
        ((SparksEvent) (obj)).put("fromPush", Boolean.valueOf(false));
        ab1.y.b(jsonobject.getPerson().userId, ((SparksEvent) (obj)));
        jsonobject.getPerson().getCareer().appendAnalyticsInfo(((SparksEvent) (obj)));
        if (jsonobject.getPerson() != null)
        {
            ((SparksEvent) (obj)).put("otherId", jsonobject.getPerson().userId);
            ab1.y.b(jsonobject.getPerson().userId, ((SparksEvent) (obj)));
        }
        user = user.getConnections();
        if (user != null)
        {
            ((SparksEvent) (obj)).put("firstDegrees", Integer.valueOf(user.getDegreeCount(1)));
            ((SparksEvent) (obj)).put("secondDegrees", Integer.valueOf(user.getDegreeCount(2)));
        }
        ab1 = ab1.z.b();
        if (ab1 != null)
        {
            ((SparksEvent) (obj)).put("superLike", Boolean.valueOf(TextUtils.equals(ab1.getId(), jsonobject.getSuperLiker())));
        }
        ((SparksEvent) (obj)).put("didSuperLike", Boolean.valueOf(jsonobject.superLikerIsThem()));
        com.tinder.managers.a.a(((SparksEvent) (obj)));
        return jsonobject;
    }

    static void a(ab ab1, String s1, RateType ratetype)
    {
        com.tinder.utils.e.a(ab1. new com.tinder.utils.e.b(s1, ratetype) {

            final String a;
            final RateType b;
            final ab c;

            public final void a()
            {
                com.tinder.b.e.a(a, b);
            }

            
            {
                c = ab.this;
                a = s1;
                b = ratetype;
                super();
            }
        }).a(false);
    }

    public static Blend c(String s1)
    {
        if (s1 == null || s1.equalsIgnoreCase(""))
        {
            return Blend.OPTIMAL;
        }
        if (s1.equalsIgnoreCase(Blend.OPTIMAL.name))
        {
            return Blend.OPTIMAL;
        }
        if (s1.equalsIgnoreCase(Blend.POPULARITY.name))
        {
            return Blend.POPULARITY;
        }
        if (s1.equalsIgnoreCase(Blend.DISTANCE.name))
        {
            return Blend.DISTANCE;
        }
        if (s1.equalsIgnoreCase(Blend.RECENT_ACTIVITY.name))
        {
            return Blend.RECENT_ACTIVITY;
        } else
        {
            return Blend.OPTIMAL;
        }
    }

    public final long a()
    {
        return h - System.currentTimeMillis();
    }

    public final User a(String s1)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            User user = (User)iterator.next();
            if (user.getId().equals(s1))
            {
                return user;
            }
        }

        return null;
    }

    public final void a(as as)
    {
        boolean flag;
        if (x.k && o.f() && !com.tinder.managers.d.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            d = true;
            JSONObject jsonobject = new JSONObject();
            String s1;
            try
            {
                jsonobject.put("limit", 15);
            }
            catch (JSONException jsonexception)
            {
                com.tinder.utils.v.b(jsonexception.toString());
            }
            s1 = String.format(m.k, new Object[] {
                com.tinder.utils.t.a()
            });
            as = new g(com.android.volley.Request.Priority.d, 1, s1, jsonobject, new com.android.volley.i.b(as) {

                final as a;
                final ab b;

                public final void a(Object obj)
                {
                    obj = (JSONObject)obj;
                    (new StringBuilder("jsonObjectResponse=")).append(obj);
                    int i1;
                    obj = (Pair)b.k.a(((JSONObject) (obj)), b.c);
                    static final class _cls8
                    {

                        static final int a[];

                        static 
                        {
                            a = new int[com.tinder.parse.UserParse.RecsResponse.values().length];
                            try
                            {
                                a[com.tinder.parse.UserParse.RecsResponse.e.ordinal()] = 1;
                            }
                            catch (NoSuchFieldError nosuchfielderror4) { }
                            try
                            {
                                a[com.tinder.parse.UserParse.RecsResponse.d.ordinal()] = 2;
                            }
                            catch (NoSuchFieldError nosuchfielderror3) { }
                            try
                            {
                                a[com.tinder.parse.UserParse.RecsResponse.a.ordinal()] = 3;
                            }
                            catch (NoSuchFieldError nosuchfielderror2) { }
                            try
                            {
                                a[com.tinder.parse.UserParse.RecsResponse.b.ordinal()] = 4;
                            }
                            catch (NoSuchFieldError nosuchfielderror1) { }
                            try
                            {
                                a[com.tinder.parse.UserParse.RecsResponse.c.ordinal()] = 5;
                            }
                            catch (NoSuchFieldError nosuchfielderror)
                            {
                                return;
                            }
                        }
                    }

                    i1 = com.tinder.managers._cls8.a[((com.tinder.parse.UserParse.RecsResponse)((Pair) (obj)).first).ordinal()];
                    i1;
                    JVM INSTR tableswitch 1 2: default 80
                //                               1 89
                //                               2 171;
                       goto _L1 _L2 _L3
_L1:
                    break; /* Loop/switch isn't completed */
_L3:
                    break MISSING_BLOCK_LABEL_171;
_L5:
                    b.d = false;
                    return;
_L2:
                    try
                    {
                        b.a(false);
                        b.a((ArrayList)((Pair) (obj)).second);
                        b.i();
                        b.l.c(new EventRecsAdded((List)((Pair) (obj)).second));
                        continue; /* Loop/switch isn't completed */
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj) { }
                    finally
                    {
                        b.d = false;
                        throw obj;
                    }
                    com.tinder.utils.v.b(((Exception) (obj)).getMessage());
                    a.c();
                    b.d = false;
                    return;
                    a.d();
                    if (true) goto _L5; else goto _L4
_L4:
                }

            
            {
                b = ab.this;
                a = as1;
                super();
            }
            }, new com.android.volley.i.a(as) {

                final as a;
                final ab b;

                public final void a(VolleyError volleyerror)
                {
                    (new StringBuilder()).append(volleyerror.getMessage()).append(' ').append(volleyerror);
                    b.o.a(volleyerror.getMessage(), new n(this) {

                        final _cls10 a;

                        public final void a()
                        {
                            a.b.d = false;
                            a.b.a(a.a);
                        }

                        public final void b()
                        {
                            a.a.c();
                        }

                        public final void c()
                        {
                            a.a.c();
                            a.b.d = false;
                        }

            
            {
                a = _pcls10;
                super();
            }
                    });
                }

            
            {
                b = ab.this;
                a = as;
                super();
            }
            }, com.tinder.managers.d.b());
            as.j = new com.android.volley.c(10000, 0, 0.0F);
            ManagerApp.b().a(as);
        }
    }

    public final void a(User user, ao ao)
    {
        String s1 = user.getId();
        user = new d(3, String.format(m.O, new Object[] {
            s1
        }), null, new com.android.volley.i.b(ao, user, s1) {

            final ao a;
            final User b;
            final String c;
            final ab d;

            public final void a(Object obj)
            {
                obj = (JSONObject)obj;
                (new StringBuilder("undo superlike: ")).append(obj);
                if (((JSONObject) (obj)).optInt("status") == 200)
                {
                    obj = com.tinder.parse.g.a(((JSONObject) (obj)));
                    d.i = ((SuperlikeStatus) (obj));
                    a.a(b, ((SuperlikeStatus) (obj)));
                    return;
                } else
                {
                    a.a(c);
                    return;
                }
            }

            
            {
                d = ab.this;
                a = ao1;
                b = user;
                c = s1;
                super();
            }
        }, new com.android.volley.i.a(ao, s1, user) {

            final ao a;
            final String b;
            final User c;
            final ab d;

            public final void a(VolleyError volleyerror)
            {
                if (volleyerror == null)
                {
                    a.a(b);
                    return;
                }
                (new StringBuilder("undo superlike on ")).append(b).append(" FAILED ").append(volleyerror.getMessage());
                if (volleyerror.a != null)
                {
                    switch (volleyerror.a.a)
                    {
                    case 402: 
                    default:
                        a.a(b);
                        return;

                    case 400: 
                        a.a();
                        return;

                    case 401: 
                        a.a(c);
                        return;

                    case 403: 
                        a.b();
                        break;
                    }
                    return;
                } else
                {
                    a.a(b);
                    return;
                }
            }

            
            {
                d = ab.this;
                a = ao1;
                b = s1;
                c = user;
                super();
            }
        }, com.tinder.managers.d.b());
        user.j = new com.android.volley.c(20000, 0, 1.0F);
        ManagerApp.b().a(user);
    }

    public final void a(String s1, l l1)
    {
        Object obj;
        boolean flag1;
        com.tinder.managers.ae.c();
        flag1 = v.b();
        if (a.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_304;
        }
        obj = (User)a.getFirst();
        if (obj == null || !((User) (obj)).getId().equals(s1)) goto _L2; else goto _L1
_L1:
        Object obj1;
        obj1 = b(s1);
        obj = obj1;
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        boolean flag;
        f();
        flag = ((User) (obj1)).isRecAndPassporting();
_L5:
        if (obj1 != null && ((User) (obj1)).isBrand())
        {
            n.e(((User) (obj1)).getId());
        }
        int i1;
        if (obj1 != null && ((User) (obj1)).isSuperLike() && com.tinder.managers.ae.z())
        {
            Object obj2 = m.Q;
            obj = obj2;
            if (flag1)
            {
                obj = (new StringBuilder()).append(((String) (obj2))).append("&user_traveling=true").toString();
            }
            obj2 = obj;
            if (flag)
            {
                obj2 = (new StringBuilder()).append(((String) (obj))).append("&rec_traveling=true").toString();
            }
            n.i(((User) (obj1)).getId());
            i1 = 1;
            obj = obj2;
        } else
        {
            if (flag1 && flag)
            {
                obj = m.E;
            } else
            if (flag1)
            {
                obj = m.C;
            } else
            if (flag)
            {
                obj = m.D;
            } else
            {
                obj = m.n;
            }
            i1 = 0;
        }
        c.put(s1, RateType.LIKE);
        s1 = new d(i1, String.format(((String) (obj)), new Object[] {
            s1
        }), new JSONObject(), new com.android.volley.i.b(s1, l1, ((User) (obj1))) {

            final String a;
            final l b;
            final User c;
            final ab d;

            public final void a(Object obj3)
            {
                obj3 = (JSONObject)obj3;
                (new StringBuilder("response= ")).append(obj3);
                if (((JSONObject) (obj3)).optInt("status", 200) == 200)
                {
                    (new StringBuilder("Like on")).append(a).append(" SUCCESS");
                    d.g = ((JSONObject) (obj3)).optInt("likes_remaining", 100);
                    d.h = ((JSONObject) (obj3)).optLong("rate_limited_until", 0L);
                    b.a(d.g);
                    obj3 = ((JSONObject) (obj3)).optJSONObject("match");
                    if (obj3 != null && c != null)
                    {
                        try
                        {
                            obj3 = com.tinder.managers.ab.a(d, ((JSONObject) (obj3)), c);
                        }
                        // Misplaced declaration of an exception variable
                        catch (Object obj3)
                        {
                            com.tinder.utils.v.a("Failed to parse match from like: ", ((Throwable) (obj3)));
                            obj3 = null;
                        }
                        if (obj3 != null)
                        {
                            d.l.c(new EventNewMatch(((Match) (obj3))));
                        }
                    }
                }
            }

            
            {
                d = ab.this;
                a = s1;
                b = l1;
                c = user;
                super();
            }
        }, new com.android.volley.i.a(l1, s1) {

            final l a;
            final String b;
            final ab c;

            public final void a(VolleyError volleyerror)
            {
                if (volleyerror == null)
                {
                    return;
                }
                (new StringBuilder("Like on ")).append(b).append(" FAILED ").append(volleyerror.getMessage());
                if (volleyerror.a == null) goto _L2; else goto _L1
_L1:
                volleyerror.a.a;
                JVM INSTR tableswitch 401 403: default 76
            //                           401 91
            //                           402 76
            //                           403 103;
                   goto _L2 _L3 _L2 _L4
_L2:
                com.tinder.managers.ab.a(c, b, RateType.LIKE);
                return;
_L3:
                a.d();
                continue; /* Loop/switch isn't completed */
_L4:
                a.c();
                if (true) goto _L2; else goto _L5
_L5:
            }

            
            {
                c = ab.this;
                a = l1;
                b = s1;
                super();
            }
        }, com.tinder.managers.d.b());
        s1.j = q;
        ManagerApp.b().a(s1);
        return;
_L2:
        obj = null;
_L4:
        flag = false;
        obj1 = obj;
          goto _L5
        obj1 = null;
        flag = false;
          goto _L5
    }

    public final void a(String s1, u u1)
    {
        com.tinder.managers.ae.c();
        Object obj = null;
        if (a.size() > 0)
        {
            obj = b(s1);
            f();
        }
        c.put(s1, RateType.PASS);
        int i1;
        if (obj != null && ((User) (obj)).isSuperLike() && com.tinder.managers.ae.z())
        {
            obj = m.R;
            i1 = 1;
        } else
        {
            obj = m.o;
            i1 = 0;
        }
        s1 = new d(i1, String.format(((String) (obj)), new Object[] {
            s1
        }), new JSONObject(), new com.android.volley.i.b(s1, u1) {

            final String a;
            final u b;
            final ab c;

            public final void a(Object obj1)
            {
                obj1 = (JSONObject)obj1;
                try
                {
                    if (((JSONObject) (obj1)).getInt("status") == 200)
                    {
                        (new StringBuilder("Pass on ")).append(a).append(" SUCCESS");
                        if (b != null)
                        {
                            b.f();
                        }
                    }
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1)
                {
                    ((JSONException) (obj1)).getMessage();
                }
            }

            
            {
                c = ab.this;
                a = s1;
                b = u1;
                super();
            }
        }, new com.android.volley.i.a(s1, u1) {

            final String a;
            final u b;
            final ab c;

            public final void a(VolleyError volleyerror)
            {
                (new StringBuilder("Pass on ")).append(a).append(" FAILED ").append(volleyerror.getMessage());
                c.c.remove(a);
                if (b == null || volleyerror == null || volleyerror.a == null) goto _L2; else goto _L1
_L1:
                volleyerror.a.a;
                JVM INSTR tableswitch 401 403: default 96
            //                           401 111
            //                           402 96
            //                           403 123;
                   goto _L2 _L3 _L2 _L4
_L2:
                com.tinder.managers.ab.a(c, a, RateType.PASS);
                return;
_L3:
                b.d();
                continue; /* Loop/switch isn't completed */
_L4:
                b.c();
                if (true) goto _L2; else goto _L5
_L5:
            }

            
            {
                c = ab.this;
                a = s1;
                b = u1;
                super();
            }
        }, com.tinder.managers.d.b());
        s1.j = q;
        ManagerApp.b().a(s1);
    }

    public final void a(ArrayList arraylist)
    {
        arraylist.removeAll(a);
        a.addAll(arraylist);
        l.d(new EventRecsAdded(arraylist));
    }

    public final void a(boolean flag)
    {
        e = flag;
        if (e)
        {
            Iterator iterator = b.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                WeakReference weakreference = (WeakReference)iterator.next();
                if (com.tinder.utils.o.a(weakreference))
                {
                    ((ad)weakreference.get()).d();
                }
            } while (true);
        }
    }

    public final User b(String s1)
    {
        if (a == null)
        {
            return null;
        }
        for (int i1 = 0; i1 < a.size(); i1++)
        {
            User user = (User)a.get(i1);
            if (user.getId().equals(s1))
            {
                a.remove(user);
                return user;
            }
        }

        return null;
    }

    public final void b()
    {
        g = 100;
        h = 0L;
    }

    public final void b(boolean flag)
    {
        if (flag && com.tinder.managers.ManagerApp.f())
        {
            f = false;
            c();
            return;
        }
        f = true;
        if (s == null)
        {
            s = new Handler();
        }
        s.postDelayed(new Runnable() {

            final ab a;

            public final void run()
            {
                a.f = false;
                if (com.tinder.managers.ManagerApp.f())
                {
                    a.c();
                    return;
                } else
                {
                    a.b(false);
                    return;
                }
            }

            
            {
                a = ab.this;
                super();
            }
        }, t);
    }

    public final void c()
    {
        (new StringBuilder("discoverEnabled=")).append(x.k);
        (new StringBuilder("isGetting=")).append(e());
        (new StringBuilder("mIsWaitingToRetry=")).append(f);
        (new StringBuilder("isLoggedIn=")).append(o.f());
        (new StringBuilder("isLoggingOut=")).append(com.tinder.managers.d.a());
        boolean flag;
        if (x.k && !e() && !f && o.f() && !com.tinder.managers.d.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            d = true;
            Object obj = new JSONObject();
            String s1;
            try
            {
                ((JSONObject) (obj)).put("limit", p);
            }
            catch (JSONException jsonexception)
            {
                com.tinder.utils.v.a("Failed to serialize rec size limit", jsonexception);
            }
            s1 = String.format(m.k, new Object[] {
                com.tinder.utils.t.a()
            });
            obj = new d(0, s1, ((JSONObject) (obj)), new com.android.volley.i.b(s1) {

                final String a;
                final ab b;

                public final void a(Object obj1)
                {
                    obj1 = com.tinder.utils.e.a(new com.tinder.utils.e.a(this, (JSONObject)obj1) {

                        final JSONObject a;
                        final _cls11 b;

                        public final Object a()
                        {
                            Pair pair;
                            try
                            {
                                (new StringBuilder("RECS URL ")).append(b.a);
                                pair = b.b.k.a(a, b.b.c);
                            }
                            catch (JSONException jsonexception)
                            {
                                com.tinder.utils.v.a("Failed to parse recs", jsonexception);
                                return null;
                            }
                            catch (OutOfMemoryError outofmemoryerror)
                            {
                                System.gc();
                                com.tinder.utils.v.a("Out of memory parsing recs", outofmemoryerror);
                                return null;
                            }
                            return pair;
                        }

            
            {
                b = _pcls11;
                a = jsonobject;
                super();
            }
                    });
                    obj1.a = new com.tinder.utils.e.c(this) {

                        final _cls11 a;

                        public final void a(Object obj)
                        {
                            if (obj != null) goto _L2; else goto _L1
_L1:
                            a.b.b(false);
_L4:
                            a.b.d = false;
                            return;
_L2:
                            obj = (Pair)obj;
                            (new StringBuilder("valid status: ")).append(((Pair) (obj)).first);
                            switch (com.tinder.managers._cls8.a[((com.tinder.parse.UserParse.RecsResponse)((Pair) (obj)).first).ordinal()])
                            {
                            case 1: // '\001'
                                a.b.a(false);
                                a.b.a((ArrayList)((Pair) (obj)).second);
                                a.b.i();
                                break;

                            case 3: // '\003'
                                a.b.b(false);
                                break;

                            case 4: // '\004'
                            case 5: // '\005'
                                a.b.a(true);
                                a.b.b(false);
                                break;

                            case 2: // '\002'
                                a.b.a(false);
                                a.b.h();
                                a.b.b(false);
                                break;
                            }
                            if (true) goto _L4; else goto _L3
_L3:
                        }

            
            {
                a = _pcls11;
                super();
            }
                    };
                    ((com.tinder.utils.e) (obj1)).a(true);
                }

            
            {
                b = ab.this;
                a = s1;
                super();
            }
            }, new com.android.volley.i.a() {

                final ab a;

                public final void a(VolleyError volleyerror)
                {
                    (new StringBuilder()).append(volleyerror.getMessage()).append(' ').append(volleyerror);
                    String s2 = com.tinder.utils.v.a(volleyerror);
                    int i1;
                    if (!TextUtils.isEmpty(s2))
                    {
                        (new StringBuilder("Recs error : status code onErrorResponse: [")).append(volleyerror.a.a).append("]");
                        i1 = volleyerror.a.a;
                    } else
                    {
                        i1 = 0;
                    }
                    if (!TextUtils.isEmpty(s2) && s2.contains("you must have a registered position before getting recs"))
                    {
                        a.a(false);
                        a.d = false;
                        ManagerApp.h().l().a(new z(this) {

                            final _cls12 a;

                            public final void a()
                            {
                                a.a.b(false);
                            }

                            public final void b()
                            {
                            }

                            public final void c()
                            {
                            }

            
            {
                a = _pcls12;
                super();
            }
                        }, true);
                        return;
                    }
                    if (i1 == 403)
                    {
                        a.d = false;
                        a.j();
                        return;
                    } else
                    {
                        a.o.a(volleyerror.getMessage(), new n(this) {

                            final _cls12 a;

                            public final void a()
                            {
                                a.a.d = false;
                                a.a.c();
                            }

                            public final void b()
                            {
                                Iterator iterator = a.a.b.iterator();
                                do
                                {
                                    if (!iterator.hasNext())
                                    {
                                        break;
                                    }
                                    WeakReference weakreference = (WeakReference)iterator.next();
                                    if (com.tinder.utils.o.a(weakreference))
                                    {
                                        ((ad)weakreference.get()).e();
                                    }
                                } while (true);
                            }

                            public final void c()
                            {
                                a.a.d = false;
                                a.a.b(false);
                            }

            
            {
                a = _pcls12;
                super();
            }
                        });
                        return;
                    }
                }

            
            {
                a = ab.this;
                super();
            }
            }, com.tinder.managers.d.b());
            obj.j = new com.android.volley.c(20000, 0, 1.0F);
            obj.l = "get_recs";
            ManagerApp.b().a(((Request) (obj)));
        }
    }

    public final User d()
    {
        if (a.size() > 0)
        {
            return (User)a.get(0);
        } else
        {
            return null;
        }
    }

    public final boolean e()
    {
        return d && !e;
    }

    public final void f()
    {
        if (a.size() <= 9 && !d)
        {
            c();
        }
    }

    public final void g()
    {
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            WeakReference weakreference = (WeakReference)iterator.next();
            if (com.tinder.utils.o.a(weakreference))
            {
                ((ad)weakreference.get()).f();
            }
        } while (true);
    }

    public final void h()
    {
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            WeakReference weakreference = (WeakReference)iterator.next();
            if (com.tinder.utils.o.a(weakreference))
            {
                ((ad)weakreference.get()).c();
            }
        } while (true);
    }

    public final void i()
    {
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            WeakReference weakreference = (WeakReference)iterator.next();
            if (com.tinder.utils.o.a(weakreference))
            {
                weakreference.get();
            }
        } while (true);
    }

    public final void j()
    {
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            WeakReference weakreference = (WeakReference)iterator.next();
            if (com.tinder.utils.o.a(weakreference))
            {
                ((ad)weakreference.get()).g();
            }
        } while (true);
    }

    public final void onEvent(EventGlobalsLoaded eventglobalsloaded)
    {
        int i1 = eventglobalsloaded.getGlobalConfig().recsInterval;
        t = i1;
        ae.b.putInt("RECS_INTERVAL", i1);
        ae.b.commit();
        if (eventglobalsloaded.getUserMeta() != null)
        {
            h = eventglobalsloaded.getUserMeta().millisRateLimitedUntil;
            g = eventglobalsloaded.getUserMeta().likesPercentRemaining;
            i = eventglobalsloaded.getUserMeta().superlikeStatus;
        }
    }

    // Unreferenced inner class com/tinder/managers/ab$2

/* anonymous class */
    public final class _cls2
        implements com.android.volley.i.b
    {

        final User a;
        final al b;
        final String c;
        final ab d;

        public final void a(Object obj)
        {
            Object obj1 = (JSONObject)obj;
            (new StringBuilder("superlikeOnRec: ")).append(obj1);
            boolean flag = ((JSONObject) (obj1)).optBoolean("limit_exceeded");
            obj = com.tinder.parse.g.a(((JSONObject) (obj1)));
            obj1 = ((JSONObject) (obj1)).optJSONObject("match");
            d.i = ((SuperlikeStatus) (obj));
            if (obj1 != null && a != null)
            {
                d.n.h(a.getId());
                try
                {
                    obj1 = com.tinder.managers.ab.a(d, ((JSONObject) (obj1)), a);
                    b.a(((Match) (obj1)));
                }
                catch (Exception exception)
                {
                    b.a(a);
                    com.tinder.utils.v.a("Failed to parse match from like: ", exception);
                }
            }
            if (flag)
            {
                b.b(((SuperlikeStatus) (obj)));
                return;
            } else
            {
                d.c.put(c, RateType.SUPERLIKE);
                b.a(((SuperlikeStatus) (obj)));
                return;
            }
        }

            public 
            {
                d = ab.this;
                a = user;
                b = al1;
                c = s1;
                super();
            }
    }


    // Unreferenced inner class com/tinder/managers/ab$3

/* anonymous class */
    public final class _cls3
        implements com.android.volley.i.a
    {

        final al a;
        final User b;
        final String c;
        final ab d;

        public final void a(VolleyError volleyerror)
        {
            if (volleyerror == null)
            {
                a.a(b);
                return;
            }
            (new StringBuilder("superlike on ")).append(c).append(" FAILED ").append(volleyerror.getMessage());
            if (volleyerror.a != null)
            {
                switch (volleyerror.a.a)
                {
                case 402: 
                default:
                    a.a(b);
                    return;

                case 401: 
                    a.b();
                    return;

                case 403: 
                    a.a();
                    break;
                }
                return;
            } else
            {
                a.a(b);
                return;
            }
        }

            public 
            {
                d = ab.this;
                a = al1;
                b = user;
                c = s1;
                super();
            }
    }

}
