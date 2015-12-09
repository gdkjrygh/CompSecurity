// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.extension.nina;

import com.dominos.android.sdk.extension.nina.model.NinaPartialProduct;

public class nextPrompt
{

    private y granularity;
    private y nextPrompt;
    private NinaPartialProduct ninaPartialProduct;
    private Object result;

    public y getGranularity()
    {
        return granularity;
    }

    public y getNextPrompt()
    {
        return nextPrompt;
    }

    public NinaPartialProduct getNinaPartialProduct()
    {
        return ninaPartialProduct;
    }

    public Object getResult()
    {
        return result;
    }

    public void setNextPrompt(y y)
    {
        nextPrompt = y;
    }

    public void setResult(Object obj)
    {
        result = obj;
    }

    public y(NinaPartialProduct ninapartialproduct, y y, Object obj, y y1)
    {
        ninaPartialProduct = ninapartialproduct;
        granularity = y;
        result = obj;
        nextPrompt = y1;
    }
}
