// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.vo;

import java.io.Serializable;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.framework.vo:
//            IValueObject

public class ProductMatrixVO
    implements IValueObject
{
    public static class Payload
    {

        private static final long serialVersionUID = 20L;
        private List activeDimensions;
        private String autoCorrectedTerm;
        private List availableTerms;
        private List dimensions;
        private String legalDisclaimer;
        private List links;
        private List products;
        private ResponseHeader responseHeaders;
        private String searchTerm;
        private List sorts;

        public List getActiveDimensions()
        {
            return activeDimensions;
        }

        public String getAutoCorrectedTerm()
        {
            return autoCorrectedTerm;
        }

        public List getAvailableTerms()
        {
            return availableTerms;
        }

        public List getDimensions()
        {
            return dimensions;
        }

        public String getLegalDisclaimer()
        {
            return legalDisclaimer;
        }

        public List getLinks()
        {
            return links;
        }

        public List getProducts()
        {
            return products;
        }

        public ResponseHeader getResponseHeaders()
        {
            return responseHeaders;
        }

        public String getSearchTerm()
        {
            return searchTerm;
        }

        public List getSorts()
        {
            return sorts;
        }

        public void setActiveDimensions(List list)
        {
            activeDimensions = list;
        }

        public void setAutoCorrectedTerm(String s)
        {
            autoCorrectedTerm = s;
        }

        public void setAvailableTerms(List list)
        {
            availableTerms = list;
        }

        public void setDimensions(List list)
        {
            dimensions = list;
        }

        public void setLegalDisclaimer(String s)
        {
            legalDisclaimer = s;
        }

        public void setLinks(List list)
        {
            links = list;
        }

        public void setProducts(List list)
        {
            products = list;
        }

        public void setResponseHeaders(ResponseHeader responseheader)
        {
            responseHeaders = responseheader;
        }

        public void setSearchTerm(String s)
        {
            searchTerm = s;
        }

        public void setSorts(List list)
        {
            sorts = list;
        }

        public Payload()
        {
        }
    }

    public class Payload.ActiveDimension
        implements Serializable
    {

        private static final long serialVersionUID = 41L;
        private List activeDimensionValues;
        private int index;
        private String label;
        private String name;
        final Payload this$0;

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

        public Payload.ActiveDimension()
        {
            this$0 = Payload.this;
            super();
        }
    }

    public class Payload.ActiveDimension.ActiveDimensionValue
        implements Serializable
    {

        private static final long serialVersionUID = 42L;
        private String ID;
        private int index;
        private String name;
        private int productCount;
        final Payload.ActiveDimension this$1;

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

        public Payload.ActiveDimension.ActiveDimensionValue()
        {
            this$1 = Payload.ActiveDimension.this;
            super();
        }
    }


    private String count;
    private List errors;
    private String limit;
    private String offset;
    private Payload payload;
    private ResponseHeader responseHeaders;

    public ProductMatrixVO()
    {
    }

    public String getCount()
    {
        return count;
    }

    public List getErrors()
    {
        return errors;
    }

    public String getLimit()
    {
        return limit;
    }

    public String getOffset()
    {
        return offset;
    }

    public Payload getPayload()
    {
        return payload;
    }

    public ResponseHeader getResponseHeaders()
    {
        return responseHeaders;
    }

    public void setCount(String s)
    {
        count = s;
    }

    public void setErrors(List list)
    {
        errors = list;
    }

    public void setLimit(String s)
    {
        limit = s;
    }

    public void setOffset(String s)
    {
        offset = s;
    }

    public void setPayload(Payload payload1)
    {
        payload = payload1;
    }

    public void setResponseHeaders(ResponseHeader responseheader)
    {
        responseHeaders = responseheader;
    }

    // Unreferenced inner class com/kohls/mcommerce/opal/framework/vo/ProductMatrixVO$Payload$AvailableTerm
    /* block-local class not found */
    class Payload.AvailableTerm {}


    // Unreferenced inner class com/kohls/mcommerce/opal/framework/vo/ProductMatrixVO$Payload$Dimension
    /* block-local class not found */
    class Payload.Dimension {}


    // Unreferenced inner class com/kohls/mcommerce/opal/framework/vo/ProductMatrixVO$Payload$Link
    /* block-local class not found */
    class Payload.Link {}


    // Unreferenced inner class com/kohls/mcommerce/opal/framework/vo/ProductMatrixVO$Payload$Product
    /* block-local class not found */
    class Payload.Product {}


    // Unreferenced inner class com/kohls/mcommerce/opal/framework/vo/ProductMatrixVO$Payload$ResponseHeader
    /* block-local class not found */
    class Payload.ResponseHeader {}


    // Unreferenced inner class com/kohls/mcommerce/opal/framework/vo/ProductMatrixVO$Payload$Sort
    /* block-local class not found */
    class Payload.Sort {}


    // Unreferenced inner class com/kohls/mcommerce/opal/framework/vo/ProductMatrixVO$ResponseHeader
    /* block-local class not found */
    class ResponseHeader {}

}
