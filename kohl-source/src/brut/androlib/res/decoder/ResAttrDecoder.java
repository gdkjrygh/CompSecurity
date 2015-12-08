// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package brut.androlib.res.decoder;

import brut.androlib.AndrolibException;

public class ResAttrDecoder
{

    public ResAttrDecoder()
    {
    }

    public String decode(int i, int j, String s, int k)
        throws AndrolibException
    {
        if (s != null)
        {
            return s;
        } else
        {
            return "";
        }
    }
}
