// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tune.crosspromo;

import android.location.Location;
import com.mobileapptracker.MATGender;
import com.mobileapptracker.MATParameters;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.tune.crosspromo:
//            TuneAdMetadata, TuneAdOrientation

public class TuneAdParams
{

    private String A;
    private String B;
    private String C;
    private String D;
    private String E;
    private String F;
    private String G;
    private String H;
    private String I;
    private String J;
    private boolean K;
    private String L;
    private String M;
    private String N;
    private float O;
    private int P;
    private int Q;
    private String R;
    private String S;
    private String T;
    private String U;
    private String V;
    private String W;
    private String X;
    private String Y;
    private String Z;
    public boolean a;
    private String aa;
    private String ab;
    private String ac;
    private String ad;
    private String ae;
    private Date af;
    private MATGender ag;
    private Set ah;
    private Location ai;
    private JSONObject aj;
    private JSONObject ak;
    public int b;
    public int c;
    public int d;
    public int e;
    private TuneAdOrientation f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private String s;
    private String t;
    private String u;
    private boolean v;
    private String w;
    private String x;
    private String y;
    private String z;

    public TuneAdParams(String s1, MATParameters matparameters, TuneAdMetadata tuneadmetadata, TuneAdOrientation tuneadorientation, int i1)
    {
        g = s1;
        f = tuneadorientation;
        boolean flag;
        if (i1 == 2)
        {
            o = "landscape";
        } else
        {
            o = "portrait";
        }
        h = matparameters.c();
        j = matparameters.g();
        k = matparameters.l();
        l = matparameters.m();
        m = matparameters.o();
        n = matparameters.q();
        a = matparameters.y();
        p = matparameters.s();
        q = matparameters.t();
        r = matparameters.u();
        s = matparameters.x();
        u = matparameters.C();
        if (matparameters.D() != null && matparameters.D().equals("1"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        v = flag;
        x = matparameters.F();
        y = matparameters.H();
        z = matparameters.G();
        s1 = matparameters.p();
        A = s1.substring(Math.max(0, s1.length() - 4));
        B = matparameters.J();
        C = matparameters.K();
        F = matparameters.O();
        G = matparameters.P();
        H = matparameters.Q();
        I = matparameters.S();
        J = matparameters.T();
        L = matparameters.X();
        M = matparameters.Z();
        N = matparameters.aa();
        O = Float.parseFloat(matparameters.ac());
        P = Integer.parseInt(matparameters.ad());
        Q = Integer.parseInt(matparameters.ae());
        R = matparameters.af();
        S = matparameters.ah();
        U = matparameters.al();
        s1 = matparameters.B();
        if (s1.equals("0"))
        {
            ag = MATGender.a;
        } else
        if (s1.equals("1"))
        {
            ag = MATGender.b;
        } else
        {
            ag = MATGender.c;
        }
        t = matparameters.A();
        w = matparameters.E();
        T = matparameters.ak();
        if (matparameters.I().equals("1"))
        {
            K = true;
        } else
        {
            K = false;
        }
        W = matparameters.am();
        X = matparameters.an();
        Y = matparameters.ao();
        V = matparameters.aq();
        Z = matparameters.ar();
        aa = matparameters.as();
        ab = matparameters.at();
        ac = matparameters.U();
        ad = matparameters.V();
        ae = matparameters.W();
        if (i1 == 2)
        {
            d = Q;
            e = P;
            b = P;
            c = Q;
        } else
        {
            b = Q;
            c = P;
            d = P;
            e = Q;
        }
        if (tuneadmetadata != null)
        {
            af = tuneadmetadata.b();
            ag = tuneadmetadata.d();
            ah = tuneadmetadata.e();
            ai = tuneadmetadata.f();
            if (ai != null)
            {
                i = String.valueOf(ai.getAltitude());
                D = String.valueOf(ai.getLatitude());
                E = String.valueOf(ai.getLongitude());
            }
            if (tuneadmetadata.g() != 0.0D && tuneadmetadata.h() != 0.0D)
            {
                D = String.valueOf(tuneadmetadata.g());
                E = String.valueOf(tuneadmetadata.h());
            }
            if (tuneadmetadata.c() != null)
            {
                aj = new JSONObject(tuneadmetadata.c());
            }
            if (tuneadmetadata.a())
            {
                a = tuneadmetadata.a();
            }
            matparameters.a(ag);
            if (ai != null)
            {
                matparameters.a(ai);
            }
        }
    }

    public JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        Object obj;
        JSONObject jsonobject1;
        JSONObject jsonobject2;
        JSONObject jsonobject3;
        JSONObject jsonobject4;
        obj = (new JSONObject()).put("advertiserId", h).put("keyCheck", A).put("name", k).put("version", l).put("installDate", x).put("installReferrer", y).put("installer", z).put("referralSource", M).put("referralUrl", N).put("package", J);
        jsonobject1 = (new JSONObject()).put("altitude", i).put("connectionType", m).put("country", n).put("deviceBrand", p).put("deviceCarrier", q).put("deviceCpuType", r).put("deviceModel", s).put("language", B).put("latitude", D).put("longitude", E).put("mcc", G).put("mnc", H).put("os", "Android").put("osVersion", I).put("timezone", S).put("userAgent", U);
        jsonobject2 = new JSONObject();
        jsonobject2.put("androidId", j);
        jsonobject2.put("gaid", u);
        jsonobject2.put("googleAdTrackingDisabled", v);
        jsonobject2.put("matId", F);
        jsonobject3 = (new JSONObject()).put("density", O).put("height", P).put("width", Q);
        jsonobject4 = new JSONObject();
        if (!f.equals(TuneAdOrientation.a)) goto _L2; else goto _L1
_L1:
        JSONObject jsonobject5 = (new JSONObject()).put("width", b).put("height", c);
        JSONObject jsonobject7 = (new JSONObject()).put("width", d).put("height", e);
        jsonobject4.put("portrait", jsonobject5).put("landscape", jsonobject7);
_L5:
        JSONObject jsonobject6;
        JSONArray jsonarray;
        jsonobject6 = new JSONObject();
        if (af != null)
        {
            jsonobject6.put("birthDate", Long.toString(af.getTime() / 1000L));
        }
        jsonobject6.put("facebookUserId", t);
        jsonobject6.put("gender", ag);
        jsonobject6.put("googleUserId", w);
        if (ah == null)
        {
            break MISSING_BLOCK_LABEL_737;
        }
        jsonarray = new JSONArray();
        for (Iterator iterator = ah.iterator(); iterator.hasNext(); jsonarray.put((String)iterator.next())) { }
        break MISSING_BLOCK_LABEL_726;
        obj;
        ((JSONException) (obj)).printStackTrace();
        return jsonobject;
_L2:
        if (!f.equals(TuneAdOrientation.b)) goto _L4; else goto _L3
_L3:
        jsonobject4.put("portrait", (new JSONObject()).put("width", b).put("height", c));
          goto _L5
_L4:
        if (!f.equals(TuneAdOrientation.c)) goto _L5; else goto _L6
_L6:
        jsonobject4.put("landscape", (new JSONObject()).put("width", d).put("height", e));
          goto _L5
        jsonobject6.put("keywords", jsonarray);
        jsonobject6.put("payingUser", K);
        jsonobject6.put("twitterUserId", T);
        jsonobject6.put("userEmailMd5", W);
        jsonobject6.put("userEmailSha1", X);
        jsonobject6.put("userEmailSha256", Y);
        if (V != null && V.length() != 0)
        {
            jsonobject6.put("userId", V);
        }
        jsonobject6.put("userNameMd5", Z);
        jsonobject6.put("userNameSha1", aa);
        jsonobject6.put("userNameSha256", ab);
        jsonobject6.put("userPhoneMd5", ac);
        jsonobject6.put("userPhoneSha1", ad);
        jsonobject6.put("userPhoneSha256", ae);
        jsonobject.put("currentOrientation", o);
        jsonobject.put("debugMode", a);
        jsonobject.put("sdkVersion", R);
        jsonobject.put("plugin", L);
        jsonobject.put("lastOpenLogId", C);
        jsonobject.put("app", obj);
        jsonobject.put("device", jsonobject1);
        jsonobject.put("ids", jsonobject2);
        jsonobject.put("screen", jsonobject3);
        jsonobject.put("sizes", jsonobject4);
        jsonobject.put("user", jsonobject6);
        jsonobject.put("targets", aj);
        jsonobject.put("refs", ak);
        jsonobject.put("placement", g);
        return jsonobject;
    }

    public void a(JSONObject jsonobject)
    {
        ak = jsonobject;
    }
}
