// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import java.util.Collections;
import java.util.List;
import rx.b.g;

// Referenced classes of package com.soundcloud.android.discovery:
//            PlaylistDiscoveryItem

final class 
    implements g
{

    public final volatile Object call(Object obj, Object obj1)
    {
        return call((List)obj, (List)obj1);
    }

    public final List call(List list, List list1)
    {
        return Collections.singletonList(new PlaylistDiscoveryItem(list, list1));
    }

    ()
    {
    }
}
