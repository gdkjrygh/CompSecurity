// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            MapMaker

static abstract class <init> extends Enum
{

    private static final SIZE $VALUES[];
    public static final SIZE COLLECTED;
    public static final SIZE EXPIRED;
    public static final SIZE EXPLICIT;
    public static final SIZE REPLACED;
    public static final SIZE SIZE;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/google/common/collect/MapMaker$RemovalCause, s);
    }

    public static <init>[] values()
    {
        return (<init>[])$VALUES.clone();
    }

    static 
    {
        EXPLICIT = new MapMaker.RemovalCause("EXPLICIT", 0) {

        };
        REPLACED = new MapMaker.RemovalCause("REPLACED", 1) {

        };
        COLLECTED = new MapMaker.RemovalCause("COLLECTED", 2) {

        };
        EXPIRED = new MapMaker.RemovalCause("EXPIRED", 3) {

        };
        SIZE = new MapMaker.RemovalCause("SIZE", 4) {

        };
        $VALUES = (new .VALUES[] {
            EXPLICIT, REPLACED, COLLECTED, EXPIRED, SIZE
        });
    }

    private _cls5(String s, int i)
    {
        super(s, i);
    }

    _cls5(String s, int i, _cls5 _pcls5)
    {
        this(s, i);
    }
}
