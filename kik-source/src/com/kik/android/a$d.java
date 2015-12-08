// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.android;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.kik.android:
//            a

private static final class <init>
{

    List a;

    public final List a()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); arraylist.add(((asNext)iterator.next()).a)) { }
        return arraylist;
    }

    public ()
    {
        a = new ArrayList();
    }
}
