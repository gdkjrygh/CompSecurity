// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.driver;

import java.util.Collections;

// Referenced classes of package me.lyft.android.domain.driver:
//            Card

class HT extends Card
{

    private static final Card INSTANCE = new <init>();

    static Card getInstance()
    {
        return INSTANCE;
    }

    public boolean isNull()
    {
        return true;
    }


    private ()
    {
        super(HT, "", "", "", Collections.emptyList(), "");
    }
}
