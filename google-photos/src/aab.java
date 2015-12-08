// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import java.lang.ref.WeakReference;

final class aab extends Handler
{

    final WeakReference a;

    public aab(zw zw1)
    {
        a = new WeakReference(zw1);
    }

    public final void handleMessage(Message message)
    {
        zw zw1 = (zw)a.get();
        if (zw1 == null) goto _L2; else goto _L1
_L1:
        Object obj;
        Bundle bundle;
        int i;
        int j;
        int k;
        i = message.what;
        j = message.arg1;
        k = message.arg2;
        obj = message.obj;
        bundle = message.peekData();
        i;
        JVM INSTR tableswitch 0 5: default 84
    //                   0 113
    //                   1 167
    //                   2 173
    //                   3 300
    //                   4 352
    //                   5 253;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        boolean flag = false;
_L10:
        if (!flag && zv.f())
        {
            (new StringBuilder("Unhandled message from server: ")).append(message);
        }
_L2:
        return;
_L4:
        if (j == zw1.f)
        {
            zw1.f = 0;
            zv.a(zw1.h, zw1, "Registation failed");
        }
        if ((da)zw1.g.get(j) != null)
        {
            zw1.g.remove(j);
        }
        flag = true;
          goto _L10
_L5:
        flag = true;
          goto _L10
_L6:
        if (obj != null && !(obj instanceof Bundle)) goto _L3; else goto _L11
_L11:
        obj = (Bundle)obj;
        if (zw1.e == 0 && j == zw1.f && k > 0)
        {
            zw1.f = 0;
            zw1.e = k;
            zv.a(zw1.h, zw1, yx.a(((Bundle) (obj))));
            zv.a(zw1.h, zw1);
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L10
_L9:
        if (obj != null && !(obj instanceof Bundle)) goto _L3; else goto _L12
_L12:
        obj = (Bundle)obj;
        if (zw1.e != 0)
        {
            zv.a(zw1.h, zw1, yx.a(((Bundle) (obj))));
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L10
_L7:
        if (obj != null && !(obj instanceof Bundle)) goto _L3; else goto _L13
_L13:
        obj = (Bundle)obj;
        if ((da)zw1.g.get(j) != null)
        {
            zw1.g.remove(j);
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L10
_L8:
        if (obj != null && !(obj instanceof Bundle)) goto _L3; else goto _L14
_L14:
        if (bundle != null)
        {
            bundle.getString("error");
        }
        obj = (Bundle)obj;
        if ((da)zw1.g.get(j) != null)
        {
            zw1.g.remove(j);
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L10
    }
}
