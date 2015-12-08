// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models;

import java.util.ArrayList;
import java.util.List;
import org.a.a.a.a.f;
import org.a.a.a.a.g;

public class LabsPromotion
{

    private List redeemable;
    private List valid;

    public LabsPromotion()
    {
        redeemable = new ArrayList();
        valid = new ArrayList();
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (LabsPromotion)obj;
            if (redeemable == null ? ((LabsPromotion) (obj)).redeemable != null : !redeemable.equals(((LabsPromotion) (obj)).redeemable))
            {
                return false;
            }
            if (valid == null ? ((LabsPromotion) (obj)).valid != null : !valid.equals(((LabsPromotion) (obj)).valid))
            {
                return false;
            }
        }
        return true;
    }

    public List getRedeemable()
    {
        return redeemable;
    }

    public List getValid()
    {
        return valid;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (redeemable != null)
        {
            i = redeemable.hashCode();
        } else
        {
            i = 0;
        }
        if (valid != null)
        {
            j = valid.hashCode();
        }
        return i * 31 + j;
    }

    public void setRedeemable(List list)
    {
        redeemable = list;
    }

    public void setValid(List list)
    {
        valid = list;
    }

    public String toString()
    {
        return f.b(this, g.d);
    }
}
