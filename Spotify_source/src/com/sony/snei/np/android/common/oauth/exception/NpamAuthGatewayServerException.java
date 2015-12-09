// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sony.snei.np.android.common.oauth.exception;


// Referenced classes of package com.sony.snei.np.android.common.oauth.exception:
//            NpamAuthGatewayException

public class NpamAuthGatewayServerException extends NpamAuthGatewayException
{

    private static final long serialVersionUID = 0x57e035368bfba057L;
    public final int a;

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(super.toString());
        stringbuilder.append(",");
        stringbuilder.append("error_code=").append(a);
        return stringbuilder.toString();
    }
}
