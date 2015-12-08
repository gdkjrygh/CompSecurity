// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.content.Intent;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.app.contacts:
//            JoinRequestHelper

final class val.isPhone
    implements Callable
{

    final JoinRequestHelper this$0;
    final String val$address;
    final boolean val$isPhone;
    final call val$request;

    public final Intent call()
        throws Exception
    {
        return getJoinIntentToShare(val$request.url, val$address, val$isPhone);
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = final_joinrequesthelper;
        val$request = ;
        val$address = s;
        val$isPhone = Z.this;
        super();
    }
}
