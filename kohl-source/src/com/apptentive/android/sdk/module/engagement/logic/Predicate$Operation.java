// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.logic;


// Referenced classes of package com.apptentive.android.sdk.module.engagement.logic:
//            Predicate

public static final class  extends Enum
{

    private static final unknown $VALUES[];
    public static final unknown $and;
    public static final unknown $contains;
    public static final unknown $ends_with;
    public static final unknown $eq;
    public static final unknown $exists;
    public static final unknown $gt;
    public static final unknown $gte;
    public static final unknown $lt;
    public static final unknown $lte;
    public static final unknown $ne;
    public static final unknown $not;
    public static final unknown $or;
    public static final unknown $starts_with;
    public static final unknown unknown;

    public static  parse(String s)
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

    public static unknown valueOf(String s)
    {
        return (unknown)Enum.valueOf(com/apptentive/android/sdk/module/engagement/logic/Predicate$Operation, s);
    }

    public static unknown[] values()
    {
        return (unknown[])$VALUES.clone();
    }

    static 
    {
        $and = new <init>("$and", 0);
        $or = new <init>("$or", 1);
        $not = new <init>("$not", 2);
        $exists = new <init>("$exists", 3);
        $lt = new <init>("$lt", 4);
        $lte = new <init>("$lte", 5);
        $ne = new <init>("$ne", 6);
        $eq = new <init>("$eq", 7);
        $gte = new <init>("$gte", 8);
        $gt = new <init>("$gt", 9);
        $contains = new <init>("$contains", 10);
        $starts_with = new <init>("$starts_with", 11);
        $ends_with = new <init>("$ends_with", 12);
        unknown = new <init>("unknown", 13);
        $VALUES = (new .VALUES[] {
            $and, $or, $not, $exists, $lt, $lte, $ne, $eq, $gte, $gt, 
            $contains, $starts_with, $ends_with, unknown
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
