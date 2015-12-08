// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            as, cx, at, ar

class afM
    implements Runnable
{

    final ar afK;
    final long afL;
    final String afM;
    final as afN;

    public void run()
    {
        if (as.a(afN) == null)
        {
            cx cx1 = cx.mQ();
            cx1.a(as.b(afN), afK);
            as.a(afN, cx1.mR());
        }
        as.a(afN).f(afL, afM);
    }

    (as as1, ar ar, long l, String s)
    {
        afN = as1;
        afK = ar;
        afL = l;
        afM = s;
        super();
    }
}
