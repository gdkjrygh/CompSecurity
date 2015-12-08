// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.impl.ordering;

import com.digby.localpoint.sdk.core.ILPMessage;
import com.digby.localpoint.sdk.core.ILPOrdering;
import com.digby.localpoint.sdk.core.impl.LPMessage;
import com.digby.mm.android.library.exception.LPArgumentException;
import java.util.Date;

public class LPMessageExpirationOrdering
    implements ILPOrdering
{
    public static final class SortDirection extends Enum
    {

        private static final SortDirection $VALUES[];
        public static final SortDirection ASCENDING;
        public static final SortDirection DESCENDING;

        public static SortDirection valueOf(String s)
        {
            return (SortDirection)Enum.valueOf(com/digby/localpoint/sdk/core/impl/ordering/LPMessageExpirationOrdering$SortDirection, s);
        }

        public static SortDirection[] values()
        {
            return (SortDirection[])$VALUES.clone();
        }

        static 
        {
            ASCENDING = new SortDirection("ASCENDING", 0);
            DESCENDING = new SortDirection("DESCENDING", 1);
            $VALUES = (new SortDirection[] {
                ASCENDING, DESCENDING
            });
        }

        private SortDirection(String s, int i)
        {
            super(s, i);
        }
    }


    private final SortDirection sortDirection;

    public LPMessageExpirationOrdering()
    {
        this(SortDirection.ASCENDING);
    }

    public LPMessageExpirationOrdering(SortDirection sortdirection)
    {
        sortDirection = sortdirection;
    }

    public int compare(Object obj, Object obj1)
    {
        if (!(obj instanceof ILPMessage) || !(obj1 instanceof ILPMessage))
        {
            throw new LPArgumentException("Ordering can only apply to objects of type ILPMessage");
        }
        obj = (ILPMessage)obj;
        obj1 = (ILPMessage)obj1;
        obj = ((LPMessage)obj).getExpirationDate();
        obj1 = ((LPMessage)obj1).getExpirationDate();
        static class _cls1
        {

            static final int $SwitchMap$com$digby$localpoint$sdk$core$impl$ordering$LPMessageExpirationOrdering$SortDirection[];

            static 
            {
                $SwitchMap$com$digby$localpoint$sdk$core$impl$ordering$LPMessageExpirationOrdering$SortDirection = new int[SortDirection.values().length];
                try
                {
                    $SwitchMap$com$digby$localpoint$sdk$core$impl$ordering$LPMessageExpirationOrdering$SortDirection[SortDirection.DESCENDING.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        _cls1..SwitchMap.com.digby.localpoint.sdk.core.impl.ordering.LPMessageExpirationOrdering.SortDirection[sortDirection.ordinal()];
        JVM INSTR tableswitch 1 1: default 80
    //                   1 92;
           goto _L1 _L2
_L1:
        int i = ((Date) (obj)).compareTo(((Date) (obj1)));
        if (i <= 0) goto _L4; else goto _L3
_L3:
        return 1;
_L2:
        i = ((Date) (obj1)).compareTo(((Date) (obj)));
        if (i <= 0)
        {
            return i >= 0 ? 0 : -1;
        }
        if (true) goto _L3; else goto _L4
_L4:
        return i >= 0 ? 0 : -1;
    }
}
