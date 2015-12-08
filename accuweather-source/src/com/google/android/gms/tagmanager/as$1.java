// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            as, cx, at, ar

class afJ
    implements Runnable
{

    final ar afH;
    final long afI;
    final String afJ;
    final as afK;

    public void run()
    {
        if (as.a(afK) == null)
        {
            cx cx1 = cx.mL();
            cx1.a(as.b(afK), afH);
            as.a(afK, cx1.mM());
        }
        as.a(afK).f(afI, afJ);
    }

    (as as1, ar ar, long l, String s)
    {
        afK = as1;
        afH = ar;
        afI = l;
        afJ = s;
        super();
    }
}
