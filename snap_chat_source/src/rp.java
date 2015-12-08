// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.camera.model.CameraModel;
import javax.inject.Provider;

public final class rp
    implements afq
{

    private static boolean c;
    private final Provider a;
    private final Provider b;

    private rp(Provider provider, Provider provider1)
    {
        if (!c && provider == null)
        {
            throw new AssertionError();
        }
        a = provider;
        if (!c && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = provider1;
            return;
        }
    }

    public static afq a(Provider provider, Provider provider1)
    {
        return new rp(provider, provider1);
    }

    public final void a(Object obj)
    {
        obj = (rn)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            obj.a = (CameraModel)a.get();
            obj.b = (rq)b.get();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!rp.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
    }
}
