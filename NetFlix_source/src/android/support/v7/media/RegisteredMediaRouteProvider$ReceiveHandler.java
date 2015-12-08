// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v7.media:
//            RegisteredMediaRouteProvider

private static final class mConnectionRef extends Handler
{

    private final WeakReference mConnectionRef;

    private boolean processMessage(mConnectionRef mconnectionref, int i, int j, int k, Object obj, Bundle bundle)
    {
        i;
        JVM INSTR tableswitch 0 5: default 40
    //                   0 42
    //                   1 50
    //                   2 58
    //                   3 107
    //                   4 131
    //                   5 84;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        return false;
_L2:
        mconnectionref.nericFailure(j);
        return true;
_L3:
        mconnectionref.nericSuccess(j);
        return true;
_L4:
        if (obj == null || (obj instanceof Bundle))
        {
            return mconnectionref.gistered(j, k, (Bundle)obj);
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (obj == null || (obj instanceof Bundle))
        {
            return mconnectionref.scriptorChanged((Bundle)obj);
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (obj == null || (obj instanceof Bundle))
        {
            return mconnectionref.ntrolRequestSucceeded(j, (Bundle)obj);
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (obj == null || (obj instanceof Bundle))
        {
            if (bundle == null)
            {
                bundle = null;
            } else
            {
                bundle = bundle.getString("error");
            }
            return mconnectionref.ntrolRequestFailed(j, bundle, (Bundle)obj);
        }
        if (true) goto _L1; else goto _L8
_L8:
    }

    public void dispose()
    {
        mConnectionRef.clear();
    }

    public void handleMessage(Message message)
    {
        mConnectionRef mconnectionref = (mConnectionRef)mConnectionRef.get();
        if (mconnectionref != null && !processMessage(mconnectionref, message.what, message.arg1, message.arg2, message.obj, message.peekData()) && RegisteredMediaRouteProvider.access$800())
        {
            Log.d("MediaRouteProviderProxy", (new StringBuilder()).append("Unhandled message from server: ").append(message).toString());
        }
    }

    public ( )
    {
        mConnectionRef = new WeakReference();
    }
}
