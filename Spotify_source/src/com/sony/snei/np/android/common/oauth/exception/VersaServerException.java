// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sony.snei.np.android.common.oauth.exception;


// Referenced classes of package com.sony.snei.np.android.common.oauth.exception:
//            VersaException

public class VersaServerException extends VersaException
{

    private static final long serialVersionUID = 0xd273616249b50d3dL;
    public final int a;
    public final int b;
    public final String c;
    public final String d;

    public VersaServerException(int i, int j, String s, String s1)
    {
        a = i;
        b = j;
        c = s;
        d = s1;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(super.toString());
        stringbuilder.append(",");
        stringbuilder.append("http_status_code=").append(a);
        stringbuilder.append(",");
        stringbuilder.append("error_code=").append(b);
        stringbuilder.append(",");
        stringbuilder.append("error=").append(c);
        stringbuilder.append(",");
        stringbuilder.append("error_description=").append(d);
        return stringbuilder.toString();
    }
}
