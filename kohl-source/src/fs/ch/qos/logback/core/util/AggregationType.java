// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.util;


public final class AggregationType extends Enum
{

    private static final AggregationType $VALUES[];
    public static final AggregationType AS_BASIC_PROPERTY;
    public static final AggregationType AS_BASIC_PROPERTY_COLLECTION;
    public static final AggregationType AS_COMPLEX_PROPERTY;
    public static final AggregationType AS_COMPLEX_PROPERTY_COLLECTION;
    public static final AggregationType NOT_FOUND;

    private AggregationType(String s, int i)
    {
        super(s, i);
    }

    public static AggregationType valueOf(String s)
    {
        return (AggregationType)Enum.valueOf(fs/ch/qos/logback/core/util/AggregationType, s);
    }

    public static AggregationType[] values()
    {
        return (AggregationType[])$VALUES.clone();
    }

    static 
    {
        NOT_FOUND = new AggregationType("NOT_FOUND", 0);
        AS_BASIC_PROPERTY = new AggregationType("AS_BASIC_PROPERTY", 1);
        AS_COMPLEX_PROPERTY = new AggregationType("AS_COMPLEX_PROPERTY", 2);
        AS_BASIC_PROPERTY_COLLECTION = new AggregationType("AS_BASIC_PROPERTY_COLLECTION", 3);
        AS_COMPLEX_PROPERTY_COLLECTION = new AggregationType("AS_COMPLEX_PROPERTY_COLLECTION", 4);
        $VALUES = (new AggregationType[] {
            NOT_FOUND, AS_BASIC_PROPERTY, AS_COMPLEX_PROPERTY, AS_BASIC_PROPERTY_COLLECTION, AS_COMPLEX_PROPERTY_COLLECTION
        });
    }
}
