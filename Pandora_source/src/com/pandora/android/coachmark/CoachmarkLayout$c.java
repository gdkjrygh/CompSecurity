// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.coachmark;

import com.pandora.android.provider.b;
import com.pandora.radio.util.k;
import p.cw.c;

// Referenced classes of package com.pandora.android.coachmark:
//            CoachmarkLayout, CoachmarkBuilder

private class <init>
    implements Runnable
{

    final CoachmarkLayout a;

    public void run()
    {
        a.a(a);
        <init> <init>1 = CoachmarkLayout.a(a).e();
        if (<init>1 != null)
        {
            b.a.b().o().a(<init>1., <init>1.., false, .);
        }
    }

    private (CoachmarkLayout coachmarklayout)
    {
        a = coachmarklayout;
        super();
    }

    a(CoachmarkLayout coachmarklayout, a a1)
    {
        this(coachmarklayout);
    }
}
