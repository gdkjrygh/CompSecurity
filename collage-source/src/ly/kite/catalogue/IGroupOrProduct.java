// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.catalogue;

import java.net.URL;

public interface IGroupOrProduct
{

    public abstract boolean containsMultiplePrices();

    public abstract URL getDisplayImageURL();

    public abstract String getDisplayLabel();

    public abstract int getDisplayLabelColour();

    public abstract String getDisplayPrice();
}
