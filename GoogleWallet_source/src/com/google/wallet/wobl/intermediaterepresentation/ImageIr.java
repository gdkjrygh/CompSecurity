// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.intermediaterepresentation;

import com.google.common.base.Optional;

// Referenced classes of package com.google.wallet.wobl.intermediaterepresentation:
//            IntermediateRepresentation

public class ImageIr extends IntermediateRepresentation
{

    private Optional altText;
    private double aspect;
    private String source;

    public ImageIr()
    {
        altText = Optional.absent();
    }

    public Optional getAltText()
    {
        return altText;
    }

    public double getAspect()
    {
        return aspect;
    }

    public String getSource()
    {
        return source;
    }

    public void setAltText(Optional optional)
    {
        altText = optional;
    }

    public void setAspect(double d)
    {
        aspect = d;
    }

    public void setSource(String s)
    {
        source = s;
    }
}
