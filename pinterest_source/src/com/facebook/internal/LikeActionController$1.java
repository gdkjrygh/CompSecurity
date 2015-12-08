// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Intent;
import java.util.UUID;

// Referenced classes of package com.facebook.internal:
//            LikeActionController

final class val.callId
    implements eationCallback
{

    final UUID val$callId;
    final Intent val$data;
    final int val$requestCode;
    final int val$resultCode;

    public final void onComplete(LikeActionController likeactioncontroller)
    {
        LikeActionController.access$000(likeactioncontroller, val$requestCode, val$resultCode, val$data, val$callId);
    }

    eationCallback()
    {
        val$requestCode = i;
        val$resultCode = j;
        val$data = intent;
        val$callId = uuid;
        super();
    }
}
