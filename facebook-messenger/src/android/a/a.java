// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.a;

import android.app.IActivityManager;
import android.os.IBinder;
import com.b.a.b;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class a
    implements InvocationHandler
{

    private final IActivityManager mTo;
    private final b mViolationProxy;

    public a(IActivityManager iactivitymanager, b b1)
    {
        mTo = iactivitymanager;
        mViolationProxy = b1;
    }

    public Object invoke(Object obj, Method method, Object aobj[])
    {
        if (method.getName().equals("handleApplicationStrictModeViolation"))
        {
            obj = method.getParameterTypes();
            if (obj[0] == android/os/IBinder && obj[1] == Integer.TYPE && obj[2] == android/os/StrictMode$ViolationInfo)
            {
                mTo.handleApplicationStrictModeViolation((IBinder)aobj[0], ((Integer)aobj[1]).intValue(), (android.os.StrictMode.ViolationInfo)mViolationProxy.handle((android.os.StrictMode.ViolationInfo)aobj[2]));
                return null;
            }
        }
        return method.invoke(mTo, aobj);
    }
}
