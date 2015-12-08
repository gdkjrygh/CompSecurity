// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.models.IPutIntoJson;
import java.util.Map;

// Referenced classes of package bo.app:
//            hj, go

public final class aj extends Enum
    implements IPutIntoJson
{

    public static final aj a;
    public static final aj b;
    public static final aj c;
    public static final aj d;
    public static final aj e;
    public static final aj f;
    public static final aj g;
    public static final aj h;
    public static final aj i;
    public static final aj j;
    public static final aj k;
    public static final aj l;
    public static final aj m;
    public static final aj n;
    public static final aj o;
    public static final aj p;
    public static final aj q;
    public static final aj r;
    private static final Map t;
    private static final aj u[];
    public final String s;

    private aj(String s1, int i1, String s2)
    {
        super(s1, i1);
        s = s2;
    }

    public static aj a(String s1)
    {
        if (!t.containsKey(s1))
        {
            throw new IllegalArgumentException((new StringBuilder("Unknown String Value: ")).append(s1).toString());
        } else
        {
            return (aj)t.get(s1);
        }
    }

    public static aj valueOf(String s1)
    {
        return (aj)Enum.valueOf(bo/app/aj, s1);
    }

    public static aj[] values()
    {
        return (aj[])u.clone();
    }

    public final volatile Object forJsonPut()
    {
        return s;
    }

    static 
    {
        int i1 = 0;
        a = new aj("LOCATION_RECORDED", 0, "lr");
        b = new aj("CUSTOM_EVENT", 1, "ce");
        c = new aj("PURCHASE", 2, "p");
        d = new aj("PUSH_NOTIFICATION_TRACKING", 3, "pc");
        e = new aj("PUSH_NOTIFICATION_ACTION_TRACKING", 4, "ca");
        f = new aj("SOCIAL_NETWORK_SHARE", 5, "sn");
        g = new aj("INTERNAL", 6, "i");
        h = new aj("INTERNAL_ERROR", 7, "ie");
        i = new aj("CARD_IMPRESSION", 8, "ci");
        j = new aj("CARD_CLICK", 9, "cc");
        k = new aj("USER_TRANSITION", 10, "ut");
        l = new aj("INCREMENT", 11, "inc");
        m = new aj("ADD_TO_CUSTOM_ATTRIBUTE_ARRAY", 12, "add");
        n = new aj("REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY", 13, "rem");
        o = new aj("SET_CUSTOM_ATTRIBUTE_ARRAY", 14, "set");
        p = new aj("INAPP_MESSAGE_IMPRESSION", 15, "si");
        q = new aj("INAPP_MESSAGE_CLICK", 16, "sc");
        r = new aj("INAPP_MESSAGE_BUTTON_CLICK", 17, "sbc");
        u = (new aj[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r
        });
        java.util.HashMap hashmap = hj.a();
        aj aaj[] = values();
        for (int j1 = aaj.length; i1 < j1; i1++)
        {
            aj aj1 = aaj[i1];
            hashmap.put(aj1.s, aj1);
        }

        t = go.a(hashmap);
    }
}
