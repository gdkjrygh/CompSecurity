// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.content.Intent;

// Referenced classes of package com.facebook.share.internal:
//            ShareInternalUtility

static final class val.requestCode
    implements com.facebook.internal.lback
{

    final int val$requestCode;

    public boolean onActivityResult(int i, Intent intent)
    {
        return ShareInternalUtility.handleActivityResult(val$requestCode, i, intent, ShareInternalUtility.getShareResultProcessor(null));
    }

    (int i)
    {
        val$requestCode = i;
        super();
    }
}
