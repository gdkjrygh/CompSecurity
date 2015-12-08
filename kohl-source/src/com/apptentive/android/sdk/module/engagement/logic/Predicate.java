// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.logic;

import android.content.Context;
import org.json.JSONException;

// Referenced classes of package com.apptentive.android.sdk.module.engagement.logic:
//            ComparisonPredicate, CombinationPredicate

public abstract class Predicate
{
    public static final class Operation extends Enum
    {

        private static final Operation $VALUES[];
        public static final Operation $and;
        public static final Operation $contains;
        public static final Operation $ends_with;
        public static final Operation $eq;
        public static final Operation $exists;
        public static final Operation $gt;
        public static final Operation $gte;
        public static final Operation $lt;
        public static final Operation $lte;
        public static final Operation $ne;
        public static final Operation $not;
        public static final Operation $or;
        public static final Operation $starts_with;
        public static final Operation unknown;

        public static Operation parse(String s)
        {
            try
            {
                s = valueOf(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return unknown;
            }
            return s;
        }

        public static Operation valueOf(String s)
        {
            return (Operation)Enum.valueOf(com/apptentive/android/sdk/module/engagement/logic/Predicate$Operation, s);
        }

        public static Operation[] values()
        {
            return (Operation[])$VALUES.clone();
        }

        static 
        {
            $and = new Operation("$and", 0);
            $or = new Operation("$or", 1);
            $not = new Operation("$not", 2);
            $exists = new Operation("$exists", 3);
            $lt = new Operation("$lt", 4);
            $lte = new Operation("$lte", 5);
            $ne = new Operation("$ne", 6);
            $eq = new Operation("$eq", 7);
            $gte = new Operation("$gte", 8);
            $gt = new Operation("$gt", 9);
            $contains = new Operation("$contains", 10);
            $starts_with = new Operation("$starts_with", 11);
            $ends_with = new Operation("$ends_with", 12);
            unknown = new Operation("unknown", 13);
            $VALUES = (new Operation[] {
                $and, $or, $not, $exists, $lt, $lte, $ne, $eq, $gte, $gt, 
                $contains, $starts_with, $ends_with, unknown
            });
        }

        private Operation(String s, int i)
        {
            super(s, i);
        }
    }


    public Predicate()
    {
    }

    public static Predicate parse(String s, Object obj)
        throws JSONException
    {
        String s1 = s;
        if (s == null)
        {
            s1 = Operation..and.name();
        }
        s = Operation.parse(s1);
        static class _cls1
        {

            static final int $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$Predicate$Operation[];

            static 
            {
                $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$Predicate$Operation = new int[Operation.values().length];
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$Predicate$Operation[Operation..or.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$Predicate$Operation[Operation..and.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$Predicate$Operation[Operation..not.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.apptentive.android.sdk.module.engagement.logic.Predicate.Operation[s.ordinal()])
        {
        default:
            return new ComparisonPredicate(s1, obj);

        case 1: // '\001'
            return new CombinationPredicate(s1, obj);

        case 2: // '\002'
            return new CombinationPredicate(s1, obj);

        case 3: // '\003'
            return new CombinationPredicate(s1, obj);
        }
    }

    public abstract boolean apply(Context context);
}
