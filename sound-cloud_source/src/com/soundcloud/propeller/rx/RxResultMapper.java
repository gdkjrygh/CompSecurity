// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller.rx;

import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.ResultMapper;
import rx.b.f;

public abstract class RxResultMapper
    implements ResultMapper, f
{

    public RxResultMapper()
    {
    }

    public static RxResultMapper scalar(final Class scalarType)
    {
        return new _cls1();
    }

    public final Object call(CursorReader cursorreader)
    {
        return map(cursorreader);
    }

    public volatile Object call(Object obj)
    {
        return call((CursorReader)obj);
    }

    private class _cls1 extends RxResultMapper
    {

        final Class val$scalarType;

        public final volatile Object call(Object obj)
        {
            return call((CursorReader)obj);
        }

        public final Object map(CursorReader cursorreader)
        {
            return ScalarMapper.create(scalarType).map(cursorreader);
        }

        _cls1()
        {
            scalarType = class1;
            super();
        }
    }

}
