// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.microsoft.advertising.android:
//            g

public static final class e extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;
    public static final g g;
    private static final Map h = new TreeMap() {

            
            {
                put(g.b.a, Arrays.asList(new g.b[] {
                    g.b.b, g.b.g
                }));
                put(g.b.b, Arrays.asList(new g.b[] {
                    g.b.c, g.b.g
                }));
                put(g.b.c, Arrays.asList(new g.b[] {
                    g.b.d, g.b.g, g.b.b
                }));
                put(g.b.d, Arrays.asList(new g.b[] {
                    g.b.b, g.b.e, g.b.g
                }));
                put(g.b.e, Arrays.asList(new g.b[] {
                    g.b.g, g.b.f
                }));
                put(g.b.f, Arrays.asList(new g.b[] {
                    g.b.c, g.b.g, g.b.b
                }));
                put(g.b.g, Arrays.asList(new g.b[] {
                    g.b.b, g.b.c, g.b.d, g.b.e
                }));
            }
    };
    private static final g i[];

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(com/microsoft/advertising/android/g$b, s);
    }

    public static e[] values()
    {
        e ae[] = i;
        int j = ae.length;
        e ae1[] = new i[j];
        System.arraycopy(ae, 0, ae1, 0, j);
        return ae1;
    }

    public final boolean a(i j)
    {
        return h.containsKey(this) && h.get(this) != null && ((List)h.get(this)).contains(j);
    }

    static 
    {
        a = new <init>("NOT_READY", 0);
        b = new <init>("WAITING_TO_FETCH", 1);
        c = new <init>("FETCHING", 2);
        d = new <init>("PRE_RENDER", 3);
        e = new <init>("PUBLISHER_SHOW_WAIT", 4);
        f = new <init>("SHOW_WAIT", 5);
        g = new <init>("SUSPENDED", 6);
        i = (new i[] {
            a, b, c, d, e, f, g
        });
    }

    private e(String s, int j)
    {
        super(s, j);
    }
}
