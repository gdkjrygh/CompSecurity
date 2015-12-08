// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.collections4.comparators;

import java.io.Serializable;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class FixedOrderComparator
    implements Serializable, Comparator
{
    public static final class UnknownObjectBehavior extends Enum
    {

        private static final UnknownObjectBehavior $VALUES[];
        public static final UnknownObjectBehavior AFTER;
        public static final UnknownObjectBehavior BEFORE;
        public static final UnknownObjectBehavior EXCEPTION;

        public static UnknownObjectBehavior valueOf(String s)
        {
            return (UnknownObjectBehavior)Enum.valueOf(org/apache/commons/collections4/comparators/FixedOrderComparator$UnknownObjectBehavior, s);
        }

        public static UnknownObjectBehavior[] values()
        {
            return (UnknownObjectBehavior[])$VALUES.clone();
        }

        static 
        {
            BEFORE = new UnknownObjectBehavior("BEFORE", 0);
            AFTER = new UnknownObjectBehavior("AFTER", 1);
            EXCEPTION = new UnknownObjectBehavior("EXCEPTION", 2);
            $VALUES = (new UnknownObjectBehavior[] {
                BEFORE, AFTER, EXCEPTION
            });
        }

        private UnknownObjectBehavior(String s, int i)
        {
            super(s, i);
        }
    }


    private int counter;
    private boolean isLocked;
    private final Map map = new HashMap();
    private UnknownObjectBehavior unknownObjectBehavior;

    public FixedOrderComparator()
    {
        counter = 0;
        isLocked = false;
        unknownObjectBehavior = UnknownObjectBehavior.EXCEPTION;
    }

    public int compare(Object obj, Object obj1)
    {
        Integer integer;
        Integer integer1;
        isLocked = true;
        integer = (Integer)map.get(obj);
        integer1 = (Integer)map.get(obj1);
        if (integer != null && integer1 != null) goto _L2; else goto _L1
_L1:
        static class _cls1
        {

            static final int $SwitchMap$org$apache$commons$collections4$comparators$FixedOrderComparator$UnknownObjectBehavior[];

            static 
            {
                $SwitchMap$org$apache$commons$collections4$comparators$FixedOrderComparator$UnknownObjectBehavior = new int[UnknownObjectBehavior.values().length];
                try
                {
                    $SwitchMap$org$apache$commons$collections4$comparators$FixedOrderComparator$UnknownObjectBehavior[UnknownObjectBehavior.BEFORE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$org$apache$commons$collections4$comparators$FixedOrderComparator$UnknownObjectBehavior[UnknownObjectBehavior.AFTER.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$org$apache$commons$collections4$comparators$FixedOrderComparator$UnknownObjectBehavior[UnknownObjectBehavior.EXCEPTION.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.org.apache.commons.collections4.comparators.FixedOrderComparator.UnknownObjectBehavior[unknownObjectBehavior.ordinal()];
        JVM INSTR tableswitch 1 3: default 80
    //                   1 110
    //                   2 125
    //                   3 138;
           goto _L3 _L4 _L5 _L6
_L3:
        throw new UnsupportedOperationException((new StringBuilder()).append("Unknown unknownObjectBehavior: ").append(unknownObjectBehavior).toString());
_L4:
        if (integer != null) goto _L8; else goto _L7
_L7:
        if (integer1 != null) goto _L10; else goto _L9
_L9:
        return 0;
_L10:
        return -1;
_L8:
        return 1;
_L5:
        if (integer == null)
        {
            if (integer1 != null)
            {
                return 1;
            }
        } else
        {
            return -1;
        }
          goto _L9
_L6:
        if (integer != null)
        {
            obj = obj1;
        }
        throw new IllegalArgumentException((new StringBuilder()).append("Attempting to compare unknown object ").append(obj).toString());
_L2:
        return integer.compareTo(integer1);
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (!obj.getClass().equals(getClass()))
        {
            break MISSING_BLOCK_LABEL_126;
        }
        obj = (FixedOrderComparator)obj;
        if (map != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((FixedOrderComparator) (obj)).map != null)
        {
            return false;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!map.equals(((FixedOrderComparator) (obj)).map) || unknownObjectBehavior != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((FixedOrderComparator) (obj)).unknownObjectBehavior == null) goto _L1; else goto _L4
_L4:
        return false;
        if (unknownObjectBehavior == ((FixedOrderComparator) (obj)).unknownObjectBehavior && counter == ((FixedOrderComparator) (obj)).counter && isLocked == ((FixedOrderComparator) (obj)).isLocked && unknownObjectBehavior == ((FixedOrderComparator) (obj)).unknownObjectBehavior) goto _L1; else goto _L5
_L5:
        return false;
        return false;
    }

    public int hashCode()
    {
        int k = 0;
        int i;
        int j;
        int l;
        if (map == null)
        {
            i = 0;
        } else
        {
            i = map.hashCode();
        }
        if (unknownObjectBehavior == null)
        {
            j = 0;
        } else
        {
            j = unknownObjectBehavior.hashCode();
        }
        l = counter;
        if (!isLocked)
        {
            k = 1;
        }
        return (((i + 629) * 37 + j) * 37 + l) * 37 + k;
    }
}
