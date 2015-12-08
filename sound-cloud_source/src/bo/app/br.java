// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.a.b;
import com.appboy.d;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            bx, bs, z, cm, 
//            dj, ct, ci, ae, 
//            fa, ac, eq, bz

public class br
    implements bx
{

    public static final String a;
    public final bs b;
    public final z c;
    public final bz d;
    public final b e;
    public Class f;
    private AtomicInteger g;
    private AtomicInteger h;
    private volatile String i;
    private final SharedPreferences j;

    public br(bs bs1, z z1, bz bz, b b1, Context context)
    {
        g = new AtomicInteger(0);
        h = new AtomicInteger(0);
        i = "";
        f = null;
        b = bs1;
        c = z1;
        d = bz;
        e = b1;
        j = context.getSharedPreferences("com.appboy.stored.push.clicks", 0);
    }

    public final cm a()
    {
        cm cm1 = b.a();
        c.a(cm1);
        (new StringBuilder("Completed the openSession call. Starting or continuing session ")).append(cm1.d);
        return cm1;
    }

    public final void a(int k)
    {
        c.a(new dj(e.a(), k));
    }

    public final void a(Throwable throwable)
    {
        if (b(throwable))
        {
            return;
        }
        try
        {
            a(((ci) (ct.a(throwable, b.c()))));
            return;
        }
        catch (JSONException jsonexception)
        {
            String.format("Failed to create error event from %s.", new Object[] {
                throwable
            });
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            return;
        }
        return;
    }

    public final boolean a(ci ci1)
    {
label0:
        {
label1:
            {
                boolean flag1 = false;
                android.content.SharedPreferences.Editor editor;
                boolean flag;
                if (ci1.b().equals(bo.app.ae.d) || ci1.b().equals(ae.e))
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
                if (!ci1.b().equals(bo.app.ae.d))
                {
                    flag = flag1;
                    if (!ci1.b().equals(ae.e))
                    {
                        break label1;
                    }
                }
                flag = true;
            }
            if (flag)
            {
                editor = j.edit();
                editor.putString(Double.toString(ci1.a()), ci1.d());
                editor.apply();
            }
            return true;
        }
        ci1 = b.a((ci)fa.a(ci1));
        if (ci1 != null)
        {
            c.a(ci1);
            if (ci1.c())
            {
                a(bo.app.ac.d);
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
            if (!bo.app.eq.b(s))
            {
                try
                {
                    a(ct.a(new JSONObject(s)));
                }
                catch (JSONException jsonexception) { }
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
            d.a, bo/app/br.getName()
        });
    }
}
