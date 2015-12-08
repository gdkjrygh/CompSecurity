// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.goggles.b;

import com.google.android.apps.gsa.a.c.d;
import com.google.android.apps.gsa.speech.c.a.b;
import java.util.ArrayList;

// Referenced classes of package com.google.android.goggles.b:
//            d

public final class c
    implements b
{

    final int a;
    final int b;
    final ArrayList c;

    public c(ArrayList arraylist)
    {
        c = arraylist;
        b = arraylist.size();
        a = b + 1;
    }

    public final com.google.android.apps.gsa.speech.c.a.c a()
    {
        return new com.google.android.apps.gsa.speech.c.a.c(new d[] {
            new com.google.android.goggles.b.d(this)
        });
    }
}
