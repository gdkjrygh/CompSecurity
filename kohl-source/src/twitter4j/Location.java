// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;

public interface Location
    extends Serializable
{

    public abstract String getCountryCode();

    public abstract String getCountryName();

    public abstract String getName();

    public abstract int getPlaceCode();

    public abstract String getPlaceName();

    public abstract String getURL();

    public abstract int getWoeid();
}
