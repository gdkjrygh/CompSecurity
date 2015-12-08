// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.constants;


// Referenced classes of package me.lyft.android.infrastructure.lyft.constants:
//            Selector

class I extends Selector
{

    private static final Selector INSTANCE = new <init>();

    public static Selector getInstance()
    {
        return INSTANCE;
    }

    public String getActiveColor()
    {
        return "";
    }

    public String getIconFile()
    {
        return "";
    }

    public String getLabel()
    {
        return "";
    }

    public boolean isNull()
    {
        return true;
    }


    I()
    {
    }
}
