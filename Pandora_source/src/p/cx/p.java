// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import com.pandora.radio.data.af;
import com.pandora.radio.data.ag;
import com.pandora.radio.data.aj;
import com.pandora.radio.util.i;
import java.security.InvalidParameterException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.cw.b;
import p.cw.c;
import p.dd.an;
import p.dd.bp;
import p.dd.x;
import p.di.n;

// Referenced classes of package p.cx:
//            f

public class p
    implements p.di.n.a
{

    private long a;
    private int b;
    private Map c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;
    private String h;
    private af i;
    private c j;
    private String k;
    private boolean l;
    private BroadcastReceiver m;

    public p(c c1, String s, boolean flag)
    {
        a = System.currentTimeMillis();
        b = -1;
        d = -1;
        e = -1;
        f = false;
        g = false;
        m = new BroadcastReceiver() {

            final p a;

            public void onReceive(Context context, Intent intent)
            {
                if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && !a.c())
                {
                    a.a();
                }
            }

            
            {
                a = p.this;
                super();
            }
        };
        j = c1;
        c1.b(this);
        k = s;
        l = flag;
        a();
        s = new IntentFilter();
        s.addAction("android.media.VOLUME_CHANGED_ACTION");
        c1.s().registerReceiver(m, s);
    }

    private int h()
    {
        if (j())
        {
            Calendar calendar = Calendar.getInstance();
            int i1 = calendar.get(11);
            i1 = calendar.get(12) + i1 * 60;
            Integer ainteger[] = i();
            int j1 = ainteger[0].intValue();
            int k1 = ainteger[1].intValue();
            if (j1 > 0 && k1 > 0)
            {
                if (i1 < j1 || i1 > j1 && i1 > k1)
                {
                    if (e != -1)
                    {
                        return e;
                    } else
                    {
                        return b;
                    }
                }
                if (i1 > j1 && i1 < k1)
                {
                    if (d != -1)
                    {
                        return d;
                    } else
                    {
                        return b;
                    }
                }
            }
        }
        return b;
    }

    private Integer[] i()
    {
        int i1 = Calendar.getInstance().get(7);
        return (Integer[])c.get(Integer.valueOf(i1 - 1));
    }

    private boolean j()
    {
        return f;
    }

    private void k()
    {
        if (i != null)
        {
            String s = ((f)j.m()).a().b();
            android.net.Uri.Builder builder = Uri.parse(String.format("%s%s", new Object[] {
                k, i.g()
            })).buildUpon();
            builder.appendQueryParameter("applicationVersion", j.B());
            if (l)
            {
                builder.appendQueryParameter("is_tablet", "true");
            }
            (new n(builder.build().toString(), s, this, j.p())).execute(new Void[0]);
        }
    }

    public void a()
    {
        a = System.currentTimeMillis();
    }

    public void a(int i1)
    {
        boolean flag;
        if (i1 > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
        b = i1;
    }

    public void a(String s)
        throws JSONException
    {
        if (!com.pandora.radio.util.i.a(s))
        {
            Object obj = new JSONObject(s);
            d = ((JSONObject) (obj)).getInt("dayTimeout");
            e = ((JSONObject) (obj)).getInt("nightTimeout");
            boolean flag;
            if (d != -1 || e != -1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            f = flag;
            c = new HashMap();
            s = new int[7];
            for (int i1 = 0; i1 < s.length; i1++)
            {
                s[i1] = 0;
            }

            obj = ((JSONObject) (obj)).getJSONArray("times");
            int i2 = ((JSONArray) (obj)).length();
            for (int j1 = 0; j1 < i2; j1++)
            {
                JSONObject jsonobject = (JSONObject)((JSONArray) (obj)).get(j1);
                JSONArray jsonarray = jsonobject.getJSONArray("days");
                int j2 = jsonobject.getInt("dayStartTime");
                int k2 = jsonobject.getInt("nightStartTime");
                int l2 = jsonarray.length();
                for (int l1 = 0; l1 < l2; l1++)
                {
                    int i3 = jsonarray.getInt(l1);
                    c.put(Integer.valueOf(i3), new Integer[] {
                        Integer.valueOf(j2), Integer.valueOf(k2)
                    });
                    s[i3] = 1;
                }

            }

            for (int k1 = 0; k1 < s.length; k1++)
            {
                if (s[k1] == 0)
                {
                    c.put(Integer.valueOf(k1), new Integer[] {
                        Integer.valueOf(-2), Integer.valueOf(-2)
                    });
                }
            }

        }
    }

    public void b(String s)
    {
        h = s;
    }

    public boolean b()
    {
        b b1 = j.d();
        return c() && b1.n();
    }

    public boolean c()
    {
        if (g && !j.C())
        {
            aj aj1 = j.k().J();
            if (aj1 == null || !aj1.g())
            {
                int i1 = h();
                if (System.currentTimeMillis() - a >= (long)(i1 * 60 * 1000))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public void d()
    {
        j.d().b(p.cw.b.c.b);
        j.a(new x());
    }

    public void e()
    {
        j.d().a(p.cw.b.c.a);
        a();
    }

    public String f()
    {
        return h;
    }

    public void g()
    {
        if (m != null)
        {
            j.s().unregisterReceiver(m);
            m = null;
        }
        j.c(this);
    }

    public void onSignInState(an an1)
    {
        i = an1.a;
        static class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[p.cx.e.a.values().length];
                try
                {
                    a[e.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[e.a.d.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.cx.e.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.cx.e.a.b.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls2.a[an1.b.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("onSignInState called with unknown signInState: ").append(an1.b).toString());

        case 4: // '\004'
            a();
            k();
            // fall through

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return;
        }
    }

    public void onUserStateChange(bp bp)
    {
        k();
    }
}
