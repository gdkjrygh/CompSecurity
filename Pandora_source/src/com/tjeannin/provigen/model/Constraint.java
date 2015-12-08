// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tjeannin.provigen.model;


public class Constraint
{
    public class OnConflict
    {

        public static final String ABORT = "ABORT";
        public static final String FAIL = "FAIL";
        public static final String IGNORE = "IGNORE";
        public static final String REPLACE = "REPLACE";
        public static final String ROLLBACK = "ROLLBACK";
        final Constraint this$0;

        public OnConflict()
        {
            this$0 = Constraint.this;
            super();
        }
    }


    public static final String NOT_NULL = "NOT NULL";
    public static final String UNIQUE = "UNIQUE";
    public String conflictClause;
    public String targetColumn;
    public String type;

    public Constraint(String s, String s1, String s2)
    {
        type = s1;
        targetColumn = s;
        conflictClause = s2;
    }
}
