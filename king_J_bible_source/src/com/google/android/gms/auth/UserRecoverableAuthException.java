// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.content.Intent;

// Referenced classes of package com.google.android.gms.auth:
//            GoogleAuthException

public class UserRecoverableAuthException extends GoogleAuthException
{

    private final Intent mIntent;

    public UserRecoverableAuthException(String s, Intent intent)
    {
        super(s);
        mIntent = intent;
    }

    public Intent getIntent()
    {
        if (mIntent == null)
        {
            return null;
        } else
        {
            return new Intent(mIntent);
        }
    }
}
