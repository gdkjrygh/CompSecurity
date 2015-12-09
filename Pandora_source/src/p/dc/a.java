// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dc;

import com.pandora.radio.util.i;
import java.util.Calendar;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package p.dc:
//            c, b

public class a extends c
{

    private int b;
    private boolean c;
    private long d;
    private long e;
    private boolean f;
    private boolean g;
    private long h;
    private long i;

    public a(JSONObject jsonobject)
        throws JSONException
    {
        super(jsonobject);
        b = 0;
        c = false;
        d = -1L;
        e = -1L;
        f = false;
        g = false;
        h = 0L;
        i = 0x8000000000000000L;
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[p.dc.b.values().length];
                try
                {
                    a[b.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        _cls1.a[a.ordinal()];
        JVM INSTR tableswitch 1 1: default 80
    //                   1 96;
           goto _L1 _L2
_L1:
        if (i == 0x8000000000000000L)
        {
            v();
        }
        return;
_L2:
        d = jsonobject.getLong("durationSecondsRemaining");
        e = jsonobject.getLong("durationSecondsTotal");
        b = jsonobject.getInt("completionCoachmarkDaysSinceCompletionLimit");
        c = jsonobject.getBoolean("coachmarkIsTrialOffer");
        if (jsonobject.has("confirmationCoachMarkShown"))
        {
            f = jsonobject.getBoolean("confirmationCoachMarkShown");
        }
        if (jsonobject.has("showCountdownDisplay"))
        {
            g = jsonobject.getBoolean("showCountdownDisplay");
        }
        if (jsonobject.has("countdownShouldShowAt"))
        {
            h = jsonobject.getLong("countdownShouldShowAt");
        }
        if (jsonobject.has("systemClockEndTimeSeconds"))
        {
            i = jsonobject.getLong("systemClockEndTimeSeconds");
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void v()
    {
        i = d + w() / 1000L;
    }

    private long w()
    {
        return com.pandora.radio.util.i.g();
    }

    public long a()
    {
        return d;
    }

    public void a(a a1)
    {
        if (a1 == null)
        {
            throw new IllegalArgumentException("new ActiveBenefit information cannot be null");
        }
        if (!o().equalsIgnoreCase(a1.o()))
        {
            throw new IllegalArgumentException("new ActiveBenefit productId doesn't match benefit being updated");
        } else
        {
            d = a1.d;
            e = a1.e;
            i = a1.i;
            return;
        }
    }

    public void a(boolean flag)
    {
        f = flag;
    }

    public long b()
    {
        return i - w() / 1000L;
    }

    public boolean c()
    {
        return b() > 0L;
    }

    public long d()
    {
        return e;
    }

    public boolean e()
    {
        return c;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof a))
            {
                return false;
            }
            if (!super.equals(obj))
            {
                return false;
            }
            obj = (a)obj;
            if (c != ((a) (obj)).c)
            {
                return false;
            }
            if (b != ((a) (obj)).b)
            {
                return false;
            }
            if (f != ((a) (obj)).f)
            {
                return false;
            }
            if (h != ((a) (obj)).h)
            {
                return false;
            }
            if (d != ((a) (obj)).d)
            {
                return false;
            }
            if (e != ((a) (obj)).e)
            {
                return false;
            }
            if (g != ((a) (obj)).g)
            {
                return false;
            }
            if (i != ((a) (obj)).i)
            {
                return false;
            }
        }
        return true;
    }

    public int f()
    {
        return b;
    }

    public boolean g()
    {
        return !f;
    }

    public void h()
    {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.add(6, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 1);
        int i1 = calendar.get(15);
        int j1 = calendar.get(16);
        g = false;
        h = calendar.getTimeInMillis() - (long)(i1 + j1);
    }

    public int hashCode()
    {
        int k1 = 1;
        int l1 = super.hashCode();
        int i2 = b;
        int i1;
        int j1;
        int j2;
        int k2;
        if (c)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        j2 = (int)(d ^ d >>> 32);
        k2 = (int)(e ^ e >>> 32);
        if (f)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (!g)
        {
            k1 = 0;
        }
        return (((j1 + (((i1 + (l1 * 31 + i2) * 31) * 31 + j2) * 31 + k2) * 31) * 31 + k1) * 31 + (int)(h ^ h >>> 32)) * 31 + (int)(i ^ i >>> 32);
    }

    public boolean i()
    {
label0:
        {
            boolean flag = true;
            if (!g)
            {
                if (w() >= h)
                {
                    break label0;
                }
                flag = false;
            }
            return flag;
        }
        g = true;
        h = 0L;
        return true;
    }

    public long j()
    {
        return h - w();
    }

    public long k()
    {
        return i;
    }

    public long l()
    {
        return (i + (long)(b * 0x15180)) * 1000L;
    }

    public JSONObject m()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("sku", n());
        jsonobject.put("productType", p().a());
        jsonobject.put("productId", o());
        jsonobject.put("coachmarkTriggerAdClosedCount", q());
        jsonobject.put("durationSecondsRemaining", a());
        jsonobject.put("durationSecondsTotal", d());
        jsonobject.put("completionCoachmarkDaysSinceCompletionLimit", f());
        jsonobject.put("coachmarkIsTrialOffer", e());
        jsonobject.put("promotionCoachmark", r().f());
        jsonobject.put("completionCoachmark", s().f());
        jsonobject.put("confirmationCoachmark", t().f());
        jsonobject.put("confirmationCoachMarkShown", f);
        jsonobject.put("showCountdownDisplay", g);
        jsonobject.put("countdownShouldShowAt", h);
        jsonobject.put("systemClockEndTimeSeconds", i);
        return jsonobject;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ActiveBenefit{completionCoachmarkDaysSinceCompletionLimit=").append(b).append(", coachmarkIsTrialOffer=").append(c).append(", durationSecondsRemaining=").append(d).append(", durationSecondsTotal=").append(e).append(", confirmationCoachMarkShown=").append(f).append(", showCountdownDisplay=").append(g).append(", countdownShouldShowAt=").append(h).append(", systemClockEndTimeSeconds=").append(i).append(",").append(super.toString()).append('}').toString();
    }
}
