// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned;


// Referenced classes of package com.google.zxing.oned:
//            OneDimensionalCodeWriter, UPCEANReader

public abstract class UPCEANWriter extends OneDimensionalCodeWriter
{

    public UPCEANWriter()
    {
    }

    public int getDefaultMargin()
    {
        return UPCEANReader.START_END_PATTERN.length;
    }
}
