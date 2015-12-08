// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.functions;


// Referenced classes of package com.soundcloud.java.functions:
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
        return (<init>)Enum.valueOf(com/soundcloud/java/functions/Predicates$ObjectPredicate, s);
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
        class _cls1 extends Predicates.ObjectPredicate
        {

            public final boolean apply(Object obj)
            {
                return true;
            }

            public final String toString()
            {
                return "Predicates.alwaysTrue()";
            }

            _cls1(String s, int i)
            {
                super(s, i, null);
            }
        }

        ALWAYS_TRUE = new _cls1("ALWAYS_TRUE", 0);
        class _cls2 extends Predicates.ObjectPredicate
        {

            public final boolean apply(Object obj)
            {
                return false;
            }

            public final String toString()
            {
                return "Predicates.alwaysFalse()";
            }

            _cls2(String s, int i)
            {
                super(s, i, null);
            }
        }

        ALWAYS_FALSE = new _cls2("ALWAYS_FALSE", 1);
        class _cls3 extends Predicates.ObjectPredicate
        {

            public final boolean apply(Object obj)
            {
                return obj == null;
            }

            public final String toString()
            {
                return "Predicates.isNull()";
            }

            _cls3(String s, int i)
            {
                super(s, i, null);
            }
        }

        IS_NULL = new _cls3("IS_NULL", 2);
        class _cls4 extends Predicates.ObjectPredicate
        {

            public final boolean apply(Object obj)
            {
                return obj != null;
            }

            public final String toString()
            {
                return "Predicates.notNull()";
            }

            _cls4(String s, int i)
            {
                super(s, i, null);
            }
        }

        NOT_NULL = new _cls4("NOT_NULL", 3);
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
