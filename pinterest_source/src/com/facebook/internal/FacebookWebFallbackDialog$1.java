// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.widget.FacebookDialog;

final class val.callback
    implements com.facebook.widget.
{

    final com.facebook.widget._cls1.val.callback val$appCall;
    final com.facebook.widget._cls1.val.callback val$callback;
    final Context val$context;

    public final void onComplete(Bundle bundle, FacebookException facebookexception)
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
