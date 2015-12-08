// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public final class goc
{

    private static final String i = gei.a("cc8a3334207601366f34237001340d65223802323e690d69737a06312c385635207435795477547a0461086f53700164366309627a6843720361266e03683b345469", "337478347076323636346e70333465657338753264696269387a6c31743866356e7462793077397a6a61386f627068647a636d623468737233616b6e306870346d69");
    public gip a;
    public final gin b;
    public JSONObject c;
    public final String d;
    public god e;
    public dme f;
    public final goe g = new goe(this);
    public final hc h;
    private Context j;
    private final String k;

    public goc(Context context, gin gin1, String s, String s1)
    {
        j = context;
        b = gin1;
        k = s;
        d = s1;
        a = gip.c((new StringBuilder("imsi-msisdn-mapping-")).append(s1).toString());
        gin1 = null;
        context = gin1;
        if (!TextUtils.isEmpty(s1))
        {
            s = a(s1);
            context = gin1;
            if (s != null)
            {
                context = new hc((byte)0);
                context.put("IMSI", s1);
                context.put("serviceId", "gc_p_gt5190_r");
                context.put("appId", "gc_spotify");
                context.put("signature", s);
            }
        }
        h = context;
    }

    private static String a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            s = (new StringBuilder()).append(s).append(i).toString();
            try
            {
                s = (new String(hcz.a(hda.a(s.getBytes("UTF-8"))))).toUpperCase(Locale.US);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new AssertionError();
            }
            return s;
        } else
        {
            return null;
        }
    }

    static void a(goc goc1, long l)
    {
        goc1.a(l, true);
    }

    static void a(goc goc1, long l, String s, int i1)
    {
        dmz.a(fop);
        Context context = goc1.j;
        com.spotify.mobile.android.util.viewuri.Verified verified = ViewUri.b;
        ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.ay);
        Object obj;
        if (goc1.k != null)
        {
            obj = goc1.k;
        } else
        {
            obj = "";
        }
        obj = clientevent.a("mcc-mnc", ((String) (obj)));
        if (goc1.d != null)
        {
            goc1 = goc1.d;
        } else
        {
            goc1 = "";
        }
        goc1 = ((ClientEvent) (obj)).a("imsi", goc1).a("msisdn", Long.toString(l));
        if (s == null)
        {
            s = "";
        }
        fop.a(context, verified, goc1.a("status-code", s).a("http-status", Integer.toString(i1)));
    }

    static void b()
    {
    }

    public final void a()
    {
        if (f != null)
        {
            f.a();
            f = null;
        }
        e = null;
    }

    public final void a(long l, boolean flag)
    {
        if (flag)
        {
            try
            {
                if (c == null)
                {
                    c = new JSONObject();
                }
                c.put(d, l);
                b.b().a(a, c).b();
            }
            catch (JSONException jsonexception)
            {
                Assertion.a("Failed writing JSON", jsonexception);
            }
        }
        if (e != null)
        {
            e.a(l);
        }
    }

}
