// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            CustomConcurrentHashMap

static abstract class <init> extends Enum
{

    private static final factories $VALUES[];
    static final int EVICTABLE_MASK = 2;
    static final int EXPIRABLE_MASK = 1;
    public static final factories SOFT;
    public static final factories SOFT_EVICTABLE;
    public static final factories SOFT_EXPIRABLE;
    public static final factories SOFT_EXPIRABLE_EVICTABLE;
    public static final factories STRONG;
    public static final factories STRONG_EVICTABLE;
    public static final factories STRONG_EXPIRABLE;
    public static final factories STRONG_EXPIRABLE_EVICTABLE;
    public static final factories WEAK;
    public static final factories WEAK_EVICTABLE;
    public static final factories WEAK_EXPIRABLE;
    public static final factories WEAK_EXPIRABLE_EVICTABLE;
    static final factories factories[][];

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
        return factories[<init>1.nal()][flag2 | byte0];
    }

    public static nal valueOf(String s)
    {
        return (nal)Enum.valueOf(com/google/common/collect/CustomConcurrentHashMap$EntryFactory, s);
    }

    public static nal[] values()
    {
        return (nal[])$VALUES.clone();
    }

    y copyEntry(CustomConcurrentHashMap customconcurrenthashmap, y y, y y1)
    {
        return newEntry(customconcurrenthashmap, y.getKey(), y.getHash(), y1);
    }

    void copyEvictableEntry(y y, y y1)
    {
        CustomConcurrentHashMap.connectEvictables(y.getPreviousEvictable(), y1);
        CustomConcurrentHashMap.connectEvictables(y1, y.getNextEvictable());
        CustomConcurrentHashMap.nullifyEvictable(y);
    }

    void copyExpirableEntry(y y, y y1)
    {
        y1.setExpirationTime(y.getExpirationTime());
        CustomConcurrentHashMap.connectExpirables(y.getPreviousExpirable(), y1);
        CustomConcurrentHashMap.connectExpirables(y1, y.getNextExpirable());
        CustomConcurrentHashMap.nullifyExpirable(y);
    }

    abstract y newEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, y y);

    static 
    {
        STRONG = new CustomConcurrentHashMap.EntryFactory("STRONG", 0) {

            CustomConcurrentHashMap.ReferenceEntry newEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, CustomConcurrentHashMap.ReferenceEntry referenceentry)
            {
                return new CustomConcurrentHashMap.StrongEntry(customconcurrenthashmap, obj, i, referenceentry);
            }

        };
        STRONG_EXPIRABLE = new CustomConcurrentHashMap.EntryFactory("STRONG_EXPIRABLE", 1) {

            CustomConcurrentHashMap.ReferenceEntry copyEntry(CustomConcurrentHashMap customconcurrenthashmap, CustomConcurrentHashMap.ReferenceEntry referenceentry, CustomConcurrentHashMap.ReferenceEntry referenceentry1)
            {
                customconcurrenthashmap = copyEntry(customconcurrenthashmap, referenceentry, referenceentry1);
                copyExpirableEntry(referenceentry, customconcurrenthashmap);
                return customconcurrenthashmap;
            }

            CustomConcurrentHashMap.ReferenceEntry newEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, CustomConcurrentHashMap.ReferenceEntry referenceentry)
            {
                return new CustomConcurrentHashMap.StrongExpirableEntry(customconcurrenthashmap, obj, i, referenceentry);
            }

        };
        STRONG_EVICTABLE = new CustomConcurrentHashMap.EntryFactory("STRONG_EVICTABLE", 2) {

            CustomConcurrentHashMap.ReferenceEntry copyEntry(CustomConcurrentHashMap customconcurrenthashmap, CustomConcurrentHashMap.ReferenceEntry referenceentry, CustomConcurrentHashMap.ReferenceEntry referenceentry1)
            {
                customconcurrenthashmap = copyEntry(customconcurrenthashmap, referenceentry, referenceentry1);
                copyEvictableEntry(referenceentry, customconcurrenthashmap);
                return customconcurrenthashmap;
            }

            CustomConcurrentHashMap.ReferenceEntry newEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, CustomConcurrentHashMap.ReferenceEntry referenceentry)
            {
                return new CustomConcurrentHashMap.StrongEvictableEntry(customconcurrenthashmap, obj, i, referenceentry);
            }

        };
        STRONG_EXPIRABLE_EVICTABLE = new CustomConcurrentHashMap.EntryFactory("STRONG_EXPIRABLE_EVICTABLE", 3) {

            CustomConcurrentHashMap.ReferenceEntry copyEntry(CustomConcurrentHashMap customconcurrenthashmap, CustomConcurrentHashMap.ReferenceEntry referenceentry, CustomConcurrentHashMap.ReferenceEntry referenceentry1)
            {
                customconcurrenthashmap = copyEntry(customconcurrenthashmap, referenceentry, referenceentry1);
                copyExpirableEntry(referenceentry, customconcurrenthashmap);
                copyEvictableEntry(referenceentry, customconcurrenthashmap);
                return customconcurrenthashmap;
            }

            CustomConcurrentHashMap.ReferenceEntry newEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, CustomConcurrentHashMap.ReferenceEntry referenceentry)
            {
                return new CustomConcurrentHashMap.StrongExpirableEvictableEntry(customconcurrenthashmap, obj, i, referenceentry);
            }

        };
        SOFT = new CustomConcurrentHashMap.EntryFactory("SOFT", 4) {

            CustomConcurrentHashMap.ReferenceEntry newEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, CustomConcurrentHashMap.ReferenceEntry referenceentry)
            {
                return new CustomConcurrentHashMap.SoftEntry(customconcurrenthashmap, obj, i, referenceentry);
            }

        };
        SOFT_EXPIRABLE = new CustomConcurrentHashMap.EntryFactory("SOFT_EXPIRABLE", 5) {

            CustomConcurrentHashMap.ReferenceEntry copyEntry(CustomConcurrentHashMap customconcurrenthashmap, CustomConcurrentHashMap.ReferenceEntry referenceentry, CustomConcurrentHashMap.ReferenceEntry referenceentry1)
            {
                customconcurrenthashmap = copyEntry(customconcurrenthashmap, referenceentry, referenceentry1);
                copyExpirableEntry(referenceentry, customconcurrenthashmap);
                return customconcurrenthashmap;
            }

            CustomConcurrentHashMap.ReferenceEntry newEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, CustomConcurrentHashMap.ReferenceEntry referenceentry)
            {
                return new CustomConcurrentHashMap.SoftExpirableEntry(customconcurrenthashmap, obj, i, referenceentry);
            }

        };
        SOFT_EVICTABLE = new CustomConcurrentHashMap.EntryFactory("SOFT_EVICTABLE", 6) {

            CustomConcurrentHashMap.ReferenceEntry copyEntry(CustomConcurrentHashMap customconcurrenthashmap, CustomConcurrentHashMap.ReferenceEntry referenceentry, CustomConcurrentHashMap.ReferenceEntry referenceentry1)
            {
                customconcurrenthashmap = copyEntry(customconcurrenthashmap, referenceentry, referenceentry1);
                copyEvictableEntry(referenceentry, customconcurrenthashmap);
                return customconcurrenthashmap;
            }

            CustomConcurrentHashMap.ReferenceEntry newEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, CustomConcurrentHashMap.ReferenceEntry referenceentry)
            {
                return new CustomConcurrentHashMap.SoftEvictableEntry(customconcurrenthashmap, obj, i, referenceentry);
            }

        };
        SOFT_EXPIRABLE_EVICTABLE = new CustomConcurrentHashMap.EntryFactory("SOFT_EXPIRABLE_EVICTABLE", 7) {

            CustomConcurrentHashMap.ReferenceEntry copyEntry(CustomConcurrentHashMap customconcurrenthashmap, CustomConcurrentHashMap.ReferenceEntry referenceentry, CustomConcurrentHashMap.ReferenceEntry referenceentry1)
            {
                customconcurrenthashmap = copyEntry(customconcurrenthashmap, referenceentry, referenceentry1);
                copyExpirableEntry(referenceentry, customconcurrenthashmap);
                copyEvictableEntry(referenceentry, customconcurrenthashmap);
                return customconcurrenthashmap;
            }

            CustomConcurrentHashMap.ReferenceEntry newEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, CustomConcurrentHashMap.ReferenceEntry referenceentry)
            {
                return new CustomConcurrentHashMap.SoftExpirableEvictableEntry(customconcurrenthashmap, obj, i, referenceentry);
            }

        };
        WEAK = new CustomConcurrentHashMap.EntryFactory("WEAK", 8) {

            CustomConcurrentHashMap.ReferenceEntry newEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, CustomConcurrentHashMap.ReferenceEntry referenceentry)
            {
                return new CustomConcurrentHashMap.WeakEntry(customconcurrenthashmap, obj, i, referenceentry);
            }

        };
        WEAK_EXPIRABLE = new CustomConcurrentHashMap.EntryFactory("WEAK_EXPIRABLE", 9) {

            CustomConcurrentHashMap.ReferenceEntry copyEntry(CustomConcurrentHashMap customconcurrenthashmap, CustomConcurrentHashMap.ReferenceEntry referenceentry, CustomConcurrentHashMap.ReferenceEntry referenceentry1)
            {
                customconcurrenthashmap = copyEntry(customconcurrenthashmap, referenceentry, referenceentry1);
                copyExpirableEntry(referenceentry, customconcurrenthashmap);
                return customconcurrenthashmap;
            }

            CustomConcurrentHashMap.ReferenceEntry newEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, CustomConcurrentHashMap.ReferenceEntry referenceentry)
            {
                return new CustomConcurrentHashMap.WeakExpirableEntry(customconcurrenthashmap, obj, i, referenceentry);
            }

        };
        WEAK_EVICTABLE = new CustomConcurrentHashMap.EntryFactory("WEAK_EVICTABLE", 10) {

            CustomConcurrentHashMap.ReferenceEntry copyEntry(CustomConcurrentHashMap customconcurrenthashmap, CustomConcurrentHashMap.ReferenceEntry referenceentry, CustomConcurrentHashMap.ReferenceEntry referenceentry1)
            {
                customconcurrenthashmap = copyEntry(customconcurrenthashmap, referenceentry, referenceentry1);
                copyEvictableEntry(referenceentry, customconcurrenthashmap);
                return customconcurrenthashmap;
            }

            CustomConcurrentHashMap.ReferenceEntry newEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, CustomConcurrentHashMap.ReferenceEntry referenceentry)
            {
                return new CustomConcurrentHashMap.WeakEvictableEntry(customconcurrenthashmap, obj, i, referenceentry);
            }

        };
        WEAK_EXPIRABLE_EVICTABLE = new CustomConcurrentHashMap.EntryFactory("WEAK_EXPIRABLE_EVICTABLE", 11) {

            CustomConcurrentHashMap.ReferenceEntry copyEntry(CustomConcurrentHashMap customconcurrenthashmap, CustomConcurrentHashMap.ReferenceEntry referenceentry, CustomConcurrentHashMap.ReferenceEntry referenceentry1)
            {
                customconcurrenthashmap = copyEntry(customconcurrenthashmap, referenceentry, referenceentry1);
                copyExpirableEntry(referenceentry, customconcurrenthashmap);
                copyEvictableEntry(referenceentry, customconcurrenthashmap);
                return customconcurrenthashmap;
            }

            CustomConcurrentHashMap.ReferenceEntry newEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, CustomConcurrentHashMap.ReferenceEntry referenceentry)
            {
                return new CustomConcurrentHashMap.WeakExpirableEvictableEntry(customconcurrenthashmap, obj, i, referenceentry);
            }

        };
        $VALUES = (new .VALUES[] {
            STRONG, STRONG_EXPIRABLE, STRONG_EVICTABLE, STRONG_EXPIRABLE_EVICTABLE, SOFT, SOFT_EXPIRABLE, SOFT_EVICTABLE, SOFT_EXPIRABLE_EVICTABLE, WEAK, WEAK_EXPIRABLE, 
            WEAK_EVICTABLE, WEAK_EXPIRABLE_EVICTABLE
        });
        y y = STRONG;
        y y1 = STRONG_EXPIRABLE;
        y y2 = STRONG_EVICTABLE;
        y y3 = STRONG_EXPIRABLE_EVICTABLE;
        y y4 = SOFT;
        y y5 = SOFT_EXPIRABLE;
        y y6 = SOFT_EVICTABLE;
        y y7 = SOFT_EXPIRABLE_EVICTABLE;
        y ay[] = {
            WEAK, WEAK_EXPIRABLE, WEAK_EVICTABLE, WEAK_EXPIRABLE_EVICTABLE
        };
        factories = (new factories[][] {
            new factories[] {
                y, y1, y2, y3
            }, new factories[] {
                y4, y5, y6, y7
            }, ay
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }

    _cls9(String s, int i, _cls9 _pcls9)
    {
        this(s, i);
    }
}
