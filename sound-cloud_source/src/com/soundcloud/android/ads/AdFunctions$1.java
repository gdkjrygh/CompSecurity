// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.functions.Predicate;

// Referenced classes of package com.soundcloud.android.ads:
//            AdProperty

final class et
    implements Predicate
{

    public final boolean apply(PropertySet propertyset)
    {
        return propertyset.contains(AdProperty.AD_URN);
    }

    public final volatile boolean apply(Object obj)
    {
        return apply((PropertySet)obj);
    }

    et()
    {
    }
}
