// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import android.text.Editable;
import java.util.Comparator;

// Referenced classes of package com.facebook.orca.contacts.picker:
//            ce, p

class q
    implements Comparator
{

    final Editable a;
    final p b;

    q(p p, Editable editable)
    {
        b = p;
        a = editable;
        super();
    }

    public int a(ce ce1, ce ce2)
    {
        int i = a.getSpanStart(ce1);
        return a.getSpanStart(ce2) - i;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((ce)obj, (ce)obj1);
    }
}
