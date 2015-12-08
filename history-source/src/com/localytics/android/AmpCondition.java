// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.util.Log;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

// Referenced classes of package com.localytics.android:
//            Constants

final class AmpCondition
{
    public static final class Opt extends Enum
    {

        private static final Opt $VALUES[];
        public static final Opt BETWEEN;
        public static final Opt EQUAL;
        public static final Opt GREATER_THAN;
        public static final Opt GREATER_THEN_OR_EQUAL;
        public static final Opt INVALID;
        public static final Opt IN_LIST;
        public static final Opt LESS_THAN;
        public static final Opt LESS_THAN_OR_EQUAL;
        public static final Opt NOT_EQUAL;

        public static Opt valueOf(String s)
        {
            return (Opt)Enum.valueOf(com/localytics/android/AmpCondition$Opt, s);
        }

        public static Opt[] values()
        {
            return (Opt[])$VALUES.clone();
        }

        static 
        {
            INVALID = new Opt("INVALID", 0);
            EQUAL = new Opt("EQUAL", 1);
            NOT_EQUAL = new Opt("NOT_EQUAL", 2);
            GREATER_THAN = new Opt("GREATER_THAN", 3);
            GREATER_THEN_OR_EQUAL = new Opt("GREATER_THEN_OR_EQUAL", 4);
            LESS_THAN = new Opt("LESS_THAN", 5);
            LESS_THAN_OR_EQUAL = new Opt("LESS_THAN_OR_EQUAL", 6);
            BETWEEN = new Opt("BETWEEN", 7);
            IN_LIST = new Opt("IN_LIST", 8);
            $VALUES = (new Opt[] {
                INVALID, EQUAL, NOT_EQUAL, GREATER_THAN, GREATER_THEN_OR_EQUAL, LESS_THAN, LESS_THAN_OR_EQUAL, BETWEEN, IN_LIST
            });
        }

        private Opt(String s, int i)
        {
            super(s, i);
        }
    }


    private String mName;
    private Opt mOpt;
    private String mPkgName;
    private Vector mValues;

    public AmpCondition(String s, String s1, Vector vector)
    {
        mName = s;
        mOpt = stringToOperator(s1);
        mValues = vector;
    }

    private boolean isSatisfiedByNumber(String s)
    {
        int i;
        int j;
        s = new BigDecimal(s);
        j = s.compareTo(new BigDecimal((String)mValues.get(0)));
        static class _cls1
        {

            static final int $SwitchMap$com$localytics$android$AmpCondition$Opt[];

            static 
            {
                $SwitchMap$com$localytics$android$AmpCondition$Opt = new int[Opt.values().length];
                try
                {
                    $SwitchMap$com$localytics$android$AmpCondition$Opt[Opt.EQUAL.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$localytics$android$AmpCondition$Opt[Opt.NOT_EQUAL.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$localytics$android$AmpCondition$Opt[Opt.IN_LIST.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$localytics$android$AmpCondition$Opt[Opt.GREATER_THAN.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$localytics$android$AmpCondition$Opt[Opt.GREATER_THEN_OR_EQUAL.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$localytics$android$AmpCondition$Opt[Opt.LESS_THAN.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$localytics$android$AmpCondition$Opt[Opt.LESS_THAN_OR_EQUAL.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$localytics$android$AmpCondition$Opt[Opt.BETWEEN.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$localytics$android$AmpCondition$Opt[Opt.INVALID.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        if (mValues.size() > 1)
        {
            i = s.compareTo(new BigDecimal((String)mValues.get(1)));
        } else
        {
            i = 0;
        }
        _cls1..SwitchMap.com.localytics.android.AmpCondition.Opt[mOpt.ordinal()];
        JVM INSTR tableswitch 1 8: default 124
    //                   1 131
    //                   2 140
    //                   3 198
    //                   4 149
    //                   5 158
    //                   6 167
    //                   7 176
    //                   8 185;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        return false;
_L2:
        return j == 0;
_L3:
        return j != 0;
_L5:
        return j > 0;
_L6:
        return j >= 0;
_L7:
        return j < 0;
_L8:
        return j <= 0;
_L9:
        return j >= 0 && i <= 0;
_L4:
        Iterator iterator = mValues.iterator();
        while (iterator.hasNext()) 
        {
            if (s.compareTo(new BigDecimal((String)iterator.next())) == 0)
            {
                return true;
            }
        }
        if (true) goto _L1; else goto _L10
_L10:
    }

    private boolean isSatisfiedByString(String s)
    {
        boolean flag1 = false;
        _cls1..SwitchMap.com.localytics.android.AmpCondition.Opt[mOpt.ordinal()];
        JVM INSTR tableswitch 1 3: default 40
    //                   1 48
    //                   2 61
    //                   3 80;
           goto _L1 _L2 _L3 _L4
_L1:
        boolean flag = isSatisfiedByNumber(s);
_L6:
        return flag;
_L2:
        return s.equals(mValues.get(0));
_L3:
        return !s.equals(mValues.get(0));
_L4:
        Iterator iterator = mValues.iterator();
        do
        {
            flag = flag1;
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            if (s.equals((String)iterator.next()))
            {
                return true;
            }
        } while (true);
        if (true) goto _L6; else goto _L5
_L5:
    }

    private String operatorToString(Opt opt)
    {
        switch (_cls1..SwitchMap.com.localytics.android.AmpCondition.Opt[opt.ordinal()])
        {
        default:
            return "INVALID OPERATOR";

        case 1: // '\001'
            return "is equal to";

        case 2: // '\002'
            return "not equal to";

        case 4: // '\004'
            return "is greater than";

        case 5: // '\005'
            return "is greater than or equal to";

        case 6: // '\006'
            return "is less than";

        case 7: // '\007'
            return "is less than or equal to";

        case 8: // '\b'
            return "is in between values";

        case 3: // '\003'
            return "is a member of the list";
        }
    }

    private Opt stringToOperator(String s)
    {
        if (s.equals("eq"))
        {
            return Opt.EQUAL;
        }
        if (s.equals("neq"))
        {
            return Opt.NOT_EQUAL;
        }
        if (s.equals("gt"))
        {
            return Opt.GREATER_THAN;
        }
        if (s.equals("gte"))
        {
            return Opt.GREATER_THEN_OR_EQUAL;
        }
        if (s.equals("lt"))
        {
            return Opt.LESS_THAN;
        }
        if (s.equals("lte"))
        {
            return Opt.LESS_THAN_OR_EQUAL;
        }
        if (s.equals("btw"))
        {
            return Opt.BETWEEN;
        }
        if (s.equals("in"))
        {
            return Opt.IN_LIST;
        } else
        {
            return Opt.INVALID;
        }
    }

    public boolean isSatisfiedByAttributes(Map map)
    {
        if (map != null)
        {
            Object obj1 = map.get(mName);
            Object obj = obj1;
            if (obj1 == null)
            {
                obj = map.get((new StringBuilder()).append(mPkgName).append(":").append(mName).toString());
            }
            if (obj == null)
            {
                if (Constants.IS_LOGGABLE)
                {
                    Log.w("Localytics", String.format("Could not find the AMP condition %s in the attributes dictionary.", new Object[] {
                        mName
                    }));
                }
                return false;
            }
            if (obj instanceof String)
            {
                return isSatisfiedByString((String)obj);
            }
            if (obj instanceof Number)
            {
                return isSatisfiedByNumber((String)obj);
            }
            if (Constants.IS_LOGGABLE)
            {
                Log.w("Localytics", String.format("Invalid value type %s in the attributes dictionary.", new Object[] {
                    obj.getClass().getCanonicalName()
                }));
                return false;
            }
        }
        return false;
    }

    public void setPackageName(String s)
    {
        mPkgName = s;
    }
}
