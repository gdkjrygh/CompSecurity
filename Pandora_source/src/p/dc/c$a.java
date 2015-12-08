// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dc;

import android.text.TextUtils;
import com.pandora.radio.util.i;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package p.dc:
//            c

public static final class .String
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
            obj = (.Object.getClass)obj;
            if (!e.equals(((.Object) (obj)).e))
            {
                return false;
            }
            if (d == null ? ((d) (obj)).d != null : !d.equals(((.Object) (obj)).d))
            {
                return false;
            }
            if (!b.equals(((.Object) (obj)).b))
            {
                return false;
            }
            if (!c.equals(((.Object) (obj)).c))
            {
                return false;
            }
            if (!a.equals(((.Object) (obj)).a))
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

    public .CharSequence(String s, String s1, String s2, String s3, String s4)
    {
        a = s;
        b = s1;
        c = s2;
        d = s3;
        e = s4;
        if (!i.a(s1))
        {
            s = b;
            s1 = p.dc.c.u();
            b = TextUtils.replace(s, new String[] {
                "<res>"
            }, new String[] {
                s1
            }).toString();
        }
    }

    public .String(JSONObject jsonobject)
        throws JSONException
    {
        this(jsonobject.getString("title"), jsonobject.getString("imageUrl"), jsonobject.getString("text"), jsonobject.optString("footerText"), jsonobject.getString("buttonText"));
    }
}
