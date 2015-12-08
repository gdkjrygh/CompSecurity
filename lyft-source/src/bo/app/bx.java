// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.Constants;
import com.appboy.configuration.XmlAppConfigurationProvider;
import com.appboy.support.AppboyLogger;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            cd, by, ad, cs, 
//            dp, cz, co, aj, 
//            ff, ah, ev, cf

public class bx
    implements cd
{

    public static final String a;
    public final by b;
    public final ad c;
    public final cf d;
    public final XmlAppConfigurationProvider e;
    public Class f;
    private AtomicInteger g;
    private AtomicInteger h;
    private volatile String i;
    private final SharedPreferences j;

    public bx(by by1, ad ad1, cf cf, XmlAppConfigurationProvider xmlappconfigurationprovider, Context context)
    {
        g = new AtomicInteger(0);
        h = new AtomicInteger(0);
        i = "";
        f = null;
        b = by1;
        c = ad1;
        d = cf;
        e = xmlappconfigurationprovider;
        j = context.getSharedPreferences("com.appboy.stored.push.clicks", 0);
    }

    public final cs a()
    {
        cs cs1 = b.a();
        c.a(cs1);
        AppboyLogger.i(a, (new StringBuilder("Completed the openSession call. Starting or continuing session ")).append(cs1.d).toString());
        return cs1;
    }

    public final void a(int k)
    {
        c.a(new dp(e.getBaseUrlForRequests(), k));
    }

    public final void a(Throwable throwable)
    {
        if (b(throwable))
        {
            AppboyLogger.w(a, "Not logging duplicate error.");
            return;
        }
        try
        {
            a(((co) (cz.a(throwable, b.c()))));
            return;
        }
        catch (JSONException jsonexception)
        {
            AppboyLogger.e(a, String.format("Failed to create error event from %s.", new Object[] {
                throwable
            }), jsonexception);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            AppboyLogger.e(a, "Failed to log error.", throwable);
        }
        return;
    }

    public final boolean a(co co1)
    {
label0:
        {
label1:
            {
                boolean flag1 = false;
                boolean flag;
                if (co1.b().equals(aj.d) || co1.b().equals(aj.e))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag || !b.d())
                {
                    break label0;
                }
                if (!co1.b().equals(aj.d))
                {
                    flag = flag1;
                    if (!co1.b().equals(aj.e))
                    {
                        break label1;
                    }
                }
                flag = true;
            }
            if (!flag)
            {
                co1 = a;
            } else
            {
                android.content.SharedPreferences.Editor editor = j.edit();
                editor.putString(Double.toString(co1.a()), co1.d());
                editor.apply();
            }
            return true;
        }
        co1 = b.a((co)ff.a(co1));
        if (co1 != null)
        {
            c.a(co1);
            if (co1.c())
            {
                a(ah.d);
            }
            return true;
        } else
        {
            return false;
        }
    }

    public final void b()
    {
        if (b.d())
        {
            return;
        }
        Object obj = j.getAll().keySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            String s = (String)((Iterator) (obj)).next();
            s = j.getString(s, null);
            if (!ev.b(s))
            {
                try
                {
                    a(cz.a(new JSONObject(s)));
                }
                catch (JSONException jsonexception)
                {
                    AppboyLogger.w(a, (new StringBuilder("Could not log pending AppboyEvent from shared preferences storage. Serialized string is: ")).append(s).toString(), jsonexception);
                }
            }
        } while (true);
        obj = j.edit();
        ((android.content.SharedPreferences.Editor) (obj)).clear();
        ((android.content.SharedPreferences.Editor) (obj)).apply();
    }

    public final boolean b(Throwable throwable)
    {
        g.getAndIncrement();
        if (i.equals(throwable.getMessage()) && h.get() > 3 && g.get() < 100)
        {
            return true;
        }
        if (i.equals(throwable.getMessage()))
        {
            h.getAndIncrement();
        } else
        {
            h.set(0);
        }
        if (g.get() >= 100)
        {
            g.set(0);
        }
        i = throwable.getMessage();
        return false;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/bx.getName()
        });
    }
}
