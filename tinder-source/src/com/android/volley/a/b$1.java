// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.a;

import java.util.Comparator;

// Referenced classes of package com.android.volley.a:
//            b

static final class 
    implements Comparator
{

    public final volatile int compare(Object obj, Object obj1)
    {
        obj = (byte[])obj;
        obj1 = (byte[])obj1;
        return obj.length - obj1.length;
    }

    ()
    {
    }
}
