// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.models.IPutIntoJson;
import java.util.Map;

// Referenced classes of package bo.app:
//            hd, gi

public final class ae extends Enum
    implements IPutIntoJson
{

    public static final ae a;
    public static final ae b;
    public static final ae c;
    public static final ae d;
    public static final ae e;
    public static final ae f;
    public static final ae g;
    public static final ae h;
    public static final ae i;
    public static final ae j;
    public static final ae k;
    public static final ae l;
    public static final ae m;
    public static final ae n;
    public static final ae o;
    public static final ae p;
    public static final ae q;
    public static final ae r;
    private static final Map t;
    private static final ae u[];
    public final String s;

    private ae(String s1, int i1, String s2)
    {
        super(s1, i1);
        s = s2;
    }

    public static ae a(String s1)
    {
        if (!t.containsKey(s1))
        {
            throw new IllegalArgumentException((new StringBuilder("Unknown String Value: ")).append(s1).toString());
        } else
        {
            return (ae)t.get(s1);
        }
    }

    public static ae valueOf(String s1)
    {
        return (ae)Enum.valueOf(bo/app/ae, s1);
    }

    public static ae[] values()
    {
        return (ae[])u.clone();
    }

    public final volatile Object forJsonPut()
    {
        return s;
    }

    static 
    {
        int i1 = 0;
        a = new ae("LOCATION_RECORDED", 0, "lr");
        b = new ae("CUSTOM_EVENT", 1, "ce");
        c = new ae("PURCHASE", 2, "p");
        d = new ae("PUSH_NOTIFICATION_TRACKING", 3, "pc");
        e = new ae("PUSH_NOTIFICATION_ACTION_TRACKING", 4, "ca");
        f = new ae("SOCIAL_NETWORK_SHARE", 5, "sn");
        g = new ae("INTERNAL", 6, "i");
        h = new ae("INTERNAL_ERROR", 7, "ie");
        i = new ae("CARD_IMPRESSION", 8, "ci");
        j = new ae("CARD_CLICK", 9, "cc");
        k = new ae("USER_TRANSITION", 10, "ut");
        l = new ae("INCREMENT", 11, "inc");
        m = new ae("ADD_TO_CUSTOM_ATTRIBUTE_ARRAY", 12, "add");
        n = new ae("REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY", 13, "rem");
        o = new ae("SET_CUSTOM_ATTRIBUTE_ARRAY", 14, "set");
        p = new ae("INAPP_MESSAGE_IMPRESSION", 15, "si");
        q = new ae("INAPP_MESSAGE_CLICK", 16, "sc");
        r = new ae("INAPP_MESSAGE_BUTTON_CLICK", 17, "sbc");
        u = (new ae[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r
        });
        java.util.HashMap hashmap = hd.a();
        ae aae[] = values();
        for (int j1 = aae.length; i1 < j1; i1++)
        {
            ae ae1 = aae[i1];
            hashmap.put(ae1.s, ae1);
        }

        t = gi.a(hashmap);
    }
}
