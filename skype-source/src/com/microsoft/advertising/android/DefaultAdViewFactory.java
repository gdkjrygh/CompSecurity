// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.content.Context;

// Referenced classes of package com.microsoft.advertising.android:
//            AdViewFactory, af, AdControl, d, 
//            b, av, at, ar, 
//            bt, by, bl, g, 
//            aw

class DefaultAdViewFactory
    implements AdViewFactory
{

    private static int $SWITCH_TABLE$com$microsoft$advertising$android$Ad$AdType[];
    public static final String TAG = "AdViewFactory";
    private static final DefaultAdViewFactory instance = new DefaultAdViewFactory();

    static int[] $SWITCH_TABLE$com$microsoft$advertising$android$Ad$AdType()
    {
        int ai[] = $SWITCH_TABLE$com$microsoft$advertising$android$Ad$AdType;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[d.a.values().length];
        try
        {
            ai[d.a.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            ai[d.a.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[d.a.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[d.a.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        $SWITCH_TABLE$com$microsoft$advertising$android$Ad$AdType = ai;
        return ai;
    }

    private DefaultAdViewFactory()
    {
    }

    public static DefaultAdViewFactory get()
    {
        return instance;
    }

    public b getAdLayout(d d1, Context context, AdControl adcontrol, g g, aw aw)
    {
        Object obj;
        j j;
        af.a(new Object[] {
            adcontrol
        });
        j = adcontrol.w();
        obj = null;
        $SWITCH_TABLE$com$microsoft$advertising$android$Ad$AdType()[d1.e().ordinal()];
        JVM INSTR tableswitch 1 4: default 64
    //                   1 99
    //                   2 78
    //                   3 120
    //                   4 145;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        d1 = obj;
_L7:
        if (d1 != null)
        {
            d1.setId(1);
        }
        return d1;
_L3:
        av.b("AdViewFactory");
        d1 = new at(context, g, j);
        continue; /* Loop/switch isn't completed */
_L2:
        av.b("AdViewFactory");
        d1 = new ar(context, g, j);
        continue; /* Loop/switch isn't completed */
_L4:
        d1 = new bt(context, g, j, aw);
        d1.setLayoutParams(by.a());
        continue; /* Loop/switch isn't completed */
_L5:
        av.b("AdViewFactory");
        d1 = new bl(context, g, j, aw, adcontrol.u(), adcontrol.c());
        if (true) goto _L7; else goto _L6
_L6:
    }

}
