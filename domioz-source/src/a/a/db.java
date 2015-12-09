// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.c.a;
import com.appboy.d.a.c;
import com.appboy.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package a.a:
//            dp, dc, bm, at

public class db
{

    public static final String a;
    private static final dp f = a.a.dp.a(";").b();
    public final SharedPreferences b;
    public final Set c;
    public final Set d;
    public at e;

    public db(Context context, String s)
    {
        String s1;
        if (s == null)
        {
            s1 = "";
        } else
        {
            s1 = (new StringBuilder(".")).append(s).toString();
        }
        b = context.getSharedPreferences((new StringBuilder("com.appboy.storage.feedstorageprovider")).append(s1).toString(), 0);
        c = a(dc.b);
        d = a(a.a.dc.a);
        context = b.edit();
        context.putString("uid", s);
        context.apply();
    }

    private Set a(dc dc1)
    {
        Object obj = dc1.c;
        String s = dc1.d;
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            return b(b.getString(s, null));
        }
        if (b.contains(s))
        {
            obj = b(b.getString(s, null));
            android.content.SharedPreferences.Editor editor = b.edit();
            editor.remove(s);
            editor.apply();
            a(((Set) (obj)), dc1);
            return ((Set) (obj));
        } else
        {
            return b.getStringSet(((String) (obj)), new HashSet());
        }
    }

    public static Set a(JSONArray jsonarray)
    {
        HashSet hashset = new HashSet();
        if (jsonarray != null)
        {
            for (int i = 0; i < jsonarray.length(); i++)
            {
                JSONObject jsonobject = jsonarray.getJSONObject(i);
                if (jsonobject.has("id"))
                {
                    hashset.add(jsonobject.getString("id"));
                }
            }

        }
        return hashset;
    }

    private static Set b(String s)
    {
        HashSet hashset = new HashSet();
        if (s != null)
        {
            Collections.addAll(hashset, s.split(";"));
        }
        return hashset;
    }

    public final a a(JSONArray jsonarray, String s, boolean flag, long l)
    {
        Iterator iterator;
        if (jsonarray == null || jsonarray.length() == 0)
        {
            jsonarray = new ArrayList();
        } else
        {
            jsonarray = a.a.bm.a(jsonarray, com/appboy/d/a/c, e, this);
        }
        iterator = jsonarray.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            c c1 = (c)iterator.next();
            if (c.contains(c1.j()))
            {
                c1.l();
                c1.n();
            }
            if (d.contains(c1.j()))
            {
                c1.n();
            }
        } while (true);
        return new a(jsonarray, s, flag, l);
    }

    public final void a(String s)
    {
        if (c.contains(s))
        {
            return;
        } else
        {
            c.add(s);
            a(c, dc.b);
            return;
        }
    }

    public final void a(Set set, dc dc1)
    {
        String s = dc1.c;
        dc1 = dc1.d;
        android.content.SharedPreferences.Editor editor = b.edit();
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            if (set == null || set.isEmpty())
            {
                editor.remove(dc1);
            } else
            {
                editor.putString(dc1, f.a(set));
            }
        } else
        if (set == null || set.isEmpty())
        {
            editor.remove(s);
        } else
        {
            editor.putStringSet(s, set);
        }
        editor.apply();
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, a/a/db.getName()
        });
    }
}
