// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.routing;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v4.media.routing:
//            MediaRouterJellybeanMr1

public static final class mGetStatusCodeMethod
{

    private Method mGetStatusCodeMethod;
    private int mStatusConnecting;

    public boolean isConnecting(Object obj)
    {
        obj = (android.media.nnectingWorkaround)obj;
        if (mGetStatusCodeMethod == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        int i;
        int j;
        i = ((Integer)mGetStatusCodeMethod.invoke(obj, new Object[0])).intValue();
        j = mStatusConnecting;
        return i == j;
        obj;
_L2:
        return false;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public ()
    {
        if (android.os.sConnectingWorkaround != 17)
        {
            throw new UnsupportedOperationException();
        }
        try
        {
            mStatusConnecting = android/media/MediaRouter$RouteInfo.getField("STATUS_CONNECTING").getInt(null);
            mGetStatusCodeMethod = android/media/MediaRouter$RouteInfo.getMethod("getStatusCode", new Class[0]);
            return;
        }
        catch (NoSuchFieldException nosuchfieldexception)
        {
            return;
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            return;
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            return;
        }
    }
}
