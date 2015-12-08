// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mp4parser.iso14496.part15;

import com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry;
import java.nio.ByteBuffer;

public class StepwiseTemporalLayerEntry extends GroupEntry
{

    public static final String TYPE = "stsa";

    public StepwiseTemporalLayerEntry()
    {
    }

    public boolean equals(Object obj)
    {
        while (this == obj || obj != null && getClass() == obj.getClass()) 
        {
            return true;
        }
        return false;
    }

    public ByteBuffer get()
    {
        return ByteBuffer.allocate(0);
    }

    public String getType()
    {
        return "stsa";
    }

    public int hashCode()
    {
        return 37;
    }

    public void parse(ByteBuffer bytebuffer)
    {
    }
}
