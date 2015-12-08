// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;
import java.util.List;

final class ldk extends ldg
{

    private ldj a;

    ldk(ldj ldj1)
    {
        a = ldj1;
        super();
    }

    public final void b(int i, List list)
    {
        a.a(new les(new Status(i), list));
    }
}
