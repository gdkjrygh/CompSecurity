// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.content.ContentValues;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Pair;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.crashlytics.android.Crashlytics;
import com.squareup.okhttp.r;
import com.squareup.okhttp.u;
import com.squareup.okhttp.w;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.s;
import com.tinder.a.c;
import com.tinder.a.d;
import com.tinder.a.f;
import com.tinder.b.l;
import com.tinder.b.m;
import com.tinder.b.n;
import com.tinder.d.a;
import com.tinder.e.ab;
import com.tinder.e.aq;
import com.tinder.e.g;
import com.tinder.e.y;
import com.tinder.enums.Gender;
import com.tinder.enums.UserPhotoSize;
import com.tinder.f.ak;
import com.tinder.model.Badge;
import com.tinder.model.ConnectionsGroup;
import com.tinder.model.ProcessedPhoto;
import com.tinder.model.ProfilePhoto;
import com.tinder.model.SparksEvent;
import com.tinder.model.User;
import com.tinder.parse.UserParse;
import com.tinder.utils.DateUtils;
import com.tinder.utils.e;
import com.tinder.utils.t;
import com.tinder.utils.v;
import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            ae, ManagerApp, ad, d, 
//            aa, a

public final class z
{
    public static final class a
    {

        public int a;
        public int b;
        public int c;
        public User d;
        public boolean e;
        public boolean f;
        public boolean g;
        public boolean h;

        public a()
        {
        }
    }


    public f a;
    public a b;
    com.squareup.okhttp.s c;
    public com.tinder.d.a d;
    private final n e = new n();
    private final m f = new m();
    private ae g;
    private ad h;
    private User i;
    private Locale j;

    public z(ae ae1, ad ad1, f f1, com.squareup.okhttp.s s1, com.tinder.d.a a1)
    {
        g = ae1;
        h = ad1;
        a = f1;
        c = s1;
        d = a1;
        ae1 = ae.p();
        i = n.a(ae1);
        j = Locale.getDefault();
    }

    static ProfilePhoto a(ProfilePhoto profilephoto, List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            ProfilePhoto profilephoto1 = (ProfilePhoto)list.next();
            if (profilephoto.facebookId.equals(profilephoto1.facebookId))
            {
                return profilephoto1;
            }
        }

        return null;
    }

    static void a(String s1)
    {
        Picasso.a(com.tinder.managers.ManagerApp.c()).a(s1).c();
    }

    public static String b(String s1)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("username", s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
        }
        return jsonobject.toString();
    }

    private void c()
    {
        if (i != null) goto _L2; else goto _L1
_L1:
        i = n.a(ae.p());
        if (i != null) goto _L2; else goto _L3
_L3:
        v.b("My user in manager profile was null, could not reset, not saving photos");
_L5:
        return;
_L2:
        Iterator iterator = i.getAvatarUrlsForSize(UserPhotoSize.LARGE).iterator();
        while (iterator.hasNext()) 
        {
            a((String)iterator.next());
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final a a(boolean flag, JSONObject jsonobject)
        throws Exception
    {
        (new StringBuilder("jsonObjectUser=")).append(jsonobject);
        jsonobject = ManagerApp.h().d().b(jsonobject);
        b = jsonobject;
        if (((a) (jsonobject)).d != null)
        {
            Object obj = ((a) (jsonobject)).d;
            float f1 = ((a) (jsonobject)).a;
            int i1 = ((a) (jsonobject)).b;
            int k = ((a) (jsonobject)).c;
            boolean flag1 = ((a) (jsonobject)).h;
            if (i != null && ((User) (obj)).getPhotoCount() == 0)
            {
                ((User) (obj)).setPhotos(i.getPhotos());
            }
            i = ((User) (obj));
            if (flag)
            {
                (new StringBuilder("user=")).append(obj);
                ContentValues contentvalues = new ContentValues();
                contentvalues.put("id", ((User) (obj)).getId());
                if (((User) (obj)).getBirthDate() != null)
                {
                    contentvalues.put("bio", ((User) (obj)).getBio());
                }
                if (((User) (obj)).getBirthDate() != null)
                {
                    contentvalues.put("birth_date", Long.valueOf(((User) (obj)).getBirthDate().getTime()));
                }
                contentvalues.put("common_friend_count", Integer.valueOf(((User) (obj)).getCommonFriendCount()));
                contentvalues.put("common_like_count", Integer.valueOf(((User) (obj)).getCommonLikeCount()));
                contentvalues.put("distance_miles", Integer.valueOf(((User) (obj)).getDistanceMiles()));
                contentvalues.put("gender", Integer.valueOf(((User) (obj)).getGender().ordinal()));
                contentvalues.put("last_activity_date", ((User) (obj)).getLastActivityDate());
                if (((User) (obj)).getPingTime() != null)
                {
                    contentvalues.put("ping_time", Long.valueOf(((User) (obj)).getPingTime().getTime()));
                }
                contentvalues.put("first_name", ((User) (obj)).getName());
                contentvalues.put("traveling", Boolean.valueOf(((User) (obj)).isRecAndPassporting()));
                contentvalues.put("is_verified", Boolean.valueOf(((User) (obj)).isVerified()));
                contentvalues.put("username", ((User) (obj)).getUsername());
                if (((User) (obj)).hasBadge())
                {
                    contentvalues.put("badges", ((User) (obj)).getFirstBadge().toString());
                }
                contentvalues.put("is_superlike", Boolean.valueOf(((User) (obj)).isSuperLike()));
                l.a().a("users", contentvalues);
                m.a(((User) (obj)).getPhotos(), ((User) (obj)).getId());
            }
            Object obj1 = ((User) (obj)).getId();
            ae.b.putString("USER_ID", ((String) (obj1)));
            ae.b.commit();
            c();
            h.c(flag1);
            obj1 = h;
            flag = ((User) (obj)).isInterestedInMales();
            obj1.i = flag;
            ae.b.putBoolean("ARE_MALES_LIKED", flag);
            ae.b.commit();
            obj1 = h;
            flag = ((User) (obj)).isInterestedInFemales();
            obj1.h = flag;
            ae.b.putBoolean("ARE_FEMALES_LIKED", flag);
            ae.b.commit();
            h.e = f1;
            ae.b.putFloat("DISTANCE", f1);
            ae.b.commit();
            obj = h;
            obj.f = i1;
            i1 = ((ad) (obj)).f;
            ae.b.putInt("AGE_MIN", i1);
            ae.b.commit();
            h.g = k;
            ae.b.putInt("AGE_MAX", k);
            ae.b.commit();
            return jsonobject;
        } else
        {
            v.b("User in the parsed profile was null!");
            return jsonobject;
        }
    }

    public final void a()
    {
        Object obj = g;
        ad ad1 = h;
        User user = i;
        if (user == null)
        {
            return;
        } else
        {
            obj = com.tinder.utils.e.a(new com.tinder.utils.e.a(ad1, ((ae) (obj)), user) {

                final ad a;
                final ae b;
                final User c;
                final z d;

                public final Object a()
                {
                    SparksEvent sparksevent;
                    boolean flag;
                    flag = false;
                    sparksevent = new SparksEvent("User");
                    if (!a.i || !a.b()) goto _L2; else goto _L1
_L1:
                    byte byte0 = -1;
_L4:
                    Object obj1 = new ArrayList(1);
                    HashMap hashmap = new HashMap(3);
                    hashmap.put("new_match", Boolean.valueOf(com.tinder.managers.ae.g()));
                    hashmap.put("new_message", Boolean.valueOf(ae.h()));
                    hashmap.put("super_like", Boolean.valueOf(ae.b()));
                    ((ArrayList) (obj1)).add(hashmap);
                    sparksevent.put("name", c.getName());
                    sparksevent.put("age", c.getAge());
                    sparksevent.put("gender", Integer.valueOf(c.getGender().getBackendId()));
                    sparksevent.put("bio", c.getBio());
                    sparksevent.put("targetGender", Integer.valueOf(byte0));
                    sparksevent.put("minTargetAge", Integer.valueOf(a.f));
                    sparksevent.put("maxTargetAge", Integer.valueOf(a.g));
                    sparksevent.put("radius", Float.valueOf(a.a()));
                    sparksevent.put("pushOptions", obj1);
                    sparksevent.put("discoveryOn", Boolean.valueOf(a.k));
                    sparksevent.put("createTs", com.tinder.managers.ae.f());
                    ManagerApp.h().n();
                    obj1 = com.tinder.managers.aa.a();
                    if (!TextUtils.isEmpty(((CharSequence) (obj1))))
                    {
                        sparksevent.put("tinderPlusSku", obj1);
                    }
                    return sparksevent;
_L2:
                    byte0 = flag;
                    if (!a.i)
                    {
                        byte0 = flag;
                        if (a.b())
                        {
                            byte0 = 1;
                        }
                    }
                    if (true) goto _L4; else goto _L3
_L3:
                }

            
            {
                d = z.this;
                a = ad1;
                b = ae1;
                c = user;
                super();
            }
            });
            obj.a = new com.tinder.utils.e.c() {

                final z a;

                public final void a(Object obj1)
                {
                    com.tinder.managers.a.a((SparksEvent)obj1);
                }

            
            {
                a = z.this;
                super();
            }
            };
            ((e) (obj)).a(false);
            return;
        }
    }

    public final void a(int k, int i1, String s1, String s2, y y, boolean flag, boolean flag1, 
            ProfilePhoto profilephoto)
    {
        (new StringBuilder("photoIdToDelete=")).append(s1).append(", photoIdAdded=").append(s2).append(", isDeletingAfterAdd=").append(flag).append(", isMain=").append(flag1);
        JSONObject jsonobject = new JSONObject();
        try
        {
            JSONArray jsonarray = new JSONArray();
            jsonarray.put(s1);
            jsonobject.put("assets", jsonarray);
            jsonobject.toString();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            v.b(s1.getMessage());
        }
        (new AsyncTask(jsonobject, flag, flag1, k, i1, s2, y, profilephoto) {

            final JSONObject a;
            final boolean b;
            final boolean c;
            final int d;
            final int e;
            final String f;
            final y g;
            final ProfilePhoto h;
            final z i;

            private transient Boolean a()
            {
                Object obj;
                obj = (new com.squareup.okhttp.t.a()).a(i.a.e).a("DELETE", new u(this) {

                    final _cls7 a;

                    public final r a()
                    {
                        return r.a("application/json");
                    }

                    public final void a(okio.d d1)
                        throws IOException
                    {
                        d1.c(a.a.toString().getBytes());
                    }

            
            {
                a = _pcls7;
                super();
            }
                }).b("User-Agent", f.a);
                ManagerApp.h().g();
                obj = ((com.squareup.okhttp.t.a) (obj)).b("X-Auth-Token", com.tinder.managers.d.b()).b("os-version", f.ab).b("app-version", f.ac).b("platform", "android").a();
                int j1 = -1;
                try
                {
                    obj = i.c.a(((com.squareup.okhttp.t) (obj))).a();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    v.a("FAiled to delete photo", ((Throwable) (obj)));
                    return Boolean.valueOf(false);
                }
                if (obj == null)
                {
                    break MISSING_BLOCK_LABEL_116;
                }
                j1 = ((com.squareup.okhttp.v) (obj)).h.c;
                if (j1 != 200)
                {
                    return Boolean.valueOf(false);
                }
                ArrayList arraylist;
                try
                {
                    obj = ((com.squareup.okhttp.v) (obj)).g.e();
                }
                catch (IOException ioexception)
                {
                    v.a("Failed to parse body of photo delete to string", ioexception);
                    return Boolean.valueOf(false);
                }
                arraylist = new ArrayList(6);
                try
                {
                    ManagerApp.h().d();
                    UserParse.a(new JSONArray(((String) (obj))), arraylist, i.b().getId());
                }
                catch (Exception exception)
                {
                    v.a("Failed to parse into json delete photo response", exception);
                    return Boolean.valueOf(false);
                }
                i.a(arraylist);
                return Boolean.valueOf(true);
            }

            protected final Object doInBackground(Object aobj[])
            {
                return a();
            }

            public final void onPostExecute(Object obj)
            {
                if (((Boolean)obj).booleanValue())
                {
                    if (b)
                    {
                        if (c)
                        {
                            i.a(d, e, f, i.b().getOtherPhotoIds(f), g, h);
                            return;
                        } else
                        {
                            g.a(e, h);
                            return;
                        }
                    } else
                    {
                        g.b(e);
                        return;
                    }
                }
                if (b)
                {
                    g.a(e);
                    return;
                } else
                {
                    g.c(e);
                    return;
                }
            }

            
            {
                i = z.this;
                a = jsonobject;
                b = flag;
                c = flag1;
                d = k;
                e = i1;
                f = s1;
                g = y1;
                h = profilephoto;
                super();
            }
        }).execute(null);
    }

    public final void a(int k, int i1, String s1, ArrayList arraylist, y y, ProfilePhoto profilephoto)
    {
        JSONObject jsonobject = new JSONObject();
        Object obj;
        obj = new JSONArray();
        ((JSONArray) (obj)).put(s1);
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); ((JSONArray) (obj)).put((String)arraylist.next())) { }
          goto _L1
_L3:
        arraylist = a.e;
        obj = new com.android.volley.i.b(y, i1, profilephoto, k) {

            final boolean a = true;
            final y b;
            final int c;
            final ProfilePhoto d;
            final int e;
            final z f;

            public final void a(Object obj1)
            {
                obj1 = (JSONArray)obj1;
                ((JSONArray) (obj1)).toString();
                ArrayList arraylist1 = new ArrayList(6);
                User user = f.b();
                ManagerApp.h().d();
                UserParse.a(((JSONArray) (obj1)), arraylist1, user.getId());
                f.a(arraylist1);
                if (a)
                {
                    b.a(c, d);
                    return;
                }
                try
                {
                    b.a(e, c);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1)
                {
                    ((Exception) (obj1)).toString();
                }
                Crashlytics.a(((Exception) (obj1)).toString());
                if (a)
                {
                    b.a(c, d);
                    return;
                } else
                {
                    b.b(e, c);
                    return;
                }
            }

            
            {
                f = z.this;
                b = y1;
                c = k;
                d = profilephoto;
                e = i1;
                super();
            }
        };
        s1 = new com.android.volley.i.a(y, i1, k, s1, profilephoto) {

            final boolean a = true;
            final y b;
            final int c;
            final int d;
            final String e;
            final ProfilePhoto f;
            final z g;

            public final void a(VolleyError volleyerror)
            {
                v.b((new StringBuilder()).append(volleyerror).append(" : ").append(volleyerror.getMessage()).toString());
                if (a)
                {
                    b.a(c);
                    g.a(d, c, e, null, new y(this) {

                        final _cls4 a;

                        public final void a()
                        {
                        }

                        public final void a(int k)
                        {
                        }

                        public final void a(int k, int i1)
                        {
                        }

                        public final void a(int k, ProfilePhoto profilephoto)
                        {
                        }

                        public final void a(List list)
                        {
                        }

                        public final void b()
                        {
                        }

                        public final void b(int k)
                        {
                        }

                        public final void b(int k, int i1)
                        {
                        }

                        public final void c(int k)
                        {
                        }

            
            {
                a = _pcls4;
                super();
            }
                    }, false, false, f);
                    return;
                } else
                {
                    b.b(d, c);
                    return;
                }
            }

            
            {
                g = z.this;
                b = y1;
                c = k;
                d = i1;
                e = s1;
                f = profilephoto;
                super();
            }
        };
        ManagerApp.h().g();
        s1 = new c(arraylist, jsonobject, ((com.android.volley.i.b) (obj)), s1, com.tinder.managers.d.b());
        s1.j = new com.android.volley.c(20000, 3, 1.0F);
        ManagerApp.b().a(s1);
        return;
_L1:
        try
        {
            jsonobject.put("change_order", obj);
            jsonobject.toString();
        }
        // Misplaced declaration of an exception variable
        catch (ArrayList arraylist)
        {
            v.b(arraylist.getMessage());
        }
        if (true) goto _L3; else goto _L2
_L2:
    }

    public final void a(ab ab)
    {
        String s1 = a.j;
        com.android.volley.i.b b1 = new com.android.volley.i.b(ab) {

            final ab a;
            final z b;

            public final void a(Object obj)
            {
                obj = (JSONObject)obj;
                (new StringBuilder("my profile: ")).append(obj);
                try
                {
                    obj = b.a(true, ((JSONObject) (obj)));
                    a.onProfileLoaded(((a) (obj)).d);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    v.b((new StringBuilder("Error getting my profile: ")).append(obj).toString());
                }
                a.onProfileLoadFailed();
            }

            
            {
                b = z.this;
                a = ab1;
                super();
            }
        };
        ab = new com.android.volley.i.a(ab) {

            final ab a;
            final z b;

            public final void a(VolleyError volleyerror)
            {
                v.b((new StringBuilder("Failed to get my profile: ")).append(v.a(volleyerror)).toString());
                a.onProfileLoadFailed();
            }

            
            {
                b = z.this;
                a = ab1;
                super();
            }
        };
        ManagerApp.h().g();
        ab = new d(0, s1, null, b1, ab, com.tinder.managers.d.b());
        ManagerApp.b().a(ab);
    }

    public final void a(String s1, ab ab)
    {
        JSONObject jsonobject = new JSONObject();
        Date date = ae.o();
        if (date == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        jsonobject.put("last_activity_date", DateUtils.b().format(date));
        jsonobject.put("locale", t.a());
_L2:
        String s2 = (new StringBuilder()).append(a.f).append(s1).toString();
        s1 = new com.android.volley.i.b(s1, ab) {

            final String a;
            final ab b;
            final z c;

            public final void a(Object obj)
            {
                obj = (JSONObject)obj;
                (new StringBuilder("LOADED EVENT_MENU_PROFILE FOR UID: ")).append(a);
                (new StringBuilder("user response: ")).append(((JSONObject) (obj)).toString());
                try
                {
                    obj = ManagerApp.h().d().a(((JSONObject) (obj)).getJSONObject("results"));
                    b.onProfileLoaded(((User) (obj)));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    v.b(((Exception) (obj)).getMessage());
                }
                b.onProfileLoadFailed();
            }

            
            {
                c = z.this;
                a = s1;
                b = ab1;
                super();
            }
        };
        ab = new com.android.volley.i.a(ab) {

            final ab a;
            final z b;

            public final void a(VolleyError volleyerror)
            {
                ManagerApp.h().g().a(volleyerror.getMessage(), new com.tinder.e.n(this) {

                    final _cls12 a;

                    public final void a()
                    {
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
                });
                v.b((new StringBuilder("error loading user: ")).append(volleyerror).append(", ").append(volleyerror.getMessage()).toString());
                a.onProfileLoadFailed();
            }

            
            {
                b = z.this;
                a = ab1;
                super();
            }
        };
        ManagerApp.h().g();
        s1 = new d(0, s2, jsonobject, s1, ab, com.tinder.managers.d.b());
        s1.j = new com.android.volley.c(20000, 0, 1.0F);
        ManagerApp.b().a(s1);
        return;
        JSONException jsonexception;
        jsonexception;
        v.b(jsonexception.toString());
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void a(String s1, g g1)
    {
        s1 = String.format(a.M, new Object[] {
            s1
        });
        com.android.volley.i.b b1 = new com.android.volley.i.b(g1) {

            final g a;
            final z b;

            public final void a(Object obj)
            {
                obj = (JSONObject)obj;
                obj = ManagerApp.h().d().a(((JSONObject) (obj)), false);
                a.a((ConnectionsGroup)((Pair) (obj)).second, 0);
            }

            
            {
                b = z.this;
                a = g1;
                super();
            }
        };
        g1 = new com.android.volley.i.a(g1) {

            final g a;
            final z b;

            public final void a(VolleyError volleyerror)
            {
                a.c(0);
                v.a("Failed to load common connections", volleyerror);
            }

            
            {
                b = z.this;
                a = g1;
                super();
            }
        };
        ManagerApp.h().g();
        s1 = new d(0, s1, null, b1, g1, com.tinder.managers.d.b());
        ManagerApp.b().a(s1);
    }

    final void a(ArrayList arraylist)
    {
        this;
        JVM INSTR monitorenter ;
        i.setPhotos(arraylist);
        m.a(i.getId());
        m.a(arraylist, i.getId());
        this;
        JVM INSTR monitorexit ;
        return;
        arraylist;
        throw arraylist;
    }

    public final void a(ArrayList arraylist, ArrayList arraylist1, y y)
    {
        JSONObject jsonobject;
        if (arraylist.size() != arraylist1.size())
        {
            throw new IllegalStateException("The number of photo ids should match the number of indices handed in.");
        }
        (new StringBuilder("photoIdsToDelete=")).append(arraylist);
        jsonobject = new JSONObject();
        Object obj;
        obj = new JSONArray();
        for (Iterator iterator = arraylist.iterator(); iterator.hasNext(); ((JSONArray) (obj)).put((String)iterator.next())) { }
          goto _L1
_L3:
        (new AsyncTask(jsonobject, arraylist, y, arraylist1) {

            final JSONObject a;
            final ArrayList b;
            final y c;
            final ArrayList d;
            final z e;

            private transient Boolean a()
            {
                Object obj1;
                obj1 = (new com.squareup.okhttp.t.a()).a(e.a.e).a("DELETE", new u(this) {

                    final _cls8 a;

                    public final r a()
                    {
                        return r.a("application/json");
                    }

                    public final void a(okio.d d1)
                        throws IOException
                    {
                        d1.c(a.a.toString().getBytes());
                    }

            
            {
                a = _pcls8;
                super();
            }
                }).b("User-Agent", f.a);
                ManagerApp.h().g();
                obj1 = ((com.squareup.okhttp.t.a) (obj1)).b("X-Auth-Token", com.tinder.managers.d.b()).b("os-version", f.ab).b("app-version", f.ac).b("platform", "android").a();
                int k = -1;
                try
                {
                    obj1 = e.c.a(((com.squareup.okhttp.t) (obj1))).a();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1)
                {
                    v.a("Failed to delete photo", ((Throwable) (obj1)));
                    return Boolean.valueOf(false);
                }
                if (obj1 == null)
                {
                    break MISSING_BLOCK_LABEL_116;
                }
                k = ((com.squareup.okhttp.v) (obj1)).h.c;
                if (k != 200)
                {
                    return Boolean.valueOf(false);
                }
                ArrayList arraylist2;
                try
                {
                    obj1 = ((com.squareup.okhttp.v) (obj1)).g.e();
                }
                catch (IOException ioexception)
                {
                    v.a("Failed to parse body of photo delete to string", ioexception);
                    return Boolean.valueOf(false);
                }
                arraylist2 = new ArrayList(6);
                try
                {
                    ManagerApp.h().d();
                    UserParse.a(new JSONArray(((String) (obj1))), arraylist2, e.b().getId());
                }
                catch (Exception exception)
                {
                    v.a("Failed to parse into json delete photo response", exception);
                    return Boolean.valueOf(false);
                }
                e.a(arraylist2);
                return Boolean.valueOf(true);
            }

            protected final Object doInBackground(Object aobj[])
            {
                return a();
            }

            public final void onPostExecute(Object obj1)
            {
                if (!((Boolean)obj1).booleanValue()) goto _L2; else goto _L1
_L1:
                if (b.size() != 1) goto _L4; else goto _L3
_L3:
                c.b(((Integer)d.get(0)).intValue());
_L6:
                return;
_L4:
                c.a(d);
                return;
_L2:
                int k = 0;
                while (k < b.size()) 
                {
                    c.c(((Integer)d.get(k)).intValue());
                    k++;
                }
                if (true) goto _L6; else goto _L5
_L5:
            }

            
            {
                e = z.this;
                a = jsonobject;
                b = arraylist;
                c = y1;
                d = arraylist1;
                super();
            }
        }).execute(null);
        return;
_L1:
        try
        {
            jsonobject.put("assets", obj);
            jsonobject.toString();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            v.a("Failed to make json for photo delete", ((Throwable) (obj)));
        }
        if (true) goto _L3; else goto _L2
_L2:
    }

    public final void a(JSONObject jsonobject, aq aq)
    {
        String s1 = a.j;
        aq = new com.android.volley.i.b(aq) {

            final aq a;
            final z b;

            public final void a(Object obj)
            {
                obj = (JSONObject)obj;
                (new StringBuilder("Updated profile: ")).append(obj);
                try
                {
                    b.a(true, ((JSONObject) (obj)));
                    a.u();
                    b.a();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    v.b((new StringBuilder("Error updating profile: ")).append(obj).toString());
                }
                a.v();
            }

            
            {
                b = z.this;
                a = aq1;
                super();
            }
        };
        com.android.volley.i.a a1 = new com.android.volley.i.a() {

            final z a;

            public final void a(VolleyError volleyerror)
            {
                v.b((new StringBuilder("Failed to update profile: ")).append(v.a(volleyerror)).toString());
            }

            
            {
                a = z.this;
                super();
            }
        };
        ManagerApp.h().g();
        jsonobject = new d(1, s1, jsonobject, aq, a1, com.tinder.managers.d.b());
        ManagerApp.b().a(jsonobject);
    }

    public final void a(ProfilePhoto aprofilephoto[], y y)
    {
        JSONObject jsonobject = new JSONObject();
        Object obj = new JSONArray();
        int k = 0;
_L2:
        if (k >= aprofilephoto.length)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        ProfilePhoto profilephoto;
        profilephoto = aprofilephoto[k];
        if (profilephoto == null)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        ((JSONArray) (obj)).put(profilephoto.getPhotoId());
        break MISSING_BLOCK_LABEL_156;
        try
        {
            jsonobject.put("change_order", obj);
            jsonobject.toString();
        }
        // Misplaced declaration of an exception variable
        catch (ProfilePhoto aprofilephoto[])
        {
            v.b(aprofilephoto.getMessage());
        }
        aprofilephoto = a.e;
        obj = new com.android.volley.i.b(y) {

            final y a;
            final z b;

            public final void a(Object obj1)
            {
                obj1 = (JSONArray)obj1;
                ((JSONArray) (obj1)).toString();
                ArrayList arraylist;
                User user;
                try
                {
                    arraylist = new ArrayList(6);
                    user = b.b();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1)
                {
                    ((Exception) (obj1)).toString();
                    Crashlytics.a(((Exception) (obj1)).toString());
                    return;
                }
                if (user == null)
                {
                    break MISSING_BLOCK_LABEL_50;
                }
                ManagerApp.h().d();
                UserParse.a(((JSONArray) (obj1)), arraylist, user.getId());
                b.a(arraylist);
                return;
            }

            
            {
                b = z.this;
                a = y;
                super();
            }
        };
        y = new com.android.volley.i.a(y) {

            final y a;
            final z b;

            public final void a(VolleyError volleyerror)
            {
                v.b((new StringBuilder()).append(volleyerror).append(" : ").append(volleyerror.getMessage()).toString());
            }

            
            {
                b = z.this;
                a = y;
                super();
            }
        };
        ManagerApp.h().g();
        aprofilephoto = new c(aprofilephoto, jsonobject, ((com.android.volley.i.b) (obj)), y, com.tinder.managers.d.b());
        aprofilephoto.j = new com.android.volley.c(20000, 3, 1.0F);
        ManagerApp.b().a(aprofilephoto);
        return;
        k++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final User b()
    {
        if (i == null)
        {
            i = n.a(ae.p());
        }
        return i;
    }

    // Unreferenced inner class com/tinder/managers/z$14

/* anonymous class */
    public final class _cls14
        implements com.android.volley.i.b
    {

        final com.android.volley.i.b a;
        final z b;

        public final volatile void a(Object obj)
        {
            obj = (String)obj;
            a.a(obj);
        }

            public 
            {
                b = z.this;
                a = b1;
                super();
            }
    }


    // Unreferenced inner class com/tinder/managers/z$15

/* anonymous class */
    public final class _cls15
        implements com.android.volley.i.a
    {

        final com.android.volley.i.a a;
        final z b;

        public final void a(VolleyError volleyerror)
        {
            a.a(volleyerror);
        }

            public 
            {
                b = z.this;
                a = a1;
                super();
            }
    }


    // Unreferenced inner class com/tinder/managers/z$20

/* anonymous class */
    public final class _cls20
        implements com.android.volley.i.b
    {

        final y a;
        final z b;

        public final void a(Object obj)
        {
            obj = (JSONArray)obj;
            ((JSONArray) (obj)).toString();
            try
            {
                ArrayList arraylist = new ArrayList();
                User user = b.b();
                ManagerApp.h().d();
                UserParse.a(((JSONArray) (obj)), arraylist, user.getId());
                b.a(arraylist);
                a.a();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                String.valueOf(obj);
            }
            Crashlytics.a(((Exception) (obj)).toString());
            a.b();
        }

            public 
            {
                b = z.this;
                a = y1;
                super();
            }
    }


    // Unreferenced inner class com/tinder/managers/z$21

/* anonymous class */
    public final class _cls21
        implements com.android.volley.i.a
    {

        final y a;
        final z b;

        public final void a(VolleyError volleyerror)
        {
            v.b((new StringBuilder()).append(volleyerror).append(" : ").append(volleyerror.getMessage()).toString());
            a.b();
        }

            public 
            {
                b = z.this;
                a = y1;
                super();
            }
    }


    // Unreferenced inner class com/tinder/managers/z$5

/* anonymous class */
    public final class _cls5
        implements com.android.volley.i.b
    {

        final ProfilePhoto a;
        final ProfilePhoto b;
        final String c;
        final int d;
        final int e;
        final y f;
        final boolean g;
        final z h;

        public final void a(Object obj)
        {
            ArrayList arraylist;
            obj = (JSONObject)obj;
            ((JSONObject) (obj)).toString();
            Object obj1;
            try
            {
                obj = ((JSONObject) (obj)).getJSONArray("assets");
                arraylist = new ArrayList(6);
                obj1 = h.b();
                ManagerApp.h().d();
                UserParse.a(((JSONArray) (obj)), arraylist, ((User) (obj1)).getId());
                obj1 = com.tinder.managers.z.a(a, arraylist);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                v.b(((Exception) (obj)).toString());
                Crashlytics.a(((Exception) (obj)).toString());
                f.a(e);
                return;
            }
            obj = obj1;
            if (obj1 != null)
            {
                break MISSING_BLOCK_LABEL_73;
            }
            obj = b;
            obj1 = ((ProfilePhoto)arraylist.get(arraylist.size() - 1)).getPhotoId();
            com.tinder.managers.z.a(((ProfilePhoto) (obj)).getProcessedPhoto(UserPhotoSize.LARGE).imageUrl);
            if (c != null)
            {
                h.a(d, e, c, ((String) (obj1)), f, true, g, ((ProfilePhoto) (obj)));
                return;
            }
            if (g)
            {
                h.a(d, e, ((String) (obj1)), h.b().getOtherPhotoIds(((String) (obj1))), f, ((ProfilePhoto) (obj)));
                return;
            }
            h.a(arraylist);
            f.a(e, ((ProfilePhoto) (obj)));
            return;
        }

            public 
            {
                h = z.this;
                a = profilephoto;
                b = profilephoto1;
                c = s1;
                d = k;
                e = i1;
                f = y1;
                g = flag;
                super();
            }
    }


    // Unreferenced inner class com/tinder/managers/z$6

/* anonymous class */
    public final class _cls6
        implements com.android.volley.i.a
    {

        final y a;
        final int b;
        final z c;

        public final void a(VolleyError volleyerror)
        {
            volleyerror = c.a.e;
            a.a(b);
        }

            public 
            {
                c = z.this;
                a = y1;
                b = k;
                super();
            }
    }

}
