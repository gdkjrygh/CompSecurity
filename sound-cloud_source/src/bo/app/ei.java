// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.b.e;
import com.appboy.b.f;
import com.appboy.d;
import com.appboy.d.b.b;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            dr, gs, eq, gr, 
//            db, kz, ky, la, 
//            el, ab, eg

public class ei extends dr
{

    static final gr a = (new gs()).c("twitter").c("facebook").c("ab_install_attribution").a();
    private static final String b;
    private final SharedPreferences c;
    private final eg d;

    public ei(Context context, eg eg1)
    {
        this(context, null, null, eg1);
    }

    public ei(Context context, String s, String s1, eg eg1)
    {
        c = context.getSharedPreferences((new StringBuilder("com.appboy.storage.usercache")).append(bo.app.eq.b(s, s1)).toString(), 0);
        d = eg1;
    }

    private void a(JSONObject jsonobject, String s)
    {
        android.content.SharedPreferences.Editor editor = null;
        Object obj = editor;
        if (c.contains(s))
        {
            try
            {
                obj = new JSONObject(c.getString(s, ""));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                String.format("Failed to parse existing value for [%s], continuing without it.", new Object[] {
                    s
                });
                obj = editor;
            }
        }
        editor = c.edit();
        if (obj != null && ((JSONObject) (obj)).length() > 0)
        {
            for (Iterator iterator = jsonobject.keys(); iterator.hasNext();)
            {
                String s1 = (String)iterator.next();
                try
                {
                    ((JSONObject) (obj)).put(s1, jsonobject.get(s1));
                }
                catch (JSONException jsonexception)
                {
                    String.format("Failed to fetch value for key [%s], ignoring.", new Object[] {
                        s1
                    });
                }
            }

            editor.putString(s, ((JSONObject) (obj)).toString());
        } else
        {
            editor.putString(s, jsonobject.toString());
        }
        editor.apply();
    }

    private db c()
    {
        JSONObject jsonobject = new JSONObject(c.getAll());
        Object obj = jsonobject.keys();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            String s = (String)((Iterator) (obj)).next();
            try
            {
                if (jsonobject.get(s).equals("appboy_null_5a8579f5-079b-4681-a046-0f3c46a4ef58"))
                {
                    jsonobject.put(s, JSONObject.NULL);
                }
            }
            catch (JSONException jsonexception)
            {
                String.format("Failed to check outbound json key %s for null placeholders.", new Object[] {
                    s
                });
            }
        } while (true);
        obj = a.a();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            String s1 = (String)((Iterator) (obj)).next();
            try
            {
                if (c.contains(s1))
                {
                    jsonobject.put(s1, new JSONObject(c.getString(s1, "")));
                }
            }
            catch (JSONException jsonexception1)
            {
                String.format("Failed to properly convert [%s] value to OutboundUser for export.", new Object[] {
                    s1
                });
            }
        } while (true);
        return new db(jsonobject);
    }

    public final Object a()
    {
        return c();
    }

    public final void a(com.appboy.b.d d1)
    {
        this;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = c.edit();
        if (d1 != null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        editor.putString("gender", null);
_L1:
        editor.apply();
        this;
        JVM INSTR monitorexit ;
        return;
        editor.putString("gender", d1.a());
          goto _L1
        d1;
        throw d1;
    }

    public final void a(f f1)
    {
        this;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = c.edit();
        if (f1 != null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        editor.putString("email_subscribe", null);
_L1:
        editor.apply();
        this;
        JVM INSTR monitorexit ;
        return;
        editor.putString("email_subscribe", f1.a());
          goto _L1
        f1;
        throw f1;
    }

    public final void a(b b1)
    {
        this;
        JVM INSTR monitorenter ;
        a(b1.a(), "ab_install_attribution");
        this;
        JVM INSTR monitorexit ;
        return;
        b1;
        throw b1;
    }

    public final void a(com.appboy.d.b.d d1)
    {
        this;
        JVM INSTR monitorenter ;
        a(d1.a(), "facebook");
        this;
        JVM INSTR monitorexit ;
        return;
        d1;
        throw d1;
    }

    public final void a(com.appboy.d.b.f f1)
    {
        this;
        JVM INSTR monitorenter ;
        a(f1.a(), "twitter");
        this;
        JVM INSTR monitorexit ;
        return;
        f1;
        throw f1;
    }

    final void a(Object obj)
    {
        Object obj1 = (db)obj;
        if (obj1 != null)
        {
            obj = c.edit();
            obj1 = ((db) (obj1)).a;
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
                            if (ky.a(String.valueOf(obj3), obj4.toString(), kz.c).a)
                            {
                                ((android.content.SharedPreferences.Editor) (obj)).remove(((String) (obj2)));
                            }
                        }
                        // Misplaced declaration of an exception variable
                        catch (Object obj2) { }
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

    public final void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = c.edit();
        editor.putString("first_name", s);
        editor.apply();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final boolean a(int i, e e1, int j)
    {
        this;
        JVM INSTR monitorenter ;
        if (e1 != null) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        e1 = el.a(el.a(i, e1.m, j), ab.a);
        android.content.SharedPreferences.Editor editor = c.edit();
        editor.putString("dob", e1);
        editor.apply();
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        e1;
        throw e1;
    }

    public final boolean a(String s, long l)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a(s, el.a(l));
        this;
        JVM INSTR monitorexit ;
        return flag;
        s;
        throw s;
    }

    public final boolean a(String s, Object obj)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        boolean flag = com.appboy.f.e.a(s, d.g());
        if (!flag) goto _L2; else goto _L1
_L1:
        flag = flag1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = flag1;
        if (!com.appboy.f.e.c(s)) goto _L4; else goto _L3
_L3:
        s = com.appboy.f.e.e(s);
        flag = flag1;
        if (obj == null) goto _L4; else goto _L5
_L5:
        android.content.SharedPreferences.Editor editor = c.edit();
        if (!(obj instanceof Boolean)) goto _L7; else goto _L6
_L6:
        editor.putBoolean(s, ((Boolean)obj).booleanValue());
_L8:
        editor.apply();
        flag = true;
          goto _L4
_L7:
        if (!(obj instanceof Integer))
        {
            break MISSING_BLOCK_LABEL_130;
        }
        editor.putInt(s, ((Integer)obj).intValue());
          goto _L8
        s;
        throw s;
label0:
        {
            if (!(obj instanceof Float))
            {
                break label0;
            }
            editor.putFloat(s, ((Float)obj).floatValue());
        }
          goto _L8
label1:
        {
            if (!(obj instanceof Long))
            {
                break label1;
            }
            editor.putLong(s, ((Long)obj).longValue());
        }
          goto _L8
label2:
        {
            if (!(obj instanceof String))
            {
                break label2;
            }
            editor.putString(s, com.appboy.f.e.e((String)obj));
        }
        if (true) goto _L8; else goto _L9
_L9:
        flag = flag1;
        if (!(obj instanceof Date)) goto _L4; else goto _L10
_L10:
        editor.putString(s, el.a((Date)obj, bo.app.ab.b));
          goto _L8
    }

    public final void b(f f1)
    {
        this;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = c.edit();
        if (f1 != null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        editor.putString("push_subscribe", null);
_L1:
        editor.apply();
        this;
        JVM INSTR monitorexit ;
        return;
        editor.putString("push_subscribe", f1.a());
          goto _L1
        f1;
        throw f1;
    }

    public final void b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = c.edit();
        editor.putString("last_name", s);
        editor.apply();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final boolean c(String s)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        String s1;
        s1 = s;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_15;
        }
        s1 = s.trim();
        if (s1 == null) goto _L2; else goto _L1
_L1:
        if (!com.appboy.f.e.a(s1)) goto _L3; else goto _L2
_L2:
        s = c.edit();
        s.putString("email", s1);
        s.apply();
        flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L3:
        String.format("Email address is not valid: %s", new Object[] {
            s1
        });
        if (true) goto _L5; else goto _L4
_L4:
        s;
        throw s;
    }

    public final void d(String s)
    {
        this;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = c.edit();
        editor.putString("country", s);
        editor.apply();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final void e(String s)
    {
        this;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = c.edit();
        editor.putString("home_city", s);
        editor.apply();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final boolean f(String s)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        String s1;
        s1 = s;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_15;
        }
        s1 = s.trim();
        if (s1 == null) goto _L2; else goto _L1
_L1:
        if (!com.appboy.f.e.b(s1)) goto _L3; else goto _L2
_L2:
        s = c.edit();
        s.putString("phone", s1);
        s.apply();
        flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L3:
        String.format("Phone number contains invalid characters (allowed are digits, spaces, or any of the following +.-()): %s", new Object[] {
            s1
        });
        if (true) goto _L5; else goto _L4
_L4:
        s;
        throw s;
    }

    public final void g(String s)
    {
        this;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = c.edit();
        editor.putString("image_url", s);
        editor.apply();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final boolean h(String s)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        if (s != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (!com.appboy.f.e.c(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        android.content.SharedPreferences.Editor editor = c.edit();
        editor.putString(s, "appboy_null_5a8579f5-079b-4681-a046-0f3c46a4ef58");
        editor.apply();
        flag = true;
        if (true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
    }

    static 
    {
        b = String.format("%s.%s", new Object[] {
            d.a, bo/app/ei.getName()
        });
    }
}
