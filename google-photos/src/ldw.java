// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;
import java.util.List;

final class ldw extends ldg
{

    private ldv a;

    ldw(ldv ldv1)
    {
        a = ldv1;
        super();
    }

    public final void a(int i, List list)
    {
        Status status = new Status(i);
        a.a(new leq(status, list));
    }
}
