// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            cj, MapMakerInternalMap, bv

abstract class <init> extends Enum
{

    static final int EVICTABLE_MASK = 2;
    static final int EXPIRABLE_MASK = 1;
    public static final WEAK_EXPIRABLE_EVICTABLE STRONG;
    public static final WEAK_EXPIRABLE_EVICTABLE STRONG_EVICTABLE;
    public static final WEAK_EXPIRABLE_EVICTABLE STRONG_EXPIRABLE;
    public static final WEAK_EXPIRABLE_EVICTABLE STRONG_EXPIRABLE_EVICTABLE;
    public static final WEAK_EXPIRABLE_EVICTABLE WEAK;
    public static final WEAK_EXPIRABLE_EVICTABLE WEAK_EVICTABLE;
    public static final WEAK_EXPIRABLE_EVICTABLE WEAK_EXPIRABLE;
    public static final WEAK_EXPIRABLE_EVICTABLE WEAK_EXPIRABLE_EVICTABLE;
    private static final WEAK_EXPIRABLE_EVICTABLE a[];
    static final WEAK_EXPIRABLE_EVICTABLE factories[][];

    static <init> getFactory(<init> <init>1, boolean flag, boolean flag1)
    {
        byte byte0 = 0;
        boolean flag2;
        if (flag)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag1)
        {
            byte0 = 2;
        }
        return factories[<init>1.nal()][byte0 | flag2];
    }

    public static nal valueOf(String s)
    {
        return (nal)Enum.valueOf(com/google/common/collect/MapMakerInternalMap$EntryFactory, s);
    }

    public static nal[] values()
    {
        return (nal[])a.clone();
    }

    cj copyEntry(y_3B_.clone clone, cj cj1, cj cj2)
    {
        return newEntry(clone, cj1.getKey(), cj1.getHash(), cj2);
    }

    void copyEvictableEntry(cj cj1, cj cj2)
    {
        MapMakerInternalMap.connectEvictables(cj1.getPreviousEvictable(), cj2);
        MapMakerInternalMap.connectEvictables(cj2, cj1.getNextEvictable());
        MapMakerInternalMap.nullifyEvictable(cj1);
    }

    void copyExpirableEntry(cj cj1, cj cj2)
    {
        cj2.setExpirationTime(cj1.getExpirationTime());
        MapMakerInternalMap.connectExpirables(cj1.getPreviousExpirable(), cj2);
        MapMakerInternalMap.connectExpirables(cj2, cj1.getNextExpirable());
        MapMakerInternalMap.nullifyExpirable(cj1);
    }

    abstract cj newEntry(ble ble, Object obj, int i, cj cj1);

    static 
    {
        class _cls1 extends MapMakerInternalMap.EntryFactory
        {

            final cj newEntry(MapMakerInternalMap.Segment segment, Object obj, int i, cj cj1)
            {
                return new cl(obj, i, cj1);
            }

            _cls1(String s, int i)
            {
                super(s, i, null);
            }
        }

        STRONG = new _cls1("STRONG", 0);
        class _cls2 extends MapMakerInternalMap.EntryFactory
        {

            final cj copyEntry(MapMakerInternalMap.Segment segment, cj cj1, cj cj2)
            {
                segment = copyEntry(segment, cj1, cj2);
                copyExpirableEntry(cj1, segment);
                return segment;
            }

            final cj newEntry(MapMakerInternalMap.Segment segment, Object obj, int i, cj cj1)
            {
                return new cn(obj, i, cj1);
            }

            _cls2(String s, int i)
            {
                super(s, i, null);
            }
        }

        STRONG_EXPIRABLE = new _cls2("STRONG_EXPIRABLE", 1);
        class _cls3 extends MapMakerInternalMap.EntryFactory
        {

            final cj copyEntry(MapMakerInternalMap.Segment segment, cj cj1, cj cj2)
            {
                segment = copyEntry(segment, cj1, cj2);
                copyEvictableEntry(cj1, segment);
                return segment;
            }

            final cj newEntry(MapMakerInternalMap.Segment segment, Object obj, int i, cj cj1)
            {
                return new cm(obj, i, cj1);
            }

            _cls3(String s, int i)
            {
                super(s, i, null);
            }
        }

        STRONG_EVICTABLE = new _cls3("STRONG_EVICTABLE", 2);
        class _cls4 extends MapMakerInternalMap.EntryFactory
        {

            final cj copyEntry(MapMakerInternalMap.Segment segment, cj cj1, cj cj2)
            {
                segment = copyEntry(segment, cj1, cj2);
                copyExpirableEntry(cj1, segment);
                copyEvictableEntry(cj1, segment);
                return segment;
            }

            final cj newEntry(MapMakerInternalMap.Segment segment, Object obj, int i, cj cj1)
            {
                return new co(obj, i, cj1);
            }

            _cls4(String s, int i)
            {
                super(s, i, null);
            }
        }

        STRONG_EXPIRABLE_EVICTABLE = new _cls4("STRONG_EXPIRABLE_EVICTABLE", 3);
        class _cls5 extends MapMakerInternalMap.EntryFactory
        {

            final cj newEntry(MapMakerInternalMap.Segment segment, Object obj, int i, cj cj1)
            {
                return new ct(segment.keyReferenceQueue, obj, i, cj1);
            }

            _cls5(String s, int i)
            {
                super(s, i, null);
            }
        }

        WEAK = new _cls5("WEAK", 4);
        class _cls6 extends MapMakerInternalMap.EntryFactory
        {

            final cj copyEntry(MapMakerInternalMap.Segment segment, cj cj1, cj cj2)
            {
                segment = copyEntry(segment, cj1, cj2);
                copyExpirableEntry(cj1, segment);
                return segment;
            }

            final cj newEntry(MapMakerInternalMap.Segment segment, Object obj, int i, cj cj1)
            {
                return new cv(segment.keyReferenceQueue, obj, i, cj1);
            }

            _cls6(String s, int i)
            {
                super(s, i, null);
            }
        }

        WEAK_EXPIRABLE = new _cls6("WEAK_EXPIRABLE", 5);
        class _cls7 extends MapMakerInternalMap.EntryFactory
        {

            final cj copyEntry(MapMakerInternalMap.Segment segment, cj cj1, cj cj2)
            {
                segment = copyEntry(segment, cj1, cj2);
                copyEvictableEntry(cj1, segment);
                return segment;
            }

            final cj newEntry(MapMakerInternalMap.Segment segment, Object obj, int i, cj cj1)
            {
                return new cu(segment.keyReferenceQueue, obj, i, cj1);
            }

            _cls7(String s, int i)
            {
                super(s, i, null);
            }
        }

        WEAK_EVICTABLE = new _cls7("WEAK_EVICTABLE", 6);
        class _cls8 extends MapMakerInternalMap.EntryFactory
        {

            final cj copyEntry(MapMakerInternalMap.Segment segment, cj cj1, cj cj2)
            {
                segment = copyEntry(segment, cj1, cj2);
                copyExpirableEntry(cj1, segment);
                copyEvictableEntry(cj1, segment);
                return segment;
            }

            final cj newEntry(MapMakerInternalMap.Segment segment, Object obj, int i, cj cj1)
            {
                return new cw(segment.keyReferenceQueue, obj, i, cj1);
            }

            _cls8(String s, int i)
            {
                super(s, i, null);
            }
        }

        WEAK_EXPIRABLE_EVICTABLE = new _cls8("WEAK_EXPIRABLE_EVICTABLE", 7);
        a = (new a[] {
            STRONG, STRONG_EXPIRABLE, STRONG_EVICTABLE, STRONG_EXPIRABLE_EVICTABLE, WEAK, WEAK_EXPIRABLE, WEAK_EVICTABLE, WEAK_EXPIRABLE_EVICTABLE
        });
        factories = (new factories[][] {
            new factories[] {
                STRONG, STRONG_EXPIRABLE, STRONG_EVICTABLE, STRONG_EXPIRABLE_EVICTABLE
            }, new STRONG_EXPIRABLE_EVICTABLE[0], new STRONG_EXPIRABLE_EVICTABLE[] {
                WEAK, WEAK_EXPIRABLE, WEAK_EVICTABLE, WEAK_EXPIRABLE_EVICTABLE
            }
        });
    }

    private _cls8(String s, int i)
    {
        super(s, i);
    }

    _cls8(String s, int i, bv bv)
    {
        this(s, i);
    }
}
