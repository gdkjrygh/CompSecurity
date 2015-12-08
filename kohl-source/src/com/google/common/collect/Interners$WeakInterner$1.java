// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            Interners

class val.sample
{

    final val.hashCode this$0;
    final int val$hashCode;
    final Object val$sample;

    public boolean equals(Object obj)
    {
        if (obj.hashCode() != val$hashCode)
        {
            return false;
        } else
        {
            obj = (ternReference)obj;
            return val$sample.equals(((ternReference) (obj)).get());
        }
    }

    public int hashCode()
    {
        return val$hashCode;
    }

    ternReference()
    {
        this$0 = final_ternreference;
        val$hashCode = i;
        val$sample = Object.this;
        super();
    }
}
