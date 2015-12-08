// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.database;


public final class QueryPartOperation extends Enum
{
    public static final class QueryPartOperationRestriction extends Enum
    {

        private static final QueryPartOperationRestriction $VALUES[];
        public static final QueryPartOperationRestriction ARRAY_ONLY;
        public static final QueryPartOperationRestriction PRIMITIVE_ONLY;
        public static final QueryPartOperationRestriction RANGE_ONLY;

        public static QueryPartOperationRestriction valueOf(String s)
        {
            return (QueryPartOperationRestriction)Enum.valueOf(com/worklight/jsonstore/database/QueryPartOperation$QueryPartOperationRestriction, s);
        }

        public static QueryPartOperationRestriction[] values()
        {
            return (QueryPartOperationRestriction[])$VALUES.clone();
        }

        static 
        {
            PRIMITIVE_ONLY = new QueryPartOperationRestriction("PRIMITIVE_ONLY", 0);
            RANGE_ONLY = new QueryPartOperationRestriction("RANGE_ONLY", 1);
            ARRAY_ONLY = new QueryPartOperationRestriction("ARRAY_ONLY", 2);
            $VALUES = (new QueryPartOperationRestriction[] {
                PRIMITIVE_ONLY, RANGE_ONLY, ARRAY_ONLY
            });
        }

        private QueryPartOperationRestriction(String s, int i)
        {
            super(s, i);
        }
    }


    private static final QueryPartOperation $VALUES[];
    public static final QueryPartOperation BETWEEN;
    public static final QueryPartOperation EXACT_EQUALS;
    public static final QueryPartOperation EXACT_NOT_EQUALS;
    public static final QueryPartOperation FUZZY_EQUALS;
    public static final QueryPartOperation FUZZY_LEFT_EQUALS;
    public static final QueryPartOperation FUZZY_NOT_EQUALS;
    public static final QueryPartOperation FUZZY_NOT_LEFT_EQUALS;
    public static final QueryPartOperation FUZZY_NOT_RIGHT_EQUALS;
    public static final QueryPartOperation FUZZY_RIGHT_EQUALS;
    public static final QueryPartOperation GREATER_THAN;
    public static final QueryPartOperation GREATER_THAN_OR_EQUALS;
    public static final QueryPartOperation IN;
    public static final QueryPartOperation LESS_THAN;
    public static final QueryPartOperation LESS_THAN_OR_EQUALS;
    public static final QueryPartOperation NOT_BETWEEN;
    public static final QueryPartOperation NOT_IN;
    private String queryString;
    private QueryPartOperationRestriction restriction;

    private QueryPartOperation(String s, int i, String s1, QueryPartOperationRestriction querypartoperationrestriction)
    {
        super(s, i);
        queryString = s1;
        restriction = querypartoperationrestriction;
    }

    public static QueryPartOperation valueOf(String s)
    {
        return (QueryPartOperation)Enum.valueOf(com/worklight/jsonstore/database/QueryPartOperation, s);
    }

    public static QueryPartOperation[] values()
    {
        return (QueryPartOperation[])$VALUES.clone();
    }

    public QueryPartOperationRestriction getRestriction()
    {
        return restriction;
    }

    public boolean queryStringMatches(String s)
    {
        while (s == null || !s.equalsIgnoreCase(queryString) && !s.equalsIgnoreCase((new StringBuilder()).append("$").append(queryString).toString())) 
        {
            return false;
        }
        return true;
    }

    static 
    {
        EXACT_EQUALS = new QueryPartOperation("EXACT_EQUALS", 0, "equal", QueryPartOperationRestriction.PRIMITIVE_ONLY);
        EXACT_NOT_EQUALS = new QueryPartOperation("EXACT_NOT_EQUALS", 1, "notEqual", QueryPartOperationRestriction.PRIMITIVE_ONLY);
        FUZZY_EQUALS = new QueryPartOperation("FUZZY_EQUALS", 2, "like", QueryPartOperationRestriction.PRIMITIVE_ONLY);
        FUZZY_NOT_EQUALS = new QueryPartOperation("FUZZY_NOT_EQUALS", 3, "notLike", QueryPartOperationRestriction.PRIMITIVE_ONLY);
        FUZZY_LEFT_EQUALS = new QueryPartOperation("FUZZY_LEFT_EQUALS", 4, "leftLike", QueryPartOperationRestriction.PRIMITIVE_ONLY);
        FUZZY_NOT_LEFT_EQUALS = new QueryPartOperation("FUZZY_NOT_LEFT_EQUALS", 5, "notLeftLike", QueryPartOperationRestriction.PRIMITIVE_ONLY);
        FUZZY_RIGHT_EQUALS = new QueryPartOperation("FUZZY_RIGHT_EQUALS", 6, "rightLike", QueryPartOperationRestriction.PRIMITIVE_ONLY);
        FUZZY_NOT_RIGHT_EQUALS = new QueryPartOperation("FUZZY_NOT_RIGHT_EQUALS", 7, "notRightLike", QueryPartOperationRestriction.PRIMITIVE_ONLY);
        LESS_THAN = new QueryPartOperation("LESS_THAN", 8, "lessThan", QueryPartOperationRestriction.PRIMITIVE_ONLY);
        LESS_THAN_OR_EQUALS = new QueryPartOperation("LESS_THAN_OR_EQUALS", 9, "lessOrEqualThan", QueryPartOperationRestriction.PRIMITIVE_ONLY);
        GREATER_THAN = new QueryPartOperation("GREATER_THAN", 10, "greaterThan", QueryPartOperationRestriction.PRIMITIVE_ONLY);
        GREATER_THAN_OR_EQUALS = new QueryPartOperation("GREATER_THAN_OR_EQUALS", 11, "greaterOrEqualThan", QueryPartOperationRestriction.PRIMITIVE_ONLY);
        BETWEEN = new QueryPartOperation("BETWEEN", 12, "between", QueryPartOperationRestriction.RANGE_ONLY);
        NOT_BETWEEN = new QueryPartOperation("NOT_BETWEEN", 13, "notBetween", QueryPartOperationRestriction.RANGE_ONLY);
        IN = new QueryPartOperation("IN", 14, "inside", QueryPartOperationRestriction.ARRAY_ONLY);
        NOT_IN = new QueryPartOperation("NOT_IN", 15, "notInside", QueryPartOperationRestriction.ARRAY_ONLY);
        $VALUES = (new QueryPartOperation[] {
            EXACT_EQUALS, EXACT_NOT_EQUALS, FUZZY_EQUALS, FUZZY_NOT_EQUALS, FUZZY_LEFT_EQUALS, FUZZY_NOT_LEFT_EQUALS, FUZZY_RIGHT_EQUALS, FUZZY_NOT_RIGHT_EQUALS, LESS_THAN, LESS_THAN_OR_EQUALS, 
            GREATER_THAN, GREATER_THAN_OR_EQUALS, BETWEEN, NOT_BETWEEN, IN, NOT_IN
        });
    }
}
