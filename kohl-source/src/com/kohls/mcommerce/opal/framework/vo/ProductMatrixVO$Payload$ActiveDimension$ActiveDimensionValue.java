// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.vo;

import java.io.Serializable;

// Referenced classes of package com.kohls.mcommerce.opal.framework.vo:
//            ProductMatrixVO

public class this._cls1
    implements Serializable
{

    private static final long serialVersionUID = 42L;
    private String ID;
    private int index;
    private String name;
    private int productCount;
    final productCount this$1;

    public String getID()
    {
        return ID;
    }

    public int getIndex()
    {
        return index;
    }

    public String getName()
    {
        return name;
    }

    public int getProductCount()
    {
        return productCount;
    }

    public void setID(String s)
    {
        ID = s;
    }

    public void setIndex(int i)
    {
        index = i;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setProductCount(int i)
    {
        productCount = i;
    }

    public ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
