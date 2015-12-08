// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sony.snei.np.android.common.oauth.exception;

import java.io.IOException;
import org.apache.http.auth.AuthenticationException;

// Referenced classes of package com.sony.snei.np.android.common.oauth.exception:
//            VersaException

public class VersaNetworkException extends VersaException
{

    private static final long serialVersionUID = 0x47edd6c84fc3be67L;

    public VersaNetworkException(IOException ioexception)
    {
        super(ioexception);
    }

    public VersaNetworkException(AuthenticationException authenticationexception)
    {
        super(authenticationexception);
    }
}
