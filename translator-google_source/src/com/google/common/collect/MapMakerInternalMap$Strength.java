// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Equivalence;

// Referenced classes of package com.google.common.collect:
//            bv, cj, cr

abstract class <init> extends Enum
{

    public static final WEAK SOFT;
    public static final WEAK STRONG;
    public static final WEAK WEAK;
    private static final WEAK a[];

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/google/common/collect/MapMakerInternalMap$Strength, s);
    }

    public static <init>[] values()
    {
        return (<init>[])a.clone();
    }

    abstract Equivalence defaultEquivalence();

    abstract cr referenceValue(h_3B_.clone clone, cj cj, Object obj);

    static 
    {
        class _cls1 extends MapMakerInternalMap.Strength
        {

            final Equivalence defaultEquivalence()
            {
                return Equivalence.equals();
            }

            final cr referenceValue(MapMakerInternalMap.Segment segment, cj cj, Object obj)
            {
                return new cp(obj);
            }

            _cls1(String s, int i)
            {
                super(s, i, null);
            }
        }

        STRONG = new _cls1("STRONG", 0);
        class _cls2 extends MapMakerInternalMap.Strength
        {

            final Equivalence defaultEquivalence()
            {
                return Equivalence.identity();
            }

            final cr referenceValue(MapMakerInternalMap.Segment segment, cj cj, Object obj)
            {
                return new ck(segment.valueReferenceQueue, obj, cj);
            }

            _cls2(String s, int i)
            {
                super(s, i, null);
            }
        }

        SOFT = new _cls2("SOFT", 1);
        class _cls3 extends MapMakerInternalMap.Strength
        {

            final Equivalence defaultEquivalence()
            {
                return Equivalence.identity();
            }

            final cr referenceValue(MapMakerInternalMap.Segment segment, cj cj, Object obj)
            {
                return new cx(segment.valueReferenceQueue, obj, cj);
            }

            _cls3(String s, int i)
            {
                super(s, i, null);
            }
        }

        WEAK = new _cls3("WEAK", 2);
        a = (new a[] {
            STRONG, SOFT, WEAK
        });
    }

    private _cls3(String s, int i)
    {
        super(s, i);
    }

    _cls3(String s, int i, bv bv)
    {
        this(s, i);
    }
}
