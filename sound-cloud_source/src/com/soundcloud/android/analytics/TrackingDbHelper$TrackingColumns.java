// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import android.provider.BaseColumns;

// Referenced classes of package com.soundcloud.android.analytics:
//            TrackingDbHelper

abstract class this._cls0
    implements BaseColumns
{

    static final String BACKEND = "backend";
    static final String DATA = "data";
    static final String TIMESTAMP = "timestamp";
    final TrackingDbHelper this$0;

    ()
    {
        this$0 = TrackingDbHelper.this;
        super();
    }
}
