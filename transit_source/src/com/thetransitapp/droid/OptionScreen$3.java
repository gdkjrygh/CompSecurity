// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid;

import com.thetransitapp.droid.model.TransitBundle;
import java.util.Comparator;

// Referenced classes of package com.thetransitapp.droid:
//            OptionScreen

class this._cls0
    implements Comparator
{

    final OptionScreen this$0;

    public int compare(TransitBundle transitbundle, TransitBundle transitbundle1)
    {
        return transitbundle.getName().compareTo(transitbundle1.getName());
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((TransitBundle)obj, (TransitBundle)obj1);
    }

    ndle()
    {
        this$0 = OptionScreen.this;
        super();
    }
}
