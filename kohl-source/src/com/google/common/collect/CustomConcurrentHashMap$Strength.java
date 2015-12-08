// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.base.Equivalences;

// Referenced classes of package com.google.common.collect:
//            CustomConcurrentHashMap

static abstract class <init> extends Enum
{

    private static final WEAK $VALUES[];
    public static final WEAK SOFT;
    public static final WEAK STRONG;
    public static final WEAK WEAK;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/google/common/collect/CustomConcurrentHashMap$Strength, s);
    }

    public static <init>[] values()
    {
        return (<init>[])$VALUES.clone();
    }

    abstract Equivalence defaultEquivalence();

    abstract rence referenceValue(Entry entry, Object obj);

    static 
    {
        STRONG = new CustomConcurrentHashMap.Strength("STRONG", 0) {

            Equivalence defaultEquivalence()
            {
                return Equivalences.equals();
            }

            CustomConcurrentHashMap.ValueReference referenceValue(CustomConcurrentHashMap.ReferenceEntry referenceentry, Object obj)
            {
                return new CustomConcurrentHashMap.StrongValueReference(obj);
            }

        };
        SOFT = new CustomConcurrentHashMap.Strength("SOFT", 1) {

            Equivalence defaultEquivalence()
            {
                return Equivalences.identity();
            }

            CustomConcurrentHashMap.ValueReference referenceValue(CustomConcurrentHashMap.ReferenceEntry referenceentry, Object obj)
            {
                return new CustomConcurrentHashMap.SoftValueReference(obj, referenceentry);
            }

        };
        WEAK = new CustomConcurrentHashMap.Strength("WEAK", 2) {

            Equivalence defaultEquivalence()
            {
                return Equivalences.identity();
            }

            CustomConcurrentHashMap.ValueReference referenceValue(CustomConcurrentHashMap.ReferenceEntry referenceentry, Object obj)
            {
                return new CustomConcurrentHashMap.WeakValueReference(obj, referenceentry);
            }

        };
        $VALUES = (new .VALUES[] {
            STRONG, SOFT, WEAK
        });
    }

    private _cls3(String s, int i)
    {
        super(s, i);
    }

    _cls3(String s, int i, _cls3 _pcls3)
    {
        this(s, i);
    }
}
