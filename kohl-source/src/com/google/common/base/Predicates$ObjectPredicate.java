// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            Predicate, Predicates

static abstract class <init> extends Enum
    implements Predicate
{

    private static final NOT_NULL $VALUES[];
    public static final NOT_NULL ALWAYS_FALSE;
    public static final NOT_NULL ALWAYS_TRUE;
    public static final NOT_NULL IS_NULL;
    public static final NOT_NULL NOT_NULL;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/google/common/base/Predicates$ObjectPredicate, s);
    }

    public static <init>[] values()
    {
        return (<init>[])$VALUES.clone();
    }

    Predicate withNarrowedType()
    {
        return this;
    }

    static 
    {
        ALWAYS_TRUE = new Predicates.ObjectPredicate("ALWAYS_TRUE", 0) {

            public boolean apply(Object obj)
            {
                return true;
            }

        };
        ALWAYS_FALSE = new Predicates.ObjectPredicate("ALWAYS_FALSE", 1) {

            public boolean apply(Object obj)
            {
                return false;
            }

        };
        IS_NULL = new Predicates.ObjectPredicate("IS_NULL", 2) {

            public boolean apply(Object obj)
            {
                return obj == null;
            }

        };
        NOT_NULL = new Predicates.ObjectPredicate("NOT_NULL", 3) {

            public boolean apply(Object obj)
            {
                return obj != null;
            }

        };
        $VALUES = (new .VALUES[] {
            ALWAYS_TRUE, ALWAYS_FALSE, IS_NULL, NOT_NULL
        });
    }

    private _cls4(String s, int i)
    {
        super(s, i);
    }

    _cls4(String s, int i, _cls4 _pcls4)
    {
        this(s, i);
    }
}
