// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.definitions;


// Referenced classes of package me.lyft.android.analytics.definitions:
//            Event2, Parameter, MapParameterStore

public abstract class SpanningEvent extends Event2
{

    protected SpanningEvent(Type type)
    {
        parameterStore.put(Parameter.TYPE, type.toString());
    }

    public void setDurationMs(int i)
    {
        parameterStore.put(Parameter.DURATION_MS, Integer.valueOf(i));
    }

    public void setResult(Result result)
    {
        parameterStore.put(Parameter.RESULT, result.toString());
    }

    private class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type INITIATION;
        public static final Type RESULT;

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(me/lyft/android/analytics/definitions/SpanningEvent$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        public String toString()
        {
            return name().toLowerCase();
        }

        static 
        {
            INITIATION = new Type("INITIATION", 0);
            RESULT = new Type("RESULT", 1);
            $VALUES = (new Type[] {
                INITIATION, RESULT
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }


    private class Result extends Enum
    {

        private static final Result $VALUES[];
        public static final Result CANCELED;
        public static final Result FAILURE;
        public static final Result PROHIBITED;
        public static final Result SUCCESS;

        public static Result valueOf(String s)
        {
            return (Result)Enum.valueOf(me/lyft/android/analytics/definitions/SpanningEvent$Result, s);
        }

        public static Result[] values()
        {
            return (Result[])$VALUES.clone();
        }

        public String toString()
        {
            return name().toLowerCase();
        }

        static 
        {
            SUCCESS = new Result("SUCCESS", 0);
            FAILURE = new Result("FAILURE", 1);
            CANCELED = new Result("CANCELED", 2);
            PROHIBITED = new Result("PROHIBITED", 3);
            $VALUES = (new Result[] {
                SUCCESS, FAILURE, CANCELED, PROHIBITED
            });
        }

        private Result(String s, int i)
        {
            super(s, i);
        }
    }

}
