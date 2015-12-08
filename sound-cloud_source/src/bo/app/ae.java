// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.d.e;
import java.util.Map;

// Referenced classes of package bo.app:
//            he, gj

public final class ae extends Enum
    implements e
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
    private static final Map s;
    private static final ae t[];
    public final String r;

    private ae(String s1, int i1, String s2)
    {
        super(s1, i1);
        r = s2;
    }

    public static ae a(String s1)
    {
        if (!s.containsKey(s1))
        {
            throw new IllegalArgumentException((new StringBuilder("Unknown String Value: ")).append(s1).toString());
        } else
        {
            return (ae)s.get(s1);
        }
    }

    public static ae valueOf(String s1)
    {
        return (ae)Enum.valueOf(bo/app/ae, s1);
    }

    public static ae[] values()
    {
        return (ae[])t.clone();
    }

    public final volatile Object forJsonPut()
    {
        return r;
    }

    static 
    {
        int i1 = 0;
        a = new ae("LOCATION_RECORDED", 0, "lr");
        b = new ae("CUSTOM_EVENT", 1, "ce");
        c = new ae("PURCHASE", 2, "p");
        d = new ae("PUSH_NOTIFICATION_TRACKING", 3, "pc");
        e = new ae("PUSH_NOTIFICATION_ACTION_TRACKING", 4, "ca");
        f = new ae("INTERNAL", 5, "i");
        g = new ae("INTERNAL_ERROR", 6, "ie");
        h = new ae("CARD_IMPRESSION", 7, "ci");
        i = new ae("CARD_CLICK", 8, "cc");
        j = new ae("USER_TRANSITION", 9, "ut");
        k = new ae("INCREMENT", 10, "inc");
        l = new ae("ADD_TO_CUSTOM_ATTRIBUTE_ARRAY", 11, "add");
        m = new ae("REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY", 12, "rem");
        n = new ae("SET_CUSTOM_ATTRIBUTE_ARRAY", 13, "set");
        o = new ae("INAPP_MESSAGE_IMPRESSION", 14, "si");
        p = new ae("INAPP_MESSAGE_CLICK", 15, "sc");
        q = new ae("INAPP_MESSAGE_BUTTON_CLICK", 16, "sbc");
        t = (new ae[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q
        });
        java.util.HashMap hashmap = he.a();
        ae aae[] = values();
        for (int j1 = aae.length; i1 < j1; i1++)
        {
            ae ae1 = aae[i1];
            hashmap.put(ae1.r, ae1);
        }

        s = gj.a(hashmap);
    }
}
