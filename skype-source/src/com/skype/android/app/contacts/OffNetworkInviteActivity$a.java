// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import java.util.Comparator;

// Referenced classes of package com.skype.android.app.contacts:
//            OffNetworkInviteActivity

private static final class <init>
    implements Comparator
{

    private static final int MOBILE_VALUE = -1;

    private int shiftLabelId(<init> <init>1)
    {
        .SwitchMap.com.skype.android.app.contacts.ContactItem.ContactableType[<init>1.e.ordinal()];
        JVM INSTR tableswitch 1 2: default 32
    //                   1 36
    //                   2 44;
           goto _L1 _L2 _L3
_L1:
        int i = 0;
_L5:
        return i;
_L2:
        return <init>1.elId >> 8;
_L3:
        int j = <init>1.elId;
        i = j;
        if (j == 2)
        {
            return -1;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final int compare(elId elid, elId elid1)
    {
        return shiftLabelId(elid) - shiftLabelId(elid1);
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        return compare((compare)obj, (compare)obj1);
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
