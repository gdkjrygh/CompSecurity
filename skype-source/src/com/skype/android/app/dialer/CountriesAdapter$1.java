// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.dialer;

import java.util.Comparator;

// Referenced classes of package com.skype.android.app.dialer:
//            CountriesAdapter

final class this._cls0
    implements Comparator
{

    final CountriesAdapter this$0;

    public final int compare(this._cls0 _pcls0, this._cls0 _pcls0_1)
    {
        return _pcls0.title.compareTo(_pcls0_1.title);
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        return compare((compare)obj, (compare)obj1);
    }

    ()
    {
        this$0 = CountriesAdapter.this;
        super();
    }
}
