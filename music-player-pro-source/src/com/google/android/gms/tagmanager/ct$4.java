// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ct, cn, cl

class atn
    implements atn
{

    final ct atn;

    public void a(atn atn1, Set set, Set set1, cn cn1)
    {
        set.addAll(atn1.qv());
        set1.addAll(atn1.qw());
        cn1.pT().c(atn1.qv(), atn1.qA());
        cn1.pU().c(atn1.qw(), atn1.qB());
    }

    (ct ct1)
    {
        atn = ct1;
        super();
    }
}
