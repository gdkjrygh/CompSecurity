// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public class zk extends vq
{

    public zk(String s, String s1, String s2, String s3, String s4)
    {
        super(zd.g);
        putRequest("productId", s);
        putRequest("skuAttr", s1);
        if (!TextUtils.isEmpty(s3))
        {
            putRequest("promotionId", s3);
        }
        if (!TextUtils.isEmpty(s4))
        {
            putRequest("promotionType", s4);
        }
        putRequest("_lang", s2);
    }
}
