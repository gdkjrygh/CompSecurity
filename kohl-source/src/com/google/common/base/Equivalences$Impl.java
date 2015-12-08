// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            Equivalence, Equivalences

private static abstract class <init> extends Enum
    implements Equivalence
{

    private static final IDENTITY $VALUES[];
    public static final IDENTITY EQUALS;
    public static final IDENTITY IDENTITY;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/google/common/base/Equivalences$Impl, s);
    }

    public static <init>[] values()
    {
        return (<init>[])$VALUES.clone();
    }

    static 
    {
        EQUALS = new Equivalences.Impl("EQUALS", 0) {

            public boolean equivalent(Object obj, Object obj1)
            {
                if (obj == null)
                {
                    return obj1 == null;
                } else
                {
                    return obj.equals(obj1);
                }
            }

            public int hash(Object obj)
            {
                if (obj == null)
                {
                    return 0;
                } else
                {
                    return obj.hashCode();
                }
            }

        };
        IDENTITY = new Equivalences.Impl("IDENTITY", 1) {

            public boolean equivalent(Object obj, Object obj1)
            {
                return obj == obj1;
            }

            public int hash(Object obj)
            {
                return System.identityHashCode(obj);
            }

        };
        $VALUES = (new .VALUES[] {
            EQUALS, IDENTITY
        });
    }

    private _cls2(String s, int i)
    {
        super(s, i);
    }

    _cls2(String s, int i, _cls2 _pcls2)
    {
        this(s, i);
    }
}
