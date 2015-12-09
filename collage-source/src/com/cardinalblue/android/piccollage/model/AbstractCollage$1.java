// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model;

import com.cardinalblue.android.piccollage.view.k;
import java.util.Comparator;

// Referenced classes of package com.cardinalblue.android.piccollage.model:
//            AbstractCollage

class a
    implements Comparator
{

    final AbstractCollage a;

    public int a(k k1, k k2)
    {
        return k1.W() - k2.W();
    }

    public int compare(Object obj, Object obj1)
    {
        return a((k)obj, (k)obj1);
    }

    A(AbstractCollage abstractcollage)
    {
        a = abstractcollage;
        super();
    }
}
