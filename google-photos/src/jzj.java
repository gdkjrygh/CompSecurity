// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.internal.ResolveAccountResponse;
import java.lang.ref.WeakReference;

final class jzj extends kcq
{

    private final WeakReference a;

    jzj(jzf jzf1)
    {
        a = new WeakReference(jzf1);
    }

    public final void a(ResolveAccountResponse resolveaccountresponse)
    {
        jzf jzf1 = (jzf)a.get();
        if (jzf1 == null)
        {
            return;
        } else
        {
            jzf1.a.a(new jzk(this, jzf1, jzf1, resolveaccountresponse));
            return;
        }
    }
}
