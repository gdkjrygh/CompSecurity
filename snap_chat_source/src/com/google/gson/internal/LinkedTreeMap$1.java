// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;

import java.util.Comparator;

// Referenced classes of package com.google.gson.internal:
//            LinkedTreeMap

static final class 
    implements Comparator
{

    public final int compare(Object obj, Object obj1)
    {
        return ((Comparable)obj).compareTo((Comparable)obj1);
    }

    ()
    {
    }
}
