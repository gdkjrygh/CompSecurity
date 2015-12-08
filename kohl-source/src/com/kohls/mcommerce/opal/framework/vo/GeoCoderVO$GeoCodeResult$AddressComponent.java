// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.vo;

import java.io.Serializable;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.framework.vo:
//            GeoCoderVO

public class this._cls1
    implements Serializable
{

    private static final long serialVersionUID = 3L;
    private String long_name;
    private String short_name;
    final types this$1;
    private List types;

    public String getLong_name()
    {
        return long_name;
    }

    public String getShort_name()
    {
        return short_name;
    }

    public List getTypes()
    {
        return types;
    }

    public void setLong_name(String s)
    {
        long_name = s;
    }

    public void setShort_name(String s)
    {
        short_name = s;
    }

    public void setTypes(List list)
    {
        types = list;
    }

    public ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
