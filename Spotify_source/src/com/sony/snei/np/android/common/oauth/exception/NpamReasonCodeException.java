// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sony.snei.np.android.common.oauth.exception;


// Referenced classes of package com.sony.snei.np.android.common.oauth.exception:
//            NpamException

public class NpamReasonCodeException extends NpamException
{

    private static final long serialVersionUID = 0x44be81d2f07f3e6dL;
    public final int a;

    public NpamReasonCodeException(int i)
    {
        a = i;
    }

    public NpamReasonCodeException(Throwable throwable)
    {
        super(throwable);
        a = 0x800e0001;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(super.toString());
        stringbuilder.append(",");
        stringbuilder.append("reason_code=").append(a);
        return stringbuilder.toString();
    }
}
