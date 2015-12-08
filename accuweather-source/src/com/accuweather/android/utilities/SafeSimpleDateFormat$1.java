// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import java.text.SimpleDateFormat;

// Referenced classes of package com.accuweather.android.utilities:
//            SafeSimpleDateFormat

class this._cls0 extends ThreadLocal
{

    final SafeSimpleDateFormat this$0;

    protected volatile Object initialValue()
    {
        return initialValue();
    }

    protected SimpleDateFormat initialValue()
    {
        return new SimpleDateFormat(SafeSimpleDateFormat.access$000(SafeSimpleDateFormat.this), SafeSimpleDateFormat.access$100(SafeSimpleDateFormat.this));
    }

    ()
    {
        this$0 = SafeSimpleDateFormat.this;
        super();
    }
}
