// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;
import com.android.volley.a.i;
import com.appboy.enums.Gender;
import com.appboy.models.outgoing.FacebookUser;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import com.facebook.j;
import com.facebook.login.d;
import com.tinder.e.g;
import com.tinder.model.CommonConnection;
import com.tinder.model.ConnectionsGroup;
import com.tinder.utils.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            ManagerApp, d, i

public final class f
{
    public static interface a
    {

        public abstract void a(String s);
    }


    public final Set a = new HashSet(12);
    public final Set b = new HashSet(12);
    public Set c;
    private com.tinder.managers.d d;
    private com.tinder.managers.i e;

    public f(com.tinder.managers.i j, com.tinder.managers.d d1)
    {
        d = d1;
        e = j;
        Collections.addAll(a, new String[] {
            "user_likes", "email", "user_birthday", "user_relationship_details", "user_education_history", "user_friends", "user_photos"
        });
        Collections.addAll(b, new String[] {
            "user_work_history"
        });
    }

    public static String a()
    {
        if (AccessToken.a() == null)
        {
            return null;
        } else
        {
            return AccessToken.a().d;
        }
    }

    public static void a(ConnectionsGroup connectionsgroup, int j, g g)
    {
        if (connectionsgroup == null)
        {
            return;
        }
        List list = connectionsgroup.getUnbuiltIds();
        String s = a();
        int l = list.size();
        StringBuffer stringbuffer = new StringBuffer();
        for (int k = 0; k < l; k++)
        {
            stringbuffer.append((String)list.get(k));
            if (k + 1 != l)
            {
                stringbuffer.append(',');
            }
        }

        connectionsgroup = new i(0, String.format("https://graph.facebook.com/?access_token=%s&ids=%s&fields=id,name,picture.width(%d).height(%d).fields(url)", new Object[] {
            s, stringbuffer.toString(), Integer.valueOf(j), Integer.valueOf(j)
        }), null, new com.android.volley.i.b(connectionsgroup, list, g) {

            final ConnectionsGroup a;
            final List b;
            final g c;

            public final void a(Object obj)
            {
                JSONObject jsonobject = (JSONObject)obj;
                ConnectionsGroup connectionsgroup1;
                ConnectionsGroup connectionsgroup2;
                ArrayList arraylist;
                Iterator iterator;
                connectionsgroup1 = a;
                obj = b;
                connectionsgroup2 = a;
                arraylist = new ArrayList(((List) (obj)).size());
                iterator = ((List) (obj)).iterator();
_L4:
                if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
                String s1;
                int i1;
                s1 = (String)iterator.next();
                i1 = ((CommonConnection)connectionsgroup2.getUnbuiltConnections().get(s1)).degree;
                obj = jsonobject.optJSONObject(s1);
                if (obj == null) goto _L4; else goto _L3
_L3:
                String s2;
                try
                {
                    s2 = ((JSONObject) (obj)).optString("name", null);
                    obj = ((JSONObject) (obj)).optJSONObject("picture");
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    v.a("Failed to fill in and load common connections", ((Throwable) (obj)));
                    c.c(1);
                    return;
                }
                if (obj == null)
                {
                    break MISSING_BLOCK_LABEL_210;
                }
                obj = ((JSONObject) (obj)).optJSONObject("data");
                if (obj == null)
                {
                    break MISSING_BLOCK_LABEL_210;
                }
                obj = ((JSONObject) (obj)).optString("url", null);
_L5:
                arraylist.add(new CommonConnection(s1, i1, s2, ((String) (obj)), ((String) (obj)), ((String) (obj))));
                  goto _L4
_L2:
                connectionsgroup1.fillIn(arraylist);
                a.setIgnoreUnresolvableIds(true);
                c.a(a, 1);
                return;
                obj = null;
                  goto _L5
            }

            
            {
                a = connectionsgroup;
                b = list;
                c = g1;
                super();
            }
        }, new com.android.volley.i.a(g) {

            final g a;

            public final void a(VolleyError volleyerror)
            {
                a.c(1);
            }

            
            {
                a = g1;
                super();
            }
        });
        ManagerApp.b().a(connectionsgroup);
    }

    private transient boolean a(String as[])
    {
        as = Arrays.asList(as);
        return a.containsAll(as);
    }

    public final transient void a(Activity activity, String as[])
    {
        (new StringBuilder("permission=")).append(Arrays.toString(as));
        if (!a(as))
        {
            Collections.addAll(a, as);
        }
        com.facebook.login.d.a().a(activity, a);
    }

    public final transient void a(Fragment fragment, String as[])
    {
        (new StringBuilder("permission=")).append(Arrays.toString(as));
        if (!a(as))
        {
            Collections.addAll(a, as);
        }
        com.facebook.login.d.a().a(fragment, a);
    }

    public final void a(com.tinder.utils.d.a a1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "first_name, last_name, email, gender, birthday, likes, friends.limit(1)");
        (new GraphRequest(AccessToken.a(), "/me", bundle, HttpMethod.a, new com.facebook.GraphRequest.b(a1) {

            final com.tinder.utils.d.a a;
            final f b;

            public final void a(j j1)
            {
                JSONObject jsonobject;
                (new StringBuilder("graph response: ")).append(j1);
                jsonobject = j1.a;
                if (jsonobject == null) goto _L2; else goto _L1
_L1:
                int k;
                j1 = jsonobject.optString("gender");
                k = -1;
                j1.hashCode();
                JVM INSTR lookupswitch 2: default 64
            //                           -1278174388: 199
            //                           3343885: 184;
                   goto _L3 _L4 _L5
_L3:
                k;
                JVM INSTR tableswitch 0 1: default 88
            //                           0 214
            //                           1 221;
                   goto _L6 _L7 _L8
_L6:
                Object obj;
                Object obj1;
                j1 = Gender.MALE;
                break; /* Loop/switch isn't completed */
_L5:
                if (j1.equals("male"))
                {
                    k = 0;
                }
                continue; /* Loop/switch isn't completed */
_L4:
                if (j1.equals("female"))
                {
                    k = 1;
                }
                continue; /* Loop/switch isn't completed */
_L7:
                j1 = Gender.MALE;
                  goto _L9
_L8:
                j1 = Gender.FEMALE;
_L9:
                obj1 = jsonobject.optJSONObject("likes");
                obj = null;
                if (obj1 != null)
                {
                    obj = ((JSONObject) (obj1)).optJSONArray("data");
                }
                if (obj != null)
                {
                    k = ((JSONArray) (obj)).length();
                } else
                {
                    k = 0;
                }
                obj1 = new ArrayList(k);
                if (obj != null)
                {
                    for (k = 0; k < ((JSONArray) (obj)).length(); k++)
                    {
                        String s = ((JSONArray) (obj)).optString(k);
                        if (s != null)
                        {
                            ((Collection) (obj1)).add(s);
                        }
                    }

                }
                obj = jsonobject.optJSONObject("friends");
                if (obj == null) goto _L11; else goto _L10
_L10:
                obj = ((JSONObject) (obj)).optJSONObject("summary");
                if (obj == null) goto _L11; else goto _L12
_L12:
                k = ((JSONObject) (obj)).optInt("total_count");
_L14:
                j1 = new FacebookUser(jsonobject.optString("id"), jsonobject.optString("first_name"), jsonobject.optString("last_name"), jsonobject.optString("email"), "", "", j1, Integer.valueOf(k), ((Collection) (obj1)), jsonobject.optString("birthday"));
                a.a(j1);
_L2:
                return;
_L11:
                k = 0;
                if (true) goto _L14; else goto _L13
_L13:
                if (true) goto _L3; else goto _L15
_L15:
            }

            
            {
                b = f.this;
                a = a1;
                super();
            }
        })).b();
    }

    public final boolean a(String s)
    {
        (new StringBuilder("mActualPermissions=")).append(c);
        AccessToken accesstoken = AccessToken.a();
        if (accesstoken != null)
        {
            c = accesstoken.b;
            return c.contains(s);
        } else
        {
            return false;
        }
    }

    public final String[] b()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(a);
        arraylist.addAll(b);
        return (String[])arraylist.toArray(new String[arraylist.size()]);
    }

    // Unreferenced inner class com/tinder/managers/f$4

/* anonymous class */
    public final class _cls4
        implements com.android.volley.i.b
    {

        final a a;
        final f b;

        public final void a(Object obj)
        {
            obj = (JSONObject)obj;
            ((JSONObject) (obj)).toString();
            obj = ((JSONObject) (obj)).optString("email", null);
            a.a(((String) (obj)));
        }

            public 
            {
                b = f.this;
                a = a1;
                super();
            }
    }


    // Unreferenced inner class com/tinder/managers/f$5

/* anonymous class */
    public final class _cls5
        implements com.android.volley.i.a
    {

        final a a;
        final f b;

        public final void a(VolleyError volleyerror)
        {
            volleyerror.toString();
            a.a(null);
        }

            public 
            {
                b = f.this;
                a = a1;
                super();
            }
    }


    // Unreferenced inner class com/tinder/managers/f$6

/* anonymous class */
    public final class _cls6 extends i
    {

        final f m;

        public final Map d()
            throws AuthFailureError
        {
            HashMap hashmap = new HashMap(1);
            hashmap.put("Content-Type", "application/json");
            return hashmap;
        }

            public 
            {
                m = f.this;
                super(0, s, null, b1, a1);
            }
    }

}
