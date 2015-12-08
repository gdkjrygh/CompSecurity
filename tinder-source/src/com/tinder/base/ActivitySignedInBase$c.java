// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.base;

import com.tinder.utils.e;
import java.util.ArrayList;

// Referenced classes of package com.tinder.base:
//            ActivitySignedInBase

private final class b
    implements Runnable
{

    final ActivitySignedInBase a;
    private ArrayList b;

    public final void run()
    {
        e.a(new com.tinder.managers.(a.w, b)).a(false);
    }

    (ActivitySignedInBase activitysignedinbase, ArrayList arraylist)
    {
        a = activitysignedinbase;
        super();
        b = arraylist;
    }
}
