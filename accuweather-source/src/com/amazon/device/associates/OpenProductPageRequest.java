// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;


// Referenced classes of package com.amazon.device.associates:
//            OpenRetailPageRequest, an

public class OpenProductPageRequest extends OpenRetailPageRequest
{

    private String a;

    public OpenProductPageRequest(String s)
    {
        an.a(s, "productId");
        a = s;
    }

    public String getProductId()
    {
        return a;
    }
}
