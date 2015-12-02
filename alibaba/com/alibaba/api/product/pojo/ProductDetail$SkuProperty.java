// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.product.pojo;

import java.io.Serializable;
import java.util.ArrayList;

// Referenced classes of package com.alibaba.api.product.pojo:
//            ProductDetail

public static class skuPropertyValues
    implements Serializable
{

    public boolean isShowTypeColor;
    public int order;
    public String showType;
    public skuPropertyValues sizeInfo;
    public long skuPropertyId;
    public String skuPropertyName;
    public ArrayList skuPropertyValues;

    public ()
    {
        skuPropertyValues = new ArrayList();
    }
}
