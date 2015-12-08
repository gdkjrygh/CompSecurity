// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.camera.BackgroundCameraFragment;
import com.snapchat.android.camera.model.CameraModel;
import javax.inject.Provider;

public final class qs
    implements afq
{

    private static boolean c;
    private final afq a;
    private final Provider b;

    private qs(afq afq1, Provider provider)
    {
        if (!c && afq1 == null)
        {
            throw new AssertionError();
        }
        a = afq1;
        if (!c && provider == null)
        {
            throw new AssertionError();
        } else
        {
            b = provider;
            return;
        }
    }

    public static afq a(afq afq1, Provider provider)
    {
        return new qs(afq1, provider);
    }

    public final void a(Object obj)
    {
        obj = (BackgroundCameraFragment)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            a.a(obj);
            obj.a = (CameraModel)b.get();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!qs.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
    }
}
