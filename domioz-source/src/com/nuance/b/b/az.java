// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import android.content.Context;
import android.content.res.AssetManager;
import com.nuance.dragon.toolkit.audio.e;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.nuance.b.b:
//            u, bb, v, s, 
//            fr, gl, ba

public final class az
{

    public static final u a;
    public static final bb b;
    public static final bb c;
    public static final String d = null;
    public static final String e = null;
    public static final String f = null;
    static final String g = null;
    static final String h = null;
    static final byte i[] = {
        -73, 99, 90, -52, -71, -27, -13, 125, -27, -55, 
        -39, -51, 117, 120, -74, -96, 80, 21, 114, 12, 
        -104, 28, 110, 1, 4, -9, 32, -44, 0, -67, 
        -27, 108, -3, 17, 110, 74, -85, -18, -28, 24, 
        -27, -85, 83, 17, 106, -64, 52, -55, 123, 64, 
        -100, 5, 121, -2, -93, 0, -94, -20, 82, 100, 
        -25, 121, 107, 11
    };
    private String A;
    private String B;
    private bb C;
    private bb D;
    private int E;
    private u F;
    private s G;
    private s H;
    private s I;
    private String J;
    private String K;
    private String L;
    private boolean M;
    private boolean N;
    private boolean O;
    private String j;
    private String k;
    private byte l[];
    private String m;
    private int n;
    private boolean o;
    private boolean p;
    private int q;
    private int r;
    private boolean s;
    private int t;
    private int u;
    private boolean v;
    private int w;
    private int x;
    private boolean y;
    private String z;

    az()
    {
        j = null;
        m = null;
        n = -1;
        k = null;
        l = null;
        o = true;
        p = true;
        q = 60000;
        r = 10000;
        s = v.a;
        t = 10000;
        u = 3000;
        v = v.a;
        w = 60000;
        x = 10000;
        y = v.a;
        z = g;
        A = "en-us";
        B = h;
        F = a;
        C = b;
        D = c;
        E = 3;
        G = com.nuance.b.b.s.a();
        H = com.nuance.b.b.s.c();
        I = com.nuance.b.b.s.a();
        J = d;
        K = e;
        L = f;
        M = false;
        N = true;
        O = true;
    }

    private String E()
    {
        String s1 = null;
        if (m != null)
        {
            s1 = (new StringBuilder()).append(m).append(":").append(n).toString();
        }
        return s1;
    }

    static JSONObject a(Context context)
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj = null;
        obj2 = null;
        obj1 = null;
        context = new InputStreamReader(context.getAssets().open("mmfsdk/configuration.json"), "UTF-8");
        fr.b("Warning: use of assets for configuration (mmfsdk/configuration.json) is deprecated.  Should set configuration values programmatically.");
        obj = new JSONObject(gl.a(context));
        gl.a(context);
        return ((JSONObject) (obj));
        context;
        context = null;
_L6:
        gl.a(context);
        return null;
        obj;
        context = ((Context) (obj1));
        obj1 = obj;
_L4:
        obj = context;
        fr.a("IOException adding configuration json from assets: mmfsdk/configuration.json");
        obj = context;
        throw new RuntimeException("IOException adding configuration json from assets: mmfsdk/configuration.json", ((Throwable) (obj1)));
        context;
_L1:
        gl.a(((java.io.Reader) (obj)));
        throw context;
        JSONException jsonexception;
        jsonexception;
        context = obj2;
_L2:
        obj = context;
        fr.a("JSONException adding configuration json from assets: mmfsdk/configuration.json");
        obj = context;
        throw new RuntimeException("JSONException adding configuration json from assets: mmfsdk/configuration.json", jsonexception);
        jsonexception;
        obj = context;
        context = jsonexception;
          goto _L1
        jsonexception;
          goto _L2
        jsonexception;
        if (true) goto _L4; else goto _L3
_L3:
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static void a(StringBuffer stringbuffer, String s1, int i1, String s2)
    {
        a(stringbuffer, s1, Integer.toString(i1), s2);
    }

    private static void a(StringBuffer stringbuffer, String s1, s s2, String s3)
    {
        StringBuffer stringbuffer1 = new StringBuffer();
        stringbuffer1.append("[");
        stringbuffer1.append(s2.toString());
        stringbuffer1.append("]");
        a(stringbuffer, s1, stringbuffer1.toString(), s3);
    }

    private static void a(StringBuffer stringbuffer, String s1, String s2, String s3)
    {
        stringbuffer.append(s3);
        stringbuffer.append(s1);
        stringbuffer.append(": ");
        stringbuffer.append(s2);
    }

    private static void a(StringBuffer stringbuffer, String s1, boolean flag, String s2)
    {
        a(stringbuffer, s1, Boolean.toString(flag), s2);
    }

    private static e b(bb bb1)
    {
        switch (ba.a[bb1.ordinal()])
        {
        default:
            return e.k;

        case 1: // '\001'
            return e.d;

        case 2: // '\002'
            return e.f;

        case 3: // '\003'
            return e.g;

        case 4: // '\004'
            return e.h;
        }
    }

    private void d(String s1)
    {
        Object obj;
        int i1;
        int k1;
        k1 = s1.indexOf(':');
        char c1 = '\u22CF';
        i1 = c1;
        obj = s1;
        if (-1 == k1)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        i1 = c1;
        int j1 = Integer.parseInt(s1.substring(k1 + 1));
        i1 = j1;
        obj = s1.substring(0, k1);
        i1 = j1;
_L2:
        a(((String) (obj)), i1);
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        fr.a("Bad or missing port in gateway address.");
        runtimeexception = s1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final String A()
    {
        return J;
    }

    public final String B()
    {
        return K;
    }

    public final String C()
    {
        return L;
    }

    public final boolean D()
    {
        return M;
    }

    final String a()
    {
        String s1;
label0:
        {
            String s2 = k;
            if (s2 != null)
            {
                s1 = s2;
                if (s2.length() != 0)
                {
                    break label0;
                }
            }
            s1 = "NMAID_MMF_NMSP39";
        }
        return s1;
    }

    public final void a(int i1)
    {
        if (i1 <= 0)
        {
            throw new IllegalArgumentException("timeout must be > 0");
        } else
        {
            w = i1;
            return;
        }
    }

    public final void a(bb bb1)
    {
        if (bb1 == null)
        {
            throw new IllegalArgumentException("AudioCodec must not be null");
        } else
        {
            D = bb1;
            return;
        }
    }

    public final void a(u u1)
    {
        if (u1 == null)
        {
            throw new IllegalArgumentException("LogLevel can not be null");
        } else
        {
            F = u1;
            return;
        }
    }

    public final void a(String s1)
    {
        k = s1;
    }

    public final void a(String s1, int i1)
    {
        m = s1;
        n = i1;
    }

    final void a(JSONObject jsonobject)
    {
        if (!"nmsp.applicationKey".toLowerCase(Locale.US).equals(((String) (obj)).toLowerCase(Locale.US))) goto _L2; else goto _L1
_L1:
        jsonarray = jsonobject.optJSONArray(((String) (obj)));
        if (jsonarray == null || jsonarray.length() <= 0) goto _L4; else goto _L3
_L3:
        obj = null;
        bytearrayoutputstream = new ByteArrayOutputStream();
        obj = bytearrayoutputstream;
        j1 = jsonarray.length();
        i1 = 0;
_L6:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = bytearrayoutputstream;
        bytearrayoutputstream.write((byte)jsonarray.getInt(i1));
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
        obj = bytearrayoutputstream;
        l = bytearrayoutputstream.toByteArray();
        gl.a(bytearrayoutputstream);
          goto _L4
        obj;
        bytearrayoutputstream = null;
_L8:
        obj = bytearrayoutputstream;
        fr.a("Bad nmsp.applicationKey in mmfsdk/configuration.json");
        gl.a(bytearrayoutputstream);
          goto _L4
        jsonobject;
_L7:
        gl.a(((java.io.OutputStream) (obj)));
        throw jsonobject;
_L2:
        if ("nmsp.gateway.ipAddress".toLowerCase(Locale.US).equals(((String) (obj)).toLowerCase(Locale.US)))
        {
            d(jsonobject.optString(((String) (obj)), E()));
        } else
        if ("nmsp.gateway.ipAddresses".toLowerCase(Locale.US).equals(((String) (obj)).toLowerCase(Locale.US)))
        {
            obj = jsonobject.optJSONArray(((String) (obj)));
            if (obj != null && ((JSONArray) (obj)).length() > 0)
            {
                d(((JSONArray) (obj)).optString(0, E()));
            }
        } else
        if ("nmsp.ssl.enable".toLowerCase(Locale.US).equals(((String) (obj)).toLowerCase(Locale.US)))
        {
            o = jsonobject.optBoolean(((String) (obj)), o);
        } else
        if ("nmsp.ssl.validatesSecureCertificate".toLowerCase(Locale.US).equals(((String) (obj)).toLowerCase(Locale.US)))
        {
            p = jsonobject.optBoolean(((String) (obj)), p);
        } else
        {
            fr.b((new StringBuilder("Unused key ")).append(((String) (obj))).append(" in mmfsdk/configuration.json").toString());
        }
_L4:
        Object obj;
        ByteArrayOutputStream bytearrayoutputstream;
        JSONArray jsonarray;
        int i1;
        int j1;
        for (Iterator iterator = jsonobject.keys(); iterator.hasNext();)
        {
label0:
            {
                obj = (String)iterator.next();
                if (!"nmsp.applicationID".toLowerCase(Locale.US).equals(((String) (obj)).toLowerCase(Locale.US)))
                {
                    break label0;
                }
                k = jsonobject.optString(((String) (obj)), k);
            }
        }

        return;
        jsonobject;
          goto _L7
        Exception exception;
        exception;
          goto _L8
    }

    public final void a(byte abyte0[])
    {
        l = abyte0;
    }

    public final void b(String s1)
    {
        z = s1;
    }

    final byte[] b()
    {
        byte abyte0[];
label0:
        {
            byte abyte1[] = l;
            if (abyte1 != null)
            {
                abyte0 = abyte1;
                if (abyte1.length != 0)
                {
                    break label0;
                }
            }
            abyte0 = i;
        }
        return abyte0;
    }

    public final String c()
    {
        return m;
    }

    public final void c(String s1)
    {
        j = s1;
    }

    public final int d()
    {
        return n;
    }

    public final boolean e()
    {
        return o;
    }

    public final void f()
    {
        o = true;
    }

    public final boolean g()
    {
        return p;
    }

    public final void h()
    {
        p = false;
    }

    public final int i()
    {
        return q;
    }

    public final int j()
    {
        return r;
    }

    public final boolean k()
    {
        return s;
    }

    public final int l()
    {
        return w;
    }

    public final int m()
    {
        return x;
    }

    public final boolean n()
    {
        return y;
    }

    public final boolean o()
    {
        return N;
    }

    public final boolean p()
    {
        return O;
    }

    public final String q()
    {
        return z;
    }

    public final String r()
    {
        return A;
    }

    public final String s()
    {
        return B;
    }

    public final u t()
    {
        return F;
    }

    public final String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        a(stringbuffer, "adkApplicationName", j, "");
        a(stringbuffer, "gatewayApplicationId", k, ", ");
        a(stringbuffer, "gatewayApplicationKey", Arrays.toString(l), ", ");
        a(stringbuffer, "gatewayIpAddress", E(), ", ");
        a(stringbuffer, "gatewaySslEnable", o, ", ");
        a(stringbuffer, "gatewayValidateSslCertificate", p, ", ");
        a(stringbuffer, "interpretatationRecorderTimeoutMS", q, ", ");
        a(stringbuffer, "interpretatationStartOfSpeechTimeoutMS", r, ", ");
        a(stringbuffer, "interpretationEndpointingEnabled", s, ", ");
        a(stringbuffer, "recordAudioRecorderTimeoutMS", t, ", ");
        a(stringbuffer, "recordAudioStartOfSpeechTimeoutMS", u, ", ");
        a(stringbuffer, "recordAudioEndpointingEnabled", v, ", ");
        a(stringbuffer, "dictationRecorderTimeoutMS", w, ", ");
        a(stringbuffer, "dictationStartOfSpeechTimeoutMS", x, ", ");
        a(stringbuffer, "dictationEndpointingEnabled", y, ", ");
        a(stringbuffer, "ttsDefaultVoice", z, ", ");
        a(stringbuffer, "ttsDefaultLanguage", A, ", ");
        a(stringbuffer, "dictationLanguage", B, ", ");
        a(stringbuffer, "inputCodec", C.toString(), ", ");
        a(stringbuffer, "outputCodec", D.toString(), ", ");
        a(stringbuffer, "audioOutputStream", E, ", ");
        a(stringbuffer, "cloudConfigLogLevel", F.toString(), ", ");
        a(stringbuffer, "recordAudioEndpointingValues", G, ", ");
        a(stringbuffer, "interpretationEndpointingValues", H, ", ");
        a(stringbuffer, "dictationEndpointingValues", I, ", ");
        a(stringbuffer, "userId", J, ", ");
        a(stringbuffer, "mobileAppName", K, ", ");
        a(stringbuffer, "mobileAppVersion", L, ", ");
        a(stringbuffer, "useCachedConfigOnReconnect", N, ", ");
        a(stringbuffer, "useProxyWhenConfigured", O, ", ");
        return stringbuffer.toString();
    }

    public final String u()
    {
        return j;
    }

    final e v()
    {
        return b(C);
    }

    final e w()
    {
        return b(D);
    }

    public final int x()
    {
        return E;
    }

    public final s y()
    {
        return H;
    }

    public final s z()
    {
        return I;
    }

    static 
    {
        a = u.a;
        b = bb.c;
        c = bb.c;
    }
}
