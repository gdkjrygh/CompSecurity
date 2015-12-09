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
//            k

private static final class init> extends Handler
{

    private final WeakReference a;

    private boolean a(init> init>, int i, int j, int l, Object obj, Bundle bundle)
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
        init>.a(j);
        return true;
_L3:
        init>.b(j);
        return true;
_L4:
        if (obj == null || (obj instanceof Bundle))
        {
            return init>.a(j, l, (Bundle)obj);
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (obj == null || (obj instanceof Bundle))
        {
            return init>.a((Bundle)obj);
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (obj == null || (obj instanceof Bundle))
        {
            return init>.a(j, (Bundle)obj);
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
            return init>.a(j, bundle, (Bundle)obj);
        }
        if (true) goto _L1; else goto _L8
_L8:
    }

    public void a()
    {
        a.clear();
    }

    public void handleMessage(Message message)
    {
        lear lear = (lear)a.get();
        if (lear != null && !a(lear, message.what, message.arg1, message.arg2, message.obj, message.peekData()) && k.i())
        {
            Log.d("MediaRouteProviderProxy", (new StringBuilder()).append("Unhandled message from server: ").append(message).toString());
        }
    }

    public ( )
    {
        a = new WeakReference();
    }
}
