// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

final class fvk
    implements ezy
{

    private final noz a;
    private SharedPreferences b;

    public fvk(Context context)
    {
        b = context.getSharedPreferences("com.google.android.apps.photos.localmedia", 0);
        a = noz.a(context, "LocalMediaDreamCollectionProvider", new String[0]);
    }

    public final Object a()
    {
        return "com.google.android.apps.photos.localmedia.core.LocalMediaCore";
    }

    public final Set a(int i)
    {
        Object obj = b.getStringSet("dream_local", new HashSet());
        HashSet hashset = new HashSet();
        for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            Object obj1 = (String)((Iterator) (obj)).next();
            try
            {
                obj1 = new JSONObject(((String) (obj1)));
                List list = Collections.singletonList(Integer.valueOf(((JSONObject) (obj1)).getInt("bucket")));
                hashset.add(new fux(((JSONObject) (obj1)).getBoolean("camera"), list, 0L, i, elm.a));
            }
            catch (JSONException jsonexception) { }
        }

        return hashset;
    }

    public final void a(int i, Set set)
    {
        HashSet hashset = new HashSet();
        for (set = set.iterator(); set.hasNext();)
        {
            Object obj = (fux)(ekq)set.next();
            boolean flag = ((fux) (obj)).b();
            obj = ((fux) (obj)).b;
            JSONObject jsonobject = new JSONObject();
            try
            {
                if (((List) (obj)).size() > 0)
                {
                    jsonobject.put("bucket", ((List) (obj)).get(0)).put("camera", flag);
                }
                hashset.add(jsonobject.toString());
            }
            catch (JSONException jsonexception) { }
        }

        b.edit().putStringSet("dream_local", hashset).apply();
    }
}
