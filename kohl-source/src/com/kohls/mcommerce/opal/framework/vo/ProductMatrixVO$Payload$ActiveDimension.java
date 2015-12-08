// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.vo;

import java.io.Serializable;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.framework.vo:
//            ProductMatrixVO

public class this._cls0
    implements Serializable
{
    public class ActiveDimensionValue
        implements Serializable
    {

        private static final long serialVersionUID = 42L;
        private String ID;
        private int index;
        private String name;
        private int productCount;
        final ProductMatrixVO.Payload.ActiveDimension this$1;

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

        public ActiveDimensionValue()
        {
            this$1 = ProductMatrixVO.Payload.ActiveDimension.this;
            super();
        }
    }


    private static final long serialVersionUID = 41L;
    private List activeDimensionValues;
    private int index;
    private String label;
    private String name;
    final name this$0;

    public List getActiveDimensionValues()
    {
        return activeDimensionValues;
    }

    public int getIndex()
    {
        return index;
    }

    public String getLabel()
    {
        return label;
    }

    public String getName()
    {
        return name;
    }

    public void setActiveDimensionValues(List list)
    {
        activeDimensionValues = list;
    }

    public void setIndex(int i)
    {
        index = i;
    }

    public void setLabel(String s)
    {
        label = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public ActiveDimensionValue.this._cls1()
    {
        this$0 = this._cls0.this;
        super();
    }
}
