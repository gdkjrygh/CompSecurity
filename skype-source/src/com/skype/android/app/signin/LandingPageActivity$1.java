// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.skype.Account;
import java.io.File;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.app.signin:
//            LandingPageActivity

final class val.account
    implements Callable
{

    final LandingPageActivity this$0;
    final Account val$account;

    public final Bitmap call()
        throws Exception
    {
        File file = new File(getApplicationContext().getFilesDir(), val$account.getSkypenameProp().concat(".jpg"));
        if (file.exists())
        {
            return BitmapFactory.decodeFile(file.getAbsolutePath());
        } else
        {
            return null;
        }
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = final_landingpageactivity;
        val$account = Account.this;
        super();
    }
}
