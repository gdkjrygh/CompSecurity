// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.upsell;

import com.spotify.mobile.android.util.Assertion;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.spotify.mobile.android.ui.activity.upsell:
//            Reason

public class mReasons
    implements Serializable
{

    public static final b a;
    public static final b b;
    private static final Reason c[];
    private static final Reason d[];
    private static Map e;
    private static final long serialVersionUID = 42L;
    public Reason mReasons[];

    public static mReasons a(Reason reason)
    {
        mReasons mreasons = (mReasons)e.get(reason);
        if (mreasons == null)
        {
            Assertion.a("Reason is not defined in a refresh group - it needs to be to get reloaded by the upsell service", reason.name());
        }
        return mreasons;
    }

    public String toString()
    {
        return (new StringBuilder("ReasonGroup{mReasons=")).append(Arrays.toString(mReasons)).append('}').toString();
    }

    static 
    {
        boolean flag = false;
        c = (new Reason[] {
            Reason.c, Reason.d, Reason.e, Reason.f, Reason.g, Reason.h, Reason.i
        });
        d = (new Reason[] {
            Reason.l
        });
        a = new <init>(c);
        b = new <init>(d);
        new <init>(new Reason[0]);
        e = new HashMap();
        Reason areason[] = a.mReasons;
        int k = areason.length;
        for (int i = 0; i < k; i++)
        {
            Reason reason = areason[i];
            e.put(reason, a);
        }

        areason = b.mReasons;
        k = areason.length;
        for (int j = ((flag) ? 1 : 0); j < k; j++)
        {
            Reason reason1 = areason[j];
            e.put(reason1, b);
        }

    }

    private (Reason areason[])
    {
        mReasons = areason;
    }
}
