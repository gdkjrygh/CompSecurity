// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.product.pojo;

import java.io.Serializable;
import java.util.ArrayList;

public class MobileCategoryResult
    implements Serializable
{

    public static final int VERSION = 3;
    public ArrayList brands;
    public ArrayList tags;
    public ArrayList textCategories;
    public ArrayList visualCategories;

    public MobileCategoryResult()
    {
    }
}
