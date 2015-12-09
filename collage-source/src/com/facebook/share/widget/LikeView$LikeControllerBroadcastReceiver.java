// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;

// Referenced classes of package com.facebook.share.widget:
//            LikeView

private class <init> extends BroadcastReceiver
{

    final LikeView this$0;

    public void onReceive(Context context, Intent intent)
    {
        boolean flag1 = true;
        context = intent.getAction();
        intent = intent.getExtras();
        boolean flag = flag1;
        if (intent != null)
        {
            String s = intent.getString("com.facebook.sdk.LikeActionController.OBJECT_ID");
            flag = flag1;
            if (!Utility.isNullOrEmpty(s))
            {
                if (Utility.areObjectsEqual(LikeView.access$600(LikeView.this), s))
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
            }
        }
        if (flag) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ("com.facebook.sdk.LikeActionController.UPDATED".equals(context))
        {
            LikeView.access$700(LikeView.this);
            return;
        }
        if (!"com.facebook.sdk.LikeActionController.DID_ERROR".equals(context))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (LikeView.access$800(LikeView.this) == null) goto _L1; else goto _L3
_L3:
        LikeView.access$800(LikeView.this)._mth0(NativeProtocol.getExceptionFromErrorData(intent));
        return;
        if (!"com.facebook.sdk.LikeActionController.DID_RESET".equals(context)) goto _L1; else goto _L4
_L4:
        LikeView.access$1000(LikeView.this, LikeView.access$600(LikeView.this), LikeView.access$900(LikeView.this));
        LikeView.access$700(LikeView.this);
        return;
    }

    private ()
    {
        this$0 = LikeView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
