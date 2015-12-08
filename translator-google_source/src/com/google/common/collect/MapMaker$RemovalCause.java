// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            bt

abstract class <init> extends Enum
{

    public static final SIZE COLLECTED;
    public static final SIZE EXPIRED;
    public static final SIZE EXPLICIT;
    public static final SIZE REPLACED;
    public static final SIZE SIZE;
    private static final SIZE a[];

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/google/common/collect/MapMaker$RemovalCause, s);
    }

    public static <init>[] values()
    {
        return (<init>[])a.clone();
    }

    abstract boolean wasEvicted();

    static 
    {
        class _cls1 extends MapMaker.RemovalCause
        {

            final boolean wasEvicted()
            {
                return false;
            }

            _cls1(String s, int i)
            {
                super(s, i, null);
            }
        }

        EXPLICIT = new _cls1("EXPLICIT", 0);
        class _cls2 extends MapMaker.RemovalCause
        {

            final boolean wasEvicted()
            {
                return false;
            }

            _cls2(String s, int i)
            {
                super(s, i, null);
            }
        }

        REPLACED = new _cls2("REPLACED", 1);
        class _cls3 extends MapMaker.RemovalCause
        {

            final boolean wasEvicted()
            {
                return true;
            }

            _cls3(String s, int i)
            {
                super(s, i, null);
            }
        }

        COLLECTED = new _cls3("COLLECTED", 2);
        class _cls4 extends MapMaker.RemovalCause
        {

            final boolean wasEvicted()
            {
                return true;
            }

            _cls4(String s, int i)
            {
                super(s, i, null);
            }
        }

        EXPIRED = new _cls4("EXPIRED", 3);
        class _cls5 extends MapMaker.RemovalCause
        {

            final boolean wasEvicted()
            {
                return true;
            }

            _cls5(String s, int i)
            {
                super(s, i, null);
            }
        }

        SIZE = new _cls5("SIZE", 4);
        a = (new a[] {
            EXPLICIT, REPLACED, COLLECTED, EXPIRED, SIZE
        });
    }

    private _cls5(String s, int i)
    {
        super(s, i);
    }

    _cls5(String s, int i, bt bt)
    {
        this(s, i);
    }
}
