// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.dece;


// Referenced classes of package com.coremedia.iso.boxes.dece:
//            TrickPlayBox

public static class value
{

    private int value;

    public int getDependencyLevel()
    {
        return value & 0x3f;
    }

    public int getPicType()
    {
        return value >> 6 & 3;
    }

    public void setDependencyLevel(int i)
    {
        value = i & 0x3f | value;
    }

    public void setPicType(int i)
    {
        value = value & 0x1f;
        value = (i & 3) << 6 | value;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Entry");
        stringbuilder.append("{picType=").append(getPicType());
        stringbuilder.append(",dependencyLevel=").append(getDependencyLevel());
        stringbuilder.append('}');
        return stringbuilder.toString();
    }


    public ()
    {
    }

    public (int i)
    {
        value = i;
    }
}
