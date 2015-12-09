// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sony.snei.np.android.common.oauth.exception;


// Referenced classes of package com.sony.snei.np.android.common.oauth.exception:
//            NpamAuthGatewayException

public class NpamAuthGatewayProtocolException extends NpamAuthGatewayException
{

    private static final long serialVersionUID = 0x193d3989de18ad69L;
    private final int a;
    private final String b;
    private final String c;
    public final int d;

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(super.toString());
        stringbuilder.append(",");
        stringbuilder.append("http_status_code=").append(a);
        stringbuilder.append(",");
        stringbuilder.append("primitive_code=").append(d);
        return stringbuilder.toString();
    }
}
