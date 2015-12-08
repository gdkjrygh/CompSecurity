// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import com.appboy.d.c;
import java.util.Map;

// Referenced classes of package a.a:
//            fz, fe

public final class j extends Enum
    implements c
{

    public static final j a;
    public static final j b;
    public static final j c;
    public static final j d;
    public static final j e;
    public static final j f;
    public static final j g;
    public static final j h;
    public static final j i;
    public static final j j;
    public static final j k;
    public static final j l;
    public static final j m;
    public static final j n;
    public static final j o;
    public static final j p;
    public static final j q;
    private static final Map s;
    private static final j t[];
    public final String r;

    private j(String s1, int i1, String s2)
    {
        super(s1, i1);
        r = s2;
    }

    public static j a(String s1)
    {
        if (!s.containsKey(s1))
        {
            throw new IllegalArgumentException((new StringBuilder("Unknown String Value: ")).append(s1).toString());
        } else
        {
            return (j)s.get(s1);
        }
    }

    public static j valueOf(String s1)
    {
        return (j)Enum.valueOf(a/a/j, s1);
    }

    public static j[] values()
    {
        return (j[])t.clone();
    }

    public final volatile Object a()
    {
        return r;
    }

    static 
    {
        int i1 = 0;
        a = new j("LOCATION_RECORDED", 0, "lr");
        b = new j("CUSTOM_EVENT", 1, "ce");
        c = new j("PURCHASE", 2, "p");
        d = new j("PUSH_NOTIFICATION_TRACKING", 3, "pc");
        e = new j("SOCIAL_NETWORK_SHARE", 4, "sn");
        f = new j("INTERNAL", 5, "i");
        g = new j("INTERNAL_ERROR", 6, "ie");
        h = new j("CARD_IMPRESSION", 7, "ci");
        i = new j("CARD_CLICK", 8, "cc");
        j = new j("USER_TRANSITION", 9, "ut");
        k = new j("INCREMENT", 10, "inc");
        l = new j("ADD_TO_CUSTOM_ATTRIBUTE_ARRAY", 11, "add");
        m = new j("REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY", 12, "rem");
        n = new j("SET_CUSTOM_ATTRIBUTE_ARRAY", 13, "set");
        o = new j("INAPP_MESSAGE_IMPRESSION", 14, "si");
        p = new j("INAPP_MESSAGE_CLICK", 15, "sc");
        q = new j("INAPP_MESSAGE_BUTTON_CLICK", 16, "sbc");
        t = (new j[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q
        });
        java.util.HashMap hashmap = fz.a();
        j aj[] = values();
        for (int k1 = aj.length; i1 < k1; i1++)
        {
            j j1 = aj[i1];
            hashmap.put(j1.r, j1);
        }

        s = fe.a(hashmap);
    }
}
