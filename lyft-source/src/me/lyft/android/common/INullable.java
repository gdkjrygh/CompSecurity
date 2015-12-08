// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.common;

import rx.functions.Func1;

public interface INullable
{

    public static final Func1 FILTER_NON_NULL = new Func1() {

        public Boolean call(INullable inullable)
        {
            boolean flag;
            if (!inullable.isNull())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        }

        public volatile Object call(Object obj)
        {
            return call((INullable)obj);
        }

    };

    public abstract boolean isNull();

}
