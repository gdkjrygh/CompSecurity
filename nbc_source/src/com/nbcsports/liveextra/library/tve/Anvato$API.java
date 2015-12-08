// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import rx.Observable;

// Referenced classes of package com.nbcsports.liveextra.library.tve:
//            Anvato, AnvatoRequest

public static interface st
{

    public abstract Observable channelLookup(String s, AnvatoRequest anvatorequest);

    public abstract Observable eventLookup(String s, AnvatoRequest anvatorequest);

    public abstract Observable schedulerLookup(String s, AnvatoRequest anvatorequest);
}
