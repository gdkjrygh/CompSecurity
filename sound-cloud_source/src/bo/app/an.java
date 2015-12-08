// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.HashMap;
import java.util.Map;

public final class an extends Enum
{

    public static final an a;
    public static final an b;
    public static final an c;
    public static final an d;
    public static final an e;
    public static final an f;
    public static final an g;
    public static final an h;
    public static final an i;
    public static final an j;
    public static final an k;
    public static final an l;
    public static final an m;
    public static final an n;
    public static final an o;
    public static final an p;
    public static final an q;
    public static final an r;
    public static final an s;
    public static final an t;
    public static final an u;
    public static final an v;
    public static final an w;
    public static final an x;
    private static final Map y;
    private static final an z[];

    private an(String s1, int i1)
    {
        super(s1, i1);
    }

    public static an a(String s1)
    {
        if (!y.containsKey(s1))
        {
            return x;
        } else
        {
            return (an)y.get(s1);
        }
    }

    public static an valueOf(String s1)
    {
        return (an)Enum.valueOf(bo/app/an, s1);
    }

    public static an[] values()
    {
        return (an[])z.clone();
    }

    static 
    {
        int i1 = 0;
        a = new an("CUSTOM_EVENT", 0);
        b = new an("LOG_PURCHASE", 1);
        c = new an("LOG_PUSH_NOTIFICATION_OPENED", 2);
        d = new an("SUBMIT_FEEDBACK", 3);
        e = new an("ADD_TO_CUSTOM_ATTRIBUTE_ARRAY", 4);
        f = new an("INCREMENT_CUSTOM_ATTRIBUTE", 5);
        g = new an("REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY", 6);
        h = new an("SET_CUSTOM_ATTRIBUTE_ARRAY", 7);
        i = new an("SET_CUSTOM_ATTRIBUTE", 8);
        j = new an("UNSET_CUSTOM_ATTRIBUTE", 9);
        k = new an("SET_CUSTOM_ATTRIBUTE_TO_NOW", 10);
        l = new an("SET_CUSTOM_ATTRIBUTE_TO_SECONDS_FROM_EPOCH", 11);
        m = new an("SET_LAST_KNOWN_LOCATION", 12);
        n = new an("SET_AVATAR_IMAGE_URL", 13);
        o = new an("SET_COUNTRY", 14);
        p = new an("SET_DATE_OF_BIRTH", 15);
        q = new an("SET_EMAIL", 16);
        r = new an("SET_FIRST_NAME", 17);
        s = new an("SET_GENDER", 18);
        t = new an("SET_HOME_CITY", 19);
        u = new an("SET_LAST_NAME", 20);
        v = new an("SET_PHONE_NUMBER", 21);
        w = new an("SEND_WEAR_DEVICE", 22);
        x = new an("UNSUPPORTED_SDK_ACTION", 23);
        z = (new an[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x
        });
        y = new HashMap();
        an aan[] = values();
        for (int j1 = aan.length; i1 < j1; i1++)
        {
            an an1 = aan[i1];
            y.put(an1.name(), an1);
        }

    }
}
