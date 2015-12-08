// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.model;


// Referenced classes of package com.facebook.model:
//            GraphObject

public interface GraphLocation
    extends GraphObject
{

    public abstract String getCity();

    public abstract String getCountry();

    public abstract double getLatitude();

    public abstract double getLongitude();

    public abstract String getState();

    public abstract String getStreet();

    public abstract String getZip();

    public abstract void setCity(String s);

    public abstract void setCountry(String s);

    public abstract void setLatitude(double d);

    public abstract void setLongitude(double d);

    public abstract void setState(String s);

    public abstract void setStreet(String s);

    public abstract void setZip(String s);
}
