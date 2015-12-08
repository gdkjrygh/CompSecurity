// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package io.card.payment:
//            k, ao

public final class A
    implements k
{

    private static Map a = new HashMap();

    public A()
    {
        a.put(ao.a, "\uCE74\uB4DC\uB97C \uC2A4\uCE94\uD560 \uC218 \uC788\uB294 \uC560\uD50C\uB9AC\uCF00\uC774\uC158\uC774 \uC544\uB2D9\uB2C8\uB2E4.");
        a.put(ao.b, "\uCDE8\uC18C");
        a.put(ao.c, "American Express");
        a.put(ao.d, "Discover");
        a.put(ao.e, "JCB");
        a.put(ao.f, "MasterCard");
        a.put(ao.g, "Visa");
        a.put(ao.h, "\uC644\uB8CC");
        a.put(ao.i, "CVV");
        a.put(ao.j, "\uC6B0\uD3B8\uBC88\uD638");
        a.put(ao.k, "\uC720\uD6A8\uAE30\uAC04");
        a.put(ao.l, "\uBC88\uD638");
        a.put(ao.m, "\uCE74\uB4DC");
        a.put(ao.n, "MM / YY");
        a.put(ao.o, "\uD655\uC778");
        a.put(ao.p, "\uCE74\uB4DC\uB97C \uC5EC\uAE30\uC5D0 \uAC16\uB2E4 \uB300\uC138\uC694.\n\uC790\uB3D9\uC73C\uB85C \uC2A4\uCE94\uB429\uB2C8\uB2E4.");
        a.put(ao.q, "\uD0A4\uBCF4\uB4DC\u2026");
        a.put(ao.r, "\uCE74\uB4DC \uBC88\uD638");
        a.put(ao.s, "\uCE74\uB4DC \uC138\uBD80\uC815\uBCF4");
        a.put(ao.t, "\uC774\uB7F0!");
        a.put(ao.u, "\uAE30\uAE30\uAC00 \uCE74\uBA54\uB77C\uB97C \uC774\uC6A9\uD55C \uCE74\uB4DC \uC22B\uC790 \uD310\uB3C5\uC744 \uC9C0\uC6D0\uD558\uC9C0 \uC54A\uC2B5\uB2C8\uB2E4.");
        a.put(ao.v, "\uAE30\uAE30\uC5D0\uC11C \uCE74\uBA54\uB77C\uB97C \uC0AC\uC6A9\uD560 \uC218 \uC5C6\uC2B5\uB2C8\uB2E4.");
        a.put(ao.w, "\uAE30\uAE30\uC5D0\uC11C \uCE74\uBA54\uB77C\uB97C \uC5EC\uB294 \uB3D9\uC548 \uC608\uC0C1\uCE58 \uBABB\uD55C \uC624\uB958\uAC00 \uBC1C\uC0DD\uD588\uC2B5\uB2C8\uB2E4.");
    }

    public final String a()
    {
        return "ko";
    }

    public final String a(Enum enum)
    {
        enum = (ao)enum;
        return (String)a.get(enum);
    }

    static 
    {
        new HashMap();
    }
}
