// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;


// Referenced classes of package com.google.common.a:
//            bo, bs, bt, bu, 
//            bv, bw, bx, by, 
//            bz, bp, bq, br, 
//            ct, cm, bj, bk, 
//            cn

abstract class bn extends Enum
{

    private static final bn $VALUES[];
    static final int EVICTABLE_MASK = 2;
    static final int EXPIRABLE_MASK = 1;
    public static final bn SOFT;
    public static final bn SOFT_EVICTABLE;
    public static final bn SOFT_EXPIRABLE;
    public static final bn SOFT_EXPIRABLE_EVICTABLE;
    public static final bn STRONG;
    public static final bn STRONG_EVICTABLE;
    public static final bn STRONG_EXPIRABLE;
    public static final bn STRONG_EXPIRABLE_EVICTABLE;
    public static final bn WEAK;
    public static final bn WEAK_EVICTABLE;
    public static final bn WEAK_EXPIRABLE;
    public static final bn WEAK_EXPIRABLE_EVICTABLE;
    static final bn factories[][];

    private bn(String s, int i)
    {
        super(s, i);
    }

    bn(String s, int i, bk bk)
    {
        this(s, i);
    }

    static bn getFactory(ct ct1, boolean flag, boolean flag1)
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
        return factories[ct1.ordinal()][byte0 | flag2];
    }

    public static bn valueOf(String s)
    {
        return (bn)Enum.valueOf(com/google/common/a/bn, s);
    }

    public static bn[] values()
    {
        return (bn[])$VALUES.clone();
    }

    cm copyEntry(cn cn, cm cm1, cm cm2)
    {
        return newEntry(cn, cm1.getKey(), cm1.getHash(), cm2);
    }

    void copyEvictableEntry(cm cm1, cm cm2)
    {
        bj.b(cm1.getPreviousEvictable(), cm2);
        bj.b(cm2, cm1.getNextEvictable());
        bj.e(cm1);
    }

    void copyExpirableEntry(cm cm1, cm cm2)
    {
        cm2.setExpirationTime(cm1.getExpirationTime());
        bj.a(cm1.getPreviousExpirable(), cm2);
        bj.a(cm2, cm1.getNextExpirable());
        bj.d(cm1);
    }

    abstract cm newEntry(cn cn, Object obj, int i, cm cm1);

    static 
    {
        STRONG = new bo("STRONG", 0);
        STRONG_EXPIRABLE = new bs("STRONG_EXPIRABLE", 1);
        STRONG_EVICTABLE = new bt("STRONG_EVICTABLE", 2);
        STRONG_EXPIRABLE_EVICTABLE = new bu("STRONG_EXPIRABLE_EVICTABLE", 3);
        SOFT = new bv("SOFT", 4);
        SOFT_EXPIRABLE = new bw("SOFT_EXPIRABLE", 5);
        SOFT_EVICTABLE = new bx("SOFT_EVICTABLE", 6);
        SOFT_EXPIRABLE_EVICTABLE = new by("SOFT_EXPIRABLE_EVICTABLE", 7);
        WEAK = new bz("WEAK", 8);
        WEAK_EXPIRABLE = new bp("WEAK_EXPIRABLE", 9);
        WEAK_EVICTABLE = new bq("WEAK_EVICTABLE", 10);
        WEAK_EXPIRABLE_EVICTABLE = new br("WEAK_EXPIRABLE_EVICTABLE", 11);
        $VALUES = (new bn[] {
            STRONG, STRONG_EXPIRABLE, STRONG_EVICTABLE, STRONG_EXPIRABLE_EVICTABLE, SOFT, SOFT_EXPIRABLE, SOFT_EVICTABLE, SOFT_EXPIRABLE_EVICTABLE, WEAK, WEAK_EXPIRABLE, 
            WEAK_EVICTABLE, WEAK_EXPIRABLE_EVICTABLE
        });
        bn bn1 = STRONG;
        bn bn2 = STRONG_EXPIRABLE;
        bn bn3 = STRONG_EVICTABLE;
        bn bn4 = STRONG_EXPIRABLE_EVICTABLE;
        bn bn5 = SOFT;
        bn bn6 = SOFT_EXPIRABLE;
        bn bn7 = SOFT_EVICTABLE;
        bn bn8 = SOFT_EXPIRABLE_EVICTABLE;
        bn bn9 = WEAK;
        bn bn10 = WEAK_EXPIRABLE;
        bn bn11 = WEAK_EVICTABLE;
        bn bn12 = WEAK_EXPIRABLE_EVICTABLE;
        factories = (new bn[][] {
            new bn[] {
                bn1, bn2, bn3, bn4
            }, new bn[] {
                bn5, bn6, bn7, bn8
            }, new bn[] {
                bn9, bn10, bn11, bn12
            }
        });
    }
}
