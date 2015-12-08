// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.widget;

import com.thetransitapp.droid.model.TransitBundle;
import com.thetransitapp.droid.model.TransitMode;
import java.io.Serializable;

public class OptionItem
    implements Serializable
{

    private static final long serialVersionUID = 0xec43a6353736125bL;
    private TransitBundle bundle;
    private TransitBundle currentRegion;
    private TransitMode mode;

    public OptionItem(TransitBundle transitbundle, boolean flag)
    {
        if (flag)
        {
            currentRegion = transitbundle;
            return;
        } else
        {
            bundle = transitbundle;
            return;
        }
    }

    public OptionItem(TransitMode transitmode)
    {
        mode = transitmode;
    }

    public boolean canEqual(Object obj)
    {
        return obj instanceof OptionItem;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof OptionItem))
            {
                return false;
            }
            obj = (OptionItem)obj;
            if (!((OptionItem) (obj)).canEqual(this))
            {
                return false;
            }
            Object obj1 = getMode();
            Object obj2 = ((OptionItem) (obj)).getMode();
            if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
            {
                return false;
            }
            obj1 = getBundle();
            obj2 = ((OptionItem) (obj)).getBundle();
            if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
            {
                return false;
            }
            obj1 = getCurrentRegion();
            obj = ((OptionItem) (obj)).getCurrentRegion();
            if (obj1 != null ? !obj1.equals(obj) : obj != null)
            {
                return false;
            }
        }
        return true;
    }

    public TransitBundle getBundle()
    {
        return bundle;
    }

    public TransitBundle getCurrentRegion()
    {
        return currentRegion;
    }

    public TransitMode getMode()
    {
        return mode;
    }

    public int hashCode()
    {
        int k = 0;
        Object obj = getMode();
        int i;
        int j;
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = obj.hashCode();
        }
        obj = getBundle();
        if (obj == null)
        {
            j = 0;
        } else
        {
            j = obj.hashCode();
        }
        obj = getCurrentRegion();
        if (obj != null)
        {
            k = obj.hashCode();
        }
        return ((i + 31) * 31 + j) * 31 + k;
    }

    public void setBundle(TransitBundle transitbundle)
    {
        bundle = transitbundle;
    }

    public void setCurrentRegion(TransitBundle transitbundle)
    {
        currentRegion = transitbundle;
    }

    public void setMode(TransitMode transitmode)
    {
        mode = transitmode;
    }

    public String toString()
    {
        return (new StringBuilder("OptionItem(mode=")).append(getMode()).append(", bundle=").append(getBundle()).append(", currentRegion=").append(getCurrentRegion()).append(")").toString();
    }
}
