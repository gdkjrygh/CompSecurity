// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.collections4.functors;

import java.io.Serializable;
import java.util.Comparator;
import org.apache.commons.collections4.Predicate;

public class ComparatorPredicate
    implements Serializable, Predicate
{
    public static final class Criterion extends Enum
    {

        private static final Criterion $VALUES[];
        public static final Criterion EQUAL;
        public static final Criterion GREATER;
        public static final Criterion GREATER_OR_EQUAL;
        public static final Criterion LESS;
        public static final Criterion LESS_OR_EQUAL;

        public static Criterion valueOf(String s)
        {
            return (Criterion)Enum.valueOf(org/apache/commons/collections4/functors/ComparatorPredicate$Criterion, s);
        }

        public static Criterion[] values()
        {
            return (Criterion[])$VALUES.clone();
        }

        static 
        {
            EQUAL = new Criterion("EQUAL", 0);
            GREATER = new Criterion("GREATER", 1);
            LESS = new Criterion("LESS", 2);
            GREATER_OR_EQUAL = new Criterion("GREATER_OR_EQUAL", 3);
            LESS_OR_EQUAL = new Criterion("LESS_OR_EQUAL", 4);
            $VALUES = (new Criterion[] {
                EQUAL, GREATER, LESS, GREATER_OR_EQUAL, LESS_OR_EQUAL
            });
        }

        private Criterion(String s, int i)
        {
            super(s, i);
        }
    }


    private final Comparator comparator;
    private final Criterion criterion;
    private final Object object;

    public boolean evaluate(Object obj)
    {
        int i = comparator.compare(object, obj);
        static class _cls1
        {

            static final int $SwitchMap$org$apache$commons$collections4$functors$ComparatorPredicate$Criterion[];

            static 
            {
                $SwitchMap$org$apache$commons$collections4$functors$ComparatorPredicate$Criterion = new int[Criterion.values().length];
                try
                {
                    $SwitchMap$org$apache$commons$collections4$functors$ComparatorPredicate$Criterion[Criterion.EQUAL.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$org$apache$commons$collections4$functors$ComparatorPredicate$Criterion[Criterion.GREATER.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$org$apache$commons$collections4$functors$ComparatorPredicate$Criterion[Criterion.LESS.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$org$apache$commons$collections4$functors$ComparatorPredicate$Criterion[Criterion.GREATER_OR_EQUAL.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$org$apache$commons$collections4$functors$ComparatorPredicate$Criterion[Criterion.LESS_OR_EQUAL.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.org.apache.commons.collections4.functors.ComparatorPredicate.Criterion[criterion.ordinal()])
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("The current criterion '").append(criterion).append("' is invalid.").toString());

        case 1: // '\001'
            return i == 0;

        case 2: // '\002'
            return i > 0;

        case 3: // '\003'
            return i < 0;

        case 4: // '\004'
            return i >= 0;

        case 5: // '\005'
            break;
        }
        return i <= 0;
    }
}
