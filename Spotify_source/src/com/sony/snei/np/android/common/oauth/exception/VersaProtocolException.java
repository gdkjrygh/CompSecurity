// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sony.snei.np.android.common.oauth.exception;


// Referenced classes of package com.sony.snei.np.android.common.oauth.exception:
//            VersaException

public class VersaProtocolException extends VersaException
{

    private static final long serialVersionUID = 0xfaeb174b305096b4L;
    public final int a;
    public final String b;
    public final String c;
    public final int d;

    public VersaProtocolException(int i, int j)
    {
        a = i;
        d = j;
        b = null;
        c = null;
    }

    public VersaProtocolException(int i, String s, String s1)
    {
        a = i;
        d = 2;
        b = s;
        c = s1;
    }

    public VersaProtocolException(int i, Throwable throwable)
    {
        super(throwable);
        a = i;
        d = 2;
        b = null;
        c = null;
    }

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
