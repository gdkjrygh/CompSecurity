// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.util.encoders;


// Referenced classes of package org.bouncycastle.util.encoders:
//            Base64Encoder

public class UrlBase64Encoder extends Base64Encoder
{

    public UrlBase64Encoder()
    {
        a[a.length - 2] = 45;
        a[a.length - 1] = 95;
        b = 46;
        a();
    }
}
