// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sony.snei.np.android.account.oauth.hide;

import android.os.Bundle;

public class ApiException extends Exception
{

    private static final long serialVersionUID = 0xdda7688dbb9df4e8L;
    public final Bundle a = new Bundle();

    public ApiException(Bundle bundle)
    {
        a.putAll(bundle);
    }
}
