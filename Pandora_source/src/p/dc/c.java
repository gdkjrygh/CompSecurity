// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dc;

import android.text.TextUtils;
import com.pandora.radio.util.i;
import java.io.Serializable;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package p.dc:
//            b

public class c
{
    public static final class a
        implements Serializable
    {

        private String a;
        private String b;
        private String c;
        private String d;
        private String e;

        public String a()
        {
            return a;
        }

        public String b()
        {
            return b;
        }

        public String c()
        {
            return c;
        }

        public String d()
        {
            return d;
        }

        public String e()
        {
            return e;
        }

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (a)obj;
                if (!e.equals(((a) (obj)).e))
                {
                    return false;
                }
                if (d == null ? ((a) (obj)).d != null : !d.equals(((a) (obj)).d))
                {
                    return false;
                }
                if (!b.equals(((a) (obj)).b))
                {
                    return false;
                }
                if (!c.equals(((a) (obj)).c))
                {
                    return false;
                }
                if (!a.equals(((a) (obj)).a))
                {
                    return false;
                }
            }
            return true;
        }

        public JSONObject f()
            throws JSONException
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("title", a);
            jsonobject.put("imageUrl", b);
            jsonobject.put("text", c);
            if (!TextUtils.isEmpty(d))
            {
                jsonobject.put("footerText", d);
            }
            jsonobject.put("buttonText", e);
            return jsonobject;
        }

        public int hashCode()
        {
            int k = a.hashCode();
            int l = b.hashCode();
            int i1 = c.hashCode();
            int j;
            if (d != null)
            {
                j = d.hashCode();
            } else
            {
                j = 0;
            }
            return (j + ((k * 31 + l) * 31 + i1) * 31) * 31 + e.hashCode();
        }

        public String toString()
        {
            return (new StringBuilder()).append("CoachMarkInfo{title='").append(a).append('\'').append(", imageUrl='").append(b).append('\'').append(", text='").append(c).append('\'').append(", footerText='").append(d).append('\'').append(", buttonLabel='").append(e).append('\'').append('}').toString();
        }

        public a(String s1, String s2, String s3, String s4, String s5)
        {
            a = s1;
            b = s2;
            c = s3;
            d = s4;
            e = s5;
            if (!i.a(s2))
            {
                s1 = b;
                s2 = c.u();
                b = TextUtils.replace(s1, new String[] {
                    "<res>"
                }, new String[] {
                    s2
                }).toString();
            }
        }

        public a(JSONObject jsonobject)
            throws JSONException
        {
            this(jsonobject.getString("title"), jsonobject.getString("imageUrl"), jsonobject.getString("text"), jsonobject.optString("footerText"), jsonobject.getString("buttonText"));
        }
    }


    private static String b = "xxhdpi";
    protected b a;
    private String c;
    private String d;
    private int e;
    private a f;
    private a g;
    private a h;

    public c(JSONObject jsonobject)
        throws JSONException
    {
        Object obj = null;
        super();
        a = p.dc.b.a(jsonobject.getString("productType"));
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
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[b.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[a.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            c = jsonobject.getString("sku");
            d = jsonobject.getString("productId");
            e = jsonobject.getInt("coachmarkTriggerAdClosedCount");
            a a1;
            if (jsonobject.has("promotionCoachmark"))
            {
                a1 = new a(jsonobject.getJSONObject("promotionCoachmark"));
            } else
            {
                a1 = null;
            }
            f = a1;
            if (jsonobject.has("completionCoachmark"))
            {
                a1 = new a(jsonobject.getJSONObject("completionCoachmark"));
            } else
            {
                a1 = null;
            }
            g = a1;
            a1 = obj;
            if (jsonobject.has("confirmationCoachmark"))
            {
                a1 = new a(jsonobject.getJSONObject("confirmationCoachmark"));
            }
            h = a1;
            return;

        case 2: // '\002'
            throw new IllegalArgumentException(String.format(Locale.US, "Product type '%s' is not supported", new Object[] {
                a.a()
            }));
        }
    }

    static String u()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof c))
            {
                return false;
            }
            obj = (c)obj;
            if (e != ((c) (obj)).e)
            {
                return false;
            }
            if (!g.equals(((c) (obj)).g))
            {
                return false;
            }
            if (!h.equals(((c) (obj)).h))
            {
                return false;
            }
            if (!d.equals(((c) (obj)).d))
            {
                return false;
            }
            if (a != ((c) (obj)).a)
            {
                return false;
            }
            if (!f.equals(((c) (obj)).f))
            {
                return false;
            }
            if (!c.equals(((c) (obj)).c))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return (((((c.hashCode() * 31 + d.hashCode()) * 31 + e) * 31 + a.hashCode()) * 31 + f.hashCode()) * 31 + g.hashCode()) * 31 + h.hashCode();
    }

    public String n()
    {
        return c;
    }

    public String o()
    {
        return d;
    }

    public b p()
    {
        return a;
    }

    public int q()
    {
        return e;
    }

    public a r()
    {
        return f;
    }

    public a s()
    {
        return g;
    }

    public a t()
    {
        return h;
    }

    public String toString()
    {
        return (new StringBuilder()).append("AvailableProduct{sku='").append(c).append('\'').append(", productId='").append(d).append('\'').append(", coachmarkTriggerCount=").append(e).append(", productType=").append(a).append(", promotionCoachmark=").append(f).append(", completionCoachmark=").append(g).append(", confirmationCoachmark=").append(h).append('}').toString();
    }

}
