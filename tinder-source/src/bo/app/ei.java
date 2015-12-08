// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.Constants;
import com.appboy.enums.Gender;
import com.appboy.enums.Month;
import com.appboy.enums.NotificationSubscriptionType;
import com.appboy.models.outgoing.AttributionData;
import com.appboy.models.outgoing.FacebookUser;
import com.appboy.models.outgoing.TwitterUser;
import com.appboy.support.AppboyLogger;
import com.appboy.support.ValidationUtils;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            dr, gr, ep, gq, 
//            db, ky, kx, kz, 
//            el, ab, eg

public class ei extends dr
{

    static final gq a = (new gr()).c("twitter").c("facebook").c("ab_install_attribution").a();
    private static final String b;
    private final SharedPreferences c;
    private final eg d;

    public ei(Context context, eg eg1)
    {
        this(context, null, null, eg1);
    }

    public ei(Context context, String s, String s1, eg eg1)
    {
        c = context.getSharedPreferences((new StringBuilder("com.appboy.storage.usercache")).append(ep.b(s, s1)).toString(), 0);
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
                AppboyLogger.w(b, String.format("Failed to parse existing value for [%s], continuing without it.", new Object[] {
                    s
                }), ((Throwable) (obj)));
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
                    AppboyLogger.w(b, String.format("Failed to fetch value for key [%s], ignoring.", new Object[] {
                        s1
                    }));
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
                AppboyLogger.w(b, String.format("Failed to check outbound json key %s for null placeholders.", new Object[] {
                    s
                }));
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
                AppboyLogger.w(b, String.format("Failed to properly convert [%s] value to OutboundUser for export.", new Object[] {
                    s1
                }));
            }
        } while (true);
        return new db(jsonobject);
    }

    public final Object a()
    {
        return c();
    }

    public final void a(Gender gender)
    {
        this;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = c.edit();
        if (gender != null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        editor.putString("gender", null);
_L1:
        editor.apply();
        this;
        JVM INSTR monitorexit ;
        return;
        editor.putString("gender", gender.forJsonPut());
          goto _L1
        gender;
        throw gender;
    }

    public final void a(NotificationSubscriptionType notificationsubscriptiontype)
    {
        this;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = c.edit();
        if (notificationsubscriptiontype != null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        editor.putString("email_subscribe", null);
_L1:
        editor.apply();
        this;
        JVM INSTR monitorexit ;
        return;
        editor.putString("email_subscribe", notificationsubscriptiontype.forJsonPut());
          goto _L1
        notificationsubscriptiontype;
        throw notificationsubscriptiontype;
    }

    public final void a(AttributionData attributiondata)
    {
        this;
        JVM INSTR monitorenter ;
        a(attributiondata.forJsonPut(), "ab_install_attribution");
        this;
        JVM INSTR monitorexit ;
        return;
        attributiondata;
        throw attributiondata;
    }

    public final void a(FacebookUser facebookuser)
    {
        this;
        JVM INSTR monitorenter ;
        a(facebookuser.forJsonPut(), "facebook");
        this;
        JVM INSTR monitorexit ;
        return;
        facebookuser;
        throw facebookuser;
    }

    public final void a(TwitterUser twitteruser)
    {
        this;
        JVM INSTR monitorenter ;
        a(twitteruser.forJsonPut(), "twitter");
        this;
        JVM INSTR monitorexit ;
        return;
        twitteruser;
        throw twitteruser;
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
                            if (kx.a(String.valueOf(obj3), obj4.toString(), ky.c).a)
                            {
                                ((android.content.SharedPreferences.Editor) (obj)).remove(((String) (obj2)));
                            }
                        }
                        // Misplaced declaration of an exception variable
                        catch (Object obj2)
                        {
                            AppboyLogger.e(b, "Caught exception confirming and unlocking Json objects.", ((Throwable) (obj2)));
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

    public final boolean a(int j, Month month, int k)
    {
        this;
        JVM INSTR monitorenter ;
        if (month != null) goto _L2; else goto _L1
_L1:
        AppboyLogger.w(b, "Month cannot be null.");
        boolean flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        month = el.a(el.a(j, month.getValue(), k), ab.a);
        android.content.SharedPreferences.Editor editor = c.edit();
        editor.putString("dob", month);
        editor.apply();
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        month;
        throw month;
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
        boolean flag = ValidationUtils.isBlacklistedCustomAttributeKey(s, d.g());
        if (!flag) goto _L2; else goto _L1
_L1:
        flag = flag1;
_L7:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = flag1;
        if (!ValidationUtils.isValidCustomAttributeKey(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        s = ValidationUtils.ensureAppboyFieldLength(s);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        AppboyLogger.w(b, "Custom attribute value cannot be null.");
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        s;
        throw s;
        android.content.SharedPreferences.Editor editor = c.edit();
        if (!(obj instanceof Boolean)) goto _L4; else goto _L3
_L3:
        editor.putBoolean(s, ((Boolean)obj).booleanValue());
_L5:
        editor.apply();
        flag = true;
        continue; /* Loop/switch isn't completed */
_L4:
label0:
        {
            if (!(obj instanceof Integer))
            {
                break label0;
            }
            editor.putInt(s, ((Integer)obj).intValue());
        }
          goto _L5
label1:
        {
            if (!(obj instanceof Float))
            {
                break label1;
            }
            editor.putFloat(s, ((Float)obj).floatValue());
        }
          goto _L5
label2:
        {
            if (!(obj instanceof Long))
            {
                break label2;
            }
            editor.putLong(s, ((Long)obj).longValue());
        }
          goto _L5
label3:
        {
            if (!(obj instanceof String))
            {
                break label3;
            }
            editor.putString(s, ValidationUtils.ensureAppboyFieldLength((String)obj));
        }
          goto _L5
label4:
        {
            if (!(obj instanceof Date))
            {
                break label4;
            }
            editor.putString(s, el.a((Date)obj, ab.b));
        }
          goto _L5
        AppboyLogger.w(b, "Unsupported custom attribute type");
        flag = flag1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void b(NotificationSubscriptionType notificationsubscriptiontype)
    {
        this;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = c.edit();
        if (notificationsubscriptiontype != null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        editor.putString("push_subscribe", null);
_L1:
        editor.apply();
        this;
        JVM INSTR monitorexit ;
        return;
        editor.putString("push_subscribe", notificationsubscriptiontype.forJsonPut());
          goto _L1
        notificationsubscriptiontype;
        throw notificationsubscriptiontype;
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
        if (!ValidationUtils.isValidEmailAddress(s1)) goto _L3; else goto _L2
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
        AppboyLogger.w(b, String.format("Email address is not valid: %s", new Object[] {
            s1
        }));
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
        editor.putString("bio", s);
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
        editor.putString("country", s);
        editor.apply();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final void f(String s)
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

    public final boolean g(String s)
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
        if (!ValidationUtils.isValidPhoneNumber(s1)) goto _L3; else goto _L2
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
        AppboyLogger.w(b, String.format("Phone number contains invalid characters (allowed are digits, spaces, or any of the following +.-()): %s", new Object[] {
            s1
        }));
        if (true) goto _L5; else goto _L4
_L4:
        s;
        throw s;
    }

    public final void h(String s)
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

    public final boolean i(String s)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        if (s != null) goto _L2; else goto _L1
_L1:
        AppboyLogger.w(b, "Custom attribute key cannot be null.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (!ValidationUtils.isValidCustomAttributeKey(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        android.content.SharedPreferences.Editor editor = c.edit();
        editor.putString(s, "appboy_null_5a8579f5-079b-4681-a046-0f3c46a4ef58");
        editor.apply();
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    static 
    {
        b = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/ei.getName()
        });
    }
}
