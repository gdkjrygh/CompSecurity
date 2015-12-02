// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.product.pojo;

import java.io.Serializable;

public class ProductDesc
    implements Serializable
{
    public static class ProductMultiLangProps
        implements Serializable
    {

        public String description;
        public String productId;
        public String translateSource;

        public ProductMultiLangProps()
        {
        }
    }


    public String desc;
    public ProductMultiLangProps productMultiLangProps;

    public ProductDesc()
    {
    }
}
