// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;

import com.aviary.android.feather.common.utils.d;
import java.io.InputStream;

// Referenced classes of package com.aviary.android.feather.cds:
//            AviaryCdsService

class a
    implements com.aviary.android.feather.common.threading.
{

    final AviaryCdsService a;

    public transient InputStream a(com.aviary.android.feather.common.threading. , String as[])
        throws Exception
    {
        return d.a(as[0], null);
    }

    public volatile Object a(com.aviary.android.feather.common.threading. , Object aobj[])
        throws Exception
    {
        return a(, (String[])aobj);
    }

    Pool.Worker(AviaryCdsService aviarycdsservice)
    {
        a = aviarycdsservice;
        super();
    }
}
