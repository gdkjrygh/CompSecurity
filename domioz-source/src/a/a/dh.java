// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.f;
import com.appboy.f.a;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package a.a:
//            cp, fn, dm, fm, 
//            cd, jx, jw, jy, 
//            df

public class dh extends cp
{

    static final fm a = (new fn()).c("twitter").c("facebook").a();
    private static final String b;
    private final SharedPreferences c;
    private final df d;

    public dh(Context context, df df)
    {
        this(context, null, null, df);
    }

    public dh(Context context, String s, String s1, df df)
    {
        c = context.getSharedPreferences((new StringBuilder("com.appboy.storage.usercache")).append(dm.b(s, s1)).toString(), 0);
        d = df;
    }

    private cd c()
    {
        JSONObject jsonobject = new JSONObject(c.getAll());
        Iterator iterator = jsonobject.keys();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            try
            {
                if (jsonobject.get(s).equals("appboy_null_5a8579f5-079b-4681-a046-0f3c46a4ef58"))
                {
                    jsonobject.put(s, JSONObject.NULL);
                }
            }
            catch (JSONException jsonexception)
            {
                com.appboy.f.a.c(b, String.format("Failed to check outbound json key %s for null placeholders.", new Object[] {
                    s
                }));
            }
        } while (true);
        iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            try
            {
                if (c.contains(s1))
                {
                    jsonobject.put(s1, new JSONObject(c.getString(s1, "")));
                }
            }
            catch (JSONException jsonexception1)
            {
                com.appboy.f.a.c(b, String.format("Failed to properly convert [%s] value to OutboundUser for export.", new Object[] {
                    s1
                }));
            }
        } while (true);
        return new cd(jsonobject);
    }

    public final Object a()
    {
        return c();
    }

    final void a(Object obj)
    {
        Object obj1 = (cd)obj;
        if (obj1 != null)
        {
            obj = c.edit();
            obj1 = ((cd) (obj1)).a;
            Map map = c.getAll();
            Iterator iterator = ((JSONObject) (obj1)).keys();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj2 = (String)iterator.next();
                if (map.containsKey(obj2))
                {
                    Object obj3 = map.get(obj2);
                    Object obj4 = ((JSONObject) (obj1)).opt(((String) (obj2)));
                    if (obj4 == null)
                    {
                        if (obj3 == null)
                        {
                            ((android.content.SharedPreferences.Editor) (obj)).remove(((String) (obj2)));
                        }
                    } else
                    if (obj4 instanceof JSONObject)
                    {
                        try
                        {
                            if (a.a.jw.a(String.valueOf(obj3), obj4.toString(), jx.c).a)
                            {
                                ((android.content.SharedPreferences.Editor) (obj)).remove(((String) (obj2)));
                            }
                        }
                        // Misplaced declaration of an exception variable
                        catch (Object obj2)
                        {
                            ((JSONException) (obj2)).printStackTrace();
                        }
                    } else
                    if (obj4.equals(obj3))
                    {
                        ((android.content.SharedPreferences.Editor) (obj)).remove(((String) (obj2)));
                    } else
                    if (obj4.equals(JSONObject.NULL))
                    {
                        ((android.content.SharedPreferences.Editor) (obj)).remove(((String) (obj2)));
                    }
                }
            } while (true);
            ((android.content.SharedPreferences.Editor) (obj)).apply();
        }
    }

    static 
    {
        b = String.format("%s.%s", new Object[] {
            f.a, a/a/dh.getName()
        });
    }
}
