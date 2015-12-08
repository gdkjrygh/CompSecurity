// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.coachmark;


// Referenced classes of package com.pandora.android.coachmark:
//            e, CoachmarkBuilder

class a
    implements Runnable
{

    final CoachmarkBuilder a;
    final e b;

    public void run()
    {
        b.a(a, true, true);
    }

    hmarkBuilder(e e1, CoachmarkBuilder coachmarkbuilder)
    {
        b = e1;
        a = coachmarkbuilder;
        super();
    }
}
