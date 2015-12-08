// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts;

import com.microsoft.onlineid.internal.k;
import com.microsoft.onlineid.internal.o;

// Referenced classes of package com.microsoft.onlineid.sts:
//            l, p

public final class r extends Enum
{

    public static final r A;
    public static final r B;
    public static final r C;
    public static final r D;
    public static final r E;
    public static final r F;
    public static final r G;
    public static final r H;
    private static final r K[];
    public static final r a;
    public static final r b;
    public static final r c;
    public static final r d;
    public static final r e;
    public static final r f;
    public static final r g;
    public static final r h;
    public static final r i;
    public static final r j;
    public static final r k;
    public static final r l;
    public static final r m;
    public static final r n;
    public static final r o;
    public static final r p;
    public static final r q;
    public static final r r;
    public static final r s;
    public static final r t;
    public static final r u;
    public static final r v;
    public static final r w;
    public static final r x;
    public static final r y;
    public static final r z;
    private final Integer I;
    private final String J;

    private r(String s1)
    {
        super(s1, 33);
        I = null;
        J = null;
    }

    private r(String s1, int i1, int j1)
    {
        super(s1, i1);
        I = Integer.valueOf(j1);
        J = null;
    }

    public static r a(l l1)
    {
        com.microsoft.onlineid.internal.k.a(l1, "error");
        r r2 = b(l1.b());
        r r1 = r2;
        if (r2 == null)
        {
            r1 = b(l1.a());
        }
        l1 = r1;
        if (r1 == null)
        {
            l1 = H;
        }
        return l1;
    }

    public static r a(p p1)
    {
        r r1;
        r r2;
        com.microsoft.onlineid.internal.k.a(p1, "error");
        r2 = b(p1.b());
        r1 = r2;
        if (r2 != null) goto _L2; else goto _L1
_L1:
        r ar[];
        int i1;
        int j1;
        p1 = p1.a();
        com.microsoft.onlineid.internal.o.a(p1, "subCode");
        ar = values();
        j1 = ar.length;
        i1 = 0;
_L4:
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        r1 = ar[i1];
        if (r1.J == null || !r1.J.equals(p1)) goto _L3; else goto _L2
_L2:
        p1 = r1;
        if (r1 == null)
        {
            p1 = H;
        }
        return p1;
_L3:
        i1++;
          goto _L4
        r1 = null;
          goto _L2
    }

    public static String a(int i1)
    {
        r r1 = b(i1);
        if (r1 != null)
        {
            return (new StringBuilder()).append(r1.name()).append(" (0x").append(Integer.toHexString(i1)).append(")").toString();
        } else
        {
            return (new StringBuilder("0x")).append(Integer.toHexString(i1)).toString();
        }
    }

    private static r b(int i1)
    {
        r ar[] = values();
        int k1 = ar.length;
        for (int j1 = 0; j1 < k1; j1++)
        {
            r r1 = ar[j1];
            if (r1.I != null && r1.I.equals(Integer.valueOf(i1)))
            {
                return r1;
            }
        }

        return null;
    }

    public static r valueOf(String s1)
    {
        return (r)Enum.valueOf(com/microsoft/onlineid/sts/r, s1);
    }

    public static r[] values()
    {
        return (r[])K.clone();
    }

    static 
    {
        a = new r("PP_E_FORCESIGNIN", 0, 0x8004100c);
        b = new r("PPCRL_REQUEST_E_FORCE_SIGNIN", 1, 0x800488e5);
        c = new r("PP_E_INVALIDREQUEST", 2, 0x8004101c);
        d = new r("PP_E_SA_INVALID_REGISTRATION_ID", 3, 0x8004a008);
        e = new r("PP_E_SA_INVALID_DEVICE_ID", 4, 0x8004a007);
        f = new r("PP_E_INTERFACE_INVALIDPUID", 5, 0x80043457);
        g = new r("PP_E_SA_DEVICE_NOT_FOUND", 6, 0x8004a006);
        h = new r("PP_E_TOTP_AUTHENTICATOR_ID_INVALID", 7, 0x80049c35);
        i = new r("PP_E_FLOWDISABLED", 8, 0x80043422);
        j = new r("PP_E_NOT_OVER_SSL", 9, 0x80041016);
        k = new r("PP_E_INTERFACE_NOT_POST", 10, 0x80043449);
        l = new r("PP_E_INTERFACE_INVALIDREQUESTFORMAT", 11, 0x80043450);
        m = new r("PP_E_SA_CANT_APPROVE_DENIED_SESSION", 12, 0x8004a00b);
        n = new r("PP_E_SA_CANT_DENY_APPROVED_SESSION", 13, 0x8004a00d);
        o = new r("PP_E_SA_SID_ALREADY_APPROVED", 14, 0x8004a00e);
        p = new r("PP_E_SA_INVALID_STATE_TRANSITION", 15, 0x8004a001);
        q = new r("PP_E_SA_INVALID_OPERATION", 16, 0x8004a004);
        r = new r("PP_E_BAD_PASSWORD", 17, 0x80041012);
        s = new r("PP_E_INTERFACE_INVALID_PASSWORD", 18, 0x80043455);
        t = new r("PP_E_MISSING_CERT", 19, 0x80045c28);
        u = new r("PPCRL_REQUEST_E_PARTNER_NOT_FOUND", 20, 0x8004882a);
        v = new r("PPCRL_REQUEST_E_INVALID_POLICY", 21, 0x8004882c);
        w = new r("PP_E_STS_NONCE_REQUIRED", 22, 0x80045c39);
        x = new r("PPCRL_REQUEST_E_PARTNER_HAS_NO_ASYMMETRIC_KEY", 23, 0x8004882b);
        y = new r("PPCRL_REQUEST_E_PARTNER_NEED_PIN", 24, 0x800488e7);
        z = new r("PPCRL_REQUEST_E_DEVICE_DA_INVALID", 25, 0x8004883d);
        A = new r("PPCRL_E_DEVICE_DA_TOKEN_EXPIRED", 26, 0x80048069);
        B = new r("PP_E_K_ERROR_DB_MEMBER_DOES_NOT_EXIST", 27, 0xcffffc15);
        C = new r("PP_E_K_ERROR_DB_MEMBER_EXISTS", 28, 0xcffffc16);
        D = new r("PPCRL_REQUEST_E_BAD_MEMBER_NAME_OR_PASSWORD", 29, 0x80048821);
        E = new r("PP_E_NGC_INVALID_CLOUD_PIN", 30, 0x8004a08f);
        F = new r("PP_E_NGC_ACCOUNT_LOCKED", 31, 0x8004a090);
        G = new r("PP_E_NGC_LOGIN_KEY_NOT_FOUND", 32, 0x8004a088);
        H = new r("Unrecognized");
        K = (new r[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A, B, C, D, 
            E, F, G, H
        });
    }
}
