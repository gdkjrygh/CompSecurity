// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import java.util.Comparator;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelVideoActivity

class this._cls0
    implements Comparator
{

    final AdMarvelVideoActivity this$0;

    public int compare(ogressTracker ogresstracker, ogressTracker ogresstracker1)
    {
        return ogresstracker.offset - ogresstracker1.offset;
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((ogressTracker)obj, (ogressTracker)obj1);
    }

    ogressTracker()
    {
        this$0 = AdMarvelVideoActivity.this;
        super();
    }
}
