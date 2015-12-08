// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.widget.FacebookDialog;

// Referenced classes of package com.facebook.internal:
//            FacebookWebFallbackDialog

class val.callback
    implements com.facebook.widget.
{

    private final com.facebook.widget._cls1.val.callback val$appCall;
    private final com.facebook.widget._cls1.val.callback val$callback;
    private final Context val$context;

    public void onComplete(Bundle bundle, FacebookException facebookexception)
    {
        Intent intent = new Intent();
        facebookexception = bundle;
        if (bundle == null)
        {
            facebookexception = new Bundle();
        }
        intent.putExtras(facebookexception);
        FacebookDialog.handleActivityResult(val$context, val$appCall, val$appCall.etRequestCode(), intent, val$callback);
    }

    ()
    {
        val$context = context1;
        val$appCall = _pcls1;
        val$callback = _pcls1_1;
        super();
    }
}
