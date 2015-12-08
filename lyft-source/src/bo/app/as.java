// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.HashMap;
import java.util.Map;

public final class as extends Enum
{

    private static final Map A;
    private static final as B[];
    public static final as a;
    public static final as b;
    public static final as c;
    public static final as d;
    public static final as e;
    public static final as f;
    public static final as g;
    public static final as h;
    public static final as i;
    public static final as j;
    public static final as k;
    public static final as l;
    public static final as m;
    public static final as n;
    public static final as o;
    public static final as p;
    public static final as q;
    public static final as r;
    public static final as s;
    public static final as t;
    public static final as u;
    public static final as v;
    public static final as w;
    public static final as x;
    public static final as y;
    public static final as z;

    private as(String s1, int i1)
    {
        super(s1, i1);
    }

    public static as a(String s1)
    {
        if (!A.containsKey(s1))
        {
            return z;
        } else
        {
            return (as)A.get(s1);
        }
    }

    public static as valueOf(String s1)
    {
        return (as)Enum.valueOf(bo/app/as, s1);
    }

    public static as[] values()
    {
        return (as[])B.clone();
    }

    static 
    {
        int i1 = 0;
        a = new as("CUSTOM_EVENT", 0);
        b = new as("LOG_PURCHASE", 1);
        c = new as("LOG_SOCIAL_SHARE", 2);
        d = new as("LOG_PUSH_NOTIFICATION_OPENED", 3);
        e = new as("SUBMIT_FEEDBACK", 4);
        f = new as("ADD_TO_CUSTOM_ATTRIBUTE_ARRAY", 5);
        g = new as("INCREMENT_CUSTOM_ATTRIBUTE", 6);
        h = new as("REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY", 7);
        i = new as("SET_CUSTOM_ATTRIBUTE_ARRAY", 8);
        j = new as("SET_CUSTOM_ATTRIBUTE", 9);
        k = new as("UNSET_CUSTOM_ATTRIBUTE", 10);
        l = new as("SET_CUSTOM_ATTRIBUTE_TO_NOW", 11);
        m = new as("SET_CUSTOM_ATTRIBUTE_TO_SECONDS_FROM_EPOCH", 12);
        n = new as("SET_LAST_KNOWN_LOCATION", 13);
        o = new as("SET_AVATAR_IMAGE_URL", 14);
        p = new as("SET_BIO", 15);
        q = new as("SET_COUNTRY", 16);
        r = new as("SET_DATE_OF_BIRTH", 17);
        s = new as("SET_EMAIL", 18);
        t = new as("SET_FIRST_NAME", 19);
        u = new as("SET_GENDER", 20);
        v = new as("SET_HOME_CITY", 21);
        w = new as("SET_LAST_NAME", 22);
        x = new as("SET_PHONE_NUMBER", 23);
        y = new as("SEND_WEAR_DEVICE", 24);
        z = new as("UNSUPPORTED_SDK_ACTION", 25);
        B = (new as[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z
        });
        A = new HashMap();
        as aas[] = values();
        for (int j1 = aas.length; i1 < j1; i1++)
        {
            as as1 = aas[i1];
            A.put(as1.name(), as1);
        }

    }
}
