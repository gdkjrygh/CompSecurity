// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.ActivityNotFoundException;
import android.content.Intent;

// Referenced classes of package com.facebook:
//            AuthorizationClient

abstract class  extends 
{

    private static final long serialVersionUID = 1L;
    final AuthorizationClient this$0;

    protected boolean tryIntent(Intent intent, int i)
    {
        if (intent == null)
        {
            return false;
        }
        try
        {
            getStartActivityDelegate().startActivityForResult(intent, i);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return false;
        }
        return true;
    }

    ate()
    {
        this$0 = AuthorizationClient.this;
        super(AuthorizationClient.this);
    }
}
