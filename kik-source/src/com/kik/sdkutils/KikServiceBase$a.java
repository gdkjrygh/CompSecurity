// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.sdkutils;

import java.util.concurrent.FutureTask;

// Referenced classes of package com.kik.sdkutils:
//            KikServiceBase, z

private final class nit> extends FutureTask
{

    final KikServiceBase a;

    public (KikServiceBase kikservicebase)
    {
        a = kikservicebase;
        super(new z(kikservicebase), null);
    }
}
