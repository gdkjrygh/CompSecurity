// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.services;

import rx.functions.Func1;

class this._cls0
    implements Func1
{

    final call this$0;

    public Boolean call(Long long1)
    {
        boolean flag;
        if (cess._mth000(this._cls0.this) - long1.longValue() >= 0L)
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
        return call((Long)obj);
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}
