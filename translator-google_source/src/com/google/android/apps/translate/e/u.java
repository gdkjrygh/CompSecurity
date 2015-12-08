// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.e;

import android.view.View;

// Referenced classes of package com.google.android.apps.translate.e:
//            p

final class u
    implements Comparable
{

    public int a;
    public View b;
    final p c;

    public u(p p, int i, View view)
    {
        c = p;
        super();
        a = i;
        b = view;
    }

    public final int compareTo(Object obj)
    {
        return ((u)obj).a - a;
    }
}
