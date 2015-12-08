// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.os.Bundle;

// Referenced classes of package com.soundcloud.android.utils:
//            DetachableResultReceiver

private class resultData
{

    int resultCode;
    Bundle resultData;
    final DetachableResultReceiver this$0;

    public I(int i, Bundle bundle)
    {
        this$0 = DetachableResultReceiver.this;
        super();
        resultCode = i;
        resultData = bundle;
    }
}
