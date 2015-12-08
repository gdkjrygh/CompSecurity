// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;

import android.net.Uri;

// Referenced classes of package com.adjust.sdk:
//            ActivityHandler

private class clickTime
{

    long clickTime;
    final ActivityHandler this$0;
    Uri url;

    (Uri uri, long l)
    {
        this$0 = ActivityHandler.this;
        super();
        url = uri;
        clickTime = l;
    }
}
