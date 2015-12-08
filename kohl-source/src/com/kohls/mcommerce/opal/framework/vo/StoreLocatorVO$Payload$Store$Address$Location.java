// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.vo;

import java.io.Serializable;

// Referenced classes of package com.kohls.mcommerce.opal.framework.vo:
//            StoreLocatorVO

public class this._cls3
    implements Serializable
{

    private static final long serialVersionUID = 16L;
    private String latitude;
    private String longitude;
    final longitude this$3;

    public double getLatitude()
    {
        return Double.parseDouble(latitude);
    }

    public double getLongitude()
    {
        return Double.parseDouble(longitude);
    }

    public void setLatitude(String s)
    {
        latitude = s;
    }

    public void setLongitude(String s)
    {
        longitude = s;
    }

    public Y()
    {
        this$3 = this._cls3.this;
        super();
    }
}
