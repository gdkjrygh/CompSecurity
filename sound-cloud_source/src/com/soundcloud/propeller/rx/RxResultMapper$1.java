// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller.rx;

import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.ScalarMapper;

// Referenced classes of package com.soundcloud.propeller.rx:
//            RxResultMapper

final class nit> extends RxResultMapper
{

    final Class val$scalarType;

    public final volatile Object call(Object obj)
    {
        return super.call((CursorReader)obj);
    }

    public final Object map(CursorReader cursorreader)
    {
        return ScalarMapper.create(val$scalarType).map(cursorreader);
    }

    ()
    {
        val$scalarType = class1;
        super();
    }
}
