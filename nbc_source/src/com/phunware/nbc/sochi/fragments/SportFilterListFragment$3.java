// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import com.nbcsports.liveextra.library.configuration.Sport;
import org.apache.commons.collections4.Transformer;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            SportFilterListFragment

class this._cls0
    implements Transformer
{

    final SportFilterListFragment this$0;

    public volatile Object transform(Object obj)
    {
        return transform((Sport)obj);
    }

    public String transform(Sport sport)
    {
        return sport.getName();
    }

    ()
    {
        this$0 = SportFilterListFragment.this;
        super();
    }
}
