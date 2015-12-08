// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import java.util.Locale;

// Referenced classes of package com.microsoft.advertising.android:
//            av, AdWebView, q, p, 
//            bu, Dimensions

public final class an
{

    private final AdWebView a;

    protected an(AdWebView adwebview)
    {
        if (adwebview == null)
        {
            throw new IllegalArgumentException();
        } else
        {
            a = adwebview;
            return;
        }
    }

    static String b(String s)
    {
        av.a("JavascriptTranslator", (new StringBuilder("ormma change event: ")).append(s).toString());
        return String.format("window.ormmaview.fireChangeEvent(%s);", new Object[] {
            s
        });
    }

    public static String c(String s)
    {
        return b(String.format("{placementType: '%s'}", new Object[] {
            s
        }));
    }

    final int a(int i)
    {
        return a.b().a().m().a(i, true);
    }

    public final String a(Dimensions dimensions)
    {
        int i = a(dimensions.c);
        int j = a(dimensions.d);
        av.a("JavascriptTranslator", String.format("ormma.getMaxSize()->%dx%d", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j)
        }));
        return b(String.format("{maxSize: %s}", new Object[] {
            String.format(Locale.ENGLISH, "{width: %d, height: %d }", new Object[] {
                Integer.valueOf(i), Integer.valueOf(j)
            })
        }));
    }

    public final void a()
    {
        a("ormma.close();");
    }

    public final void a(double d1, double d2, float f)
    {
        a(b(String.format("{location: {lat: %s, lon: %s, acc: %s}}", new Object[] {
            String.valueOf(d1), String.valueOf(d2), String.valueOf(f)
        })));
    }

    public final void a(float f)
    {
        a(b(String.format("{heading: %s}", new Object[] {
            String.valueOf(f)
        })));
    }

    public final void a(float f, float f1, float f2)
    {
        a(b(String.format("{tilt: {x : %f, y : %f, z : %f}}", new Object[] {
            Float.valueOf(f), Float.valueOf(f1), Float.valueOf(f2)
        })));
    }

    public final void a(bf.b b1)
    {
        a(b(String.format("{state:'%s'}", new Object[] {
            b1.toString().toLowerCase()
        })));
    }

    public final void a(String s)
    {
        a.b(s);
    }

    public final void a(String s, String s1)
    {
        a(String.format("window.ormmaview.fireResponseEvent('%s', '%s');", new Object[] {
            s, s1
        }));
    }

    public final void a(String s, String s1, String s2)
    {
        a((new StringBuilder("window.ormmaview.setPayload(")).append(s).append(", ").append(s1).append(",'msMainAdDiv', ").append(s2).append(");").toString());
    }

    public final void a(boolean flag)
    {
        av.a("ormma", (new StringBuilder("setViewable(")).append(flag).append(")").toString());
        String s;
        if (flag)
        {
            s = "true";
        } else
        {
            s = "false";
        }
        a(b(String.format("{viewable: %s}", new Object[] {
            s
        })));
    }

    public final void b()
    {
        a("window.ormmaview.fireShakeEvent();");
    }

    public final void d(String s)
    {
        a(b(String.format("{network: '%s'}", new Object[] {
            s
        })));
    }
}
